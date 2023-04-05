/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LogEntryType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.LogEntryType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link Cpacs.LogEntryType#getCreator <em>Creator</em>}</li>
 *   <li>{@link Cpacs.LogEntryType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLogEntryType()
 * @model extendedMetaData="name='logEntryType' kind='elementOnly'"
 * @generated
 */
public interface LogEntryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of CPACS dataset
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getLogEntryType_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.LogEntryType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(DateTimeBaseType)
	 * @see Cpacs.CpacsPackage#getLogEntryType_Timestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeBaseType getTimestamp();

	/**
	 * Sets the value of the '{@link Cpacs.LogEntryType#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(DateTimeBaseType value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creator (tool, person, etc.)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(StringBaseType)
	 * @see Cpacs.CpacsPackage#getLogEntryType_Creator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getCreator();

	/**
	 * Sets the value of the '{@link Cpacs.LogEntryType#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Cpacs.CpacsPackage#getLogEntryType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Cpacs.LogEntryType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // LogEntryType
