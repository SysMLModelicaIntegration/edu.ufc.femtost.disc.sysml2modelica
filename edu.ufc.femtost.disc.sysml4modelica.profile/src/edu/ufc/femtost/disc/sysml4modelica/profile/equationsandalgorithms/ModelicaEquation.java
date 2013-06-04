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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#isInitial <em>Is Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage#getModelicaEquation()
 * @model
 * @generated
 */
public interface ModelicaEquation extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage#getModelicaEquation_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage#getModelicaEquation_IsInitial()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation#isInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

} // ModelicaEquation
