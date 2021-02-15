/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Bulkheads Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PressureBulkheadsType#getPressureBulkhead <em>Pressure Bulkhead</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPressureBulkheadsType()
 * @model extendedMetaData="name='pressureBulkheadsType' kind='elementOnly'"
 * @generated
 */
public interface PressureBulkheadsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pressure Bulkhead</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PressureBulkheadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Bulkhead</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPressureBulkheadsType_PressureBulkhead()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pressureBulkhead' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PressureBulkheadType> getPressureBulkhead();

} // PressureBulkheadsType
