/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage
 * @generated
 */
public interface ClassesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassesFactory eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ClassesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelica Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Class</em>'.
	 * @generated
	 */
	ModelicaClass createModelicaClass();

	/**
	 * Returns a new object of class '<em>Modelica Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Model</em>'.
	 * @generated
	 */
	ModelicaModel createModelicaModel();

	/**
	 * Returns a new object of class '<em>Modelica Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Block</em>'.
	 * @generated
	 */
	ModelicaBlock createModelicaBlock();

	/**
	 * Returns a new object of class '<em>Modelica Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Record</em>'.
	 * @generated
	 */
	ModelicaRecord createModelicaRecord();

	/**
	 * Returns a new object of class '<em>Modelica Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Operator</em>'.
	 * @generated
	 */
	ModelicaOperator createModelicaOperator();

	/**
	 * Returns a new object of class '<em>Modelica Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Connector</em>'.
	 * @generated
	 */
	ModelicaConnector createModelicaConnector();

	/**
	 * Returns a new object of class '<em>Modelica Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Package</em>'.
	 * @generated
	 */
	ModelicaPackage createModelicaPackage();

	/**
	 * Returns a new object of class '<em>Modelica Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Type</em>'.
	 * @generated
	 */
	ModelicaType createModelicaType();

	/**
	 * Returns a new object of class '<em>Modelica Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Function</em>'.
	 * @generated
	 */
	ModelicaFunction createModelicaFunction();

	/**
	 * Returns a new object of class '<em>Modelica Extends</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Extends</em>'.
	 * @generated
	 */
	ModelicaExtends createModelicaExtends();

	/**
	 * Returns a new object of class '<em>Modelica Constrained By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Constrained By</em>'.
	 * @generated
	 */
	ModelicaConstrainedBy createModelicaConstrainedBy();

	/**
	 * Returns a new object of class '<em>Modelica Der</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Der</em>'.
	 * @generated
	 */
	ModelicaDer createModelicaDer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClassesPackage getClassesPackage();

} //ClassesFactory
