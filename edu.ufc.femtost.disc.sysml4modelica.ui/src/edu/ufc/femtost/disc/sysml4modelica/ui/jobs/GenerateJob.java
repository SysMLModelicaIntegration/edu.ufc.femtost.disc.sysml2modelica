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
package edu.ufc.femtost.disc.sysml4modelica.ui.jobs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.core.ATLCoreException;

import edu.ufc.femtost.disc.sysml4modelica.codegen.main.GenerateAll;
import edu.ufc.femtost.disc.sysml4modelica.sysml2modelica.files.Omgsysml2modelica;

public class GenerateJob extends Job{
	private final IFile inputModelFile;
	private IPath pathToOutModel;
	private GenerateAll generator;
	
	public GenerateJob(final IFile inputModelFile) {
		super("Generate Modelica");
		this.inputModelFile = inputModelFile;
	}
	
	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		try {
			performExport(inputModelFile, monitor);
			performGeneration(inputModelFile, monitor);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		if (monitor.isCanceled()) {
            return Status.CANCEL_STATUS;
        }
        return Status.OK_STATUS;
	}
	
	
	private void performExport(final IFile workFile,
			final IProgressMonitor monitor) throws IOException,
			ATLCoreException, CoreException {
		monitor.beginTask("Generating Modelica", 100);
		IPath pathSelected = workFile.getLocation();
		this.pathToOutModel = pathSelected.removeFileExtension()
				.addFileExtension("xmi");
		// USER put the extension of the output meta model of your
		// transformation
		monitor.worked(10);
	
		// Perform the export
		Omgsysml2modelica.transform(pathSelected.toFile().toURI().toString(),
				pathToOutModel.toFile().toURI().toString());
		monitor.worked(60);

		// Refresh workspace
		workFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
	private void performGeneration(final IFile workFile,
			final IProgressMonitor monitor) throws IOException, CoreException {
		List<String> arguments = new ArrayList<String>();
		IContainer target = workFile.getParent();
		URI modelURI = URI.createPlatformResourceURI(workFile.getFullPath()
				.removeFileExtension().addFileExtension("xmi").toString(),
				true);
		monitor.worked(10);
		generator = new GenerateAll(modelURI, target, arguments);
		generator.doGenerate(monitor);
		monitor.worked(60);
		workFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
}
