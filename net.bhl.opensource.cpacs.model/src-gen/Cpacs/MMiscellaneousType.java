/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMiscellaneous Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MMiscellaneousType#getMassDescription <em>Mass Description</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMMiscellaneousType()
 * @model extendedMetaData="name='mMiscellaneousType' kind='elementOnly'"
 * @generated
 */
public interface MMiscellaneousType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMMiscellaneousType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MMiscellaneousType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(SingleGenericMassType value);

} // MMiscellaneousType
