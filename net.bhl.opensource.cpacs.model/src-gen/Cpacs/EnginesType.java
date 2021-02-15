/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engines Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EnginesType#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEnginesType()
 * @model extendedMetaData="name='enginesType' kind='elementOnly'"
 * @generated
 */
public interface EnginesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.EngineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getEnginesType_Engine()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='engine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EngineType> getEngine();

} // EnginesType
