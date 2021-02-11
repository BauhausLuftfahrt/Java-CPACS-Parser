/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Cell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingCellType#getSkin <em>Skin</em>}</li>
 *   <li>{@link Cpacs.WingCellType#getStringer <em>Stringer</em>}</li>
 *   <li>{@link Cpacs.WingCellType#getPositioningLeadingEdge <em>Positioning Leading Edge</em>}</li>
 *   <li>{@link Cpacs.WingCellType#getPositioningTrailingEdge <em>Positioning Trailing Edge</em>}</li>
 *   <li>{@link Cpacs.WingCellType#getPositioningInnerBorder <em>Positioning Inner Border</em>}</li>
 *   <li>{@link Cpacs.WingCellType#getPositioningOuterBorder <em>Positioning Outer Border</em>}</li>
 *   <li>{@link Cpacs.WingCellType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingCellType()
 * @model extendedMetaData="name='wingCellType' kind='elementOnly'"
 * @generated
 */
public interface WingCellType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Skin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skin</em>' containment reference.
	 * @see #setSkin(WingSkinType)
	 * @see Cpacs.CpacsPackage#getWingCellType_Skin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='skin' namespace='##targetNamespace'"
	 * @generated
	 */
	WingSkinType getSkin();

	/**
	 * Sets the value of the '{@link Cpacs.WingCellType#getSkin <em>Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skin</em>' containment reference.
	 * @see #getSkin()
	 * @generated
	 */
	void setSkin(WingSkinType value);

	/**
	 * Returns the value of the '<em><b>Stringer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringer</em>' containment reference.
	 * @see #setStringer(WingStringerType)
	 * @see Cpacs.CpacsPackage#getWingCellType_Stringer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stringer' namespace='##targetNamespace'"
	 * @generated
	 */
	WingStringerType getStringer();

	/**
	 * Sets the value of the '{@link Cpacs.WingCellType#getStringer <em>Stringer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringer</em>' containment reference.
	 * @see #getStringer()
	 * @generated
	 */
	void setStringer(WingStringerType value);

	/**
	 * Returns the value of the '<em><b>Positioning Leading Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning Leading Edge</em>' containment reference.
	 * @see #setPositioningLeadingEdge(CellPositioningChordwiseType)
	 * @see Cpacs.CpacsPackage#getWingCellType_PositioningLeadingEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningLeadingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningChordwiseType getPositioningLeadingEdge();

	/**
	 * Sets the value of the '{@link Cpacs.WingCellType#getPositioningLeadingEdge <em>Positioning Leading Edge</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingCellType_PositioningTrailingEdge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningTrailingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningChordwiseType getPositioningTrailingEdge();

	/**
	 * Sets the value of the '{@link Cpacs.WingCellType#getPositioningTrailingEdge <em>Positioning Trailing Edge</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingCellType_PositioningInnerBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningInnerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningSpanwiseType getPositioningInnerBorder();

	/**
	 * Sets the value of the '{@link Cpacs.WingCellType#getPositioningInnerBorder <em>Positioning Inner Border</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingCellType_PositioningOuterBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioningOuterBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	CellPositioningSpanwiseType getPositioningOuterBorder();

	/**
	 * Sets the value of the '{@link Cpacs.WingCellType#getPositioningOuterBorder <em>Positioning Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning Outer Border</em>' containment reference.
	 * @see #getPositioningOuterBorder()
	 * @generated
	 */
	void setPositioningOuterBorder(CellPositioningSpanwiseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingCellType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingCellType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingCellType
