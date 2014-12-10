/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.EquationsandalgorithmsPackage;
import edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.ModelicaAlgorithm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Behavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaAlgorithmImpl#isInitial <em>Is Initial</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.equationsandalgorithms.impl.ModelicaAlgorithmImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaAlgorithmImpl extends MinimalEObjectImpl.Container implements ModelicaAlgorithm {
	/**
	 * The default value of the '{@link #isInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitial() <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitial()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitial = IS_INITIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EquationsandalgorithmsPackage.Literals.MODELICA_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitial() {
		return isInitial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		boolean oldIsInitial = isInitial;
		isInitial = newIsInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquationsandalgorithmsPackage.MODELICA_ALGORITHM__IS_INITIAL, oldIsInitial, isInitial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EquationsandalgorithmsPackage.MODELICA_ALGORITHM__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EquationsandalgorithmsPackage.MODELICA_ALGORITHM__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__IS_INITIAL:
				return isInitial();
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
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
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__IS_INITIAL:
				setIsInitial((Boolean)newValue);
				return;
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
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
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__IS_INITIAL:
				setIsInitial(IS_INITIAL_EDEFAULT);
				return;
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
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
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__IS_INITIAL:
				return isInitial != IS_INITIAL_EDEFAULT;
			case EquationsandalgorithmsPackage.MODELICA_ALGORITHM__BASE_BEHAVIOR:
				return base_Behavior != null;
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
		result.append(" (isInitial: ");
		result.append(isInitial);
		result.append(')');
		return result.toString();
	}

} //ModelicaAlgorithmImpl
