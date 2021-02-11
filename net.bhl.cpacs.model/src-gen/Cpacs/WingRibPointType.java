/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Rib Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingRibPointType#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.WingRibPointType#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.WingRibPointType#getXsi <em>Xsi</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingRibPointType()
 * @model extendedMetaData="name='wingRibPointType' kind='elementOnly'"
 * @generated
 */
public interface WingRibPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rib Definition UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The UID of the rib definition. Can be a reference to nodes
	 *                                     of either wingRibsPositioningType or wingRibExplicitPositioningType.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #setRibDefinitionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibPointType_RibDefinitionUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribDefinitionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRibDefinitionUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibPointType#getRibDefinitionUID <em>Rib Definition UID</em>}' containment reference.
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
	 * 
	 *                                 For references of type wingRibsPositioningType this node indicates the rib number of the rib set.
	 *                                 If not given it defaults to 1.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Number</em>' containment reference.
	 * @see #setRibNumber(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibPointType_RibNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getRibNumber();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibPointType#getRibNumber <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Number</em>' containment reference.
	 * @see #getRibNumber()
	 * @generated
	 */
	void setRibNumber(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Normalized xsi coordinate of the rib point which is measured along the rib
	 *                                 from the start point [0] towards the end point [1].
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi</em>' containment reference.
	 * @see #setXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibPointType_Xsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibPointType#getXsi <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi</em>' containment reference.
	 * @see #getXsi()
	 * @generated
	 */
	void setXsi(DoubleBaseType value);

} // WingRibPointType
