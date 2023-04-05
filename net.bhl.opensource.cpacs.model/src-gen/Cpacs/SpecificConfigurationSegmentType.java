/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Configuration Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpecificConfigurationSegmentType#getUID <em>UID</em>}</li>
 *   <li>{@link Cpacs.SpecificConfigurationSegmentType#getIndexIDs <em>Index IDs</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpecificConfigurationSegmentType()
 * @model extendedMetaData="name='specificConfigurationSegmentType' kind='elementOnly'"
 * @generated
 */
public interface SpecificConfigurationSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of the segment for which the specific configuration holds.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' containment reference.
	 * @see #setUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificConfigurationSegmentType_UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificConfigurationSegmentType#getUID <em>UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' containment reference.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Index IDs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Vector with semicolon separated indices of the parts of the respective segment within the mission definition for which the specific configuration setting holds. Example: scheduling configurations for a climb or descent segment (different settings of moveables and gears) on altitudes/velocities
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Index IDs</em>' containment reference.
	 * @see #setIndexIDs(PosIntVectorBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificConfigurationSegmentType_IndexIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indexIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	PosIntVectorBaseType getIndexIDs();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificConfigurationSegmentType#getIndexIDs <em>Index IDs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index IDs</em>' containment reference.
	 * @see #getIndexIDs()
	 * @generated
	 */
	void setIndexIDs(PosIntVectorBaseType value);

} // SpecificConfigurationSegmentType
