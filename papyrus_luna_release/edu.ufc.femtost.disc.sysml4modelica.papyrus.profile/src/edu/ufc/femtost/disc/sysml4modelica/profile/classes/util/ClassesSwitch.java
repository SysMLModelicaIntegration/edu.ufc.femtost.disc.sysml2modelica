/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.sysml.blocks.Block;
import org.eclipse.papyrus.sysml.blocks.ValueType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage
 * @generated
 */
public class ClassesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClassesPackage.MODELICA_CLASS_DEFINITION: {
				ModelicaClassDefinition modelicaClassDefinition = (ModelicaClassDefinition)theEObject;
				T result = caseModelicaClassDefinition(modelicaClassDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_CLASS: {
				ModelicaClass modelicaClass = (ModelicaClass)theEObject;
				T result = caseModelicaClass(modelicaClass);
				if (result == null) result = caseModelicaClassDefinition(modelicaClass);
				if (result == null) result = caseBlock(modelicaClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_MODEL: {
				ModelicaModel modelicaModel = (ModelicaModel)theEObject;
				T result = caseModelicaModel(modelicaModel);
				if (result == null) result = caseModelicaClassDefinition(modelicaModel);
				if (result == null) result = caseBlock(modelicaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_BLOCK: {
				ModelicaBlock modelicaBlock = (ModelicaBlock)theEObject;
				T result = caseModelicaBlock(modelicaBlock);
				if (result == null) result = caseModelicaClassDefinition(modelicaBlock);
				if (result == null) result = caseBlock(modelicaBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_RECORD: {
				ModelicaRecord modelicaRecord = (ModelicaRecord)theEObject;
				T result = caseModelicaRecord(modelicaRecord);
				if (result == null) result = caseModelicaClassDefinition(modelicaRecord);
				if (result == null) result = caseBlock(modelicaRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_OPERATOR: {
				ModelicaOperator modelicaOperator = (ModelicaOperator)theEObject;
				T result = caseModelicaOperator(modelicaOperator);
				if (result == null) result = caseModelicaClassDefinition(modelicaOperator);
				if (result == null) result = caseBlock(modelicaOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_CONNECTOR: {
				ModelicaConnector modelicaConnector = (ModelicaConnector)theEObject;
				T result = caseModelicaConnector(modelicaConnector);
				if (result == null) result = caseModelicaClassDefinition(modelicaConnector);
				if (result == null) result = caseBlock(modelicaConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_PACKAGE: {
				ModelicaPackage modelicaPackage = (ModelicaPackage)theEObject;
				T result = caseModelicaPackage(modelicaPackage);
				if (result == null) result = caseModelicaClassDefinition(modelicaPackage);
				if (result == null) result = caseBlock(modelicaPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_TYPE: {
				ModelicaType modelicaType = (ModelicaType)theEObject;
				T result = caseModelicaType(modelicaType);
				if (result == null) result = caseModelicaClassDefinition(modelicaType);
				if (result == null) result = caseValueType(modelicaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_FUNCTION: {
				ModelicaFunction modelicaFunction = (ModelicaFunction)theEObject;
				T result = caseModelicaFunction(modelicaFunction);
				if (result == null) result = caseModelicaClassDefinition(modelicaFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_EXTENDS: {
				ModelicaExtends modelicaExtends = (ModelicaExtends)theEObject;
				T result = caseModelicaExtends(modelicaExtends);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_CONSTRAINED_BY: {
				ModelicaConstrainedBy modelicaConstrainedBy = (ModelicaConstrainedBy)theEObject;
				T result = caseModelicaConstrainedBy(modelicaConstrainedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassesPackage.MODELICA_DER: {
				ModelicaDer modelicaDer = (ModelicaDer)theEObject;
				T result = caseModelicaDer(modelicaDer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Class Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Class Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaClassDefinition(ModelicaClassDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaClass(ModelicaClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaModel(ModelicaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaBlock(ModelicaBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaRecord(ModelicaRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaOperator(ModelicaOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaConnector(ModelicaConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaPackage(ModelicaPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaType(ModelicaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaFunction(ModelicaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Extends</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Extends</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaExtends(ModelicaExtends object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Constrained By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Constrained By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaConstrainedBy(ModelicaConstrainedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Der</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Der</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaDer(ModelicaDer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ClassesSwitch
