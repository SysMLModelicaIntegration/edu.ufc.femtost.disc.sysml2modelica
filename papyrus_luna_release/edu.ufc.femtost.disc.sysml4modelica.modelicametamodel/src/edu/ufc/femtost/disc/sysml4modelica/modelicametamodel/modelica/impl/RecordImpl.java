/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.StateMachineElementType;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.RecordImpl#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordImpl extends ModelicaClassDefinitionImpl implements Record {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition getOwnerModelicaClassDefinition() {
		if (eContainerFeatureID() != modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION) return null;
		return (ModelicaClassDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerModelicaClassDefinition, modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition) {
		if (newOwnerModelicaClassDefinition != eInternalContainer() || (eContainerFeatureID() != modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION && newOwnerModelicaClassDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerModelicaClassDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerModelicaClassDefinition != null)
				msgs = ((InternalEObject)newOwnerModelicaClassDefinition).eInverseAdd(this, modelicaPackage.MODELICA_CLASS_DEFINITION__RECORDS, ModelicaClassDefinition.class, msgs);
			msgs = basicSetOwnerModelicaClassDefinition(newOwnerModelicaClassDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION, newOwnerModelicaClassDefinition, newOwnerModelicaClassDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION:
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
			case modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION:
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
			case modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION:
				return eInternalContainer().eInverseRemove(this, modelicaPackage.MODELICA_CLASS_DEFINITION__RECORDS, ModelicaClassDefinition.class, msgs);
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
			case modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition();
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
			case modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)newValue);
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
			case modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)null);
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
			case modelicaPackage.RECORD__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //RecordImpl
