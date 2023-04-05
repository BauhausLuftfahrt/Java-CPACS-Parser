/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Floor Beam Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LongFloorBeamPositionType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.LongFloorBeamPositionType#getCrossBeamUID <em>Cross Beam UID</em>}</li>
 *   <li>{@link Cpacs.LongFloorBeamPositionType#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link Cpacs.LongFloorBeamPositionType#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.LongFloorBeamPositionType#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.LongFloorBeamPositionType#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link Cpacs.LongFloorBeamPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType()
 * @model extendedMetaData="name='longFloorBeamPositionType' kind='elementOnly'"
 * @generated
 */
public interface LongFloorBeamPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType_StructuralElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamPositionType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #getStructuralElementUID()
	 * @generated
	 */
	void setStructuralElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Cross Beam UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of crossbeam to which the long. beam is
	 *                                 attached
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Beam UID</em>' containment reference.
	 * @see #setCrossBeamUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType_CrossBeamUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='crossBeamUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCrossBeamUID();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamPositionType#getCrossBeamUID <em>Cross Beam UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Beam UID</em>' containment reference.
	 * @see #getCrossBeamUID()
	 * @generated
	 */
	void setCrossBeamUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * y position of long. beam
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Y</em>' containment reference.
	 * @see #setPositionY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType_PositionY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionY();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamPositionType#getPositionY <em>Position Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Y</em>' containment reference.
	 * @see #getPositionY()
	 * @generated
	 */
	void setPositionY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' containment reference.
	 * @see #setAlignment(AlignmentStructMemberType)
	 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType_Alignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alignment' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignmentStructMemberType getAlignment();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamPositionType#getAlignment <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' containment reference.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(AlignmentStructMemberType value);

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
	 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType_Continuity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continuity' namespace='##targetNamespace'"
	 * @generated
	 */
	ContinuityType getContinuity();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamPositionType#getContinuity <em>Continuity</em>}' containment reference.
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
	 *                                 profiles: 0= no interpolation 1= interpolation of structural
	 *                                 profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpolation</em>' containment reference.
	 * @see #setInterpolation(InterpolationType)
	 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType_Interpolation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interpolation' namespace='##targetNamespace'"
	 * @generated
	 */
	InterpolationType getInterpolation();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamPositionType#getInterpolation <em>Interpolation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpolation</em>' containment reference.
	 * @see #getInterpolation()
	 * @generated
	 */
	void setInterpolation(InterpolationType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLongFloorBeamPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LongFloorBeamPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LongFloorBeamPositionType
