/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat Module Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SeatModuleType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.SeatModuleType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.SeatModuleType#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link Cpacs.SeatModuleType#getWidthOfSeatModule <em>Width Of Seat Module</em>}</li>
 *   <li>{@link Cpacs.SeatModuleType#getModuleMass <em>Module Mass</em>}</li>
 *   <li>{@link Cpacs.SeatModuleType#getModuleCoG <em>Module Co G</em>}</li>
 *   <li>{@link Cpacs.SeatModuleType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSeatModuleType()
 * @model extendedMetaData="name='seatModuleType' kind='elementOnly'"
 * @generated
 */
public interface SeatModuleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the seat module
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSeatModuleType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.SeatModuleType#getName <em>Name</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * Description of the seat module
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSeatModuleType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.SeatModuleType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Number Of Seats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of seats in the seat module, e.g 1, 2
	 *                                 or 3
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Seats</em>' containment reference.
	 * @see #setNumberOfSeats(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getSeatModuleType_NumberOfSeats()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numberOfSeats' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfSeats();

	/**
	 * Sets the value of the '{@link Cpacs.SeatModuleType#getNumberOfSeats <em>Number Of Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Seats</em>' containment reference.
	 * @see #getNumberOfSeats()
	 * @generated
	 */
	void setNumberOfSeats(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Width Of Seat Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total width of the seat module
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width Of Seat Module</em>' containment reference.
	 * @see #setWidthOfSeatModule(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSeatModuleType_WidthOfSeatModule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='widthOfSeatModule' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getWidthOfSeatModule();

	/**
	 * Sets the value of the '{@link Cpacs.SeatModuleType#getWidthOfSeatModule <em>Width Of Seat Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Of Seat Module</em>' containment reference.
	 * @see #getWidthOfSeatModule()
	 * @generated
	 */
	void setWidthOfSeatModule(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Module Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * seat module mass (optional, use of data to be
	 *                                 clarified)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Mass</em>' containment reference.
	 * @see #setModuleMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSeatModuleType_ModuleMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getModuleMass();

	/**
	 * Sets the value of the '{@link Cpacs.SeatModuleType#getModuleMass <em>Module Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Mass</em>' containment reference.
	 * @see #getModuleMass()
	 * @generated
	 */
	void setModuleMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Module Co G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * seat module mass CoG (optional, use of data to
	 *                                 be clarified)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Co G</em>' containment reference.
	 * @see #setModuleCoG(PointType)
	 * @see Cpacs.CpacsPackage#getSeatModuleType_ModuleCoG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleCoG' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getModuleCoG();

	/**
	 * Sets the value of the '{@link Cpacs.SeatModuleType#getModuleCoG <em>Module Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Co G</em>' containment reference.
	 * @see #getModuleCoG()
	 * @generated
	 */
	void setModuleCoG(PointType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSeatModuleType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SeatModuleType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SeatModuleType
