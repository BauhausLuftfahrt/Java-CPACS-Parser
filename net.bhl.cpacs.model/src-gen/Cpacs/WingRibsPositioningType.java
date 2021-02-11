/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Ribs Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingRibsPositioningType#getStartEtaXsiPoint <em>Start Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getStartCurvePoint <em>Start Curve Point</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getStartSparPositionUID <em>Start Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getEndEtaXsiPoint <em>End Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getEndCurvePoint <em>End Curve Point</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getEndSparPositionUID <em>End Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getRibStart <em>Rib Start</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getRibEnd <em>Rib End</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getNumberOfRibs <em>Number Of Ribs</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getRibReference <em>Rib Reference</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getRibCrossingBehaviour <em>Rib Crossing Behaviour</em>}</li>
 *   <li>{@link Cpacs.WingRibsPositioningType#getRibRotation <em>Rib Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingRibsPositioningType()
 * @model extendedMetaData="name='wingRibsPositioningType' kind='elementOnly'"
 * @generated
 */
public interface WingRibsPositioningType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_StartEtaXsiPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startEtaXsiPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiPointType getStartEtaXsiPoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getStartEtaXsiPoint <em>Start Eta Xsi Point</em>}' containment reference.
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
	 *                                     Defines the start of the rib by a point on a reference curve,
	 *                                     such as a spar, but not an explicit sparPosition
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Curve Point</em>' containment reference.
	 * @see #setStartCurvePoint(CurvePointType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_StartCurvePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startCurvePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePointType getStartCurvePoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getStartCurvePoint <em>Start Curve Point</em>}' containment reference.
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
	 *                                     Defines the location of the beginning of the rib using a specific sparPosition
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Spar Position UID</em>' containment reference.
	 * @see #setStartSparPositionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_StartSparPositionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startSparPositionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartSparPositionUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getStartSparPositionUID <em>Start Spar Position UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_EndEtaXsiPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endEtaXsiPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiPointType getEndEtaXsiPoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getEndEtaXsiPoint <em>End Eta Xsi Point</em>}' containment reference.
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
	 *                                     Defines the end of the rib defined by a point on a reference curve
	 *                                     such as a spar, but not an explicit sparPosition
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Curve Point</em>' containment reference.
	 * @see #setEndCurvePoint(CurvePointType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_EndCurvePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endCurvePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePointType getEndCurvePoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getEndCurvePoint <em>End Curve Point</em>}' containment reference.
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
	 *                                     Defines the location of the end of the rib using a specific sparPosition
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Spar Position UID</em>' containment reference.
	 * @see #setEndSparPositionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_EndSparPositionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endSparPositionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndSparPositionUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getEndSparPositionUID <em>End Spar Position UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_RibStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribStart' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRibStart();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getRibStart <em>Rib Start</em>}' containment reference.
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
	 *                                 Defines the backward ending of the ribs. It can either be a
	 *                                 sparUID or "trailingEdge" or "leadingEdge".
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib End</em>' containment reference.
	 * @see #setRibEnd(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_RibEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRibEnd();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getRibEnd <em>Rib End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib End</em>' containment reference.
	 * @see #getRibEnd()
	 * @generated
	 */
	void setRibEnd(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The spacing of the ribs defines the distance between two ribs,
	 *                                     measured on the
	 *                                     ribReferenceLine. First rib is placed at etaStart.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacing</em>' containment reference.
	 * @see #setSpacing(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_Spacing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpacing();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getSpacing <em>Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' containment reference.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Number Of Ribs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines the number of ribs in this ribSet. First rib is at
	 *                                     etaStart on the
	 *                                     referenceLine, last rib is at etaEnd. The spacing is constant on the
	 *                                     ribReferenceLine.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Ribs</em>' containment reference.
	 * @see #setNumberOfRibs(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_NumberOfRibs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfRibs' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfRibs();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getNumberOfRibs <em>Number Of Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Ribs</em>' containment reference.
	 * @see #getNumberOfRibs()
	 * @generated
	 */
	void setNumberOfRibs(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The ribReference is the reference line for the computation of the rib set spacing.
	 *                                 It can either be a sparUID or "trailingEdge" or "leadingEdge"
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Reference</em>' containment reference.
	 * @see #setRibReference(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_RibReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribReference' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRibReference();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getRibReference <em>Rib Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Reference</em>' containment reference.
	 * @see #getRibReference()
	 * @generated
	 */
	void setRibReference(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Crossing Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Crossing Behaviour</em>' containment reference.
	 * @see #setRibCrossingBehaviour(RibCrossingBehaviourType1)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_RibCrossingBehaviour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribCrossingBehaviour' namespace='##targetNamespace'"
	 * @generated
	 */
	RibCrossingBehaviourType1 getRibCrossingBehaviour();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getRibCrossingBehaviour <em>Rib Crossing Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Crossing Behaviour</em>' containment reference.
	 * @see #getRibCrossingBehaviour()
	 * @generated
	 */
	void setRibCrossingBehaviour(RibCrossingBehaviourType1 value);

	/**
	 * Returns the value of the '<em><b>Rib Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #setRibRotation(RibRotationType)
	 * @see Cpacs.CpacsPackage#getWingRibsPositioningType_RibRotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	RibRotationType getRibRotation();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibsPositioningType#getRibRotation <em>Rib Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #getRibRotation()
	 * @generated
	 */
	void setRibRotation(RibRotationType value);

} // WingRibsPositioningType
