/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Sections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingSectionsType#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingSectionsType()
 * @model extendedMetaData="name='wingSectionsType' kind='elementOnly'"
 * @generated
 */
public interface WingSectionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingSectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingSectionsType_Section()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingSectionType> getSection();

} // WingSectionsType
