/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Structural Members Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GeneralStructuralMembersAssemblyType#getGeneralStructuralMember <em>General Structural Member</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGeneralStructuralMembersAssemblyType()
 * @model extendedMetaData="name='generalStructuralMembersAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface GeneralStructuralMembersAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>General Structural Member</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GeneralStructuralMemberType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Structural Member</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGeneralStructuralMembersAssemblyType_GeneralStructuralMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='generalStructuralMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GeneralStructuralMemberType> getGeneralStructuralMember();

} // GeneralStructuralMembersAssemblyType
