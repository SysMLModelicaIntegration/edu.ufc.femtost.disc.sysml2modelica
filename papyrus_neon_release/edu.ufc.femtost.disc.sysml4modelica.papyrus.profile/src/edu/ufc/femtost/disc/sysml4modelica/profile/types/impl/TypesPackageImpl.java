/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.types.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ClassesPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.EquationsandalgorithmsPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.Sysml4modelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.impl.Sysml4modelicaPackageImpl;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesFactory;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesPackage;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.sysml.SysmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaScopeKindEEnum = null;

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Sysml4modelicaPackageImpl theSysml4modelicaPackage = (Sysml4modelicaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) instanceof Sysml4modelicaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Sysml4modelicaPackage.eNS_URI) : Sysml4modelicaPackage.eINSTANCE);
		ClassesPackageImpl theClassesPackage = (ClassesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) instanceof ClassesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassesPackage.eNS_URI) : ClassesPackage.eINSTANCE);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) : ComponentsPackage.eINSTANCE);
		EquationsandalgorithmsPackageImpl theEquationsandalgorithmsPackage = (EquationsandalgorithmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) instanceof EquationsandalgorithmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EquationsandalgorithmsPackage.eNS_URI) : EquationsandalgorithmsPackage.eINSTANCE);
		OtherPackageImpl theOtherPackage = (OtherPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) instanceof OtherPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OtherPackage.eNS_URI) : OtherPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theSysml4modelicaPackage.createPackageContents();
		theClassesPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theEquationsandalgorithmsPackage.createPackageContents();
		theOtherPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theSysml4modelicaPackage.initializePackageContents();
		theClassesPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theEquationsandalgorithmsPackage.initializePackageContents();
		theOtherPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
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
	public EEnum getModelicaScopeKind() {
		return modelicaScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.INNER_OUTER);
	}

} //TypesPackageImpl
