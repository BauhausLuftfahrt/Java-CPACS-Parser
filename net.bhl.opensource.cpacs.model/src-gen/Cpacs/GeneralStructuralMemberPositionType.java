/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Structural Member Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidStart <em>Position XUid Start</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidEnd <em>Position XUid End</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidMin <em>Position XUid Min</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidMid <em>Position XUid Mid</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidMax <em>Position XUid Max</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXAngle <em>Position XAngle</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXFact <em>Position XFact</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXoffset <em>Position Xoffset</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link Cpacs.GeneralStructuralMemberPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType()
 * @model extendedMetaData="name='generalStructuralMemberPositionType' kind='elementOnly'"
 * @generated
 */
public interface GeneralStructuralMemberPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_StructuralElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #getStructuralElementUID()
	 * @generated
	 */
	void setStructuralElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position X</em>' containment reference.
	 * @see #setPositionX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionX();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionX <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' containment reference.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XUid Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position XUid Start</em>' containment reference.
	 * @see #setPositionXUidStart(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXUidStart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXUidStart' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPositionXUidStart();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidStart <em>Position XUid Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XUid Start</em>' containment reference.
	 * @see #getPositionXUidStart()
	 * @generated
	 */
	void setPositionXUidStart(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XUid End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position XUid End</em>' containment reference.
	 * @see #setPositionXUidEnd(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXUidEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXUidEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPositionXUidEnd();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidEnd <em>Position XUid End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XUid End</em>' containment reference.
	 * @see #getPositionXUidEnd()
	 * @generated
	 */
	void setPositionXUidEnd(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XUid Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position XUid Min</em>' containment reference.
	 * @see #setPositionXUidMin(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXUidMin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXUidMin' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPositionXUidMin();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidMin <em>Position XUid Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XUid Min</em>' containment reference.
	 * @see #getPositionXUidMin()
	 * @generated
	 */
	void setPositionXUidMin(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XUid Mid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position XUid Mid</em>' containment reference.
	 * @see #setPositionXUidMid(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXUidMid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXUidMid' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPositionXUidMid();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidMid <em>Position XUid Mid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XUid Mid</em>' containment reference.
	 * @see #getPositionXUidMid()
	 * @generated
	 */
	void setPositionXUidMid(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XUid Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position XUid Max</em>' containment reference.
	 * @see #setPositionXUidMax(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXUidMax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXUidMax' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPositionXUidMax();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXUidMax <em>Position XUid Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XUid Max</em>' containment reference.
	 * @see #getPositionXUidMax()
	 * @generated
	 */
	void setPositionXUidMax(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XAngle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position XAngle</em>' containment reference.
	 * @see #setPositionXAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionXAngle();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXAngle <em>Position XAngle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XAngle</em>' containment reference.
	 * @see #getPositionXAngle()
	 * @generated
	 */
	void setPositionXAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XFact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position XFact</em>' containment reference.
	 * @see #setPositionXFact(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXFact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXFact' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionXFact();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXFact <em>Position XFact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XFact</em>' containment reference.
	 * @see #getPositionXFact()
	 * @generated
	 */
	void setPositionXFact(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Position Xoffset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Xoffset</em>' containment reference.
	 * @see #setPositionXoffset(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_PositionXoffset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXoffset' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionXoffset();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getPositionXoffset <em>Position Xoffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Xoffset</em>' containment reference.
	 * @see #getPositionXoffset()
	 * @generated
	 */
	void setPositionXoffset(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' containment reference.
	 * @see #setAlignment(AlignmentStringFrameType)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_Alignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alignment' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignmentStringFrameType getAlignment();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getAlignment <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' containment reference.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(AlignmentStringFrameType value);

	/**
	 * Returns the value of the '<em><b>Continuity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuity definition for profile extrusion:
	 *                                 0= C0 (allows sharp edges, default), 2= C2 (defines curvature
	 *                                 continuity)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuity</em>' containment reference.
	 * @see #setContinuity(ContinuityType2)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_Continuity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continuity' namespace='##targetNamespace'"
	 * @generated
	 */
	ContinuityType2 getContinuity();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getContinuity <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuity</em>' containment reference.
	 * @see #getContinuity()
	 * @generated
	 */
	void setContinuity(ContinuityType2 value);

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of interpolation between different
	 *                                 profiles: 0= no interpolation 1= interpolation of structural
	 *                                 profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation</em>' containment reference.
	 * @see #setInterpolation(InterpolationType1)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_Interpolation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpolation' namespace='##targetNamespace'"
	 * @generated
	 */
	InterpolationType1 getInterpolation();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getInterpolation <em>Interpolation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' containment reference.
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(InterpolationType1 value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMemberPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GeneralStructuralMemberPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GeneralStructuralMemberPositionType
