/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MULD Contents Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MULDContentsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MULDContentsType#getMULDContent <em>MULD Content</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMULDContentsType()
 * @model extendedMetaData="name='mULDContentsType' kind='elementOnly'"
 * @generated
 */
public interface MULDContentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMULDContentsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MULDContentsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MULD Content</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MULDContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MULD Content</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMULDContentsType_MULDContent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mULDContent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MULDContentType> getMULDContent();

} // MULDContentsType
