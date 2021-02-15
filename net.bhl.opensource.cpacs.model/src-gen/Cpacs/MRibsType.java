/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRibs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MRibsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MRibsType#getMRib <em>MRib</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMRibsType()
 * @model extendedMetaData="name='mRibsType' kind='elementOnly'"
 * @generated
 */
public interface MRibsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMRibsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MRibsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MRib</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MRibType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRib</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMRibsType_MRib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mRib' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MRibType> getMRib();

} // MRibsType
