/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Increment Maps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapsType#getIncrementMap <em>Increment Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapsType()
 * @model extendedMetaData="name='aeroPerformanceIncrementMapsType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceIncrementMapsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Increment Map</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroPerformanceIncrementMapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Map</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapsType_IncrementMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='incrementMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroPerformanceIncrementMapType> getIncrementMap();

} // AeroPerformanceIncrementMapsType
