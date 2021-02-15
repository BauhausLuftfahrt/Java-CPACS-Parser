/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MExt Lightings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MExtLightingsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MExtLightingsType#getMExtLighting <em>MExt Lighting</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMExtLightingsType()
 * @model extendedMetaData="name='mExtLightingsType' kind='elementOnly'"
 * @generated
 */
public interface MExtLightingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMExtLightingsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MExtLightingsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MExt Lighting</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MExt Lighting</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMExtLightingsType_MExtLighting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mExtLighting' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMExtLighting();

} // MExtLightingsType
