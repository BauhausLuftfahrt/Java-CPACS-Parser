/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point List XYZ Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointListXYZVectorType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.PointListXYZVectorType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.PointListXYZVectorType#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointListXYZVectorType()
 * @model extendedMetaData="name='pointListXYZVectorType' kind='elementOnly'"
 * @generated
 */
public interface PointListXYZVectorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of x coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPointListXYZVectorType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.PointListXYZVectorType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of y coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPointListXYZVectorType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.PointListXYZVectorType#getY <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' containment reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of z coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPointListXYZVectorType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.PointListXYZVectorType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(StringVectorBaseType value);

} // PointListXYZVectorType
