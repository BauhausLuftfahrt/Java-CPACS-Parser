/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Pressure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.InternalPressureType#getReferenceUID <em>Reference UID</em>}</li>
 *   <li>{@link Cpacs.InternalPressureType#getPressure <em>Pressure</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getInternalPressureType()
 * @model extendedMetaData="name='internalPressureType' kind='elementOnly'"
 * @generated
 */
public interface InternalPressureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Reference UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of a fuselage, deck or compartment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference UID</em>' containment reference.
	 * @see #setReferenceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getInternalPressureType_ReferenceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferenceUID();

	/**
	 * Sets the value of the '{@link Cpacs.InternalPressureType#getReferenceUID <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference UID</em>' containment reference.
	 * @see #getReferenceUID()
	 * @generated
	 */
	void setReferenceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Internal pressure [Pa]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure</em>' containment reference.
	 * @see #setPressure(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getInternalPressureType_Pressure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pressure' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPressure();

	/**
	 * Sets the value of the '{@link Cpacs.InternalPressureType#getPressure <em>Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' containment reference.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(DoubleBaseType value);

} // InternalPressureType
