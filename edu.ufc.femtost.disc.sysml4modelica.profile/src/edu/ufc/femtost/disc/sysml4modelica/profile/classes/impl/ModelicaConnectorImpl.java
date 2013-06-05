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
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.topcased.sysml.Block;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConnectorImpl#isExpandable <em>Is Expandable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConnectorImpl#getBase_Block <em>Base Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaConnectorImpl extends ModelicaClassDefinitionImpl implements ModelicaConnector {
	/**
	 * The default value of the '{@link #isExpandable() <em>Is Expandable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXPANDABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpandable() <em>Is Expandable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandable()
	 * @generated
	 * @ordered
	 */
	protected boolean isExpandable = IS_EXPANDABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Block() <em>Base Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Block()
	 * @generated
	 * @ordered
	 */
	protected Block base_Block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return classesPackage.Literals.MODELICA_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpandable() {
		return isExpandable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExpandable(boolean newIsExpandable) {
		boolean oldIsExpandable = isExpandable;
		isExpandable = newIsExpandable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_CONNECTOR__IS_EXPANDABLE, oldIsExpandable, isExpandable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBase_Block() {
		if (base_Block != null && base_Block.eIsProxy()) {
			InternalEObject oldBase_Block = (InternalEObject)base_Block;
			base_Block = (Block)eResolveProxy(oldBase_Block);
			if (base_Block != oldBase_Block) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, classesPackage.MODELICA_CONNECTOR__BASE_BLOCK, oldBase_Block, base_Block));
			}
		}
		return base_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBase_Block() {
		return base_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Block(Block newBase_Block) {
		Block oldBase_Block = base_Block;
		base_Block = newBase_Block;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_CONNECTOR__BASE_BLOCK, oldBase_Block, base_Block));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case classesPackage.MODELICA_CONNECTOR__IS_EXPANDABLE:
				return isExpandable();
			case classesPackage.MODELICA_CONNECTOR__BASE_BLOCK:
				if (resolve) return getBase_Block();
				return basicGetBase_Block();
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
			case classesPackage.MODELICA_CONNECTOR__IS_EXPANDABLE:
				setIsExpandable((Boolean)newValue);
				return;
			case classesPackage.MODELICA_CONNECTOR__BASE_BLOCK:
				setBase_Block((Block)newValue);
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
			case classesPackage.MODELICA_CONNECTOR__IS_EXPANDABLE:
				setIsExpandable(IS_EXPANDABLE_EDEFAULT);
				return;
			case classesPackage.MODELICA_CONNECTOR__BASE_BLOCK:
				setBase_Block((Block)null);
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
			case classesPackage.MODELICA_CONNECTOR__IS_EXPANDABLE:
				return isExpandable != IS_EXPANDABLE_EDEFAULT;
			case classesPackage.MODELICA_CONNECTOR__BASE_BLOCK:
				return base_Block != null;
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
		result.append(" (isExpandable: ");
		result.append(isExpandable);
		result.append(')');
		return result.toString();
	}

} //ModelicaConnectorImpl
