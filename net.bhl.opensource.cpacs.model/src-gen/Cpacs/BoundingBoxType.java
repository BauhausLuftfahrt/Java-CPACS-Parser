/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BoundingBoxType#getDeltaX <em>Delta X</em>}</li>
 *   <li>{@link Cpacs.BoundingBoxType#getDeltaY <em>Delta Y</em>}</li>
 *   <li>{@link Cpacs.BoundingBoxType#getDeltaZ <em>Delta Z</em>}</li>
 *   <li>{@link Cpacs.BoundingBoxType#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBoundingBoxType()
 * @model extendedMetaData="name='boundingBoxType' kind='elementOnly'"
 * @generated
 */
public interface BoundingBoxType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Delta X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length in x
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta X</em>' containment reference.
	 * @see #setDeltaX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBoundingBoxType_DeltaX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaX();

	/**
	 * Sets the value of the '{@link Cpacs.BoundingBoxType#getDeltaX <em>Delta X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta X</em>' containment reference.
	 * @see #getDeltaX()
	 * @generated
	 */
	void setDeltaX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length in y
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Y</em>' containment reference.
	 * @see #setDeltaY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBoundingBoxType_DeltaY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaY();

	/**
	 * Sets the value of the '{@link Cpacs.BoundingBoxType#getDeltaY <em>Delta Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Y</em>' containment reference.
	 * @see #getDeltaY()
	 * @generated
	 */
	void setDeltaY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length in z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Z</em>' containment reference.
	 * @see #setDeltaZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBoundingBoxType_DeltaZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaZ();

	/**
	 * Sets the value of the '{@link Cpacs.BoundingBoxType#getDeltaZ <em>Delta Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Z</em>' containment reference.
	 * @see #getDeltaZ()
	 * @generated
	 */
	void setDeltaZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Origin
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(PointType)
	 * @see Cpacs.CpacsPackage#getBoundingBoxType_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getOrigin();

	/**
	 * Sets the value of the '{@link Cpacs.BoundingBoxType#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(PointType value);

} // BoundingBoxType
