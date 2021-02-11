/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Airfoil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceAirfoilType#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceAirfoilType#getAirfoilUID <em>Airfoil UID</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceAirfoilType#getRotX <em>Rot X</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceAirfoilType#getRotZ <em>Rot Z</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceAirfoilType#getScalY <em>Scal Y</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceAirfoilType#getScalZ <em>Scal Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceAirfoilType()
 * @model extendedMetaData="name='controlSurfaceAirfoilType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceAirfoilType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise coordinate (eta) of the
	 *                                 control surface, where the leading edge of the airfoil is
	 *                                 placed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta</em>' containment reference.
	 * @see #setEta(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceAirfoilType_Eta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eta' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEta();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceAirfoilType#getEta <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' containment reference.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(EtaIsoLineType value);

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
	 * @see Cpacs.CpacsPackage#getControlSurfaceAirfoilType_AirfoilUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='airfoilUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getAirfoilUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceAirfoilType#getAirfoilUID <em>Airfoil UID</em>}' containment reference.
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
	 *                                 leading edge point to the trailing edge point of the control
	 *                                 surface. Defaults to 90°, which is equivalent to perpendicular
	 *                                 on the control surface middle plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rot X</em>' containment reference.
	 * @see #setRotX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceAirfoilType_RotX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotX();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceAirfoilType#getRotX <em>Rot X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot X</em>' containment reference.
	 * @see #getRotX()
	 * @generated
	 */
	void setRotX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Rot Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation of the airfoil around the control
	 *                                 surface middle plane normal direciotn. Reference point is the
	 *                                 most forward point of the airfoil. Defaults to 90°, which is
	 *                                 equivalent to the airfoilplacement in flight direction (along
	 *                                 wings-x axis).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rot Z</em>' containment reference.
	 * @see #setRotZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceAirfoilType_RotZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotZ();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceAirfoilType#getRotZ <em>Rot Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot Z</em>' containment reference.
	 * @see #getRotZ()
	 * @generated
	 */
	void setRotZ(DoubleBaseType value);

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
	 * @see Cpacs.CpacsPackage#getControlSurfaceAirfoilType_ScalY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scalY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getScalY();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceAirfoilType#getScalY <em>Scal Y</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceAirfoilType_ScalZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='scalZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getScalZ();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceAirfoilType#getScalZ <em>Scal Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scal Z</em>' containment reference.
	 * @see #getScalZ()
	 * @generated
	 */
	void setScalZ(DoubleBaseType value);

} // ControlSurfaceAirfoilType
