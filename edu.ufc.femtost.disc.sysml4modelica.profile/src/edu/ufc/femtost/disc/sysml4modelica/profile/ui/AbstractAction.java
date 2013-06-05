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
package edu.ufc.femtost.disc.sysml4modelica.profile.ui;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractAction<R> implements IObjectActionDelegate {
	
	private List<R> selection;
	private Shell shell;
	private Class<R> clazz;

	
	public AbstractAction(Class<R> clazz)
	{
		this.selection = new ArrayList<R>();
		this.clazz = clazz;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart)
	{
		setShell(targetPart.getSite().getShell());
	}

	public abstract void run(IAction paramIAction);

	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction arg0, ISelection arg1)
	{
		this.selection.clear();
		Iterator<?> it = ((IStructuredSelection)arg1).iterator();

		while (it.hasNext()) {
			Object current = it.next();
			if (this.clazz.isInstance(current))
				this.selection.add((R) current);
		}
	}

	private void setShell(Shell shell)
	{
		this.shell = shell;
	}

	protected Shell getShell()
	{
		return this.shell;
	}

	protected List<R> getSelection() {
		return this.selection;
	}
}
