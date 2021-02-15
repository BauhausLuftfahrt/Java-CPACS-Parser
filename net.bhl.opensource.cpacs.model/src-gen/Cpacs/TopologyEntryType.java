/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TopologyEntryType#getDamPoint1UID <em>Dam Point1 UID</em>}</li>
 *   <li>{@link Cpacs.TopologyEntryType#getDamPoint2UID <em>Dam Point2 UID</em>}</li>
 *   <li>{@link Cpacs.TopologyEntryType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.TopologyEntryType#getStiffness <em>Stiffness</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTopologyEntryType()
 * @model extendedMetaData="name='topologyEntryType' kind='elementOnly'"
 * @generated
 */
public interface TopologyEntryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Dam Point1 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dam Point1 UID</em>' containment reference.
	 * @see #setDamPoint1UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTopologyEntryType_DamPoint1UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='damPoint1UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDamPoint1UID();

	/**
	 * Sets the value of the '{@link Cpacs.TopologyEntryType#getDamPoint1UID <em>Dam Point1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dam Point1 UID</em>' containment reference.
	 * @see #getDamPoint1UID()
	 * @generated
	 */
	void setDamPoint1UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Dam Point2 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dam Point2 UID</em>' containment reference.
	 * @see #setDamPoint2UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTopologyEntryType_DamPoint2UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='damPoint2UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDamPoint2UID();

	/**
	 * Sets the value of the '{@link Cpacs.TopologyEntryType#getDamPoint2UID <em>Dam Point2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dam Point2 UID</em>' containment reference.
	 * @see #getDamPoint2UID()
	 * @generated
	 */
	void setDamPoint2UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getTopologyEntryType_Rotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.TopologyEntryType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Stiffness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stiffness</em>' containment reference.
	 * @see #setStiffness(StiffnessType)
	 * @see Cpacs.CpacsPackage#getTopologyEntryType_Stiffness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stiffness' namespace='##targetNamespace'"
	 * @generated
	 */
	StiffnessType getStiffness();

	/**
	 * Sets the value of the '{@link Cpacs.TopologyEntryType#getStiffness <em>Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stiffness</em>' containment reference.
	 * @see #getStiffness()
	 * @generated
	 */
	void setStiffness(StiffnessType value);

} // TopologyEntryType
