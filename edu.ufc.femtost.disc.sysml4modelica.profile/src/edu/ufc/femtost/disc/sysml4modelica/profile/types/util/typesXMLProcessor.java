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
package edu.ufc.femtost.disc.sysml4modelica.profile.types.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.typesPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class typesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		typesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the typesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new typesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new typesResourceFactoryImpl());
		}
		return registrations;
	}

} //typesXMLProcessor
