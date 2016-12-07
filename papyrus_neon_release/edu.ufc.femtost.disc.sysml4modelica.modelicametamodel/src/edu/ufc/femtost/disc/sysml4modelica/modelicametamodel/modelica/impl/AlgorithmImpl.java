/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmImpl#getBody <em>Body</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmImpl#getAlgorithmsection <em>Algorithmsection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgorithmImpl extends EObjectImpl implements Algorithm {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.ALGORITHM__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmSection getAlgorithmsection() {
		if (eContainerFeatureID() != modelicaPackage.ALGORITHM__ALGORITHMSECTION) return null;
		return (AlgorithmSection)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithmsection(AlgorithmSection newAlgorithmsection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAlgorithmsection, modelicaPackage.ALGORITHM__ALGORITHMSECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmsection(AlgorithmSection newAlgorithmsection) {
		if (newAlgorithmsection != eInternalContainer() || (eContainerFeatureID() != modelicaPackage.ALGORITHM__ALGORITHMSECTION && newAlgorithmsection != null)) {
			if (EcoreUtil.isAncestor(this, newAlgorithmsection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAlgorithmsection != null)
				msgs = ((InternalEObject)newAlgorithmsection).eInverseAdd(this, modelicaPackage.ALGORITHM_SECTION__ALGORITHM, AlgorithmSection.class, msgs);
			msgs = basicSetAlgorithmsection(newAlgorithmsection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.ALGORITHM__ALGORITHMSECTION, newAlgorithmsection, newAlgorithmsection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.ALGORITHM__ALGORITHMSECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAlgorithmsection((AlgorithmSection)otherEnd, msgs);
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
			case modelicaPackage.ALGORITHM__ALGORITHMSECTION:
				return basicSetAlgorithmsection(null, msgs);
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
			case modelicaPackage.ALGORITHM__ALGORITHMSECTION:
				return eInternalContainer().eInverseRemove(this, modelicaPackage.ALGORITHM_SECTION__ALGORITHM, AlgorithmSection.class, msgs);
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
			case modelicaPackage.ALGORITHM__BODY:
				return getBody();
			case modelicaPackage.ALGORITHM__ALGORITHMSECTION:
				return getAlgorithmsection();
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
			case modelicaPackage.ALGORITHM__BODY:
				setBody((String)newValue);
				return;
			case modelicaPackage.ALGORITHM__ALGORITHMSECTION:
				setAlgorithmsection((AlgorithmSection)newValue);
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
			case modelicaPackage.ALGORITHM__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case modelicaPackage.ALGORITHM__ALGORITHMSECTION:
				setAlgorithmsection((AlgorithmSection)null);
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
			case modelicaPackage.ALGORITHM__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case modelicaPackage.ALGORITHM__ALGORITHMSECTION:
				return getAlgorithmsection() != null;
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
		result.append(" (body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //AlgorithmImpl
