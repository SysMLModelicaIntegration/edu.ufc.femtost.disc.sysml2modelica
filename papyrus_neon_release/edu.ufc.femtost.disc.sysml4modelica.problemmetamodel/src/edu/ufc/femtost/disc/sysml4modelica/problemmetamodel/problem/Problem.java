/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comte
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comte - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.problemPackage#getProblem()
 * @model
 * @generated
 */
public interface Problem extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.problemPackage#getProblem_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.problemPackage#getProblem_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity
	 * @see #setSeverity(Severity)
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.problemPackage#getProblem_Severity()
	 * @model required="true"
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Problem#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.problemmetamodel.problem.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

} // Problem
