/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm#getBody <em>Body</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm#getAlgorithmsection <em>Algorithmsection</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getAlgorithm_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Algorithmsection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithmsection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithmsection</em>' container reference.
	 * @see #setAlgorithmsection(AlgorithmSection)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getAlgorithm_Algorithmsection()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getAlgorithm
	 * @model opposite="algorithm" transient="false"
	 * @generated
	 */
	AlgorithmSection getAlgorithmsection();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm#getAlgorithmsection <em>Algorithmsection</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithmsection</em>' container reference.
	 * @see #getAlgorithmsection()
	 * @generated
	 */
	void setAlgorithmsection(AlgorithmSection value);

} // Algorithm
