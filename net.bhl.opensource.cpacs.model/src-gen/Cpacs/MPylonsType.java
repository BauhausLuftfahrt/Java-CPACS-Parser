/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPylons Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MPylonsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MPylonsType#getMPylon <em>MPylon</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMPylonsType()
 * @model extendedMetaData="name='mPylonsType' kind='elementOnly'"
 * @generated
 */
public interface MPylonsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Pylons mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMPylonsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MPylonsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MPylon</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SingleGenericMassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPylon</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMPylonsType_MPylon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPylon' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SingleGenericMassType> getMPylon();

} // MPylonsType
