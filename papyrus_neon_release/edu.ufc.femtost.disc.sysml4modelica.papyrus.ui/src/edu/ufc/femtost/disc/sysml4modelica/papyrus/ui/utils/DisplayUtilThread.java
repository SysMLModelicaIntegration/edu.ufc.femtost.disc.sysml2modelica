/*******************************************************************************
 * Copyright (c) 2013-2016 Jean-Marie Gauthier, University of Franche-Comte, and Samares-Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Jean-Marie Gauthier, University of Franche-Comte - initial API and implementation
 * Jean-Marie Gauthier, Samares-Engineering - Neon implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.papyrus.ui.utils;

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