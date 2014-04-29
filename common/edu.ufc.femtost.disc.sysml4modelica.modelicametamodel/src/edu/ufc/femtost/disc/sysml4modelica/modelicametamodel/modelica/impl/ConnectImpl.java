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

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getOwnerEquationSection <em>Owner Equation Section</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getFrom <em>From</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getTo <em>To</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getFromModelicaPart <em>From Modelica Part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getToModelicaPart <em>To Modelica Part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getToPort <em>To Port</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getFromPart <em>From Part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl#getToPart <em>To Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectImpl extends EObjectImpl implements Connect {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected ModelicaPort from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected ModelicaPort to;

	/**
	 * The cached value of the '{@link #getFromModelicaPart() <em>From Modelica Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromModelicaPart()
	 * @generated
	 * @ordered
	 */
	protected ModelicaPart fromModelicaPart;

	/**
	 * The cached value of the '{@link #getToModelicaPart() <em>To Modelica Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToModelicaPart()
	 * @generated
	 * @ordered
	 */
	protected ModelicaPart toModelicaPart;

	/**
	 * The default value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected String fromPort = FROM_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected String toPort = TO_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromPart() <em>From Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPart()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromPart() <em>From Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPart()
	 * @generated
	 * @ordered
	 */
	protected String fromPart = FROM_PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getToPart() <em>To Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPart()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToPart() <em>To Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPart()
	 * @generated
	 * @ordered
	 */
	protected String toPart = TO_PART_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelicaPackage.Literals.CONNECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationSection getOwnerEquationSection() {
		if (eContainerFeatureID() != ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION) return null;
		return (EquationSection)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerEquationSection(EquationSection newOwnerEquationSection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerEquationSection, ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerEquationSection(EquationSection newOwnerEquationSection) {
		if (newOwnerEquationSection != eInternalContainer() || (eContainerFeatureID() != ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION && newOwnerEquationSection != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerEquationSection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerEquationSection != null)
				msgs = ((InternalEObject)newOwnerEquationSection).eInverseAdd(this, ModelicaPackage.EQUATION_SECTION__CONNECTS, EquationSection.class, msgs);
			msgs = basicSetOwnerEquationSection(newOwnerEquationSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION, newOwnerEquationSection, newOwnerEquationSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPort getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (ModelicaPort)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelicaPackage.CONNECT__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPort basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(ModelicaPort newFrom) {
		ModelicaPort oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPort getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (ModelicaPort)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelicaPackage.CONNECT__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPort basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(ModelicaPort newTo) {
		ModelicaPort oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart getFromModelicaPart() {
		if (fromModelicaPart != null && fromModelicaPart.eIsProxy()) {
			InternalEObject oldFromModelicaPart = (InternalEObject)fromModelicaPart;
			fromModelicaPart = (ModelicaPart)eResolveProxy(oldFromModelicaPart);
			if (fromModelicaPart != oldFromModelicaPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelicaPackage.CONNECT__FROM_MODELICA_PART, oldFromModelicaPart, fromModelicaPart));
			}
		}
		return fromModelicaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart basicGetFromModelicaPart() {
		return fromModelicaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromModelicaPart(ModelicaPart newFromModelicaPart) {
		ModelicaPart oldFromModelicaPart = fromModelicaPart;
		fromModelicaPart = newFromModelicaPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__FROM_MODELICA_PART, oldFromModelicaPart, fromModelicaPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart getToModelicaPart() {
		if (toModelicaPart != null && toModelicaPart.eIsProxy()) {
			InternalEObject oldToModelicaPart = (InternalEObject)toModelicaPart;
			toModelicaPart = (ModelicaPart)eResolveProxy(oldToModelicaPart);
			if (toModelicaPart != oldToModelicaPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelicaPackage.CONNECT__TO_MODELICA_PART, oldToModelicaPart, toModelicaPart));
			}
		}
		return toModelicaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart basicGetToModelicaPart() {
		return toModelicaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToModelicaPart(ModelicaPart newToModelicaPart) {
		ModelicaPart oldToModelicaPart = toModelicaPart;
		toModelicaPart = newToModelicaPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__TO_MODELICA_PART, oldToModelicaPart, toModelicaPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPort(String newFromPort) {
		String oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__FROM_PORT, oldFromPort, fromPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPort(String newToPort) {
		String oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__TO_PORT, oldToPort, toPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromPart() {
		return fromPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPart(String newFromPart) {
		String oldFromPart = fromPart;
		fromPart = newFromPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__FROM_PART, oldFromPart, fromPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToPart() {
		return toPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPart(String newToPart) {
		String oldToPart = toPart;
		toPart = newToPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.CONNECT__TO_PART, oldToPart, toPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerEquationSection((EquationSection)otherEnd, msgs);
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
			case ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION:
				return basicSetOwnerEquationSection(null, msgs);
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
			case ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION:
				return eInternalContainer().eInverseRemove(this, ModelicaPackage.EQUATION_SECTION__CONNECTS, EquationSection.class, msgs);
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
			case ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION:
				return getOwnerEquationSection();
			case ModelicaPackage.CONNECT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case ModelicaPackage.CONNECT__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case ModelicaPackage.CONNECT__FROM_MODELICA_PART:
				if (resolve) return getFromModelicaPart();
				return basicGetFromModelicaPart();
			case ModelicaPackage.CONNECT__TO_MODELICA_PART:
				if (resolve) return getToModelicaPart();
				return basicGetToModelicaPart();
			case ModelicaPackage.CONNECT__FROM_PORT:
				return getFromPort();
			case ModelicaPackage.CONNECT__TO_PORT:
				return getToPort();
			case ModelicaPackage.CONNECT__FROM_PART:
				return getFromPart();
			case ModelicaPackage.CONNECT__TO_PART:
				return getToPart();
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
			case ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION:
				setOwnerEquationSection((EquationSection)newValue);
				return;
			case ModelicaPackage.CONNECT__FROM:
				setFrom((ModelicaPort)newValue);
				return;
			case ModelicaPackage.CONNECT__TO:
				setTo((ModelicaPort)newValue);
				return;
			case ModelicaPackage.CONNECT__FROM_MODELICA_PART:
				setFromModelicaPart((ModelicaPart)newValue);
				return;
			case ModelicaPackage.CONNECT__TO_MODELICA_PART:
				setToModelicaPart((ModelicaPart)newValue);
				return;
			case ModelicaPackage.CONNECT__FROM_PORT:
				setFromPort((String)newValue);
				return;
			case ModelicaPackage.CONNECT__TO_PORT:
				setToPort((String)newValue);
				return;
			case ModelicaPackage.CONNECT__FROM_PART:
				setFromPart((String)newValue);
				return;
			case ModelicaPackage.CONNECT__TO_PART:
				setToPart((String)newValue);
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
			case ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION:
				setOwnerEquationSection((EquationSection)null);
				return;
			case ModelicaPackage.CONNECT__FROM:
				setFrom((ModelicaPort)null);
				return;
			case ModelicaPackage.CONNECT__TO:
				setTo((ModelicaPort)null);
				return;
			case ModelicaPackage.CONNECT__FROM_MODELICA_PART:
				setFromModelicaPart((ModelicaPart)null);
				return;
			case ModelicaPackage.CONNECT__TO_MODELICA_PART:
				setToModelicaPart((ModelicaPart)null);
				return;
			case ModelicaPackage.CONNECT__FROM_PORT:
				setFromPort(FROM_PORT_EDEFAULT);
				return;
			case ModelicaPackage.CONNECT__TO_PORT:
				setToPort(TO_PORT_EDEFAULT);
				return;
			case ModelicaPackage.CONNECT__FROM_PART:
				setFromPart(FROM_PART_EDEFAULT);
				return;
			case ModelicaPackage.CONNECT__TO_PART:
				setToPart(TO_PART_EDEFAULT);
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
			case ModelicaPackage.CONNECT__OWNER_EQUATION_SECTION:
				return getOwnerEquationSection() != null;
			case ModelicaPackage.CONNECT__FROM:
				return from != null;
			case ModelicaPackage.CONNECT__TO:
				return to != null;
			case ModelicaPackage.CONNECT__FROM_MODELICA_PART:
				return fromModelicaPart != null;
			case ModelicaPackage.CONNECT__TO_MODELICA_PART:
				return toModelicaPart != null;
			case ModelicaPackage.CONNECT__FROM_PORT:
				return FROM_PORT_EDEFAULT == null ? fromPort != null : !FROM_PORT_EDEFAULT.equals(fromPort);
			case ModelicaPackage.CONNECT__TO_PORT:
				return TO_PORT_EDEFAULT == null ? toPort != null : !TO_PORT_EDEFAULT.equals(toPort);
			case ModelicaPackage.CONNECT__FROM_PART:
				return FROM_PART_EDEFAULT == null ? fromPart != null : !FROM_PART_EDEFAULT.equals(fromPart);
			case ModelicaPackage.CONNECT__TO_PART:
				return TO_PART_EDEFAULT == null ? toPart != null : !TO_PART_EDEFAULT.equals(toPart);
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
		result.append(" (fromPort: ");
		result.append(fromPort);
		result.append(", toPort: ");
		result.append(toPort);
		result.append(", fromPart: ");
		result.append(fromPart);
		result.append(", toPart: ");
		result.append(toPart);
		result.append(')');
		return result.toString();
	}

} //ConnectImpl
