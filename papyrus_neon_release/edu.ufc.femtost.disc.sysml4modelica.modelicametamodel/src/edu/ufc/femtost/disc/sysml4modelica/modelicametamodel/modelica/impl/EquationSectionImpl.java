/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equation Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationSectionImpl#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationSectionImpl#getEquations <em>Equations</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationSectionImpl#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquationSectionImpl extends EObjectImpl implements EquationSection {
	/**
	 * The cached value of the '{@link #getEquations() <em>Equations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquations()
	 * @generated
	 * @ordered
	 */
	protected EList<Equation> equations;

	/**
	 * The cached value of the '{@link #getConnects() <em>Connects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnects()
	 * @generated
	 * @ordered
	 */
	protected EList<Connect> connects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.EQUATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClassDefinition getOwnerModelicaClassDefinition() {
		if (eContainerFeatureID() != modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION) return null;
		return (ModelicaClassDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerModelicaClassDefinition, modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerModelicaClassDefinition(ModelicaClassDefinition newOwnerModelicaClassDefinition) {
		if (newOwnerModelicaClassDefinition != eInternalContainer() || (eContainerFeatureID() != modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION && newOwnerModelicaClassDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerModelicaClassDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerModelicaClassDefinition != null)
				msgs = ((InternalEObject)newOwnerModelicaClassDefinition).eInverseAdd(this, modelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION, ModelicaClassDefinition.class, msgs);
			msgs = basicSetOwnerModelicaClassDefinition(newOwnerModelicaClassDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION, newOwnerModelicaClassDefinition, newOwnerModelicaClassDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Equation> getEquations() {
		if (equations == null) {
			equations = new EObjectContainmentWithInverseEList<Equation>(Equation.class, this, modelicaPackage.EQUATION_SECTION__EQUATIONS, modelicaPackage.EQUATION__OWNER_EQUATION_SECTION);
		}
		return equations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connect> getConnects() {
		if (connects == null) {
			connects = new EObjectContainmentWithInverseEList<Connect>(Connect.class, this, modelicaPackage.EQUATION_SECTION__CONNECTS, modelicaPackage.CONNECT__OWNER_EQUATION_SECTION);
		}
		return connects;
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
			case modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerModelicaClassDefinition((ModelicaClassDefinition)otherEnd, msgs);
			case modelicaPackage.EQUATION_SECTION__EQUATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquations()).basicAdd(otherEnd, msgs);
			case modelicaPackage.EQUATION_SECTION__CONNECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnects()).basicAdd(otherEnd, msgs);
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
			case modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return basicSetOwnerModelicaClassDefinition(null, msgs);
			case modelicaPackage.EQUATION_SECTION__EQUATIONS:
				return ((InternalEList<?>)getEquations()).basicRemove(otherEnd, msgs);
			case modelicaPackage.EQUATION_SECTION__CONNECTS:
				return ((InternalEList<?>)getConnects()).basicRemove(otherEnd, msgs);
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
			case modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return eInternalContainer().eInverseRemove(this, modelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION, ModelicaClassDefinition.class, msgs);
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
			case modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition();
			case modelicaPackage.EQUATION_SECTION__EQUATIONS:
				return getEquations();
			case modelicaPackage.EQUATION_SECTION__CONNECTS:
				return getConnects();
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
			case modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)newValue);
				return;
			case modelicaPackage.EQUATION_SECTION__EQUATIONS:
				getEquations().clear();
				getEquations().addAll((Collection<? extends Equation>)newValue);
				return;
			case modelicaPackage.EQUATION_SECTION__CONNECTS:
				getConnects().clear();
				getConnects().addAll((Collection<? extends Connect>)newValue);
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
			case modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				setOwnerModelicaClassDefinition((ModelicaClassDefinition)null);
				return;
			case modelicaPackage.EQUATION_SECTION__EQUATIONS:
				getEquations().clear();
				return;
			case modelicaPackage.EQUATION_SECTION__CONNECTS:
				getConnects().clear();
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
			case modelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION:
				return getOwnerModelicaClassDefinition() != null;
			case modelicaPackage.EQUATION_SECTION__EQUATIONS:
				return equations != null && !equations.isEmpty();
			case modelicaPackage.EQUATION_SECTION__CONNECTS:
				return connects != null && !connects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EquationSectionImpl
