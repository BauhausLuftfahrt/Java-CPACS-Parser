/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Sections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageSectionsType#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageSectionsType()
 * @model extendedMetaData="name='fuselageSectionsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageSectionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageSectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageSectionsType_Section()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageSectionType> getSection();

} // FuselageSectionsType
