/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CompartmentsType#getCompartment <em>Compartment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCompartmentsType()
 * @model extendedMetaData="name='compartmentsType' kind='elementOnly'"
 * @generated
 */
public interface CompartmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CompartmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The compartment defines an enclosed volume within the fuselage. It is defined by a set of border geometries. This could be pressureBulkheads, walls or floors and they are referred by their uIDs. The volume is closed with the fuselage skin. The geometry tool has to check, if the compartment definition gives a closed geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compartment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCompartmentsType_Compartment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='compartment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompartmentType> getCompartment();

} // CompartmentsType
