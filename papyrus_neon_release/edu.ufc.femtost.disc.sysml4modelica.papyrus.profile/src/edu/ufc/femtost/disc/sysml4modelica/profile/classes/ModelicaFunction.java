/**
 */
package edu.ufc.femtost.disc.sysml4modelica.profile.classes;

import edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind;

import org.eclipse.uml2.uml.FunctionBehavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getBase_FunctionBehavior <em>Base Function Behavior</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalLibrary <em>External Library</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalInclude <em>External Include</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#getModelicaFunction()
 * @model
 * @generated
 */
public interface ModelicaFunction extends ModelicaClassDefinition {
	/**
	 * Returns the value of the '<em><b>Base Function Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Function Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Function Behavior</em>' reference.
	 * @see #setBase_FunctionBehavior(FunctionBehavior)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#getModelicaFunction_Base_FunctionBehavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionBehavior getBase_FunctionBehavior();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getBase_FunctionBehavior <em>Base Function Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Function Behavior</em>' reference.
	 * @see #getBase_FunctionBehavior()
	 * @generated
	 */
	void setBase_FunctionBehavior(FunctionBehavior value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @see #setScope(ModelicaScopeKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#getModelicaFunction_Scope()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	ModelicaScopeKind getScope();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.types.ModelicaScopeKind
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ModelicaScopeKind value);

	/**
	 * Returns the value of the '<em><b>External Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Library</em>' attribute.
	 * @see #setExternalLibrary(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#getModelicaFunction_ExternalLibrary()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getExternalLibrary();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalLibrary <em>External Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Library</em>' attribute.
	 * @see #getExternalLibrary()
	 * @generated
	 */
	void setExternalLibrary(String value);

	/**
	 * Returns the value of the '<em><b>External Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Include</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Include</em>' attribute.
	 * @see #setExternalInclude(String)
	 * @see edu.ufc.femtost.disc.sysml4modelica.profile.classes.classesPackage#getModelicaFunction_ExternalInclude()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getExternalInclude();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.profile.classes.ModelicaFunction#getExternalInclude <em>External Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Include</em>' attribute.
	 * @see #getExternalInclude()
	 * @generated
	 */
	void setExternalInclude(String value);

} // ModelicaFunction
