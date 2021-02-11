/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Seat Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinSeatElementType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getNSeats <em>NSeats</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getDySeats <em>Dy Seats</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getSeatModuleElementUID <em>Seat Module Element UID</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getLongFloorBeam1UID <em>Long Floor Beam1 UID</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getLongFloorBeam2UID <em>Long Floor Beam2 UID</em>}</li>
 *   <li>{@link Cpacs.CabinSeatElementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinSeatElementType()
 * @model extendedMetaData="name='cabinSeatElementType' kind='elementOnly'"
 * @generated
 */
public interface CabinSeatElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>NSeats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of seats
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NSeats</em>' containment reference.
	 * @see #setNSeats(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_NSeats()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nSeats' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNSeats();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getNSeats <em>NSeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NSeats</em>' containment reference.
	 * @see #getNSeats()
	 * @generated
	 */
	void setNSeats(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeType6)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType6 getType();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType6 value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x-coordinate relative to cabin origin.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * y-coordinate relative to cabin origin.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Dy Seats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * delta-y-coordinate of the individual seat
	 *                                 center points from the y-coordinate of the seat object. This is
	 *                                 important to locate passengers. It is assumed that seats have no
	 *                                 angle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dy Seats</em>' containment reference.
	 * @see #setDySeats(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_DySeats()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dySeats' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDySeats();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getDySeats <em>Dy Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dy Seats</em>' containment reference.
	 * @see #getDySeats()
	 * @generated
	 */
	void setDySeats(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * length of the seat group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_Length()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * width of the seat group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_Width()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getWidth();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getWidth <em>Width</em>}' containment reference.
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
	 * height of the seat group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_Height()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHeight();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Seat Module Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Module Element UID</em>' containment reference.
	 * @see #setSeatModuleElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_SeatModuleElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seatModuleElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSeatModuleElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getSeatModuleElementUID <em>Seat Module Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Module Element UID</em>' containment reference.
	 * @see #getSeatModuleElementUID()
	 * @generated
	 */
	void setSeatModuleElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Long Floor Beam1 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Floor Beam1 UID</em>' containment reference.
	 * @see #setLongFloorBeam1UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_LongFloorBeam1UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longFloorBeam1UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getLongFloorBeam1UID();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getLongFloorBeam1UID <em>Long Floor Beam1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Floor Beam1 UID</em>' containment reference.
	 * @see #getLongFloorBeam1UID()
	 * @generated
	 */
	void setLongFloorBeam1UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Long Floor Beam2 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Floor Beam2 UID</em>' containment reference.
	 * @see #setLongFloorBeam2UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_LongFloorBeam2UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longFloorBeam2UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getLongFloorBeam2UID();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getLongFloorBeam2UID <em>Long Floor Beam2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Floor Beam2 UID</em>' containment reference.
	 * @see #getLongFloorBeam2UID()
	 * @generated
	 */
	void setLongFloorBeam2UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCabinSeatElementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CabinSeatElementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CabinSeatElementType
