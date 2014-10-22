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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getName <em>Name</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsModelicaEncapsulated <em>Is Modelica Encapsulated</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getFromLibrary <em>From Library</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsReplaceable <em>Is Replaceable</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getExtends <em>Extends</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerModel <em>Owner Model</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerPackage <em>Owner Package</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getModelicaComponents <em>Modelica Components</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getEquationSection <em>Equation Section</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAlgorithmSections <em>Algorithm Sections</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition()
 * @model abstract="true"
 * @generated
 */
public interface ModelicaClassDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Partial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Partial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Partial</em>' attribute.
	 * @see #setIsPartial(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_IsPartial()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPartial();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsPartial <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Partial</em>' attribute.
	 * @see #isIsPartial()
	 * @generated
	 */
	void setIsPartial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_IsFinal()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Modelica Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Modelica Encapsulated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Modelica Encapsulated</em>' attribute.
	 * @see #setIsModelicaEncapsulated(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_IsModelicaEncapsulated()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsModelicaEncapsulated();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsModelicaEncapsulated <em>Is Modelica Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Modelica Encapsulated</em>' attribute.
	 * @see #isIsModelicaEncapsulated()
	 * @generated
	 */
	void setIsModelicaEncapsulated(boolean value);

	/**
	 * Returns the value of the '<em><b>From Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Library</em>' attribute.
	 * @see #setFromLibrary(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_FromLibrary()
	 * @model
	 * @generated
	 */
	String getFromLibrary();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getFromLibrary <em>From Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Library</em>' attribute.
	 * @see #getFromLibrary()
	 * @generated
	 */
	void setFromLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Replaceable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Replaceable</em>' attribute.
	 * @see #setIsReplaceable(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_IsReplaceable()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsReplaceable();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#isIsReplaceable <em>Is Replaceable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replaceable</em>' attribute.
	 * @see #isIsReplaceable()
	 * @generated
	 */
	void setIsReplaceable(boolean value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_Extends()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ExtendsClause#getOwnerModelicaClassDefinition
	 * @model opposite="ownerModelicaClassDefinition" containment="true"
	 * @generated
	 */
	EList<ExtendsClause> getExtends();

	/**
	 * Returns the value of the '<em><b>Owner Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel#getModelicaClasses <em>Modelica Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Model</em>' container reference.
	 * @see #setOwnerModel(ModelicaModel)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_OwnerModel()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaModel#getModelicaClasses
	 * @model opposite="modelicaClasses" transient="false"
	 * @generated
	 */
	ModelicaModel getOwnerModel();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerModel <em>Owner Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Model</em>' container reference.
	 * @see #getOwnerModel()
	 * @generated
	 */
	void setOwnerModel(ModelicaModel value);

	/**
	 * Returns the value of the '<em><b>Owner Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getModelicaClasses <em>Modelica Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Package</em>' container reference.
	 * @see #setOwnerPackage(edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_OwnerPackage()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package#getModelicaClasses
	 * @model opposite="modelicaClasses" transient="false"
	 * @generated
	 */
	edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package getOwnerPackage();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getOwnerPackage <em>Owner Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Package</em>' container reference.
	 * @see #getOwnerPackage()
	 * @generated
	 */
	void setOwnerPackage(edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Package value);

	/**
	 * Returns the value of the '<em><b>Modelica Components</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelica Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelica Components</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_ModelicaComponents()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaComponent#getOwnerModelicaClassDefinition
	 * @model opposite="ownerModelicaClassDefinition" containment="true"
	 * @generated
	 */
	EList<ModelicaComponent> getModelicaComponents();

	/**
	 * Returns the value of the '<em><b>Equation Section</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation Section</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation Section</em>' containment reference.
	 * @see #setEquationSection(EquationSection)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_EquationSection()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.EquationSection#getOwnerModelicaClassDefinition
	 * @model opposite="ownerModelicaClassDefinition" containment="true"
	 * @generated
	 */
	EquationSection getEquationSection();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaClassDefinition#getEquationSection <em>Equation Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation Section</em>' containment reference.
	 * @see #getEquationSection()
	 * @generated
	 */
	void setEquationSection(EquationSection value);

	/**
	 * Returns the value of the '<em><b>Algorithm Sections</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Sections</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_AlgorithmSections()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.AlgorithmSection#getOwnerModelicaClassDefinition
	 * @model opposite="ownerModelicaClassDefinition" containment="true"
	 * @generated
	 */
	EList<AlgorithmSection> getAlgorithmSections();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation#getOwnerMCD <em>Owner MCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_Annotations()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Annotation#getOwnerMCD
	 * @model opposite="ownerMCD" containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment}.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment#getOwnerModelicaClassDefinition <em>Owner Modelica Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.MoPackage#getModelicaClassDefinition_Comments()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.Comment#getOwnerModelicaClassDefinition
	 * @model opposite="ownerModelicaClassDefinition" containment="true"
	 * @generated
	 */
	EList<Comment> getComments();

} // ModelicaClassDefinition
