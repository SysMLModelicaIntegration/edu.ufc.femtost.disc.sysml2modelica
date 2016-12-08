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
/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getDeclarationEquation <em>Declaration Equation</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getVariability <em>Variability</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getArraySize <em>Array Size</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter()
 * @model
 * @generated
 */
public interface ModelicaFunctionParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Parameter</em>' reference.
	 * @see #setBase_Parameter(Parameter)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_Base_Parameter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter getBase_Parameter();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getBase_Parameter <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter</em>' reference.
	 * @see #getBase_Parameter()
	 * @generated
	 */
	void setBase_Parameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Declaration Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration Equation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration Equation</em>' attribute.
	 * @see #setDeclarationEquation(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_DeclarationEquation()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDeclarationEquation();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getDeclarationEquation <em>Declaration Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Equation</em>' attribute.
	 * @see #getDeclarationEquation()
	 * @generated
	 */
	void setDeclarationEquation(String value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_IsReplaceable()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReplaceable();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isReplaceable <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaceable</em>' attribute.
	 * @see #isReplaceable()
	 * @generated
	 */
	void setIsReplaceable(boolean value);

	/**
	 * Returns the value of the '<em><b>Variability</b></em>' attribute.
	 * The default value is <code>"continuous"</code>.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variability</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
	 * @see #setVariability(ModelicaVariabilityKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_Variability()
	 * @model default="continuous" required="true" ordered="false"
	 * @generated
	 */
	ModelicaVariabilityKind getVariability();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
	 * @see #getVariability()
	 * @generated
	 */
	void setVariability(ModelicaVariabilityKind value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' attribute.
	 * The default value is <code>"input"</code>.
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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_Causality()
	 * @model default="input" required="true" ordered="false"
	 * @generated
	 */
	ModelicaCausalityKind getCausality();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(ModelicaCausalityKind value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_IsFinal()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Modification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification</em>' attribute list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_Modification()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getModification();

	/**
	 * Returns the value of the '<em><b>Array Size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Size</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Size</em>' attribute list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage#getModelicaFunctionParameter_ArraySize()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	EList<String> getArraySize();

} // ModelicaFunctionParameter
