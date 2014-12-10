/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage;
import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Extends</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl#getBase_Generalization <em>Base Generalization</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl#getArraySize <em>Array Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaExtendsImpl extends MinimalEObjectImpl.Container implements ModelicaExtends {
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
	 * The cached value of the '{@link #getBase_Generalization() <em>Base Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Generalization()
	 * @generated
	 * @ordered
	 */
	protected Generalization base_Generalization;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC_LITERAL;

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
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arraySize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaExtendsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassesPackage.Literals.MODELICA_EXTENDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModification() {
		if (modification == null) {
			modification = new EDataTypeUniqueEList<String>(String.class, this, ClassesPackage.MODELICA_EXTENDS__MODIFICATION);
		}
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getBase_Generalization() {
		if (base_Generalization != null && base_Generalization.eIsProxy()) {
			InternalEObject oldBase_Generalization = (InternalEObject)base_Generalization;
			base_Generalization = (Generalization)eResolveProxy(oldBase_Generalization);
			if (base_Generalization != oldBase_Generalization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassesPackage.MODELICA_EXTENDS__BASE_GENERALIZATION, oldBase_Generalization, base_Generalization));
			}
		}
		return base_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetBase_Generalization() {
		return base_Generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Generalization(Generalization newBase_Generalization) {
		Generalization oldBase_Generalization = base_Generalization;
		base_Generalization = newBase_Generalization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.MODELICA_EXTENDS__BASE_GENERALIZATION, oldBase_Generalization, base_Generalization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassesPackage.MODELICA_EXTENDS__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArraySize() {
		if (arraySize == null) {
			arraySize = new EDataTypeUniqueEList<String>(String.class, this, ClassesPackage.MODELICA_EXTENDS__ARRAY_SIZE);
		}
		return arraySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassesPackage.MODELICA_EXTENDS__MODIFICATION:
				return getModification();
			case ClassesPackage.MODELICA_EXTENDS__BASE_GENERALIZATION:
				if (resolve) return getBase_Generalization();
				return basicGetBase_Generalization();
			case ClassesPackage.MODELICA_EXTENDS__VISIBILITY:
				return getVisibility();
			case ClassesPackage.MODELICA_EXTENDS__ARRAY_SIZE:
				return getArraySize();
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
			case ClassesPackage.MODELICA_EXTENDS__MODIFICATION:
				getModification().clear();
				getModification().addAll((Collection<? extends String>)newValue);
				return;
			case ClassesPackage.MODELICA_EXTENDS__BASE_GENERALIZATION:
				setBase_Generalization((Generalization)newValue);
				return;
			case ClassesPackage.MODELICA_EXTENDS__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case ClassesPackage.MODELICA_EXTENDS__ARRAY_SIZE:
				getArraySize().clear();
				getArraySize().addAll((Collection<? extends String>)newValue);
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
			case ClassesPackage.MODELICA_EXTENDS__MODIFICATION:
				getModification().clear();
				return;
			case ClassesPackage.MODELICA_EXTENDS__BASE_GENERALIZATION:
				setBase_Generalization((Generalization)null);
				return;
			case ClassesPackage.MODELICA_EXTENDS__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case ClassesPackage.MODELICA_EXTENDS__ARRAY_SIZE:
				getArraySize().clear();
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
			case ClassesPackage.MODELICA_EXTENDS__MODIFICATION:
				return modification != null && !modification.isEmpty();
			case ClassesPackage.MODELICA_EXTENDS__BASE_GENERALIZATION:
				return base_Generalization != null;
			case ClassesPackage.MODELICA_EXTENDS__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case ClassesPackage.MODELICA_EXTENDS__ARRAY_SIZE:
				return arraySize != null && !arraySize.isEmpty();
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
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(')');
		return result.toString();
	}

} //ModelicaExtendsImpl
