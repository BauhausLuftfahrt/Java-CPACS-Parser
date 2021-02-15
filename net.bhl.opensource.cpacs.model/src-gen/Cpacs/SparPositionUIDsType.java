/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Position UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparPositionUIDsType#getSparPositionUID <em>Spar Position UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparPositionUIDsType()
 * @model extendedMetaData="name='sparPositionUIDsType' kind='elementOnly'"
 * @generated
 */
public interface SparPositionUIDsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Position UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of spar position uIDs.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spar Position UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSparPositionUIDsType_SparPositionUID()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='sparPositionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getSparPositionUID();

} // SparPositionUIDsType
