/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Load Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightLoadDataType#getNodalLoadSets <em>Nodal Load Sets</em>}</li>
 *   <li>{@link Cpacs.FlightLoadDataType#getCutLoadSets <em>Cut Load Sets</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightLoadDataType()
 * @model extendedMetaData="name='flightLoadDataType' kind='elementOnly'"
 * @generated
 */
public interface FlightLoadDataType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nodal Load Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodal Load Sets</em>' containment reference.
	 * @see #setNodalLoadSets(LoadSetsType)
	 * @see Cpacs.CpacsPackage#getFlightLoadDataType_NodalLoadSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodalLoadSets' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadSetsType getNodalLoadSets();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadDataType#getNodalLoadSets <em>Nodal Load Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodal Load Sets</em>' containment reference.
	 * @see #getNodalLoadSets()
	 * @generated
	 */
	void setNodalLoadSets(LoadSetsType value);

	/**
	 * Returns the value of the '<em><b>Cut Load Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Load Sets</em>' containment reference.
	 * @see #setCutLoadSets(LoadSetsType)
	 * @see Cpacs.CpacsPackage#getFlightLoadDataType_CutLoadSets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutLoadSets' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadSetsType getCutLoadSets();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadDataType#getCutLoadSets <em>Cut Load Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Load Sets</em>' containment reference.
	 * @see #getCutLoadSets()
	 * @generated
	 */
	void setCutLoadSets(LoadSetsType value);

} // FlightLoadDataType
