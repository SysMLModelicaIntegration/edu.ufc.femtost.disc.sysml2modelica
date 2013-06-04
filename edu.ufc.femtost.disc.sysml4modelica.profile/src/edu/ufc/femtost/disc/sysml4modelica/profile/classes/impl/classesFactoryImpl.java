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
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class classesFactoryImpl extends EFactoryImpl implements classesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static classesFactory init() {
		try {
			classesFactory theclassesFactory = (classesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.femto-st.fr/disc/SysML4Modelica/Classes"); 
			if (theclassesFactory != null) {
				return theclassesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new classesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case classesPackage.MODELICA_CLASS: return createModelicaClass();
			case classesPackage.MODELICA_MODEL: return createModelicaModel();
			case classesPackage.MODELICA_BLOCK: return createModelicaBlock();
			case classesPackage.MODELICA_RECORD: return createModelicaRecord();
			case classesPackage.MODELICA_OPERATOR: return createModelicaOperator();
			case classesPackage.MODELICA_CONNECTOR: return createModelicaConnector();
			case classesPackage.MODELICA_PACKAGE: return createModelicaPackage();
			case classesPackage.MODELICA_TYPE: return createModelicaType();
			case classesPackage.MODELICA_FUNCTION: return createModelicaFunction();
			case classesPackage.MODELICA_EXTENDS: return createModelicaExtends();
			case classesPackage.MODELICA_CONSTRAINED_BY: return createModelicaConstrainedBy();
			case classesPackage.MODELICA_DER: return createModelicaDer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaClass createModelicaClass() {
		ModelicaClassImpl modelicaClass = new ModelicaClassImpl();
		return modelicaClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaModel createModelicaModel() {
		ModelicaModelImpl modelicaModel = new ModelicaModelImpl();
		return modelicaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaBlock createModelicaBlock() {
		ModelicaBlockImpl modelicaBlock = new ModelicaBlockImpl();
		return modelicaBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaRecord createModelicaRecord() {
		ModelicaRecordImpl modelicaRecord = new ModelicaRecordImpl();
		return modelicaRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaOperator createModelicaOperator() {
		ModelicaOperatorImpl modelicaOperator = new ModelicaOperatorImpl();
		return modelicaOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaConnector createModelicaConnector() {
		ModelicaConnectorImpl modelicaConnector = new ModelicaConnectorImpl();
		return modelicaConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPackage createModelicaPackage() {
		ModelicaPackageImpl modelicaPackage = new ModelicaPackageImpl();
		return modelicaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaType createModelicaType() {
		ModelicaTypeImpl modelicaType = new ModelicaTypeImpl();
		return modelicaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFunction createModelicaFunction() {
		ModelicaFunctionImpl modelicaFunction = new ModelicaFunctionImpl();
		return modelicaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaExtends createModelicaExtends() {
		ModelicaExtendsImpl modelicaExtends = new ModelicaExtendsImpl();
		return modelicaExtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaConstrainedBy createModelicaConstrainedBy() {
		ModelicaConstrainedByImpl modelicaConstrainedBy = new ModelicaConstrainedByImpl();
		return modelicaConstrainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaDer createModelicaDer() {
		ModelicaDerImpl modelicaDer = new ModelicaDerImpl();
		return modelicaDer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classesPackage getclassesPackage() {
		return (classesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static classesPackage getPackage() {
		return classesPackage.eINSTANCE;
	}

} //classesFactoryImpl
