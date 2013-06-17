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
package edu.ufc.femtost.disc.sysml4modelica.ui.utils;

import org.eclipse.ui.*;

class DisplayUtilRun implements Runnable
{

    DisplayUtilRun(DisplayUtilThread displayutil, String s)
    {
    	super();
    	this.display = displayutil;
        this.valmsg = s;
    }

    public void run()
    {
        ((IViewSite)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite()).getActionBars().getStatusLineManager().setMessage(valmsg);
    }

    final DisplayUtilThread display;
    private final String valmsg;
}