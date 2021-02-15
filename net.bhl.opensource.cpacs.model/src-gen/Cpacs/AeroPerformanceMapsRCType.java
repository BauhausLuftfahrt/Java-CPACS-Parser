/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Maps RC Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceMapsRCType#getAeroPerformanceMap <em>Aero Performance Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceMapsRCType()
 * @model extendedMetaData="name='aeroPerformanceMapsRCType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceMapsRCType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aero Performance Map</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroPerformanceMapRCType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Performance Map</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapsRCType_AeroPerformanceMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroPerformanceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroPerformanceMapRCType> getAeroPerformanceMap();

} // AeroPerformanceMapsRCType
