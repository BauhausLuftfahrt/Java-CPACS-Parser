/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall Positions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of wall positions to place walls inside fuselage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WallPositionsType#getWallPosition <em>Wall Position</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWallPositionsType()
 * @model extendedMetaData="name='wallPositionsType' kind='elementOnly'"
 * @generated
 */
public interface WallPositionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wall Position</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WallPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wall position definition specifying a point in the fuselage to be connected to a wall segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wall Position</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWallPositionsType_WallPosition()
	 * @model containment="true" lower="2"
	 *        extendedMetaData="kind='element' name='wallPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WallPositionType> getWallPosition();

} // WallPositionsType
