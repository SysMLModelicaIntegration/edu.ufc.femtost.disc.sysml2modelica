/*******************************************************************************
 * Copyright (c) 2013-2016 Jean-Marie Gauthier, University of Franche-Comte, and Samares-Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Jean-Marie Gauthier, University of Franche-Comte - initial API and implementation
 * Jean-Marie Gauthier, Samares-Engineering - Neon implementation
 *******************************************************************************/
/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage
 * @generated
 */
public class componentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static componentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public componentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = componentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected componentsSwitch<Adapter> modelSwitch =
		new componentsSwitch<Adapter>() {
			@Override
			public Adapter caseModelicaValueProperty(ModelicaValueProperty object) {
				return createModelicaValuePropertyAdapter();
			}
			@Override
			public Adapter caseModelicaPart(ModelicaPart object) {
				return createModelicaPartAdapter();
			}
			@Override
			public Adapter caseModelicaPort(ModelicaPort object) {
				return createModelicaPortAdapter();
			}
			@Override
			public Adapter caseModelicaFunctionParameter(ModelicaFunctionParameter object) {
				return createModelicaFunctionParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty <em>Modelica Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty
	 * @generated
	 */
	public Adapter createModelicaValuePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart <em>Modelica Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart
	 * @generated
	 */
	public Adapter createModelicaPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort <em>Modelica Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort
	 * @generated
	 */
	public Adapter createModelicaPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter <em>Modelica Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter
	 * @generated
	 */
	public Adapter createModelicaFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //componentsAdapterFactory
