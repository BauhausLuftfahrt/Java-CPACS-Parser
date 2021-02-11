/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Entries Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TopologyEntriesType#getTopologyEntry <em>Topology Entry</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTopologyEntriesType()
 * @model extendedMetaData="name='topologyEntriesType' kind='elementOnly'"
 * @generated
 */
public interface TopologyEntriesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Topology Entry</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TopologyEntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Entry</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTopologyEntriesType_TopologyEntry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='topologyEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TopologyEntryType> getTopologyEntry();

} // TopologyEntriesType
