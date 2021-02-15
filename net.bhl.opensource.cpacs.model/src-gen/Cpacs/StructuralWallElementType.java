/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Wall Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StructuralWallElementType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.StructuralWallElementType#getLongitudinalReinforcements <em>Longitudinal Reinforcements</em>}</li>
 *   <li>{@link Cpacs.StructuralWallElementType#getLateralReinforcements <em>Lateral Reinforcements</em>}</li>
 *   <li>{@link Cpacs.StructuralWallElementType#getInnerLongitudinalCap <em>Inner Longitudinal Cap</em>}</li>
 *   <li>{@link Cpacs.StructuralWallElementType#getOuterLongitudinalCap <em>Outer Longitudinal Cap</em>}</li>
 *   <li>{@link Cpacs.StructuralWallElementType#getLateralCaps <em>Lateral Caps</em>}</li>
 *   <li>{@link Cpacs.StructuralWallElementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStructuralWallElementType()
 * @model extendedMetaData="name='structuralWallElementType' kind='elementOnly'"
 * @generated
 */
public interface StructuralWallElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a sheet element definition specifying the physical properties of the wall's shell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralWallElementType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralWallElementType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #getSheetElementUID()
	 * @generated
	 */
	void setSheetElementUID(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Longitudinal Reinforcements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reinforcements running along the position polygon of the wall positions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitudinal Reinforcements</em>' containment reference.
	 * @see #setLongitudinalReinforcements(WingStringerType)
	 * @see Cpacs.CpacsPackage#getStructuralWallElementType_LongitudinalReinforcements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longitudinalReinforcements' namespace='##targetNamespace'"
	 * @generated
	 */
	WingStringerType getLongitudinalReinforcements();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralWallElementType#getLongitudinalReinforcements <em>Longitudinal Reinforcements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Reinforcements</em>' containment reference.
	 * @see #getLongitudinalReinforcements()
	 * @generated
	 */
	void setLongitudinalReinforcements(WingStringerType value);

	/**
	 * Returns the value of the '<em><b>Lateral Reinforcements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reinforcements running in lateral/radial direction in the wall segment plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lateral Reinforcements</em>' containment reference.
	 * @see #setLateralReinforcements(WingStringerType)
	 * @see Cpacs.CpacsPackage#getStructuralWallElementType_LateralReinforcements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lateralReinforcements' namespace='##targetNamespace'"
	 * @generated
	 */
	WingStringerType getLateralReinforcements();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralWallElementType#getLateralReinforcements <em>Lateral Reinforcements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lateral Reinforcements</em>' containment reference.
	 * @see #getLateralReinforcements()
	 * @generated
	 */
	void setLateralReinforcements(WingStringerType value);

	/**
	 * Returns the value of the '<em><b>Inner Longitudinal Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reinforcement at inner side of wall. This is either, depending on the extrusion direction flag, the edge of the wall that connects the positions ("positiveDirection") or the edge of the wall where the wall intersects with the fuselage skin in the opposite direction of the extrusion direction.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Longitudinal Cap</em>' containment reference.
	 * @see #setInnerLongitudinalCap(CapType)
	 * @see Cpacs.CpacsPackage#getStructuralWallElementType_InnerLongitudinalCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerLongitudinalCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getInnerLongitudinalCap();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralWallElementType#getInnerLongitudinalCap <em>Inner Longitudinal Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Longitudinal Cap</em>' containment reference.
	 * @see #getInnerLongitudinalCap()
	 * @generated
	 */
	void setInnerLongitudinalCap(CapType value);

	/**
	 * Returns the value of the '<em><b>Outer Longitudinal Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reinforcement at outer side of wall. The outer side of the wall is defined as the edge of the wall at the intersection of the wall with the fuselage skin running along the main direction of the wall.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer Longitudinal Cap</em>' containment reference.
	 * @see #setOuterLongitudinalCap(CapType)
	 * @see Cpacs.CpacsPackage#getStructuralWallElementType_OuterLongitudinalCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outerLongitudinalCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getOuterLongitudinalCap();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralWallElementType#getOuterLongitudinalCap <em>Outer Longitudinal Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Longitudinal Cap</em>' containment reference.
	 * @see #getOuterLongitudinalCap()
	 * @generated
	 */
	void setOuterLongitudinalCap(CapType value);

	/**
	 * Returns the value of the '<em><b>Lateral Caps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Lateral caps are the reinforcements of
	 *                                 the wall at the edges lateral to the
	 *                                 main direction of the wall. These caps
	 *                                 can be either defined at start, end,
	 *                                 start and end or at all wall positions
	 *                                 according to the placement flag.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lateral Caps</em>' containment reference.
	 * @see #setLateralCaps(LateralCapType)
	 * @see Cpacs.CpacsPackage#getStructuralWallElementType_LateralCaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lateralCaps' namespace='##targetNamespace'"
	 * @generated
	 */
	LateralCapType getLateralCaps();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralWallElementType#getLateralCaps <em>Lateral Caps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lateral Caps</em>' containment reference.
	 * @see #getLateralCaps()
	 * @generated
	 */
	void setLateralCaps(LateralCapType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStructuralWallElementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralWallElementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StructuralWallElementType
