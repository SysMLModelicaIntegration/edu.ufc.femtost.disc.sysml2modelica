/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained By Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getOwnerInstance <em>Owner Instance</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getInstanceForConstrainedBy <em>Instance For Constrained By</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConstrainedByClause()
 * @model
 * @generated
 */
public interface ConstrainedByClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification</em>' attribute.
	 * @see #setModification(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConstrainedByClause_Modification()
	 * @model
	 * @generated
	 */
	String getModification();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getModification <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification</em>' attribute.
	 * @see #getModification()
	 * @generated
	 */
	void setModification(String value);

	/**
	 * Returns the value of the '<em><b>Owner Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Instance</em>' container reference.
	 * @see #setOwnerInstance(ModelicaPart)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConstrainedByClause_OwnerInstance()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getConstrainedBy
	 * @model opposite="constrainedBy" transient="false"
	 * @generated
	 */
	ModelicaPart getOwnerInstance();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getOwnerInstance <em>Owner Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Instance</em>' container reference.
	 * @see #getOwnerInstance()
	 * @generated
	 */
	void setOwnerInstance(ModelicaPart value);

	/**
	 * Returns the value of the '<em><b>Instance For Constrained By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance For Constrained By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance For Constrained By</em>' reference.
	 * @see #setInstanceForConstrainedBy(ModelicaPart)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConstrainedByClause_InstanceForConstrainedBy()
	 * @model
	 * @generated
	 */
	ModelicaPart getInstanceForConstrainedBy();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getInstanceForConstrainedBy <em>Instance For Constrained By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance For Constrained By</em>' reference.
	 * @see #getInstanceForConstrainedBy()
	 * @generated
	 */
	void setInstanceForConstrainedBy(ModelicaPart value);

} // ConstrainedByClause
