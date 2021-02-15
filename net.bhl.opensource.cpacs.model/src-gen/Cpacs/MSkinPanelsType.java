/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSkin Panels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MSkinPanelsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MSkinPanelsType#getMSkinPanel <em>MSkin Panel</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMSkinPanelsType()
 * @model extendedMetaData="name='mSkinPanelsType' kind='elementOnly'"
 * @generated
 */
public interface MSkinPanelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMSkinPanelsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MSkinPanelsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSkin Panel</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSkin Panel</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMSkinPanelsType_MSkinPanel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSkinPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMSkinPanel();

} // MSkinPanelsType
