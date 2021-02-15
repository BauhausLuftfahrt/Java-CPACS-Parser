/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Lateral Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqLateralType#getNumPhiDas <em>Num Phi Das</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumRDas <em>Num RDas</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumBetaDas <em>Num Beta Das</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumPhiDasRed <em>Num Phi Das Red</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumBetaDasRed <em>Num Beta Das Red</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumRDrp <em>Num RDrp</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumBetaDrp <em>Num Beta Drp</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumPFas <em>Num PFas</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumRFas <em>Num RFas</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumPhiFas <em>Num Phi Fas</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumBetaFas <em>Num Beta Fas</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumPFrp <em>Num PFrp</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumRFrp <em>Num RFrp</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumPhiFrp <em>Num Phi Frp</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getNumBetaFrp <em>Num Beta Frp</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getDenLat <em>Den Lat</em>}</li>
 *   <li>{@link Cpacs.FqLateralType#getDenLatRed <em>Den Lat Red</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqLateralType()
 * @model extendedMetaData="name='fqLateralType' kind='elementOnly'"
 * @generated
 */
public interface FqLateralType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Num Phi Das</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll control
	 *                                 surface deflection to bank angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Phi Das</em>' containment reference.
	 * @see #setNumPhiDas(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumPhiDas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numPhiDas' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumPhiDas();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumPhiDas <em>Num Phi Das</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Phi Das</em>' containment reference.
	 * @see #getNumPhiDas()
	 * @generated
	 */
	void setNumPhiDas(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num RDas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll control
	 *                                 surface deflection to yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num RDas</em>' containment reference.
	 * @see #setNumRDas(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumRDas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numRDas' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumRDas();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumRDas <em>Num RDas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num RDas</em>' containment reference.
	 * @see #getNumRDas()
	 * @generated
	 */
	void setNumRDas(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Beta Das</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll control
	 *                                 surface deflection to sideslip angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Beta Das</em>' containment reference.
	 * @see #setNumBetaDas(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumBetaDas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numBetaDas' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumBetaDas();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumBetaDas <em>Num Beta Das</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Beta Das</em>' containment reference.
	 * @see #getNumBetaDas()
	 * @generated
	 */
	void setNumBetaDas(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Phi Das Red</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll control
	 *                                 surface deflection to bank angle of reduced 4th order system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Phi Das Red</em>' containment reference.
	 * @see #setNumPhiDasRed(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumPhiDasRed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numPhiDasRed' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumPhiDasRed();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumPhiDasRed <em>Num Phi Das Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Phi Das Red</em>' containment reference.
	 * @see #getNumPhiDasRed()
	 * @generated
	 */
	void setNumPhiDasRed(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Beta Das Red</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll control
	 *                                 surface deflection to sideslip angle of reduced 4th order system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Beta Das Red</em>' containment reference.
	 * @see #setNumBetaDasRed(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumBetaDasRed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numBetaDasRed' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumBetaDasRed();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumBetaDasRed <em>Num Beta Das Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Beta Das Red</em>' containment reference.
	 * @see #getNumBetaDasRed()
	 * @generated
	 */
	void setNumBetaDasRed(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num RDrp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function yaw control
	 *                                 surface deflection to yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num RDrp</em>' containment reference.
	 * @see #setNumRDrp(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumRDrp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numRDrp' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumRDrp();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumRDrp <em>Num RDrp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num RDrp</em>' containment reference.
	 * @see #getNumRDrp()
	 * @generated
	 */
	void setNumRDrp(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Beta Drp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function yaw control
	 *                                 surface deflection to sideslip angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Beta Drp</em>' containment reference.
	 * @see #setNumBetaDrp(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumBetaDrp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numBetaDrp' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumBetaDrp();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumBetaDrp <em>Num Beta Drp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Beta Drp</em>' containment reference.
	 * @see #getNumBetaDrp()
	 * @generated
	 */
	void setNumBetaDrp(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num PFas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll stick
	 *                                 input to roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num PFas</em>' containment reference.
	 * @see #setNumPFas(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumPFas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numPFas' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumPFas();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumPFas <em>Num PFas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num PFas</em>' containment reference.
	 * @see #getNumPFas()
	 * @generated
	 */
	void setNumPFas(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num RFas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll stick
	 *                                 input to yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num RFas</em>' containment reference.
	 * @see #setNumRFas(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumRFas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numRFas' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumRFas();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumRFas <em>Num RFas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num RFas</em>' containment reference.
	 * @see #getNumRFas()
	 * @generated
	 */
	void setNumRFas(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Phi Fas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll stick
	 *                                 input to bank angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Phi Fas</em>' containment reference.
	 * @see #setNumPhiFas(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumPhiFas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numPhiFas' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumPhiFas();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumPhiFas <em>Num Phi Fas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Phi Fas</em>' containment reference.
	 * @see #getNumPhiFas()
	 * @generated
	 */
	void setNumPhiFas(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Beta Fas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function roll stick
	 *                                 input to sideslip angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Beta Fas</em>' containment reference.
	 * @see #setNumBetaFas(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumBetaFas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numBetaFas' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumBetaFas();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumBetaFas <em>Num Beta Fas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Beta Fas</em>' containment reference.
	 * @see #getNumBetaFas()
	 * @generated
	 */
	void setNumBetaFas(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num PFrp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pedal input to
	 *                                 roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num PFrp</em>' containment reference.
	 * @see #setNumPFrp(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumPFrp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numPFrp' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumPFrp();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumPFrp <em>Num PFrp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num PFrp</em>' containment reference.
	 * @see #getNumPFrp()
	 * @generated
	 */
	void setNumPFrp(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num RFrp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pedal input to
	 *                                 yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num RFrp</em>' containment reference.
	 * @see #setNumRFrp(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumRFrp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numRFrp' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumRFrp();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumRFrp <em>Num RFrp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num RFrp</em>' containment reference.
	 * @see #getNumRFrp()
	 * @generated
	 */
	void setNumRFrp(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Phi Frp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pedal input to
	 *                                 bank angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Phi Frp</em>' containment reference.
	 * @see #setNumPhiFrp(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumPhiFrp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numPhiFrp' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumPhiFrp();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumPhiFrp <em>Num Phi Frp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Phi Frp</em>' containment reference.
	 * @see #getNumPhiFrp()
	 * @generated
	 */
	void setNumPhiFrp(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Beta Frp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pedal input to
	 *                                 sideslip angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Beta Frp</em>' containment reference.
	 * @see #setNumBetaFrp(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_NumBetaFrp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numBetaFrp' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumBetaFrp();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getNumBetaFrp <em>Num Beta Frp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Beta Frp</em>' containment reference.
	 * @see #getNumBetaFrp()
	 * @generated
	 */
	void setNumBetaFrp(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Den Lat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * denominator of lateral motion
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Den Lat</em>' containment reference.
	 * @see #setDenLat(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_DenLat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='denLat' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDenLat();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getDenLat <em>Den Lat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Den Lat</em>' containment reference.
	 * @see #getDenLat()
	 * @generated
	 */
	void setDenLat(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Den Lat Red</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * denominator of lateral motion of reduced 4th
	 *                                 order system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Den Lat Red</em>' containment reference.
	 * @see #setDenLatRed(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLateralType_DenLatRed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='denLatRed' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDenLatRed();

	/**
	 * Sets the value of the '{@link Cpacs.FqLateralType#getDenLatRed <em>Den Lat Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Den Lat Red</em>' containment reference.
	 * @see #getDenLatRed()
	 * @generated
	 */
	void setDenLatRed(StringVectorBaseType value);

} // FqLateralType
