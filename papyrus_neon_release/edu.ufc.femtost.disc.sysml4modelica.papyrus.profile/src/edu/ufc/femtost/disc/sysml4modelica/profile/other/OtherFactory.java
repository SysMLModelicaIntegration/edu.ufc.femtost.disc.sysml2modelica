/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.other;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherPackage
 * @generated
 */
public interface OtherFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OtherFactory eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.other.impl.OtherFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelica Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Annotation</em>'.
	 * @generated
	 */
	ModelicaAnnotation createModelicaAnnotation();

	/**
	 * Returns a new object of class '<em>Modelica Simulation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Simulation</em>'.
	 * @generated
	 */
	ModelicaSimulation createModelicaSimulation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OtherPackage getOtherPackage();

} //OtherFactory
