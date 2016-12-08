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
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State Machine Element Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getStateMachineElementType()
 * @model
 * @generated
 */
public enum StateMachineElementType implements Enumerator {
	/**
	 * The '<em><b>Statemachine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	STATEMACHINE(0, "statemachine", "statemachine"),

	/**
	 * The '<em><b>Region</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGION_VALUE
	 * @generated
	 * @ordered
	 */
	REGION(0, "region", "region"),

	/**
	 * The '<em><b>Initialstate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALSTATE_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALSTATE(0, "initialstate", "initialstate"),

	/**
	 * The '<em><b>Simplestate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLESTATE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLESTATE(0, "simplestate", "simplestate"),

	/**
	 * The '<em><b>Finalstate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALSTATE_VALUE
	 * @generated
	 * @ordered
	 */
	FINALSTATE(0, "finalstate", "finalstate");

	/**
	 * The '<em><b>Statemachine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Statemachine</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATEMACHINE
	 * @model name="statemachine"
	 * @generated
	 * @ordered
	 */
	public static final int STATEMACHINE_VALUE = 0;

	/**
	 * The '<em><b>Region</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Region</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGION
	 * @model name="region"
	 * @generated
	 * @ordered
	 */
	public static final int REGION_VALUE = 0;

	/**
	 * The '<em><b>Initialstate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initialstate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALSTATE
	 * @model name="initialstate"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALSTATE_VALUE = 0;

	/**
	 * The '<em><b>Simplestate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simplestate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLESTATE
	 * @model name="simplestate"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLESTATE_VALUE = 0;

	/**
	 * The '<em><b>Finalstate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Finalstate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINALSTATE
	 * @model name="finalstate"
	 * @generated
	 * @ordered
	 */
	public static final int FINALSTATE_VALUE = 0;

	/**
	 * An array of all the '<em><b>State Machine Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StateMachineElementType[] VALUES_ARRAY =
		new StateMachineElementType[] {
			STATEMACHINE,
			REGION,
			INITIALSTATE,
			SIMPLESTATE,
			FINALSTATE,
		};

	/**
	 * A public read-only list of all the '<em><b>State Machine Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StateMachineElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State Machine Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateMachineElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Machine Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StateMachineElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State Machine Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateMachineElementType get(int value) {
		switch (value) {
			case STATEMACHINE_VALUE: return STATEMACHINE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StateMachineElementType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StateMachineElementType
