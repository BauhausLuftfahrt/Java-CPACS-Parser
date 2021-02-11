/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEmpty UL Ds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MEmptyULDsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MEmptyULDsType#getMEmptyULD <em>MEmpty ULD</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMEmptyULDsType()
 * @model extendedMetaData="name='mEmptyULDsType' kind='elementOnly'"
 * @generated
 */
public interface MEmptyULDsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMEmptyULDsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MEmptyULDsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MEmpty ULD</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MEmptyULDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEmpty ULD</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMEmptyULDsType_MEmptyULD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEmptyULD' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MEmptyULDType> getMEmptyULD();

} // MEmptyULDsType
