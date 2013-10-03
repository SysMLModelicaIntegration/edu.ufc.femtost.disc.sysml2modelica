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
public class equationsandalgorithmsFactoryImpl extends EFactoryImpl implements equationsandalgorithmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static equationsandalgorithmsFactory init() {
		try {
			equationsandalgorithmsFactory theequationsandalgorithmsFactory = (equationsandalgorithmsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.femto-st.fr/disc/SysML4Modelica/EquationsAndAlgorithms"); 
			if (theequationsandalgorithmsFactory != null) {
				return theequationsandalgorithmsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new equationsandalgorithmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equationsandalgorithmsFactoryImpl() {
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
			case equationsandalgorithmsPackage.MODELICA_EQUATION: return createModelicaEquation();
			case equationsandalgorithmsPackage.MODELICA_ALGORITHM: return createModelicaAlgorithm();
			case equationsandalgorithmsPackage.MODELICA_CONNECTION: return createModelicaConnection();
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
	public equationsandalgorithmsPackage getequationsandalgorithmsPackage() {
		return (equationsandalgorithmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static equationsandalgorithmsPackage getPackage() {
		return equationsandalgorithmsPackage.eINSTANCE;
	}

} //equationsandalgorithmsFactoryImpl
