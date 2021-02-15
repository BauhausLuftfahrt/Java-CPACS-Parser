/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Beam Strut Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CrossBeamStrutAssemblyPositionType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.CrossBeamStrutAssemblyPositionType#getFrameUID <em>Frame UID</em>}</li>
 *   <li>{@link Cpacs.CrossBeamStrutAssemblyPositionType#getCrossBeamUID <em>Cross Beam UID</em>}</li>
 *   <li>{@link Cpacs.CrossBeamStrutAssemblyPositionType#getPositionYAtCrossBeam <em>Position YAt Cross Beam</em>}</li>
 *   <li>{@link Cpacs.CrossBeamStrutAssemblyPositionType#getAngleX <em>Angle X</em>}</li>
 *   <li>{@link Cpacs.CrossBeamStrutAssemblyPositionType#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.CrossBeamStrutAssemblyPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType()
 * @model extendedMetaData="name='crossBeamStrutAssemblyPositionType' kind='elementOnly'"
 * @generated
 */
public interface CrossBeamStrutAssemblyPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of profile based structural element to be
	 *                                 used as crossbeam strut
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType_StructuralElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamStrutAssemblyPositionType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #getStructuralElementUID()
	 * @generated
	 */
	void setStructuralElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the frame to which the crossbeam strut
	 *                                 is attached
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame UID</em>' containment reference.
	 * @see #setFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType_FrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamStrutAssemblyPositionType#getFrameUID <em>Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame UID</em>' containment reference.
	 * @see #getFrameUID()
	 * @generated
	 */
	void setFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Cross Beam UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the crossbeam to which the crossbeam
	 *                                 strut is attached
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross Beam UID</em>' containment reference.
	 * @see #setCrossBeamUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType_CrossBeamUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='crossBeamUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCrossBeamUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamStrutAssemblyPositionType#getCrossBeamUID <em>Cross Beam UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Beam UID</em>' containment reference.
	 * @see #getCrossBeamUID()
	 * @generated
	 */
	void setCrossBeamUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position YAt Cross Beam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenze y position of the strut at the
	 *                                 crossbeam intersection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position YAt Cross Beam</em>' containment reference.
	 * @see #setPositionYAtCrossBeam(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType_PositionYAtCrossBeam()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionYAtCrossBeam' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionYAtCrossBeam();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamStrutAssemblyPositionType#getPositionYAtCrossBeam <em>Position YAt Cross Beam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position YAt Cross Beam</em>' containment reference.
	 * @see #getPositionYAtCrossBeam()
	 * @generated
	 */
	void setPositionYAtCrossBeam(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * angle of the strut in global yz plane
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle X</em>' containment reference.
	 * @see #setAngleX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType_AngleX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleX();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamStrutAssemblyPositionType#getAngleX <em>Angle X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle X</em>' containment reference.
	 * @see #getAngleX()
	 * @generated
	 */
	void setAngleX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' containment reference.
	 * @see #setAlignment(AlignmentCrossBeamType)
	 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType_Alignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alignment' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignmentCrossBeamType getAlignment();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamStrutAssemblyPositionType#getAlignment <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' containment reference.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(AlignmentCrossBeamType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCrossBeamStrutAssemblyPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamStrutAssemblyPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CrossBeamStrutAssemblyPositionType
