/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getAlgorithm <em>Algorithm</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getAlgorithmSection()
 * @model
 * @generated
 */
public interface AlgorithmSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAlgorithmSections <em>Algorithm Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Modelica Class Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Modelica Class Definition</em>' container reference.
	 * @see #setOwnerModelicaClassDefinition(ModelicaClassDefinition)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getAlgorithmSection_OwnerModelicaClassDefinition()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAlgorithmSections
	 * @model opposite="algorithmSections" required="true" transient="false"
	 * @generated
	 */
	ModelicaClassDefinition getOwnerModelicaClassDefinition();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Modelica Class Definition</em>' container reference.
	 * @see #getOwnerModelicaClassDefinition()
	 * @generated
	 */
	void setOwnerModelicaClassDefinition(ModelicaClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm#getAlgorithmsection <em>Algorithmsection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getAlgorithmSection_Algorithm()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm#getAlgorithmsection
	 * @model opposite="algorithmsection" containment="true"
	 * @generated
	 */
	EList<Algorithm> getAlgorithm();

} // AlgorithmSection
