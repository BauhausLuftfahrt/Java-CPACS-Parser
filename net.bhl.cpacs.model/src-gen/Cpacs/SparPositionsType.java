/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Positions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparPositionsType#getSparPosition <em>Spar Position</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparPositionsType()
 * @model extendedMetaData="name='sparPositionsType' kind='elementOnly'"
 * @generated
 */
public interface SparPositionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Position</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SparPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Position</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSparPositionsType_SparPosition()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='sparPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SparPositionType> getSparPosition();

} // SparPositionsType
