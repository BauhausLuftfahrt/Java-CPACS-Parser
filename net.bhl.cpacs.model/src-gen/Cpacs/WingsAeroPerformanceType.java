/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wings Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingsAeroPerformanceType#getWingAeroPerformance <em>Wing Aero Performance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingsAeroPerformanceType()
 * @model extendedMetaData="name='wingsAeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface WingsAeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Aero Performance</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingAeroPerformanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Aero Performance</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingsAeroPerformanceType_WingAeroPerformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingAeroPerformanceType> getWingAeroPerformance();

} // WingsAeroPerformanceType
