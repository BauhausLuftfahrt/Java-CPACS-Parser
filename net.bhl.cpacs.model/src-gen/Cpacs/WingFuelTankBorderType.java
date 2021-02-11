/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Fuel Tank Border Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingFuelTankBorderType#getSparUID <em>Spar UID</em>}</li>
 *   <li>{@link Cpacs.WingFuelTankBorderType#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.WingFuelTankBorderType#getRibNumber <em>Rib Number</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingFuelTankBorderType()
 * @model extendedMetaData="name='wingFuelTankBorderType' kind='elementOnly'"
 * @generated
 */
public interface WingFuelTankBorderType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spar uID of the bordering spar.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spar UID</em>' containment reference.
	 * @see #setSparUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingFuelTankBorderType_SparUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSparUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingFuelTankBorderType#getSparUID <em>Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar UID</em>' containment reference.
	 * @see #getSparUID()
	 * @generated
	 */
	void setSparUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Definition UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the rib set of the bordering rib.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #setRibDefinitionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingFuelTankBorderType_RibDefinitionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribDefinitionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRibDefinitionUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingFuelTankBorderType#getRibDefinitionUID <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #getRibDefinitionUID()
	 * @generated
	 */
	void setRibDefinitionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RibNumber of the rib set of the bordering
	 *                                     rib.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Number</em>' containment reference.
	 * @see #setRibNumber(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getWingFuelTankBorderType_RibNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getRibNumber();

	/**
	 * Sets the value of the '{@link Cpacs.WingFuelTankBorderType#getRibNumber <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Number</em>' containment reference.
	 * @see #getRibNumber()
	 * @generated
	 */
	void setRibNumber(IntegerBaseType value);

} // WingFuelTankBorderType
