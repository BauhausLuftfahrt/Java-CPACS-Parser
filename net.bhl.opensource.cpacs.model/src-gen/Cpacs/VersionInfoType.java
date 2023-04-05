/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VersionInfoType#getCpacsVersion <em>Cpacs Version</em>}</li>
 *   <li>{@link Cpacs.VersionInfoType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.VersionInfoType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link Cpacs.VersionInfoType#getCreator <em>Creator</em>}</li>
 *   <li>{@link Cpacs.VersionInfoType#getChangeLog <em>Change Log</em>}</li>
 *   <li>{@link Cpacs.VersionInfoType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVersionInfoType()
 * @model extendedMetaData="name='versionInfoType' kind='elementOnly'"
 * @generated
 */
public interface VersionInfoType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cpacs Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CPACS version of the dataset
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpacs Version</em>' attribute.
	 * @see #setCpacsVersion(String)
	 * @see Cpacs.CpacsPackage#getVersionInfoType_CpacsVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='cpacsVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCpacsVersion();

	/**
	 * Sets the value of the '{@link Cpacs.VersionInfoType#getCpacsVersion <em>Cpacs Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpacs Version</em>' attribute.
	 * @see #getCpacsVersion()
	 * @generated
	 */
	void setCpacsVersion(String value);

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
	 * @see Cpacs.CpacsPackage#getVersionInfoType_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.VersionInfoType#getDescription <em>Description</em>}' containment reference.
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
	 * Timestamp of initial CPACS dataset creation
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(DateTimeBaseType)
	 * @see Cpacs.CpacsPackage#getVersionInfoType_Timestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeBaseType getTimestamp();

	/**
	 * Sets the value of the '{@link Cpacs.VersionInfoType#getTimestamp <em>Timestamp</em>}' containment reference.
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
	 * Creator of initial CPACS dataset
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(StringBaseType)
	 * @see Cpacs.CpacsPackage#getVersionInfoType_Creator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getCreator();

	/**
	 * Sets the value of the '{@link Cpacs.VersionInfoType#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Change Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Log</em>' containment reference.
	 * @see #setChangeLog(ChangeLogType)
	 * @see Cpacs.CpacsPackage#getVersionInfoType_ChangeLog()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeLog' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeLogType getChangeLog();

	/**
	 * Sets the value of the '{@link Cpacs.VersionInfoType#getChangeLog <em>Change Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Log</em>' containment reference.
	 * @see #getChangeLog()
	 * @generated
	 */
	void setChangeLog(ChangeLogType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Cpacs.CpacsPackage#getVersionInfoType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Cpacs.VersionInfoType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // VersionInfoType
