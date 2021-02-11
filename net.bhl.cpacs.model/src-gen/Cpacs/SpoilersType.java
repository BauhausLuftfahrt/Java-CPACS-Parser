/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spoilers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpoilersType#getSpoiler <em>Spoiler</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpoilersType()
 * @model extendedMetaData="name='spoilersType' kind='elementOnly'"
 * @generated
 */
public interface SpoilersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spoiler</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SpoilerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spoiler</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSpoilersType_Spoiler()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='spoiler' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpoilerType> getSpoiler();

} // SpoilersType
