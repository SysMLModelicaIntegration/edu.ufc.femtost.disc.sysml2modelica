/*******************************************************************************
 * Copyright (c) 2010, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.papyrus.sysml2problem.files;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;


/**
 * Entry point of the 'Sysml2problem' transformation module.
 */
public class Sysml2problem {

	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;
	
	/**
	 * The INuml model.
	 * @generated
	 */
	protected IModel inumlModel;	
	
	/**
	 * The INsysml model.
	 * @generated
	 */
	protected IModel insysmlModel;	
	
	/**
	 * The INmodelicaProfile model.
	 * @generated
	 */
	protected IModel inmodelicaprofileModel;	
	
	/**
	 * The OUTproblem model.
	 * @generated
	 */
	protected IModel outproblemModel;	
		
	
	 /**
     * The main method.
     *
     * @param inModel         the input model to check
     * @param outModelProblem the problem instance generated
     * @throws IOException      if the input model does not exists
     * @throws ATLCoreException if the transformation fails
     * @generated not
     */
    public static void transform(final String inModel, final String outModelProblem) throws IOException, ATLCoreException {
        Sysml2problem runner = new Sysml2problem();
        runner.loadModels(inModel);
        runner.doSysml2problem(new NullProgressMonitor());
        runner.saveModels(outModelProblem);
    }
    
    /**
     * Load the input and input/output models, initialize output models.
     *
     * @param modelPath the model model path
     * @throws ATLCoreException if a problem occurs while loading models
     * @generated not
     */
    private void loadModels(final String sysmlModelPath) throws ATLCoreException {
        ModelFactory factory = new EMFModelFactory();
        IInjector injector = new EMFInjector();
        IReferenceModel problemMetamodel = factory.newReferenceModel();
        injector.inject(problemMetamodel, getMetamodelUri("MMproblem"));
        IReferenceModel sysmlMetamodel = factory.newReferenceModel();
        injector.inject(sysmlMetamodel, getMetamodelUri("MMsysml"));
        IReferenceModel umlMetamodel = factory.newReferenceModel();
        injector.inject(umlMetamodel, getMetamodelUri("MMuml"));
        IReferenceModel mmModelicaMetamodel = factory.newReferenceModel();
		injector.inject(mmModelicaMetamodel, getMetamodelUri("MMmodelicaProfile"));
        this.insysmlModel = factory.newModel(sysmlMetamodel);
        injector.inject(insysmlModel, sysmlModelPath);
        this.inumlModel = factory.newModel(umlMetamodel);
        injector.inject(inumlModel, sysmlModelPath);
        this.inmodelicaprofileModel = factory.newModel(mmModelicaMetamodel);
		injector.inject(inmodelicaprofileModel, sysmlModelPath);
        this.outproblemModel = factory.newModel(problemMetamodel);
    }
    
