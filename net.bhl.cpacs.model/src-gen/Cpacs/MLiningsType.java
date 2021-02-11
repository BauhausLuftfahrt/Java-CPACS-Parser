/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MLinings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MLiningsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MLiningsType#getMLining <em>MLining</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMLiningsType()
 * @model extendedMetaData="name='mLiningsType' kind='elementOnly'"
 * @generated
 */
public interface MLiningsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMLiningsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MLiningsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MLining</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLining</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMLiningsType_MLining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mLining' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMLining();

} // MLiningsType
