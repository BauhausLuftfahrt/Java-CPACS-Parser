/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airlines Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AirlinesType#getAirline <em>Airline</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAirlinesType()
 * @model extendedMetaData="name='airlinesType' kind='elementOnly'"
 * @generated
 */
public interface AirlinesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Airline</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AirlineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airline</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAirlinesType_Airline()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='airline' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AirlineType> getAirline();

} // AirlinesType
