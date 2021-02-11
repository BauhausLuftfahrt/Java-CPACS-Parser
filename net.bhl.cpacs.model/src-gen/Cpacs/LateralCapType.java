/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lateral Cap Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LateralCapType#getPlacement <em>Placement</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLateralCapType()
 * @model extendedMetaData="name='lateralCapType' kind='elementOnly'"
 * @generated
 */
public interface LateralCapType extends CapType {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.PlacementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' attribute.
	 * @see Cpacs.PlacementType
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #setPlacement(PlacementType)
	 * @see Cpacs.CpacsPackage#getLateralCapType_Placement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='placement' namespace='##targetNamespace'"
	 * @generated
	 */
	PlacementType getPlacement();

	/**
	 * Sets the value of the '{@link Cpacs.LateralCapType#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' attribute.
	 * @see Cpacs.PlacementType
	 * @see #isSetPlacement()
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(PlacementType value);

	/**
	 * Unsets the value of the '{@link Cpacs.LateralCapType#getPlacement <em>Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(PlacementType)
	 * @generated
	 */
	void unsetPlacement();

	/**
	 * Returns whether the value of the '{@link Cpacs.LateralCapType#getPlacement <em>Placement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placement</em>' attribute is set.
	 * @see #unsetPlacement()
	 * @see #getPlacement()
	 * @see #setPlacement(PlacementType)
	 * @generated
	 */
	boolean isSetPlacement();

} // LateralCapType
