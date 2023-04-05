/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Load Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutLoadPointsType#getPointIDs <em>Point IDs</em>}</li>
 *   <li>{@link Cpacs.CutLoadPointsType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.CutLoadPointsType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.CutLoadPointsType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.CutLoadPointsType#getOrientationX <em>Orientation X</em>}</li>
 *   <li>{@link Cpacs.CutLoadPointsType#getOrientationY <em>Orientation Y</em>}</li>
 *   <li>{@link Cpacs.CutLoadPointsType#getOrientationZ <em>Orientation Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutLoadPointsType()
 * @model extendedMetaData="name='cutLoadPointsType' kind='elementOnly'"
 * @generated
 */
public interface CutLoadPointsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point IDs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point IDs</em>' containment reference.
	 * @see #setPointIDs(PosIntVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadPointsType_PointIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	PosIntVectorBaseType getPointIDs();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadPointsType#getPointIDs <em>Point IDs</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadPointsType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadPointsType#getX <em>X</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadPointsType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadPointsType#getY <em>Y</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCutLoadPointsType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadPointsType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation X</em>' containment reference.
	 * @see #setOrientationX(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadPointsType_OrientationX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getOrientationX();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadPointsType#getOrientationX <em>Orientation X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation X</em>' containment reference.
	 * @see #getOrientationX()
	 * @generated
	 */
	void setOrientationX(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Y</em>' containment reference.
	 * @see #setOrientationY(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadPointsType_OrientationY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getOrientationY();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadPointsType#getOrientationY <em>Orientation Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Y</em>' containment reference.
	 * @see #getOrientationY()
	 * @generated
	 */
	void setOrientationY(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Z</em>' containment reference.
	 * @see #setOrientationZ(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCutLoadPointsType_OrientationZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getOrientationZ();

	/**
	 * Sets the value of the '{@link Cpacs.CutLoadPointsType#getOrientationZ <em>Orientation Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Z</em>' containment reference.
	 * @see #getOrientationZ()
	 * @generated
	 */
	void setOrientationZ(DoubleVectorBaseType value);

} // CutLoadPointsType
