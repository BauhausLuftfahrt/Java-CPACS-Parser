/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AxleType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.AxleType#getShaftProperties <em>Shaft Properties</em>}</li>
 *   <li>{@link Cpacs.AxleType#getNumberOfWheels <em>Number Of Wheels</em>}</li>
 *   <li>{@link Cpacs.AxleType#getSideOfFirstWheel <em>Side Of First Wheel</em>}</li>
 *   <li>{@link Cpacs.AxleType#getWheel <em>Wheel</em>}</li>
 *   <li>{@link Cpacs.AxleType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAxleType()
 * @model extendedMetaData="name='axleType' kind='elementOnly'"
 * @generated
 */
public interface AxleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the axle. For a single wheel, the length is equal to the distance between the center of the piston and the center of the wheel. For two wheels, the length is equal to the distance between the centers of the wheels with the axis being centered w.r.t. to the Piston.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAxleType_Length()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Shaft Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Axle shaft properties
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shaft Properties</em>' containment reference.
	 * @see #setShaftProperties(StrutPropertiesType)
	 * @see Cpacs.CpacsPackage#getAxleType_ShaftProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shaftProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutPropertiesType getShaftProperties();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getShaftProperties <em>Shaft Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft Properties</em>' containment reference.
	 * @see #getShaftProperties()
	 * @generated
	 */
	void setShaftProperties(StrutPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Number Of Wheels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of wheels attached to this axle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Wheels</em>' containment reference.
	 * @see #setNumberOfWheels(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getAxleType_NumberOfWheels()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numberOfWheels' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfWheels();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getNumberOfWheels <em>Number Of Wheels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Wheels</em>' containment reference.
	 * @see #getNumberOfWheels()
	 * @generated
	 */
	void setNumberOfWheels(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Side Of First Wheel</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SideOfFirstWheelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the side of the first wheel (inboard or outboard; inboard corresponds to the negative y-direction or in flight direction left) for odd number of wheels on this axis. Each additional wheel is the added on the opposite site of the previous wheel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Side Of First Wheel</em>' attribute.
	 * @see Cpacs.SideOfFirstWheelType
	 * @see #isSetSideOfFirstWheel()
	 * @see #unsetSideOfFirstWheel()
	 * @see #setSideOfFirstWheel(SideOfFirstWheelType)
	 * @see Cpacs.CpacsPackage#getAxleType_SideOfFirstWheel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='sideOfFirstWheel' namespace='##targetNamespace'"
	 * @generated
	 */
	SideOfFirstWheelType getSideOfFirstWheel();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getSideOfFirstWheel <em>Side Of First Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Of First Wheel</em>' attribute.
	 * @see Cpacs.SideOfFirstWheelType
	 * @see #isSetSideOfFirstWheel()
	 * @see #unsetSideOfFirstWheel()
	 * @see #getSideOfFirstWheel()
	 * @generated
	 */
	void setSideOfFirstWheel(SideOfFirstWheelType value);

	/**
	 * Unsets the value of the '{@link Cpacs.AxleType#getSideOfFirstWheel <em>Side Of First Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSideOfFirstWheel()
	 * @see #getSideOfFirstWheel()
	 * @see #setSideOfFirstWheel(SideOfFirstWheelType)
	 * @generated
	 */
	void unsetSideOfFirstWheel();

	/**
	 * Returns whether the value of the '{@link Cpacs.AxleType#getSideOfFirstWheel <em>Side Of First Wheel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Side Of First Wheel</em>' attribute is set.
	 * @see #unsetSideOfFirstWheel()
	 * @see #getSideOfFirstWheel()
	 * @see #setSideOfFirstWheel(SideOfFirstWheelType)
	 * @generated
	 */
	boolean isSetSideOfFirstWheel();

	/**
	 * Returns the value of the '<em><b>Wheel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Properties of the wheel(s) attached to this axle. If more than one wheel is attached, all wheels on a single axis have the same properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wheel</em>' containment reference.
	 * @see #setWheel(WheelType)
	 * @see Cpacs.CpacsPackage#getAxleType_Wheel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wheel' namespace='##targetNamespace'"
	 * @generated
	 */
	WheelType getWheel();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getWheel <em>Wheel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheel</em>' containment reference.
	 * @see #getWheel()
	 * @generated
	 */
	void setWheel(WheelType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAxleType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AxleType
