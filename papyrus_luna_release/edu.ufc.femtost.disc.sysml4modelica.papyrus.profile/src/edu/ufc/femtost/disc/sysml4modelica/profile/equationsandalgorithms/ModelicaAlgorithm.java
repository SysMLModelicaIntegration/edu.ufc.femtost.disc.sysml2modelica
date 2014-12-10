/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#isInitial <em>Is Initial</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#getBase_Behavior <em>Base Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage#getModelicaAlgorithm()
 * @model
 * @generated
 */
public interface ModelicaAlgorithm extends EObject {
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
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage#getModelicaAlgorithm_IsInitial()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInitial();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#isInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavior</em>' reference.
	 * @see #setBase_Behavior(Behavior)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage#getModelicaAlgorithm_Base_Behavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getBase_Behavior();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm#getBase_Behavior <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavior</em>' reference.
	 * @see #getBase_Behavior()
	 * @generated
	 */
	void setBase_Behavior(Behavior value);

} // ModelicaAlgorithm
