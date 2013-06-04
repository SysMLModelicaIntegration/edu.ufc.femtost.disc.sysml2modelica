/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comté
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comté - initial API and implementation
 *******************************************************************************/
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
public class typesFactoryImpl extends EFactoryImpl implements typesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typesFactory init() {
		try {
			typesFactory thetypesFactory = (typesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.femto-st.fr/disc/SysML4Modelica/Types"); 
			if (thetypesFactory != null) {
				return thetypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new typesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typesFactoryImpl() {
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
			case typesPackage.MODELICA_REAL: return createModelicaReal();
			case typesPackage.MODELICA_INTEGER: return createModelicaInteger();
			case typesPackage.MODELICA_BOOLEAN: return createModelicaBoolean();
			case typesPackage.MODELICA_STRING: return createModelicaString();
			case typesPackage.MODELICA_EXTERNAL_OBJECT: return createModelicaExternalObject();
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
			case typesPackage.MODELICA_FLOW_FLAG_KIND:
				return createModelicaFlowFlagKindFromString(eDataType, initialValue);
			case typesPackage.MODELICA_CAUSALITY_KIND:
				return createModelicaCausalityKindFromString(eDataType, initialValue);
			case typesPackage.MODELICA_VARIABILITY_KIND:
				return createModelicaVariabilityKindFromString(eDataType, initialValue);
			case typesPackage.MODELICA_STATE_SELECT:
				return createModelicaStateSelectFromString(eDataType, initialValue);
			case typesPackage.MODELICA_SCOPE_KIND:
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
			case typesPackage.MODELICA_FLOW_FLAG_KIND:
				return convertModelicaFlowFlagKindToString(eDataType, instanceValue);
			case typesPackage.MODELICA_CAUSALITY_KIND:
				return convertModelicaCausalityKindToString(eDataType, instanceValue);
			case typesPackage.MODELICA_VARIABILITY_KIND:
				return convertModelicaVariabilityKindToString(eDataType, instanceValue);
			case typesPackage.MODELICA_STATE_SELECT:
				return convertModelicaStateSelectToString(eDataType, instanceValue);
			case typesPackage.MODELICA_SCOPE_KIND:
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
	public ModelicaBoolean createModelicaBoolean() {
		ModelicaBooleanImpl modelicaBoolean = new ModelicaBooleanImpl();
		return modelicaBoolean;
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
	public typesPackage gettypesPackage() {
		return (typesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static typesPackage getPackage() {
		return typesPackage.eINSTANCE;
	}

} //typesFactoryImpl
