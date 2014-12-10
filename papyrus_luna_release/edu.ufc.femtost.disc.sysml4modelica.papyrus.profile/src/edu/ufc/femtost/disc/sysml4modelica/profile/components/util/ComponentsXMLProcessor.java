/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.components.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.components.ComponentsPackage;

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
public class ComponentsXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ComponentsPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ComponentsResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ComponentsResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ComponentsResourceFactoryImpl());
		}
		return registrations;
	}

} //ComponentsXMLProcessor
