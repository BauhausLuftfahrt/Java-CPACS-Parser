/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strut Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StrutAssemblyType#getStrutProperties <em>Strut Properties</em>}</li>
 *   <li>{@link Cpacs.StrutAssemblyType#getMainStrutRelativePosition <em>Main Strut Relative Position</em>}</li>
 *   <li>{@link Cpacs.StrutAssemblyType#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link Cpacs.StrutAssemblyType#getRelEndPoint <em>Rel End Point</em>}</li>
 *   <li>{@link Cpacs.StrutAssemblyType#getRelStrutEndPoint <em>Rel Strut End Point</em>}</li>
 *   <li>{@link Cpacs.StrutAssemblyType#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link Cpacs.StrutAssemblyType#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.StrutAssemblyType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStrutAssemblyType()
 * @model extendedMetaData="name='strutAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface StrutAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Strut Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strut properties
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strut Properties</em>' containment reference.
	 * @see #setStrutProperties(StrutPropertiesType)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_StrutProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strutProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutPropertiesType getStrutProperties();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getStrutProperties <em>Strut Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strut Properties</em>' containment reference.
	 * @see #getStrutProperties()
	 * @generated
	 */
	void setStrutProperties(StrutPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Main Strut Relative Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting point of the support strut must connect to the main strut. This element specifies the relative position on the main strut (0 -> top end, 1 -> bottom end).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Strut Relative Position</em>' attribute.
	 * @see #isSetMainStrutRelativePosition()
	 * @see #unsetMainStrutRelativePosition()
	 * @see #setMainStrutRelativePosition(double)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_MainStrutRelativePosition()
	 * @model unsettable="true" dataType="Cpacs.MainStrutRelativePositionType" required="true"
	 *        extendedMetaData="kind='element' name='mainStrutRelativePosition' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMainStrutRelativePosition();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getMainStrutRelativePosition <em>Main Strut Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Strut Relative Position</em>' attribute.
	 * @see #isSetMainStrutRelativePosition()
	 * @see #unsetMainStrutRelativePosition()
	 * @see #getMainStrutRelativePosition()
	 * @generated
	 */
	void setMainStrutRelativePosition(double value);

	/**
	 * Unsets the value of the '{@link Cpacs.StrutAssemblyType#getMainStrutRelativePosition <em>Main Strut Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMainStrutRelativePosition()
	 * @see #getMainStrutRelativePosition()
	 * @see #setMainStrutRelativePosition(double)
	 * @generated
	 */
	void unsetMainStrutRelativePosition();

	/**
	 * Returns whether the value of the '{@link Cpacs.StrutAssemblyType#getMainStrutRelativePosition <em>Main Strut Relative Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Main Strut Relative Position</em>' attribute is set.
	 * @see #unsetMainStrutRelativePosition()
	 * @see #getMainStrutRelativePosition()
	 * @see #setMainStrutRelativePosition(double)
	 * @generated
	 */
	boolean isSetMainStrutRelativePosition();

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position in absolute coordinates. Coordinates are relative to parent if it has a parentUID reference (otherwise global).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Point</em>' containment reference.
	 * @see #setEndPoint(PointAbsRelType)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_EndPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	PointAbsRelType getEndPoint();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getEndPoint <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' containment reference.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(PointAbsRelType value);

	/**
	 * Returns the value of the '<em><b>Rel End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position in eta/xsi/relHeight coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel End Point</em>' containment reference.
	 * @see #setRelEndPoint(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_RelEndPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relEndPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getRelEndPoint();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getRelEndPoint <em>Rel End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel End Point</em>' containment reference.
	 * @see #getRelEndPoint()
	 * @generated
	 */
	void setRelEndPoint(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Rel Strut End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End position as a relative position on another strut of this landing gear
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Strut End Point</em>' containment reference.
	 * @see #setRelStrutEndPoint(RelativeStrutPositionType)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_RelStrutEndPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relStrutEndPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativeStrutPositionType getRelStrutEndPoint();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getRelStrutEndPoint <em>Rel Strut End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Strut End Point</em>' containment reference.
	 * @see #getRelStrutEndPoint()
	 * @generated
	 */
	void setRelStrutEndPoint(RelativeStrutPositionType value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attachment to an aircraft wing or fuselage component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(LandingGearStrutAttachmentType)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_Attachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearStrutAttachmentType getAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(LandingGearStrutAttachmentType value);

	/**
	 * Returns the value of the '<em><b>Actuator UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to an actuator uID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator UID</em>' containment reference.
	 * @see #setActuatorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_ActuatorUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actuatorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getActuatorUID();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getActuatorUID <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator UID</em>' containment reference.
	 * @see #getActuatorUID()
	 * @generated
	 */
	void setActuatorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStrutAssemblyType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StrutAssemblyType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StrutAssemblyType
