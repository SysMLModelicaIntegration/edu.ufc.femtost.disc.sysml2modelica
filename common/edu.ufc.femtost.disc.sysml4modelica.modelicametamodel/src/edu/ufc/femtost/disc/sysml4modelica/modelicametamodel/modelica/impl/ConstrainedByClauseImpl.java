/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrained By Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl#getOwnerInstance <em>Owner Instance</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl#getInstanceForConstrainedBy <em>Instance For Constrained By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstrainedByClauseImpl extends EObjectImpl implements ConstrainedByClause {
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
	 * The cached value of the '{@link #getInstanceForConstrainedBy() <em>Instance For Constrained By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceForConstrainedBy()
	 * @generated
	 * @ordered
	 */
	protected ModelicaPart instanceForConstrainedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainedByClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MoPackage.Literals.CONSTRAINED_BY_CLAUSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION, oldModification, modification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart getOwnerInstance() {
		if (eContainerFeatureID() != MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE) return null;
		return (ModelicaPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerInstance(ModelicaPart newOwnerInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerInstance, MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerInstance(ModelicaPart newOwnerInstance) {
		if (newOwnerInstance != eInternalContainer() || (eContainerFeatureID() != MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE && newOwnerInstance != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerInstance != null)
				msgs = ((InternalEObject)newOwnerInstance).eInverseAdd(this, MoPackage.MODELICA_PART__CONSTRAINED_BY, ModelicaPart.class, msgs);
			msgs = basicSetOwnerInstance(newOwnerInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE, newOwnerInstance, newOwnerInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart getInstanceForConstrainedBy() {
		if (instanceForConstrainedBy != null && instanceForConstrainedBy.eIsProxy()) {
			InternalEObject oldInstanceForConstrainedBy = (InternalEObject)instanceForConstrainedBy;
			instanceForConstrainedBy = (ModelicaPart)eResolveProxy(oldInstanceForConstrainedBy);
			if (instanceForConstrainedBy != oldInstanceForConstrainedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MoPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY, oldInstanceForConstrainedBy, instanceForConstrainedBy));
			}
		}
		return instanceForConstrainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart basicGetInstanceForConstrainedBy() {
		return instanceForConstrainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceForConstrainedBy(ModelicaPart newInstanceForConstrainedBy) {
		ModelicaPart oldInstanceForConstrainedBy = instanceForConstrainedBy;
		instanceForConstrainedBy = newInstanceForConstrainedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MoPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY, oldInstanceForConstrainedBy, instanceForConstrainedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerInstance((ModelicaPart)otherEnd, msgs);
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
			case MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return basicSetOwnerInstance(null, msgs);
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
			case MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return eInternalContainer().eInverseRemove(this, MoPackage.MODELICA_PART__CONSTRAINED_BY, ModelicaPart.class, msgs);
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
			case MoPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				return getModification();
			case MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return getOwnerInstance();
			case MoPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				if (resolve) return getInstanceForConstrainedBy();
				return basicGetInstanceForConstrainedBy();
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
			case MoPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				setModification((String)newValue);
				return;
			case MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				setOwnerInstance((ModelicaPart)newValue);
				return;
			case MoPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				setInstanceForConstrainedBy((ModelicaPart)newValue);
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
			case MoPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				setModification(MODIFICATION_EDEFAULT);
				return;
			case MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				setOwnerInstance((ModelicaPart)null);
				return;
			case MoPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				setInstanceForConstrainedBy((ModelicaPart)null);
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
			case MoPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				return MODIFICATION_EDEFAULT == null ? modification != null : !MODIFICATION_EDEFAULT.equals(modification);
			case MoPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return getOwnerInstance() != null;
			case MoPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				return instanceForConstrainedBy != null;
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
		result.append(')');
		return result.toString();
	}

} //ConstrainedByClauseImpl
