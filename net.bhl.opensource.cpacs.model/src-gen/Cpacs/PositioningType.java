/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PositioningType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.PositioningType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.PositioningType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.PositioningType#getSweepAngle <em>Sweep Angle</em>}</li>
 *   <li>{@link Cpacs.PositioningType#getDihedralAngle <em>Dihedral Angle</em>}</li>
 *   <li>{@link Cpacs.PositioningType#getFromSectionUID <em>From Section UID</em>}</li>
 *   <li>{@link Cpacs.PositioningType#getToSectionUID <em>To Section UID</em>}</li>
 *   <li>{@link Cpacs.PositioningType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPositioningType()
 * @model extendedMetaData="name='positioningType' kind='elementOnly'"
 * @generated
 */
public interface PositioningType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the positioning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPositioningType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the positioning.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPositioningType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance between inner and outer section
	 *                                 (length of the positioning vector).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPositioningType_Length()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sweep Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sweepangle between inner and outer section.
	 *                                 This angle equals a positive rotation of the positioning vector
	 *                                 around the z-axis of the wing coordinate system.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sweep Angle</em>' containment reference.
	 * @see #setSweepAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPositioningType_SweepAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sweepAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSweepAngle();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getSweepAngle <em>Sweep Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sweep Angle</em>' containment reference.
	 * @see #getSweepAngle()
	 * @generated
	 */
	void setSweepAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Dihedral Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dihedralangle between inner and outer section.
	 *                                 This angle equals a positive rotation of the positioning vector
	 *                                 around the x-axis of the wing coordinate system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dihedral Angle</em>' containment reference.
	 * @see #setDihedralAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPositioningType_DihedralAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dihedralAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDihedralAngle();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getDihedralAngle <em>Dihedral Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dihedral Angle</em>' containment reference.
	 * @see #getDihedralAngle()
	 * @generated
	 */
	void setDihedralAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>From Section UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to starting section of the
	 *                                 positioning vector. If missing, the positioning is made from the
	 *                                 origin of the wing coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Section UID</em>' containment reference.
	 * @see #setFromSectionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPositioningType_FromSectionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fromSectionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromSectionUID();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getFromSectionUID <em>From Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Section UID</em>' containment reference.
	 * @see #getFromSectionUID()
	 * @generated
	 */
	void setFromSectionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>To Section UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to ending section (section to be
	 *                                 positioned) of the positioning vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Section UID</em>' containment reference.
	 * @see #setToSectionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPositioningType_ToSectionUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toSectionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToSectionUID();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getToSectionUID <em>To Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Section UID</em>' containment reference.
	 * @see #getToSectionUID()
	 * @generated
	 */
	void setToSectionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPositioningType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PositioningType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PositioningType
