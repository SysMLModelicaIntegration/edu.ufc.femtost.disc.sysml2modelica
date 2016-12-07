/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.componentsPackage;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#getDeclarationEquation <em>Declaration Equation</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#isReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl#getArraySize <em>Array Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelicaFunctionParameterImpl extends MinimalEObjectImpl.Container implements ModelicaFunctionParameter {
	/**
	 * The cached value of the '{@link #getBase_Parameter() <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Parameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter base_Parameter;

	/**
	 * The default value of the '{@link #getDeclarationEquation() <em>Declaration Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationEquation()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_EQUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclarationEquation() <em>Declaration Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationEquation()
	 * @generated
	 * @ordered
	 */
	protected String declarationEquation = DECLARATION_EQUATION_EDEFAULT;

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
	 * The default value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaVariabilityKind VARIABILITY_EDEFAULT = ModelicaVariabilityKind.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getVariability() <em>Variability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariability()
	 * @generated
	 * @ordered
	 */
	protected ModelicaVariabilityKind variability = VARIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCausality() <em>Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausality()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaCausalityKind CAUSALITY_EDEFAULT = ModelicaCausalityKind.INPUT;

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
	 * The default value of the '{@link #isFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

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
	protected ModelicaFunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return componentsPackage.Literals.MODELICA_FUNCTION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getBase_Parameter() {
		if (base_Parameter != null && base_Parameter.eIsProxy()) {
			InternalEObject oldBase_Parameter = (InternalEObject)base_Parameter;
			base_Parameter = (Parameter)eResolveProxy(oldBase_Parameter);
			if (base_Parameter != oldBase_Parameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, componentsPackage.MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
			}
		}
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetBase_Parameter() {
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Parameter(Parameter newBase_Parameter) {
		Parameter oldBase_Parameter = base_Parameter;
		base_Parameter = newBase_Parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclarationEquation() {
		return declarationEquation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarationEquation(String newDeclarationEquation) {
		String oldDeclarationEquation = declarationEquation;
		declarationEquation = newDeclarationEquation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION, oldDeclarationEquation, declarationEquation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaVariabilityKind getVariability() {
		return variability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariability(ModelicaVariabilityKind newVariability) {
		ModelicaVariabilityKind oldVariability = variability;
		variability = newVariability == null ? VARIABILITY_EDEFAULT : newVariability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY, oldVariability, variability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, componentsPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY, oldCausality, causality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		// TODO: implement this method to return the 'Is Final' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		// TODO: implement this method to set the 'Is Final' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModification() {
		if (modification == null) {
			modification = new EDataTypeUniqueEList<String>(String.class, this, componentsPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION);
		}
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArraySize() {
		if (arraySize == null) {
			arraySize = new EDataTypeUniqueEList<String>(String.class, this, componentsPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE);
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
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER:
				if (resolve) return getBase_Parameter();
				return basicGetBase_Parameter();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				return getDeclarationEquation();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				return isReplaceable();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				return getVariability();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				return getCausality();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				return isFinal();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				return getModification();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
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
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER:
				setBase_Parameter((Parameter)newValue);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				setDeclarationEquation((String)newValue);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				setVariability((ModelicaVariabilityKind)newValue);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				setCausality((ModelicaCausalityKind)newValue);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				getModification().clear();
				getModification().addAll((Collection<? extends String>)newValue);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
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
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER:
				setBase_Parameter((Parameter)null);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				setDeclarationEquation(DECLARATION_EQUATION_EDEFAULT);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				setVariability(VARIABILITY_EDEFAULT);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				setCausality(CAUSALITY_EDEFAULT);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				getModification().clear();
				return;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
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
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER:
				return base_Parameter != null;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION:
				return DECLARATION_EQUATION_EDEFAULT == null ? declarationEquation != null : !DECLARATION_EQUATION_EDEFAULT.equals(declarationEquation);
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__VARIABILITY:
				return variability != VARIABILITY_EDEFAULT;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__CAUSALITY:
				return causality != CAUSALITY_EDEFAULT;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__IS_FINAL:
				return isFinal() != IS_FINAL_EDEFAULT;
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__MODIFICATION:
				return modification != null && !modification.isEmpty();
			case componentsPackage.MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE:
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
		result.append(" (declarationEquation: ");
		result.append(declarationEquation);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(", variability: ");
		result.append(variability);
		result.append(", causality: ");
		result.append(causality);
		result.append(", modification: ");
		result.append(modification);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(')');
		return result.toString();
	}

} //ModelicaFunctionParameterImpl
