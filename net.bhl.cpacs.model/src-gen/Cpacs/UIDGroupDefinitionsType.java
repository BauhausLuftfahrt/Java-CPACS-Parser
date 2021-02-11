/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UID Group Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.UIDGroupDefinitionsType#getUIDGroupDefinition <em>UID Group Definition</em>}</li>
 *   <li>{@link Cpacs.UIDGroupDefinitionsType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionsType()
 * @model extendedMetaData="name='UIDGroupDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface UIDGroupDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>UID Group Definition</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.UIDGroupDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID Group Definition</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionsType_UIDGroupDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UIDGroupDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UIDGroupDefinitionType> getUIDGroupDefinition();

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getUIDGroupDefinitionsType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.UIDGroupDefinitionsType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // UIDGroupDefinitionsType
