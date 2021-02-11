/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Missions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionsType#getMission <em>Mission</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionsType()
 * @model extendedMetaData="name='missionsType' kind='elementOnly'"
 * @generated
 */
public interface MissionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mission</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.MissionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMissionsType_Mission()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mission' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MissionType> getMission();

} // MissionsType
