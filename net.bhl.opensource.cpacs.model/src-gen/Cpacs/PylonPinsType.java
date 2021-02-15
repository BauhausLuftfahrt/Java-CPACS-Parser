/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Pins Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonPinsType#getPylonPin <em>Pylon Pin</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonPinsType()
 * @model extendedMetaData="name='pylonPinsType' kind='elementOnly'"
 * @generated
 */
public interface PylonPinsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pylon Pin</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PylonPinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pylon Pin</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPylonPinsType_PylonPin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pylonPin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PylonPinType> getPylonPin();

} // PylonPinsType
