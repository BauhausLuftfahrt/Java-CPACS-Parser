/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emissivity Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EmissivityMapType#getWaveLength <em>Wave Length</em>}</li>
 *   <li>{@link Cpacs.EmissivityMapType#getDiffuseEmissivity <em>Diffuse Emissivity</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEmissivityMapType()
 * @model extendedMetaData="name='emissivityMapType' kind='elementOnly'"
 * @generated
 */
public interface EmissivityMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wave Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wave length in [m]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wave Length</em>' containment reference.
	 * @see #setWaveLength(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEmissivityMapType_WaveLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='waveLength' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getWaveLength();

	/**
	 * Sets the value of the '{@link Cpacs.EmissivityMapType#getWaveLength <em>Wave Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wave Length</em>' containment reference.
	 * @see #getWaveLength()
	 * @generated
	 */
	void setWaveLength(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Diffuse Emissivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diffuse emissivity of the material
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diffuse Emissivity</em>' containment reference.
	 * @see #setDiffuseEmissivity(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEmissivityMapType_DiffuseEmissivity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='diffuseEmissivity' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDiffuseEmissivity();

	/**
	 * Sets the value of the '{@link Cpacs.EmissivityMapType#getDiffuseEmissivity <em>Diffuse Emissivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Emissivity</em>' containment reference.
	 * @see #getDiffuseEmissivity()
	 * @generated
	 */
	void setDiffuseEmissivity(StringVectorBaseType value);

} // EmissivityMapType
