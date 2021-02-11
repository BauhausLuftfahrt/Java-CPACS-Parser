/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link To File Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LinkToFileType#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLinkToFileType()
 * @model extendedMetaData="name='linkToFileType' kind='simple'"
 * @generated
 */
public interface LinkToFileType extends StringBaseType {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.FormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see Cpacs.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(FormatType)
	 * @see Cpacs.CpacsPackage#getLinkToFileType_Format()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link Cpacs.LinkToFileType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see Cpacs.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Unsets the value of the '{@link Cpacs.LinkToFileType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link Cpacs.LinkToFileType#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	boolean isSetFormat();

} // LinkToFileType
