/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UID Group Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.UIDGroupDefinitionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.UIDGroupDefinitionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.UIDGroupDefinitionType#getStructuralMemberUID <em>Structural Member UID</em>}</li>
 *   <li>{@link Cpacs.UIDGroupDefinitionType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.UIDGroupDefinitionType#getEntityUID <em>Entity UID</em>}</li>
 *   <li>{@link Cpacs.UIDGroupDefinitionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionType()
 * @model extendedMetaData="name='uIDGroupDefinitionType' kind='elementOnly'"
 * @generated
 */
public interface UIDGroupDefinitionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.UIDGroupDefinitionType#getName <em>Name</em>}' containment reference.
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
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.UIDGroupDefinitionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Member UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Member UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionType_StructuralMemberUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralMemberUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getStructuralMemberUID();

	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionType_StructuralElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getStructuralElementUID();

	/**
	 * Returns the value of the '<em><b>Entity UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionType_EntityUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entityUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getEntityUID();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.UIDGroupDefinitionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // UIDGroupDefinitionType