	/**
	 * The main method.
	 * 
	 * @param args
	 *            are the arguments
	 * @generated
	 */
	public static void main(String[] args) {
		try {
			if (args.length < 4) {
				System.out.println("Arguments not valid : {INuml_model_path, INsysml_model_path, INmodelicaProfile_model_path, OUTproblem_model_path}.");
			} else {
				Sysml2problem runner = new Sysml2problem();
				runner.loadModels(args[0], args[1], args[2]);
				runner.doSysml2problem(new NullProgressMonitor());
				runner.saveModels(args[3]);
			}
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Constructor.
	 *
	 * @generated
	 */
	public Sysml2problem() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("Sysml2problem.properties").openStream());
		EPackage.Registry.INSTANCE.put(getMetamodelUri("MMuml"), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(getMetamodelUri("MMsysml"), org.eclipse.papyrus.sysml14.sysmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	/**
	 * Load the input and input/output models, initialize output models.
	 * 
	 * @param inumlModelPath
	 *            the INuml model path
	 * @param insysmlModelPath
	 *            the INsysml model path
	 * @param inmodelicaprofileModelPath
	 *            the INmodelicaProfile model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 *
	 * @generated
	 */
	public void loadModels(String inumlModelPath, String insysmlModelPath, String inmodelicaprofileModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel mmproblemMetamodel = factory.newReferenceModel();
		injector.inject(mmproblemMetamodel, getMetamodelUri("MMproblem"));
	 	IReferenceModel mmumlMetamodel = factory.newReferenceModel();
		injector.inject(mmumlMetamodel, getMetamodelUri("MMuml"));
	 	IReferenceModel mmmodelicaprofileMetamodel = factory.newReferenceModel();
		injector.inject(mmmodelicaprofileMetamodel, getMetamodelUri("MMmodelicaProfile"));
	 	IReferenceModel mmsysmlMetamodel = factory.newReferenceModel();
		injector.inject(mmsysmlMetamodel, getMetamodelUri("MMsysml"));
		this.inumlModel = factory.newModel(mmumlMetamodel);
		injector.inject(inumlModel, inumlModelPath);
		this.insysmlModel = factory.newModel(mmsysmlMetamodel);
		injector.inject(insysmlModel, insysmlModelPath);
		this.inmodelicaprofileModel = factory.newModel(mmmodelicaprofileMetamodel);
		injector.inject(inmodelicaprofileModel, inmodelicaprofileModelPath);
		this.outproblemModel = factory.newModel(mmproblemMetamodel);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param outproblemModelPath
	 *            the OUTproblem model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
	public void saveModels(String outproblemModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(outproblemModel, outproblemModelPath);
	}

	/**
	 * Transform the models.
	 * 
	 * @param monitor
	 *            the progress monitor
	 * @throws ATLCoreException
	 *             if an error occurs during models handling
	 * @throws IOException
	 *             if a module cannot be read
	 * @throws ATLExecutionException
	 *             if an error occurs during the execution
	 *
	 * @generated
	 */
	public Object doSysml2problem(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(inumlModel, "INuml", "MMuml");
		launcher.addInModel(insysmlModel, "INsysml", "MMsysml");
		launcher.addInModel(inmodelicaprofileModel, "INmodelicaProfile", "MMmodelicaProfile");
		launcher.addOutModel(outproblemModel, "OUTproblem", "MMproblem");
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
	}
	
	/**
	 * Returns an Array of the module input streams, parameterized by the
	 * property file.
	 * 
	 * @return an Array of the module input streams
	 * @throws IOException
	 *             if a module cannot be read
	 *
	 * @generated
	 */
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("Sysml2problem.modules");
		if (modulesList != null) {
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			for (int i = 0; i < moduleNames.length; i++) {
				String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
				modules[i] = getFileURL(asmModulePath).openStream();
			}
		}
		return modules;
	}
	
	/**
	 * Returns the URI of the given metamodel, parameterized from the property file.
	 * 
	 * @param metamodelName
	 *            the metamodel name
	 * @return the metamodel URI
	 *
	 * @generated
	 */
	protected String getMetamodelUri(String metamodelName) {
		return properties.getProperty("Sysml2problem.metamodels." + metamodelName);
	}
	
	/**
	 * Returns the file name of the given library, parameterized from the property file.
	 * 
	 * @param libraryName
	 *            the library name
	 * @return the library file name
	 *
	 * @generated
	 */
	protected InputStream getLibraryAsStream(String libraryName) throws IOException {
		return getFileURL(properties.getProperty("Sysml2problem.libraries." + libraryName)).openStream();
	}
	
	/**
	 * Returns the options map, parameterized from the property file.
	 * 
	 * @return the options map
	 *
	 * @generated
	 */
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("Sysml2problem.options.")) {
				options.put(entry.getKey().toString().replaceFirst("Sysml2problem.options.", ""), 
				entry.getValue().toString());
			}
		}
		return options;
	}
	
	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 * 
	 * @generated
	 */
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = Sysml2problem.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = Sysml2problem.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	/**
	 * Tests if eclipse is running.
	 * 
	 * @return <code>true</code> if eclipse is running
	 *
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
