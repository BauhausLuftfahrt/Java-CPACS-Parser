/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet Based Structural Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SheetBasedStructuralElementType#getMaterialDefinition <em>Material Definition</em>}</li>
 *   <li>{@link Cpacs.SheetBasedStructuralElementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSheetBasedStructuralElementType()
 * @model extendedMetaData="name='sheetBasedStructuralElementType' kind='elementOnly'"
 * @generated
 */
public interface SheetBasedStructuralElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Material Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material definition of the skin segment
	 *                                 (Material, thickness, (lay-up))
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material Definition</em>' containment reference.
	 * @see #setMaterialDefinition(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getSheetBasedStructuralElementType_MaterialDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='materialDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterialDefinition();

	/**
	 * Sets the value of the '{@link Cpacs.SheetBasedStructuralElementType#getMaterialDefinition <em>Material Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Definition</em>' containment reference.
	 * @see #getMaterialDefinition()
	 * @generated
	 */
	void setMaterialDefinition(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSheetBasedStructuralElementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SheetBasedStructuralElementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SheetBasedStructuralElementType
