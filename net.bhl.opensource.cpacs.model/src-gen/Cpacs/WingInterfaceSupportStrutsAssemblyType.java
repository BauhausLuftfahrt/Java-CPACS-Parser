/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Interface Support Struts Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutsAssemblyType#getWingInterfaceSupportStrut <em>Wing Interface Support Strut</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutsAssemblyType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutsAssemblyType()
 * @model extendedMetaData="name='wingInterfaceSupportStrutsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface WingInterfaceSupportStrutsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Interface Support Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingInterfaceSupportStrutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Interface Support Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutsAssemblyType_WingInterfaceSupportStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingInterfaceSupportStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingInterfaceSupportStrutType> getWingInterfaceSupportStrut();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutsAssemblyType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutsAssemblyType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingInterfaceSupportStrutsAssemblyType
