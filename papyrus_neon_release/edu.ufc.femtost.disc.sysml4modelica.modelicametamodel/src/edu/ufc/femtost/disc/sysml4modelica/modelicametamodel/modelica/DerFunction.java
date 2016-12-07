/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Der Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction#getDer <em>Der</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getDerFunction()
 * @model
 * @generated
 */
public interface DerFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Der</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Der</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Der</em>' reference.
	 * @see #setDer(Function)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getDerFunction_Der()
	 * @model
	 * @generated
	 */
	Function getDer();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction#getDer <em>Der</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Der</em>' reference.
	 * @see #getDer()
	 * @generated
	 */
	void setDer(Function value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getDerFunction_Variable()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getVariable();

} // DerFunction
