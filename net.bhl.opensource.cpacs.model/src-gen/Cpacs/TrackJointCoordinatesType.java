/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Joint Coordinates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackJointCoordinatesType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.TrackJointCoordinatesType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.TrackJointCoordinatesType#getDy <em>Dy</em>}</li>
 *   <li>{@link Cpacs.TrackJointCoordinatesType#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackJointCoordinatesType()
 * @model extendedMetaData="name='trackJointCoordinatesType' kind='elementOnly'"
 * @generated
 */
public interface TrackJointCoordinatesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameType)
	 * @see Cpacs.CpacsPackage#getTrackJointCoordinatesType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameType getName();

	/**
	 * Sets the value of the '{@link Cpacs.TrackJointCoordinatesType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrackJointCoordinatesType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.TrackJointCoordinatesType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Dy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dy</em>' containment reference.
	 * @see #setDy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrackJointCoordinatesType_Dy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDy();

	/**
	 * Sets the value of the '{@link Cpacs.TrackJointCoordinatesType#getDy <em>Dy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy</em>' containment reference.
	 * @see #getDy()
	 * @generated
	 */
	void setDy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrackJointCoordinatesType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.TrackJointCoordinatesType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

} // TrackJointCoordinatesType
