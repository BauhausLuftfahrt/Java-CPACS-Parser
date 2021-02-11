/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackStructureType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getCar <em>Car</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getStrut1 <em>Strut1</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getStrut2 <em>Strut2</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getStrut3 <em>Strut3</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getSidePanels <em>Side Panels</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getUpperPanel <em>Upper Panel</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getLowerPanel <em>Lower Panel</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getRollerTrack <em>Roller Track</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getRibs <em>Ribs</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getFairing <em>Fairing</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackStructureType()
 * @model extendedMetaData="name='trackStructureType' kind='elementOnly'"
 * @generated
 */
public interface TrackStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Surface Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #setControlSurfaceAttachment(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_ControlSurfaceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getControlSurfaceAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 */
	void setControlSurfaceAttachment(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Car</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Car</em>' containment reference.
	 * @see #setCar(TrackCarType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Car()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='car' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackCarType getCar();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getCar <em>Car</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Car</em>' containment reference.
	 * @see #getCar()
	 * @generated
	 */
	void setCar(TrackCarType value);

	/**
	 * Returns the value of the '<em><b>Strut1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strut1</em>' containment reference.
	 * @see #setStrut1(TrackStrut1Type)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Strut1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strut1' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackStrut1Type getStrut1();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getStrut1 <em>Strut1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strut1</em>' containment reference.
	 * @see #getStrut1()
	 * @generated
	 */
	void setStrut1(TrackStrut1Type value);

	/**
	 * Returns the value of the '<em><b>Strut2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strut2</em>' containment reference.
	 * @see #setStrut2(TrackStrut2Type)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Strut2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strut2' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackStrut2Type getStrut2();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getStrut2 <em>Strut2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strut2</em>' containment reference.
	 * @see #getStrut2()
	 * @generated
	 */
	void setStrut2(TrackStrut2Type value);

	/**
	 * Returns the value of the '<em><b>Strut3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strut3</em>' containment reference.
	 * @see #setStrut3(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Strut3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strut3' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getStrut3();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getStrut3 <em>Strut3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strut3</em>' containment reference.
	 * @see #getStrut3()
	 * @generated
	 */
	void setStrut3(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Side Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Panels</em>' containment reference.
	 * @see #setSidePanels(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_SidePanels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sidePanels' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getSidePanels();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getSidePanels <em>Side Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Panels</em>' containment reference.
	 * @see #getSidePanels()
	 * @generated
	 */
	void setSidePanels(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Upper Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Panel</em>' containment reference.
	 * @see #setUpperPanel(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_UpperPanel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getUpperPanel();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getUpperPanel <em>Upper Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Panel</em>' containment reference.
	 * @see #getUpperPanel()
	 * @generated
	 */
	void setUpperPanel(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Lower Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Panel</em>' containment reference.
	 * @see #setLowerPanel(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_LowerPanel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowerPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getLowerPanel();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getLowerPanel <em>Lower Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Panel</em>' containment reference.
	 * @see #getLowerPanel()
	 * @generated
	 */
	void setLowerPanel(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Roller Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roller Track</em>' containment reference.
	 * @see #setRollerTrack(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_RollerTrack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollerTrack' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getRollerTrack();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getRollerTrack <em>Roller Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roller Track</em>' containment reference.
	 * @see #getRollerTrack()
	 * @generated
	 */
	void setRollerTrack(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Ribs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs</em>' containment reference.
	 * @see #setRibs(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Ribs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribs' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getRibs();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getRibs <em>Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ribs</em>' containment reference.
	 * @see #getRibs()
	 * @generated
	 */
	void setRibs(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Fairing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fairing</em>' containment reference.
	 * @see #setFairing(TrackFairingType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Fairing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fairing' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackFairingType getFairing();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getFairing <em>Fairing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fairing</em>' containment reference.
	 * @see #getFairing()
	 * @generated
	 */
	void setFairing(TrackFairingType value);

} // TrackStructureType
