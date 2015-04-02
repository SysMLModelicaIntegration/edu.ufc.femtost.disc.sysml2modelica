/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.other.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.other.OtherPackage;

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
public class OtherXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		OtherPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the OtherResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new OtherResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new OtherResourceFactoryImpl());
		}
		return registrations;
	}

} //OtherXMLProcessor
