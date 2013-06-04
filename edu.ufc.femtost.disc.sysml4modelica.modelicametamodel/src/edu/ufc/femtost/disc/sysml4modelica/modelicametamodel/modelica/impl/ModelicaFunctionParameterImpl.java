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
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind;

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
 * An implementation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getOwnerFunction <em>Owner Function</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#isIsReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getDeclarationEquation <em>Declaration Equation</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl#getType_specifier <em>Type specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaFunctionParameterImpl extends EObjectImpl implements ModelicaFunctionParameter {
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
	 * The default value of the '{@link #getDeclarationEquation() <em>Declaration Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationEquation()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_EQUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclarationEquation() <em>Declaration Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationEquation()
	 * @generated
	 * @ordered
	 */
	protected String declarationEquation = DECLARATION_EQUATION_EDEFAULT;

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
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arraySize;

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
	protected ModelicaFunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelicaPackage.Literals.MODELICA_FUNCTION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getOwnerFunction() {
		if (eContainerFeatureID() != ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION) return null;
		return (Function)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerFunction(Function newOwnerFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerFunction, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerFunction(Function newOwnerFunction) {
		if (newOwnerFunction != eInternalContainer() || (eContainerFeatureID() != ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION && newOwnerFunction != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerFunction != null)
				msgs = ((InternalEObject)newOwnerFunction).eInverseAdd(this, ModelicaPackage.FUNCTION__PARAMETERS, Function.class, msgs);
			msgs = basicSetOwnerFunction(newOwnerFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION, newOwnerFunction, newOwnerFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY, oldCausality, causality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION, oldModification, modification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclarationEquation() {
		return declarationEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarationEquation(String newDeclarationEquation) {
		String oldDeclarationEquation = declarationEquation;
		declarationEquation = newDeclarationEquation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION, oldDeclarationEquation, declarationEquation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArraySize() {
		if (arraySize == null) {
			arraySize = new EDataTypeUniqueEList<String>(String.class, this, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE);
		}
		return arraySize;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY, oldVariability, variability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER, oldType_specifier, type_specifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerFunction((Function)otherEnd, msgs);
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
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION:
				return basicSetOwnerFunction(null, msgs);
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
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION:
				return eInternalContainer().eInverseRemove(this, ModelicaPackage.FUNCTION__PARAMETERS, Function.class, msgs);
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
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION:
				return getOwnerFunction();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__NAME:
				return getName();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				return getCausality();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				return getModification();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				return isIsReplaceable();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				return getDeclarationEquation();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				return isIsFinal();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
				return getArraySize();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				return getVariability();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER:
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
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION:
				setOwnerFunction((Function)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				setCausality((ModelicaCausalityKind)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				setModification((String)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				setDeclarationEquation((String)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
				getArraySize().clear();
				getArraySize().addAll((Collection<? extends String>)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				setVariability((ModelicaVariabilityKind)newValue);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER:
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
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION:
				setOwnerFunction((Function)null);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				setCausality(CAUSALITY_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				setModification(MODIFICATION_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				setDeclarationEquation(DECLARATION_EQUATION_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
				getArraySize().clear();
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				setVariability(VARIABILITY_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER:
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
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION:
				return getOwnerFunction() != null;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				return causality != CAUSALITY_EDEFAULT;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				return MODIFICATION_EDEFAULT == null ? modification != null : !MODIFICATION_EDEFAULT.equals(modification);
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				return DECLARATION_EQUATION_EDEFAULT == null ? declarationEquation != null : !DECLARATION_EQUATION_EDEFAULT.equals(declarationEquation);
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
				return arraySize != null && !arraySize.isEmpty();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				return variability != VARIABILITY_EDEFAULT;
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", causality: ");
		result.append(causality);
		result.append(", modification: ");
		result.append(modification);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(", declarationEquation: ");
		result.append(declarationEquation);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", variability: ");
		result.append(variability);
		result.append(", type_specifier: ");
		result.append(type_specifier);
		result.append(')');
		return result.toString();
	}

} //ModelicaFunctionParameterImpl
