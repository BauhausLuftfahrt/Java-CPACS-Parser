/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bogie Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BogieType#getAxles <em>Axles</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBogieType()
 * @model extendedMetaData="name='bogieType' kind='elementOnly'"
 * @generated
 */
public interface BogieType extends StrutType {
	/**
	 * Returns the value of the '<em><b>Axles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axles</em>' containment reference.
	 * @see #setAxles(BogieAxlesType)
	 * @see Cpacs.CpacsPackage#getBogieType_Axles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axles' namespace='##targetNamespace'"
	 * @generated
	 */
	BogieAxlesType getAxles();

	/**
	 * Sets the value of the '{@link Cpacs.BogieType#getAxles <em>Axles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axles</em>' containment reference.
	 * @see #getAxles()
	 * @generated
	 */
	void setAxles(BogieAxlesType value);

} // BogieType
