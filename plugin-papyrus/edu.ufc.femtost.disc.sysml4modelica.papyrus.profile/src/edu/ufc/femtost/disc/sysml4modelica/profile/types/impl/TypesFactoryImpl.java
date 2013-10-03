/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.types.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TypesFactoryImpl extends EFactoryImpl implements TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypesFactory init() {
		try {
			TypesFactory theTypesFactory = (TypesFactory)EPackage.Registry.INSTANCE.getEFactory(TypesPackage.eNS_URI);
			if (theTypesFactory != null) {
				return theTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactoryImpl() {
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
			case TypesPackage.MODELICA_REAL: return createModelicaReal();
			case TypesPackage.MODELICA_INTEGER: return createModelicaInteger();
			case TypesPackage.MODELICA_STRING: return createModelicaString();
			case TypesPackage.MODELICA_BOOLEAN: return createModelicaBoolean();
			case TypesPackage.MODELICA_EXTERNAL_OBJECT: return createModelicaExternalObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.MODELICA_FLOW_FLAG_KIND:
				return createModelicaFlowFlagKindFromString(eDataType, initialValue);
			case TypesPackage.MODELICA_CAUSALITY_KIND:
				return createModelicaCausalityKindFromString(eDataType, initialValue);
			case TypesPackage.MODELICA_VARIABILITY_KIND:
				return createModelicaVariabilityKindFromString(eDataType, initialValue);
			case TypesPackage.MODELICA_STATE_SELECT:
				return createModelicaStateSelectFromString(eDataType, initialValue);
			case TypesPackage.MODELICA_SCOPE_KIND:
				return createModelicaScopeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TypesPackage.MODELICA_FLOW_FLAG_KIND:
				return convertModelicaFlowFlagKindToString(eDataType, instanceValue);
			case TypesPackage.MODELICA_CAUSALITY_KIND:
				return convertModelicaCausalityKindToString(eDataType, instanceValue);
			case TypesPackage.MODELICA_VARIABILITY_KIND:
				return convertModelicaVariabilityKindToString(eDataType, instanceValue);
			case TypesPackage.MODELICA_STATE_SELECT:
				return convertModelicaStateSelectToString(eDataType, instanceValue);
			case TypesPackage.MODELICA_SCOPE_KIND:
				return convertModelicaScopeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaReal createModelicaReal() {
		ModelicaRealImpl modelicaReal = new ModelicaRealImpl();
		return modelicaReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaInteger createModelicaInteger() {
		ModelicaIntegerImpl modelicaInteger = new ModelicaIntegerImpl();
		return modelicaInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaString createModelicaString() {
		ModelicaStringImpl modelicaString = new ModelicaStringImpl();
		return modelicaString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaBoolean createModelicaBoolean() {
		ModelicaBooleanImpl modelicaBoolean = new ModelicaBooleanImpl();
		return modelicaBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaExternalObject createModelicaExternalObject() {
		ModelicaExternalObjectImpl modelicaExternalObject = new ModelicaExternalObjectImpl();
		return modelicaExternalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFlowFlagKind createModelicaFlowFlagKindFromString(EDataType eDataType, String initialValue) {
		ModelicaFlowFlagKind result = ModelicaFlowFlagKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaFlowFlagKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaCausalityKind createModelicaCausalityKindFromString(EDataType eDataType, String initialValue) {
		ModelicaCausalityKind result = ModelicaCausalityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaCausalityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaVariabilityKind createModelicaVariabilityKindFromString(EDataType eDataType, String initialValue) {
		ModelicaVariabilityKind result = ModelicaVariabilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaVariabilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaStateSelect createModelicaStateSelectFromString(EDataType eDataType, String initialValue) {
		ModelicaStateSelect result = ModelicaStateSelect.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaStateSelectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaScopeKind createModelicaScopeKindFromString(EDataType eDataType, String initialValue) {
		ModelicaScopeKind result = ModelicaScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaScopeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesPackage getTypesPackage() {
		return (TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypesPackage getPackage() {
		return TypesPackage.eINSTANCE;
	}

} //TypesFactoryImpl
