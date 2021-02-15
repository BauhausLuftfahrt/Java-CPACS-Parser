/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselages Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselagesAeroPerformanceType#getFuselageAeroPerformance <em>Fuselage Aero Performance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselagesAeroPerformanceType()
 * @model extendedMetaData="name='fuselagesAeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface FuselagesAeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage Aero Performance</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageAeroPerformanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Aero Performance</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselagesAeroPerformanceType_FuselageAeroPerformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageAeroPerformanceType> getFuselageAeroPerformance();

} // FuselagesAeroPerformanceType
