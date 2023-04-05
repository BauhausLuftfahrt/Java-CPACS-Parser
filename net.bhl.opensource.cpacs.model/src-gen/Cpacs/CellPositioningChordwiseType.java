/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell Positioning Chordwise Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CellPositioningChordwiseType#getXsi1 <em>Xsi1</em>}</li>
 *   <li>{@link Cpacs.CellPositioningChordwiseType#getXsi2 <em>Xsi2</em>}</li>
 *   <li>{@link Cpacs.CellPositioningChordwiseType#getSparUID <em>Spar UID</em>}</li>
 *   <li>{@link Cpacs.CellPositioningChordwiseType#getContourCoordinate <em>Contour Coordinate</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCellPositioningChordwiseType()
 * @model extendedMetaData="name='cellPositioningChordwiseType' kind='elementOnly'"
 * @generated
 */
public interface CellPositioningChordwiseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Xsi1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position of the inner end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi1</em>' containment reference.
	 * @see #setXsi1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCellPositioningChordwiseType_Xsi1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsi1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi1();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningChordwiseType#getXsi1 <em>Xsi1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi1</em>' containment reference.
	 * @see #getXsi1()
	 * @generated
	 */
	void setXsi1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position of the outer end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi2</em>' containment reference.
	 * @see #setXsi2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCellPositioningChordwiseType_Xsi2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsi2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi2();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningChordwiseType#getXsi2 <em>Xsi2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi2</em>' containment reference.
	 * @see #getXsi2()
	 * @generated
	 */
	void setXsi2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Spar UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a spar as chordwise border.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spar UID</em>' containment reference.
	 * @see #setSparUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCellPositioningChordwiseType_SparUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSparUID();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningChordwiseType#getSparUID <em>Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar UID</em>' containment reference.
	 * @see #getSparUID()
	 * @generated
	 */
	void setSparUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Contour Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chordwise contour coordinate as chordwise border. 0 equals LE, 1 equals TE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contour Coordinate</em>' containment reference.
	 * @see #setContourCoordinate(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCellPositioningChordwiseType_ContourCoordinate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contourCoordinate' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getContourCoordinate();

	/**
	 * Sets the value of the '{@link Cpacs.CellPositioningChordwiseType#getContourCoordinate <em>Contour Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contour Coordinate</em>' containment reference.
	 * @see #getContourCoordinate()
	 * @generated
	 */
	void setContourCoordinate(DoubleBaseType value);

} // CellPositioningChordwiseType
