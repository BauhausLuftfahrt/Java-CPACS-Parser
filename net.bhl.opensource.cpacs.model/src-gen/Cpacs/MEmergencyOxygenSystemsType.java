/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEmergency Oxygen Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MEmergencyOxygenSystemsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MEmergencyOxygenSystemsType#getMEmergencyOxygenSystem <em>MEmergency Oxygen System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMEmergencyOxygenSystemsType()
 * @model extendedMetaData="name='mEmergencyOxygenSystemsType' kind='elementOnly'"
 * @generated
 */
public interface MEmergencyOxygenSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMEmergencyOxygenSystemsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MEmergencyOxygenSystemsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MEmergency Oxygen System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEmergency Oxygen System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMEmergencyOxygenSystemsType_MEmergencyOxygenSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEmergencyOxygenSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMEmergencyOxygenSystem();

} // MEmergencyOxygenSystemsType
