/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comté
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comté - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;

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
 * An implementation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#isIsModelicaEncapsulated <em>Is Modelica Encapsulated</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getFromLibrary <em>From Library</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#isIsReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getOwnerModel <em>Owner Model</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getOwnerPackage <em>Owner Package</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getModelicaComponents <em>Modelica Components</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getEquationSection <em>Equation Section</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl#getAlgorithmSections <em>Algorithm Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelicaClassDefinitionImpl extends EObjectImpl implements ModelicaClassDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartial = IS_PARTIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsModelicaEncapsulated() <em>Is Modelica Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModelicaEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODELICA_ENCAPSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsModelicaEncapsulated() <em>Is Modelica Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsModelicaEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean isModelicaEncapsulated = IS_MODELICA_ENCAPSULATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromLibrary() <em>From Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromLibrary() <em>From Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromLibrary()
	 * @generated
	 * @ordered
	 */
	protected String fromLibrary = FROM_LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReplaceable() <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaceable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REPLACEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReplaceable() <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReplaceable()
	 * @generated
	 * @ordered
	 */
	protected boolean isReplaceable = IS_REPLACEABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendsClause> extends_;

	/**
	 * The cached value of the '{@link #getModelicaComponents() <em>Modelica Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelicaComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelicaComponent> modelicaComponents;

	/**
	 * The cached value of the '{@link #getEquationSection() <em>Equation Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquationSection()
	 * @generated
	 * @ordered
	 */
	protected EquationSection equationSection;

	/**
	 * The cached value of the '{@link #getAlgorithmSections() <em>Algorithm Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmSections()
	 * @generated
	 * @ordered
	 */
	protected EList<AlgorithmSection> algorithmSections;

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
		return ModelicaPackage.Literals.MODELICA_CLASS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPartial() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL, oldIsPartial, isPartial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_FINAL, oldIsFinal, isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsModelicaEncapsulated() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED, oldIsModelicaEncapsulated, isModelicaEncapsulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromLibrary() {
		return fromLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromLibrary(String newFromLibrary) {
		String oldFromLibrary = fromLibrary;
		fromLibrary = newFromLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__FROM_LIBRARY, oldFromLibrary, fromLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReplaceable() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE, oldIsReplaceable, isReplaceable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendsClause> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectContainmentWithInverseEList<ExtendsClause>(ExtendsClause.class, this, ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS, ModelicaPackage.EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaModel getOwnerModel() {
		if (eContainerFeatureID() != ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL) return null;
		return (ModelicaModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerModel(ModelicaModel newOwnerModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerModel, ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerModel(ModelicaModel newOwnerModel) {
		if (newOwnerModel != eInternalContainer() || (eContainerFeatureID() != ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL && newOwnerModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerModel != null)
				msgs = ((InternalEObject)newOwnerModel).eInverseAdd(this, ModelicaPackage.MODELICA_MODEL__MODELICA_CLASSES, ModelicaModel.class, msgs);
			msgs = basicSetOwnerModel(newOwnerModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL, newOwnerModel, newOwnerModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package getOwnerPackage() {
		if (eContainerFeatureID() != ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE) return null;
		return (edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerPackage(edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package newOwnerPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerPackage, ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerPackage(edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package newOwnerPackage) {
		if (newOwnerPackage != eInternalContainer() || (eContainerFeatureID() != ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE && newOwnerPackage != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerPackage != null)
				msgs = ((InternalEObject)newOwnerPackage).eInverseAdd(this, ModelicaPackage.PACKAGE__MODELICA_CLASSES, edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package.class, msgs);
			msgs = basicSetOwnerPackage(newOwnerPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE, newOwnerPackage, newOwnerPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelicaComponent> getModelicaComponents() {
		if (modelicaComponents == null) {
			modelicaComponents = new EObjectContainmentWithInverseEList<ModelicaComponent>(ModelicaComponent.class, this, ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS, ModelicaPackage.MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION);
		}
		return modelicaComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationSection getEquationSection() {
		return equationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquationSection(EquationSection newEquationSection, NotificationChain msgs) {
		EquationSection oldEquationSection = equationSection;
		equationSection = newEquationSection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION, oldEquationSection, newEquationSection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquationSection(EquationSection newEquationSection) {
		if (newEquationSection != equationSection) {
			NotificationChain msgs = null;
			if (equationSection != null)
				msgs = ((InternalEObject)equationSection).eInverseRemove(this, ModelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION, EquationSection.class, msgs);
			if (newEquationSection != null)
				msgs = ((InternalEObject)newEquationSection).eInverseAdd(this, ModelicaPackage.EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION, EquationSection.class, msgs);
			msgs = basicSetEquationSection(newEquationSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION, newEquationSection, newEquationSection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlgorithmSection> getAlgorithmSections() {
		if (algorithmSections == null) {
			algorithmSections = new EObjectContainmentWithInverseEList<AlgorithmSection>(AlgorithmSection.class, this, ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS, ModelicaPackage.ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION);
		}
		return algorithmSections;
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
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtends()).basicAdd(otherEnd, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerModel((ModelicaModel)otherEnd, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerPackage((edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package)otherEnd, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelicaComponents()).basicAdd(otherEnd, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION:
				if (equationSection != null)
					msgs = ((InternalEObject)equationSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION, null, msgs);
				return basicSetEquationSection((EquationSection)otherEnd, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlgorithmSections()).basicAdd(otherEnd, msgs);
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
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL:
				return basicSetOwnerModel(null, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE:
				return basicSetOwnerPackage(null, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS:
				return ((InternalEList<?>)getModelicaComponents()).basicRemove(otherEnd, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION:
				return basicSetEquationSection(null, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS:
				return ((InternalEList<?>)getAlgorithmSections()).basicRemove(otherEnd, msgs);
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
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL:
				return eInternalContainer().eInverseRemove(this, ModelicaPackage.MODELICA_MODEL__MODELICA_CLASSES, ModelicaModel.class, msgs);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE:
				return eInternalContainer().eInverseRemove(this, ModelicaPackage.PACKAGE__MODELICA_CLASSES, edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package.class, msgs);
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
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__NAME:
				return getName();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				return isIsPartial();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				return isIsFinal();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				return isIsModelicaEncapsulated();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__FROM_LIBRARY:
				return getFromLibrary();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				return isIsReplaceable();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS:
				return getExtends();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL:
				return getOwnerModel();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE:
				return getOwnerPackage();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS:
				return getModelicaComponents();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION:
				return getEquationSection();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS:
				return getAlgorithmSections();
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
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				setIsPartial((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				setIsFinal((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				setIsModelicaEncapsulated((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__FROM_LIBRARY:
				setFromLibrary((String)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				setIsReplaceable((Boolean)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends ExtendsClause>)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL:
				setOwnerModel((ModelicaModel)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE:
				setOwnerPackage((edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS:
				getModelicaComponents().clear();
				getModelicaComponents().addAll((Collection<? extends ModelicaComponent>)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION:
				setEquationSection((EquationSection)newValue);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS:
				getAlgorithmSections().clear();
				getAlgorithmSections().addAll((Collection<? extends AlgorithmSection>)newValue);
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
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				setIsPartial(IS_PARTIAL_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				setIsFinal(IS_FINAL_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				setIsModelicaEncapsulated(IS_MODELICA_ENCAPSULATED_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__FROM_LIBRARY:
				setFromLibrary(FROM_LIBRARY_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				setIsReplaceable(IS_REPLACEABLE_EDEFAULT);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS:
				getExtends().clear();
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL:
				setOwnerModel((ModelicaModel)null);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE:
				setOwnerPackage((edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package)null);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS:
				getModelicaComponents().clear();
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION:
				setEquationSection((EquationSection)null);
				return;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS:
				getAlgorithmSections().clear();
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
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_PARTIAL:
				return isPartial != IS_PARTIAL_EDEFAULT;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_FINAL:
				return isFinal != IS_FINAL_EDEFAULT;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED:
				return isModelicaEncapsulated != IS_MODELICA_ENCAPSULATED_EDEFAULT;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__FROM_LIBRARY:
				return FROM_LIBRARY_EDEFAULT == null ? fromLibrary != null : !FROM_LIBRARY_EDEFAULT.equals(fromLibrary);
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__IS_REPLACEABLE:
				return isReplaceable != IS_REPLACEABLE_EDEFAULT;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_MODEL:
				return getOwnerModel() != null;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__OWNER_PACKAGE:
				return getOwnerPackage() != null;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS:
				return modelicaComponents != null && !modelicaComponents.isEmpty();
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__EQUATION_SECTION:
				return equationSection != null;
			case ModelicaPackage.MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS:
				return algorithmSections != null && !algorithmSections.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isPartial: ");
		result.append(isPartial);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(", isModelicaEncapsulated: ");
		result.append(isModelicaEncapsulated);
		result.append(", fromLibrary: ");
		result.append(fromLibrary);
		result.append(", isReplaceable: ");
		result.append(isReplaceable);
		result.append(')');
		return result.toString();
	}

} //ModelicaClassDefinitionImpl
