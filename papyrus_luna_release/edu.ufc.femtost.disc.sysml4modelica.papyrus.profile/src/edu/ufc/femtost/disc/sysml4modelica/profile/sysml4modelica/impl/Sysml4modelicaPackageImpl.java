/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ClassesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.EquationsandalgorithmsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.Sysml4modelicaFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.Sysml4modelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml.SysmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sysml4modelicaPackageImpl extends EPackageImpl implements Sysml4modelicaPackage {
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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.Sysml4modelicaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Sysml4modelicaPackageImpl() {
		super(eNS_URI, Sysml4modelicaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Sysml4modelicaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Sysml4modelicaPackage init() {
		if (isInited) return (Sysml4modelicaPackage)EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI);

		// Obtain or create and register package
		Sysml4modelicaPackageImpl theSysml4modelicaPackage = (Sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Sysml4modelicaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) : ComponentsPackage.eINSTANCE);
		EquationsandalgorithmsPackageImpl theEquationsandalgorithmsPackage = (EquationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) instanceof EquationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) : EquationsandalgorithmsPackage.eINSTANCE);
		OtherPackageImpl theOtherPackage = (OtherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) instanceof OtherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) : OtherPackage.eINSTANCE);

		// Create package meta-data objects
		theSysml4modelicaPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theEquationsandalgorithmsPackage.createPackageContents();
		theOtherPackage.createPackageContents();

		// Initialize created meta-data
		theSysml4modelicaPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theEquationsandalgorithmsPackage.initializePackageContents();
		theOtherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSysml4modelicaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Sysml4modelicaPackage.eNS_URI, theSysml4modelicaPackage);
		return theSysml4modelicaPackage;
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
	public Sysml4modelicaFactory getSysml4modelicaFactory() {
		return (Sysml4modelicaFactory)getEFactoryInstance();
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
		ClassesPackage theClassesPackage = (ClassesPackage)EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		EquationsandalgorithmsPackage theEquationsandalgorithmsPackage = (EquationsandalgorithmsPackage)EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI);
		OtherPackage theOtherPackage = (OtherPackage)EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theClassesPackage);
		getESubpackages().add(theTypesPackage);
		getESubpackages().add(theComponentsPackage);
		getESubpackages().add(theEquationsandalgorithmsPackage);
		getESubpackages().add(theOtherPackage);

		// Initialize data types
		initEDataType(dummyEDataType, String.class, "Dummy", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Sysml4modelicaPackageImpl
