/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Performances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointPerformancesType#getPointPerformance <em>Point Performance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointPerformancesType()
 * @model extendedMetaData="name='pointPerformancesType' kind='elementOnly'"
 * @generated
 */
public interface PointPerformancesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point Performance</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PointPerformanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Performance</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPointPerformancesType_PointPerformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointPerformanceType> getPointPerformance();

} // PointPerformancesType
