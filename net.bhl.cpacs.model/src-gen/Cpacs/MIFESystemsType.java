/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MIFE Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MIFESystemsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MIFESystemsType#getMIFE <em>MIFE</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMIFESystemsType()
 * @model extendedMetaData="name='mIFESystemsType' kind='elementOnly'"
 * @generated
 */
public interface MIFESystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMIFESystemsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MIFESystemsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MIFE</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIFE</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMIFESystemsType_MIFE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mIFE' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMIFE();

} // MIFESystemsType
