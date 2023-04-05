/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Application Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadApplicationPointsType#getPointIDs <em>Point IDs</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointsType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointsType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointsType#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadApplicationPointsType()
 * @model extendedMetaData="name='loadApplicationPointsType' kind='elementOnly'"
 * @generated
 */
public interface LoadApplicationPointsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point IDs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point IDs</em>' containment reference.
	 * @see #setPointIDs(PosIntVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointsType_PointIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	PosIntVectorBaseType getPointIDs();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointsType#getPointIDs <em>Point IDs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point IDs</em>' containment reference.
	 * @see #getPointIDs()
	 * @generated
	 */
	void setPointIDs(PosIntVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointsType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointsType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointsType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointsType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointsType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointsType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleVectorBaseType value);

} // LoadApplicationPointsType
