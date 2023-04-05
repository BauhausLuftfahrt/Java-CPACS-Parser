/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Joint Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackJointPositionType#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link Cpacs.TrackJointPositionType#getJointCoordinates <em>Joint Coordinates</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackJointPositionType()
 * @model extendedMetaData="name='trackJointPositionType' kind='elementOnly'"
 * @generated
 */
public interface TrackJointPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the command parameter of a control distributor. If not given explicitly in the control distributor, linear interpolation between the neighboring points is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameters</em>' containment reference.
	 * @see #setControlParameters(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getTrackJointPositionType_ControlParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getControlParameters();

	/**
	 * Sets the value of the '{@link Cpacs.TrackJointPositionType#getControlParameters <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameters</em>' containment reference.
	 * @see #getControlParameters()
	 * @generated
	 */
	void setControlParameters(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Joint Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint Coordinates</em>' containment reference.
	 * @see #setJointCoordinates(TrackJointCoordinatesType)
	 * @see Cpacs.CpacsPackage#getTrackJointPositionType_JointCoordinates()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jointCoordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackJointCoordinatesType getJointCoordinates();

	/**
	 * Sets the value of the '{@link Cpacs.TrackJointPositionType#getJointCoordinates <em>Joint Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joint Coordinates</em>' containment reference.
	 * @see #getJointCoordinates()
	 * @generated
	 */
	void setJointCoordinates(TrackJointCoordinatesType value);

} // TrackJointPositionType
