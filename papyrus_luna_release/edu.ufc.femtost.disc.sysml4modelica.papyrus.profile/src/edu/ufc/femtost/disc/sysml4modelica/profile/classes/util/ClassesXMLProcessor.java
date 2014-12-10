/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.classes.ClassesPackage;

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
public class ClassesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ClassesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ClassesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ClassesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ClassesResourceFactoryImpl());
		}
		return registrations;
	}

} //ClassesXMLProcessor
