/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Secondary Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackSecondaryStructureType#getMaterialUID <em>Material UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackSecondaryStructureType()
 * @model extendedMetaData="name='trackSecondaryStructureType' kind='elementOnly'"
 * @generated
 */
public interface TrackSecondaryStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Material UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material UID</em>' containment reference.
	 * @see #setMaterialUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrackSecondaryStructureType_MaterialUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='materialUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMaterialUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrackSecondaryStructureType#getMaterialUID <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material UID</em>' containment reference.
	 * @see #getMaterialUID()
	 * @generated
	 */
	void setMaterialUID(StringUIDBaseType value);

} // TrackSecondaryStructureType
