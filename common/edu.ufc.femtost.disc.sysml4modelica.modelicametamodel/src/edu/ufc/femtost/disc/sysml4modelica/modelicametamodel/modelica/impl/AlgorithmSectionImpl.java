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
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmSectionImpl#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmSectionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgorithmSectionImpl extends EObjectImpl implements AlgorithmSection {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelicaPackage.Literals.ALGORITHM_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition getOwnerModelicaClassDefinition() {
		if (eContainerFeatureID() != ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION) return null;
		return (ModelicaClassDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerModelicaClassDefinition, ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition) {
		if (newOwnerModelicaClassDefinition != eInternalContainer() || (eContainerFeatureID() != ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION && newOwnerModelicaClassDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerModelicaClassDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerModelicaClassDefinition != null)
				msgs = ((InternalEObject)newOwnerModelicaClassDefinition).eInverseAdd(this, ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS, ModelicaClassDefinition.class, msgs);
			msgs = basicSetOwnerModelicaClassDefinition(newOwnerModelicaClassDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION, newOwnerModelicaClassDefinition, newOwnerModelicaClassDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.ALGORITHM_SECTION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerModelicaClassDefinition((ModelicaClassDefinition)otherEnd, msgs);
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
			case ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return basicSetOwnerModelicaClassDefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return eInternalContainer().eInverseRemove(this, ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS, ModelicaClassDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition();
			case ModelicaPackage.ALGORITHM_SECTION__BODY:
				return getBody();
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
			case ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)newValue);
				return;
			case ModelicaPackage.ALGORITHM_SECTION__BODY:
				setBody((String)newValue);
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
			case ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)null);
				return;
			case ModelicaPackage.ALGORITHM_SECTION__BODY:
				setBody(BODY_EDEFAULT);
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
			case ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition() != null;
			case ModelicaPackage.ALGORITHM_SECTION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
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
		result.append(" (body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //AlgorithmSectionImpl
