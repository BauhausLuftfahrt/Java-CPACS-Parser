/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComplexBaseType#getExternalDataDirectory <em>External Data Directory</em>}</li>
 *   <li>{@link Cpacs.ComplexBaseType#getExternalDataNodePath <em>External Data Node Path</em>}</li>
 *   <li>{@link Cpacs.ComplexBaseType#getExternalFileName <em>External File Name</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComplexBaseType()
 * @model extendedMetaData="name='complexBaseType' kind='empty'"
 * @generated
 */
public interface ComplexBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Data Directory</em>' attribute.
	 * @see #setExternalDataDirectory(String)
	 * @see Cpacs.CpacsPackage#getComplexBaseType_ExternalDataDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalDataDirectory();

	/**
	 * Sets the value of the '{@link Cpacs.ComplexBaseType#getExternalDataDirectory <em>External Data Directory</em>}' attribute.
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
	 * @see Cpacs.CpacsPackage#getComplexBaseType_ExternalDataNodePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataNodePath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalDataNodePath();

	/**
	 * Sets the value of the '{@link Cpacs.ComplexBaseType#getExternalDataNodePath <em>External Data Node Path</em>}' attribute.
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
	 * @see Cpacs.CpacsPackage#getComplexBaseType_ExternalFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalFileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalFileName();

	/**
	 * Sets the value of the '{@link Cpacs.ComplexBaseType#getExternalFileName <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External File Name</em>' attribute.
	 * @see #getExternalFileName()
	 * @generated
	 */
	void setExternalFileName(String value);

} // ComplexBaseType
