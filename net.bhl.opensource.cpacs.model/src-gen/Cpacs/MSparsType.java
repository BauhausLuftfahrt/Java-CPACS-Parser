/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSpars Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MSparsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MSparsType#getMSpar <em>MSpar</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMSparsType()
 * @model extendedMetaData="name='mSparsType' kind='elementOnly'"
 * @generated
 */
public interface MSparsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMSparsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MSparsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSpar</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MSparType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpar</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMSparsType_MSpar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSpar' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MSparType> getMSpar();

} // MSparsType
