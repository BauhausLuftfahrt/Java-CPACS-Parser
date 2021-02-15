/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stringer Frame Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StringerFramePositionType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getReferenceY <em>Reference Y</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getReferenceZ <em>Reference Z</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getReferenceAngle <em>Reference Angle</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link Cpacs.StringerFramePositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStringerFramePositionType()
 * @model extendedMetaData="name='stringerFramePositionType' kind='elementOnly'"
 * @generated
 */
public interface StringerFramePositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of profile based structural element
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_StructuralElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * x position in absolute value
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position X</em>' containment reference.
	 * @see #setPositionX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_PositionX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionX();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getPositionX <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' containment reference.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * y coordinate of reference system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Y</em>' containment reference.
	 * @see #setReferenceY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_ReferenceY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReferenceY();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getReferenceY <em>Reference Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Y</em>' containment reference.
	 * @see #getReferenceY()
	 * @generated
	 */
	void setReferenceY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z coordinate of reference system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Z</em>' containment reference.
	 * @see #setReferenceZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_ReferenceZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReferenceZ();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getReferenceZ <em>Reference Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Z</em>' containment reference.
	 * @see #getReferenceZ()
	 * @generated
	 */
	void setReferenceZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * angle definition to calculate intersection
	 *                                 with loft
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Angle</em>' containment reference.
	 * @see #setReferenceAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_ReferenceAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReferenceAngle();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getReferenceAngle <em>Reference Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Angle</em>' containment reference.
	 * @see #getReferenceAngle()
	 * @generated
	 */
	void setReferenceAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' containment reference.
	 * @see #setAlignment(AlignmentStringFrameType)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_Alignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alignment' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignmentStringFrameType getAlignment();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getAlignment <em>Alignment</em>}' containment reference.
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
	 * @see #setContinuity(ContinuityType)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_Continuity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continuity' namespace='##targetNamespace'"
	 * @generated
	 */
	ContinuityType getContinuity();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getContinuity <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuity</em>' containment reference.
	 * @see #getContinuity()
	 * @generated
	 */
	void setContinuity(ContinuityType value);

	/**
	 * Returns the value of the '<em><b>Interpolation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of interpolation between different
	 *                                 profiles: 0= no interpolation 1= interpolation of strcutural
	 *                                 profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation</em>' containment reference.
	 * @see #setInterpolation(InterpolationType2)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_Interpolation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpolation' namespace='##targetNamespace'"
	 * @generated
	 */
	InterpolationType2 getInterpolation();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getInterpolation <em>Interpolation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' containment reference.
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(InterpolationType2 value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStringerFramePositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StringerFramePositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StringerFramePositionType
