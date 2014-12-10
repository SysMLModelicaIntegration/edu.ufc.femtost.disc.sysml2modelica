/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.types;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.femto-st.fr/disc/SysML4Modelica/Types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind <em>Modelica Flow Flag Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaFlowFlagKind()
	 * @generated
	 */
	int MODELICA_FLOW_FLAG_KIND = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind <em>Modelica Causality Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaCausalityKind()
	 * @generated
	 */
	int MODELICA_CAUSALITY_KIND = 1;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind <em>Modelica Variability Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaVariabilityKind()
	 * @generated
	 */
	int MODELICA_VARIABILITY_KIND = 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect <em>Modelica State Select</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaStateSelect()
	 * @generated
	 */
	int MODELICA_STATE_SELECT = 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind <em>Modelica Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaScopeKind()
	 * @generated
	 */
	int MODELICA_SCOPE_KIND = 4;


	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind <em>Modelica Flow Flag Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modelica Flow Flag Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind
	 * @generated
	 */
	EEnum getModelicaFlowFlagKind();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind <em>Modelica Causality Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modelica Causality Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
	 * @generated
	 */
	EEnum getModelicaCausalityKind();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind <em>Modelica Variability Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modelica Variability Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
	 * @generated
	 */
	EEnum getModelicaVariabilityKind();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect <em>Modelica State Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modelica State Select</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect
	 * @generated
	 */
	EEnum getModelicaStateSelect();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind <em>Modelica Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modelica Scope Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @generated
	 */
	EEnum getModelicaScopeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind <em>Modelica Flow Flag Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaFlowFlagKind()
		 * @generated
		 */
		EEnum MODELICA_FLOW_FLAG_KIND = eINSTANCE.getModelicaFlowFlagKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind <em>Modelica Causality Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaCausalityKind()
		 * @generated
		 */
		EEnum MODELICA_CAUSALITY_KIND = eINSTANCE.getModelicaCausalityKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind <em>Modelica Variability Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaVariabilityKind()
		 * @generated
		 */
		EEnum MODELICA_VARIABILITY_KIND = eINSTANCE.getModelicaVariabilityKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect <em>Modelica State Select</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaStateSelect()
		 * @generated
		 */
		EEnum MODELICA_STATE_SELECT = eINSTANCE.getModelicaStateSelect();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind <em>Modelica Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesPackageImpl#getModelicaScopeKind()
		 * @generated
		 */
		EEnum MODELICA_SCOPE_KIND = eINSTANCE.getModelicaScopeKind();

	}

} //TypesPackage
