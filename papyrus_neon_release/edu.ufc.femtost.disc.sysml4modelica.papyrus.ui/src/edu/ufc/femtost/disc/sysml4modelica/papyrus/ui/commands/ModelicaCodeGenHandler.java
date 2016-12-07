package edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.commands;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.jobs.GenerateJob;
import edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.utils.DisplayUtil;


public class ModelicaCodeGenHandler implements IHandler {
	private IFile model = null;
	
	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
		    if (! selection.isEmpty()){
		        Object selectedElement = ((IStructuredSelection)selection).getFirstElement();
		        if (selectedElement instanceof IAdaptable){
		            model = (IFile)((IAdaptable)selectedElement).getAdapter(IFile.class);
		        }
		    }
		}

		Job job = new GenerateJob(model);
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					DisplayUtil.updateStatusLine("Generation completed successfully");
				} else {
					DisplayUtil.updateStatusLine("Could not complete the generation of the model due to error");
				}
			}
		});
		job.setUser(true);
        job.schedule();
		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
