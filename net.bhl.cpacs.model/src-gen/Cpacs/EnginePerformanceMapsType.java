/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Performance Maps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EnginePerformanceMapsType#getPerformanceMap <em>Performance Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEnginePerformanceMapsType()
 * @model extendedMetaData="name='enginePerformanceMapsType' kind='elementOnly'"
 * @generated
 */
public interface EnginePerformanceMapsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Performance Map</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.EnginePerformanceMapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Map</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapsType_PerformanceMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='performanceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnginePerformanceMapType> getPerformanceMap();

} // EnginePerformanceMapsType
