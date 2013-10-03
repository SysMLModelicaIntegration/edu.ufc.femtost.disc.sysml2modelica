/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;
import edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaFlowFlagKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaVariabilityKind;

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
 * An implementation of the model object '<em><b>Modelica Value Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getCausality <em>Causality</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getVariability <em>Variability</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getFlowFlag <em>Flow Flag</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#isFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getConditionalExpression <em>Conditional Expression</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#isReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getDeclarationEquation <em>Declaration Equation</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelicaValuePropertyImpl extends MinimalEObjectImpl.Container implements ModelicaValueProperty {
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
	 * The default value of the '{@link #getFlowFlag() <em>Flow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowFlag()
	 * @generated
	 * @ordered
	 */
	protected static final ModelicaFlowFlagKind FLOW_FLAG_EDEFAULT = ModelicaFlowFlagKind.NONE;

	/**
	 * The cached value of the '{@link #getFlowFlag() <em>Flow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowFlag()
	 * @generated
	 * @ordered
	 */
	protected ModelicaFlowFlagKind flowFlag = FLOW_FLAG_EDEFAULT;

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
	 * The default value of the '{@link #isFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

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
	 * The cached value of the '{@link #getArraySize() <em>Array Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySize()
	 * @generated
	 * @ordered
	 */
	protected EList<String> arraySize;

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
	protected ModelicaValuePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.MODELICA_VALUE_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__CAUSALITY, oldCausality, causality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__VARIABILITY, oldVariability, variability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFlowFlagKind getFlowFlag() {
		return flowFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowFlag(ModelicaFlowFlagKind newFlowFlag) {
		ModelicaFlowFlagKind oldFlowFlag = flowFlag;
		flowFlag = newFlowFlag == null ? FLOW_FLAG_EDEFAULT : newFlowFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG, oldFlowFlag, flowFlag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__SCOPE, oldScope, scope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION, oldConditionalExpression, conditionalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getModification() {
		if (modification == null) {
			modification = new EDataTypeUniqueEList<String>(String.class, this, ComponentsPackage.MODELICA_VALUE_PROPERTY__MODIFICATION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION, oldDeclarationEquation, declarationEquation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getArraySize() {
		if (arraySize == null) {
			arraySize = new EDataTypeUniqueEList<String>(String.class, this, ComponentsPackage.MODELICA_VALUE_PROPERTY__ARRAY_SIZE);
		}
		return arraySize;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.MODELICA_VALUE_PROPERTY__BASE_PROPERTY, oldBase_Property, base_Property));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.MODELICA_VALUE_PROPERTY__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				return getCausality();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				return getVariability();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				return getFlowFlag();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				return getScope();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_FINAL:
				return isFinal();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION:
				return getConditionalExpression();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__MODIFICATION:
				return getModification();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_REPLACEABLE:
				return isReplaceable();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION:
				return getDeclarationEquation();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__ARRAY_SIZE:
				return getArraySize();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__BASE_PROPERTY:
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
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				setCausality((ModelicaCausalityKind)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				setVariability((ModelicaVariabilityKind)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				setFlowFlag((ModelicaFlowFlagKind)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				setScope((ModelicaScopeKind)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION:
				setConditionalExpression((String)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__MODIFICATION:
				getModification().clear();
				getModification().addAll((Collection<? extends String>)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION:
				setDeclarationEquation((String)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__ARRAY_SIZE:
				getArraySize().clear();
				getArraySize().addAll((Collection<? extends String>)newValue);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__BASE_PROPERTY:
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
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				setCausality(CAUSALITY_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				setVariability(VARIABILITY_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				setFlowFlag(FLOW_FLAG_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION:
				setConditionalExpression(CONDITIONAL_EXPRESSION_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__MODIFICATION:
				getModification().clear();
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION:
				setDeclarationEquation(DECLARATION_EQUATION_EDEFAULT);
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__ARRAY_SIZE:
				getArraySize().clear();
				return;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__BASE_PROPERTY:
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
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CAUSALITY:
				return causality != CAUSALITY_EDEFAULT;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__VARIABILITY:
				return variability != VARIABILITY_EDEFAULT;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__FLOW_FLAG:
				return flowFlag != FLOW_FLAG_EDEFAULT;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_FINAL:
				return isFinal() != IS_FINAL_EDEFAULT;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION:
				return CONDITIONAL_EXPRESSION_EDEFAULT == null ? conditionalExpression != null : !CONDITIONAL_EXPRESSION_EDEFAULT.equals(conditionalExpression);
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__MODIFICATION:
				return modification != null && !modification.isEmpty();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION:
				return DECLARATION_EQUATION_EDEFAULT == null ? declarationEquation != null : !DECLARATION_EQUATION_EDEFAULT.equals(declarationEquation);
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__ARRAY_SIZE:
				return arraySize != null && !arraySize.isEmpty();
			case ComponentsPackage.MODELICA_VALUE_PROPERTY__BASE_PROPERTY:
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
		result.append(" (causality: ");
		result.append(causality);
		result.append(", variability: ");
		result.append(variability);
		result.append(", flowFlag: ");
		result.append(flowFlag);
		result.append(", scope: ");
		result.append(scope);
		result.append(", conditionalExpression: ");
		result.append(conditionalExpression);
		result.append(", modification: ");
		result.append(modification);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(", declarationEquation: ");
		result.append(declarationEquation);
		result.append(", arraySize: ");
		result.append(arraySize);
		result.append(')');
		return result.toString();
	}

} //ModelicaValuePropertyImpl
