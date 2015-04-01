/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes;

import org.eclipse.papyrus.sysml.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector#isExpandable <em>Is Expandable</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage#getModelicaConnector()
 * @model
 * @generated
 */
public interface ModelicaConnector extends ModelicaClassDefinition, Block {
	/**
	 * Returns the value of the '<em><b>Is Expandable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Expandable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Expandable</em>' attribute.
	 * @see #setIsExpandable(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage#getModelicaConnector_IsExpandable()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isExpandable();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector#isExpandable <em>Is Expandable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Expandable</em>' attribute.
	 * @see #isExpandable()
	 * @generated
	 */
	void setIsExpandable(boolean value);

} // ModelicaConnector
