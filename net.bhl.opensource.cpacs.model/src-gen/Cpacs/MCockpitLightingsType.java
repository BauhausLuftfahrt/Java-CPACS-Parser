/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCockpit Lightings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MCockpitLightingsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MCockpitLightingsType#getMCockpitLighting <em>MCockpit Lighting</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMCockpitLightingsType()
 * @model extendedMetaData="name='mCockpitLightingsType' kind='elementOnly'"
 * @generated
 */
public interface MCockpitLightingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMCockpitLightingsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MCockpitLightingsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MCockpit Lighting</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCockpit Lighting</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMCockpitLightingsType_MCockpitLighting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCockpitLighting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMCockpitLighting();

} // MCockpitLightingsType
