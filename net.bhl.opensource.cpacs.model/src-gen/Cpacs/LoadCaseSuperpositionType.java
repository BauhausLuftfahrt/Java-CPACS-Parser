/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Superposition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseSuperpositionType#getLoadCaseUID <em>Load Case UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseSuperpositionType()
 * @model extendedMetaData="name='loadCaseSuperpositionType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseSuperpositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Case UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID reference to another load case to be superimposed
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Case UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadCaseSuperpositionType_LoadCaseUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadCaseUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getLoadCaseUID();

} // LoadCaseSuperpositionType
