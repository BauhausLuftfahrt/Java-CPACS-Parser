/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Stringer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingStringerType#getStringerStructureUID <em>Stringer Structure UID</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getPitch <em>Pitch</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getRefPoint <em>Ref Point</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getAngle <em>Angle</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getAngleReference <em>Angle Reference</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getNumberOfStringers <em>Number Of Stringers</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getAngle1 <em>Angle1</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getAngleReference1 <em>Angle Reference1</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getInnerBorderXsiLE <em>Inner Border Xsi LE</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getOuterBorderXsiLE <em>Outer Border Xsi LE</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getInnerBorderXsiTE <em>Inner Border Xsi TE</em>}</li>
 *   <li>{@link Cpacs.WingStringerType#getOuterBorderXsiTE <em>Outer Border Xsi TE</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingStringerType()
 * @model extendedMetaData="name='wingStringerType' kind='elementOnly'"
 * @generated
 */
public interface WingStringerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Stringer Structure UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringer Structure UID</em>' containment reference.
	 * @see #setStringerStructureUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_StringerStructureUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stringerStructureUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStringerStructureUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getStringerStructureUID <em>Stringer Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringer Structure UID</em>' containment reference.
	 * @see #getStringerStructureUID()
	 * @generated
	 */
	void setStringerStructureUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pitch describes the distance between to
	 *                                         adjacent stringers in the plane rectangular to the stringer
	 *                                         elongation direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pitch</em>' containment reference.
	 * @see #setPitch(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_Pitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pitch' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPitch();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getPitch <em>Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' containment reference.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ref Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Point</em>' containment reference.
	 * @see #setRefPoint(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_RefPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getRefPoint();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getRefPoint <em>Ref Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Point</em>' containment reference.
	 * @see #getRefPoint()
	 * @generated
	 */
	void setRefPoint(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stringer angle: the reference axis for the
	 *                                         stringer angle is defined by the two leading edge points of
	 *                                         the 'from'- and the 'to'-element of the componentSegment
	 *                                         definition. The angle between the reference axis and the
	 *                                         stringers equals the rotation around the z-reference axis. For
	 *                                         details, please refer to the picture below.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_Angle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngle();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the reference of the stringer angle shall
	 *                                         be different from the default implementation then this
	 *                                         parameter may be set. Allowed values include: leadingEdge,
	 *                                         trailingEdge and globalY. Furthremore, it is possible to
	 *                                         provide the UID of a spar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Reference</em>' containment reference.
	 * @see #setAngleReference(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_AngleReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleReference' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getAngleReference();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getAngleReference <em>Angle Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Reference</em>' containment reference.
	 * @see #getAngleReference()
	 * @generated
	 */
	void setAngleReference(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Number Of Stringers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of stringers; default is 0
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Stringers</em>' containment reference.
	 * @see #setNumberOfStringers(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_NumberOfStringers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfStringers' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfStringers();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getNumberOfStringers <em>Number Of Stringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Stringers</em>' containment reference.
	 * @see #getNumberOfStringers()
	 * @generated
	 */
	void setNumberOfStringers(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stringer angle: the reference axis for the
	 *                                         stringer angle is defined by the two leading edge points of
	 *                                         the 'from'- and the 'to'-element of the componentSegment
	 *                                         definition. The angle between the reference axis and the
	 *                                         stringers equals the rotation around the z-reference axis. For
	 *                                         details, please refer to the picture below.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle1</em>' containment reference.
	 * @see #setAngle1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_Angle1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngle1();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getAngle1 <em>Angle1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle1</em>' containment reference.
	 * @see #getAngle1()
	 * @generated
	 */
	void setAngle1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Reference1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the reference of the stringer angle shall
	 *                                         be different from the default implementation then this
	 *                                         parameter may be set. Allowed values include: leadingEdge,
	 *                                         trailingEdge and globalY. Furthremore, it is possible to
	 *                                         provide the UID of a spar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Reference1</em>' containment reference.
	 * @see #setAngleReference1(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_AngleReference1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleReference' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getAngleReference1();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getAngleReference1 <em>Angle Reference1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Reference1</em>' containment reference.
	 * @see #getAngleReference1()
	 * @generated
	 */
	void setAngleReference1(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Inner Border Xsi LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inner border xsi coordinate at the leading
	 *                                         edge of the stringer definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Border Xsi LE</em>' containment reference.
	 * @see #setInnerBorderXsiLE(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_InnerBorderXsiLE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerBorderXsiLE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getInnerBorderXsiLE();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getInnerBorderXsiLE <em>Inner Border Xsi LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Border Xsi LE</em>' containment reference.
	 * @see #getInnerBorderXsiLE()
	 * @generated
	 */
	void setInnerBorderXsiLE(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Outer Border Xsi LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outer border xsi coordinate at the leading
	 *                                         edge of the stringer definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer Border Xsi LE</em>' containment reference.
	 * @see #setOuterBorderXsiLE(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_OuterBorderXsiLE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outerBorderXsiLE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getOuterBorderXsiLE();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getOuterBorderXsiLE <em>Outer Border Xsi LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Border Xsi LE</em>' containment reference.
	 * @see #getOuterBorderXsiLE()
	 * @generated
	 */
	void setOuterBorderXsiLE(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Inner Border Xsi TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inner border xsi coordinate at the trailing
	 *                                         edge of the stringer definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Border Xsi TE</em>' containment reference.
	 * @see #setInnerBorderXsiTE(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_InnerBorderXsiTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerBorderXsiTE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getInnerBorderXsiTE();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getInnerBorderXsiTE <em>Inner Border Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Border Xsi TE</em>' containment reference.
	 * @see #getInnerBorderXsiTE()
	 * @generated
	 */
	void setInnerBorderXsiTE(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Outer Border Xsi TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outer border xsi coordinate at the trailing
	 *                                         edge of the stringer definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer Border Xsi TE</em>' containment reference.
	 * @see #setOuterBorderXsiTE(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getWingStringerType_OuterBorderXsiTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outerBorderXsiTE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getOuterBorderXsiTE();

	/**
	 * Sets the value of the '{@link Cpacs.WingStringerType#getOuterBorderXsiTE <em>Outer Border Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Border Xsi TE</em>' containment reference.
	 * @see #getOuterBorderXsiTE()
	 * @generated
	 */
	void setOuterBorderXsiTE(XsiIsoLineType value);

} // WingStringerType
