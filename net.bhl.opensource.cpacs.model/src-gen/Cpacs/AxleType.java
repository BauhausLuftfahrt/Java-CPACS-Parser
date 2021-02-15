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
 *   <li>{@link Cpacs.AxleType#getShaft <em>Shaft</em>}</li>
 *   <li>{@link Cpacs.AxleType#getWheelUID <em>Wheel UID</em>}</li>
 *   <li>{@link Cpacs.AxleType#getNumberOfWheels <em>Number Of Wheels</em>}</li>
 *   <li>{@link Cpacs.AxleType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAxleType()
 * @model extendedMetaData="name='axleType' kind='elementOnly'"
 * @generated
 */
public interface AxleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Shaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shaft</em>' containment reference.
	 * @see #setShaft(StrutType)
	 * @see Cpacs.CpacsPackage#getAxleType_Shaft()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shaft' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutType getShaft();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getShaft <em>Shaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shaft</em>' containment reference.
	 * @see #getShaft()
	 * @generated
	 */
	void setShaft(StrutType value);

	/**
	 * Returns the value of the '<em><b>Wheel UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the wheel, that is attached to
	 *                                 the axle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wheel UID</em>' containment reference.
	 * @see #setWheelUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAxleType_WheelUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wheelUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWheelUID();

	/**
	 * Sets the value of the '{@link Cpacs.AxleType#getWheelUID <em>Wheel UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheel UID</em>' containment reference.
	 * @see #getWheelUID()
	 * @generated
	 */
	void setWheelUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Number Of Wheels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of wheels, that are attached to the
	 *                                 axle.
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
