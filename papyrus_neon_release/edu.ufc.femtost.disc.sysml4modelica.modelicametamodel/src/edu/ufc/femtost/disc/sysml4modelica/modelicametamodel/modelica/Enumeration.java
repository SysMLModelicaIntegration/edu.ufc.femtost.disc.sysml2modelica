/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type {
	/**
	 * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getEnumeration_EnumerationLiterals()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getEnumerationLiterals();

} // Enumeration
