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
package edu.ufc.femtost.disc.sysml4modelica.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.ufc.femtost.disc.sysml4modelica.ui.jobs.CheckJob;
import edu.ufc.femtost.disc.sysml4modelica.ui.utils.DisplayUtil;
import edu.ufc.femtost.disc.sysml4modelica.ui.utils.SelectionUtil;


public class CheckModel implements IObjectActionDelegate {

	private IFile selectedFile;
	
	@Override
	public void run(IAction action) {
		Job job = new CheckJob(selectedFile);
		job.addJobChangeListener(new JobChangeAdapter() {
            @Override
            public void done(final IJobChangeEvent event) {
                if (event.getResult().isOK()) {
                    DisplayUtil.updateStatusLine("Check completed successfully");
                } else {
                    DisplayUtil.updateStatusLine("Could not check the model due to error");
                }
            }
        });
		job.setUser(true);
        job.schedule();
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedFile = SelectionUtil.findSelection(selection);
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

}
