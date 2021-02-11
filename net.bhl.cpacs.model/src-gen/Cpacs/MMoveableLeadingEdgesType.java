/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMoveable Leading Edges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MMoveableLeadingEdgesType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MMoveableLeadingEdgesType#getMMoveableLeadingEdge <em>MMoveable Leading Edge</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMMoveableLeadingEdgesType()
 * @model extendedMetaData="name='mMoveableLeadingEdgesType' kind='elementOnly'"
 * @generated
 */
public interface MMoveableLeadingEdgesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMMoveableLeadingEdgesType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveableLeadingEdgesType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MMoveable Leading Edge</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MMoveableLeadingEdgeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMoveable Leading Edge</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMMoveableLeadingEdgesType_MMoveableLeadingEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMoveableLeadingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MMoveableLeadingEdgeType> getMMoveableLeadingEdge();

} // MMoveableLeadingEdgesType
