/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comte
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comte - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.profile.components.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.*;

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
public class componentsFactoryImpl extends EFactoryImpl implements componentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static componentsFactory init() {
		try {
			componentsFactory thecomponentsFactory = (componentsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.femto-st.fr/disc/SysML4Modelica/Components"); 
			if (thecomponentsFactory != null) {
				return thecomponentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new componentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentsFactoryImpl() {
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
			case componentsPackage.MODELICA_VALUE_PROPERTY: return createModelicaValueProperty();
			case componentsPackage.MODELICA_PART: return createModelicaPart();
			case componentsPackage.MODELICA_PORT: return createModelicaPort();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER: return createModelicaFunctionParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaValueProperty createModelicaValueProperty() {
		ModelicaValuePropertyImpl modelicaValueProperty = new ModelicaValuePropertyImpl();
		return modelicaValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart createModelicaPart() {
		ModelicaPartImpl modelicaPart = new ModelicaPartImpl();
		return modelicaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPort createModelicaPort() {
		ModelicaPortImpl modelicaPort = new ModelicaPortImpl();
		return modelicaPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFunctionParameter createModelicaFunctionParameter() {
		ModelicaFunctionParameterImpl modelicaFunctionParameter = new ModelicaFunctionParameterImpl();
		return modelicaFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentsPackage getcomponentsPackage() {
		return (componentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static componentsPackage getPackage() {
		return componentsPackage.eINSTANCE;
	}

} //componentsFactoryImpl
