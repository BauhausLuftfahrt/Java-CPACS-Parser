/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.UpdateType#getModification <em>Modification</em>}</li>
 *   <li>{@link Cpacs.UpdateType#getCreator <em>Creator</em>}</li>
 *   <li>{@link Cpacs.UpdateType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link Cpacs.UpdateType#getVersion <em>Version</em>}</li>
 *   <li>{@link Cpacs.UpdateType#getCpacsVersion <em>Cpacs Version</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getUpdateType()
 * @model extendedMetaData="name='updateType' kind='elementOnly'"
 * @generated
 */
public interface UpdateType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Modification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of Modification of CPACS data
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modification</em>' containment reference.
	 * @see #setModification(StringBaseType)
	 * @see Cpacs.CpacsPackage#getUpdateType_Modification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modification' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getModification();

	/**
	 * Sets the value of the '{@link Cpacs.UpdateType#getModification <em>Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification</em>' containment reference.
	 * @see #getModification()
	 * @generated
	 */
	void setModification(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creator of CPACS modification
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(StringBaseType)
	 * @see Cpacs.CpacsPackage#getUpdateType_Creator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getCreator();

	/**
	 * Sets the value of the '{@link Cpacs.UpdateType#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp of CPACS modification
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(DateTimeBaseType)
	 * @see Cpacs.CpacsPackage#getUpdateType_Timestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeBaseType getTimestamp();

	/**
	 * Sets the value of the '{@link Cpacs.UpdateType#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(DateTimeBaseType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * New version number of CPACS dataset after
	 *                                 modification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(StringBaseType)
	 * @see Cpacs.CpacsPackage#getUpdateType_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getVersion();

	/**
	 * Sets the value of the '{@link Cpacs.UpdateType#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Cpacs Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CPACS version that the dataset is valid to
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpacs Version</em>' containment reference.
	 * @see #setCpacsVersion(StringBaseType)
	 * @see Cpacs.CpacsPackage#getUpdateType_CpacsVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cpacsVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getCpacsVersion();

	/**
	 * Sets the value of the '{@link Cpacs.UpdateType#getCpacsVersion <em>Cpacs Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpacs Version</em>' containment reference.
	 * @see #getCpacsVersion()
	 * @generated
	 */
	void setCpacsVersion(StringBaseType value);

} // UpdateType
