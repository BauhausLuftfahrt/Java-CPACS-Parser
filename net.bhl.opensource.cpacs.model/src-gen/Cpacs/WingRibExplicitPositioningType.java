/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Rib Explicit Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getStartEtaXsiPoint <em>Start Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getStartCurvePoint <em>Start Curve Point</em>}</li>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getStartSparPositionUID <em>Start Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getEndEtaXsiPoint <em>End Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getEndCurvePoint <em>End Curve Point</em>}</li>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getEndSparPositionUID <em>End Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getRibStart <em>Rib Start</em>}</li>
 *   <li>{@link Cpacs.WingRibExplicitPositioningType#getRibEnd <em>Rib End</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType()
 * @model extendedMetaData="name='wingRibExplicitPositioningType' kind='elementOnly'"
 * @generated
 */
public interface WingRibExplicitPositioningType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Start Eta Xsi Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines the start of the rib defined in eta-xsi coordinates of a reference plane
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Eta Xsi Point</em>' containment reference.
	 * @see #setStartEtaXsiPoint(EtaXsiPointType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_StartEtaXsiPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startEtaXsiPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiPointType getStartEtaXsiPoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getStartEtaXsiPoint <em>Start Eta Xsi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Eta Xsi Point</em>' containment reference.
	 * @see #getStartEtaXsiPoint()
	 * @generated
	 */
	void setStartEtaXsiPoint(EtaXsiPointType value);

	/**
	 * Returns the value of the '<em><b>Start Curve Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines the start of the rib defined by a point on a reference curve
	 *                                     such as a spar, but not an explicit sparPosition
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Curve Point</em>' containment reference.
	 * @see #setStartCurvePoint(CurvePointType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_StartCurvePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startCurvePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePointType getStartCurvePoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getStartCurvePoint <em>Start Curve Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Curve Point</em>' containment reference.
	 * @see #getStartCurvePoint()
	 * @generated
	 */
	void setStartCurvePoint(CurvePointType value);

	/**
	 * Returns the value of the '<em><b>Start Spar Position UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines the location of the beginning of the rib using a specific sparPosition.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Spar Position UID</em>' containment reference.
	 * @see #setStartSparPositionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_StartSparPositionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startSparPositionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartSparPositionUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getStartSparPositionUID <em>Start Spar Position UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Spar Position UID</em>' containment reference.
	 * @see #getStartSparPositionUID()
	 * @generated
	 */
	void setStartSparPositionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Eta Xsi Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines the end of the rib defined in eta-xsi coordinates of a reference plane
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Eta Xsi Point</em>' containment reference.
	 * @see #setEndEtaXsiPoint(EtaXsiPointType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_EndEtaXsiPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endEtaXsiPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiPointType getEndEtaXsiPoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getEndEtaXsiPoint <em>End Eta Xsi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Eta Xsi Point</em>' containment reference.
	 * @see #getEndEtaXsiPoint()
	 * @generated
	 */
	void setEndEtaXsiPoint(EtaXsiPointType value);

	/**
	 * Returns the value of the '<em><b>End Curve Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines the end of the rib given by a point on a reference curve
	 *                                     such as a spar, but not an explicit sparPosition
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Curve Point</em>' containment reference.
	 * @see #setEndCurvePoint(CurvePointType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_EndCurvePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endCurvePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePointType getEndCurvePoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getEndCurvePoint <em>End Curve Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Curve Point</em>' containment reference.
	 * @see #getEndCurvePoint()
	 * @generated
	 */
	void setEndCurvePoint(CurvePointType value);

	/**
	 * Returns the value of the '<em><b>End Spar Position UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines the location of the end of the rib using a specific sparPosition.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Spar Position UID</em>' containment reference.
	 * @see #setEndSparPositionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_EndSparPositionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endSparPositionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndSparPositionUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getEndSparPositionUID <em>End Spar Position UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Spar Position UID</em>' containment reference.
	 * @see #getEndSparPositionUID()
	 * @generated
	 */
	void setEndSparPositionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Defines the forward beginning of the ribs. It can either be a
	 *                                 sparUID or "trailingEdge" or "leadingEdge".
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Start</em>' containment reference.
	 * @see #setRibStart(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_RibStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribStart' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRibStart();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getRibStart <em>Rib Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Start</em>' containment reference.
	 * @see #getRibStart()
	 * @generated
	 */
	void setRibStart(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 RibEnd defines the backward ending of the ribs. It can either be a
	 *                                 sparUID or "trailingEdge" or "leadingEdge".
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib End</em>' containment reference.
	 * @see #setRibEnd(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibExplicitPositioningType_RibEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRibEnd();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibExplicitPositioningType#getRibEnd <em>Rib End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib End</em>' containment reference.
	 * @see #getRibEnd()
	 * @generated
	 */
	void setRibEnd(StringBaseType value);

} // WingRibExplicitPositioningType
