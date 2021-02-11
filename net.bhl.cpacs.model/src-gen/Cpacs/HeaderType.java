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
 *   <li>{@link Cpacs.HeaderType#getCreator <em>Creator</em>}</li>
 *   <li>{@link Cpacs.HeaderType#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link Cpacs.HeaderType#getVersion <em>Version</em>}</li>
 *   <li>{@link Cpacs.HeaderType#getCpacsVersion <em>Cpacs Version</em>}</li>
 *   <li>{@link Cpacs.HeaderType#getUpdates <em>Updates</em>}</li>
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
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creator of initial CPACS dataset
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(StringBaseType)
	 * @see Cpacs.CpacsPackage#getHeaderType_Creator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='creator' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getCreator();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getCreator <em>Creator</em>}' containment reference.
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
	 * Timestamp of initial CPACS dataset creation
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(DateTimeBaseType)
	 * @see Cpacs.CpacsPackage#getHeaderType_Timestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeBaseType getTimestamp();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getTimestamp <em>Timestamp</em>}' containment reference.
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
	 * Version of initial CPACS dataset
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(StringBaseType)
	 * @see Cpacs.CpacsPackage#getHeaderType_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getVersion();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Cpacs Version</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.CpacsVersionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CPACS version that the dataset is valid to. The element is optional, since data sets 
	 *                                 can be valid for several CPACS versions. However, we strongly recommend to assign data sets to a
	 *                                 specific CPACS version as far as possible, especially since some tools and libraries (e.g. TiGL) 
	 *                                 require this specification.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpacs Version</em>' attribute.
	 * @see Cpacs.CpacsVersionType
	 * @see #isSetCpacsVersion()
	 * @see #unsetCpacsVersion()
	 * @see #setCpacsVersion(CpacsVersionType)
	 * @see Cpacs.CpacsPackage#getHeaderType_CpacsVersion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='cpacsVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CpacsVersionType getCpacsVersion();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getCpacsVersion <em>Cpacs Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpacs Version</em>' attribute.
	 * @see Cpacs.CpacsVersionType
	 * @see #isSetCpacsVersion()
	 * @see #unsetCpacsVersion()
	 * @see #getCpacsVersion()
	 * @generated
	 */
	void setCpacsVersion(CpacsVersionType value);

	/**
	 * Unsets the value of the '{@link Cpacs.HeaderType#getCpacsVersion <em>Cpacs Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCpacsVersion()
	 * @see #getCpacsVersion()
	 * @see #setCpacsVersion(CpacsVersionType)
	 * @generated
	 */
	void unsetCpacsVersion();

	/**
	 * Returns whether the value of the '{@link Cpacs.HeaderType#getCpacsVersion <em>Cpacs Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cpacs Version</em>' attribute is set.
	 * @see #unsetCpacsVersion()
	 * @see #getCpacsVersion()
	 * @see #setCpacsVersion(CpacsVersionType)
	 * @generated
	 */
	boolean isSetCpacsVersion();

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' containment reference.
	 * @see #setUpdates(UpdatesType)
	 * @see Cpacs.CpacsPackage#getHeaderType_Updates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updates' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdatesType getUpdates();

	/**
	 * Sets the value of the '{@link Cpacs.HeaderType#getUpdates <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updates</em>' containment reference.
	 * @see #getUpdates()
	 * @generated
	 */
	void setUpdates(UpdatesType value);

} // HeaderType
