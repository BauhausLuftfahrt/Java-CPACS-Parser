/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Fleets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SubFleetsType#getSubFleet <em>Sub Fleet</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSubFleetsType()
 * @model extendedMetaData="name='subFleetsType' kind='elementOnly'"
 * @generated
 */
public interface SubFleetsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sub Fleet</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SubFleetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Fleet</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSubFleetsType_SubFleet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subFleet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubFleetType> getSubFleet();

} // SubFleetsType
