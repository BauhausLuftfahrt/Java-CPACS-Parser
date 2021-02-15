/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Center Fuselage Pressure Floor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CenterFuselagePressureFloorType#getPositionZStringerUID <em>Position ZStringer UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselagePressureFloorType#getStartHorizontalFrameUID <em>Start Horizontal Frame UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselagePressureFloorType#getMembraneRadius <em>Membrane Radius</em>}</li>
 *   <li>{@link Cpacs.CenterFuselagePressureFloorType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselagePressureFloorType#getReinforcementElementUID <em>Reinforcement Element UID</em>}</li>
 *   <li>{@link Cpacs.CenterFuselagePressureFloorType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCenterFuselagePressureFloorType()
 * @model extendedMetaData="name='centerFuselagePressureFloorType' kind='elementOnly'"
 * @generated
 */
public interface CenterFuselagePressureFloorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Position ZStringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position ZStringer UID</em>' containment reference.
	 * @see #setPositionZStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselagePressureFloorType_PositionZStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionZStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPositionZStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselagePressureFloorType#getPositionZStringerUID <em>Position ZStringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position ZStringer UID</em>' containment reference.
	 * @see #getPositionZStringerUID()
	 * @generated
	 */
	void setPositionZStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Horizontal Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Horizontal Frame UID</em>' containment reference.
	 * @see #setStartHorizontalFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselagePressureFloorType_StartHorizontalFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startHorizontalFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartHorizontalFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselagePressureFloorType#getStartHorizontalFrameUID <em>Start Horizontal Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Horizontal Frame UID</em>' containment reference.
	 * @see #getStartHorizontalFrameUID()
	 * @generated
	 */
	void setStartHorizontalFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Membrane Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membrane Radius</em>' containment reference.
	 * @see #setMembraneRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselagePressureFloorType_MembraneRadius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='membraneRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMembraneRadius();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselagePressureFloorType#getMembraneRadius <em>Membrane Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Membrane Radius</em>' containment reference.
	 * @see #getMembraneRadius()
	 * @generated
	 */
	void setMembraneRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselagePressureFloorType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselagePressureFloorType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #getSheetElementUID()
	 * @generated
	 */
	void setSheetElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Reinforcement Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reinforcement Element UID</em>' containment reference.
	 * @see #setReinforcementElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCenterFuselagePressureFloorType_ReinforcementElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reinforcementElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReinforcementElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselagePressureFloorType#getReinforcementElementUID <em>Reinforcement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinforcement Element UID</em>' containment reference.
	 * @see #getReinforcementElementUID()
	 * @generated
	 */
	void setReinforcementElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCenterFuselagePressureFloorType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CenterFuselagePressureFloorType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CenterFuselagePressureFloorType
