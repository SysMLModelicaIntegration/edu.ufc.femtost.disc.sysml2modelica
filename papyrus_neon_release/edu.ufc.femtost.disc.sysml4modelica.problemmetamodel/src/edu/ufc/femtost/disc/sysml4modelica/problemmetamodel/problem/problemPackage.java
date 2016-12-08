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
package edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.problemFactory
 * @model kind="package"
 * @generated
 */
public interface problemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "problem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.femto-st.fr/disc/problem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Problem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	problemPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.problemPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.ProblemImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.problemPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__SEVERITY = 2;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.problemPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 1;


	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getLocation()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getDescription()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getSeverity()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Severity();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	problemFactory getproblemFactory();

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
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.ProblemImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.problemPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__LOCATION = eINSTANCE.getProblem_Location();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__DESCRIPTION = eINSTANCE.getProblem_Description();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__SEVERITY = eINSTANCE.getProblem_Severity();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity
		 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.impl.problemPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} //problemPackage
