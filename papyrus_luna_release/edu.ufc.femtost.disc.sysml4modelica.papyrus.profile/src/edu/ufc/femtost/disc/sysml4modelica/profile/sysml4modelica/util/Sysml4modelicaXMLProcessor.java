/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.sysml4modelica.Sysml4modelicaPackage;

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
public class Sysml4modelicaXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sysml4modelicaXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Sysml4modelicaPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Sysml4modelicaResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Sysml4modelicaResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Sysml4modelicaResourceFactoryImpl());
		}
		return registrations;
	}

} //Sysml4modelicaXMLProcessor
