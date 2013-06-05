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
package edu.ufc.femtost.disc.sysml4modelica.profile.types.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.componentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.otherPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.otherPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.impl.sysml4modelicaPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.sysml4modelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaBoolean;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaExternalObject;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaInteger;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaReal;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaString;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.typesFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.typesPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.topcased.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class typesPackageImpl extends EPackageImpl implements typesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaExternalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaFlowFlagKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaScopeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaCausalityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaVariabilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaStateSelectEEnum = null;

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.typesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private typesPackageImpl() {
		super(eNS_URI, typesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link typesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static typesPackage init() {
		if (isInited) return (typesPackage)EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI);

		// Obtain or create and register package
		typesPackageImpl thetypesPackage = (typesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof typesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new typesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		sysml4modelicaPackageImpl thesysml4modelicaPackage = (sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) instanceof sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) : sysml4modelicaPackage.eINSTANCE);
		classesPackageImpl theclassesPackage = (classesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) instanceof classesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) : classesPackage.eINSTANCE);
		componentsPackageImpl thecomponentsPackage = (componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) instanceof componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) : componentsPackage.eINSTANCE);
		equationsandalgorithmsPackageImpl theequationsandalgorithmsPackage = (equationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) instanceof equationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) : equationsandalgorithmsPackage.eINSTANCE);
		otherPackageImpl theotherPackage = (otherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) instanceof otherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) : otherPackage.eINSTANCE);

		// Create package meta-data objects
		thetypesPackage.createPackageContents();
		thesysml4modelicaPackage.createPackageContents();
		theclassesPackage.createPackageContents();
		thecomponentsPackage.createPackageContents();
		theequationsandalgorithmsPackage.createPackageContents();
		theotherPackage.createPackageContents();

		// Initialize created meta-data
		thetypesPackage.initializePackageContents();
		thesysml4modelicaPackage.initializePackageContents();
		theclassesPackage.initializePackageContents();
		thecomponentsPackage.initializePackageContents();
		theequationsandalgorithmsPackage.initializePackageContents();
		theotherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thetypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(typesPackage.eNS_URI, thetypesPackage);
		return thetypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaReal() {
		return modelicaRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaInteger() {
		return modelicaIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaBoolean() {
		return modelicaBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaString() {
		return modelicaStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaExternalObject() {
		return modelicaExternalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaFlowFlagKind() {
		return modelicaFlowFlagKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaScopeKind() {
		return modelicaScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaCausalityKind() {
		return modelicaCausalityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaVariabilityKind() {
		return modelicaVariabilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaStateSelect() {
		return modelicaStateSelectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typesFactory gettypesFactory() {
		return (typesFactory)getEFactoryInstance();
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
		modelicaRealEClass = createEClass(MODELICA_REAL);

		modelicaIntegerEClass = createEClass(MODELICA_INTEGER);

		modelicaBooleanEClass = createEClass(MODELICA_BOOLEAN);

		modelicaStringEClass = createEClass(MODELICA_STRING);

		modelicaExternalObjectEClass = createEClass(MODELICA_EXTERNAL_OBJECT);

		// Create enums
		modelicaFlowFlagKindEEnum = createEEnum(MODELICA_FLOW_FLAG_KIND);
		modelicaCausalityKindEEnum = createEEnum(MODELICA_CAUSALITY_KIND);
		modelicaVariabilityKindEEnum = createEEnum(MODELICA_VARIABILITY_KIND);
		modelicaStateSelectEEnum = createEEnum(MODELICA_STATE_SELECT);
		modelicaScopeKindEEnum = createEEnum(MODELICA_SCOPE_KIND);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelicaRealEClass, ModelicaReal.class, "ModelicaReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaIntegerEClass, ModelicaInteger.class, "ModelicaInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaBooleanEClass, ModelicaBoolean.class, "ModelicaBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaStringEClass, ModelicaString.class, "ModelicaString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaExternalObjectEClass, ModelicaExternalObject.class, "ModelicaExternalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(modelicaFlowFlagKindEEnum, ModelicaFlowFlagKind.class, "ModelicaFlowFlagKind");
		addEEnumLiteral(modelicaFlowFlagKindEEnum, ModelicaFlowFlagKind.NONE);
		addEEnumLiteral(modelicaFlowFlagKindEEnum, ModelicaFlowFlagKind.FLOW);
		addEEnumLiteral(modelicaFlowFlagKindEEnum, ModelicaFlowFlagKind.STREAM);

		initEEnum(modelicaCausalityKindEEnum, ModelicaCausalityKind.class, "ModelicaCausalityKind");
		addEEnumLiteral(modelicaCausalityKindEEnum, ModelicaCausalityKind.NONE);
		addEEnumLiteral(modelicaCausalityKindEEnum, ModelicaCausalityKind.INPUT);
		addEEnumLiteral(modelicaCausalityKindEEnum, ModelicaCausalityKind.OUTPUT);

		initEEnum(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.class, "ModelicaVariabilityKind");
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.CONTINUOUS);
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.CONSTANT);
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.PARAMETER);
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.DISCRETE);

		initEEnum(modelicaStateSelectEEnum, ModelicaStateSelect.class, "ModelicaStateSelect");
		addEEnumLiteral(modelicaStateSelectEEnum, ModelicaStateSelect.ALWAYS);
		addEEnumLiteral(modelicaStateSelectEEnum, ModelicaStateSelect.NEVER);
		addEEnumLiteral(modelicaStateSelectEEnum, ModelicaStateSelect.PREFER);
		addEEnumLiteral(modelicaStateSelectEEnum, ModelicaStateSelect.AVOID);
		addEEnumLiteral(modelicaStateSelectEEnum, ModelicaStateSelect.DEFAULT);

		initEEnum(modelicaScopeKindEEnum, ModelicaScopeKind.class, "ModelicaScopeKind");
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.NONE);
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.INNER);
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.OUTER);
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.INNEROUTER);
	}

} //typesPackageImpl
