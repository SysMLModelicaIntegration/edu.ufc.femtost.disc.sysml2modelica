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

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl#getFlowFlag <em>Flow Flag</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl#getDefault_value <em>Default value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaValuePropertyImpl extends ModelicaComponentImpl implements ModelicaValueProperty {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCausality() <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaCausalityKind CAUSALITY_EDEFAULT = ModelicaCausalityKind.NONE;

	/**
	 * The cached value of the '{@link #getCausality() <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected ModelicaCausalityKind causality = CAUSALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaVariabilityKind VARIABILITY_EDEFAULT = ModelicaVariabilityKind.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected ModelicaVariabilityKind variability = VARIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlowFlag() <em>Flow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowFlag()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaFlowFlag FLOW_FLAG_EDEFAULT = ModelicaFlowFlag.NONE;

	/**
	 * The cached value of the '{@link #getFlowFlag() <em>Flow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowFlag()
	 * @generated
	 * @ordered
	 */
	protected ModelicaFlowFlag flowFlag = FLOW_FLAG_EDEFAULT;

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
	 * The default value of the '{@link #getDefault_value() <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault_value() <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value()
	 * @generated
	 * @ordered
	 */
	protected String default_value = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaValuePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoPackage.Literals.MODELICA_VALUE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.MODELICA_VALUE_PROPERTY__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaCausalityKind getCausality() {
		return causality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausality(ModelicaCausalityKind newCausality) {
		ModelicaCausalityKind oldCausality = causality;
		causality = newCausality == null ? CAUSALITY_EDEFAULT : newCausality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.MODELICA_VALUE_PROPERTY__CAUSALITY, oldCausality, causality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaVariabilityKind getVariability() {
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariability(ModelicaVariabilityKind newVariability) {
		ModelicaVariabilityKind oldVariability = variability;
		variability = newVariability == null ? VARIABILITY_EDEFAULT : newVariability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.MODELICA_VALUE_PROPERTY__VARIABILITY, oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFlowFlag getFlowFlag() {
		return flowFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowFlag(ModelicaFlowFlag newFlowFlag) {
		ModelicaFlowFlag oldFlowFlag = flowFlag;
		flowFlag = newFlowFlag == null ? FLOW_FLAG_EDEFAULT : newFlowFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG, oldFlowFlag, flowFlag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.MODELICA_VALUE_PROPERTY__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault_value() {
		return default_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value(String newDefault_value) {
		String oldDefault_value = default_value;
		default_value = newDefault_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.MODELICA_VALUE_PROPERTY__DEFAULT_VALUE, oldDefault_value, default_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MoPackage.MODELICA_VALUE_PROPERTY__VISIBILITY:
				return getVisibility();
			case MoPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				return getCausality();
			case MoPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				return getVariability();
			case MoPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				return getFlowFlag();
			case MoPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				return getScope();
			case MoPackage.MODELICA_VALUE_PROPERTY__DEFAULT_VALUE:
				return getDefault_value();
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
			case MoPackage.MODELICA_VALUE_PROPERTY__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				setCausality((ModelicaCausalityKind)newValue);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				setVariability((ModelicaVariabilityKind)newValue);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				setFlowFlag((ModelicaFlowFlag)newValue);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				setScope((ModelicaScopeKind)newValue);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__DEFAULT_VALUE:
				setDefault_value((String)newValue);
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
			case MoPackage.MODELICA_VALUE_PROPERTY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				setCausality(CAUSALITY_EDEFAULT);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				setVariability(VARIABILITY_EDEFAULT);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				setFlowFlag(FLOW_FLAG_EDEFAULT);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case MoPackage.MODELICA_VALUE_PROPERTY__DEFAULT_VALUE:
				setDefault_value(DEFAULT_VALUE_EDEFAULT);
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
			case MoPackage.MODELICA_VALUE_PROPERTY__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case MoPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				return causality != CAUSALITY_EDEFAULT;
			case MoPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				return variability != VARIABILITY_EDEFAULT;
			case MoPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				return flowFlag != FLOW_FLAG_EDEFAULT;
			case MoPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case MoPackage.MODELICA_VALUE_PROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? default_value != null : !DEFAULT_VALUE_EDEFAULT.equals(default_value);
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", causality: ");
		result.append(causality);
		result.append(", variability: ");
		result.append(variability);
		result.append(", flowFlag: ");
		result.append(flowFlag);
		result.append(", scope: ");
		result.append(scope);
		result.append(", default_value: ");
		result.append(default_value);
		result.append(')');
		return result.toString();
	}

} //ModelicaValuePropertyImpl
