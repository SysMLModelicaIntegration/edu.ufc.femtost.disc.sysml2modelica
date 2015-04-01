/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage
 * @generated
 */
public interface ComponentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsFactory eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelica Value Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Value Property</em>'.
	 * @generated
	 */
	ModelicaValueProperty createModelicaValueProperty();

	/**
	 * Returns a new object of class '<em>Modelica Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Part</em>'.
	 * @generated
	 */
	ModelicaPart createModelicaPart();

	/**
	 * Returns a new object of class '<em>Modelica Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Port</em>'.
	 * @generated
	 */
	ModelicaPort createModelicaPort();

	/**
	 * Returns a new object of class '<em>Modelica Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Function Parameter</em>'.
	 * @generated
	 */
	ModelicaFunctionParameter createModelicaFunctionParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentsPackage getComponentsPackage();

} //ComponentsFactory
