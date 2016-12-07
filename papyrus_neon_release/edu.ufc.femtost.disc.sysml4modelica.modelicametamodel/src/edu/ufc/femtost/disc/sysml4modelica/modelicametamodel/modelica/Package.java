/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getWithinClause <em>Within Clause</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getModelicaClasses <em>Modelica Classes</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ModelicaClassDefinition {
	/**
	 * Returns the value of the '<em><b>Within Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Within Clause</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Within Clause</em>' attribute.
	 * @see #setWithinClause(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getPackage_WithinClause()
	 * @model
	 * @generated
	 */
	String getWithinClause();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getWithinClause <em>Within Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within Clause</em>' attribute.
	 * @see #getWithinClause()
	 * @generated
	 */
	void setWithinClause(String value);

	/**
	 * Returns the value of the '<em><b>Modelica Classes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerPackage <em>Owner Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelica Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelica Classes</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getPackage_ModelicaClasses()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerPackage
	 * @model opposite="ownerPackage" containment="true"
	 * @generated
	 */
	EList<ModelicaClassDefinition> getModelicaClasses();

} // Package
