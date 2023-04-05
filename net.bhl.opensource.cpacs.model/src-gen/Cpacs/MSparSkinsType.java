/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSpar Skins Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MSparSkinsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MSparSkinsType#getMSparSkin <em>MSpar Skin</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMSparSkinsType()
 * @model extendedMetaData="name='mSparSkinsType' kind='elementOnly'"
 * @generated
 */
public interface MSparSkinsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMSparSkinsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MSparSkinsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSpar Skin</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpar Skin</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMSparSkinsType_MSparSkin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSparSkin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMSparSkin();

} // MSparSkinsType
