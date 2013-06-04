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
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsFactory
 * @model kind="package"
 * @generated
 */
public interface equationsandalgorithmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "equationsandalgorithms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EquationsAndAlgorithms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	equationsandalgorithmsPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaEquationImpl <em>Modelica Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaEquationImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl#getModelicaEquation()
	 * @generated
	 */
	int MODELICA_EQUATION = 0;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EQUATION__BASE_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EQUATION__IS_INITIAL = 1;

	/**
	 * The number of structural features of the '<em>Modelica Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EQUATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaAlgorithmImpl <em>Modelica Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaAlgorithmImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl#getModelicaAlgorithm()
	 * @generated
	 */
	int MODELICA_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_ALGORITHM__BASE_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_ALGORITHM__IS_INITIAL = 1;

	/**
	 * The number of structural features of the '<em>Modelica Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_ALGORITHM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaConnectionImpl <em>Modelica Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaConnectionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl#getModelicaConnection()
	 * @generated
	 */
	int MODELICA_CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTION__BASE_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Modelica Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation <em>Modelica Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Equation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation
	 * @generated
	 */
	EClass getModelicaEquation();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#getBase_Constraint()
	 * @see #getModelicaEquation()
	 * @generated
	 */
	EReference getModelicaEquation_Base_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#isInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#isInitial()
	 * @see #getModelicaEquation()
	 * @generated
	 */
	EAttribute getModelicaEquation_IsInitial();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm <em>Modelica Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Algorithm</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm
	 * @generated
	 */
	EClass getModelicaAlgorithm();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#getBase_Behavior <em>Base Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavior</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#getBase_Behavior()
	 * @see #getModelicaAlgorithm()
	 * @generated
	 */
	EReference getModelicaAlgorithm_Base_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#isInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#isInitial()
	 * @see #getModelicaAlgorithm()
	 * @generated
	 */
	EAttribute getModelicaAlgorithm_IsInitial();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection <em>Modelica Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Connection</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection
	 * @generated
	 */
	EClass getModelicaConnection();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection#getBase_Connector()
	 * @see #getModelicaConnection()
	 * @generated
	 */
	EReference getModelicaConnection_Base_Connector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	equationsandalgorithmsFactory getequationsandalgorithmsFactory();

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
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaEquationImpl <em>Modelica Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaEquationImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl#getModelicaEquation()
		 * @generated
		 */
		EClass MODELICA_EQUATION = eINSTANCE.getModelicaEquation();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_EQUATION__BASE_CONSTRAINT = eINSTANCE.getModelicaEquation_Base_Constraint();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_EQUATION__IS_INITIAL = eINSTANCE.getModelicaEquation_IsInitial();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaAlgorithmImpl <em>Modelica Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaAlgorithmImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl#getModelicaAlgorithm()
		 * @generated
		 */
		EClass MODELICA_ALGORITHM = eINSTANCE.getModelicaAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Base Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_ALGORITHM__BASE_BEHAVIOR = eINSTANCE.getModelicaAlgorithm_Base_Behavior();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_ALGORITHM__IS_INITIAL = eINSTANCE.getModelicaAlgorithm_IsInitial();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaConnectionImpl <em>Modelica Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaConnectionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsPackageImpl#getModelicaConnection()
		 * @generated
		 */
		EClass MODELICA_CONNECTION = eINSTANCE.getModelicaConnection();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CONNECTION__BASE_CONNECTOR = eINSTANCE.getModelicaConnection_Base_Connector();

	}

} //equationsandalgorithmsPackage
