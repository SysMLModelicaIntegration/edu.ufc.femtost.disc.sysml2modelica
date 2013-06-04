/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comté
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comté - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.profile.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.IAction;
import org.eclipse.uml2.uml.Package;

public class AbstractImportPackageAction extends AbstractAction<Package>{
	
  private final String uri;

  protected static Package getPackageByUri(ResourceSet resourceSet, String uri)
  {
    Resource resource = resourceSet.getResource(URI.createURI(uri), true);

    assert (resource.getContents().size() == 1);
    return (Package)resource.getContents().get(0);
  }

  public AbstractImportPackageAction(String uri)
  {
    super(Package.class);
    this.uri = uri;
  }

  public void run(IAction arg0)
  {
    for (Package p : getSelection()) {
      Package pk = getPackageByUri(p.eResource().getResourceSet(), this.uri);
      if (!pk.getImportedPackages().contains(pk))
        p.createPackageImport(pk);
    }
  }
}
