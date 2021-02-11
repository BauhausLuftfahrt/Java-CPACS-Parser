/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Spar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingSparType#getSparPositions <em>Spar Positions</em>}</li>
 *   <li>{@link Cpacs.WingSparType#getSparSegments <em>Spar Segments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingSparType()
 * @model extendedMetaData="name='wingSparType' kind='elementOnly'"
 * @generated
 */
public interface WingSparType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Positions</em>' containment reference.
	 * @see #setSparPositions(SparPositionsType)
	 * @see Cpacs.CpacsPackage#getWingSparType_SparPositions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparPositions' namespace='##targetNamespace'"
	 * @generated
	 */
	SparPositionsType getSparPositions();

	/**
	 * Sets the value of the '{@link Cpacs.WingSparType#getSparPositions <em>Spar Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Positions</em>' containment reference.
	 * @see #getSparPositions()
	 * @generated
	 */
	void setSparPositions(SparPositionsType value);

	/**
	 * Returns the value of the '<em><b>Spar Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Segments</em>' containment reference.
	 * @see #setSparSegments(SparSegmentsType)
	 * @see Cpacs.CpacsPackage#getWingSparType_SparSegments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparSegments' namespace='##targetNamespace'"
	 * @generated
	 */
	SparSegmentsType getSparSegments();

	/**
	 * Sets the value of the '{@link Cpacs.WingSparType#getSparSegments <em>Spar Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Segments</em>' containment reference.
	 * @see #getSparSegments()
	 * @generated
	 */
	void setSparSegments(SparSegmentsType value);

} // WingSparType
