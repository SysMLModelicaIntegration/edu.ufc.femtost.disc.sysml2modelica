/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equation Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getEquations <em>Equations</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getEquationSection()
 * @model
 * @generated
 */
public interface EquationSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getEquationSection <em>Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Modelica Class Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Modelica Class Definition</em>' container reference.
	 * @see #setOwnerModelicaClassDefinition(ModelicaClassDefinition)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getEquationSection_OwnerModelicaClassDefinition()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getEquationSection
	 * @model opposite="equationSection" required="true" transient="false"
	 * @generated
	 */
	ModelicaClassDefinition getOwnerModelicaClassDefinition();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Modelica Class Definition</em>' container reference.
	 * @see #getOwnerModelicaClassDefinition()
	 * @generated
	 */
	void setOwnerModelicaClassDefinition(ModelicaClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Equations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#getOwnerEquationSection <em>Owner Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equations</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getEquationSection_Equations()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#getOwnerEquationSection
	 * @model opposite="ownerEquationSection" containment="true"
	 * @generated
	 */
	EList<Equation> getEquations();

	/**
	 * Returns the value of the '<em><b>Connects</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getOwnerEquationSection <em>Owner Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getEquationSection_Connects()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getOwnerEquationSection
	 * @model opposite="ownerEquationSection" containment="true"
	 * @generated
	 */
	EList<Connect> getConnects();

} // EquationSection
