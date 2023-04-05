/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Floor Modules Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericFloorModulesType#getGenericFloorModule <em>Generic Floor Module</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericFloorModulesType()
 * @model extendedMetaData="name='genericFloorModulesType' kind='elementOnly'"
 * @generated
 */
public interface GenericFloorModulesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Generic Floor Module</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckComponent2DBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic floor module
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Floor Module</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGenericFloorModulesType_GenericFloorModule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='genericFloorModule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckComponent2DBaseType> getGenericFloorModule();

} // GenericFloorModulesType
