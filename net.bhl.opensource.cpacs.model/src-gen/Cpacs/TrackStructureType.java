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
 *   <li>{@link Cpacs.TrackStructureType#getStruts <em>Struts</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getJointPositions <em>Joint Positions</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 *   <li>{@link Cpacs.TrackStructureType#getCarriage <em>Carriage</em>}</li>
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
	 * Returns the value of the '<em><b>Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struts</em>' containment reference.
	 * @see #setStruts(TrackStrutsType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Struts()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='struts' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackStrutsType getStruts();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getStruts <em>Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struts</em>' containment reference.
	 * @see #getStruts()
	 * @generated
	 */
	void setStruts(TrackStrutsType value);

	/**
	 * Returns the value of the '<em><b>Joint Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint Positions</em>' containment reference.
	 * @see #setJointPositions(TrackJointPositionsType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_JointPositions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jointPositions' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackJointPositionsType getJointPositions();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getJointPositions <em>Joint Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joint Positions</em>' containment reference.
	 * @see #getJointPositions()
	 * @generated
	 */
	void setJointPositions(TrackJointPositionsType value);

	/**
	 * Returns the value of the '<em><b>Control Surface Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #setControlSurfaceAttachment(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_ControlSurfaceAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getControlSurfaceAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 */
	void setControlSurfaceAttachment(TrackSecondaryStructureType value);

	/**
	 * Returns the value of the '<em><b>Carriage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carriage</em>' containment reference.
	 * @see #setCarriage(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Carriage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carriage' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getCarriage();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getCarriage <em>Carriage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carriage</em>' containment reference.
	 * @see #getCarriage()
	 * @generated
	 */
	void setCarriage(TrackSecondaryStructureType value);

	/**
	 * Returns the value of the '<em><b>Side Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Panels</em>' containment reference.
	 * @see #setSidePanels(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_SidePanels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sidePanels' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getSidePanels();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getSidePanels <em>Side Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side Panels</em>' containment reference.
	 * @see #getSidePanels()
	 * @generated
	 */
	void setSidePanels(TrackSecondaryStructureType value);

	/**
	 * Returns the value of the '<em><b>Upper Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Panel</em>' containment reference.
	 * @see #setUpperPanel(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_UpperPanel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getUpperPanel();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getUpperPanel <em>Upper Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Panel</em>' containment reference.
	 * @see #getUpperPanel()
	 * @generated
	 */
	void setUpperPanel(TrackSecondaryStructureType value);

	/**
	 * Returns the value of the '<em><b>Lower Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Panel</em>' containment reference.
	 * @see #setLowerPanel(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_LowerPanel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowerPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getLowerPanel();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getLowerPanel <em>Lower Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Panel</em>' containment reference.
	 * @see #getLowerPanel()
	 * @generated
	 */
	void setLowerPanel(TrackSecondaryStructureType value);

	/**
	 * Returns the value of the '<em><b>Roller Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roller Track</em>' containment reference.
	 * @see #setRollerTrack(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_RollerTrack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollerTrack' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getRollerTrack();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getRollerTrack <em>Roller Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roller Track</em>' containment reference.
	 * @see #getRollerTrack()
	 * @generated
	 */
	void setRollerTrack(TrackSecondaryStructureType value);

	/**
	 * Returns the value of the '<em><b>Ribs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs</em>' containment reference.
	 * @see #setRibs(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Ribs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribs' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getRibs();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getRibs <em>Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ribs</em>' containment reference.
	 * @see #getRibs()
	 * @generated
	 */
	void setRibs(TrackSecondaryStructureType value);

	/**
	 * Returns the value of the '<em><b>Fairing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fairing</em>' containment reference.
	 * @see #setFairing(TrackSecondaryStructureType)
	 * @see Cpacs.CpacsPackage#getTrackStructureType_Fairing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fairing' namespace='##targetNamespace'"
	 * @generated
	 */
	TrackSecondaryStructureType getFairing();

	/**
	 * Sets the value of the '{@link Cpacs.TrackStructureType#getFairing <em>Fairing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fairing</em>' containment reference.
	 * @see #getFairing()
	 * @generated
	 */
	void setFairing(TrackSecondaryStructureType value);

} // TrackStructureType
