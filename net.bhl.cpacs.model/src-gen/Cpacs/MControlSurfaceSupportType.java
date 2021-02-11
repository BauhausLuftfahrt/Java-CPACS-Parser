/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MControl Surface Support Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MControlSurfaceSupportType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MControlSurfaceSupportType#getMStructure <em>MStructure</em>}</li>
 *   <li>{@link Cpacs.MControlSurfaceSupportType#getMFairing <em>MFairing</em>}</li>
 *   <li>{@link Cpacs.MControlSurfaceSupportType#getMParentAttachment <em>MParent Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportType()
 * @model extendedMetaData="name='mControlSurfaceSupportType' kind='elementOnly'"
 * @generated
 */
public interface MControlSurfaceSupportType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MControlSurfaceSupportType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MStructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStructure</em>' containment reference.
	 * @see #setMStructure(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportType_MStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMStructure();

	/**
	 * Sets the value of the '{@link Cpacs.MControlSurfaceSupportType#getMStructure <em>MStructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStructure</em>' containment reference.
	 * @see #getMStructure()
	 * @generated
	 */
	void setMStructure(SingleGenericMassType value);

	/**
	 * Returns the value of the '<em><b>MFairing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFairing</em>' containment reference.
	 * @see #setMFairing(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportType_MFairing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFairing' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMFairing();

	/**
	 * Sets the value of the '{@link Cpacs.MControlSurfaceSupportType#getMFairing <em>MFairing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFairing</em>' containment reference.
	 * @see #getMFairing()
	 * @generated
	 */
	void setMFairing(SingleGenericMassType value);

	/**
	 * Returns the value of the '<em><b>MParent Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MParent Attachment</em>' containment reference.
	 * @see #setMParentAttachment(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMControlSurfaceSupportType_MParentAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mParentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMParentAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.MControlSurfaceSupportType#getMParentAttachment <em>MParent Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MParent Attachment</em>' containment reference.
	 * @see #getMParentAttachment()
	 * @generated
	 */
	void setMParentAttachment(SingleGenericMassType value);

} // MControlSurfaceSupportType
