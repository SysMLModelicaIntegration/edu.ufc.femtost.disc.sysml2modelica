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
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaBlock;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClass;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConstrainedBy;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaDer;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaModel;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaOperator;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaPackage;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaRecord;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaType;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.componentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl;

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

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class classesPackageImpl extends EPackageImpl implements classesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaClassDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaExtendsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaConstrainedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaDerEClass = null;

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private classesPackageImpl() {
		super(eNS_URI, classesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link classesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static classesPackage init() {
		if (isInited) return (classesPackage)EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI);

		// Obtain or create and register package
		classesPackageImpl theclassesPackage = (classesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof classesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new classesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		sysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		sysml4modelicaPackageImpl thesysml4modelicaPackage = (sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) instanceof sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) : sysml4modelicaPackage.eINSTANCE);
		typesPackageImpl thetypesPackage = (typesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) instanceof typesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) : typesPackage.eINSTANCE);
		componentsPackageImpl thecomponentsPackage = (componentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) instanceof componentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI) : componentsPackage.eINSTANCE);
		equationsandalgorithmsPackageImpl theequationsandalgorithmsPackage = (equationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) instanceof equationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) : equationsandalgorithmsPackage.eINSTANCE);
		otherPackageImpl theotherPackage = (otherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) instanceof otherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) : otherPackage.eINSTANCE);

		// Create package meta-data objects
		theclassesPackage.createPackageContents();
		thesysml4modelicaPackage.createPackageContents();
		thetypesPackage.createPackageContents();
		thecomponentsPackage.createPackageContents();
		theequationsandalgorithmsPackage.createPackageContents();
		theotherPackage.createPackageContents();

		// Initialize created meta-data
		theclassesPackage.initializePackageContents();
		thesysml4modelicaPackage.initializePackageContents();
		thetypesPackage.initializePackageContents();
		thecomponentsPackage.initializePackageContents();
		theequationsandalgorithmsPackage.initializePackageContents();
		theotherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theclassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(classesPackage.eNS_URI, theclassesPackage);
		return theclassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaClassDefinition() {
		return modelicaClassDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_Base_Classifier() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsFinal() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsPartial() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsModelicaEncapsulated() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsReplaceable() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaClass() {
		return modelicaClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaModel() {
		return modelicaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaBlock() {
		return modelicaBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaRecord() {
		return modelicaRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaOperator() {
		return modelicaOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaConnector() {
		return modelicaConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaConnector_IsExpandable() {
		return (EAttribute)modelicaConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaPackage() {
		return modelicaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaType() {
		return modelicaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaFunction() {
		return modelicaFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaFunction_Base_FunctionBehavior() {
		return (EReference)modelicaFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunction_Scope() {
		return (EAttribute)modelicaFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunction_ExternalLibrary() {
		return (EAttribute)modelicaFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunction_ExternalInclude() {
		return (EAttribute)modelicaFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaExtends() {
		return modelicaExtendsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaExtends_Modification() {
		return (EAttribute)modelicaExtendsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaExtends_Base_Generalization() {
		return (EReference)modelicaExtendsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaExtends_Visibility() {
		return (EAttribute)modelicaExtendsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaExtends_ArraySize() {
		return (EAttribute)modelicaExtendsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaConstrainedBy() {
		return modelicaConstrainedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaConstrainedBy_Modification() {
		return (EAttribute)modelicaConstrainedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaConstrainedBy_Base_Dependency() {
		return (EReference)modelicaConstrainedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaDer() {
		return modelicaDerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaDer_Variable() {
		return (EAttribute)modelicaDerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaDer_Base_Dependency() {
		return (EReference)modelicaDerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classesFactory getclassesFactory() {
		return (classesFactory)getEFactoryInstance();
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
		modelicaClassDefinitionEClass = createEClass(MODELICA_CLASS_DEFINITION);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_FINAL);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_PARTIAL);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_REPLACEABLE);

		modelicaClassEClass = createEClass(MODELICA_CLASS);

		modelicaModelEClass = createEClass(MODELICA_MODEL);

		modelicaBlockEClass = createEClass(MODELICA_BLOCK);

		modelicaRecordEClass = createEClass(MODELICA_RECORD);

		modelicaOperatorEClass = createEClass(MODELICA_OPERATOR);

		modelicaConnectorEClass = createEClass(MODELICA_CONNECTOR);
		createEAttribute(modelicaConnectorEClass, MODELICA_CONNECTOR__IS_EXPANDABLE);

		modelicaPackageEClass = createEClass(MODELICA_PACKAGE);

		modelicaTypeEClass = createEClass(MODELICA_TYPE);

		modelicaFunctionEClass = createEClass(MODELICA_FUNCTION);
		createEReference(modelicaFunctionEClass, MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR);
		createEAttribute(modelicaFunctionEClass, MODELICA_FUNCTION__SCOPE);
		createEAttribute(modelicaFunctionEClass, MODELICA_FUNCTION__EXTERNAL_LIBRARY);
		createEAttribute(modelicaFunctionEClass, MODELICA_FUNCTION__EXTERNAL_INCLUDE);

		modelicaExtendsEClass = createEClass(MODELICA_EXTENDS);
		createEAttribute(modelicaExtendsEClass, MODELICA_EXTENDS__MODIFICATION);
		createEReference(modelicaExtendsEClass, MODELICA_EXTENDS__BASE_GENERALIZATION);
		createEAttribute(modelicaExtendsEClass, MODELICA_EXTENDS__VISIBILITY);
		createEAttribute(modelicaExtendsEClass, MODELICA_EXTENDS__ARRAY_SIZE);

		modelicaConstrainedByEClass = createEClass(MODELICA_CONSTRAINED_BY);
		createEAttribute(modelicaConstrainedByEClass, MODELICA_CONSTRAINED_BY__MODIFICATION);
		createEReference(modelicaConstrainedByEClass, MODELICA_CONSTRAINED_BY__BASE_DEPENDENCY);

		modelicaDerEClass = createEClass(MODELICA_DER);
		createEAttribute(modelicaDerEClass, MODELICA_DER__VARIABLE);
		createEReference(modelicaDerEClass, MODELICA_DER__BASE_DEPENDENCY);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		typesPackage thetypesPackage = (typesPackage)EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelicaClassEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaClassEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		modelicaModelEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaModelEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		modelicaBlockEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaBlockEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		modelicaRecordEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaRecordEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		modelicaOperatorEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaOperatorEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		modelicaConnectorEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaConnectorEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		modelicaPackageEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaPackageEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		modelicaTypeEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelicaTypeEClass.getESuperTypes().add(theBlocksPackage.getValueType());
		modelicaFunctionEClass.getESuperTypes().add(this.getModelicaClassDefinition());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelicaClassDefinitionEClass, ModelicaClassDefinition.class, "ModelicaClassDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaClassDefinition_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsFinal(), theTypesPackage.getBoolean(), "isFinal", "false", 1, 1, ModelicaClassDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsPartial(), theTypesPackage.getBoolean(), "isPartial", "false", 1, 1, ModelicaClassDefinition.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsModelicaEncapsulated(), theTypesPackage.getBoolean(), "isModelicaEncapsulated", "false", 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsReplaceable(), theTypesPackage.getBoolean(), "isReplaceable", "false", 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaClassEClass, ModelicaClass.class, "ModelicaClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaModelEClass, ModelicaModel.class, "ModelicaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaBlockEClass, ModelicaBlock.class, "ModelicaBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaRecordEClass, ModelicaRecord.class, "ModelicaRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaOperatorEClass, ModelicaOperator.class, "ModelicaOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaConnectorEClass, ModelicaConnector.class, "ModelicaConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaConnector_IsExpandable(), theTypesPackage.getBoolean(), "isExpandable", "false", 1, 1, ModelicaConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaPackageEClass, ModelicaPackage.class, "ModelicaPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaTypeEClass, ModelicaType.class, "ModelicaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelicaFunctionEClass, ModelicaFunction.class, "ModelicaFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaFunction_Base_FunctionBehavior(), theUMLPackage.getFunctionBehavior(), null, "base_FunctionBehavior", null, 1, 1, ModelicaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunction_Scope(), thetypesPackage.getModelicaScopeKind(), "scope", "none", 1, 1, ModelicaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunction_ExternalLibrary(), theTypesPackage.getString(), "externalLibrary", null, 0, 1, ModelicaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunction_ExternalInclude(), theTypesPackage.getString(), "externalInclude", null, 0, 1, ModelicaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaExtendsEClass, ModelicaExtends.class, "ModelicaExtends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaExtends_Modification(), theTypesPackage.getString(), "modification", null, 0, -1, ModelicaExtends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaExtends_Base_Generalization(), theUMLPackage.getGeneralization(), null, "base_Generalization", null, 1, 1, ModelicaExtends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaExtends_Visibility(), theUMLPackage.getVisibilityKind(), "visibility", "public", 1, 1, ModelicaExtends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaExtends_ArraySize(), theTypesPackage.getString(), "arraySize", null, 0, -1, ModelicaExtends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelicaConstrainedByEClass, ModelicaConstrainedBy.class, "ModelicaConstrainedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaConstrainedBy_Modification(), theTypesPackage.getString(), "modification", null, 0, -1, ModelicaConstrainedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaConstrainedBy_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, ModelicaConstrainedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaDerEClass, ModelicaDer.class, "ModelicaDer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaDer_Variable(), theTypesPackage.getString(), "variable", null, 1, -1, ModelicaDer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaDer_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, ModelicaDer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
			 "originalName", "Classes"
		   });
	}

} //classesPackageImpl
