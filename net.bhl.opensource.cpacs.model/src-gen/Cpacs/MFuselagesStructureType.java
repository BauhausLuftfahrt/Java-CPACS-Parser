/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFuselages Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFuselagesStructureType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFuselagesStructureType#getMFuselageStructure <em>MFuselage Structure</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFuselagesStructureType()
 * @model extendedMetaData="name='mFuselagesStructureType' kind='elementOnly'"
 * @generated
 */
public interface MFuselagesStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuselages structure mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFuselagesStructureType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselagesStructureType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MFuselage Structure</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MFuselageStructureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFuselage Structure</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMFuselagesStructureType_MFuselageStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFuselageStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFuselageStructureType> getMFuselageStructure();

} // MFuselagesStructureType
