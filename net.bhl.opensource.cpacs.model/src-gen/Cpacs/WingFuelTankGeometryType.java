/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Fuel Tank Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingFuelTankGeometryType#getBorder <em>Border</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingFuelTankGeometryType()
 * @model extendedMetaData="name='wingFuelTankGeometryType' kind='elementOnly'"
 * @generated
 */
public interface WingFuelTankGeometryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Border</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingFuelTankBorderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingFuelTankGeometryType_Border()
	 * @model containment="true" lower="3"
	 *        extendedMetaData="kind='element' name='border' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingFuelTankBorderType> getBorder();

} // WingFuelTankGeometryType
