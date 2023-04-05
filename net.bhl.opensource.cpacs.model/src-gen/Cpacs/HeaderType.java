/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HeaderType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.HeaderType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.HeaderType#getVersion <em>Version</em>}</li>
 *   <li>{@link Cpacs.HeaderType#getVersionInfos <em>Version Infos</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHeaderType()
 * @model extendedMetaData="name='headerType' kind='elementOnly'"
 * @generated
 */
public interface HeaderType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of CPACS dataset
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getHeaderType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getName <em>Name</em>}' containment reference.
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
	 * Description of CPACS dataset
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getHeaderType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of initial CPACS dataset according to the Semantic Versioning 2.0.0 standard.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see Cpacs.CpacsPackage#getHeaderType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Version Infos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Infos</em>' containment reference.
	 * @see #setVersionInfos(VersionInfosType)
	 * @see Cpacs.CpacsPackage#getHeaderType_VersionInfos()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='versionInfos' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionInfosType getVersionInfos();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getVersionInfos <em>Version Infos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Infos</em>' containment reference.
	 * @see #getVersionInfos()
	 * @generated
	 */
	void setVersionInfos(VersionInfosType value);

} // HeaderType
