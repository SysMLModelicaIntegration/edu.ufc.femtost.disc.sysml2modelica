/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.femto-st.fr/disc/SysML4Modelica/Components";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl <em>Modelica Value Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaValueProperty()
	 * @generated
	 */
	int MODELICA_VALUE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__CAUSALITY = 0;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__VARIABILITY = 1;

	/**
	 * The feature id for the '<em><b>Flow Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__FLOW_FLAG = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__IS_FINAL = 4;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__MODIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__IS_REPLACEABLE = 7;

	/**
	 * The feature id for the '<em><b>Declaration Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION = 8;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__ARRAY_SIZE = 9;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY__BASE_PROPERTY = 10;

	/**
	 * The number of structural features of the '<em>Modelica Value Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_VALUE_PROPERTY_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl <em>Modelica Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaPart()
	 * @generated
	 */
	int MODELICA_PART = 1;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__ARRAY_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__MODIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__IS_REPLACEABLE = 3;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__CONDITIONAL_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__IS_FINAL = 5;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART__BASE_PROPERTY = 6;

	/**
	 * The number of structural features of the '<em>Modelica Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PART_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl <em>Modelica Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaPort()
	 * @generated
	 */
	int MODELICA_PORT = 2;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__IS_REPLACEABLE = 0;

	/**
	 * The feature id for the '<em><b>Conditional Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__CONDITIONAL_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__MODIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__ARRAY_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__CAUSALITY = 4;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__IS_FINAL = 5;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT__BASE_PORT = 6;

	/**
	 * The number of structural features of the '<em>Modelica Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_PORT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl <em>Modelica Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaFunctionParameter()
	 * @generated
	 */
	int MODELICA_FUNCTION_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Declaration Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION = 1;

	/**
	 * The feature id for the '<em><b>Is Replaceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE = 2;

	/**
	 * The feature id for the '<em><b>Variability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__VARIABILITY = 3;

	/**
	 * The feature id for the '<em><b>Causality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__CAUSALITY = 4;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__IS_FINAL = 5;

	/**
	 * The feature id for the '<em><b>Modification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__MODIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Array Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE = 7;

	/**
	 * The number of structural features of the '<em>Modelica Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_FUNCTION_PARAMETER_FEATURE_COUNT = 8;


	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty <em>Modelica Value Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Value Property</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty
	 * @generated
	 */
	EClass getModelicaValueProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getCausality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causality</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getCausality()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Causality();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getVariability()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Variability();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getFlowFlag <em>Flow Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Flag</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getFlowFlag()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_FlowFlag();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getScope()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Scope();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isFinal()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_IsFinal();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Expression</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getConditionalExpression()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_ConditionalExpression();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getModification()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_Modification();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#isReplaceable()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_IsReplaceable();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getDeclarationEquation <em>Declaration Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Equation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getDeclarationEquation()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_DeclarationEquation();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getArraySize()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EAttribute getModelicaValueProperty_ArraySize();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaValueProperty#getBase_Property()
	 * @see #getModelicaValueProperty()
	 * @generated
	 */
	EReference getModelicaValueProperty_Base_Property();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart <em>Modelica Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Part</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart
	 * @generated
	 */
	EClass getModelicaPart();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getArraySize()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_ArraySize();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getScope()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_Scope();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getModification()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_Modification();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#isReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#isReplaceable()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_IsReplaceable();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Expression</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getConditionalExpression()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_ConditionalExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#isFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#isFinal()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EAttribute getModelicaPart_IsFinal();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPart#getBase_Property()
	 * @see #getModelicaPart()
	 * @generated
	 */
	EReference getModelicaPart_Base_Property();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort <em>Modelica Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Port</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort
	 * @generated
	 */
	EClass getModelicaPort();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isReplaceable()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EAttribute getModelicaPort_IsReplaceable();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditional Expression</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getConditionalExpression()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EAttribute getModelicaPort_ConditionalExpression();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getModification()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EAttribute getModelicaPort_Modification();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getArraySize()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EAttribute getModelicaPort_ArraySize();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getCausality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causality</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getCausality()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EAttribute getModelicaPort_Causality();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#isFinal()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EAttribute getModelicaPort_IsFinal();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaPort#getBase_Port()
	 * @see #getModelicaPort()
	 * @generated
	 */
	EReference getModelicaPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter <em>Modelica Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Function Parameter</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter
	 * @generated
	 */
	EClass getModelicaFunctionParameter();

	/**
	 * Returns the meta object for the reference '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getBase_Parameter <em>Base Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Parameter</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getBase_Parameter()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EReference getModelicaFunctionParameter_Base_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getDeclarationEquation <em>Declaration Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Equation</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getDeclarationEquation()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_DeclarationEquation();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isReplaceable <em>Is Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Replaceable</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isReplaceable()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_IsReplaceable();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getVariability <em>Variability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variability</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getVariability()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Variability();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getCausality <em>Causality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Causality</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getCausality()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Causality();

	/**
	 * Returns the meta object for the attribute '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#isFinal()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_IsFinal();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getModification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modification</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getModification()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_Modification();

	/**
	 * Returns the meta object for the attribute list '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getArraySize <em>Array Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Size</em>'.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.ModelicaFunctionParameter#getArraySize()
	 * @see #getModelicaFunctionParameter()
	 * @generated
	 */
	EAttribute getModelicaFunctionParameter_ArraySize();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

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
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl <em>Modelica Value Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaValuePropertyImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaValueProperty()
		 * @generated
		 */
		EClass MODELICA_VALUE_PROPERTY = eINSTANCE.getModelicaValueProperty();

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
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__IS_FINAL = eINSTANCE.getModelicaValueProperty_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__CONDITIONAL_EXPRESSION = eINSTANCE.getModelicaValueProperty_ConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__MODIFICATION = eINSTANCE.getModelicaValueProperty_Modification();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__IS_REPLACEABLE = eINSTANCE.getModelicaValueProperty_IsReplaceable();

		/**
		 * The meta object literal for the '<em><b>Declaration Equation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__DECLARATION_EQUATION = eINSTANCE.getModelicaValueProperty_DeclarationEquation();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_VALUE_PROPERTY__ARRAY_SIZE = eINSTANCE.getModelicaValueProperty_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_VALUE_PROPERTY__BASE_PROPERTY = eINSTANCE.getModelicaValueProperty_Base_Property();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl <em>Modelica Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPartImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaPart()
		 * @generated
		 */
		EClass MODELICA_PART = eINSTANCE.getModelicaPart();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__ARRAY_SIZE = eINSTANCE.getModelicaPart_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__SCOPE = eINSTANCE.getModelicaPart_Scope();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__MODIFICATION = eINSTANCE.getModelicaPart_Modification();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__IS_REPLACEABLE = eINSTANCE.getModelicaPart_IsReplaceable();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__CONDITIONAL_EXPRESSION = eINSTANCE.getModelicaPart_ConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PART__IS_FINAL = eINSTANCE.getModelicaPart_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_PART__BASE_PROPERTY = eINSTANCE.getModelicaPart_Base_Property();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl <em>Modelica Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaPortImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaPort()
		 * @generated
		 */
		EClass MODELICA_PORT = eINSTANCE.getModelicaPort();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PORT__IS_REPLACEABLE = eINSTANCE.getModelicaPort_IsReplaceable();

		/**
		 * The meta object literal for the '<em><b>Conditional Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PORT__CONDITIONAL_EXPRESSION = eINSTANCE.getModelicaPort_ConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PORT__MODIFICATION = eINSTANCE.getModelicaPort_Modification();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PORT__ARRAY_SIZE = eINSTANCE.getModelicaPort_ArraySize();

		/**
		 * The meta object literal for the '<em><b>Causality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PORT__CAUSALITY = eINSTANCE.getModelicaPort_Causality();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_PORT__IS_FINAL = eINSTANCE.getModelicaPort_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_PORT__BASE_PORT = eINSTANCE.getModelicaPort_Base_Port();

		/**
		 * The meta object literal for the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl <em>Modelica Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ModelicaFunctionParameterImpl
		 * @see edu.ufc.femtost.disc.sysml4modelica.profile.components.impl.ComponentsPackageImpl#getModelicaFunctionParameter()
		 * @generated
		 */
		EClass MODELICA_FUNCTION_PARAMETER = eINSTANCE.getModelicaFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Base Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_FUNCTION_PARAMETER__BASE_PARAMETER = eINSTANCE.getModelicaFunctionParameter_Base_Parameter();

		/**
		 * The meta object literal for the '<em><b>Declaration Equation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__DECLARATION_EQUATION = eINSTANCE.getModelicaFunctionParameter_DeclarationEquation();

		/**
		 * The meta object literal for the '<em><b>Is Replaceable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__IS_REPLACEABLE = eINSTANCE.getModelicaFunctionParameter_IsReplaceable();

		/**
		 * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__VARIABILITY = eINSTANCE.getModelicaFunctionParameter_Variability();

		/**
		 * The meta object literal for the '<em><b>Causality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__CAUSALITY = eINSTANCE.getModelicaFunctionParameter_Causality();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__IS_FINAL = eINSTANCE.getModelicaFunctionParameter_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Modification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__MODIFICATION = eINSTANCE.getModelicaFunctionParameter_Modification();

		/**
		 * The meta object literal for the '<em><b>Array Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_FUNCTION_PARAMETER__ARRAY_SIZE = eINSTANCE.getModelicaFunctionParameter_ArraySize();

	}

} //ComponentsPackage
