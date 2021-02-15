/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoorsType#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoorsType()
 * @model extendedMetaData="name='doorsType' kind='elementOnly'"
 * @generated
 */
public interface DoorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Door</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DoorCutOutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDoorsType_Door()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='door' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DoorCutOutType> getDoor();

} // DoorsType
