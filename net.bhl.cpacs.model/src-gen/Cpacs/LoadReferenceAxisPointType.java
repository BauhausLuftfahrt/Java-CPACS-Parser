/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Reference Axis Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadReferenceAxisPointType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.LoadReferenceAxisPointType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.LoadReferenceAxisPointType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.LoadReferenceAxisPointType#getRefPoint <em>Ref Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadReferenceAxisPointType()
 * @model extendedMetaData="name='loadReferenceAxisPointType' kind='elementOnly'"
 * @generated
 */
public interface LoadReferenceAxisPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceAxisPointType_X()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceAxisPointType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceAxisPointType_Y()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceAxisPointType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceAxisPointType_Z()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceAxisPointType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ref Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Point</em>' containment reference.
	 * @see #setRefPoint(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceAxisPointType_RefPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getRefPoint();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceAxisPointType#getRefPoint <em>Ref Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Point</em>' containment reference.
	 * @see #getRefPoint()
	 * @generated
	 */
	void setRefPoint(EtaXsiRelHeightPointType value);

} // LoadReferenceAxisPointType
