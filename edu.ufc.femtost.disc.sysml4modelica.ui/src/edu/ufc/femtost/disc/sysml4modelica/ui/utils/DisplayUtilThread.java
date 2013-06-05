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

import org.eclipse.swt.widgets.Display;

//Referenced classes of package fr.femtost.disc.problem.util:
//         DisplayUtil

class DisplayUtilThread extends Thread
{

 DisplayUtilThread(Display display, String s)
 {
	 super();
	 val$display = display;
     val$msg = s;
 }

 public void run()
 {
     val$display.syncExec(new DisplayUtilRun(this, val$msg));
 }

 private final Display val$display;
 private final String val$msg;
}