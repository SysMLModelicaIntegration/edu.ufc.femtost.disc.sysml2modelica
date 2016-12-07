/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getType_part <em>Type part</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getConstrainedBy <em>Constrained By</em>}</li>
 * </ul>
 *
 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPart()
 * @model
 * @generated
 */
public interface ModelicaPart extends ModelicaComponent {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPart_Visibility()
	 * @model required="true"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind
	 * @see #setScope(ModelicaScopeKind)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPart_Scope()
	 * @model required="true"
	 * @generated
	 */
	ModelicaScopeKind getScope();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaScopeKind
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ModelicaScopeKind value);

	/**
	 * Returns the value of the '<em><b>Type part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type part</em>' reference.
	 * @see #setType_part(ModelicaClassDefinition)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPart_Type_part()
	 * @model
	 * @generated
	 */
	ModelicaClassDefinition getType_part();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getType_part <em>Type part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type part</em>' reference.
	 * @see #getType_part()
	 * @generated
	 */
	void setType_part(ModelicaClassDefinition value);

	/**
	 * Returns the value of the '<em><b>Constrained By</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getOwnerInstance <em>Owner Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained By</em>' containment reference.
	 * @see #setConstrainedBy(ConstrainedByClause)
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage#getModelicaPart_ConstrainedBy()
	 * @see edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause#getOwnerInstance
	 * @model opposite="ownerInstance" containment="true"
	 * @generated
	 */
	ConstrainedByClause getConstrainedBy();

	/**
	 * Sets the value of the '{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart#getConstrainedBy <em>Constrained By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained By</em>' containment reference.
	 * @see #getConstrainedBy()
	 * @generated
	 */
	void setConstrainedBy(ConstrainedByClause value);

} // ModelicaPart
