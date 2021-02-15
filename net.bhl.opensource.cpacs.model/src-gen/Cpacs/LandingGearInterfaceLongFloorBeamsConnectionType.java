/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Interface Long Floor Beams Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearInterfaceLongFloorBeamsConnectionType#getConnectionProfileUID <em>Connection Profile UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearInterfaceLongFloorBeamsConnectionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearInterfaceLongFloorBeamsConnectionType()
 * @model extendedMetaData="name='landingGearInterfaceLongFloorBeamsConnectionType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearInterfaceLongFloorBeamsConnectionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Connection Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Profile UID</em>' containment reference.
	 * @see #setConnectionProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceLongFloorBeamsConnectionType_ConnectionProfileUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='connectionProfileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getConnectionProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceLongFloorBeamsConnectionType#getConnectionProfileUID <em>Connection Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Profile UID</em>' containment reference.
	 * @see #getConnectionProfileUID()
	 * @generated
	 */
	void setConnectionProfileUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLandingGearInterfaceLongFloorBeamsConnectionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearInterfaceLongFloorBeamsConnectionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LandingGearInterfaceLongFloorBeamsConnectionType
