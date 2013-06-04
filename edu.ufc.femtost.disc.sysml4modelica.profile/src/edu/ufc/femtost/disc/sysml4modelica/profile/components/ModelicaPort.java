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
package edu.ufc.femtost.disc.sysml4modelica.profile.components;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getArraySize <em>Array Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort()
 * @model
 * @generated
 */
public interface ModelicaPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort_Base_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causality</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
	 * @see #setCausality(ModelicaCausalityKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort_Causality()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	ModelicaCausalityKind getCausality();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(ModelicaCausalityKind value);

	/**
	 * Returns the value of the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Expression</em>' attribute.
	 * @see #setConditionalExpression(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort_ConditionalExpression()
	 * @model ordered="false"
	 * @generated
	 */
	String getConditionalExpression();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getConditionalExpression <em>Conditional Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Expression</em>' attribute.
	 * @see #getConditionalExpression()
	 * @generated
	 */
	void setConditionalExpression(String value);

	/**
	 * Returns the value of the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification</em>' attribute.
	 * @see #setModification(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort_Modification()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getModification();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getModification <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification</em>' attribute.
	 * @see #getModification()
	 * @generated
	 */
	void setModification(String value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort_IsFinal()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Replaceable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Replaceable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replaceable</em>' attribute.
	 * @see #setIsReplaceable(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort_IsReplaceable()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isReplaceable();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isReplaceable <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaceable</em>' attribute.
	 * @see #isReplaceable()
	 * @generated
	 */
	void setIsReplaceable(boolean value);

	/**
	 * Returns the value of the '<em><b>Array Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Size</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Size</em>' attribute.
	 * @see #setArraySize(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaPort_ArraySize()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getArraySize();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getArraySize <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Size</em>' attribute.
	 * @see #getArraySize()
	 * @generated
	 */
	void setArraySize(String value);

} // ModelicaPort
