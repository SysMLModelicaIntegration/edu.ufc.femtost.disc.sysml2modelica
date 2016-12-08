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
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Algorithm;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Block;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connect;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Connector;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.DerFunction;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Enumeration;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EnumerationLiteral;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Equation;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Function;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Model;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaCausalityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFlowFlag;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaFunctionParameter;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPort;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaValueProperty;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaVariabilityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Record;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Type;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaFactory;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class modelicaPackageImpl extends EPackageImpl implements modelicaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaClassDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaValuePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equationSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelicaFunctionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainedByClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaCausalityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaVariabilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaFlowFlagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelicaScopeKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private modelicaPackageImpl() {
		super(eNS_URI, modelicaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link modelicaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static modelicaPackage init() {
		if (isInited) return (modelicaPackage)EPackage.Registry.INSTANCE.getEPackage(modelicaPackage.eNS_URI);

		// Obtain or create and register package
		modelicaPackageImpl themodelicaPackage = (modelicaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof modelicaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new modelicaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		themodelicaPackage.createPackageContents();

		// Initialize created meta-data
		themodelicaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themodelicaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(modelicaPackage.eNS_URI, themodelicaPackage);
		return themodelicaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaClassDefinition() {
		return modelicaClassDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_Name() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsPartial() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsFinal() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsModelicaEncapsulated() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_FromLibrary() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaClassDefinition_IsReplaceable() {
		return (EAttribute)modelicaClassDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_Extends() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_OwnerModel() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_OwnerPackage() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_ModelicaComponents() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_EquationSection() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_AlgorithmSections() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_Annotations() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_Comments() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaClassDefinition_Records() {
		return (EReference)modelicaClassDefinitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_IsExpandable() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_OwnerModelicaClassDefinition() {
		return (EReference)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_WithinClause() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ModelicaClasses() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_ExternalLanguage() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_ExternalInclude() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_ExternalLibrary() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerFunction() {
		return derFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerFunction_Der() {
		return (EReference)derFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerFunction_Variable() {
		return (EAttribute)derFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendsClause() {
		return extendsClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsClause_Modification() {
		return (EAttribute)extendsClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsClause_ArraySize() {
		return (EAttribute)extendsClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendsClause_OwnerModelicaClassDefinition() {
		return (EReference)extendsClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsClause_Visibility() {
		return (EAttribute)extendsClauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendsClause_ExtendedModelicaClass() {
		return (EReference)extendsClauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsClause_From_modelica_standard_library() {
		return (EAttribute)extendsClauseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendsClause_From_modelica_primitive_types() {
		return (EAttribute)extendsClauseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaModel() {
		return modelicaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaModel_Name() {
		return (EAttribute)modelicaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaModel_ModelicaClasses() {
		return (EReference)modelicaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaComponent() {
		return modelicaComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaComponent_ConditionalExpression() {
		return (EAttribute)modelicaComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaComponent_Name() {
		return (EAttribute)modelicaComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaComponent_IsFinal() {
		return (EAttribute)modelicaComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaComponent_Modification() {
		return (EAttribute)modelicaComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaComponent_IsReplaceable() {
		return (EAttribute)modelicaComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaComponent_ArraySize() {
		return (EAttribute)modelicaComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaComponent_OwnerModelicaClassDefinition() {
		return (EReference)modelicaComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaComponent_Type_specifier() {
		return (EAttribute)modelicaComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaValueProperty() {
		return modelicaValuePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Visibility() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Causality() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Variability() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_FlowFlag() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Scope() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaValueProperty_Default_value() {
		return (EAttribute)modelicaValuePropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaPart() {
		return modelicaPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_Visibility() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPart_Scope() {
		return (EAttribute)modelicaPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaPart_Type_part() {
		return (EReference)modelicaPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaPart_ConstrainedBy() {
		return (EReference)modelicaPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaPort() {
		return modelicaPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaPort_Type_connector() {
		return (EReference)modelicaPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaPort_Causality() {
		return (EAttribute)modelicaPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquation() {
		return equationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquation_OwnerEquationSection() {
		return (EReference)equationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquation_IsInitial() {
		return (EAttribute)equationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEquation_Body() {
		return (EAttribute)equationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnect() {
		return connectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnect_OwnerEquationSection() {
		return (EReference)connectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnect_From() {
		return (EReference)connectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnect_To() {
		return (EReference)connectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnect_FromModelicaPart() {
		return (EReference)connectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnect_ToModelicaPart() {
		return (EReference)connectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnect_FromPort() {
		return (EAttribute)connectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnect_ToPort() {
		return (EAttribute)connectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnect_FromPart() {
		return (EAttribute)connectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnect_ToPart() {
		return (EAttribute)connectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquationSection() {
		return equationSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquationSection_OwnerModelicaClassDefinition() {
		return (EReference)equationSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquationSection_Equations() {
		return (EReference)equationSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquationSection_Connects() {
		return (EReference)equationSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelicaFunctionParameter() {
		return modelicaFunctionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelicaFunctionParameter_OwnerFunction() {
		return (EReference)modelicaFunctionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Name() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Causality() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Modification() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_IsReplaceable() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_DeclarationEquation() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_IsFinal() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_ArraySize() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Variability() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Type_specifier() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_IsProtected() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelicaFunctionParameter_Default_value() {
		return (EAttribute)modelicaFunctionParameterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithmSection() {
		return algorithmSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmSection_OwnerModelicaClassDefinition() {
		return (EReference)algorithmSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmSection_Algorithm() {
		return (EReference)algorithmSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainedByClause() {
		return constrainedByClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstrainedByClause_Modification() {
		return (EAttribute)constrainedByClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainedByClause_OwnerInstance() {
		return (EReference)constrainedByClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainedByClause_InstanceForConstrainedBy() {
		return (EReference)constrainedByClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Body() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_OwnerMCD() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_OwnerModelicaClassDefinition() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_Body() {
		return (EAttribute)algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Algorithmsection() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_EnumerationLiterals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Name() {
		return (EAttribute)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaCausalityKind() {
		return modelicaCausalityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaVariabilityKind() {
		return modelicaVariabilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaFlowFlag() {
		return modelicaFlowFlagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelicaScopeKind() {
		return modelicaScopeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public modelicaFactory getmodelicaFactory() {
		return (modelicaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelicaClassDefinitionEClass = createEClass(MODELICA_CLASS_DEFINITION);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__NAME);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_PARTIAL);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_FINAL);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_MODELICA_ENCAPSULATED);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__FROM_LIBRARY);
		createEAttribute(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__IS_REPLACEABLE);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__EXTENDS);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__OWNER_MODEL);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__OWNER_PACKAGE);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__MODELICA_COMPONENTS);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__EQUATION_SECTION);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__ALGORITHM_SECTIONS);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__ANNOTATIONS);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__COMMENTS);
		createEReference(modelicaClassDefinitionEClass, MODELICA_CLASS_DEFINITION__RECORDS);

		classEClass = createEClass(CLASS);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__IS_EXPANDABLE);

		modelEClass = createEClass(MODEL);

		recordEClass = createEClass(RECORD);
		createEReference(recordEClass, RECORD__OWNER_MODELICA_CLASS_DEFINITION);

		blockEClass = createEClass(BLOCK);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__WITHIN_CLAUSE);
		createEReference(packageEClass, PACKAGE__MODELICA_CLASSES);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__EXTERNAL_LANGUAGE);
		createEAttribute(functionEClass, FUNCTION__EXTERNAL_INCLUDE);
		createEAttribute(functionEClass, FUNCTION__EXTERNAL_LIBRARY);
		createEReference(functionEClass, FUNCTION__PARAMETERS);

		derFunctionEClass = createEClass(DER_FUNCTION);
		createEReference(derFunctionEClass, DER_FUNCTION__DER);
		createEAttribute(derFunctionEClass, DER_FUNCTION__VARIABLE);

		extendsClauseEClass = createEClass(EXTENDS_CLAUSE);
		createEAttribute(extendsClauseEClass, EXTENDS_CLAUSE__MODIFICATION);
		createEAttribute(extendsClauseEClass, EXTENDS_CLAUSE__ARRAY_SIZE);
		createEReference(extendsClauseEClass, EXTENDS_CLAUSE__OWNER_MODELICA_CLASS_DEFINITION);
		createEAttribute(extendsClauseEClass, EXTENDS_CLAUSE__VISIBILITY);
		createEReference(extendsClauseEClass, EXTENDS_CLAUSE__EXTENDED_MODELICA_CLASS);
		createEAttribute(extendsClauseEClass, EXTENDS_CLAUSE__FROM_MODELICA_STANDARD_LIBRARY);
		createEAttribute(extendsClauseEClass, EXTENDS_CLAUSE__FROM_MODELICA_PRIMITIVE_TYPES);

		modelicaModelEClass = createEClass(MODELICA_MODEL);
		createEAttribute(modelicaModelEClass, MODELICA_MODEL__NAME);
		createEReference(modelicaModelEClass, MODELICA_MODEL__MODELICA_CLASSES);

		modelicaComponentEClass = createEClass(MODELICA_COMPONENT);
		createEAttribute(modelicaComponentEClass, MODELICA_COMPONENT__CONDITIONAL_EXPRESSION);
		createEAttribute(modelicaComponentEClass, MODELICA_COMPONENT__NAME);
		createEAttribute(modelicaComponentEClass, MODELICA_COMPONENT__IS_FINAL);
		createEAttribute(modelicaComponentEClass, MODELICA_COMPONENT__MODIFICATION);
		createEAttribute(modelicaComponentEClass, MODELICA_COMPONENT__IS_REPLACEABLE);
		createEAttribute(modelicaComponentEClass, MODELICA_COMPONENT__ARRAY_SIZE);
		createEReference(modelicaComponentEClass, MODELICA_COMPONENT__OWNER_MODELICA_CLASS_DEFINITION);
		createEAttribute(modelicaComponentEClass, MODELICA_COMPONENT__TYPE_SPECIFIER);

		modelicaValuePropertyEClass = createEClass(MODELICA_VALUE_PROPERTY);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__VISIBILITY);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__CAUSALITY);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__VARIABILITY);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__FLOW_FLAG);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__SCOPE);
		createEAttribute(modelicaValuePropertyEClass, MODELICA_VALUE_PROPERTY__DEFAULT_VALUE);

		modelicaPartEClass = createEClass(MODELICA_PART);
		createEAttribute(modelicaPartEClass, MODELICA_PART__VISIBILITY);
		createEAttribute(modelicaPartEClass, MODELICA_PART__SCOPE);
		createEReference(modelicaPartEClass, MODELICA_PART__TYPE_PART);
		createEReference(modelicaPartEClass, MODELICA_PART__CONSTRAINED_BY);

		modelicaPortEClass = createEClass(MODELICA_PORT);
		createEReference(modelicaPortEClass, MODELICA_PORT__TYPE_CONNECTOR);
		createEAttribute(modelicaPortEClass, MODELICA_PORT__CAUSALITY);

		equationEClass = createEClass(EQUATION);
		createEReference(equationEClass, EQUATION__OWNER_EQUATION_SECTION);
		createEAttribute(equationEClass, EQUATION__IS_INITIAL);
		createEAttribute(equationEClass, EQUATION__BODY);

		connectEClass = createEClass(CONNECT);
		createEReference(connectEClass, CONNECT__OWNER_EQUATION_SECTION);
		createEReference(connectEClass, CONNECT__FROM);
		createEReference(connectEClass, CONNECT__TO);
		createEReference(connectEClass, CONNECT__FROM_MODELICA_PART);
		createEReference(connectEClass, CONNECT__TO_MODELICA_PART);
		createEAttribute(connectEClass, CONNECT__FROM_PORT);
		createEAttribute(connectEClass, CONNECT__TO_PORT);
		createEAttribute(connectEClass, CONNECT__FROM_PART);
		createEAttribute(connectEClass, CONNECT__TO_PART);

		equationSectionEClass = createEClass(EQUATION_SECTION);
		createEReference(equationSectionEClass, EQUATION_SECTION__OWNER_MODELICA_CLASS_DEFINITION);
		createEReference(equationSectionEClass, EQUATION_SECTION__EQUATIONS);
		createEReference(equationSectionEClass, EQUATION_SECTION__CONNECTS);

		modelicaFunctionParameterEClass = createEClass(MODELICA_FUNCTION_PARAMETER);
		createEReference(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__OWNER_FUNCTION);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__NAME);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__CAUSALITY);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__MODIFICATION);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__IS_FINAL);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__VARIABILITY);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__TYPE_SPECIFIER);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__IS_PROTECTED);
		createEAttribute(modelicaFunctionParameterEClass, MODELICA_FUNCTION_PARAMETER__DEFAULT_VALUE);

		algorithmSectionEClass = createEClass(ALGORITHM_SECTION);
		createEReference(algorithmSectionEClass, ALGORITHM_SECTION__OWNER_MODELICA_CLASS_DEFINITION);
		createEReference(algorithmSectionEClass, ALGORITHM_SECTION__ALGORITHM);

		constrainedByClauseEClass = createEClass(CONSTRAINED_BY_CLAUSE);
		createEAttribute(constrainedByClauseEClass, CONSTRAINED_BY_CLAUSE__MODIFICATION);
		createEReference(constrainedByClauseEClass, CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE);
		createEReference(constrainedByClauseEClass, CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__BODY);
		createEReference(annotationEClass, ANNOTATION__OWNER_MCD);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__OWNER_MODELICA_CLASS_DEFINITION);
		createEAttribute(commentEClass, COMMENT__BODY);

		typeEClass = createEClass(TYPE);

		algorithmEClass = createEClass(ALGORITHM);
		createEAttribute(algorithmEClass, ALGORITHM__BODY);
		createEReference(algorithmEClass, ALGORITHM__ALGORITHMSECTION);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__ENUMERATION_LITERALS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__NAME);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		modelicaCausalityKindEEnum = createEEnum(MODELICA_CAUSALITY_KIND);
		modelicaVariabilityKindEEnum = createEEnum(MODELICA_VARIABILITY_KIND);
		modelicaFlowFlagEEnum = createEEnum(MODELICA_FLOW_FLAG);
		modelicaScopeKindEEnum = createEEnum(MODELICA_SCOPE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		classEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		connectorEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		modelEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		recordEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		blockEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		packageEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		functionEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		derFunctionEClass.getESuperTypes().add(this.getFunction());
		modelicaValuePropertyEClass.getESuperTypes().add(this.getModelicaComponent());
		modelicaPartEClass.getESuperTypes().add(this.getModelicaComponent());
		modelicaPortEClass.getESuperTypes().add(this.getModelicaComponent());
		typeEClass.getESuperTypes().add(this.getModelicaClassDefinition());
		enumerationEClass.getESuperTypes().add(this.getType());

		// Initialize classes and features; add operations and parameters
		initEClass(modelicaClassDefinitionEClass, ModelicaClassDefinition.class, "ModelicaClassDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaClassDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsPartial(), ecorePackage.getEBoolean(), "isPartial", null, 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsModelicaEncapsulated(), ecorePackage.getEBoolean(), "isModelicaEncapsulated", null, 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_FromLibrary(), ecorePackage.getEString(), "fromLibrary", null, 0, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaClassDefinition_IsReplaceable(), ecorePackage.getEBoolean(), "isReplaceable", null, 1, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_Extends(), this.getExtendsClause(), this.getExtendsClause_OwnerModelicaClassDefinition(), "extends", null, 0, -1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_OwnerModel(), this.getModelicaModel(), this.getModelicaModel_ModelicaClasses(), "ownerModel", null, 0, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_OwnerPackage(), this.getPackage(), this.getPackage_ModelicaClasses(), "ownerPackage", null, 0, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_ModelicaComponents(), this.getModelicaComponent(), this.getModelicaComponent_OwnerModelicaClassDefinition(), "modelicaComponents", null, 0, -1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_EquationSection(), this.getEquationSection(), this.getEquationSection_OwnerModelicaClassDefinition(), "equationSection", null, 0, 1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_AlgorithmSections(), this.getAlgorithmSection(), this.getAlgorithmSection_OwnerModelicaClassDefinition(), "algorithmSections", null, 0, -1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_Annotations(), this.getAnnotation(), this.getAnnotation_OwnerMCD(), "annotations", null, 0, -1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_Comments(), this.getComment(), this.getComment_OwnerModelicaClassDefinition(), "comments", null, 0, -1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaClassDefinition_Records(), this.getRecord(), this.getRecord_OwnerModelicaClassDefinition(), "records", null, 0, -1, ModelicaClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_IsExpandable(), ecorePackage.getEBoolean(), "isExpandable", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecord_OwnerModelicaClassDefinition(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_Records(), "ownerModelicaClassDefinition", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_WithinClause(), ecorePackage.getEString(), "withinClause", null, 0, 1, edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ModelicaClasses(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_OwnerPackage(), "modelicaClasses", null, 0, -1, edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_ExternalLanguage(), ecorePackage.getEString(), "externalLanguage", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_ExternalInclude(), ecorePackage.getEString(), "externalInclude", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_ExternalLibrary(), ecorePackage.getEString(), "externalLibrary", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getModelicaFunctionParameter(), this.getModelicaFunctionParameter_OwnerFunction(), "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derFunctionEClass, DerFunction.class, "DerFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerFunction_Der(), this.getFunction(), null, "der", null, 0, 1, DerFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDerFunction_Variable(), ecorePackage.getEString(), "variable", null, 1, -1, DerFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendsClauseEClass, ExtendsClause.class, "ExtendsClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendsClause_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ExtendsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendsClause_ArraySize(), ecorePackage.getEString(), "arraySize", null, 0, -1, ExtendsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendsClause_OwnerModelicaClassDefinition(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_Extends(), "ownerModelicaClassDefinition", null, 0, 1, ExtendsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendsClause_Visibility(), this.getVisibilityKind(), "visibility", null, 1, 1, ExtendsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendsClause_ExtendedModelicaClass(), this.getModelicaClassDefinition(), null, "extendedModelicaClass", null, 0, 1, ExtendsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendsClause_From_modelica_standard_library(), ecorePackage.getEString(), "from_modelica_standard_library", null, 0, 1, ExtendsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendsClause_From_modelica_primitive_types(), ecorePackage.getEString(), "from_modelica_primitive_types", null, 0, 1, ExtendsClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelicaModelEClass, ModelicaModel.class, "ModelicaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelicaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaModel_ModelicaClasses(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_OwnerModel(), "modelicaClasses", null, 0, -1, ModelicaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelicaComponentEClass, ModelicaComponent.class, "ModelicaComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaComponent_ConditionalExpression(), ecorePackage.getEString(), "conditionalExpression", null, 0, 1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaComponent_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 1, 1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaComponent_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaComponent_IsReplaceable(), ecorePackage.getEBoolean(), "isReplaceable", null, 1, 1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaComponent_ArraySize(), ecorePackage.getEString(), "arraySize", null, 0, -1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaComponent_OwnerModelicaClassDefinition(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_ModelicaComponents(), "ownerModelicaClassDefinition", null, 0, 1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaComponent_Type_specifier(), ecorePackage.getEString(), "type_specifier", null, 0, 1, ModelicaComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelicaValuePropertyEClass, ModelicaValueProperty.class, "ModelicaValueProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaValueProperty_Visibility(), this.getVisibilityKind(), "visibility", null, 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Causality(), this.getModelicaCausalityKind(), "causality", null, 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Variability(), this.getModelicaVariabilityKind(), "variability", null, 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaValueProperty_FlowFlag(), this.getModelicaFlowFlag(), "flowFlag", null, 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Scope(), this.getModelicaScopeKind(), "scope", null, 1, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaValueProperty_Default_value(), ecorePackage.getEString(), "default_value", null, 0, 1, ModelicaValueProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelicaPartEClass, ModelicaPart.class, "ModelicaPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelicaPart_Visibility(), this.getVisibilityKind(), "visibility", null, 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaPart_Scope(), this.getModelicaScopeKind(), "scope", null, 1, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaPart_Type_part(), this.getModelicaClassDefinition(), null, "type_part", null, 0, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelicaPart_ConstrainedBy(), this.getConstrainedByClause(), this.getConstrainedByClause_OwnerInstance(), "constrainedBy", null, 0, 1, ModelicaPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelicaPortEClass, ModelicaPort.class, "ModelicaPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaPort_Type_connector(), this.getConnector(), null, "type_connector", null, 0, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaPort_Causality(), this.getModelicaCausalityKind(), "causality", null, 1, 1, ModelicaPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equationEClass, Equation.class, "Equation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquation_OwnerEquationSection(), this.getEquationSection(), this.getEquationSection_Equations(), "ownerEquationSection", null, 0, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquation_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 1, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquation_Body(), ecorePackage.getEString(), "body", null, 1, 1, Equation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectEClass, Connect.class, "Connect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnect_OwnerEquationSection(), this.getEquationSection(), this.getEquationSection_Connects(), "ownerEquationSection", null, 0, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnect_From(), this.getModelicaPort(), null, "from", null, 1, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnect_To(), this.getModelicaPort(), null, "to", null, 1, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnect_FromModelicaPart(), this.getModelicaPart(), null, "fromModelicaPart", null, 1, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnect_ToModelicaPart(), this.getModelicaPart(), null, "toModelicaPart", null, 1, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnect_FromPort(), ecorePackage.getEString(), "fromPort", null, 0, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnect_ToPort(), ecorePackage.getEString(), "toPort", null, 0, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnect_FromPart(), ecorePackage.getEString(), "fromPart", null, 0, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnect_ToPart(), ecorePackage.getEString(), "toPart", null, 0, 1, Connect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equationSectionEClass, EquationSection.class, "EquationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquationSection_OwnerModelicaClassDefinition(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_EquationSection(), "ownerModelicaClassDefinition", null, 1, 1, EquationSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquationSection_Equations(), this.getEquation(), this.getEquation_OwnerEquationSection(), "equations", null, 0, -1, EquationSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEquationSection_Connects(), this.getConnect(), this.getConnect_OwnerEquationSection(), "connects", null, 0, -1, EquationSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelicaFunctionParameterEClass, ModelicaFunctionParameter.class, "ModelicaFunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelicaFunctionParameter_OwnerFunction(), this.getFunction(), this.getFunction_Parameters(), "ownerFunction", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Causality(), this.getModelicaCausalityKind(), "causality", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_IsReplaceable(), ecorePackage.getEBoolean(), "isReplaceable", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_DeclarationEquation(), ecorePackage.getEString(), "declarationEquation", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_ArraySize(), ecorePackage.getEString(), "arraySize", null, 0, -1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Variability(), this.getModelicaVariabilityKind(), "variability", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Type_specifier(), ecorePackage.getEString(), "type_specifier", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_IsProtected(), ecorePackage.getEBoolean(), "isProtected", null, 1, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelicaFunctionParameter_Default_value(), ecorePackage.getEString(), "default_value", null, 0, 1, ModelicaFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algorithmSectionEClass, AlgorithmSection.class, "AlgorithmSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlgorithmSection_OwnerModelicaClassDefinition(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_AlgorithmSections(), "ownerModelicaClassDefinition", null, 1, 1, AlgorithmSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithmSection_Algorithm(), this.getAlgorithm(), this.getAlgorithm_Algorithmsection(), "algorithm", null, 0, -1, AlgorithmSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constrainedByClauseEClass, ConstrainedByClause.class, "ConstrainedByClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstrainedByClause_Modification(), ecorePackage.getEString(), "modification", null, 0, 1, ConstrainedByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstrainedByClause_OwnerInstance(), this.getModelicaPart(), this.getModelicaPart_ConstrainedBy(), "ownerInstance", null, 0, 1, ConstrainedByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstrainedByClause_InstanceForConstrainedBy(), this.getModelicaPart(), null, "instanceForConstrainedBy", null, 0, 1, ConstrainedByClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Body(), ecorePackage.getEString(), "body", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_OwnerMCD(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_Annotations(), "ownerMCD", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_OwnerModelicaClassDefinition(), this.getModelicaClassDefinition(), this.getModelicaClassDefinition_Comments(), "ownerModelicaClassDefinition", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Body(), ecorePackage.getEString(), "body", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(algorithmEClass, Algorithm.class, "Algorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithm_Body(), ecorePackage.getEString(), "body", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Algorithmsection(), this.getAlgorithmSection(), this.getAlgorithmSection_Algorithm(), "algorithmsection", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_EnumerationLiterals(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "enumerationLiterals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_EnumerationLiterals(), "enumeration", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);

		initEEnum(modelicaCausalityKindEEnum, ModelicaCausalityKind.class, "ModelicaCausalityKind");
		addEEnumLiteral(modelicaCausalityKindEEnum, ModelicaCausalityKind.NONE);
		addEEnumLiteral(modelicaCausalityKindEEnum, ModelicaCausalityKind.INPUT);
		addEEnumLiteral(modelicaCausalityKindEEnum, ModelicaCausalityKind.OUTPUT);

		initEEnum(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.class, "ModelicaVariabilityKind");
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.CONTINUOUS);
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.CONSTANT);
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.PARAMETER);
		addEEnumLiteral(modelicaVariabilityKindEEnum, ModelicaVariabilityKind.DISCRETE);

		initEEnum(modelicaFlowFlagEEnum, ModelicaFlowFlag.class, "ModelicaFlowFlag");
		addEEnumLiteral(modelicaFlowFlagEEnum, ModelicaFlowFlag.NONE);
		addEEnumLiteral(modelicaFlowFlagEEnum, ModelicaFlowFlag.FLOW);
		addEEnumLiteral(modelicaFlowFlagEEnum, ModelicaFlowFlag.STREAM);

		initEEnum(modelicaScopeKindEEnum, ModelicaScopeKind.class, "ModelicaScopeKind");
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.NONE);
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.INNEROUTER);
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.OUTER);
		addEEnumLiteral(modelicaScopeKindEEnum, ModelicaScopeKind.INNER);

		// Create resource
		createResource(eNS_URI);
	}

} //modelicaPackageImpl
