/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Joint Positions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackJointPositionsType#getJointPosition <em>Joint Position</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackJointPositionsType()
 * @model extendedMetaData="name='trackJointPositionsType' kind='elementOnly'"
 * @generated
 */
public interface TrackJointPositionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Joint Position</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TrackJointPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint Position</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTrackJointPositionsType_JointPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jointPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrackJointPositionType> getJointPosition();

} // TrackJointPositionsType
