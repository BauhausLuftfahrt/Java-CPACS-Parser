/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ReferenceType#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.ReferenceType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.ReferenceType#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getReferenceType()
 * @model extendedMetaData="name='referenceType' kind='elementOnly'"
 * @generated
 */
public interface ReferenceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference area (typically planform area)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getReferenceType_Area()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='area' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getArea();

	/**
	 * Sets the value of the '{@link Cpacs.ReferenceType#getArea <em>Area</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * Reference length (typically Mean Aerodynamic
	 *                                 Chord MAC). In CPACS, only one reference length exists (and is
	 *                                 used, e.g. for all three moment coefficients. Coordinates given
	 *                                 relative to MAC shall always use this length as MAC.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getReferenceType_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.ReferenceType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moment reference point (in global coordinate
	 *                                 system). The x-coordinate is typically chosen same as of the
	 *                                 leading edge of the wing in the spanwise section having a
	 *                                 chordlength identical to MAC. Coordinates given as %MAC shall
	 *                                 always use this x-coordinate and length (e.g. 0%MAC = x, 100%MAC
	 *                                 = x + length). The y coordinate is typically 0. The z coordinate
	 *                                 is often chosen either as 0., or as z of fueselage nose or as z
	 *                                 of middle of center fuselage part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see Cpacs.CpacsPackage#getReferenceType_Point()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='point' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link Cpacs.ReferenceType#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

} // ReferenceType
