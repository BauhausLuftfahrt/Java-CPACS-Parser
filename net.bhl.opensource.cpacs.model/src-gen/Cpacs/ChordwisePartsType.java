/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chordwise Parts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ChordwisePartsType#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getChordwisePartsType()
 * @model extendedMetaData="name='chordwisePartsType' kind='elementOnly'"
 * @generated
 */
public interface ChordwisePartsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ChordwisePartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getChordwisePartsType_Part()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChordwisePartType> getPart();

} // ChordwisePartsType
