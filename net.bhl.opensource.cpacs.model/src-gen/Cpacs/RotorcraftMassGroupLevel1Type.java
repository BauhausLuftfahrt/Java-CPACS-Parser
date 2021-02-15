/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Mass Group Level1 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftMassGroupLevel1Type#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassGroupLevel1Type#getMGroup <em>MGroup</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftMassGroupLevel1Type()
 * @model extendedMetaData="name='rotorcraftMassGroupLevel1Type' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftMassGroupLevel1Type extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group mass of hierarchy level 1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getRotorcraftMassGroupLevel1Type_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassGroupLevel1Type#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MGroup</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RotorcraftMassGroupLevel2Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MGroup</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorcraftMassGroupLevel1Type_MGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RotorcraftMassGroupLevel2Type> getMGroup();

} // RotorcraftMassGroupLevel1Type
