/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Attachment Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingAttachmentPositioningType#getRelHeight <em>Rel Height</em>}</li>
 *   <li>{@link Cpacs.WingAttachmentPositioningType#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.WingAttachmentPositioningType#getXsi <em>Xsi</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingAttachmentPositioningType()
 * @model extendedMetaData="name='wingAttachmentPositioningType' kind='elementOnly'"
 * @generated
 */
public interface WingAttachmentPositioningType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rel Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative height of spar or rib at which landing gear is attached.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Height</em>' containment reference.
	 * @see #setRelHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingAttachmentPositioningType_RelHeight()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelHeight();

	/**
	 * Sets the value of the '{@link Cpacs.WingAttachmentPositioningType#getRelHeight <em>Rel Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Height</em>' containment reference.
	 * @see #getRelHeight()
	 * @generated
	 */
	void setRelHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position (eta) of spar at which landing gear is attached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta</em>' containment reference.
	 * @see #setEta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingAttachmentPositioningType_Eta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEta();

	/**
	 * Sets the value of the '{@link Cpacs.WingAttachmentPositioningType#getEta <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' containment reference.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position (xsi) of the rib at which landing gear is attached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi</em>' containment reference.
	 * @see #setXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingAttachmentPositioningType_Xsi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi();

	/**
	 * Sets the value of the '{@link Cpacs.WingAttachmentPositioningType#getXsi <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi</em>' containment reference.
	 * @see #getXsi()
	 * @generated
	 */
	void setXsi(DoubleBaseType value);

} // WingAttachmentPositioningType
