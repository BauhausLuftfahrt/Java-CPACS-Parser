/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Performance Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointPerformanceDefinitionsType#getPointPerformanceDefinition <em>Point Performance Definition</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionsType()
 * @model extendedMetaData="name='pointPerformanceDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface PointPerformanceDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Point Performance Definition</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PointPerformanceDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Performance Definition</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionsType_PointPerformanceDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointPerformanceDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PointPerformanceDefinitionType> getPointPerformanceDefinition();

} // PointPerformanceDefinitionsType
