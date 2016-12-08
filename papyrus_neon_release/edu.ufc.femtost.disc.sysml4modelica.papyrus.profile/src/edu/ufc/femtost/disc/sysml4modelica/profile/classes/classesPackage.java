/*******************************************************************************
 * Copyright (c) 2013-2016 Jean-Marie Gauthier, University of Franche-Comte, and Samares-Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Jean-Marie Gauthier, University of Franche-Comte - initial API and implementation
 * Jean-Marie Gauthier, Samares-Engineering - Neon implementation
 *******************************************************************************/
/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Classes'"
 * @generated
 */
public interface classesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.femto-st.fr/disc/SysML4Modelica/Classes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	classesPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl <em>Modelica Class Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaClassDefinition()
	 * @generated
	 */
	int MODELICA_CLASS_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_FINAL = 1;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_PARTIAL = 2;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED = 3;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_REPLACEABLE = 4;

	/**
	 * The number of structural features of the '<em>Modelica Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Modelica Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassImpl <em>Modelica Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaClass()
	 * @generated
	 */
	int MODELICA_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS__BASE_CLASS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS__IS_ENCAPSULATED = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modelica Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS___GET_REFERENCES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS___GET_PARTS = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS___GET_FLOW_PROPERTIES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modelica Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaModelImpl <em>Modelica Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaModelImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaModel()
	 * @generated
	 */
	int MODELICA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__BASE_CLASS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__IS_ENCAPSULATED = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modelica Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL___GET_REFERENCES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL___GET_PARTS = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL___GET_FLOW_PROPERTIES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modelica Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaBlockImpl <em>Modelica Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaBlockImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaBlock()
	 * @generated
	 */
	int MODELICA_BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK__BASE_CLASS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK__IS_ENCAPSULATED = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modelica Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK___GET_REFERENCES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK___GET_PARTS = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK___GET_FLOW_PROPERTIES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modelica Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BLOCK_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaRecordImpl <em>Modelica Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaRecordImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaRecord()
	 * @generated
	 */
	int MODELICA_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD__BASE_CLASS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD__IS_ENCAPSULATED = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modelica Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD___GET_REFERENCES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD___GET_PARTS = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD___GET_FLOW_PROPERTIES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modelica Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_RECORD_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaOperatorImpl <em>Modelica Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaOperatorImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaOperator()
	 * @generated
	 */
	int MODELICA_OPERATOR = 5;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR__BASE_CLASS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR__IS_ENCAPSULATED = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modelica Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR___GET_REFERENCES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR___GET_PARTS = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR___GET_FLOW_PROPERTIES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modelica Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_OPERATOR_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConnectorImpl <em>Modelica Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConnectorImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaConnector()
	 * @generated
	 */
	int MODELICA_CONNECTOR = 6;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__BASE_CLASS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__IS_ENCAPSULATED = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Expandable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR__IS_EXPANDABLE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modelica Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR___GET_REFERENCES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR___GET_PARTS = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR___GET_FLOW_PROPERTIES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modelica Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONNECTOR_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaPackageImpl <em>Modelica Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaPackageImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaPackage()
	 * @generated
	 */
	int MODELICA_PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE__BASE_CLASS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE__IS_ENCAPSULATED = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Modelica Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE___GET_REFERENCES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE___GET_PARTS = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE___GET_FLOW_PROPERTIES = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Modelica Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PACKAGE_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaTypeImpl <em>Modelica Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaTypeImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaType()
	 * @generated
	 */
	int MODELICA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__BASE_DATA_TYPE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__QUANTITY_KIND = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE__UNIT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modelica Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Modelica Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_TYPE_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl <em>Modelica Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaFunction()
	 * @generated
	 */
	int MODELICA_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__BASE_CLASSIFIER = MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Base Function Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__SCOPE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__EXTERNAL_LIBRARY = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION__EXTERNAL_INCLUDE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Modelica Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Modelica Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_OPERATION_COUNT = MODELICA_CLASS_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl <em>Modelica Extends</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaExtends()
	 * @generated
	 */
	int MODELICA_EXTENDS = 10;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EXTENDS__MODIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Base Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EXTENDS__BASE_GENERALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EXTENDS__VISIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EXTENDS__ARRAY_SIZE = 3;

	/**
	 * The number of structural features of the '<em>Modelica Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EXTENDS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Modelica Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_EXTENDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConstrainedByImpl <em>Modelica Constrained By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConstrainedByImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaConstrainedBy()
	 * @generated
	 */
	int MODELICA_CONSTRAINED_BY = 11;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONSTRAINED_BY__MODIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONSTRAINED_BY__BASE_DEPENDENCY = 1;

	/**
	 * The number of structural features of the '<em>Modelica Constrained By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONSTRAINED_BY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modelica Constrained By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CONSTRAINED_BY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaDerImpl <em>Modelica Der</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaDerImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaDer()
	 * @generated
	 */
	int MODELICA_DER = 12;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_DER__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_DER__BASE_DEPENDENCY = 1;

	/**
	 * The number of structural features of the '<em>Modelica Der</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_DER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modelica Der</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_DER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition <em>Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Class Definition</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition
	 * @generated
	 */
	EClass getModelicaClassDefinition();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#getBase_Classifier()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_Base_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isFinal()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isPartial <em>Is Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Partial</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isPartial()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsPartial();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isModelicaEncapsulated <em>Is Modelica Encapsulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modelica Encapsulated</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isModelicaEncapsulated()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsModelicaEncapsulated();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClassDefinition#isReplaceable()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsReplaceable();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClass <em>Modelica Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Class</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaClass
	 * @generated
	 */
	EClass getModelicaClass();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaModel <em>Modelica Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Model</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaModel
	 * @generated
	 */
	EClass getModelicaModel();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaBlock <em>Modelica Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Block</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaBlock
	 * @generated
	 */
	EClass getModelicaBlock();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaRecord <em>Modelica Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Record</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaRecord
	 * @generated
	 */
	EClass getModelicaRecord();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaOperator <em>Modelica Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Operator</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaOperator
	 * @generated
	 */
	EClass getModelicaOperator();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector <em>Modelica Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Connector</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector
	 * @generated
	 */
	EClass getModelicaConnector();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector#isExpandable <em>Is Expandable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Expandable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector#isExpandable()
	 * @see #getModelicaConnector()
	 * @generated
	 */
	EAttribute getModelicaConnector_IsExpandable();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaPackage <em>Modelica Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Package</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaPackage
	 * @generated
	 */
	EClass getModelicaPackage();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaType <em>Modelica Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Type</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaType
	 * @generated
	 */
	EClass getModelicaType();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction <em>Modelica Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Function</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction
	 * @generated
	 */
	EClass getModelicaFunction();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getBase_FunctionBehavior <em>Base Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Function Behavior</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getBase_FunctionBehavior()
	 * @see #getModelicaFunction()
	 * @generated
	 */
	EReference getModelicaFunction_Base_FunctionBehavior();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getScope()
	 * @see #getModelicaFunction()
	 * @generated
	 */
	EAttribute getModelicaFunction_Scope();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalLibrary <em>External Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Library</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalLibrary()
	 * @see #getModelicaFunction()
	 * @generated
	 */
	EAttribute getModelicaFunction_ExternalLibrary();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalInclude <em>External Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Include</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalInclude()
	 * @see #getModelicaFunction()
	 * @generated
	 */
	EAttribute getModelicaFunction_ExternalInclude();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends <em>Modelica Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Extends</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends
	 * @generated
	 */
	EClass getModelicaExtends();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getModification()
	 * @see #getModelicaExtends()
	 * @generated
	 */
	EAttribute getModelicaExtends_Modification();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getBase_Generalization <em>Base Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Generalization</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getBase_Generalization()
	 * @see #getModelicaExtends()
	 * @generated
	 */
	EReference getModelicaExtends_Base_Generalization();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getVisibility()
	 * @see #getModelicaExtends()
	 * @generated
	 */
	EAttribute getModelicaExtends_Visibility();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaExtends#getArraySize()
	 * @see #getModelicaExtends()
	 * @generated
	 */
	EAttribute getModelicaExtends_ArraySize();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConstrainedBy <em>Modelica Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Constrained By</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConstrainedBy
	 * @generated
	 */
	EClass getModelicaConstrainedBy();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConstrainedBy#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConstrainedBy#getModification()
	 * @see #getModelicaConstrainedBy()
	 * @generated
	 */
	EAttribute getModelicaConstrainedBy_Modification();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConstrainedBy#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConstrainedBy#getBase_Dependency()
	 * @see #getModelicaConstrainedBy()
	 * @generated
	 */
	EReference getModelicaConstrainedBy_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaDer <em>Modelica Der</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Der</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaDer
	 * @generated
	 */
	EClass getModelicaDer();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaDer#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaDer#getVariable()
	 * @see #getModelicaDer()
	 * @generated
	 */
	EAttribute getModelicaDer_Variable();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaDer#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaDer#getBase_Dependency()
	 * @see #getModelicaDer()
	 * @generated
	 */
	EReference getModelicaDer_Base_Dependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	classesFactory getclassesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl <em>Modelica Class Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassDefinitionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaClassDefinition()
		 * @generated
		 */
		EClass MODELICA_CLASS_DEFINITION = eINSTANCE.getModelicaClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__BASE_CLASSIFIER = eINSTANCE.getModelicaClassDefinition_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_FINAL = eINSTANCE.getModelicaClassDefinition_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Partial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_PARTIAL = eINSTANCE.getModelicaClassDefinition_IsPartial();

		/**
		 * The meta object literal for the '<em><b>Is Modelica Encapsulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED = eINSTANCE.getModelicaClassDefinition_IsModelicaEncapsulated();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_REPLACEABLE = eINSTANCE.getModelicaClassDefinition_IsReplaceable();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassImpl <em>Modelica Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaClassImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaClass()
		 * @generated
		 */
		EClass MODELICA_CLASS = eINSTANCE.getModelicaClass();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaModelImpl <em>Modelica Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaModelImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaModel()
		 * @generated
		 */
		EClass MODELICA_MODEL = eINSTANCE.getModelicaModel();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaBlockImpl <em>Modelica Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaBlockImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaBlock()
		 * @generated
		 */
		EClass MODELICA_BLOCK = eINSTANCE.getModelicaBlock();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaRecordImpl <em>Modelica Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaRecordImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaRecord()
		 * @generated
		 */
		EClass MODELICA_RECORD = eINSTANCE.getModelicaRecord();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaOperatorImpl <em>Modelica Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaOperatorImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaOperator()
		 * @generated
		 */
		EClass MODELICA_OPERATOR = eINSTANCE.getModelicaOperator();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConnectorImpl <em>Modelica Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConnectorImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaConnector()
		 * @generated
		 */
		EClass MODELICA_CONNECTOR = eINSTANCE.getModelicaConnector();

		/**
		 * The meta object literal for the '<em><b>Is Expandable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CONNECTOR__IS_EXPANDABLE = eINSTANCE.getModelicaConnector_IsExpandable();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaPackageImpl <em>Modelica Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaPackageImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaPackage()
		 * @generated
		 */
		EClass MODELICA_PACKAGE = eINSTANCE.getModelicaPackage();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaTypeImpl <em>Modelica Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaTypeImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaType()
		 * @generated
		 */
		EClass MODELICA_TYPE = eINSTANCE.getModelicaType();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl <em>Modelica Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaFunctionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaFunction()
		 * @generated
		 */
		EClass MODELICA_FUNCTION = eINSTANCE.getModelicaFunction();

		/**
		 * The meta object literal for the '<em><b>Base Function Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_FUNCTION__BASE_FUNCTION_BEHAVIOR = eINSTANCE.getModelicaFunction_Base_FunctionBehavior();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION__SCOPE = eINSTANCE.getModelicaFunction_Scope();

		/**
		 * The meta object literal for the '<em><b>External Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION__EXTERNAL_LIBRARY = eINSTANCE.getModelicaFunction_ExternalLibrary();

		/**
		 * The meta object literal for the '<em><b>External Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION__EXTERNAL_INCLUDE = eINSTANCE.getModelicaFunction_ExternalInclude();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl <em>Modelica Extends</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaExtendsImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaExtends()
		 * @generated
		 */
		EClass MODELICA_EXTENDS = eINSTANCE.getModelicaExtends();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_EXTENDS__MODIFICATION = eINSTANCE.getModelicaExtends_Modification();

		/**
		 * The meta object literal for the '<em><b>Base Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_EXTENDS__BASE_GENERALIZATION = eINSTANCE.getModelicaExtends_Base_Generalization();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_EXTENDS__VISIBILITY = eINSTANCE.getModelicaExtends_Visibility();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_EXTENDS__ARRAY_SIZE = eINSTANCE.getModelicaExtends_ArraySize();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConstrainedByImpl <em>Modelica Constrained By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaConstrainedByImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaConstrainedBy()
		 * @generated
		 */
		EClass MODELICA_CONSTRAINED_BY = eINSTANCE.getModelicaConstrainedBy();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CONSTRAINED_BY__MODIFICATION = eINSTANCE.getModelicaConstrainedBy_Modification();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CONSTRAINED_BY__BASE_DEPENDENCY = eINSTANCE.getModelicaConstrainedBy_Base_Dependency();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaDerImpl <em>Modelica Der</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.ModelicaDerImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.impl.classesPackageImpl#getModelicaDer()
		 * @generated
		 */
		EClass MODELICA_DER = eINSTANCE.getModelicaDer();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_DER__VARIABLE = eINSTANCE.getModelicaDer_Variable();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_DER__BASE_DEPENDENCY = eINSTANCE.getModelicaDer_Base_Dependency();

	}

} //classesPackage
