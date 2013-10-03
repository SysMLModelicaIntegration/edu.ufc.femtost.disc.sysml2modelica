/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelica Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Real</em>'.
	 * @generated
	 */
	ModelicaReal createModelicaReal();

	/**
	 * Returns a new object of class '<em>Modelica Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Integer</em>'.
	 * @generated
	 */
	ModelicaInteger createModelicaInteger();

	/**
	 * Returns a new object of class '<em>Modelica String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica String</em>'.
	 * @generated
	 */
	ModelicaString createModelicaString();

	/**
	 * Returns a new object of class '<em>Modelica Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Boolean</em>'.
	 * @generated
	 */
	ModelicaBoolean createModelicaBoolean();

	/**
	 * Returns a new object of class '<em>Modelica External Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica External Object</em>'.
	 * @generated
	 */
	ModelicaExternalObject createModelicaExternalObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
