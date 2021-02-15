/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Gear Support Beam Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainGearSupportBeamPositionType#getXsiInside <em>Xsi Inside</em>}</li>
 *   <li>{@link Cpacs.MainGearSupportBeamPositionType#getEtaOutside <em>Eta Outside</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainGearSupportBeamPositionType()
 * @model extendedMetaData="name='mainGearSupportBeamPositionType' kind='elementOnly'"
 * @generated
 */
public interface MainGearSupportBeamPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Xsi Inside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise coordinate (xsi) of the
	 *                                 inner end of the support beam. The eta
	 *                                 position of the inner end is defined by the eta position of the
	 *                                 wing root (=wing-fuselage attachment).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi Inside</em>' containment reference.
	 * @see #setXsiInside(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getMainGearSupportBeamPositionType_XsiInside()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsiInside' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getXsiInside();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearSupportBeamPositionType#getXsiInside <em>Xsi Inside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi Inside</em>' containment reference.
	 * @see #getXsiInside()
	 * @generated
	 */
	void setXsiInside(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Eta Outside</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise coordinate (eta) of the
	 *                                 outer end of the support beam. The xsi
	 *                                 coordinate of the outer end is defined by the spar position
	 *                                 (first spar), where the support beam is attached to.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta Outside</em>' containment reference.
	 * @see #setEtaOutside(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getMainGearSupportBeamPositionType_EtaOutside()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='etaOutside' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaOutside();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearSupportBeamPositionType#getEtaOutside <em>Eta Outside</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta Outside</em>' containment reference.
	 * @see #getEtaOutside()
	 * @generated
	 */
	void setEtaOutside(EtaIsoLineType value);

} // MainGearSupportBeamPositionType
