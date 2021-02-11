/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contour Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ContourReferenceType#getAirfoilUID <em>Airfoil UID</em>}</li>
 *   <li>{@link Cpacs.ContourReferenceType#getRotX <em>Rot X</em>}</li>
 *   <li>{@link Cpacs.ContourReferenceType#getScalY <em>Scal Y</em>}</li>
 *   <li>{@link Cpacs.ContourReferenceType#getScalZ <em>Scal Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getContourReferenceType()
 * @model extendedMetaData="name='contourReferenceType' kind='elementOnly'"
 * @generated
 */
public interface ContourReferenceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Airfoil UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the airfoil uID.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airfoil UID</em>' containment reference.
	 * @see #setAirfoilUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getContourReferenceType_AirfoilUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='airfoilUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getAirfoilUID();

	/**
	 * Sets the value of the '{@link Cpacs.ContourReferenceType#getAirfoilUID <em>Airfoil UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airfoil UID</em>' containment reference.
	 * @see #getAirfoilUID()
	 * @generated
	 */
	void setAirfoilUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rot X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation around an axis, going from the
	 *                                 leading edge point to the trailing edge point of the inner/outer
	 *                                 border of the control surface. Defaults to 90°, which is
	 *                                 equivalent to perpendicular on the control surface middle plane.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rot X</em>' containment reference.
	 * @see #setRotX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getContourReferenceType_RotX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotX();

	/**
	 * Sets the value of the '{@link Cpacs.ContourReferenceType#getRotX <em>Rot X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot X</em>' containment reference.
	 * @see #getRotX()
	 * @generated
	 */
	void setRotX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Scal Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scaling of the airfoil in spanwise direction
	 *                                 (not used for 2D airfoils).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scal Y</em>' containment reference.
	 * @see #setScalY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getContourReferenceType_ScalY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scalY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getScalY();

	/**
	 * Sets the value of the '{@link Cpacs.ContourReferenceType#getScalY <em>Scal Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scal Y</em>' containment reference.
	 * @see #getScalY()
	 * @generated
	 */
	void setScalY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Scal Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scaling in thickness direction of the airfoil.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scal Z</em>' containment reference.
	 * @see #setScalZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getContourReferenceType_ScalZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scalZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getScalZ();

	/**
	 * Sets the value of the '{@link Cpacs.ContourReferenceType#getScalZ <em>Scal Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scal Z</em>' containment reference.
	 * @see #getScalZ()
	 * @generated
	 */
	void setScalZ(DoubleBaseType value);

} // ContourReferenceType
