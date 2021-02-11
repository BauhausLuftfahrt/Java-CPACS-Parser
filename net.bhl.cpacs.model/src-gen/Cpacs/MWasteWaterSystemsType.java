/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MWaste Water Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MWasteWaterSystemsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MWasteWaterSystemsType#getMWasteWaterSystem <em>MWaste Water System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMWasteWaterSystemsType()
 * @model extendedMetaData="name='mWasteWaterSystemsType' kind='elementOnly'"
 * @generated
 */
public interface MWasteWaterSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMWasteWaterSystemsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MWasteWaterSystemsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MWaste Water System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWaste Water System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMWasteWaterSystemsType_MWasteWaterSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWasteWaterSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMWasteWaterSystem();

} // MWasteWaterSystemsType
