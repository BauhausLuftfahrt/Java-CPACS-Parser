/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass Fraction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MassFractionType#getFromSegmentUID <em>From Segment UID</em>}</li>
 *   <li>{@link Cpacs.MassFractionType#getToSegmentUID <em>To Segment UID</em>}</li>
 *   <li>{@link Cpacs.MassFractionType#getFraction <em>Fraction</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMassFractionType()
 * @model extendedMetaData="name='massFractionType' kind='elementOnly'"
 * @generated
 */
public interface MassFractionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>From Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the segment from which the fuel fraction should be considered
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Segment UID</em>' containment reference.
	 * @see #setFromSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMassFractionType_FromSegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromSegmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.MassFractionType#getFromSegmentUID <em>From Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Segment UID</em>' containment reference.
	 * @see #getFromSegmentUID()
	 * @generated
	 */
	void setFromSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>To Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the segment to which the fuel fraction should be considered
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Segment UID</em>' containment reference.
	 * @see #setToSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMassFractionType_ToSegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toSegmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.MassFractionType#getToSegmentUID <em>To Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Segment UID</em>' containment reference.
	 * @see #getToSegmentUID()
	 * @generated
	 */
	void setToSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Float value of the mass fraction defined as
	 *                             fraction = m_end / m_start
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fraction</em>' containment reference.
	 * @see #setFraction(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMassFractionType_Fraction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fraction' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MassFractionType#getFraction <em>Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' containment reference.
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(DoubleBaseType value);

} // MassFractionType
