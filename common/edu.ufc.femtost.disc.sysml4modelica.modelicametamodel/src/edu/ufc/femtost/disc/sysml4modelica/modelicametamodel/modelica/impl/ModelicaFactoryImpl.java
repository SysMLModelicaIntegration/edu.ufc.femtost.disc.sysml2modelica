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
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFactory;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPackage;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ModelicaFactoryImpl extends EFactoryImpl implements ModelicaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelicaFactory init() {
		try {
			ModelicaFactory theModelicaFactory = (ModelicaFactory)EPackage.Registry.INSTANCE.getEFactory(ModelicaPackage.eNS_URI);
			if (theModelicaFactory != null) {
				return theModelicaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelicaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFactoryImpl() {
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
			case ModelicaPackage.CLASS: return createClass();
			case ModelicaPackage.CONNECTOR: return createConnector();
			case ModelicaPackage.MODEL: return createModel();
			case ModelicaPackage.RECORD: return createRecord();
			case ModelicaPackage.BLOCK: return createBlock();
			case ModelicaPackage.PACKAGE: return createPackage();
			case ModelicaPackage.FUNCTION: return createFunction();
			case ModelicaPackage.DER_FUNCTION: return createDerFunction();
			case ModelicaPackage.EXTENDS_CLAUSE: return createExtendsClause();
			case ModelicaPackage.MODELICA_MODEL: return createModelicaModel();
			case ModelicaPackage.MODELICA_VALUE_PROPERTY: return createModelicaValueProperty();
			case ModelicaPackage.MODELICA_PART: return createModelicaPart();
			case ModelicaPackage.MODELICA_PORT: return createModelicaPort();
			case ModelicaPackage.EQUATION: return createEquation();
			case ModelicaPackage.CONNECT: return createConnect();
			case ModelicaPackage.EQUATION_SECTION: return createEquationSection();
			case ModelicaPackage.MODELICA_FUNCTION_PARAMETER: return createModelicaFunctionParameter();
			case ModelicaPackage.ALGORITHM_SECTION: return createAlgorithmSection();
			case ModelicaPackage.CONSTRAINED_BY_CLAUSE: return createConstrainedByClause();
			case ModelicaPackage.ANNOTATION: return createAnnotation();
			case ModelicaPackage.COMMENT: return createComment();
			case ModelicaPackage.TYPE: return createType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelicaPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case ModelicaPackage.MODELICA_CAUSALITY_KIND:
				return createModelicaCausalityKindFromString(eDataType, initialValue);
			case ModelicaPackage.MODELICA_VARIABILITY_KIND:
				return createModelicaVariabilityKindFromString(eDataType, initialValue);
			case ModelicaPackage.MODELICA_FLOW_FLAG:
				return createModelicaFlowFlagFromString(eDataType, initialValue);
			case ModelicaPackage.MODELICA_SCOPE_KIND:
				return createModelicaScopeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelicaPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case ModelicaPackage.MODELICA_CAUSALITY_KIND:
				return convertModelicaCausalityKindToString(eDataType, instanceValue);
			case ModelicaPackage.MODELICA_VARIABILITY_KIND:
				return convertModelicaVariabilityKindToString(eDataType, instanceValue);
			case ModelicaPackage.MODELICA_FLOW_FLAG:
				return convertModelicaFlowFlagToString(eDataType, instanceValue);
			case ModelicaPackage.MODELICA_SCOPE_KIND:
				return convertModelicaScopeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Record createRecord() {
		RecordImpl record = new RecordImpl();
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerFunction createDerFunction() {
		DerFunctionImpl derFunction = new DerFunctionImpl();
		return derFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendsClause createExtendsClause() {
		ExtendsClauseImpl extendsClause = new ExtendsClauseImpl();
		return extendsClause;
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
	public ModelicaValueProperty createModelicaValueProperty() {
		ModelicaValuePropertyImpl modelicaValueProperty = new ModelicaValuePropertyImpl();
		return modelicaValueProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart createModelicaPart() {
		ModelicaPartImpl modelicaPart = new ModelicaPartImpl();
		return modelicaPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPort createModelicaPort() {
		ModelicaPortImpl modelicaPort = new ModelicaPortImpl();
		return modelicaPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equation createEquation() {
		EquationImpl equation = new EquationImpl();
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connect createConnect() {
		ConnectImpl connect = new ConnectImpl();
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquationSection createEquationSection() {
		EquationSectionImpl equationSection = new EquationSectionImpl();
		return equationSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFunctionParameter createModelicaFunctionParameter() {
		ModelicaFunctionParameterImpl modelicaFunctionParameter = new ModelicaFunctionParameterImpl();
		return modelicaFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmSection createAlgorithmSection() {
		AlgorithmSectionImpl algorithmSection = new AlgorithmSectionImpl();
		return algorithmSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainedByClause createConstrainedByClause() {
		ConstrainedByClauseImpl constrainedByClause = new ConstrainedByClauseImpl();
		return constrainedByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaCausalityKind createModelicaCausalityKindFromString(EDataType eDataType, String initialValue) {
		ModelicaCausalityKind result = ModelicaCausalityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaCausalityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaVariabilityKind createModelicaVariabilityKindFromString(EDataType eDataType, String initialValue) {
		ModelicaVariabilityKind result = ModelicaVariabilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaVariabilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaFlowFlag createModelicaFlowFlagFromString(EDataType eDataType, String initialValue) {
		ModelicaFlowFlag result = ModelicaFlowFlag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaFlowFlagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaScopeKind createModelicaScopeKindFromString(EDataType eDataType, String initialValue) {
		ModelicaScopeKind result = ModelicaScopeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelicaScopeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPackage getModelicaPackage() {
		return (ModelicaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelicaPackage getPackage() {
		return ModelicaPackage.eINSTANCE;
	}

} //ModelicaFactoryImpl
