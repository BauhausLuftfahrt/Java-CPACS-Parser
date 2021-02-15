/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bogie Axle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BogieAxleType#getAxleUID <em>Axle UID</em>}</li>
 *   <li>{@link Cpacs.BogieAxleType#getPosOnBogie <em>Pos On Bogie</em>}</li>
 *   <li>{@link Cpacs.BogieAxleType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBogieAxleType()
 * @model extendedMetaData="name='bogieAxleType' kind='elementOnly'"
 * @generated
 */
public interface BogieAxleType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Axle UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the axle, that is attached to the
	 *                                 bogie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Axle UID</em>' containment reference.
	 * @see #setAxleUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getBogieAxleType_AxleUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axleUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getAxleUID();

	/**
	 * Sets the value of the '{@link Cpacs.BogieAxleType#getAxleUID <em>Axle UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axle UID</em>' containment reference.
	 * @see #getAxleUID()
	 * @generated
	 */
	void setAxleUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Pos On Bogie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative position of the axle on the bogie (if
	 *                                 more than one axle defined). 0 = forward end of bogie; 1 = rear
	 *                                 end of bogie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pos On Bogie</em>' containment reference.
	 * @see #setPosOnBogie(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBogieAxleType_PosOnBogie()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='posOnBogie' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPosOnBogie();

	/**
	 * Sets the value of the '{@link Cpacs.BogieAxleType#getPosOnBogie <em>Pos On Bogie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos On Bogie</em>' containment reference.
	 * @see #getPosOnBogie()
	 * @generated
	 */
	void setPosOnBogie(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getBogieAxleType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.BogieAxleType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // BogieAxleType
