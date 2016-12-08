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

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.PackageImpl#getWithinClause <em>Within Clause</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.PackageImpl#getModelicaClasses <em>Modelica Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends ModelicaClassDefinitionImpl implements edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package {
	/**
	 * The default value of the '{@link #getWithinClause() <em>Within Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinClause()
	 * @generated
	 * @ordered
	 */
	protected static final String WITHIN_CLAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWithinClause() <em>Within Clause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinClause()
	 * @generated
	 * @ordered
	 */
	protected String withinClause = WITHIN_CLAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelicaClasses() <em>Modelica Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelicaClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelicaClassDefinition> modelicaClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWithinClause() {
		return withinClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithinClause(String newWithinClause) {
		String oldWithinClause = withinClause;
		withinClause = newWithinClause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.PACKAGE__WITHIN_CLAUSE, oldWithinClause, withinClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelicaClassDefinition> getModelicaClasses() {
		if (modelicaClasses == null) {
			modelicaClasses = new EObjectContainmentWithInverseEList<ModelicaClassDefinition>(ModelicaClassDefinition.class, this, modelicaPackage.PACKAGE__MODELICA_CLASSES, modelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE);
		}
		return modelicaClasses;
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
			case modelicaPackage.PACKAGE__MODELICA_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelicaClasses()).basicAdd(otherEnd, msgs);
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
			case modelicaPackage.PACKAGE__MODELICA_CLASSES:
				return ((InternalEList<?>)getModelicaClasses()).basicRemove(otherEnd, msgs);
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
			case modelicaPackage.PACKAGE__WITHIN_CLAUSE:
				return getWithinClause();
			case modelicaPackage.PACKAGE__MODELICA_CLASSES:
				return getModelicaClasses();
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
			case modelicaPackage.PACKAGE__WITHIN_CLAUSE:
				setWithinClause((String)newValue);
				return;
			case modelicaPackage.PACKAGE__MODELICA_CLASSES:
				getModelicaClasses().clear();
				getModelicaClasses().addAll((Collection<? extends ModelicaClassDefinition>)newValue);
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
			case modelicaPackage.PACKAGE__WITHIN_CLAUSE:
				setWithinClause(WITHIN_CLAUSE_EDEFAULT);
				return;
			case modelicaPackage.PACKAGE__MODELICA_CLASSES:
				getModelicaClasses().clear();
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
			case modelicaPackage.PACKAGE__WITHIN_CLAUSE:
				return WITHIN_CLAUSE_EDEFAULT == null ? withinClause != null : !WITHIN_CLAUSE_EDEFAULT.equals(withinClause);
			case modelicaPackage.PACKAGE__MODELICA_CLASSES:
				return modelicaClasses != null && !modelicaClasses.isEmpty();
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
		result.append(" (withinClause: ");
		result.append(withinClause);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
