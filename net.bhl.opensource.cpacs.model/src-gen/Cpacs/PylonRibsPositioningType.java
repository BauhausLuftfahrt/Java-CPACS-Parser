/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Ribs Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonRibsPositioningType#getRelDepthStart <em>Rel Depth Start</em>}</li>
 *   <li>{@link Cpacs.PylonRibsPositioningType#getRelDepthEnd <em>Rel Depth End</em>}</li>
 *   <li>{@link Cpacs.PylonRibsPositioningType#getRibRotation <em>Rib Rotation</em>}</li>
 *   <li>{@link Cpacs.PylonRibsPositioningType#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link Cpacs.PylonRibsPositioningType#getNumberOfRibs <em>Number Of Ribs</em>}</li>
 *   <li>{@link Cpacs.PylonRibsPositioningType#getRibCrossingBehaviour <em>Rib Crossing Behaviour</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonRibsPositioningType()
 * @model extendedMetaData="name='pylonRibsPositioningType' kind='elementOnly'"
 * @generated
 */
public interface PylonRibsPositioningType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rel Depth Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * relDepthStart defines the forward location of
	 *                                 the beginning of the rib set. 0 equals the forward end of the
	 *                                 pylon box, while 1 equals the rear end of the pylon box.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Depth Start</em>' containment reference.
	 * @see #setRelDepthStart(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPylonRibsPositioningType_RelDepthStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relDepthStart' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelDepthStart();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsPositioningType#getRelDepthStart <em>Rel Depth Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Depth Start</em>' containment reference.
	 * @see #getRelDepthStart()
	 * @generated
	 */
	void setRelDepthStart(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Rel Depth End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * relDepthEnd defines the rear end. 0 equals the
	 *                                 forward end of the pylon box, while 1 equals the rear end of the
	 *                                 pylon box.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Depth End</em>' containment reference.
	 * @see #setRelDepthEnd(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPylonRibsPositioningType_RelDepthEnd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relDepthEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelDepthEnd();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsPositioningType#getRelDepthEnd <em>Rel Depth End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Depth End</em>' containment reference.
	 * @see #getRelDepthEnd()
	 * @generated
	 */
	void setRelDepthEnd(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ribs can be rotated in the side view. The
	 *                                 defaults to 90°, which equals an orientation along the pylons
	 *                                 z-axis. The angle is meassured around the positive y-direction
	 *                                 of the pylon.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #setRibRotation(PointYType)
	 * @see Cpacs.CpacsPackage#getPylonRibsPositioningType_RibRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointYType getRibRotation();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsPositioningType#getRibRotation <em>Rib Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #getRibRotation()
	 * @generated
	 */
	void setRibRotation(PointYType value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The spacing of the ribs defines the distance
	 *                                     between two ribs, measured along the pylons x-axis. First rib
	 *                                     is placed at relDepthStart.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacing</em>' containment reference.
	 * @see #setSpacing(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPylonRibsPositioningType_Spacing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spacing' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpacing();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsPositioningType#getSpacing <em>Spacing</em>}' containment reference.
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
	 * RibNumber defines the number of ribs in this
	 *                                     ribSet. First rib is at relDepthStart along the pylons x-axis,
	 *                                     last rib is at relDepthEnd. The spacing is constant.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Ribs</em>' containment reference.
	 * @see #setNumberOfRibs(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getPylonRibsPositioningType_NumberOfRibs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfRibs' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfRibs();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsPositioningType#getNumberOfRibs <em>Number Of Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Ribs</em>' containment reference.
	 * @see #getNumberOfRibs()
	 * @generated
	 */
	void setNumberOfRibs(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Crossing Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Crossing Behaviour</em>' containment reference.
	 * @see #setRibCrossingBehaviour(RibCrossingBehaviourType)
	 * @see Cpacs.CpacsPackage#getPylonRibsPositioningType_RibCrossingBehaviour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribCrossingBehaviour' namespace='##targetNamespace'"
	 * @generated
	 */
	RibCrossingBehaviourType getRibCrossingBehaviour();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsPositioningType#getRibCrossingBehaviour <em>Rib Crossing Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Crossing Behaviour</em>' containment reference.
	 * @see #getRibCrossingBehaviour()
	 * @generated
	 */
	void setRibCrossingBehaviour(RibCrossingBehaviourType value);

} // PylonRibsPositioningType
