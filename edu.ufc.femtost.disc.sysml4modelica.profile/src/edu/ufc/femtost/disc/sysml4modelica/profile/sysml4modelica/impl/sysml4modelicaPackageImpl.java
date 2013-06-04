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
package edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.componentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.otherPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.otherPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.sysml4modelicaFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.sysml4modelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.typesPackage;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.topcased.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class sysml4modelicaPackageImpl extends EPackageImpl implements sysml4modelicaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dummyEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.sysml4modelicaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private sysml4modelicaPackageImpl() {
		super(eNS_URI, sysml4modelicaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link sysml4modelicaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static sysml4modelicaPackage init() {
		if (isInited) return (sysml4modelicaPackage)EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI);

		// Obtain or create and register package
		sysml4modelicaPackageImpl thesysml4modelicaPackage = (sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new sysml4modelicaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		classesPackageImpl theclassesPackage = (classesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) instanceof classesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) : classesPackage.eINSTANCE);
		typesPackageImpl thetypesPackage = (typesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) instanceof typesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) : typesPackage.eINSTANCE);
		componentsPackageImpl thecomponentsPackage = (componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) instanceof componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) : componentsPackage.eINSTANCE);
		equationsandalgorithmsPackageImpl theequationsandalgorithmsPackage = (equationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) instanceof equationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) : equationsandalgorithmsPackage.eINSTANCE);
		otherPackageImpl theotherPackage = (otherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) instanceof otherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) : otherPackage.eINSTANCE);

		// Create package meta-data objects
		thesysml4modelicaPackage.createPackageContents();
		theclassesPackage.createPackageContents();
		thetypesPackage.createPackageContents();
		thecomponentsPackage.createPackageContents();
		theequationsandalgorithmsPackage.createPackageContents();
		theotherPackage.createPackageContents();

		// Initialize created meta-data
		thesysml4modelicaPackage.initializePackageContents();
		theclassesPackage.initializePackageContents();
		thetypesPackage.initializePackageContents();
		thecomponentsPackage.initializePackageContents();
		theequationsandalgorithmsPackage.initializePackageContents();
		theotherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thesysml4modelicaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(sysml4modelicaPackage.eNS_URI, thesysml4modelicaPackage);
		return thesysml4modelicaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDummy() {
		return dummyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sysml4modelicaFactory getsysml4modelicaFactory() {
		return (sysml4modelicaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create data types
		dummyEDataType = createEDataType(DUMMY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		classesPackage theclassesPackage = (classesPackage)EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI);
		typesPackage thetypesPackage = (typesPackage)EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI);
		componentsPackage thecomponentsPackage = (componentsPackage)EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI);
		equationsandalgorithmsPackage theequationsandalgorithmsPackage = (equationsandalgorithmsPackage)EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI);
		otherPackage theotherPackage = (otherPackage)EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theclassesPackage);
		getESubpackages().add(thetypesPackage);
		getESubpackages().add(thecomponentsPackage);
		getESubpackages().add(theequationsandalgorithmsPackage);
		getESubpackages().add(theotherPackage);

		// Initialize data types
		initEDataType(dummyEDataType, String.class, "Dummy", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //sysml4modelicaPackageImpl
