/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBulk Cargos Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MBulkCargosType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MBulkCargosType#getMBulkCargo <em>MBulk Cargo</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMBulkCargosType()
 * @model extendedMetaData="name='mBulkCargosType' kind='elementOnly'"
 * @generated
 */
public interface MBulkCargosType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMBulkCargosType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MBulkCargosType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MBulk Cargo</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MBulkCargoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBulk Cargo</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMBulkCargosType_MBulkCargo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBulkCargo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MBulkCargoType> getMBulkCargo();

} // MBulkCargosType
