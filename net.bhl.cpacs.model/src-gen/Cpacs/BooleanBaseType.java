/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BooleanBaseType#isValue <em>Value</em>}</li>
 *   <li>{@link Cpacs.BooleanBaseType#getExternalDataDirectory <em>External Data Directory</em>}</li>
 *   <li>{@link Cpacs.BooleanBaseType#getExternalDataNodePath <em>External Data Node Path</em>}</li>
 *   <li>{@link Cpacs.BooleanBaseType#getExternalFileName <em>External File Name</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBooleanBaseType()
 * @model extendedMetaData="name='booleanBaseType' kind='simple'"
 * @generated
 */
public interface BooleanBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(boolean)
	 * @see Cpacs.CpacsPackage#getBooleanBaseType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link Cpacs.BooleanBaseType#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Unsets the value of the '{@link Cpacs.BooleanBaseType#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link Cpacs.BooleanBaseType#isValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #isValue()
	 * @see #setValue(boolean)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Data Directory</em>' attribute.
	 * @see #setExternalDataDirectory(String)
	 * @see Cpacs.CpacsPackage#getBooleanBaseType_ExternalDataDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalDataDirectory();

	/**
	 * Sets the value of the '{@link Cpacs.BooleanBaseType#getExternalDataDirectory <em>External Data Directory</em>}' attribute.
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
	 * @see Cpacs.CpacsPackage#getBooleanBaseType_ExternalDataNodePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataNodePath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalDataNodePath();

	/**
	 * Sets the value of the '{@link Cpacs.BooleanBaseType#getExternalDataNodePath <em>External Data Node Path</em>}' attribute.
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
	 * @see Cpacs.CpacsPackage#getBooleanBaseType_ExternalFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalFileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExternalFileName();

	/**
	 * Sets the value of the '{@link Cpacs.BooleanBaseType#getExternalFileName <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External File Name</em>' attribute.
	 * @see #getExternalFileName()
	 * @generated
	 */
	void setExternalFileName(String value);

} // BooleanBaseType
