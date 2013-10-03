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

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind;

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
 * An implementation of the model object '<em><b>Extends Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl#getExtendedModelicaClass <em>Extended Modelica Class</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl#getFrom_modelica_standard_library <em>From modelica standard library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendsClauseImpl extends EObjectImpl implements ExtendsClause {
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
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arraySize;

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
	 * The cached value of the '{@link #getExtendedModelicaClass() <em>Extended Modelica Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedModelicaClass()
	 * @generated
	 * @ordered
	 */
	protected ModelicaClassDefinition extendedModelicaClass;

	/**
	 * The default value of the '{@link #getFrom_modelica_standard_library() <em>From modelica standard library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_modelica_standard_library()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_MODELICA_STANDARD_LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom_modelica_standard_library() <em>From modelica standard library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom_modelica_standard_library()
	 * @generated
	 * @ordered
	 */
	protected String from_modelica_standard_library = FROM_MODELICA_STANDARD_LIBRARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendsClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelicaPackage.Literals.EXTENDS_CLAUSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.EXTENDS_CLAUSE__MODIFICATION, oldModification, modification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArraySize() {
		if (arraySize == null) {
			arraySize = new EDataTypeUniqueEList<String>(String.class, this, ModelicaPackage.EXTENDS_CLAUSE__ARRAY_SIZE);
		}
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition getOwnerModelicaClassDefinition() {
		if (eContainerFeatureID() != ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION) return null;
		return (ModelicaClassDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerModelicaClassDefinition, ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition) {
		if (newOwnerModelicaClassDefinition != eInternalContainer() || (eContainerFeatureID() != ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION && newOwnerModelicaClassDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerModelicaClassDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerModelicaClassDefinition != null)
				msgs = ((InternalEObject)newOwnerModelicaClassDefinition).eInverseAdd(this, ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS, ModelicaClassDefinition.class, msgs);
			msgs = basicSetOwnerModelicaClassDefinition(newOwnerModelicaClassDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION, newOwnerModelicaClassDefinition, newOwnerModelicaClassDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.EXTENDS_CLAUSE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition getExtendedModelicaClass() {
		if (extendedModelicaClass != null && extendedModelicaClass.eIsProxy()) {
			InternalEObject oldExtendedModelicaClass = (InternalEObject)extendedModelicaClass;
			extendedModelicaClass = (ModelicaClassDefinition)eResolveProxy(oldExtendedModelicaClass);
			if (extendedModelicaClass != oldExtendedModelicaClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelicaPackage.EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS, oldExtendedModelicaClass, extendedModelicaClass));
			}
		}
		return extendedModelicaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition basicGetExtendedModelicaClass() {
		return extendedModelicaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedModelicaClass(ModelicaClassDefinition newExtendedModelicaClass) {
		ModelicaClassDefinition oldExtendedModelicaClass = extendedModelicaClass;
		extendedModelicaClass = newExtendedModelicaClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS, oldExtendedModelicaClass, extendedModelicaClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom_modelica_standard_library() {
		return from_modelica_standard_library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom_modelica_standard_library(String newFrom_modelica_standard_library) {
		String oldFrom_modelica_standard_library = from_modelica_standard_library;
		from_modelica_standard_library = newFrom_modelica_standard_library;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY, oldFrom_modelica_standard_library, from_modelica_standard_library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION:
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
			case ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION:
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
			case ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION:
				return eInternalContainer().eInverseRemove(this, ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS, ModelicaClassDefinition.class, msgs);
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
			case ModelicaPackage.EXTENDS_CLAUSE__MODIFICATION:
				return getModification();
			case ModelicaPackage.EXTENDS_CLAUSE__ARRAY_SIZE:
				return getArraySize();
			case ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition();
			case ModelicaPackage.EXTENDS_CLAUSE__VISIBILITY:
				return getVisibility();
			case ModelicaPackage.EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS:
				if (resolve) return getExtendedModelicaClass();
				return basicGetExtendedModelicaClass();
			case ModelicaPackage.EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY:
				return getFrom_modelica_standard_library();
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
			case ModelicaPackage.EXTENDS_CLAUSE__MODIFICATION:
				setModification((String)newValue);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__ARRAY_SIZE:
				getArraySize().clear();
				getArraySize().addAll((Collection<? extends String>)newValue);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)newValue);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS:
				setExtendedModelicaClass((ModelicaClassDefinition)newValue);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY:
				setFrom_modelica_standard_library((String)newValue);
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
			case ModelicaPackage.EXTENDS_CLAUSE__MODIFICATION:
				setModification(MODIFICATION_EDEFAULT);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__ARRAY_SIZE:
				getArraySize().clear();
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)null);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS:
				setExtendedModelicaClass((ModelicaClassDefinition)null);
				return;
			case ModelicaPackage.EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY:
				setFrom_modelica_standard_library(FROM_MODELICA_STANDARD_LIBRARY_EDEFAULT);
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
			case ModelicaPackage.EXTENDS_CLAUSE__MODIFICATION:
				return MODIFICATION_EDEFAULT == null ? modification != null : !MODIFICATION_EDEFAULT.equals(modification);
			case ModelicaPackage.EXTENDS_CLAUSE__ARRAY_SIZE:
				return arraySize != null && !arraySize.isEmpty();
			case ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition() != null;
			case ModelicaPackage.EXTENDS_CLAUSE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case ModelicaPackage.EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS:
				return extendedModelicaClass != null;
			case ModelicaPackage.EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY:
				return FROM_MODELICA_STANDARD_LIBRARY_EDEFAULT == null ? from_modelica_standard_library != null : !FROM_MODELICA_STANDARD_LIBRARY_EDEFAULT.equals(from_modelica_standard_library);
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
		result.append(" (modification: ");
		result.append(modification);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", from_modelica_standard_library: ");
		result.append(from_modelica_standard_library);
		result.append(')');
		return result.toString();
	}

} //ExtendsClauseImpl
