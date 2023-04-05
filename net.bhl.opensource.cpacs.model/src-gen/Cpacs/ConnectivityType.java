/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ConnectivityType#getLoadAppPoint1ID <em>Load App Point1 ID</em>}</li>
 *   <li>{@link Cpacs.ConnectivityType#getLoadAppPoint2ID <em>Load App Point2 ID</em>}</li>
 *   <li>{@link Cpacs.ConnectivityType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link Cpacs.ConnectivityType#getStiffness <em>Stiffness</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getConnectivityType()
 * @model extendedMetaData="name='connectivityType' kind='elementOnly'"
 * @generated
 */
public interface ConnectivityType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load App Point1 ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load App Point1 ID</em>' containment reference.
	 * @see #setLoadAppPoint1ID(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getConnectivityType_LoadAppPoint1ID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadAppPoint1ID' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getLoadAppPoint1ID();

	/**
	 * Sets the value of the '{@link Cpacs.ConnectivityType#getLoadAppPoint1ID <em>Load App Point1 ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load App Point1 ID</em>' containment reference.
	 * @see #getLoadAppPoint1ID()
	 * @generated
	 */
	void setLoadAppPoint1ID(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Load App Point2 ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load App Point2 ID</em>' containment reference.
	 * @see #setLoadAppPoint2ID(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getConnectivityType_LoadAppPoint2ID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadAppPoint2ID' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getLoadAppPoint2ID();

	/**
	 * Sets the value of the '{@link Cpacs.ConnectivityType#getLoadAppPoint2ID <em>Load App Point2 ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load App Point2 ID</em>' containment reference.
	 * @see #getLoadAppPoint2ID()
	 * @generated
	 */
	void setLoadAppPoint2ID(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getConnectivityType_Rotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.ConnectivityType#getRotation <em>Rotation</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConnectivityType_Stiffness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stiffness' namespace='##targetNamespace'"
	 * @generated
	 */
	StiffnessType getStiffness();

	/**
	 * Sets the value of the '{@link Cpacs.ConnectivityType#getStiffness <em>Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stiffness</em>' containment reference.
	 * @see #getStiffness()
	 * @generated
	 */
	void setStiffness(StiffnessType value);

} // ConnectivityType
