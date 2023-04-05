/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Geometry Contour Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinGeometryContourType#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.CabinGeometryContourType#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinGeometryContourType()
 * @model extendedMetaData="name='cabinGeometryContourType' kind='elementOnly'"
 * @generated
 */
public interface CabinGeometryContourType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector with y-coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' containment reference.
	 * @see #setY(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCabinGeometryContourType_Y()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getY();

	/**
	 * Sets the value of the '{@link Cpacs.CabinGeometryContourType#getY <em>Y</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * Height z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinGeometryContourType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.CabinGeometryContourType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

} // CabinGeometryContourType
