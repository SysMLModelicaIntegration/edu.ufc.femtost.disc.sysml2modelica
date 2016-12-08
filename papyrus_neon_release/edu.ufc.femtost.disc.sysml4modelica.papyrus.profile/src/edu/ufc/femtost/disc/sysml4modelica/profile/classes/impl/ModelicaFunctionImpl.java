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
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.FunctionBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl#getBase_FunctionBehavior <em>Base Function Behavior</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl#getExternalLibrary <em>External Library</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl#getExternalInclude <em>External Include</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelicaFunctionImpl extends ModelicaClassDefinitionImpl implements ModelicaFunction {
	/**
	 * The cached value of the '{@link #getBase_FunctionBehavior() <em>Base Function Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_FunctionBehavior()
	 * @generated
	 * @ordered
	 */
	protected FunctionBehavior base_FunctionBehavior;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaScopeKind SCOPE_EDEFAULT = ModelicaScopeKind.NONE;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ModelicaScopeKind scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalLibrary() <em>External Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalLibrary() <em>External Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalLibrary()
	 * @generated
	 * @ordered
	 */
	protected String externalLibrary = EXTERNAL_LIBRARY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return classesPackage.Literals.MODELICA_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior getBase_FunctionBehavior() {
		if (base_FunctionBehavior != null && base_FunctionBehavior.eIsProxy()) {
			InternalEObject oldBase_FunctionBehavior = (InternalEObject)base_FunctionBehavior;
			base_FunctionBehavior = (FunctionBehavior)eResolveProxy(oldBase_FunctionBehavior);
			if (base_FunctionBehavior != oldBase_FunctionBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, classesPackage.MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR, oldBase_FunctionBehavior, base_FunctionBehavior));
			}
		}
		return base_FunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior basicGetBase_FunctionBehavior() {
		return base_FunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_FunctionBehavior(FunctionBehavior newBase_FunctionBehavior) {
		FunctionBehavior oldBase_FunctionBehavior = base_FunctionBehavior;
		base_FunctionBehavior = newBase_FunctionBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR, oldBase_FunctionBehavior, base_FunctionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaScopeKind getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ModelicaScopeKind newScope) {
		ModelicaScopeKind oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_FUNCTION__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalLibrary() {
		return externalLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalLibrary(String newExternalLibrary) {
		String oldExternalLibrary = externalLibrary;
		externalLibrary = newExternalLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_FUNCTION__EXTERNAL_LIBRARY, oldExternalLibrary, externalLibrary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_FUNCTION__EXTERNAL_INCLUDE, oldExternalInclude, externalInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case classesPackage.MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR:
				if (resolve) return getBase_FunctionBehavior();
				return basicGetBase_FunctionBehavior();
			case classesPackage.MODELICA_FUNCTION__SCOPE:
				return getScope();
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_LIBRARY:
				return getExternalLibrary();
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_INCLUDE:
				return getExternalInclude();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case classesPackage.MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR:
				setBase_FunctionBehavior((FunctionBehavior)newValue);
				return;
			case classesPackage.MODELICA_FUNCTION__SCOPE:
				setScope((ModelicaScopeKind)newValue);
				return;
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_LIBRARY:
				setExternalLibrary((String)newValue);
				return;
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_INCLUDE:
				setExternalInclude((String)newValue);
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
			case classesPackage.MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR:
				setBase_FunctionBehavior((FunctionBehavior)null);
				return;
			case classesPackage.MODELICA_FUNCTION__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_LIBRARY:
				setExternalLibrary(EXTERNAL_LIBRARY_EDEFAULT);
				return;
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_INCLUDE:
				setExternalInclude(EXTERNAL_INCLUDE_EDEFAULT);
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
			case classesPackage.MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR:
				return base_FunctionBehavior != null;
			case classesPackage.MODELICA_FUNCTION__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_LIBRARY:
				return EXTERNAL_LIBRARY_EDEFAULT == null ? externalLibrary != null : !EXTERNAL_LIBRARY_EDEFAULT.equals(externalLibrary);
			case classesPackage.MODELICA_FUNCTION__EXTERNAL_INCLUDE:
				return EXTERNAL_INCLUDE_EDEFAULT == null ? externalInclude != null : !EXTERNAL_INCLUDE_EDEFAULT.equals(externalInclude);
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(", externalLibrary: ");
		result.append(externalLibrary);
		result.append(", externalInclude: ");
		result.append(externalInclude);
		result.append(')');
		return result.toString();
	}

} //ModelicaFunctionImpl
