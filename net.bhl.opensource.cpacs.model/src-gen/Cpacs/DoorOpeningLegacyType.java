/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Opening Legacy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoorOpeningLegacyType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.DoorOpeningLegacyType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.DoorOpeningLegacyType#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.DoorOpeningLegacyType#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.DoorOpeningLegacyType#getSide <em>Side</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoorOpeningLegacyType()
 * @model extendedMetaData="name='doorOpeningLegacyType' kind='elementOnly'"
 * @generated
 */
public interface DoorOpeningLegacyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the forward x-coordinate of the door
	 *                                 relative to the cabin origin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorOpeningLegacyType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.DoorOpeningLegacyType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the door sill height relative to cabin origin.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorOpeningLegacyType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.DoorOpeningLegacyType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the door in x-direction.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorOpeningLegacyType_Width()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getWidth();

	/**
	 * Sets the value of the '{@link Cpacs.DoorOpeningLegacyType#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the effective height of the door.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorOpeningLegacyType_Height()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHeight();

	/**
	 * Sets the value of the '{@link Cpacs.DoorOpeningLegacyType#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' containment reference.
	 * @see #setSide(SideType)
	 * @see Cpacs.CpacsPackage#getDoorOpeningLegacyType_Side()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='side' namespace='##targetNamespace'"
	 * @generated
	 */
	SideType getSide();

	/**
	 * Sets the value of the '{@link Cpacs.DoorOpeningLegacyType#getSide <em>Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' containment reference.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(SideType value);

} // DoorOpeningLegacyType
