/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StringBaseType#getValue <em>Value</em>}</li>
 *   <li>{@link Cpacs.StringBaseType#getExternalDataDirectory <em>External Data Directory</em>}</li>
 *   <li>{@link Cpacs.StringBaseType#getExternalDataNodePath <em>External Data Node Path</em>}</li>
 *   <li>{@link Cpacs.StringBaseType#getExternalFileName <em>External File Name</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStringBaseType()
 * @model extendedMetaData="name='stringBaseType' kind='simple'"
 * @generated
 */
public interface StringBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Cpacs.CpacsPackage#getStringBaseType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Cpacs.StringBaseType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Data Directory</em>' attribute.
	 * @see #setExternalDataDirectory(String)
	 * @see Cpacs.CpacsPackage#getStringBaseType_ExternalDataDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalDataDirectory();

	/**
	 * Sets the value of the '{@link Cpacs.StringBaseType#getExternalDataDirectory <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Data Directory</em>' attribute.
	 * @see #getExternalDataDirectory()
	 * @generated
	 */
	void setExternalDataDirectory(String value);

	/**
	 * Returns the value of the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Data Node Path</em>' attribute.
	 * @see #setExternalDataNodePath(String)
	 * @see Cpacs.CpacsPackage#getStringBaseType_ExternalDataNodePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataNodePath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalDataNodePath();

	/**
	 * Sets the value of the '{@link Cpacs.StringBaseType#getExternalDataNodePath <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Data Node Path</em>' attribute.
	 * @see #getExternalDataNodePath()
	 * @generated
	 */
	void setExternalDataNodePath(String value);

	/**
	 * Returns the value of the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External File Name</em>' attribute.
	 * @see #setExternalFileName(String)
	 * @see Cpacs.CpacsPackage#getStringBaseType_ExternalFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalFileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalFileName();

	/**
	 * Sets the value of the '{@link Cpacs.StringBaseType#getExternalFileName <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External File Name</em>' attribute.
	 * @see #getExternalFileName()
	 * @generated
	 */
	void setExternalFileName(String value);

} // StringBaseType
