/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getVariability <em>Variability</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getFlowFlag <em>Flow Flag</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getDeclarationEquation <em>Declaration Equation</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty()
 * @model
 * @generated
 */
public interface ModelicaValueProperty extends EObject {
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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_Causality()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	ModelicaCausalityKind getCausality();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(ModelicaCausalityKind value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_Variability()
	 * @model default="continuous" required="true" ordered="false"
	 * @generated
	 */
	ModelicaVariabilityKind getVariability();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getVariability <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variability</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind
	 * @see #getVariability()
	 * @generated
	 */
	void setVariability(ModelicaVariabilityKind value);

	/**
	 * Returns the value of the '<em><b>Flow Flag</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Flag</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind
	 * @see #setFlowFlag(ModelicaFlowFlagKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_FlowFlag()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	ModelicaFlowFlagKind getFlowFlag();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getFlowFlag <em>Flow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Flag</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind
	 * @see #getFlowFlag()
	 * @generated
	 */
	void setFlowFlag(ModelicaFlowFlagKind value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @see #setScope(ModelicaScopeKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_Scope()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	ModelicaScopeKind getScope();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ModelicaScopeKind value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_IsFinal()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_ConditionalExpression()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getConditionalExpression();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getConditionalExpression <em>Conditional Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Expression</em>' attribute.
	 * @see #getConditionalExpression()
	 * @generated
	 */
	void setConditionalExpression(String value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_Modification()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getModification();

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_IsReplaceable()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isReplaceable();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isReplaceable <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaceable</em>' attribute.
	 * @see #isReplaceable()
	 * @generated
	 */
	void setIsReplaceable(boolean value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_DeclarationEquation()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDeclarationEquation();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getDeclarationEquation <em>Declaration Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration Equation</em>' attribute.
	 * @see #getDeclarationEquation()
	 * @generated
	 */
	void setDeclarationEquation(String value);

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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_ArraySize()
	 * @model dataType="org.eclipse.uml2.types.String"
	 * @generated
	 */
	EList<String> getArraySize();

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage#getModelicaValueProperty_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // ModelicaValueProperty
