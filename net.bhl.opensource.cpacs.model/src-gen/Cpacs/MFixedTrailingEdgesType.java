/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFixed Trailing Edges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFixedTrailingEdgesType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFixedTrailingEdgesType#getMFixedTrailingEdge <em>MFixed Trailing Edge</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFixedTrailingEdgesType()
 * @model extendedMetaData="name='mFixedTrailingEdgesType' kind='elementOnly'"
 * @generated
 */
public interface MFixedTrailingEdgesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFixedTrailingEdgesType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFixedTrailingEdgesType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MFixed Trailing Edge</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MFixedTrailingEdgeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFixed Trailing Edge</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMFixedTrailingEdgesType_MFixedTrailingEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFixedTrailingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFixedTrailingEdgeType> getMFixedTrailingEdge();

} // MFixedTrailingEdgesType
