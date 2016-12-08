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
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl#getExternalLanguage <em>External Language</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl#getExternalInclude <em>External Include</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl#getExternalLibrary <em>External Library</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ModelicaClassDefinitionImpl implements Function {
	/**
	 * The default value of the '{@link #getExternalLanguage() <em>External Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalLanguage() <em>External Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalLanguage()
	 * @generated
	 * @ordered
	 */
	protected String externalLanguage = EXTERNAL_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalInclude() <em>External Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInclude()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_INCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalInclude() <em>External Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInclude()
	 * @generated
	 * @ordered
	 */
	protected String externalInclude = EXTERNAL_INCLUDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalLibrary() <em>External Library</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<String> externalLibrary;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelicaFunctionParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalLanguage() {
		return externalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalLanguage(String newExternalLanguage) {
		String oldExternalLanguage = externalLanguage;
		externalLanguage = newExternalLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.FUNCTION__EXTERNAL_LANGUAGE, oldExternalLanguage, externalLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalInclude() {
		return externalInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalInclude(String newExternalInclude) {
		String oldExternalInclude = externalInclude;
		externalInclude = newExternalInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.FUNCTION__EXTERNAL_INCLUDE, oldExternalInclude, externalInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExternalLibrary() {
		if (externalLibrary == null) {
			externalLibrary = new EDataTypeUniqueEList<String>(String.class, this, modelicaPackage.FUNCTION__EXTERNAL_LIBRARY);
		}
		return externalLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelicaFunctionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<ModelicaFunctionParameter>(ModelicaFunctionParameter.class, this, modelicaPackage.FUNCTION__PARAMETERS, modelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.FUNCTION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case modelicaPackage.FUNCTION__EXTERNAL_LANGUAGE:
				return getExternalLanguage();
			case modelicaPackage.FUNCTION__EXTERNAL_INCLUDE:
				return getExternalInclude();
			case modelicaPackage.FUNCTION__EXTERNAL_LIBRARY:
				return getExternalLibrary();
			case modelicaPackage.FUNCTION__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case modelicaPackage.FUNCTION__EXTERNAL_LANGUAGE:
				setExternalLanguage((String)newValue);
				return;
			case modelicaPackage.FUNCTION__EXTERNAL_INCLUDE:
				setExternalInclude((String)newValue);
				return;
			case modelicaPackage.FUNCTION__EXTERNAL_LIBRARY:
				getExternalLibrary().clear();
				getExternalLibrary().addAll((Collection<? extends String>)newValue);
				return;
			case modelicaPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ModelicaFunctionParameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case modelicaPackage.FUNCTION__EXTERNAL_LANGUAGE:
				setExternalLanguage(EXTERNAL_LANGUAGE_EDEFAULT);
				return;
			case modelicaPackage.FUNCTION__EXTERNAL_INCLUDE:
				setExternalInclude(EXTERNAL_INCLUDE_EDEFAULT);
				return;
			case modelicaPackage.FUNCTION__EXTERNAL_LIBRARY:
				getExternalLibrary().clear();
				return;
			case modelicaPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case modelicaPackage.FUNCTION__EXTERNAL_LANGUAGE:
				return EXTERNAL_LANGUAGE_EDEFAULT == null ? externalLanguage != null : !EXTERNAL_LANGUAGE_EDEFAULT.equals(externalLanguage);
			case modelicaPackage.FUNCTION__EXTERNAL_INCLUDE:
				return EXTERNAL_INCLUDE_EDEFAULT == null ? externalInclude != null : !EXTERNAL_INCLUDE_EDEFAULT.equals(externalInclude);
			case modelicaPackage.FUNCTION__EXTERNAL_LIBRARY:
				return externalLibrary != null && !externalLibrary.isEmpty();
			case modelicaPackage.FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (externalLanguage: ");
		result.append(externalLanguage);
		result.append(", externalInclude: ");
		result.append(externalInclude);
		result.append(", externalLibrary: ");
		result.append(externalLibrary);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
