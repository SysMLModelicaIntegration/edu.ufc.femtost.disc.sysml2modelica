/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl#isReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl#getArraySize <em>Array Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaPortImpl extends EObjectImpl implements ModelicaPort {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

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
	 * The default value of the '{@link #isFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

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
	 * The default value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRAY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected String arraySize = ARRAY_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return componentsPackage.Literals.MODELICA_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, componentsPackage.MODELICA_PORT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_PORT__BASE_PORT, oldBase_Port, base_Port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_PORT__CAUSALITY, oldCausality, causality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_PORT__CONDITIONAL_EXPRESSION, oldConditionalExpression, conditionalExpression));
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
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_PORT__MODIFICATION, oldModification, modification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_PORT__IS_FINAL, oldIsFinal, isFinal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_PORT__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArraySize() {
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySize(String newArraySize) {
		String oldArraySize = arraySize;
		arraySize = newArraySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_PORT__ARRAY_SIZE, oldArraySize, arraySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case componentsPackage.MODELICA_PORT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case componentsPackage.MODELICA_PORT__CAUSALITY:
				return getCausality();
			case componentsPackage.MODELICA_PORT__CONDITIONAL_EXPRESSION:
				return getConditionalExpression();
			case componentsPackage.MODELICA_PORT__MODIFICATION:
				return getModification();
			case componentsPackage.MODELICA_PORT__IS_FINAL:
				return isFinal();
			case componentsPackage.MODELICA_PORT__IS_REPLACEABLE:
				return isReplaceable();
			case componentsPackage.MODELICA_PORT__ARRAY_SIZE:
				return getArraySize();
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
			case componentsPackage.MODELICA_PORT__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case componentsPackage.MODELICA_PORT__CAUSALITY:
				setCausality((ModelicaCausalityKind)newValue);
				return;
			case componentsPackage.MODELICA_PORT__CONDITIONAL_EXPRESSION:
				setConditionalExpression((String)newValue);
				return;
			case componentsPackage.MODELICA_PORT__MODIFICATION:
				setModification((String)newValue);
				return;
			case componentsPackage.MODELICA_PORT__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case componentsPackage.MODELICA_PORT__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
				return;
			case componentsPackage.MODELICA_PORT__ARRAY_SIZE:
				setArraySize((String)newValue);
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
			case componentsPackage.MODELICA_PORT__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case componentsPackage.MODELICA_PORT__CAUSALITY:
				setCausality(CAUSALITY_EDEFAULT);
				return;
			case componentsPackage.MODELICA_PORT__CONDITIONAL_EXPRESSION:
				setConditionalExpression(CONDITIONAL_EXPRESSION_EDEFAULT);
				return;
			case componentsPackage.MODELICA_PORT__MODIFICATION:
				setModification(MODIFICATION_EDEFAULT);
				return;
			case componentsPackage.MODELICA_PORT__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case componentsPackage.MODELICA_PORT__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
				return;
			case componentsPackage.MODELICA_PORT__ARRAY_SIZE:
				setArraySize(ARRAY_SIZE_EDEFAULT);
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
			case componentsPackage.MODELICA_PORT__BASE_PORT:
				return base_Port != null;
			case componentsPackage.MODELICA_PORT__CAUSALITY:
				return causality != CAUSALITY_EDEFAULT;
			case componentsPackage.MODELICA_PORT__CONDITIONAL_EXPRESSION:
				return CONDITIONAL_EXPRESSION_EDEFAULT == null ? conditionalExpression != null : !CONDITIONAL_EXPRESSION_EDEFAULT.equals(conditionalExpression);
			case componentsPackage.MODELICA_PORT__MODIFICATION:
				return MODIFICATION_EDEFAULT == null ? modification != null : !MODIFICATION_EDEFAULT.equals(modification);
			case componentsPackage.MODELICA_PORT__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case componentsPackage.MODELICA_PORT__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
			case componentsPackage.MODELICA_PORT__ARRAY_SIZE:
				return ARRAY_SIZE_EDEFAULT == null ? arraySize != null : !ARRAY_SIZE_EDEFAULT.equals(arraySize);
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
		result.append(" (causality: ");
		result.append(causality);
		result.append(", conditionalExpression: ");
		result.append(conditionalExpression);
		result.append(", modification: ");
		result.append(modification);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(')');
		return result.toString();
	}

} //ModelicaPortImpl
