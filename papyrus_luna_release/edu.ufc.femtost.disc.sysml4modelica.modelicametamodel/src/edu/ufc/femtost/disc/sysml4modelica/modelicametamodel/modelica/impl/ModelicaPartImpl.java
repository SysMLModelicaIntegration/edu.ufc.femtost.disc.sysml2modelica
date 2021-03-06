/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl#getType_part <em>Type part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl#getConstrainedBy <em>Constrained By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaPartImpl extends ModelicaComponentImpl implements ModelicaPart {
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
	 * The cached value of the '{@link #getType_part() <em>Type part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_part()
	 * @generated
	 * @ordered
	 */
	protected ModelicaClassDefinition type_part;

	/**
	 * The cached value of the '{@link #getConstrainedBy() <em>Constrained By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedBy()
	 * @generated
	 * @ordered
	 */
	protected ConstrainedByClause constrainedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.MODELICA_PART;
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
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.MODELICA_PART__VISIBILITY, oldVisibility, visibility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.MODELICA_PART__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition getType_part() {
		if (type_part != null && type_part.eIsProxy()) {
			InternalEObject oldType_part = (InternalEObject)type_part;
			type_part = (ModelicaClassDefinition)eResolveProxy(oldType_part);
			if (type_part != oldType_part) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, modelicaPackage.MODELICA_PART__TYPE_PART, oldType_part, type_part));
			}
		}
		return type_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition basicGetType_part() {
		return type_part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_part(ModelicaClassDefinition newType_part) {
		ModelicaClassDefinition oldType_part = type_part;
		type_part = newType_part;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.MODELICA_PART__TYPE_PART, oldType_part, type_part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainedByClause getConstrainedBy() {
		return constrainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstrainedBy(ConstrainedByClause newConstrainedBy, NotificationChain msgs) {
		ConstrainedByClause oldConstrainedBy = constrainedBy;
		constrainedBy = newConstrainedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, modelicaPackage.MODELICA_PART__CONSTRAINED_BY, oldConstrainedBy, newConstrainedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrainedBy(ConstrainedByClause newConstrainedBy) {
		if (newConstrainedBy != constrainedBy) {
			NotificationChain msgs = null;
			if (constrainedBy != null)
				msgs = ((InternalEObject)constrainedBy).eInverseRemove(this, modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE, ConstrainedByClause.class, msgs);
			if (newConstrainedBy != null)
				msgs = ((InternalEObject)newConstrainedBy).eInverseAdd(this, modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE, ConstrainedByClause.class, msgs);
			msgs = basicSetConstrainedBy(newConstrainedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.MODELICA_PART__CONSTRAINED_BY, newConstrainedBy, newConstrainedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.MODELICA_PART__CONSTRAINED_BY:
				if (constrainedBy != null)
					msgs = ((InternalEObject)constrainedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - modelicaPackage.MODELICA_PART__CONSTRAINED_BY, null, msgs);
				return basicSetConstrainedBy((ConstrainedByClause)otherEnd, msgs);
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
			case modelicaPackage.MODELICA_PART__CONSTRAINED_BY:
				return basicSetConstrainedBy(null, msgs);
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
			case modelicaPackage.MODELICA_PART__VISIBILITY:
				return getVisibility();
			case modelicaPackage.MODELICA_PART__SCOPE:
				return getScope();
			case modelicaPackage.MODELICA_PART__TYPE_PART:
				if (resolve) return getType_part();
				return basicGetType_part();
			case modelicaPackage.MODELICA_PART__CONSTRAINED_BY:
				return getConstrainedBy();
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
			case modelicaPackage.MODELICA_PART__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case modelicaPackage.MODELICA_PART__SCOPE:
				setScope((ModelicaScopeKind)newValue);
				return;
			case modelicaPackage.MODELICA_PART__TYPE_PART:
				setType_part((ModelicaClassDefinition)newValue);
				return;
			case modelicaPackage.MODELICA_PART__CONSTRAINED_BY:
				setConstrainedBy((ConstrainedByClause)newValue);
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
			case modelicaPackage.MODELICA_PART__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case modelicaPackage.MODELICA_PART__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case modelicaPackage.MODELICA_PART__TYPE_PART:
				setType_part((ModelicaClassDefinition)null);
				return;
			case modelicaPackage.MODELICA_PART__CONSTRAINED_BY:
				setConstrainedBy((ConstrainedByClause)null);
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
			case modelicaPackage.MODELICA_PART__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case modelicaPackage.MODELICA_PART__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case modelicaPackage.MODELICA_PART__TYPE_PART:
				return type_part != null;
			case modelicaPackage.MODELICA_PART__CONSTRAINED_BY:
				return constrainedBy != null;
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
		result.append(", scope: ");
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //ModelicaPartImpl
