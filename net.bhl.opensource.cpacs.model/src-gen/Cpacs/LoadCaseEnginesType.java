/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Engines Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseEnginesType#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseEnginesType()
 * @model extendedMetaData="name='loadCaseEnginesType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseEnginesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.EngineSettingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadCaseEnginesType_Engine()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='engine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EngineSettingType> getEngine();

} // LoadCaseEnginesType
