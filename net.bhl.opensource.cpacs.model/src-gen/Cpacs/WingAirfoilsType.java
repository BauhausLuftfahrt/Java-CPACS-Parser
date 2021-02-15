/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Airfoils Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingAirfoilsType#getWingAirfoil <em>Wing Airfoil</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingAirfoilsType()
 * @model extendedMetaData="name='wingAirfoilsType' kind='elementOnly'"
 * @generated
 */
public interface WingAirfoilsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Airfoil</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ProfileGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Airfoil</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingAirfoilsType_WingAirfoil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingAirfoil' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProfileGeometryType> getWingAirfoil();

} // WingAirfoilsType
