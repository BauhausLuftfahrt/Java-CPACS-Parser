/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aeroelastic Static Max Displacement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroelasticStaticMaxDisplacementType#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.AeroelasticStaticMaxDisplacementType#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroelasticStaticMaxDisplacementType()
 * @model extendedMetaData="name='aeroelasticStaticMaxDisplacementType' kind='elementOnly'"
 * @generated
 */
public interface AeroelasticStaticMaxDisplacementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum translation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(PointType)
	 * @see Cpacs.CpacsPackage#getAeroelasticStaticMaxDisplacementType_Translation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='translation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.AeroelasticStaticMaxDisplacementType#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(PointType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum rotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(PointType)
	 * @see Cpacs.CpacsPackage#getAeroelasticStaticMaxDisplacementType_Rotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.AeroelasticStaticMaxDisplacementType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(PointType value);

} // AeroelasticStaticMaxDisplacementType
