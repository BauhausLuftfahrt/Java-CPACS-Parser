/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMoveable Leading Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MMoveableLeadingEdgeType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MMoveableLeadingEdgeType#getMBody <em>MBody</em>}</li>
 *   <li>{@link Cpacs.MMoveableLeadingEdgeType#getMSupport <em>MSupport</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMMoveableLeadingEdgeType()
 * @model extendedMetaData="name='mMoveableLeadingEdgeType' kind='elementOnly'"
 * @generated
 */
public interface MMoveableLeadingEdgeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMMoveableLeadingEdgeType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveableLeadingEdgeType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MBody</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBody</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMMoveableLeadingEdgeType_MBody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBody' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMBody();

	/**
	 * Returns the value of the '<em><b>MSupport</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSupport</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMMoveableLeadingEdgeType_MSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMSupport();

} // MMoveableLeadingEdgeType
