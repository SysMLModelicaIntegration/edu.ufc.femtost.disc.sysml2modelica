/*******************************************************************************
 * Copyright (c) 2013 Jean-Marie Gauthier and University of Franche-Comte
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jean-Marie Gauthier and University of Franche-Comte - initial API and implementation
 *******************************************************************************/
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFactory
 * @model kind="package"
 * @generated
 */
public interface ModelicaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelica";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.femto-st.fr/disc/Modelica.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Modelica";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelicaPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl <em>Class Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaClassDefinition()
	 * @generated
	 */
	int MODELICA_CLASS_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_PARTIAL = 1;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_FINAL = 2;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED = 3;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__FROM_LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__IS_REPLACEABLE = 5;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__EXTENDS = 6;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__OWNER_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__OWNER_PACKAGE = 8;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS = 9;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__EQUATION_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS = 11;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__ANNOTATIONS = 12;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION__COMMENTS = 13;

	/**
	 * The number of structural features of the '<em>Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_CLASS_DEFINITION_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ClassImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectorImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Is Expandable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IS_EXPANDABLE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.RecordImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.BlockImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.PackageImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Within Clause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__WITHIN_CLAUSE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modelica Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__MODELICA_CLASSES = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The feature id for the '<em><b>External Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXTERNAL_LANGUAGE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXTERNAL_INCLUDE = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Library</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EXTERNAL_LIBRARY = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.DerFunctionImpl <em>Der Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.DerFunctionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getDerFunction()
	 * @generated
	 */
	int DER_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__IS_PARTIAL = FUNCTION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__IS_FINAL = FUNCTION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__IS_MODELICA_ENCAPSULATED = FUNCTION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__FROM_LIBRARY = FUNCTION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__IS_REPLACEABLE = FUNCTION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__EXTENDS = FUNCTION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__OWNER_MODEL = FUNCTION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__OWNER_PACKAGE = FUNCTION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__MODELICA_COMPONENTS = FUNCTION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__EQUATION_SECTION = FUNCTION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__ALGORITHM_SECTIONS = FUNCTION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__COMMENTS = FUNCTION__COMMENTS;

	/**
	 * The feature id for the '<em><b>External Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__EXTERNAL_LANGUAGE = FUNCTION__EXTERNAL_LANGUAGE;

	/**
	 * The feature id for the '<em><b>External Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__EXTERNAL_INCLUDE = FUNCTION__EXTERNAL_INCLUDE;

	/**
	 * The feature id for the '<em><b>External Library</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__EXTERNAL_LIBRARY = FUNCTION__EXTERNAL_LIBRARY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Der</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__DER = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION__VARIABLE = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Der Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DER_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl <em>Extends Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getExtendsClause()
	 * @generated
	 */
	int EXTENDS_CLAUSE = 9;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE__MODIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE__ARRAY_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE__VISIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Extended Modelica Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS = 4;

	/**
	 * The feature id for the '<em><b>From modelica standard library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY = 5;

	/**
	 * The feature id for the '<em><b>From modelica primitive types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE__FROM_MODELICA_PRIMITIVE_TYPES = 6;

	/**
	 * The number of structural features of the '<em>Extends Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_CLAUSE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaModelImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaModel()
	 * @generated
	 */
	int MODELICA_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modelica Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__MODELICA_CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaComponent()
	 * @generated
	 */
	int MODELICA_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__CONDITIONAL_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__IS_FINAL = 2;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__MODIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__IS_REPLACEABLE = 4;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__ARRAY_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Type specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT__TYPE_SPECIFIER = 7;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPONENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl <em>Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaValueProperty()
	 * @generated
	 */
	int MODELICA_VALUE_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION = MODELICA_COMPONENT__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__NAME = MODELICA_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__IS_FINAL = MODELICA_COMPONENT__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__MODIFICATION = MODELICA_COMPONENT__MODIFICATION;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__IS_REPLACEABLE = MODELICA_COMPONENT__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__ARRAY_SIZE = MODELICA_COMPONENT__ARRAY_SIZE;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__OWNER_MODELICA_CLASS_DEFINITION = MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION;

	/**
	 * The feature id for the '<em><b>Type specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__TYPE_SPECIFIER = MODELICA_COMPONENT__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__VISIBILITY = MODELICA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__CAUSALITY = MODELICA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__VARIABILITY = MODELICA_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flow Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__FLOW_FLAG = MODELICA_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__SCOPE = MODELICA_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__DEFAULT_VALUE = MODELICA_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY_FEATURE_COUNT = MODELICA_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaPart()
	 * @generated
	 */
	int MODELICA_PART = 13;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__CONDITIONAL_EXPRESSION = MODELICA_COMPONENT__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__NAME = MODELICA_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__IS_FINAL = MODELICA_COMPONENT__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__MODIFICATION = MODELICA_COMPONENT__MODIFICATION;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__IS_REPLACEABLE = MODELICA_COMPONENT__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__ARRAY_SIZE = MODELICA_COMPONENT__ARRAY_SIZE;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__OWNER_MODELICA_CLASS_DEFINITION = MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION;

	/**
	 * The feature id for the '<em><b>Type specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__TYPE_SPECIFIER = MODELICA_COMPONENT__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__VISIBILITY = MODELICA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__SCOPE = MODELICA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__TYPE_PART = MODELICA_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constrained By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__CONSTRAINED_BY = MODELICA_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART_FEATURE_COUNT = MODELICA_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPortImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaPort()
	 * @generated
	 */
	int MODELICA_PORT = 14;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__CONDITIONAL_EXPRESSION = MODELICA_COMPONENT__CONDITIONAL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__NAME = MODELICA_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__IS_FINAL = MODELICA_COMPONENT__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__MODIFICATION = MODELICA_COMPONENT__MODIFICATION;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__IS_REPLACEABLE = MODELICA_COMPONENT__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__ARRAY_SIZE = MODELICA_COMPONENT__ARRAY_SIZE;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__OWNER_MODELICA_CLASS_DEFINITION = MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION;

	/**
	 * The feature id for the '<em><b>Type specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__TYPE_SPECIFIER = MODELICA_COMPONENT__TYPE_SPECIFIER;

	/**
	 * The feature id for the '<em><b>Type connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__TYPE_CONNECTOR = MODELICA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__CAUSALITY = MODELICA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT_FEATURE_COUNT = MODELICA_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 15;

	/**
	 * The feature id for the '<em><b>Owner Equation Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__OWNER_EQUATION_SECTION = 0;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__IS_INITIAL = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__BODY = 2;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl <em>Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getConnect()
	 * @generated
	 */
	int CONNECT = 16;

	/**
	 * The feature id for the '<em><b>Owner Equation Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__OWNER_EQUATION_SECTION = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__TO = 2;

	/**
	 * The feature id for the '<em><b>From Modelica Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__FROM_MODELICA_PART = 3;

	/**
	 * The feature id for the '<em><b>To Modelica Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__TO_MODELICA_PART = 4;

	/**
	 * The feature id for the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__FROM_PORT = 5;

	/**
	 * The feature id for the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__TO_PORT = 6;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__FROM_PART = 7;

	/**
	 * The feature id for the '<em><b>To Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__TO_PART = 8;

	/**
	 * The number of structural features of the '<em>Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationSectionImpl <em>Equation Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationSectionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getEquationSection()
	 * @generated
	 */
	int EQUATION_SECTION = 17;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_SECTION__EQUATIONS = 1;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_SECTION__CONNECTS = 2;

	/**
	 * The number of structural features of the '<em>Equation Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_SECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaFunctionParameter()
	 * @generated
	 */
	int MODELICA_FUNCTION_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Owner Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__CAUSALITY = 2;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__MODIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE = 4;

	/**
	 * The feature id for the '<em><b>Declaration Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION = 5;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__IS_FINAL = 6;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__VARIABILITY = 8;

	/**
	 * The feature id for the '<em><b>Type specifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER = 9;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmSectionImpl <em>Algorithm Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmSectionImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getAlgorithmSection()
	 * @generated
	 */
	int ALGORITHM_SECTION = 19;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SECTION__BODY = 1;

	/**
	 * The number of structural features of the '<em>Algorithm Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_SECTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl <em>Constrained By Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getConstrainedByClause()
	 * @generated
	 */
	int CONSTRAINED_BY_CLAUSE = 20;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_BY_CLAUSE__MODIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Owner Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Instance For Constrained By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY = 2;

	/**
	 * The number of structural features of the '<em>Constrained By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_BY_CLAUSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AnnotationImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 21;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__BODY = 0;

	/**
	 * The feature id for the '<em><b>Owner MCD</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNER_MCD = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.CommentImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 22;

	/**
	 * The feature id for the '<em><b>Owner Modelica Class Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNER_MODELICA_CLASS_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.TypeImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = MODELICA_CLASS_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_PARTIAL = MODELICA_CLASS_DEFINITION__IS_PARTIAL;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_FINAL = MODELICA_CLASS_DEFINITION__IS_FINAL;

	/**
	 * The feature id for the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_MODELICA_ENCAPSULATED = MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__FROM_LIBRARY = MODELICA_CLASS_DEFINITION__FROM_LIBRARY;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_REPLACEABLE = MODELICA_CLASS_DEFINITION__IS_REPLACEABLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EXTENDS = MODELICA_CLASS_DEFINITION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Owner Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNER_MODEL = MODELICA_CLASS_DEFINITION__OWNER_MODEL;

	/**
	 * The feature id for the '<em><b>Owner Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__OWNER_PACKAGE = MODELICA_CLASS_DEFINITION__OWNER_PACKAGE;

	/**
	 * The feature id for the '<em><b>Modelica Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MODELICA_COMPONENTS = MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Equation Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__EQUATION_SECTION = MODELICA_CLASS_DEFINITION__EQUATION_SECTION;

	/**
	 * The feature id for the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ALGORITHM_SECTIONS = MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = MODELICA_CLASS_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENTS = MODELICA_CLASS_DEFINITION__COMMENTS;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = MODELICA_CLASS_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 24;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind <em>Causality Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaCausalityKind()
	 * @generated
	 */
	int MODELICA_CAUSALITY_KIND = 25;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind <em>Variability Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaVariabilityKind()
	 * @generated
	 */
	int MODELICA_VARIABILITY_KIND = 26;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag <em>Flow Flag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaFlowFlag()
	 * @generated
	 */
	int MODELICA_FLOW_FLAG = 27;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind <em>Scope Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaScopeKind()
	 * @generated
	 */
	int MODELICA_SCOPE_KIND = 28;


	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition <em>Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Definition</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition
	 * @generated
	 */
	EClass getModelicaClassDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getName()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsPartial <em>Is Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Partial</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsPartial()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsPartial();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsFinal()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsModelicaEncapsulated <em>Is Modelica Encapsulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modelica Encapsulated</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsModelicaEncapsulated()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsModelicaEncapsulated();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getFromLibrary <em>From Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Library</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getFromLibrary()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_FromLibrary();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsReplaceable()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EAttribute getModelicaClassDefinition_IsReplaceable();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extends</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getExtends()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_Extends();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerModel <em>Owner Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Model</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerModel()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_OwnerModel();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerPackage <em>Owner Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Package</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerPackage()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_OwnerPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getModelicaComponents <em>Modelica Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelica Components</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getModelicaComponents()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_ModelicaComponents();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getEquationSection <em>Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equation Section</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getEquationSection()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_EquationSection();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAlgorithmSections <em>Algorithm Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithm Sections</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAlgorithmSections()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_AlgorithmSections();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAnnotations()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getComments()
	 * @see #getModelicaClassDefinition()
	 * @generated
	 */
	EReference getModelicaClassDefinition_Comments();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector#isIsExpandable <em>Is Expandable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Expandable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector#isIsExpandable()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_IsExpandable();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getWithinClause <em>Within Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Within Clause</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getWithinClause()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_WithinClause();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getModelicaClasses <em>Modelica Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelica Classes</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getModelicaClasses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ModelicaClasses();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getExternalLanguage <em>External Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Language</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getExternalLanguage()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_ExternalLanguage();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getExternalInclude <em>External Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Include</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getExternalInclude()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_ExternalInclude();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getExternalLibrary <em>External Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>External Library</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getExternalLibrary()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_ExternalLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction <em>Der Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Der Function</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction
	 * @generated
	 */
	EClass getDerFunction();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction#getDer <em>Der</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Der</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction#getDer()
	 * @see #getDerFunction()
	 * @generated
	 */
	EReference getDerFunction_Der();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction#getVariable()
	 * @see #getDerFunction()
	 * @generated
	 */
	EAttribute getDerFunction_Variable();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause <em>Extends Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends Clause</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause
	 * @generated
	 */
	EClass getExtendsClause();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getModification()
	 * @see #getExtendsClause()
	 * @generated
	 */
	EAttribute getExtendsClause_Modification();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getArraySize()
	 * @see #getExtendsClause()
	 * @generated
	 */
	EAttribute getExtendsClause_ArraySize();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Modelica Class Definition</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getOwnerModelicaClassDefinition()
	 * @see #getExtendsClause()
	 * @generated
	 */
	EReference getExtendsClause_OwnerModelicaClassDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getVisibility()
	 * @see #getExtendsClause()
	 * @generated
	 */
	EAttribute getExtendsClause_Visibility();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getExtendedModelicaClass <em>Extended Modelica Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extended Modelica Class</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getExtendedModelicaClass()
	 * @see #getExtendsClause()
	 * @generated
	 */
	EReference getExtendsClause_ExtendedModelicaClass();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getFrom_modelica_standard_library <em>From modelica standard library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From modelica standard library</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getFrom_modelica_standard_library()
	 * @see #getExtendsClause()
	 * @generated
	 */
	EAttribute getExtendsClause_From_modelica_standard_library();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getFrom_modelica_primitive_types <em>From modelica primitive types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From modelica primitive types</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getFrom_modelica_primitive_types()
	 * @see #getExtendsClause()
	 * @generated
	 */
	EAttribute getExtendsClause_From_modelica_primitive_types();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel
	 * @generated
	 */
	EClass getModelicaModel();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel#getName()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EAttribute getModelicaModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel#getModelicaClasses <em>Modelica Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelica Classes</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel#getModelicaClasses()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EReference getModelicaModel_ModelicaClasses();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent
	 * @generated
	 */
	EClass getModelicaComponent();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Expression</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getConditionalExpression()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EAttribute getModelicaComponent_ConditionalExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getName()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EAttribute getModelicaComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#isIsFinal()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EAttribute getModelicaComponent_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getModification()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EAttribute getModelicaComponent_Modification();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#isIsReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#isIsReplaceable()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EAttribute getModelicaComponent_IsReplaceable();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getArraySize()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EAttribute getModelicaComponent_ArraySize();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Modelica Class Definition</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getOwnerModelicaClassDefinition()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EReference getModelicaComponent_OwnerModelicaClassDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getType_specifier <em>Type specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type specifier</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getType_specifier()
	 * @see #getModelicaComponent()
	 * @generated
	 */
	EAttribute getModelicaComponent_Type_specifier();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty <em>Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Property</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty
	 * @generated
	 */
	EClass getModelicaValueProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getVisibility()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getCausality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causality</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getCausality()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Causality();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getVariability()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Variability();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getFlowFlag <em>Flow Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Flag</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getFlowFlag()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_FlowFlag();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getScope()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Scope();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getDefault_value <em>Default value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty#getDefault_value()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Default_value();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart
	 * @generated
	 */
	EClass getModelicaPart();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getVisibility()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getScope()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_Scope();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getType_part <em>Type part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type part</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getType_part()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EReference getModelicaPart_Type_part();

	/**
	 * Returns the meta object for the containment reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getConstrainedBy <em>Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constrained By</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getConstrainedBy()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EReference getModelicaPart_ConstrainedBy();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort
	 * @generated
	 */
	EClass getModelicaPort();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getCausality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causality</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getCausality()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EAttribute getModelicaPort_Causality();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getType_connector <em>Type connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type connector</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort#getType_connector()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EReference getModelicaPort_Type_connector();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#getOwnerEquationSection <em>Owner Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Equation Section</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#getOwnerEquationSection()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_OwnerEquationSection();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#isIsInitial()
	 * @see #getEquation()
	 * @generated
	 */
	EAttribute getEquation_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation#getBody()
	 * @see #getEquation()
	 * @generated
	 */
	EAttribute getEquation_Body();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect
	 * @generated
	 */
	EClass getConnect();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getOwnerEquationSection <em>Owner Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Equation Section</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getOwnerEquationSection()
	 * @see #getConnect()
	 * @generated
	 */
	EReference getConnect_OwnerEquationSection();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFrom()
	 * @see #getConnect()
	 * @generated
	 */
	EReference getConnect_From();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getTo()
	 * @see #getConnect()
	 * @generated
	 */
	EReference getConnect_To();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromModelicaPart <em>From Modelica Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Modelica Part</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromModelicaPart()
	 * @see #getConnect()
	 * @generated
	 */
	EReference getConnect_FromModelicaPart();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToModelicaPart <em>To Modelica Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Modelica Part</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToModelicaPart()
	 * @see #getConnect()
	 * @generated
	 */
	EReference getConnect_ToModelicaPart();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPort <em>From Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Port</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPort()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_FromPort();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPort <em>To Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Port</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPort()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_ToPort();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Part</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getFromPart()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_FromPart();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Part</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect#getToPart()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_ToPart();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection <em>Equation Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation Section</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection
	 * @generated
	 */
	EClass getEquationSection();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Modelica Class Definition</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getOwnerModelicaClassDefinition()
	 * @see #getEquationSection()
	 * @generated
	 */
	EReference getEquationSection_OwnerModelicaClassDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equations</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getEquations()
	 * @see #getEquationSection()
	 * @generated
	 */
	EReference getEquationSection_Equations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connects</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getConnects()
	 * @see #getEquationSection()
	 * @generated
	 */
	EReference getEquationSection_Connects();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter
	 * @generated
	 */
	EClass getModelicaFunctionParameter();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getOwnerFunction <em>Owner Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Function</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getOwnerFunction()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EReference getModelicaFunctionParameter_OwnerFunction();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getName()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getCausality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causality</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getCausality()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Causality();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getModification()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Modification();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#isIsReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#isIsReplaceable()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_IsReplaceable();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getDeclarationEquation <em>Declaration Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Equation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getDeclarationEquation()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_DeclarationEquation();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#isIsFinal()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_IsFinal();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getArraySize()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_ArraySize();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getVariability()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Variability();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getType_specifier <em>Type specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type specifier</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter#getType_specifier()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Type_specifier();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection <em>Algorithm Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm Section</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection
	 * @generated
	 */
	EClass getAlgorithmSection();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Modelica Class Definition</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getOwnerModelicaClassDefinition()
	 * @see #getAlgorithmSection()
	 * @generated
	 */
	EReference getAlgorithmSection_OwnerModelicaClassDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getBody()
	 * @see #getAlgorithmSection()
	 * @generated
	 */
	EAttribute getAlgorithmSection_Body();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause <em>Constrained By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained By Clause</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause
	 * @generated
	 */
	EClass getConstrainedByClause();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getModification()
	 * @see #getConstrainedByClause()
	 * @generated
	 */
	EAttribute getConstrainedByClause_Modification();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getOwnerInstance <em>Owner Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Instance</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getOwnerInstance()
	 * @see #getConstrainedByClause()
	 * @generated
	 */
	EReference getConstrainedByClause_OwnerInstance();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getInstanceForConstrainedBy <em>Instance For Constrained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance For Constrained By</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getInstanceForConstrainedBy()
	 * @see #getConstrainedByClause()
	 * @generated
	 */
	EReference getConstrainedByClause_InstanceForConstrainedBy();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation#getBody()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Body();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation#getOwnerMCD <em>Owner MCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner MCD</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation#getOwnerMCD()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_OwnerMCD();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the container reference '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner Modelica Class Definition</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment#getOwnerModelicaClassDefinition()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_OwnerModelicaClassDefinition();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind <em>Causality Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Causality Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind
	 * @generated
	 */
	EEnum getModelicaCausalityKind();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind <em>Variability Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variability Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind
	 * @generated
	 */
	EEnum getModelicaVariabilityKind();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag <em>Flow Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Flag</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag
	 * @generated
	 */
	EEnum getModelicaFlowFlag();

	/**
	 * Returns the meta object for enum '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind <em>Scope Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Kind</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind
	 * @generated
	 */
	EEnum getModelicaScopeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelicaFactory getModelicaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl <em>Class Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaClassDefinitionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaClassDefinition()
		 * @generated
		 */
		EClass MODELICA_CLASS_DEFINITION = eINSTANCE.getModelicaClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__NAME = eINSTANCE.getModelicaClassDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Is Partial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_PARTIAL = eINSTANCE.getModelicaClassDefinition_IsPartial();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_FINAL = eINSTANCE.getModelicaClassDefinition_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Is Modelica Encapsulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED = eINSTANCE.getModelicaClassDefinition_IsModelicaEncapsulated();

		/**
		 * The meta object literal for the '<em><b>From Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__FROM_LIBRARY = eINSTANCE.getModelicaClassDefinition_FromLibrary();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_CLASS_DEFINITION__IS_REPLACEABLE = eINSTANCE.getModelicaClassDefinition_IsReplaceable();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__EXTENDS = eINSTANCE.getModelicaClassDefinition_Extends();

		/**
		 * The meta object literal for the '<em><b>Owner Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__OWNER_MODEL = eINSTANCE.getModelicaClassDefinition_OwnerModel();

		/**
		 * The meta object literal for the '<em><b>Owner Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__OWNER_PACKAGE = eINSTANCE.getModelicaClassDefinition_OwnerPackage();

		/**
		 * The meta object literal for the '<em><b>Modelica Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS = eINSTANCE.getModelicaClassDefinition_ModelicaComponents();

		/**
		 * The meta object literal for the '<em><b>Equation Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__EQUATION_SECTION = eINSTANCE.getModelicaClassDefinition_EquationSection();

		/**
		 * The meta object literal for the '<em><b>Algorithm Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS = eINSTANCE.getModelicaClassDefinition_AlgorithmSections();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__ANNOTATIONS = eINSTANCE.getModelicaClassDefinition_Annotations();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_CLASS_DEFINITION__COMMENTS = eINSTANCE.getModelicaClassDefinition_Comments();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ClassImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectorImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Is Expandable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__IS_EXPANDABLE = eINSTANCE.getConnector_IsExpandable();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.RecordImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.BlockImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.PackageImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Within Clause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__WITHIN_CLAUSE = eINSTANCE.getPackage_WithinClause();

		/**
		 * The meta object literal for the '<em><b>Modelica Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__MODELICA_CLASSES = eINSTANCE.getPackage_ModelicaClasses();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.FunctionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>External Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__EXTERNAL_LANGUAGE = eINSTANCE.getFunction_ExternalLanguage();

		/**
		 * The meta object literal for the '<em><b>External Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__EXTERNAL_INCLUDE = eINSTANCE.getFunction_ExternalInclude();

		/**
		 * The meta object literal for the '<em><b>External Library</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__EXTERNAL_LIBRARY = eINSTANCE.getFunction_ExternalLibrary();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.DerFunctionImpl <em>Der Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.DerFunctionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getDerFunction()
		 * @generated
		 */
		EClass DER_FUNCTION = eINSTANCE.getDerFunction();

		/**
		 * The meta object literal for the '<em><b>Der</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DER_FUNCTION__DER = eINSTANCE.getDerFunction_Der();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DER_FUNCTION__VARIABLE = eINSTANCE.getDerFunction_Variable();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl <em>Extends Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ExtendsClauseImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getExtendsClause()
		 * @generated
		 */
		EClass EXTENDS_CLAUSE = eINSTANCE.getExtendsClause();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_CLAUSE__MODIFICATION = eINSTANCE.getExtendsClause_Modification();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_CLAUSE__ARRAY_SIZE = eINSTANCE.getExtendsClause_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Owner Modelica Class Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION = eINSTANCE.getExtendsClause_OwnerModelicaClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_CLAUSE__VISIBILITY = eINSTANCE.getExtendsClause_Visibility();

		/**
		 * The meta object literal for the '<em><b>Extended Modelica Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS = eINSTANCE.getExtendsClause_ExtendedModelicaClass();

		/**
		 * The meta object literal for the '<em><b>From modelica standard library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY = eINSTANCE.getExtendsClause_From_modelica_standard_library();

		/**
		 * The meta object literal for the '<em><b>From modelica primitive types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDS_CLAUSE__FROM_MODELICA_PRIMITIVE_TYPES = eINSTANCE.getExtendsClause_From_modelica_primitive_types();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaModelImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaModel()
		 * @generated
		 */
		EClass MODELICA_MODEL = eINSTANCE.getModelicaModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_MODEL__NAME = eINSTANCE.getModelicaModel_Name();

		/**
		 * The meta object literal for the '<em><b>Modelica Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_MODEL__MODELICA_CLASSES = eINSTANCE.getModelicaModel_ModelicaClasses();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaComponentImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaComponent()
		 * @generated
		 */
		EClass MODELICA_COMPONENT = eINSTANCE.getModelicaComponent();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_COMPONENT__CONDITIONAL_EXPRESSION = eINSTANCE.getModelicaComponent_ConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_COMPONENT__NAME = eINSTANCE.getModelicaComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_COMPONENT__IS_FINAL = eINSTANCE.getModelicaComponent_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_COMPONENT__MODIFICATION = eINSTANCE.getModelicaComponent_Modification();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_COMPONENT__IS_REPLACEABLE = eINSTANCE.getModelicaComponent_IsReplaceable();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_COMPONENT__ARRAY_SIZE = eINSTANCE.getModelicaComponent_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Owner Modelica Class Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION = eINSTANCE.getModelicaComponent_OwnerModelicaClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Type specifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_COMPONENT__TYPE_SPECIFIER = eINSTANCE.getModelicaComponent_Type_specifier();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl <em>Value Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaValuePropertyImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaValueProperty()
		 * @generated
		 */
		EClass MODELICA_VALUE_PROPERTY = eINSTANCE.getModelicaValueProperty();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__VISIBILITY = eINSTANCE.getModelicaValueProperty_Visibility();

		/**
		 * The meta object literal for the '<em><b>Causality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__CAUSALITY = eINSTANCE.getModelicaValueProperty_Causality();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__VARIABILITY = eINSTANCE.getModelicaValueProperty_Variability();

		/**
		 * The meta object literal for the '<em><b>Flow Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__FLOW_FLAG = eINSTANCE.getModelicaValueProperty_FlowFlag();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__SCOPE = eINSTANCE.getModelicaValueProperty_Scope();

		/**
		 * The meta object literal for the '<em><b>Default value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__DEFAULT_VALUE = eINSTANCE.getModelicaValueProperty_Default_value();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPartImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaPart()
		 * @generated
		 */
		EClass MODELICA_PART = eINSTANCE.getModelicaPart();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__VISIBILITY = eINSTANCE.getModelicaPart_Visibility();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__SCOPE = eINSTANCE.getModelicaPart_Scope();

		/**
		 * The meta object literal for the '<em><b>Type part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_PART__TYPE_PART = eINSTANCE.getModelicaPart_Type_part();

		/**
		 * The meta object literal for the '<em><b>Constrained By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_PART__CONSTRAINED_BY = eINSTANCE.getModelicaPart_ConstrainedBy();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPortImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaPort()
		 * @generated
		 */
		EClass MODELICA_PORT = eINSTANCE.getModelicaPort();

		/**
		 * The meta object literal for the '<em><b>Causality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PORT__CAUSALITY = eINSTANCE.getModelicaPort_Causality();

		/**
		 * The meta object literal for the '<em><b>Type connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_PORT__TYPE_CONNECTOR = eINSTANCE.getModelicaPort_Type_connector();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>Owner Equation Section</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__OWNER_EQUATION_SECTION = eINSTANCE.getEquation_OwnerEquationSection();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUATION__IS_INITIAL = eINSTANCE.getEquation_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUATION__BODY = eINSTANCE.getEquation_Body();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl <em>Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConnectImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getConnect()
		 * @generated
		 */
		EClass CONNECT = eINSTANCE.getConnect();

		/**
		 * The meta object literal for the '<em><b>Owner Equation Section</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT__OWNER_EQUATION_SECTION = eINSTANCE.getConnect_OwnerEquationSection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT__FROM = eINSTANCE.getConnect_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT__TO = eINSTANCE.getConnect_To();

		/**
		 * The meta object literal for the '<em><b>From Modelica Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT__FROM_MODELICA_PART = eINSTANCE.getConnect_FromModelicaPart();

		/**
		 * The meta object literal for the '<em><b>To Modelica Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT__TO_MODELICA_PART = eINSTANCE.getConnect_ToModelicaPart();

		/**
		 * The meta object literal for the '<em><b>From Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__FROM_PORT = eINSTANCE.getConnect_FromPort();

		/**
		 * The meta object literal for the '<em><b>To Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__TO_PORT = eINSTANCE.getConnect_ToPort();

		/**
		 * The meta object literal for the '<em><b>From Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__FROM_PART = eINSTANCE.getConnect_FromPart();

		/**
		 * The meta object literal for the '<em><b>To Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__TO_PART = eINSTANCE.getConnect_ToPart();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationSectionImpl <em>Equation Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.EquationSectionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getEquationSection()
		 * @generated
		 */
		EClass EQUATION_SECTION = eINSTANCE.getEquationSection();

		/**
		 * The meta object literal for the '<em><b>Owner Modelica Class Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION = eINSTANCE.getEquationSection_OwnerModelicaClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION_SECTION__EQUATIONS = eINSTANCE.getEquationSection_Equations();

		/**
		 * The meta object literal for the '<em><b>Connects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION_SECTION__CONNECTS = eINSTANCE.getEquationSection_Connects();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaFunctionParameterImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaFunctionParameter()
		 * @generated
		 */
		EClass MODELICA_FUNCTION_PARAMETER = eINSTANCE.getModelicaFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Owner Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION = eINSTANCE.getModelicaFunctionParameter_OwnerFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__NAME = eINSTANCE.getModelicaFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Causality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__CAUSALITY = eINSTANCE.getModelicaFunctionParameter_Causality();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__MODIFICATION = eINSTANCE.getModelicaFunctionParameter_Modification();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE = eINSTANCE.getModelicaFunctionParameter_IsReplaceable();

		/**
		 * The meta object literal for the '<em><b>Declaration Equation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION = eINSTANCE.getModelicaFunctionParameter_DeclarationEquation();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__IS_FINAL = eINSTANCE.getModelicaFunctionParameter_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE = eINSTANCE.getModelicaFunctionParameter_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__VARIABILITY = eINSTANCE.getModelicaFunctionParameter_Variability();

		/**
		 * The meta object literal for the '<em><b>Type specifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER = eINSTANCE.getModelicaFunctionParameter_Type_specifier();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmSectionImpl <em>Algorithm Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AlgorithmSectionImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getAlgorithmSection()
		 * @generated
		 */
		EClass ALGORITHM_SECTION = eINSTANCE.getAlgorithmSection();

		/**
		 * The meta object literal for the '<em><b>Owner Modelica Class Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION = eINSTANCE.getAlgorithmSection_OwnerModelicaClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM_SECTION__BODY = eINSTANCE.getAlgorithmSection_Body();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl <em>Constrained By Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getConstrainedByClause()
		 * @generated
		 */
		EClass CONSTRAINED_BY_CLAUSE = eINSTANCE.getConstrainedByClause();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINED_BY_CLAUSE__MODIFICATION = eINSTANCE.getConstrainedByClause_Modification();

		/**
		 * The meta object literal for the '<em><b>Owner Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE = eINSTANCE.getConstrainedByClause_OwnerInstance();

		/**
		 * The meta object literal for the '<em><b>Instance For Constrained By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY = eINSTANCE.getConstrainedByClause_InstanceForConstrainedBy();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.AnnotationImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__BODY = eINSTANCE.getAnnotation_Body();

		/**
		 * The meta object literal for the '<em><b>Owner MCD</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__OWNER_MCD = eINSTANCE.getAnnotation_OwnerMCD();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.CommentImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Owner Modelica Class Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__OWNER_MODELICA_CLASS_DEFINITION = eINSTANCE.getComment_OwnerModelicaClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.TypeImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind <em>Causality Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaCausalityKind()
		 * @generated
		 */
		EEnum MODELICA_CAUSALITY_KIND = eINSTANCE.getModelicaCausalityKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind <em>Variability Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaVariabilityKind()
		 * @generated
		 */
		EEnum MODELICA_VARIABILITY_KIND = eINSTANCE.getModelicaVariabilityKind();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag <em>Flow Flag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaFlowFlag()
		 * @generated
		 */
		EEnum MODELICA_FLOW_FLAG = eINSTANCE.getModelicaFlowFlag();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind <em>Scope Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind
		 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ModelicaPackageImpl#getModelicaScopeKind()
		 * @generated
		 */
		EEnum MODELICA_SCOPE_KIND = eINSTANCE.getModelicaScopeKind();

	}

} //ModelicaPackage
