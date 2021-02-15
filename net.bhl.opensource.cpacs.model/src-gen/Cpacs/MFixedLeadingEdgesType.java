/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFixed Leading Edges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFixedLeadingEdgesType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFixedLeadingEdgesType#getMFixedLeadingEdge <em>MFixed Leading Edge</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFixedLeadingEdgesType()
 * @model extendedMetaData="name='mFixedLeadingEdgesType' kind='elementOnly'"
 * @generated
 */
public interface MFixedLeadingEdgesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFixedLeadingEdgesType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFixedLeadingEdgesType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MFixed Leading Edge</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MFixedLeadingEdgeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFixed Leading Edge</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMFixedLeadingEdgesType_MFixedLeadingEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFixedLeadingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFixedLeadingEdgeType> getMFixedLeadingEdge();

} // MFixedLeadingEdgesType
