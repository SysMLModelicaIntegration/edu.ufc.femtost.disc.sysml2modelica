/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EquationsandalgorithmsFactoryImpl extends EFactoryImpl implements EquationsandalgorithmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EquationsandalgorithmsFactory init() {
		try {
			EquationsandalgorithmsFactory theEquationsandalgorithmsFactory = (EquationsandalgorithmsFactory)EPackage.Registry.INSTANCE.getEFactory(EquationsandalgorithmsPackage.eNS_URI);
			if (theEquationsandalgorithmsFactory != null) {
				return theEquationsandalgorithmsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EquationsandalgorithmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationsandalgorithmsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EquationsandalgorithmsPackage.MODELICA_EQUATION: return createModelicaEquation();
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM: return createModelicaAlgorithm();
			case EquationsandalgorithmsPackage.MODELICA_CONNECTION: return createModelicaConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaEquation createModelicaEquation() {
		ModelicaEquationImpl modelicaEquation = new ModelicaEquationImpl();
		return modelicaEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaAlgorithm createModelicaAlgorithm() {
		ModelicaAlgorithmImpl modelicaAlgorithm = new ModelicaAlgorithmImpl();
		return modelicaAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaConnection createModelicaConnection() {
		ModelicaConnectionImpl modelicaConnection = new ModelicaConnectionImpl();
		return modelicaConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationsandalgorithmsPackage getEquationsandalgorithmsPackage() {
		return (EquationsandalgorithmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EquationsandalgorithmsPackage getPackage() {
		return EquationsandalgorithmsPackage.eINSTANCE;
	}

} //EquationsandalgorithmsFactoryImpl
