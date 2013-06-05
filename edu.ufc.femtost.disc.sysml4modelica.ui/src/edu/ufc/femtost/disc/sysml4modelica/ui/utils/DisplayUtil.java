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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.widgets.Display;

public final class DisplayUtil
{

    private DisplayUtil()
    {
    }

    public static void updateStatusLine(String msg)
    {
        Display display = Display.getDefault();
        (new DisplayUtilThread(display, msg)).start();
    }

    public static void addMarker(IFile file, int severity, String message, String location)
    {
        try
        {
            IMarker marker = file.createMarker("org.eclipse.core.resources.problemmarker");
            if(marker.exists())
            {
                marker.setAttribute("message", message);
                marker.setAttribute("severity", severity);
                marker.setAttribute("location", location);
                marker.setAttribute("userEditable", false);
            }
        }
        catch(CoreException e)
        {
            e.printStackTrace();
        }
    }
}