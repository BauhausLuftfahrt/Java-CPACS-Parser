/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Geometry Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericGeometryComponentType#getLinkToFile <em>Link To File</em>}</li>
 *   <li>{@link Cpacs.GenericGeometryComponentType#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericGeometryComponentType()
 * @model extendedMetaData="name='genericGeometryComponentType' kind='elementOnly'"
 * @generated
 */
public interface GenericGeometryComponentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Link To File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To File</em>' containment reference.
	 * @see #setLinkToFile(LinkToFileType)
	 * @see Cpacs.CpacsPackage#getGenericGeometryComponentType_LinkToFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='linkToFile' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkToFileType getLinkToFile();

	/**
	 * Sets the value of the '{@link Cpacs.GenericGeometryComponentType#getLinkToFile <em>Link To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To File</em>' containment reference.
	 * @see #getLinkToFile()
	 * @generated
	 */
	void setLinkToFile(LinkToFileType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getGenericGeometryComponentType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.GenericGeometryComponentType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

} // GenericGeometryComponentType
