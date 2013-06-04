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
package edu.ufc.femtost.disc.sysml4modelica.profile.types;

import org.eclipse.emf.ecore.EClass;
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
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.typesFactory
 * @model kind="package"
 * @generated
 */
public interface typesPackage extends EPackage {
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
	typesPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaRealImpl <em>Modelica Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaRealImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaReal()
	 * @generated
	 */
	int MODELICA_REAL = 0;

	/**
	 * The number of structural features of the '<em>Modelica Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_REAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaIntegerImpl <em>Modelica Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaIntegerImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaInteger()
	 * @generated
	 */
	int MODELICA_INTEGER = 1;

	/**
	 * The number of structural features of the '<em>Modelica Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_INTEGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaBooleanImpl <em>Modelica Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaBooleanImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaBoolean()
	 * @generated
	 */
	int MODELICA_BOOLEAN = 2;

	/**
	 * The number of structural features of the '<em>Modelica Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BOOLEAN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaStringImpl <em>Modelica String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaStringImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaString()
	 * @generated
	 */
	int MODELICA_STRING = 3;

	/**
	 * The number of structural features of the '<em>Modelica String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_STRING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaExternalObjectImpl <em>Modelica External Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaExternalObjectImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaExternalObject()
	 * @generated
	 */
	int MODELICA_EXTERNAL_OBJECT = 4;

	/**
	 * The number of structural features of the '<em>Modelica External Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EXTERNAL_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind <em>Modelica Flow Flag Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaFlowFlagKind()
	 * @generated
	 */
	int MODELICA_FLOW_FLAG_KIND = 5;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind <em>Modelica Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaScopeKind()
	 * @generated
	 */
	int MODELICA_SCOPE_KIND = 9;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind <em>Modelica Causality Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaCausalityKind()
	 * @generated
	 */
	int MODELICA_CAUSALITY_KIND = 6;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind <em>Modelica Variability Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaVariabilityKind()
	 * @generated
	 */
	int MODELICA_VARIABILITY_KIND = 7;


	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect <em>Modelica State Select</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaStateSelect()
	 * @generated
	 */
	int MODELICA_STATE_SELECT = 8;


	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaReal <em>Modelica Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Real</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaReal
	 * @generated
	 */
	EClass getModelicaReal();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaInteger <em>Modelica Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Integer</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaInteger
	 * @generated
	 */
	EClass getModelicaInteger();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaBoolean <em>Modelica Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Boolean</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaBoolean
	 * @generated
	 */
	EClass getModelicaBoolean();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaString <em>Modelica String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica String</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaString
	 * @generated
	 */
	EClass getModelicaString();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaExternalObject <em>Modelica External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica External Object</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaExternalObject
	 * @generated
	 */
	EClass getModelicaExternalObject();

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
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind <em>Modelica Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modelica Scope Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @generated
	 */
	EEnum getModelicaScopeKind();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	typesFactory gettypesFactory();

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
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaRealImpl <em>Modelica Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaRealImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaReal()
		 * @generated
		 */
		EClass MODELICA_REAL = eINSTANCE.getModelicaReal();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaIntegerImpl <em>Modelica Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaIntegerImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaInteger()
		 * @generated
		 */
		EClass MODELICA_INTEGER = eINSTANCE.getModelicaInteger();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaBooleanImpl <em>Modelica Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaBooleanImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaBoolean()
		 * @generated
		 */
		EClass MODELICA_BOOLEAN = eINSTANCE.getModelicaBoolean();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaStringImpl <em>Modelica String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaStringImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaString()
		 * @generated
		 */
		EClass MODELICA_STRING = eINSTANCE.getModelicaString();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaExternalObjectImpl <em>Modelica External Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.ModelicaExternalObjectImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaExternalObject()
		 * @generated
		 */
		EClass MODELICA_EXTERNAL_OBJECT = eINSTANCE.getModelicaExternalObject();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind <em>Modelica Flow Flag Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaFlowFlagKind()
		 * @generated
		 */
		EEnum MODELICA_FLOW_FLAG_KIND = eINSTANCE.getModelicaFlowFlagKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind <em>Modelica Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaScopeKind()
		 * @generated
		 */
		EEnum MODELICA_SCOPE_KIND = eINSTANCE.getModelicaScopeKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind <em>Modelica Causality Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaCausalityKind()
		 * @generated
		 */
		EEnum MODELICA_CAUSALITY_KIND = eINSTANCE.getModelicaCausalityKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind <em>Modelica Variability Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaVariabilityKind()
		 * @generated
		 */
		EEnum MODELICA_VARIABILITY_KIND = eINSTANCE.getModelicaVariabilityKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect <em>Modelica State Select</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaStateSelect
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.typesPackageImpl#getModelicaStateSelect()
		 * @generated
		 */
		EEnum MODELICA_STATE_SELECT = eINSTANCE.getModelicaStateSelect();

	}

} //typesPackage
