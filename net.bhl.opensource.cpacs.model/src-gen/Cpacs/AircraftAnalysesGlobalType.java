/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Analyses Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AircraftAnalysesGlobalType#getLoadApplicationPointSets <em>Load Application Point Sets</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAircraftAnalysesGlobalType()
 * @model extendedMetaData="name='aircraftAnalysesGlobalType' kind='elementOnly'"
 * @generated
 */
public interface AircraftAnalysesGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Application Point Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Application Point Sets</em>' containment reference.
	 * @see #setLoadApplicationPointSets(LoadApplicationPointSetsType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesGlobalType_LoadApplicationPointSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadApplicationPointSets' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadApplicationPointSetsType getLoadApplicationPointSets();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesGlobalType#getLoadApplicationPointSets <em>Load Application Point Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Application Point Sets</em>' containment reference.
	 * @see #getLoadApplicationPointSets()
	 * @generated
	 */
	void setLoadApplicationPointSets(LoadApplicationPointSetsType value);

} // AircraftAnalysesGlobalType
