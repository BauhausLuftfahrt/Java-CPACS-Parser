/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Gear Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SkidGearGlobalType#getTotalLength <em>Total Length</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSkidGearGlobalType()
 * @model extendedMetaData="name='skidGearGlobalType' kind='elementOnly'"
 * @generated
 */
public interface SkidGearGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Total Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total length of skid gear.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Length</em>' containment reference.
	 * @see #setTotalLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSkidGearGlobalType_TotalLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='totalLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTotalLength();

	/**
	 * Sets the value of the '{@link Cpacs.SkidGearGlobalType#getTotalLength <em>Total Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Length</em>' containment reference.
	 * @see #getTotalLength()
	 * @generated
	 */
	void setTotalLength(DoubleBaseType value);

} // SkidGearGlobalType
