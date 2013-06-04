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
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaEquation;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.equationsandalgorithmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Equation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaEquationImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaEquationImpl#isInitial <em>Is Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaEquationImpl extends EObjectImpl implements ModelicaEquation {
	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * The default value of the '{@link #isInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaEquationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return equationsandalgorithmsPackage.Literals.MODELICA_EQUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject)base_Constraint;
			base_Constraint = (Constraint)eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, equationsandalgorithmsPackage.MODELICA_EQUATION__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, equationsandalgorithmsPackage.MODELICA_EQUATION__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, equationsandalgorithmsPackage.MODELICA_EQUATION__IS_INITIAL, oldIsInitial, isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case equationsandalgorithmsPackage.MODELICA_EQUATION__BASE_CONSTRAINT:
				if (resolve) return getBase_Constraint();
				return basicGetBase_Constraint();
			case equationsandalgorithmsPackage.MODELICA_EQUATION__IS_INITIAL:
				return isInitial();
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
			case equationsandalgorithmsPackage.MODELICA_EQUATION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)newValue);
				return;
			case equationsandalgorithmsPackage.MODELICA_EQUATION__IS_INITIAL:
				setIsInitial((Boolean)newValue);
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
			case equationsandalgorithmsPackage.MODELICA_EQUATION__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)null);
				return;
			case equationsandalgorithmsPackage.MODELICA_EQUATION__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
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
			case equationsandalgorithmsPackage.MODELICA_EQUATION__BASE_CONSTRAINT:
				return base_Constraint != null;
			case equationsandalgorithmsPackage.MODELICA_EQUATION__IS_INITIAL:
				return isInitial != IS_INITIAL_EDEFAULT;
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
		result.append(" (isInitial: ");
		result.append(isInitial);
		result.append(')');
		return result.toString();
	}

} //ModelicaEquationImpl
