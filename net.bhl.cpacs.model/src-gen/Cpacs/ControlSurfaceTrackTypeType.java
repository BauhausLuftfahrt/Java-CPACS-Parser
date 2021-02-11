/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Track Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceTrackTypeType#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceTrackTypeType#getTrackType <em>Track Type</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceTrackTypeType#getTrackSubType <em>Track Sub Type</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceTrackTypeType#getActuator <em>Actuator</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceTrackTypeType#getTrackStructure <em>Track Structure</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceTrackTypeType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceTrackTypeType()
 * @model extendedMetaData="name='controlSurfaceTrackTypeType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceTrackTypeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position of the track. Eta
	 *                                 refers to the control surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta</em>' containment reference.
	 * @see #setEta(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceTrackTypeType_Eta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eta' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEta();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceTrackTypeType#getEta <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' containment reference.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Track Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of the track. Please refer to the remarks
	 *                                 of the controlSrufaceTrackTypeType for details.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Track Type</em>' containment reference.
	 * @see #setTrackType(TrackTypeType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceTrackTypeType_TrackType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trackType' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackTypeType getTrackType();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceTrackTypeType#getTrackType <em>Track Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Type</em>' containment reference.
	 * @see #getTrackType()
	 * @generated
	 */
	void setTrackType(TrackTypeType value);

	/**
	 * Returns the value of the '<em><b>Track Sub Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of the track. Please refer to the remarks
	 *                                 of the controlSrufaceTrackTypeType for details.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Track Sub Type</em>' containment reference.
	 * @see #setTrackSubType(TrackSubTypeType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceTrackTypeType_TrackSubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trackSubType' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSubTypeType getTrackSubType();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceTrackTypeType#getTrackSubType <em>Track Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Sub Type</em>' containment reference.
	 * @see #getTrackSubType()
	 * @generated
	 */
	void setTrackSubType(TrackSubTypeType value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference.
	 * @see #setActuator(TrackActuatorType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceTrackTypeType_Actuator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actuator' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackActuatorType getActuator();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceTrackTypeType#getActuator <em>Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' containment reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(TrackActuatorType value);

	/**
	 * Returns the value of the '<em><b>Track Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Structure</em>' containment reference.
	 * @see #setTrackStructure(TrackStructureType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceTrackTypeType_TrackStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trackStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackStructureType getTrackStructure();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceTrackTypeType#getTrackStructure <em>Track Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Structure</em>' containment reference.
	 * @see #getTrackStructure()
	 * @generated
	 */
	void setTrackStructure(TrackStructureType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getControlSurfaceTrackTypeType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceTrackTypeType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ControlSurfaceTrackTypeType
