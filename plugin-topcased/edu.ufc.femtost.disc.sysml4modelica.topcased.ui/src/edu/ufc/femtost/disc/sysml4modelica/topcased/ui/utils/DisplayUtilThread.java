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
package edu.ufc.femtost.disc.sysml4modelica.topcased.ui.utils;

import org.eclipse.swt.widgets.Display;


class DisplayUtilThread extends Thread {

	private final Display display;
	private final String valmsg;

	DisplayUtilThread(Display display, String s){
		super();
		this.display = display;
		this.valmsg = s;
	}

	public void run()
	{
		display.syncExec(new DisplayUtilRun(this, valmsg));
	}
}