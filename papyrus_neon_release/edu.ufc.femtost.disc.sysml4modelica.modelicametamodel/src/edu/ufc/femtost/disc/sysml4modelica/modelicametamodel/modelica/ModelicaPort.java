/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getType_connector <em>Type connector</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getCausality <em>Causality</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPort()
 * @model
 * @generated
 */
public interface ModelicaPort extends ModelicaComponent {
	/**
	 * Returns the value of the '<em><b>Type connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type connector</em>' reference.
	 * @see #setType_connector(Connector)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPort_Type_connector()
	 * @model
	 * @generated
	 */
	Connector getType_connector();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getType_connector <em>Type connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type connector</em>' reference.
	 * @see #getType_connector()
	 * @generated
	 */
	void setType_connector(Connector value);

	/**
	 * Returns the value of the '<em><b>Causality</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causality</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind
	 * @see #setCausality(ModelicaCausalityKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPort_Causality()
	 * @model required="true"
	 * @generated
	 */
	ModelicaCausalityKind getCausality();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getCausality <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causality</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind
	 * @see #getCausality()
	 * @generated
	 */
	void setCausality(ModelicaCausalityKind value);

} // ModelicaPort
