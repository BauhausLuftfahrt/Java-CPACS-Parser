/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Galley Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GalleyElementsType#getGalleyElement <em>Galley Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGalleyElementsType()
 * @model extendedMetaData="name='galleyElementsType' kind='elementOnly'"
 * @generated
 */
public interface GalleyElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Galley Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GalleyElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Galley element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Galley Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGalleyElementsType_GalleyElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='galleyElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GalleyElementType> getGalleyElement();

} // GalleyElementsType
