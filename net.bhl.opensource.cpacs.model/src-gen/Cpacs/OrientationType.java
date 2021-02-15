/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OrientationType#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOrientationType()
 * @model extendedMetaData="name='orientationType' kind='elementOnly'"
 * @generated
 */
public interface OrientationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flight heading at the start of the mission, in compassAngle with reference to true North
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrientationType_Heading()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHeading();

	/**
	 * Sets the value of the '{@link Cpacs.OrientationType#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(DoubleBaseType value);

} // OrientationType
