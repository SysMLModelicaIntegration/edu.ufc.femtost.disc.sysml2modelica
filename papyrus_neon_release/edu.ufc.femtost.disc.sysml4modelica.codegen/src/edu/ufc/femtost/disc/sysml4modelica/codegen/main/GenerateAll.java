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
package edu.ufc.femtost.disc.sysml4modelica.codegen.main;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;


/**
 * Main entry point of the 'Acceleo' generation module.
 */
public class GenerateAll {

	/**
	 * The model URI.
	 */
	private URI modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	private IPath targetFolderPath;
	private IPath targetFolderPathFull;
	
	/**
	 * Constructor.
	 * 
	 * @param modelURI
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(URI modelURI, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
		this.targetFolderPath = this.targetFolder.getLocation().addTrailingSeparator().append("modelica-code-gen");
		this.targetFolderPathFull = this.targetFolder.getLocation().addTrailingSeparator().append("modelica-code-gen");
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException {
		
		if (!targetFolderPath.toFile().exists()) {
			targetFolderPath.toFile().mkdirs();
		}
		
		// final URI template0 = getTemplateURI("fr.femto.topcased.sysml2vhdlams.acceleo", new Path("/fr/femto/topcased/sysml2vhdlams/acceleo/common/sysml2vhdlamsfile.emtl"));
		// fr.femto.topcased.sysml2vhdlams.acceleo.common.Sysml2vhdlamsfile gen0 = new fr.femto.topcased.sysml2vhdlams.acceleo.common.Sysml2vhdlamsfile(modelURI, targetFolder.getLocation().toFile(), arguments) {
		//	protected URI createTemplateURI(String entry) {
		//		return template0;
		//	}
		//};
		//gen0.doGenerate(BasicMonitor.toMonitor(monitor));
		monitor.subTask("Loading...");
		edu.ufc.femtost.disc.sysml4modelica.codegen.main.GenerateModelica gen0 = new edu.ufc.femtost.disc.sysml4modelica.codegen.main.GenerateModelica(modelURI, targetFolderPath.toFile(), arguments);
		monitor.worked(1);
		String generationID = org.eclipse.acceleo.engine.utils.AcceleoLaunchingUtil.computeUIProjectID("edu.ufc.femtost.disc.sysml4modelica.codegen", "edu.ufc.femtost.disc.sysml4modelica.codegen.main.GenerateModelica", modelURI.toString(), targetFolderPathFull.toString(), new ArrayList<String>());
		gen0.setGenerationID(generationID);
		gen0.doGenerate(BasicMonitor.toMonitor(monitor));
			
		
	}
	
}