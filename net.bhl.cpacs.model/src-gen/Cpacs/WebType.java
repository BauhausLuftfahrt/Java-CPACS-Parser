/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WebType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.WebType#getRelPos <em>Rel Pos</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWebType()
 * @model extendedMetaData="name='webType' kind='elementOnly'"
 * @generated
 */
public interface WebType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material definition of the spar web.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getWebType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.WebType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Rel Pos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * relPos ranges from 0 to 1 It defines the
	 *                                 position of the web relative to the caps (see picture below)..
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Pos</em>' containment reference.
	 * @see #setRelPos(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWebType_RelPos()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relPos' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelPos();

	/**
	 * Sets the value of the '{@link Cpacs.WebType#getRelPos <em>Rel Pos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Pos</em>' containment reference.
	 * @see #getRelPos()
	 * @generated
	 */
	void setRelPos(DoubleBaseType value);

} // WebType
