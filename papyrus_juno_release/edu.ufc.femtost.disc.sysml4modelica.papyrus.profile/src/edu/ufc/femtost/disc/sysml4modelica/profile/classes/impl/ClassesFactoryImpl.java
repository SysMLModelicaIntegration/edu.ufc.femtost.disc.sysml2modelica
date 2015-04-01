/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.*;

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
public class ClassesFactoryImpl extends EFactoryImpl implements ClassesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassesFactory init() {
		try {
			ClassesFactory theClassesFactory = (ClassesFactory)EPackage.Registry.INSTANCE.getEFactory(ClassesPackage.eNS_URI);
			if (theClassesFactory != null) {
				return theClassesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesFactoryImpl() {
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
			case ClassesPackage.MODELICA_CLASS: return createModelicaClass();
			case ClassesPackage.MODELICA_MODEL: return createModelicaModel();
			case ClassesPackage.MODELICA_BLOCK: return createModelicaBlock();
			case ClassesPackage.MODELICA_RECORD: return createModelicaRecord();
			case ClassesPackage.MODELICA_OPERATOR: return createModelicaOperator();
			case ClassesPackage.MODELICA_CONNECTOR: return createModelicaConnector();
			case ClassesPackage.MODELICA_PACKAGE: return createModelicaPackage();
			case ClassesPackage.MODELICA_TYPE: return createModelicaType();
			case ClassesPackage.MODELICA_FUNCTION: return createModelicaFunction();
			case ClassesPackage.MODELICA_EXTENDS: return createModelicaExtends();
			case ClassesPackage.MODELICA_CONSTRAINED_BY: return createModelicaConstrainedBy();
			case ClassesPackage.MODELICA_DER: return createModelicaDer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClass createModelicaClass() {
		ModelicaClassImpl modelicaClass = new ModelicaClassImpl();
		return modelicaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaModel createModelicaModel() {
		ModelicaModelImpl modelicaModel = new ModelicaModelImpl();
		return modelicaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaBlock createModelicaBlock() {
		ModelicaBlockImpl modelicaBlock = new ModelicaBlockImpl();
		return modelicaBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaRecord createModelicaRecord() {
		ModelicaRecordImpl modelicaRecord = new ModelicaRecordImpl();
		return modelicaRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaOperator createModelicaOperator() {
		ModelicaOperatorImpl modelicaOperator = new ModelicaOperatorImpl();
		return modelicaOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaConnector createModelicaConnector() {
		ModelicaConnectorImpl modelicaConnector = new ModelicaConnectorImpl();
		return modelicaConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPackage createModelicaPackage() {
		ModelicaPackageImpl modelicaPackage = new ModelicaPackageImpl();
		return modelicaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaType createModelicaType() {
		ModelicaTypeImpl modelicaType = new ModelicaTypeImpl();
		return modelicaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFunction createModelicaFunction() {
		ModelicaFunctionImpl modelicaFunction = new ModelicaFunctionImpl();
		return modelicaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaExtends createModelicaExtends() {
		ModelicaExtendsImpl modelicaExtends = new ModelicaExtendsImpl();
		return modelicaExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaConstrainedBy createModelicaConstrainedBy() {
		ModelicaConstrainedByImpl modelicaConstrainedBy = new ModelicaConstrainedByImpl();
		return modelicaConstrainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaDer createModelicaDer() {
		ModelicaDerImpl modelicaDer = new ModelicaDerImpl();
		return modelicaDer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesPackage getClassesPackage() {
		return (ClassesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassesPackage getPackage() {
		return ClassesPackage.eINSTANCE;
	}

} //ClassesFactoryImpl
