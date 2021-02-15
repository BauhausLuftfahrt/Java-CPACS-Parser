/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GroundLoadCasesType#getGroundLoadCase <em>Ground Load Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGroundLoadCasesType()
 * @model extendedMetaData="name='groundLoadCasesType' kind='elementOnly'"
 * @generated
 */
public interface GroundLoadCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ground Load Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GroundLoadCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Load Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGroundLoadCasesType_GroundLoadCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='groundLoadCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GroundLoadCaseType> getGroundLoadCase();

} // GroundLoadCasesType
