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
package edu.ufc.femtost.disc.sysml4modelica.profile.components.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage;

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

import org.eclipse.uml2.uml.UMLPackage;
import org.topcased.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class componentsPackageImpl extends EPackageImpl implements componentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaFunctionParameterEClass = null;

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private componentsPackageImpl() {
		super(eNS_URI, componentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link componentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static componentsPackage init() {
		if (isInited) return (componentsPackage)EPackage.Registry.INSTANCE.getEPackage(componentsPackage.eNS_URI);

		// Obtain or create and register package
		componentsPackageImpl thecomponentsPackage = (componentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof componentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new componentsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		sysml4modelicaPackageImpl thesysml4modelicaPackage = (sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) instanceof sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(sysml4modelicaPackage.eNS_URI) : sysml4modelicaPackage.eINSTANCE);
		classesPackageImpl theclassesPackage = (classesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) instanceof classesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(classesPackage.eNS_URI) : classesPackage.eINSTANCE);
		typesPackageImpl thetypesPackage = (typesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) instanceof typesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI) : typesPackage.eINSTANCE);
		equationsandalgorithmsPackageImpl theequationsandalgorithmsPackage = (equationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) instanceof equationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(equationsandalgorithmsPackage.eNS_URI) : equationsandalgorithmsPackage.eINSTANCE);
		otherPackageImpl theotherPackage = (otherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) instanceof otherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(otherPackage.eNS_URI) : otherPackage.eINSTANCE);

		// Create package meta-data objects
		thecomponentsPackage.createPackageContents();
		thesysml4modelicaPackage.createPackageContents();
		theclassesPackage.createPackageContents();
		thetypesPackage.createPackageContents();
		theequationsandalgorithmsPackage.createPackageContents();
		theotherPackage.createPackageContents();

		// Initialize created meta-data
		thecomponentsPackage.initializePackageContents();
		thesysml4modelicaPackage.initializePackageContents();
		theclassesPackage.initializePackageContents();
		thetypesPackage.initializePackageContents();
		theequationsandalgorithmsPackage.initializePackageContents();
		theotherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecomponentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(componentsPackage.eNS_URI, thecomponentsPackage);
		return thecomponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaValueProperty() {
		return modelicaValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaValueProperty_Base_Property() {
		return (EReference)modelicaValuePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Causality() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Variability() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_FlowFlag() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Scope() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_IsFinal() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_ConditionalExpression() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Modification() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_IsReplaceable() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_DeclarationEquation() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_ArraySize() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaPart() {
		return modelicaPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaPart_Base_Property() {
		return (EReference)modelicaPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_Scope() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_ConditionalExpression() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_Modification() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_IsFinal() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_IsReplaceable() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_ArraySize() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaPort() {
		return modelicaPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaPort_Base_Port() {
		return (EReference)modelicaPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_Causality() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_ConditionalExpression() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_Modification() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_IsFinal() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_IsReplaceable() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_ArraySize() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaFunctionParameter() {
		return modelicaFunctionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaFunctionParameter_Base_Parameter() {
		return (EReference)modelicaFunctionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Causality() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Variability() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Modification() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_IsReplaceable() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_DeclarationEquation() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_IsFinal() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_ArraySize() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentsFactory getcomponentsFactory() {
		return (componentsFactory)getEFactoryInstance();
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
		modelicaValuePropertyEClass = createEClass(MODELICA_VALUE_PROPERTY);
		createEReference(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__BASE_PROPERTY);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__CAUSALITY);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__VARIABILITY);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__FLOW_FLAG);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__SCOPE);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__IS_FINAL);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__MODIFICATION);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__IS_REPLACEABLE);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__ARRAY_SIZE);

		modelicaPartEClass = createEClass(MODELICA_PART);
		createEReference(modelicaPartEClass, MODELICA_PART__BASE_PROPERTY);
		createEAttribute(modelicaPartEClass, MODELICA_PART__SCOPE);
		createEAttribute(modelicaPartEClass, MODELICA_PART__CONDITIONAL_EXPRESSION);
		createEAttribute(modelicaPartEClass, MODELICA_PART__MODIFICATION);
		createEAttribute(modelicaPartEClass, MODELICA_PART__IS_FINAL);
		createEAttribute(modelicaPartEClass, MODELICA_PART__IS_REPLACEABLE);
		createEAttribute(modelicaPartEClass, MODELICA_PART__ARRAY_SIZE);

		modelicaPortEClass = createEClass(MODELICA_PORT);
		createEReference(modelicaPortEClass, MODELICA_PORT__BASE_PORT);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__CAUSALITY);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__CONDITIONAL_EXPRESSION);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__MODIFICATION);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__IS_FINAL);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__IS_REPLACEABLE);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__ARRAY_SIZE);

		modelicaFunctionParameterEClass = createEClass(MODELICA_FUNCTION_PARAMETER);
		createEReference(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__CAUSALITY);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__VARIABILITY);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__MODIFICATION);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__IS_FINAL);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE);
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
		typesPackage thetypesPackage = (typesPackage)EPackage.Registry.INSTANCE.getEPackage(typesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelicaValuePropertyEClass, ModelicaValueProperty.class, "ModelicaValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaValueProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Causality(), thetypesPackage.getModelicaCausalityKind(), "causality", "none", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Variability(), thetypesPackage.getModelicaVariabilityKind(), "variability", "continuous", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_FlowFlag(), thetypesPackage.getModelicaFlowFlagKind(), "flowFlag", "none", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Scope(), thetypesPackage.getModelicaScopeKind(), "scope", "none", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_IsFinal(), ecorePackage.getEBoolean(), "isFinal", "false", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_ConditionalExpression(), ecorePackage.getEString(), "conditionalExpression", null, 0, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_IsReplaceable(), ecorePackage.getEBoolean(), "isReplaceable", "false", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_DeclarationEquation(), ecorePackage.getEString(), "declarationEquation", null, 0, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_ArraySize(), ecorePackage.getEString(), "arraySize", null, 0, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaPartEClass, ModelicaPart.class, "ModelicaPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaPart_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_Scope(), thetypesPackage.getModelicaScopeKind(), "scope", "none", 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_ConditionalExpression(), ecorePackage.getEString(), "conditionalExpression", null, 0, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_IsFinal(), ecorePackage.getEBoolean(), "isFinal", "false", 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_IsReplaceable(), ecorePackage.getEBoolean(), "isReplaceable", "false", 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_ArraySize(), ecorePackage.getEString(), "arraySize", null, 0, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaPortEClass, ModelicaPort.class, "ModelicaPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_Causality(), thetypesPackage.getModelicaCausalityKind(), "causality", "none", 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_ConditionalExpression(), ecorePackage.getEString(), "conditionalExpression", null, 0, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_IsFinal(), ecorePackage.getEBoolean(), "isFinal", "false", 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_IsReplaceable(), ecorePackage.getEBoolean(), "isReplaceable", "false", 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_ArraySize(), ecorePackage.getEString(), "arraySize", null, 0, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaFunctionParameterEClass, ModelicaFunctionParameter.class, "ModelicaFunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaFunctionParameter_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Causality(), thetypesPackage.getModelicaCausalityKind(), "causality", "input", 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Variability(), thetypesPackage.getModelicaVariabilityKind(), "variability", "continuous", 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_IsReplaceable(), ecorePackage.getEBoolean(), "isReplaceable", "false", 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_DeclarationEquation(), ecorePackage.getEString(), "declarationEquation", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_IsFinal(), ecorePackage.getEBoolean(), "isFinal", "false", 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_ArraySize(), ecorePackage.getEString(), "arraySize", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //componentsPackageImpl
