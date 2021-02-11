/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Out Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutOutProfileType#getProfileUID <em>Profile UID</em>}</li>
 *   <li>{@link Cpacs.CutOutProfileType#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.CutOutProfileType#getRotZ <em>Rot Z</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutOutProfileType()
 * @model extendedMetaData="name='cutOutProfileType' kind='elementOnly'"
 * @generated
 */
public interface CutOutProfileType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the profile uID. Profiles should
	 *                                 be linked in profiles/structuralProfiles
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile UID</em>' containment reference.
	 * @see #setProfileUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutProfileType_ProfileUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutProfileType#getProfileUID <em>Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile UID</em>' containment reference.
	 * @see #getProfileUID()
	 * @generated
	 */
	void setProfileUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position of the cut out
	 *                                 profile. The eta coordinate refers to the control surface and
	 *                                 desribes the cut out profile at the leading edge of the control
	 *                                 surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta</em>' containment reference.
	 * @see #setEta(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getCutOutProfileType_Eta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eta' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEta();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutProfileType#getEta <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' containment reference.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(EtaIsoLineType value);

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
	 * @see Cpacs.CpacsPackage#getCutOutProfileType_RotZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotZ();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutProfileType#getRotZ <em>Rot Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot Z</em>' containment reference.
	 * @see #getRotZ()
	 * @generated
	 */
	void setRotZ(DoubleBaseType value);

} // CutOutProfileType
