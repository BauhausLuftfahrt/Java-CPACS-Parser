/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String UID Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StringUIDBaseType#getValue <em>Value</em>}</li>
 *   <li>{@link Cpacs.StringUIDBaseType#getIsLink <em>Is Link</em>}</li>
 *   <li>{@link Cpacs.StringUIDBaseType#getSymmetry <em>Symmetry</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStringUIDBaseType()
 * @model extendedMetaData="name='stringUIDBaseType' kind='simple'"
 * @generated
 */
public interface StringUIDBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see Cpacs.CpacsPackage#getStringUIDBaseType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link Cpacs.StringUIDBaseType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Link</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                               
	 *   <ddue:legacyBold xmlns:ddue="http://ddue.schemas.microsoft.com/authoring/2003/5">DEPRECATED</ddue:legacyBold>
	 *   : The 
	 *   <ddue:codeInline xmlns:ddue="http://ddue.schemas.microsoft.com/authoring/2003/5">isLink</ddue:codeInline>
	 *    attribute is set to optional to ensure the compatibility of older data records. However, since the linking character is explicitly defined by the 
	 *   <ddue:legacyBold xmlns:ddue="http://ddue.schemas.microsoft.com/authoring/2003/5">stringUIDBaseType</ddue:legacyBold>
	 *   , the attribute is superfluous and will therefore be completely omitted in future versions.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Link</em>' attribute.
	 * @see #isSetIsLink()
	 * @see #unsetIsLink()
	 * @see #setIsLink(String)
	 * @see Cpacs.CpacsPackage#getStringUIDBaseType_IsLink()
	 * @model default="True" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isLink' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIsLink();

	/**
	 * Sets the value of the '{@link Cpacs.StringUIDBaseType#getIsLink <em>Is Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Link</em>' attribute.
	 * @see #isSetIsLink()
	 * @see #unsetIsLink()
	 * @see #getIsLink()
	 * @generated
	 */
	void setIsLink(String value);

	/**
	 * Unsets the value of the '{@link Cpacs.StringUIDBaseType#getIsLink <em>Is Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLink()
	 * @see #getIsLink()
	 * @see #setIsLink(String)
	 * @generated
	 */
	void unsetIsLink();

	/**
	 * Returns whether the value of the '{@link Cpacs.StringUIDBaseType#getIsLink <em>Is Link</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Link</em>' attribute is set.
	 * @see #unsetIsLink()
	 * @see #getIsLink()
	 * @see #setIsLink(String)
	 * @generated
	 */
	boolean isSetIsLink();

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.SymmetryType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType1
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryType1)
	 * @see Cpacs.CpacsPackage#getStringUIDBaseType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry' namespace='##targetNamespace'"
	 * @generated
	 */
	SymmetryType1 getSymmetry();

	/**
	 * Sets the value of the '{@link Cpacs.StringUIDBaseType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see Cpacs.SymmetryType1
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryType1 value);

	/**
	 * Unsets the value of the '{@link Cpacs.StringUIDBaseType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType1)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link Cpacs.StringUIDBaseType#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType1)
	 * @generated
	 */
	boolean isSetSymmetry();

} // StringUIDBaseType
