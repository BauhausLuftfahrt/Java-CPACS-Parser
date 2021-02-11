/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Walls Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WallsType#getWallPositions <em>Wall Positions</em>}</li>
 *   <li>{@link Cpacs.WallsType#getWallSegments <em>Wall Segments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWallsType()
 * @model extendedMetaData="name='wallsType' kind='elementOnly'"
 * @generated
 */
public interface WallsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wall Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Definition of wall positions to place
	 *                                 walls inside fuselage.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wall Positions</em>' containment reference.
	 * @see #setWallPositions(WallPositionsType)
	 * @see Cpacs.CpacsPackage#getWallsType_WallPositions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wallPositions' namespace='##targetNamespace'"
	 * @generated
	 */
	WallPositionsType getWallPositions();

	/**
	 * Sets the value of the '{@link Cpacs.WallsType#getWallPositions <em>Wall Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Positions</em>' containment reference.
	 * @see #getWallPositions()
	 * @generated
	 */
	void setWallPositions(WallPositionsType value);

	/**
	 * Returns the value of the '<em><b>Wall Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 List of wall segments.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wall Segments</em>' containment reference.
	 * @see #setWallSegments(WallSegmentsType)
	 * @see Cpacs.CpacsPackage#getWallsType_WallSegments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wallSegments' namespace='##targetNamespace'"
	 * @generated
	 */
	WallSegmentsType getWallSegments();

	/**
	 * Sets the value of the '{@link Cpacs.WallsType#getWallSegments <em>Wall Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Segments</em>' containment reference.
	 * @see #getWallSegments()
	 * @generated
	 */
	void setWallSegments(WallSegmentsType value);

} // WallsType
