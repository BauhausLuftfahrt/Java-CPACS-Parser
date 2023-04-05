/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPointsType#getFlightPoint <em>Flight Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPointsType()
 * @model extendedMetaData="name='flightPointsType' kind='elementOnly'"
 * @generated
 */
public interface FlightPointsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Point</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GlobalFlightPointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Point</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightPointsType_FlightPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GlobalFlightPointType> getFlightPoint();

} // FlightPointsType
