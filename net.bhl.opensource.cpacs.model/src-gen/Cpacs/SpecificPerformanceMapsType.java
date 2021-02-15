/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Performance Maps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpecificPerformanceMapsType#getSpecificPerformanceMap <em>Specific Performance Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpecificPerformanceMapsType()
 * @model extendedMetaData="name='specificPerformanceMapsType' kind='elementOnly'"
 * @generated
 */
public interface SpecificPerformanceMapsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Specific Performance Map</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SpecificPerformanceMapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Performance Map</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSpecificPerformanceMapsType_SpecificPerformanceMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specificPerformanceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecificPerformanceMapType> getSpecificPerformanceMap();

} // SpecificPerformanceMapsType
