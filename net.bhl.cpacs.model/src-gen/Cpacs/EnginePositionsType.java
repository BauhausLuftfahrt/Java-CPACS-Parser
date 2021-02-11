/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Positions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EnginePositionsType#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEnginePositionsType()
 * @model extendedMetaData="name='enginePositionsType' kind='elementOnly'"
 * @generated
 */
public interface EnginePositionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.EnginePositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getEnginePositionsType_Engine()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='engine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnginePositionType> getEngine();

} // EnginePositionsType
