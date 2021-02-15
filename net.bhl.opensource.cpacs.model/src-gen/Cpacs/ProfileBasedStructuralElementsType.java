/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Based Structural Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ProfileBasedStructuralElementsType#getProfileBasedStructuralElement <em>Profile Based Structural Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementsType()
 * @model extendedMetaData="name='profileBasedStructuralElementsType' kind='elementOnly'"
 * @generated
 */
public interface ProfileBasedStructuralElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Profile Based Structural Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ProfileBasedStructuralElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Based Structural Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getProfileBasedStructuralElementsType_ProfileBasedStructuralElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='profileBasedStructuralElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProfileBasedStructuralElementType> getProfileBasedStructuralElement();

} // ProfileBasedStructuralElementsType
