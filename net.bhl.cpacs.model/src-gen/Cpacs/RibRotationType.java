/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rib Rotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RibRotationType#getRibRotationReference <em>Rib Rotation Reference</em>}</li>
 *   <li>{@link Cpacs.RibRotationType#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRibRotationType()
 * @model extendedMetaData="name='ribRotationType' kind='elementOnly'"
 * @generated
 */
public interface RibRotationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rib Rotation Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RotationReference defines the reference for
	 *                                 the z-rotation it is either sparUID, „LeadingEdge“,
	 *                                 „TrailingEdge“, "globalX", "globalY" or "globalZ".
	 *                                 If it is not defined the rotation reference is
	 *                                 the eta-axis (=leading edge, that is projected on the wings
	 *                                 y-z-plane). A z-rotation angle of 90 degrees means, that the rib
	 *                                 is perpendicular on the ribRotationReference (e.g. spar, leading
	 *                                 edge...). The rib itself is always straight, and the rotation
	 *                                 is defined with respect of the intersection point of the rib
	 *                                 with the ribRotationReference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Rotation Reference</em>' containment reference.
	 * @see #setRibRotationReference(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRibRotationType_RibRotationReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribRotationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRibRotationReference();

	/**
	 * Sets the value of the '{@link Cpacs.RibRotationType#getRibRotationReference <em>Rib Rotation Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Rotation Reference</em>' containment reference.
	 * @see #getRibRotationReference()
	 * @generated
	 */
	void setRibRotationReference(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rotation around z describes the rotation
	 *                                 around the wings midplane normal axis. The defaults to 90°. The
	 *                                 reference for the 'zero-angle' of the z-rotation is defined in
	 *                                 ribRotationReference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRibRotationType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.RibRotationType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

} // RibRotationType
