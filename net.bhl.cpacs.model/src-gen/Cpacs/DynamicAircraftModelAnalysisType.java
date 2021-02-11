/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Aircraft Model Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DynamicAircraftModelAnalysisType#getTopologyEntries <em>Topology Entries</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDynamicAircraftModelAnalysisType()
 * @model extendedMetaData="name='dynamicAircraftModelAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface DynamicAircraftModelAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Topology Entries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Entries</em>' containment reference.
	 * @see #setTopologyEntries(TopologyEntriesType)
	 * @see Cpacs.CpacsPackage#getDynamicAircraftModelAnalysisType_TopologyEntries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topologyEntries' namespace='##targetNamespace'"
	 * @generated
	 */
	TopologyEntriesType getTopologyEntries();

	/**
	 * Sets the value of the '{@link Cpacs.DynamicAircraftModelAnalysisType#getTopologyEntries <em>Topology Entries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Entries</em>' containment reference.
	 * @see #getTopologyEntries()
	 * @generated
	 */
	void setTopologyEntries(TopologyEntriesType value);

} // DynamicAircraftModelAnalysisType
