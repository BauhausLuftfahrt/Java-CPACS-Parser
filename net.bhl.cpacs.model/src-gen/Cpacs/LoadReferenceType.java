/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadReferenceType#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.LoadReferenceType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.LoadReferenceType#getJigShapePoint <em>Jig Shape Point</em>}</li>
 *   <li>{@link Cpacs.LoadReferenceType#getFlightShapePoint <em>Flight Shape Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadReferenceType()
 * @model extendedMetaData="name='loadReferenceType' kind='elementOnly'"
 * @generated
 */
public interface LoadReferenceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceType_Area()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getArea();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceType#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceType_Length()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Jig Shape Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jig Shape Point</em>' containment reference.
	 * @see #setJigShapePoint(PointXYZType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceType_JigShapePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jigShapePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getJigShapePoint();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceType#getJigShapePoint <em>Jig Shape Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jig Shape Point</em>' containment reference.
	 * @see #getJigShapePoint()
	 * @generated
	 */
	void setJigShapePoint(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Flight Shape Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Shape Point</em>' containment reference.
	 * @see #setFlightShapePoint(PointXYZType)
	 * @see Cpacs.CpacsPackage#getLoadReferenceType_FlightShapePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightShapePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getFlightShapePoint();

	/**
	 * Sets the value of the '{@link Cpacs.LoadReferenceType#getFlightShapePoint <em>Flight Shape Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Shape Point</em>' containment reference.
	 * @see #getFlightShapePoint()
	 * @generated
	 */
	void setFlightShapePoint(PointXYZType value);

} // LoadReferenceType
