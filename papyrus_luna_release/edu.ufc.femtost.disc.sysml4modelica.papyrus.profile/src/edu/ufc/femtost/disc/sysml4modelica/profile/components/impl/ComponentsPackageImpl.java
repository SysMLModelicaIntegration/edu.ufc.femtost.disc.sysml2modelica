/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ClassesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.EquationsandalgorithmsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.Sysml4modelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.impl.Sysml4modelicaPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml.SysmlPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsPackageImpl extends EPackageImpl implements ComponentsPackage {
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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentsPackageImpl() {
		super(eNS_URI, ComponentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentsPackage init() {
		if (isInited) return (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Obtain or create and register package
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Sysml4modelicaPackageImpl theSysml4modelicaPackage = (Sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) instanceof Sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) : Sysml4modelicaPackage.eINSTANCE);
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		EquationsandalgorithmsPackageImpl theEquationsandalgorithmsPackage = (EquationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) instanceof EquationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) : EquationsandalgorithmsPackage.eINSTANCE);
		OtherPackageImpl theOtherPackage = (OtherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) instanceof OtherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) : OtherPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentsPackage.createPackageContents();
		theSysml4modelicaPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theEquationsandalgorithmsPackage.createPackageContents();
		theOtherPackage.createPackageContents();

		// Initialize created meta-data
		theComponentsPackage.initializePackageContents();
		theSysml4modelicaPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theEquationsandalgorithmsPackage.initializePackageContents();
		theOtherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentsPackage.eNS_URI, theComponentsPackage);
		return theComponentsPackage;
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
	public EAttribute getModelicaValueProperty_Causality() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Variability() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_FlowFlag() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Scope() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_IsFinal() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_ConditionalExpression() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Modification() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_IsReplaceable() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_DeclarationEquation() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_ArraySize() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaValueProperty_Base_Property() {
		return (EReference)modelicaValuePropertyEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getModelicaPart_ArraySize() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getModelicaPart_Modification() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_IsReplaceable() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_ConditionalExpression() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_IsFinal() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaPart_Base_Property() {
		return (EReference)modelicaPartEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getModelicaPort_IsReplaceable() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_ConditionalExpression() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_Modification() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_ArraySize() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_Causality() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_IsFinal() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaPort_Base_Port() {
		return (EReference)modelicaPortEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getModelicaFunctionParameter_DeclarationEquation() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_IsReplaceable() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Variability() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Causality() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_IsFinal() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Modification() {
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
	public ComponentsFactory getComponentsFactory() {
		return (ComponentsFactory)getEFactoryInstance();
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
		createEReference(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__BASE_PROPERTY);

		modelicaPartEClass = createEClass(MODELICA_PART);
		createEAttribute(modelicaPartEClass, MODELICA_PART__ARRAY_SIZE);
		createEAttribute(modelicaPartEClass, MODELICA_PART__SCOPE);
		createEAttribute(modelicaPartEClass, MODELICA_PART__MODIFICATION);
		createEAttribute(modelicaPartEClass, MODELICA_PART__IS_REPLACEABLE);
		createEAttribute(modelicaPartEClass, MODELICA_PART__CONDITIONAL_EXPRESSION);
		createEAttribute(modelicaPartEClass, MODELICA_PART__IS_FINAL);
		createEReference(modelicaPartEClass, MODELICA_PART__BASE_PROPERTY);

		modelicaPortEClass = createEClass(MODELICA_PORT);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__IS_REPLACEABLE);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__CONDITIONAL_EXPRESSION);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__MODIFICATION);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__ARRAY_SIZE);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__CAUSALITY);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__IS_FINAL);
		createEReference(modelicaPortEClass, MODELICA_PORT__BASE_PORT);

		modelicaFunctionParameterEClass = createEClass(MODELICA_FUNCTION_PARAMETER);
		createEReference(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__VARIABILITY);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__CAUSALITY);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__IS_FINAL);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__MODIFICATION);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		org.eclipse.uml2.types.TypesPackage theTypesPackage_1 = (org.eclipse.uml2.types.TypesPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.uml2.types.TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelicaValuePropertyEClass, ModelicaValueProperty.class, "ModelicaValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaValueProperty_Causality(), theTypesPackage.getModelicaCausalityKind(), "causality", "none", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Variability(), theTypesPackage.getModelicaVariabilityKind(), "variability", "continuous", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_FlowFlag(), theTypesPackage.getModelicaFlowFlagKind(), "flowFlag", "none", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Scope(), theTypesPackage.getModelicaScopeKind(), "scope", "none", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_IsFinal(), theTypesPackage_1.getBoolean(), "isFinal", "false", 1, 1, ModelicaValueProperty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_ConditionalExpression(), theTypesPackage_1.getString(), "conditionalExpression", null, 0, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Modification(), theTypesPackage_1.getString(), "modification", null, 0, -1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_IsReplaceable(), theTypesPackage_1.getBoolean(), "isReplaceable", "false", 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_DeclarationEquation(), theTypesPackage_1.getString(), "declarationEquation", null, 0, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaValueProperty_ArraySize(), theTypesPackage_1.getString(), "arraySize", null, 0, -1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaValueProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaPartEClass, ModelicaPart.class, "ModelicaPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaPart_ArraySize(), theTypesPackage_1.getString(), "arraySize", null, 0, -1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaPart_Scope(), theTypesPackage.getModelicaScopeKind(), "scope", "none", 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_Modification(), theTypesPackage_1.getString(), "modification", null, 0, -1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_IsReplaceable(), theTypesPackage_1.getBoolean(), "isReplaceable", "false", 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_ConditionalExpression(), theTypesPackage_1.getString(), "conditionalExpression", null, 0, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPart_IsFinal(), theTypesPackage_1.getBoolean(), "isFinal", "false", 1, 1, ModelicaPart.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaPart_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaPortEClass, ModelicaPort.class, "ModelicaPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaPort_IsReplaceable(), theTypesPackage_1.getBoolean(), "isReplaceable", "false", 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_ConditionalExpression(), theTypesPackage_1.getString(), "conditionalExpression", null, 0, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_Modification(), theTypesPackage_1.getString(), "modification", null, 0, -1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_ArraySize(), theTypesPackage_1.getString(), "arraySize", null, 0, -1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaPort_Causality(), theTypesPackage.getModelicaCausalityKind(), "causality", "none", 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaPort_IsFinal(), theTypesPackage_1.getBoolean(), "isFinal", "false", 1, 1, ModelicaPort.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaFunctionParameterEClass, ModelicaFunctionParameter.class, "ModelicaFunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaFunctionParameter_Base_Parameter(), theUMLPackage.getParameter(), null, "base_Parameter", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_DeclarationEquation(), theTypesPackage_1.getString(), "declarationEquation", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_IsReplaceable(), theTypesPackage_1.getBoolean(), "isReplaceable", "false", 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Variability(), theTypesPackage.getModelicaVariabilityKind(), "variability", "continuous", 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Causality(), theTypesPackage.getModelicaCausalityKind(), "causality", "input", 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_IsFinal(), theTypesPackage_1.getBoolean(), "isFinal", "false", 1, 1, ModelicaFunctionParameter.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Modification(), theTypesPackage_1.getString(), "modification", null, 0, -1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_ArraySize(), theTypesPackage_1.getString(), "arraySize", null, 0, -1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ComponentsPackageImpl
