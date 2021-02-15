/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectivities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ConnectivitiesType#getConnectivity <em>Connectivity</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getConnectivitiesType()
 * @model extendedMetaData="name='connectivitiesType' kind='elementOnly'"
 * @generated
 */
public interface ConnectivitiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Connectivity</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ConnectivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivity</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getConnectivitiesType_Connectivity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='connectivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConnectivityType> getConnectivity();

} // ConnectivitiesType
