/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Mass Group Level2 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftMassGroupLevel2Type#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassGroupLevel2Type#getMElement <em>MElement</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftMassGroupLevel2Type()
 * @model extendedMetaData="name='rotorcraftMassGroupLevel2Type' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftMassGroupLevel2Type extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group mass of hierarchy level 2
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getRotorcraftMassGroupLevel2Type_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassGroupLevel2Type#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MElement</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MElement</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorcraftMassGroupLevel2Type_MElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericMassType> getMElement();

} // RotorcraftMassGroupLevel2Type
