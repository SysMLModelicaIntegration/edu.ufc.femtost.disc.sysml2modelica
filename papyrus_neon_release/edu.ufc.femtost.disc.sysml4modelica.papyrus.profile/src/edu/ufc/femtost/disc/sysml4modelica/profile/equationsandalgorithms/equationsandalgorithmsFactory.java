/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage
 * @generated
 */
public interface equationsandalgorithmsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	equationsandalgorithmsFactory eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.equationsandalgorithmsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelica Equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Equation</em>'.
	 * @generated
	 */
	ModelicaEquation createModelicaEquation();

	/**
	 * Returns a new object of class '<em>Modelica Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Algorithm</em>'.
	 * @generated
	 */
	ModelicaAlgorithm createModelicaAlgorithm();

	/**
	 * Returns a new object of class '<em>Modelica Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Connection</em>'.
	 * @generated
	 */
	ModelicaConnection createModelicaConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	equationsandalgorithmsPackage getequationsandalgorithmsPackage();

} //equationsandalgorithmsFactory
