/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airfoils Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AirfoilsAeroPerformanceType#getAirfoilAeroPerformance <em>Airfoil Aero Performance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAirfoilsAeroPerformanceType()
 * @model extendedMetaData="name='airfoilsAeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface AirfoilsAeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Airfoil Aero Performance</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AirfoilAeroPerformanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airfoil Aero Performance</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAirfoilsAeroPerformanceType_AirfoilAeroPerformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='airfoilAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AirfoilAeroPerformanceType> getAirfoilAeroPerformance();

} // AirfoilsAeroPerformanceType
