/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Intermediate Structure Cell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getPositioningLeadingEdge <em>Positioning Leading Edge</em>}</li>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getPositioningTrailingEdge <em>Positioning Trailing Edge</em>}</li>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getPositioningInnerBorder <em>Positioning Inner Border</em>}</li>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getPositioningOuterBorder <em>Positioning Outer Border</em>}</li>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getRotX <em>Rot X</em>}</li>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getRotZ <em>Rot Z</em>}</li>
 *   <li>{@link Cpacs.WingIntermediateStructureCellType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType()
 * @model extendedMetaData="name='wingIntermediateStructureCellType' kind='elementOnly'"
 * @generated
 */
public interface WingIntermediateStructureCellType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Positioning Leading Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning Leading Edge</em>' containment reference.
	 * @see #setPositioningLeadingEdge(CellPositioningChordwiseType)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_PositioningLeadingEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningLeadingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningChordwiseType getPositioningLeadingEdge();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getPositioningLeadingEdge <em>Positioning Leading Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning Leading Edge</em>' containment reference.
	 * @see #getPositioningLeadingEdge()
	 * @generated
	 */
	void setPositioningLeadingEdge(CellPositioningChordwiseType value);

	/**
	 * Returns the value of the '<em><b>Positioning Trailing Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning Trailing Edge</em>' containment reference.
	 * @see #setPositioningTrailingEdge(CellPositioningChordwiseType)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_PositioningTrailingEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningTrailingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningChordwiseType getPositioningTrailingEdge();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getPositioningTrailingEdge <em>Positioning Trailing Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning Trailing Edge</em>' containment reference.
	 * @see #getPositioningTrailingEdge()
	 * @generated
	 */
	void setPositioningTrailingEdge(CellPositioningChordwiseType value);

	/**
	 * Returns the value of the '<em><b>Positioning Inner Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning Inner Border</em>' containment reference.
	 * @see #setPositioningInnerBorder(CellPositioningSpanwiseType)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_PositioningInnerBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningInnerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningSpanwiseType getPositioningInnerBorder();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getPositioningInnerBorder <em>Positioning Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning Inner Border</em>' containment reference.
	 * @see #getPositioningInnerBorder()
	 * @generated
	 */
	void setPositioningInnerBorder(CellPositioningSpanwiseType value);

	/**
	 * Returns the value of the '<em><b>Positioning Outer Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning Outer Border</em>' containment reference.
	 * @see #setPositioningOuterBorder(CellPositioningSpanwiseType)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_PositioningOuterBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningOuterBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningSpanwiseType getPositioningOuterBorder();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getPositioningOuterBorder <em>Positioning Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning Outer Border</em>' containment reference.
	 * @see #getPositioningOuterBorder()
	 * @generated
	 */
	void setPositioningOuterBorder(CellPositioningSpanwiseType value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the material of the intermediate
	 *                                 structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Rot X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 'rotX' equals a positive rotation around the
	 *                                 wings x-axis, while a rotation of zero is equivalent to the wing
	 *                                 middle plane direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rot X</em>' containment reference.
	 * @see #setRotX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_RotX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotX();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getRotX <em>Rot X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot X</em>' containment reference.
	 * @see #getRotX()
	 * @generated
	 */
	void setRotX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Rot Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 'rotZ' is defined equivalent to the stringer
	 *                                 angle resp. the skin orthotropyDirection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rot Z</em>' containment reference.
	 * @see #setRotZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_RotZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRotZ();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getRotZ <em>Rot Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rot Z</em>' containment reference.
	 * @see #getRotZ()
	 * @generated
	 */
	void setRotZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingIntermediateStructureCellType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingIntermediateStructureCellType
