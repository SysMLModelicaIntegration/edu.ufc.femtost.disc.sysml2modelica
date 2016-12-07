/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EnumerationImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends TypeImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> enumerationLiterals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getEnumerationLiterals() {
		if (enumerationLiterals == null) {
			enumerationLiterals = new EObjectContainmentWithInverseEList<EnumerationLiteral>(EnumerationLiteral.class, this, modelicaPackage.ENUMERATION__ENUMERATION_LITERALS, modelicaPackage.ENUMERATION_LITERAL__ENUMERATION);
		}
		return enumerationLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.ENUMERATION__ENUMERATION_LITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerationLiterals()).basicAdd(otherEnd, msgs);
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
			case modelicaPackage.ENUMERATION__ENUMERATION_LITERALS:
				return ((InternalEList<?>)getEnumerationLiterals()).basicRemove(otherEnd, msgs);
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
			case modelicaPackage.ENUMERATION__ENUMERATION_LITERALS:
				return getEnumerationLiterals();
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
			case modelicaPackage.ENUMERATION__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
				getEnumerationLiterals().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case modelicaPackage.ENUMERATION__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
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
			case modelicaPackage.ENUMERATION__ENUMERATION_LITERALS:
				return enumerationLiterals != null && !enumerationLiterals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationImpl
