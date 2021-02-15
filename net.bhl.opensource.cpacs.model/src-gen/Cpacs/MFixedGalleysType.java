/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFixed Galleys Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFixedGalleysType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFixedGalleysType#getMFixedGalley <em>MFixed Galley</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFixedGalleysType()
 * @model extendedMetaData="name='mFixedGalleysType' kind='elementOnly'"
 * @generated
 */
public interface MFixedGalleysType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFixedGalleysType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFixedGalleysType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MFixed Galley</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFixed Galley</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMFixedGalleysType_MFixedGalley()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFixedGalley' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMFixedGalley();

} // MFixedGalleysType
