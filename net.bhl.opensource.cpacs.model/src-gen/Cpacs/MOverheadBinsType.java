/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOverhead Bins Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MOverheadBinsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MOverheadBinsType#getMOverheadBin <em>MOverhead Bin</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMOverheadBinsType()
 * @model extendedMetaData="name='mOverheadBinsType' kind='elementOnly'"
 * @generated
 */
public interface MOverheadBinsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMOverheadBinsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MOverheadBinsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MOverhead Bin</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOverhead Bin</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMOverheadBinsType_MOverheadBin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mOverheadBin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMOverheadBin();

} // MOverheadBinsType
