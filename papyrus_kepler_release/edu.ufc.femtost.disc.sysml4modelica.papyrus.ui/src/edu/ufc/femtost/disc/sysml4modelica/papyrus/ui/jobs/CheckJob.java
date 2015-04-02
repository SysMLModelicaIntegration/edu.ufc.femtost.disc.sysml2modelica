/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comte
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comte - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.jobs;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.core.ATLCoreException;

import edu.ufc.femtost.disc.sysml4modelica.papyrus.sysml2problem.files.Sysml2problem;
import edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.utils.DisplayUtil;
import edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.utils.ProblemResourceFactoryImpl;
import edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.utils.ProblemResourceImpl;
import edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem;

public class CheckJob extends Job {
	
	private final IFile inputModelFile;

	public CheckJob(final IFile inputModelFile) {
		super("Check model");
		this.inputModelFile = inputModelFile;
	}
	
	@Override
	protected final IStatus run(final IProgressMonitor monitor) {
		try {
			performCheck(inputModelFile, monitor);
		} catch (IOException e) {
			e.printStackTrace();
			DisplayUtil.addMarker(inputModelFile, IMarker.SEVERITY_ERROR, e.getMessage(), "");
		} catch (ATLCoreException e) {
			e.printStackTrace();
			DisplayUtil.addMarker(inputModelFile, IMarker.SEVERITY_ERROR, e.getMessage(), "");
		} catch (CoreException e) {
			e.printStackTrace();
			DisplayUtil.addMarker(inputModelFile, IMarker.SEVERITY_ERROR, e.getMessage(), "");
		}
		if (monitor.isCanceled()) {
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}
	
	private void performCheck(final IFile workFile, final IProgressMonitor monitor) throws IOException, ATLCoreException, CoreException {
		
		monitor.beginTask("Checking model", 100);
		
		this.inputModelFile.deleteMarkers(null, true, IResource.DEPTH_INFINITE);
		// Compute path
		IPath pathSelected = workFile.getLocation();
		IPath pathToOutModel = pathSelected.removeFileExtension()
				.addFileExtension("problem");
		// USER put the extension of the output meta model of your
		// transformation
		monitor.worked(10);

		// Perform the export
		Sysml2problem.transform(pathSelected.toFile().toURI().toString(),
				pathToOutModel.toFile().toURI().toString());
		monitor.worked(60);

		ProblemResourceFactoryImpl factory = new ProblemResourceFactoryImpl();
        ProblemResourceImpl resource = (ProblemResourceImpl) factory.createResource(URI.createURI(pathToOutModel.toFile().toURI().toString()));
        resource.load(null);
        monitor.worked(10);

        // Fill the problem with IMarkers
        fillMarkers(resource);
        monitor.worked(20);
          
		// Refresh workspace
		workFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		
	}
	
	private void fillMarkers(final ProblemResourceImpl problemResource) {
        EList<EObject> problemContents = problemResource.getContents();
        if (problemContents.isEmpty()) {
            DisplayUtil.addMarker(inputModelFile, IMarker.SEVERITY_INFO, "No errors found", "");
        } else {
            for (EObject eProblem : problemContents) {
                if (eProblem instanceof Problem) {
                    Problem problem = (Problem) eProblem;
                    int severity;

                    switch (problem.getSeverity()) {
                        case OK:
                            severity = IMarker.SEVERITY_INFO;
                            break;
                        case WARNING:
                            severity = IMarker.SEVERITY_WARNING;
                            break;
                        case ERROR:
                        case CRITIC:
                        default:
                            severity = IMarker.SEVERITY_ERROR;
                            break;
                    }

                    DisplayUtil.addMarker(inputModelFile, severity, problem.getDescription(), problem.getLocation());
                }
            }
        }

    }
}
