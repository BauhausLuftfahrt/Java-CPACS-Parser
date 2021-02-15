/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Windows Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WindowsType#getWindow <em>Window</em>}</li>
 *   <li>{@link Cpacs.WindowsType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWindowsType()
 * @model extendedMetaData="name='windowsType' kind='elementOnly'"
 * @generated
 */
public interface WindowsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CutOutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWindowsType_Window()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='window' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CutOutType> getWindow();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWindowsType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WindowsType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WindowsType
