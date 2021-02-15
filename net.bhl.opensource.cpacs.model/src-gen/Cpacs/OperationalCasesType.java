/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OperationalCasesType#getOperationalCase <em>Operational Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOperationalCasesType()
 * @model extendedMetaData="name='operationalCasesType' kind='elementOnly'"
 * @generated
 */
public interface OperationalCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Operational Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.OperationalCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getOperationalCasesType_OperationalCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operationalCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperationalCaseType> getOperationalCase();

} // OperationalCasesType
