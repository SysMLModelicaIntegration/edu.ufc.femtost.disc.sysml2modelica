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

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#isIsReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl#getType_specifier <em>Type specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelicaComponentImpl extends EObjectImpl implements ModelicaComponent {
	/**
	 * The default value of the '{@link #getConditionalExpression() <em>Conditional Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONAL_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionalExpression() <em>Conditional Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalExpression()
	 * @generated
	 * @ordered
	 */
	protected String conditionalExpression = CONDITIONAL_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getModification() <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModification() <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected String modification = MODIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReplaceable() <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaceable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReplaceable() <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaceable()
	 * @generated
	 * @ordered
	 */
	protected boolean isReplaceable = IS_REPLACEABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arraySize;

	/**
	 * The default value of the '{@link #getType_specifier() <em>Type specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_specifier()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_SPECIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_specifier() <em>Type specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_specifier()
	 * @generated
	 * @ordered
	 */
	protected String type_specifier = TYPE_SPECIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelicaPackage.Literals.MODELICA_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionalExpression() {
		return conditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalExpression(String newConditionalExpression) {
		String oldConditionalExpression = conditionalExpression;
		conditionalExpression = newConditionalExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_COMPONENT__CONDITIONAL_EXPRESSION, oldConditionalExpression, conditionalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_COMPONENT__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModification() {
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModification(String newModification) {
		String oldModification = modification;
		modification = newModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_COMPONENT__MODIFICATION, oldModification, modification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReplaceable() {
		return isReplaceable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceable(boolean newIsReplaceable) {
		boolean oldIsReplaceable = isReplaceable;
		isReplaceable = newIsReplaceable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_COMPONENT__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArraySize() {
		if (arraySize == null) {
			arraySize = new EDataTypeUniqueEList<String>(String.class, this, ModelicaPackage.MODELICA_COMPONENT__ARRAY_SIZE);
		}
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition getOwnerModelicaClassDefinition() {
		if (eContainerFeatureID() != ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION) return null;
		return (ModelicaClassDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerModelicaClassDefinition, ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition) {
		if (newOwnerModelicaClassDefinition != eInternalContainer() || (eContainerFeatureID() != ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION && newOwnerModelicaClassDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerModelicaClassDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerModelicaClassDefinition != null)
				msgs = ((InternalEObject)newOwnerModelicaClassDefinition).eInverseAdd(this, ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS, ModelicaClassDefinition.class, msgs);
			msgs = basicSetOwnerModelicaClassDefinition(newOwnerModelicaClassDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION, newOwnerModelicaClassDefinition, newOwnerModelicaClassDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_specifier() {
		return type_specifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_specifier(String newType_specifier) {
		String oldType_specifier = type_specifier;
		type_specifier = newType_specifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_COMPONENT__TYPE_SPECIFIER, oldType_specifier, type_specifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION:
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
			case ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION:
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
			case ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION:
				return eInternalContainer().eInverseRemove(this, ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS, ModelicaClassDefinition.class, msgs);
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
			case ModelicaPackage.MODELICA_COMPONENT__CONDITIONAL_EXPRESSION:
				return getConditionalExpression();
			case ModelicaPackage.MODELICA_COMPONENT__NAME:
				return getName();
			case ModelicaPackage.MODELICA_COMPONENT__IS_FINAL:
				return isIsFinal();
			case ModelicaPackage.MODELICA_COMPONENT__MODIFICATION:
				return getModification();
			case ModelicaPackage.MODELICA_COMPONENT__IS_REPLACEABLE:
				return isIsReplaceable();
			case ModelicaPackage.MODELICA_COMPONENT__ARRAY_SIZE:
				return getArraySize();
			case ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition();
			case ModelicaPackage.MODELICA_COMPONENT__TYPE_SPECIFIER:
				return getType_specifier();
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
			case ModelicaPackage.MODELICA_COMPONENT__CONDITIONAL_EXPRESSION:
				setConditionalExpression((String)newValue);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__MODIFICATION:
				setModification((String)newValue);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__ARRAY_SIZE:
				getArraySize().clear();
				getArraySize().addAll((Collection<? extends String>)newValue);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)newValue);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__TYPE_SPECIFIER:
				setType_specifier((String)newValue);
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
			case ModelicaPackage.MODELICA_COMPONENT__CONDITIONAL_EXPRESSION:
				setConditionalExpression(CONDITIONAL_EXPRESSION_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__MODIFICATION:
				setModification(MODIFICATION_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__ARRAY_SIZE:
				getArraySize().clear();
				return;
			case ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)null);
				return;
			case ModelicaPackage.MODELICA_COMPONENT__TYPE_SPECIFIER:
				setType_specifier(TYPE_SPECIFIER_EDEFAULT);
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
			case ModelicaPackage.MODELICA_COMPONENT__CONDITIONAL_EXPRESSION:
				return CONDITIONAL_EXPRESSION_EDEFAULT == null ? conditionalExpression != null : !CONDITIONAL_EXPRESSION_EDEFAULT.equals(conditionalExpression);
			case ModelicaPackage.MODELICA_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelicaPackage.MODELICA_COMPONENT__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case ModelicaPackage.MODELICA_COMPONENT__MODIFICATION:
				return MODIFICATION_EDEFAULT == null ? modification != null : !MODIFICATION_EDEFAULT.equals(modification);
			case ModelicaPackage.MODELICA_COMPONENT__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
			case ModelicaPackage.MODELICA_COMPONENT__ARRAY_SIZE:
				return arraySize != null && !arraySize.isEmpty();
			case ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition() != null;
			case ModelicaPackage.MODELICA_COMPONENT__TYPE_SPECIFIER:
				return TYPE_SPECIFIER_EDEFAULT == null ? type_specifier != null : !TYPE_SPECIFIER_EDEFAULT.equals(type_specifier);
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
		result.append(" (conditionalExpression: ");
		result.append(conditionalExpression);
		result.append(", name: ");
		result.append(name);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", modification: ");
		result.append(modification);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", type_specifier: ");
		result.append(type_specifier);
		result.append(')');
		return result.toString();
	}

} //ModelicaComponentImpl
