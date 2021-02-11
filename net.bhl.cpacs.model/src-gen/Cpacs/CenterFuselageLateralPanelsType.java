/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Fuselage Lateral Panels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getTransitionFrameUID <em>Transition Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getFwdLatPanelLowY <em>Fwd Lat Panel Low Y</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getFwdLatPanelSheetUID <em>Fwd Lat Panel Sheet UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getFwdLatPanelReinforcementUID <em>Fwd Lat Panel Reinforcement UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getRearLatPanelHeightStringerUID <em>Rear Lat Panel Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getRearLatPanelSheetUID <em>Rear Lat Panel Sheet UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getRearLatPanelReinforcementUID <em>Rear Lat Panel Reinforcement UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselageLateralPanelsType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType()
 * @model extendedMetaData="name='centerFuselageLateralPanelsType' kind='elementOnly'"
 * @generated
 */
public interface CenterFuselageLateralPanelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Transition Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Frame UID</em>' containment reference.
	 * @see #setTransitionFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_TransitionFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transitionFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getTransitionFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getTransitionFrameUID <em>Transition Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Frame UID</em>' containment reference.
	 * @see #getTransitionFrameUID()
	 * @generated
	 */
	void setTransitionFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fwd Lat Panel Low Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fwd Lat Panel Low Y</em>' containment reference.
	 * @see #setFwdLatPanelLowY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_FwdLatPanelLowY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fwdLatPanelLowY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFwdLatPanelLowY();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getFwdLatPanelLowY <em>Fwd Lat Panel Low Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fwd Lat Panel Low Y</em>' containment reference.
	 * @see #getFwdLatPanelLowY()
	 * @generated
	 */
	void setFwdLatPanelLowY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fwd Lat Panel Sheet UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fwd Lat Panel Sheet UID</em>' containment reference.
	 * @see #setFwdLatPanelSheetUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_FwdLatPanelSheetUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fwdLatPanelSheetUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFwdLatPanelSheetUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getFwdLatPanelSheetUID <em>Fwd Lat Panel Sheet UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fwd Lat Panel Sheet UID</em>' containment reference.
	 * @see #getFwdLatPanelSheetUID()
	 * @generated
	 */
	void setFwdLatPanelSheetUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fwd Lat Panel Reinforcement UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fwd Lat Panel Reinforcement UID</em>' containment reference.
	 * @see #setFwdLatPanelReinforcementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_FwdLatPanelReinforcementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fwdLatPanelReinforcementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFwdLatPanelReinforcementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getFwdLatPanelReinforcementUID <em>Fwd Lat Panel Reinforcement UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fwd Lat Panel Reinforcement UID</em>' containment reference.
	 * @see #getFwdLatPanelReinforcementUID()
	 * @generated
	 */
	void setFwdLatPanelReinforcementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rear Lat Panel Height Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rear Lat Panel Height Stringer UID</em>' containment reference.
	 * @see #setRearLatPanelHeightStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_RearLatPanelHeightStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rearLatPanelHeightStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRearLatPanelHeightStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getRearLatPanelHeightStringerUID <em>Rear Lat Panel Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear Lat Panel Height Stringer UID</em>' containment reference.
	 * @see #getRearLatPanelHeightStringerUID()
	 * @generated
	 */
	void setRearLatPanelHeightStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rear Lat Panel Sheet UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rear Lat Panel Sheet UID</em>' containment reference.
	 * @see #setRearLatPanelSheetUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_RearLatPanelSheetUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rearLatPanelSheetUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRearLatPanelSheetUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getRearLatPanelSheetUID <em>Rear Lat Panel Sheet UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear Lat Panel Sheet UID</em>' containment reference.
	 * @see #getRearLatPanelSheetUID()
	 * @generated
	 */
	void setRearLatPanelSheetUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rear Lat Panel Reinforcement UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rear Lat Panel Reinforcement UID</em>' containment reference.
	 * @see #setRearLatPanelReinforcementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_RearLatPanelReinforcementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rearLatPanelReinforcementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRearLatPanelReinforcementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getRearLatPanelReinforcementUID <em>Rear Lat Panel Reinforcement UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear Lat Panel Reinforcement UID</em>' containment reference.
	 * @see #getRearLatPanelReinforcementUID()
	 * @generated
	 */
	void setRearLatPanelReinforcementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCenterFuselageLateralPanelsType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselageLateralPanelsType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CenterFuselageLateralPanelsType
