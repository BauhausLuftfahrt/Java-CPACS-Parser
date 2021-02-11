/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WheelsType#getWheel <em>Wheel</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWheelsType()
 * @model extendedMetaData="name='wheelsType' kind='elementOnly'"
 * @generated
 */
public interface WheelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wheel</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WheelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheel</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWheelsType_Wheel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wheel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WheelType> getWheel();

} // WheelsType
