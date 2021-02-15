/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runway ILS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RunwayILSType#getAntennaPositionLOC <em>Antenna Position LOC</em>}</li>
 *   <li>{@link Cpacs.RunwayILSType#getAntennaPositionGS <em>Antenna Position GS</em>}</li>
 *   <li>{@link Cpacs.RunwayILSType#getGlidePathAngle <em>Glide Path Angle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRunwayILSType()
 * @model extendedMetaData="name='runwayILSType' kind='elementOnly'"
 * @generated
 */
public interface RunwayILSType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Antenna Position LOC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position of the localizer antenna
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antenna Position LOC</em>' containment reference.
	 * @see #setAntennaPositionLOC(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayILSType_AntennaPositionLOC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='antennaPositionLOC' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAntennaPositionLOC();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayILSType#getAntennaPositionLOC <em>Antenna Position LOC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antenna Position LOC</em>' containment reference.
	 * @see #getAntennaPositionLOC()
	 * @generated
	 */
	void setAntennaPositionLOC(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Antenna Position GS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position of the glide slope antenna
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antenna Position GS</em>' containment reference.
	 * @see #setAntennaPositionGS(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayILSType_AntennaPositionGS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='antennaPositionGS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAntennaPositionGS();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayILSType#getAntennaPositionGS <em>Antenna Position GS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antenna Position GS</em>' containment reference.
	 * @see #getAntennaPositionGS()
	 * @generated
	 */
	void setAntennaPositionGS(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Glide Path Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of the glide path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glide Path Angle</em>' containment reference.
	 * @see #setGlidePathAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRunwayILSType_GlidePathAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='glidePathAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGlidePathAngle();

	/**
	 * Sets the value of the '{@link Cpacs.RunwayILSType#getGlidePathAngle <em>Glide Path Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glide Path Angle</em>' containment reference.
	 * @see #getGlidePathAngle()
	 * @generated
	 */
	void setGlidePathAngle(DoubleBaseType value);

} // RunwayILSType
