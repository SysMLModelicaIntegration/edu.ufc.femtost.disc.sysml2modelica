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

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector#isExpandable <em>Is Expandable</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#getModelicaConnector()
 * @model
 * @generated
 */
public interface ModelicaConnector extends ModelicaClassDefinition, Block {
	/**
	 * Returns the value of the '<em><b>Is Expandable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Expandable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Expandable</em>' attribute.
	 * @see #setIsExpandable(boolean)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#getModelicaConnector_IsExpandable()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isExpandable();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaConnector#isExpandable <em>Is Expandable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Expandable</em>' attribute.
	 * @see #isExpandable()
	 * @generated
	 */
	void setIsExpandable(boolean value);

} // ModelicaConnector
