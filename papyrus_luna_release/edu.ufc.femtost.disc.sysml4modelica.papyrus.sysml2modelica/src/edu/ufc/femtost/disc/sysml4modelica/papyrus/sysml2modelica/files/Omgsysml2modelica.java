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
package edu.ufc.femtost.disc.sysml4modelica.papyrus.sysml2modelica.files;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Entry point of the 'Omgsysml2modelica' transformation module.
 */
public class Omgsysml2modelica {

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
	 * The OUTmodelica model.
	 * @generated
	 */
	protected IModel outmodelicaModel;	
		
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
				System.out.println("Arguments not valid : {INuml_model_path, INsysml_model_path, INmodelicaProfile_model_path, OUTmodelica_model_path}.");
			} else {
				Omgsysml2modelica runner = new Omgsysml2modelica();
				runner.loadModels(args[0], args[1], args[2]);
				runner.doOmgsysml2modelica(new NullProgressMonitor());
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
	public Omgsysml2modelica() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("Omgsysml2modelica.properties").openStream());
		EPackage.Registry.INSTANCE.put(getMetamodelUri("MMuml"), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
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
	 	IReferenceModel mmumlMetamodel = factory.newReferenceModel();
		injector.inject(mmumlMetamodel, getMetamodelUri("MMuml"));
	 	IReferenceModel mmmodelicaprofileMetamodel = factory.newReferenceModel();
		injector.inject(mmmodelicaprofileMetamodel, getMetamodelUri("MMmodelicaProfile"));
	 	IReferenceModel mmmodelicaMetamodel = factory.newReferenceModel();
		injector.inject(mmmodelicaMetamodel, getMetamodelUri("MMmodelica"));
	 	IReferenceModel mmsysmlMetamodel = factory.newReferenceModel();
		injector.inject(mmsysmlMetamodel, getMetamodelUri("MMsysml"));
		this.inumlModel = factory.newModel(mmumlMetamodel);
		injector.inject(inumlModel, inumlModelPath);
		this.insysmlModel = factory.newModel(mmsysmlMetamodel);
		injector.inject(insysmlModel, insysmlModelPath);
		this.inmodelicaprofileModel = factory.newModel(mmmodelicaprofileMetamodel);
		injector.inject(inmodelicaprofileModel, inmodelicaprofileModelPath);
		this.outmodelicaModel = factory.newModel(mmmodelicaMetamodel);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param outmodelicaModelPath
	 *            the OUTmodelica model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
	public void saveModels(String outmodelicaModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(outmodelicaModel, outmodelicaModelPath);
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
	public Object doOmgsysml2modelica(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(inumlModel, "INuml", "MMuml");
		launcher.addInModel(insysmlModel, "INsysml", "MMsysml");
		launcher.addInModel(inmodelicaprofileModel, "INmodelicaProfile", "MMmodelicaProfile");
		launcher.addOutModel(outmodelicaModel, "OUTmodelica", "MMmodelica");
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
	}
	
	 /**
     * The main method.
     *
     * @param inModel    the input model
     * @param outProblem the output model
     * @throws IOException      if the input model does not exists
     * @throws ATLCoreException if the transformation fails
     * @generated not
     */
    public static void transform(final String inModel, final String outModelica) throws IOException, ATLCoreException {
        Omgsysml2modelica runner = new Omgsysml2modelica();
        runner.loadModels(inModel);
        runner.doinModel2outModel(new NullProgressMonitor());
        runner.saveModels(outModelica);
    }
    
	/**
     * Load the input and input/output models, initialize output models.
     *
     * @param inModelPath the inModel model path
     * @throws ATLCoreException if a problem occurs while loading models
     * @generated not
     */
    public final void loadModels(final String inModelPath) throws ATLCoreException {
        ModelFactory factory = new EMFModelFactory();
        IInjector injector = new EMFInjector();
        IReferenceModel sysmlMetamodel = factory.newReferenceModel();
        injector.inject(sysmlMetamodel, getMetamodelUri("MMsysml"));
        IReferenceModel modelicaMetamodel = factory.newReferenceModel();
        injector.inject(modelicaMetamodel, getMetamodelUri("MMmodelica"));
        IReferenceModel mmumlMetamodel = factory.newReferenceModel();
		injector.inject(mmumlMetamodel, getMetamodelUri("MMuml"));
		IReferenceModel mmmodelicaprofileMetamodel = factory.newReferenceModel();
		injector.inject(mmmodelicaprofileMetamodel, getMetamodelUri("MMmodelicaProfile"));
		
		this.inmodelicaprofileModel = factory.newModel(mmmodelicaprofileMetamodel);
		injector.inject(inmodelicaprofileModel, inModelPath);
        this.insysmlModel = factory.newModel(sysmlMetamodel);
        injector.inject(insysmlModel, inModelPath);
        this.inumlModel = factory.newModel(mmumlMetamodel);
		injector.inject(inumlModel, inModelPath);
        this.outmodelicaModel = factory.newModel(modelicaMetamodel);
        
    }
    
    /**
     * Transform the models.
     *
     * @param monitor the progress monitor
     * @return the result of the eclispe execution for the transformation
     * @throws ATLCoreException      if an error occurs during models handling
     * @throws IOException           if a module cannot be read
     * @throws ATLExecutionException if an error occurs during the execution
     * @generated not
     */
    public final Object doinModel2outModel(final IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
        ILauncher launcher = new EMFVMLauncher();
        List<InputStream> inputStreamsToClose = new ArrayList<InputStream>();
        Map<String, Object> launcherOptions = getOptions();
        launcher.initialize(launcherOptions);
        launcher.addInModel(insysmlModel, "INsysml", "MMsysml");
        launcher.addInModel(inumlModel, "INuml", "MMuml");
        launcher.addOutModel(outmodelicaModel, "OUTmodelica", "MMmodelica");
        launcher.addInModel(inmodelicaprofileModel, "INmodelicaProfile", "MMmodelicaProfile");
        InputStream[] modulesStreams = getModulesList();
        inputStreamsToClose.addAll(Arrays.asList(modulesStreams));
        Object result = launcher.launch("run", monitor, launcherOptions, (Object[]) modulesStreams);
        for (InputStream inputStream : inputStreamsToClose) {
            inputStream.close();
        }
        return result;
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
		String modulesList = properties.getProperty("Omgsysml2modelica.modules");
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
		return properties.getProperty("Omgsysml2modelica.metamodels." + metamodelName);
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
		return getFileURL(properties.getProperty("Omgsysml2modelica.libraries." + libraryName)).openStream();
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
			if (entry.getKey().toString().startsWith("Omgsysml2modelica.options.")) {
				options.put(entry.getKey().toString().replaceFirst("Omgsysml2modelica.options.", ""), 
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
			URL resourceURL = Omgsysml2modelica.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = Omgsysml2modelica.class.getResource(fileName);
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
