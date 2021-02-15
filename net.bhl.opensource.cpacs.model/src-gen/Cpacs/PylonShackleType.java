/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Shackle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonShackleType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.PylonShackleType#getStructuralProfileUID <em>Structural Profile UID</em>}</li>
 *   <li>{@link Cpacs.PylonShackleType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonShackleType()
 * @model extendedMetaData="name='pylonShackleType' kind='elementOnly'"
 * @generated
 */
public interface PylonShackleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material properties of the shackle.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getPylonShackleType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.PylonShackleType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Structural Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to the structural profile of the shackle.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Profile UID</em>' containment reference.
	 * @see #setStructuralProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPylonShackleType_StructuralProfileUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralProfileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.PylonShackleType#getStructuralProfileUID <em>Structural Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Profile UID</em>' containment reference.
	 * @see #getStructuralProfileUID()
	 * @generated
	 */
	void setStructuralProfileUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the shackle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPylonShackleType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PylonShackleType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PylonShackleType
