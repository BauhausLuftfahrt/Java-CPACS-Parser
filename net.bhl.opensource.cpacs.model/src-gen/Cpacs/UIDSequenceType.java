/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UID Sequence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.UIDSequenceType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getUIDSequenceType()
 * @model extendedMetaData="name='uIDSequenceType' kind='elementOnly'"
 * @generated
 */
public interface UIDSequenceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to a uID
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getUIDSequenceType_UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getUID();

} // UIDSequenceType
