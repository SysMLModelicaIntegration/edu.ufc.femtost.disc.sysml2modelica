/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl#isPartial <em>Is Partial</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl#isModelicaEncapsulated <em>Is Modelica Encapsulated</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl#isReplaceable <em>Is Replaceable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelicaClassDefinitionImpl extends EObjectImpl implements ModelicaClassDefinition {
	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

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
	 * The default value of the '{@link #isPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartial = IS_PARTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isModelicaEncapsulated() <em>Is Modelica Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelicaEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODELICA_ENCAPSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isModelicaEncapsulated() <em>Is Modelica Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelicaEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean isModelicaEncapsulated = IS_MODELICA_ENCAPSULATED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaClassDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return classesPackage.Literals.MODELICA_CLASS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, classesPackage.MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_CLASS_DEFINITION__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartial() {
		return isPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartial(boolean newIsPartial) {
		boolean oldIsPartial = isPartial;
		isPartial = newIsPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL, oldIsPartial, isPartial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isModelicaEncapsulated() {
		return isModelicaEncapsulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsModelicaEncapsulated(boolean newIsModelicaEncapsulated) {
		boolean oldIsModelicaEncapsulated = isModelicaEncapsulated;
		isModelicaEncapsulated = newIsModelicaEncapsulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED, oldIsModelicaEncapsulated, isModelicaEncapsulated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, classesPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case classesPackage.MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				return isFinal();
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				return isPartial();
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				return isModelicaEncapsulated();
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				return isReplaceable();
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
			case classesPackage.MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				setIsPartial((Boolean)newValue);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				setIsModelicaEncapsulated((Boolean)newValue);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
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
			case classesPackage.MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				setIsPartial(IS_PARTIAL_EDEFAULT);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				setIsModelicaEncapsulated(IS_MODELICA_ENCAPSULATED_EDEFAULT);
				return;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
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
			case classesPackage.MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER:
				return base_Classifier != null;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				return isPartial != IS_PARTIAL_EDEFAULT;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				return isModelicaEncapsulated != IS_MODELICA_ENCAPSULATED_EDEFAULT;
			case classesPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
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
		result.append(" (isFinal: ");
		result.append(isFinal);
		result.append(", isPartial: ");
		result.append(isPartial);
		result.append(", isModelicaEncapsulated: ");
		result.append(isModelicaEncapsulated);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(')');
		return result.toString();
	}

} //ModelicaClassDefinitionImpl
