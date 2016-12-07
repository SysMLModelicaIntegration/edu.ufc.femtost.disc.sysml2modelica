/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getOwnerEquationSection <em>Owner Equation Section</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFrom <em>From</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getTo <em>To</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromModelicaPart <em>From Modelica Part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToModelicaPart <em>To Modelica Part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPort <em>From Port</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPort <em>To Port</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPart <em>From Part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPart <em>To Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect()
 * @model
 * @generated
 */
public interface Connect extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner Equation Section</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Equation Section</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Equation Section</em>' container reference.
	 * @see #setOwnerEquationSection(EquationSection)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_OwnerEquationSection()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getConnects
	 * @model opposite="connects" transient="false"
	 * @generated
	 */
	EquationSection getOwnerEquationSection();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getOwnerEquationSection <em>Owner Equation Section</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Equation Section</em>' container reference.
	 * @see #getOwnerEquationSection()
	 * @generated
	 */
	void setOwnerEquationSection(EquationSection value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ModelicaPort)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_From()
	 * @model required="true"
	 * @generated
	 */
	ModelicaPort getFrom();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ModelicaPort value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(ModelicaPort)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_To()
	 * @model required="true"
	 * @generated
	 */
	ModelicaPort getTo();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(ModelicaPort value);

	/**
	 * Returns the value of the '<em><b>From Modelica Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Modelica Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Modelica Part</em>' reference.
	 * @see #setFromModelicaPart(ModelicaPart)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_FromModelicaPart()
	 * @model required="true"
	 * @generated
	 */
	ModelicaPart getFromModelicaPart();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromModelicaPart <em>From Modelica Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Modelica Part</em>' reference.
	 * @see #getFromModelicaPart()
	 * @generated
	 */
	void setFromModelicaPart(ModelicaPart value);

	/**
	 * Returns the value of the '<em><b>To Modelica Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Modelica Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Modelica Part</em>' reference.
	 * @see #setToModelicaPart(ModelicaPart)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_ToModelicaPart()
	 * @model required="true"
	 * @generated
	 */
	ModelicaPart getToModelicaPart();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToModelicaPart <em>To Modelica Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Modelica Part</em>' reference.
	 * @see #getToModelicaPart()
	 * @generated
	 */
	void setToModelicaPart(ModelicaPart value);

	/**
	 * Returns the value of the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Port</em>' attribute.
	 * @see #setFromPort(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_FromPort()
	 * @model
	 * @generated
	 */
	String getFromPort();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPort <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' attribute.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(String value);

	/**
	 * Returns the value of the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Port</em>' attribute.
	 * @see #setToPort(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_ToPort()
	 * @model
	 * @generated
	 */
	String getToPort();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPort <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' attribute.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(String value);

	/**
	 * Returns the value of the '<em><b>From Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Part</em>' attribute.
	 * @see #setFromPart(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_FromPart()
	 * @model
	 * @generated
	 */
	String getFromPart();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPart <em>From Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Part</em>' attribute.
	 * @see #getFromPart()
	 * @generated
	 */
	void setFromPart(String value);

	/**
	 * Returns the value of the '<em><b>To Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Part</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Part</em>' attribute.
	 * @see #setToPart(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getConnect_ToPart()
	 * @model
	 * @generated
	 */
	String getToPart();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPart <em>To Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Part</em>' attribute.
	 * @see #getToPart()
	 * @generated
	 */
	void setToPart(String value);

} // Connect
