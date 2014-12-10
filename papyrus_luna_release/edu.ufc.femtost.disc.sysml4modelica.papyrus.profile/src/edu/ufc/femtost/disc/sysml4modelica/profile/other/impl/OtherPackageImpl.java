/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.other.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ClassesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.EquationsandalgorithmsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaAnnotation;
import edu.ufc.femtost.disc.sysml4modelica.profile.other.ModelicaSimulation;
import edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.Sysml4modelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.impl.Sysml4modelicaPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl;

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
public class OtherPackageImpl extends EPackageImpl implements OtherPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaSimulationEClass = null;

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OtherPackageImpl() {
		super(eNS_URI, OtherFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OtherPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OtherPackage init() {
		if (isInited) return (OtherPackage)EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI);

		// Obtain or create and register package
		OtherPackageImpl theOtherPackage = (OtherPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OtherPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OtherPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Sysml4modelicaPackageImpl theSysml4modelicaPackage = (Sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) instanceof Sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) : Sysml4modelicaPackage.eINSTANCE);
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) : ComponentsPackage.eINSTANCE);
		EquationsandalgorithmsPackageImpl theEquationsandalgorithmsPackage = (EquationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) instanceof EquationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) : EquationsandalgorithmsPackage.eINSTANCE);

		// Create package meta-data objects
		theOtherPackage.createPackageContents();
		theSysml4modelicaPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theEquationsandalgorithmsPackage.createPackageContents();

		// Initialize created meta-data
		theOtherPackage.initializePackageContents();
		theSysml4modelicaPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theEquationsandalgorithmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOtherPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OtherPackage.eNS_URI, theOtherPackage);
		return theOtherPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaAnnotation() {
		return modelicaAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaAnnotation_Base_Comment() {
		return (EReference)modelicaAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaSimulation() {
		return modelicaSimulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherFactory getOtherFactory() {
		return (OtherFactory)getEFactoryInstance();
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
		modelicaAnnotationEClass = createEClass(MODELICA_ANNOTATION);
		createEReference(modelicaAnnotationEClass, MODELICA_ANNOTATION__BASE_COMMENT);

		modelicaSimulationEClass = createEClass(MODELICA_SIMULATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelicaAnnotationEClass, ModelicaAnnotation.class, "ModelicaAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaAnnotation_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 1, 1, ModelicaAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelicaSimulationEClass, ModelicaSimulation.class, "ModelicaSimulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //OtherPackageImpl
