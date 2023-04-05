/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Galleys Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GalleysType#getGalley <em>Galley</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGalleysType()
 * @model extendedMetaData="name='galleysType' kind='elementOnly'"
 * @generated
 */
public interface GalleysType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Galley</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckComponent2DBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Galley
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Galley</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGalleysType_Galley()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='galley' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckComponent2DBaseType> getGalley();

} // GalleysType
