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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.m2m.atl.core.ATLCoreException;

import edu.ufc.femtost.disc.sysml4modelica.sysml2modelica.files.Omgsysml2modelica;

public class ExportJob extends Job {
	private final IFile inputModelFile;

	public ExportJob(final IFile inputModelFile) {
		super("Export model");
		this.inputModelFile = inputModelFile;
	}
	
	@Override
	protected final IStatus run(final IProgressMonitor monitor) {
		try {
			performExport(inputModelFile, monitor);
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
		monitor.beginTask("Exporting model", 100);

		// Compute path
		IPath pathSelected = workFile.getLocation();
		IPath pathToOutModel = pathSelected.removeFileExtension()
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
}
