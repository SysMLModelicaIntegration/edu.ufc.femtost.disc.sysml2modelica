/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ClassesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation;

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
public class EquationsandalgorithmsPackageImpl extends EPackageImpl implements EquationsandalgorithmsPackage {
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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EquationsandalgorithmsPackageImpl() {
		super(eNS_URI, EquationsandalgorithmsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EquationsandalgorithmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EquationsandalgorithmsPackage init() {
		if (isInited) return (EquationsandalgorithmsPackage)EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI);

		// Obtain or create and register package
		EquationsandalgorithmsPackageImpl theEquationsandalgorithmsPackage = (EquationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EquationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EquationsandalgorithmsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Sysml4modelicaPackageImpl theSysml4modelicaPackage = (Sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) instanceof Sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) : Sysml4modelicaPackage.eINSTANCE);
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) : ComponentsPackage.eINSTANCE);
		OtherPackageImpl theOtherPackage = (OtherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) instanceof OtherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) : OtherPackage.eINSTANCE);

		// Create package meta-data objects
		theEquationsandalgorithmsPackage.createPackageContents();
		theSysml4modelicaPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theOtherPackage.createPackageContents();

		// Initialize created meta-data
		theEquationsandalgorithmsPackage.initializePackageContents();
		theSysml4modelicaPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theOtherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEquationsandalgorithmsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EquationsandalgorithmsPackage.eNS_URI, theEquationsandalgorithmsPackage);
		return theEquationsandalgorithmsPackage;
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
	public EquationsandalgorithmsFactory getEquationsandalgorithmsFactory() {
		return (EquationsandalgorithmsFactory)getEFactoryInstance();
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
		org.eclipse.uml2.types.TypesPackage theTypesPackage_1 = (org.eclipse.uml2.types.TypesPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.uml2.types.TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelicaEquationEClass, ModelicaEquation.class, "ModelicaEquation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaEquation_IsInitial(), theTypesPackage_1.getBoolean(), "isInitial", "false", 1, 1, ModelicaEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaEquation_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1, 1, ModelicaEquation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaAlgorithmEClass, ModelicaAlgorithm.class, "ModelicaAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaAlgorithm_IsInitial(), theTypesPackage_1.getBoolean(), "isInitial", "false", 1, 1, ModelicaAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelicaAlgorithm_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 1, 1, ModelicaAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaConnectionEClass, ModelicaConnection.class, "ModelicaConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaConnection_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, ModelicaConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //EquationsandalgorithmsPackageImpl
