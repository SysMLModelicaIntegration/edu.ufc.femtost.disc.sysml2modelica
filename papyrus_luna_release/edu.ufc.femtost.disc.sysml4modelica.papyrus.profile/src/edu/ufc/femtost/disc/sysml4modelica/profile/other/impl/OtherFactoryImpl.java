/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.other.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.*;

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
public class OtherFactoryImpl extends EFactoryImpl implements OtherFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OtherFactory init() {
		try {
			OtherFactory theOtherFactory = (OtherFactory)EPackage.Registry.INSTANCE.getEFactory(OtherPackage.eNS_URI);
			if (theOtherFactory != null) {
				return theOtherFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OtherFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherFactoryImpl() {
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
			case OtherPackage.MODELICA_ANNOTATION: return createModelicaAnnotation();
			case OtherPackage.MODELICA_SIMULATION: return createModelicaSimulation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaAnnotation createModelicaAnnotation() {
		ModelicaAnnotationImpl modelicaAnnotation = new ModelicaAnnotationImpl();
		return modelicaAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaSimulation createModelicaSimulation() {
		ModelicaSimulationImpl modelicaSimulation = new ModelicaSimulationImpl();
		return modelicaSimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPackage getOtherPackage() {
		return (OtherPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OtherPackage getPackage() {
		return OtherPackage.eINSTANCE;
	}

} //OtherFactoryImpl
