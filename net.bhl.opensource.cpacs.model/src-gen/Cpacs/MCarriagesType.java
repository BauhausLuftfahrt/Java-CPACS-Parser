/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCarriages Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCarriagesType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCarriagesType#getMCarriage <em>MCarriage</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCarriagesType()
 * @model extendedMetaData="name='mCarriagesType' kind='elementOnly'"
 * @generated
 */
public interface MCarriagesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCarriagesType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCarriagesType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCarriage</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCarriage</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMCarriagesType_MCarriage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCarriage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMCarriage();

} // MCarriagesType
