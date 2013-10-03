/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.types.util;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.TypesPackage
 * @generated
 */
public class TypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesSwitch<Adapter> modelSwitch =
		new TypesSwitch<Adapter>() {
			@Override
			public Adapter caseModelicaReal(ModelicaReal object) {
				return createModelicaRealAdapter();
			}
			@Override
			public Adapter caseModelicaInteger(ModelicaInteger object) {
				return createModelicaIntegerAdapter();
			}
			@Override
			public Adapter caseModelicaString(ModelicaString object) {
				return createModelicaStringAdapter();
			}
			@Override
			public Adapter caseModelicaBoolean(ModelicaBoolean object) {
				return createModelicaBooleanAdapter();
			}
			@Override
			public Adapter caseModelicaExternalObject(ModelicaExternalObject object) {
				return createModelicaExternalObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaReal <em>Modelica Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaReal
	 * @generated
	 */
	public Adapter createModelicaRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaInteger <em>Modelica Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaInteger
	 * @generated
	 */
	public Adapter createModelicaIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaString <em>Modelica String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaString
	 * @generated
	 */
	public Adapter createModelicaStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaBoolean <em>Modelica Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaBoolean
	 * @generated
	 */
	public Adapter createModelicaBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaExternalObject <em>Modelica External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaExternalObject
	 * @generated
	 */
	public Adapter createModelicaExternalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TypesAdapterFactory
