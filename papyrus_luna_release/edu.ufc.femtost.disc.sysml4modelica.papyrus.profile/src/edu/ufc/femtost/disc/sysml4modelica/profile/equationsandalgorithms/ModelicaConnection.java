/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection#getBase_Connector <em>Base Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage#getModelicaConnection()
 * @model
 * @generated
 */
public interface ModelicaConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference.
	 * @see #setBase_Connector(Connector)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage#getModelicaConnection_Base_Connector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaConnection#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

} // ModelicaConnection
