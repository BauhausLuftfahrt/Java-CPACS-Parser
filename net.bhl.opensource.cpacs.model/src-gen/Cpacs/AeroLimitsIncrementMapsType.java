/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Limits Increment Maps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getIncrementMap <em>Increment Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType()
 * @model extendedMetaData="name='aeroLimitsIncrementMapsType' kind='elementOnly'"
 * @generated
 */
public interface AeroLimitsIncrementMapsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Increment Map</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AeroLimitsIncrementMapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Map</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_IncrementMap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='incrementMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AeroLimitsIncrementMapType> getIncrementMap();

} // AeroLimitsIncrementMapsType
