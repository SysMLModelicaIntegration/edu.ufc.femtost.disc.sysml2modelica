/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl#isReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaPartImpl extends MinimalEObjectImpl.Container implements ModelicaPart {
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
	 * The cached value of the '{@link #getModification() <em>Modification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modification;

	/**
	 * The default value of the '{@link #isReplaceable() <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReplaceable() <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceable()
	 * @generated
	 * @ordered
	 */
	protected boolean isReplaceable = IS_REPLACEABLE_EDEFAULT;

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
	 * The default value of the '{@link #isFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

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
		return ComponentsPackage.Literals.MODELICA_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArraySize() {
		if (arraySize == null) {
			arraySize = new EDataTypeUniqueEList<String>(String.class, this, ComponentsPackage.MODELICA_PART__ARRAY_SIZE);
		}
		return arraySize;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_PART__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModification() {
		if (modification == null) {
			modification = new EDataTypeUniqueEList<String>(String.class, this, ComponentsPackage.MODELICA_PART__MODIFICATION);
		}
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplaceable() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_PART__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_PART__CONDITIONAL_EXPRESSION, oldConditionalExpression, conditionalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFinal() {
		return this.base_Property.isLeaf();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsFinal(boolean newIsFinal) {
		this.base_Property.setIsLeaf(newIsFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.MODELICA_PART__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_PART__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.MODELICA_PART__ARRAY_SIZE:
				return getArraySize();
			case ComponentsPackage.MODELICA_PART__SCOPE:
				return getScope();
			case ComponentsPackage.MODELICA_PART__MODIFICATION:
				return getModification();
			case ComponentsPackage.MODELICA_PART__IS_REPLACEABLE:
				return isReplaceable();
			case ComponentsPackage.MODELICA_PART__CONDITIONAL_EXPRESSION:
				return getConditionalExpression();
			case ComponentsPackage.MODELICA_PART__IS_FINAL:
				return isFinal();
			case ComponentsPackage.MODELICA_PART__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
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
			case ComponentsPackage.MODELICA_PART__ARRAY_SIZE:
				getArraySize().clear();
				getArraySize().addAll((Collection<? extends String>)newValue);
				return;
			case ComponentsPackage.MODELICA_PART__SCOPE:
				setScope((ModelicaScopeKind)newValue);
				return;
			case ComponentsPackage.MODELICA_PART__MODIFICATION:
				getModification().clear();
				getModification().addAll((Collection<? extends String>)newValue);
				return;
			case ComponentsPackage.MODELICA_PART__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
				return;
			case ComponentsPackage.MODELICA_PART__CONDITIONAL_EXPRESSION:
				setConditionalExpression((String)newValue);
				return;
			case ComponentsPackage.MODELICA_PART__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case ComponentsPackage.MODELICA_PART__BASE_PROPERTY:
				setBase_Property((Property)newValue);
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
			case ComponentsPackage.MODELICA_PART__ARRAY_SIZE:
				getArraySize().clear();
				return;
			case ComponentsPackage.MODELICA_PART__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_PART__MODIFICATION:
				getModification().clear();
				return;
			case ComponentsPackage.MODELICA_PART__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_PART__CONDITIONAL_EXPRESSION:
				setConditionalExpression(CONDITIONAL_EXPRESSION_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_PART__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_PART__BASE_PROPERTY:
				setBase_Property((Property)null);
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
			case ComponentsPackage.MODELICA_PART__ARRAY_SIZE:
				return arraySize != null && !arraySize.isEmpty();
			case ComponentsPackage.MODELICA_PART__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case ComponentsPackage.MODELICA_PART__MODIFICATION:
				return modification != null && !modification.isEmpty();
			case ComponentsPackage.MODELICA_PART__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
			case ComponentsPackage.MODELICA_PART__CONDITIONAL_EXPRESSION:
				return CONDITIONAL_EXPRESSION_EDEFAULT == null ? conditionalExpression != null : !CONDITIONAL_EXPRESSION_EDEFAULT.equals(conditionalExpression);
			case ComponentsPackage.MODELICA_PART__IS_FINAL:
				return isFinal() != IS_FINAL_EDEFAULT;
			case ComponentsPackage.MODELICA_PART__BASE_PROPERTY:
				return base_Property != null;
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
		result.append(" (arraySize: ");
		result.append(arraySize);
		result.append(", scope: ");
		result.append(scope);
		result.append(", modification: ");
		result.append(modification);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(", conditionalExpression: ");
		result.append(conditionalExpression);
		result.append(')');
		return result.toString();
	}

} //ModelicaPartImpl
