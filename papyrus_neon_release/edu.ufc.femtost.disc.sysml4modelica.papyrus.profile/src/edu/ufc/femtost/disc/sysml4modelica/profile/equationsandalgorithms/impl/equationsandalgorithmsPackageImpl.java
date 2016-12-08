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
/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.componentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.otherPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.otherPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.impl.sysml4modelicaPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.sysml4modelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.typesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class equationsandalgorithmsPackageImpl extends EPackageImpl implements equationsandalgorithmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaEquationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaConnectionEClass = null;

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private equationsandalgorithmsPackageImpl() {
		super(eNS_URI, equationsandalgorithmsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link equationsandalgorithmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static equationsandalgorithmsPackage init() {
		if (isInited) return (equationsandalgorithmsPackage)EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI);

		// Obtain or create and register package
		equationsandalgorithmsPackageImpl theequationsandalgorithmsPackage = (equationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof equationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new equationsandalgorithmsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		sysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		sysml4modelicaPackageImpl thesysml4modelicaPackage = (sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) instanceof sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) : sysml4modelicaPackage.eINSTANCE);
		classesPackageImpl theclassesPackage = (classesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) instanceof classesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) : classesPackage.eINSTANCE);
		typesPackageImpl thetypesPackage = (typesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) instanceof typesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) : typesPackage.eINSTANCE);
		componentsPackageImpl thecomponentsPackage = (componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) instanceof componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) : componentsPackage.eINSTANCE);
		otherPackageImpl theotherPackage = (otherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) instanceof otherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) : otherPackage.eINSTANCE);

		// Create package meta-data objects
		theequationsandalgorithmsPackage.createPackageContents();
		thesysml4modelicaPackage.createPackageContents();
		theclassesPackage.createPackageContents();
		thetypesPackage.createPackageContents();
		thecomponentsPackage.createPackageContents();
		theotherPackage.createPackageContents();

		// Initialize created meta-data
		theequationsandalgorithmsPackage.initializePackageContents();
		thesysml4modelicaPackage.initializePackageContents();
		theclassesPackage.initializePackageContents();
		thetypesPackage.initializePackageContents();
		thecomponentsPackage.initializePackageContents();
		theotherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theequationsandalgorithmsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(equationsandalgorithmsPackage.eNS_URI, theequationsandalgorithmsPackage);
		return theequationsandalgorithmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaEquation() {
		return modelicaEquationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaEquation_IsInitial() {
		return (EAttribute)modelicaEquationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaEquation_Base_Constraint() {
		return (EReference)modelicaEquationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaAlgorithm() {
		return modelicaAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaAlgorithm_IsInitial() {
		return (EAttribute)modelicaAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaAlgorithm_Base_Behavior() {
		return (EReference)modelicaAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaConnection() {
		return modelicaConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaConnection_Base_Connector() {
		return (EReference)modelicaConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equationsandalgorithmsFactory getequationsandalgorithmsFactory() {
		return (equationsandalgorithmsFactory)getEFactoryInstance();
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

		// Create classes and their features
		modelicaEquationEClass = createEClass(MODELICA_EQUATION);
		createEAttribute(modelicaEquationEClass, MODELICA_EQUATION__IS_INITIAL);
		createEReference(modelicaEquationEClass, MODELICA_EQUATION__BASE_CONSTRAINT);

		modelicaAlgorithmEClass = createEClass(MODELICA_ALGORITHM);
		createEAttribute(modelicaAlgorithmEClass, MODELICA_ALGORITHM__IS_INITIAL);
		createEReference(modelicaAlgorithmEClass, MODELICA_ALGORITHM__BASE_BEHAVIOR);

		modelicaConnectionEClass = createEClass(MODELICA_CONNECTION);
		createEReference(modelicaConnectionEClass, MODELICA_CONNECTION__BASE_CONNECTOR);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelicaEquationEClass, ModelicaEquation.class, "ModelicaEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaEquation_IsInitial(), theTypesPackage.getBoolean(), "isInitial", "false", 1, 1, ModelicaEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaEquation_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1, 1, ModelicaEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaAlgorithmEClass, ModelicaAlgorithm.class, "ModelicaAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaAlgorithm_IsInitial(), theTypesPackage.getBoolean(), "isInitial", "false", 1, 1, ModelicaAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaAlgorithm_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 1, 1, ModelicaAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaConnectionEClass, ModelicaConnection.class, "ModelicaConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, ModelicaConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "EquationsAndAlgorithms"
		   });
	}

} //equationsandalgorithmsPackageImpl
