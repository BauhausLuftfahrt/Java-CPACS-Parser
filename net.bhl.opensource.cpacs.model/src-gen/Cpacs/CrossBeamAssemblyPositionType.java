/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Beam Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CrossBeamAssemblyPositionType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.CrossBeamAssemblyPositionType#getFrameUID <em>Frame UID</em>}</li>
 *   <li>{@link Cpacs.CrossBeamAssemblyPositionType#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link Cpacs.CrossBeamAssemblyPositionType#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.CrossBeamAssemblyPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCrossBeamAssemblyPositionType()
 * @model extendedMetaData="name='crossBeamAssemblyPositionType' kind='elementOnly'"
 * @generated
 */
public interface CrossBeamAssemblyPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of profile based structural element to be
	 *                                 used as crossbeam
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamAssemblyPositionType_StructuralElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamAssemblyPositionType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
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
	 * UID of the frame to which the crossbeam is
	 *                                 attached
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame UID</em>' containment reference.
	 * @see #setFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamAssemblyPositionType_FrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamAssemblyPositionType#getFrameUID <em>Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame UID</em>' containment reference.
	 * @see #getFrameUID()
	 * @generated
	 */
	void setFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenze z position of the crossbeam
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Z</em>' containment reference.
	 * @see #setPositionZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCrossBeamAssemblyPositionType_PositionZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionZ();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamAssemblyPositionType#getPositionZ <em>Position Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Z</em>' containment reference.
	 * @see #getPositionZ()
	 * @generated
	 */
	void setPositionZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' containment reference.
	 * @see #setAlignment(AlignmentCrossBeamType)
	 * @see Cpacs.CpacsPackage#getCrossBeamAssemblyPositionType_Alignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alignment' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignmentCrossBeamType getAlignment();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamAssemblyPositionType#getAlignment <em>Alignment</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCrossBeamAssemblyPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CrossBeamAssemblyPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CrossBeamAssemblyPositionType
