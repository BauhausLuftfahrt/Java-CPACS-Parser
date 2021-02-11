/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nacelle Sections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NacelleSectionsType#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNacelleSectionsType()
 * @model extendedMetaData="name='nacelleSectionsType' kind='elementOnly'"
 * @generated
 */
public interface NacelleSectionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.NacelleSectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getNacelleSectionsType_Section()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NacelleSectionType> getSection();

} // NacelleSectionsType
