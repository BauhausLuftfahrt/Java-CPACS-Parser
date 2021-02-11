/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MVacuum Waste Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MVacuumWasteSystemsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MVacuumWasteSystemsType#getMVacuumWasteSystem <em>MVacuum Waste System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMVacuumWasteSystemsType()
 * @model extendedMetaData="name='mVacuumWasteSystemsType' kind='elementOnly'"
 * @generated
 */
public interface MVacuumWasteSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMVacuumWasteSystemsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MVacuumWasteSystemsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MVacuum Waste System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVacuum Waste System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMVacuumWasteSystemsType_MVacuumWasteSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mVacuumWasteSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMVacuumWasteSystem();

} // MVacuumWasteSystemsType
