/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceType#getAeroMap <em>Aero Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceType()
 * @model extendedMetaData="name='aeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aero Map</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroMapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Map</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroPerformanceType_AeroMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroMapType> getAeroMap();

} // AeroPerformanceType
