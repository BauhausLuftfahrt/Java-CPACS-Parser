/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Rib Cross Section Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingRibCrossSectionType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.WingRibCrossSectionType#getRibRotation <em>Rib Rotation</em>}</li>
 *   <li>{@link Cpacs.WingRibCrossSectionType#getRibCell <em>Rib Cell</em>}</li>
 *   <li>{@link Cpacs.WingRibCrossSectionType#getUpperCap <em>Upper Cap</em>}</li>
 *   <li>{@link Cpacs.WingRibCrossSectionType#getLowerCap <em>Lower Cap</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingRibCrossSectionType()
 * @model extendedMetaData="name='wingRibCrossSectionType' kind='elementOnly'"
 * @generated
 */
public interface WingRibCrossSectionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orthotropyDirection is defined as rotation
	 *                                 around the ribs z-axis. The rib coordinate system is defined as
	 *                                 follows: x-axis is from leading to trailingeEdge of the
	 *                                 componentSegment in the direction of the rib elongation. z-axis
	 *                                 is normal to the rib in the direction of positive eta. y is
	 *                                 defined by right hand rule. Rotation is around the z-axis. Zero
	 *                                 degrees are at the x-axis positive direction.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getWingRibCrossSectionType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCrossSectionType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Rib Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WING: The Rotation along the x describes a
	 *                                 rotation around a line, that is defined by the intersection of
	 *                                 the rib with the wing middle plane (orientated from leading to
	 *                                 trailing edge). This angle defaults to 90° which means, that the
	 *                                 rib is perpendicular on the wings middle plane. The rotation
	 *                                 angle is defined at the intersection point of the rib with the
	 *                                 ribReference line. The rib itself is allways straight and not
	 *                                 twisted. PYLON: The Rotation along the z describes a rotation
	 *                                 around the pylons z-axis (= rotation in top view). This angle
	 *                                 defaults to 90° which means, that the rib is perpendicular to
	 *                                 the pylons x-axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #setRibRotation(PointXType)
	 * @see Cpacs.CpacsPackage#getWingRibCrossSectionType_RibRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXType getRibRotation();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCrossSectionType#getRibRotation <em>Rib Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #getRibRotation()
	 * @generated
	 */
	void setRibRotation(PointXType value);

	/**
	 * Returns the value of the '<em><b>Rib Cell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rib Cell</em>' containment reference.
	 * @see #setRibCell(WingRibCellType)
	 * @see Cpacs.CpacsPackage#getWingRibCrossSectionType_RibCell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribCell' namespace='##targetNamespace'"
	 * @generated
	 */
	WingRibCellType getRibCell();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCrossSectionType#getRibCell <em>Rib Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Cell</em>' containment reference.
	 * @see #getRibCell()
	 * @generated
	 */
	void setRibCell(WingRibCellType value);

	/**
	 * Returns the value of the '<em><b>Upper Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Cap</em>' containment reference.
	 * @see #setUpperCap(CapType)
	 * @see Cpacs.CpacsPackage#getWingRibCrossSectionType_UpperCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getUpperCap();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCrossSectionType#getUpperCap <em>Upper Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Cap</em>' containment reference.
	 * @see #getUpperCap()
	 * @generated
	 */
	void setUpperCap(CapType value);

	/**
	 * Returns the value of the '<em><b>Lower Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Cap</em>' containment reference.
	 * @see #setLowerCap(CapType)
	 * @see Cpacs.CpacsPackage#getWingRibCrossSectionType_LowerCap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lowerCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getLowerCap();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCrossSectionType#getLowerCap <em>Lower Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Cap</em>' containment reference.
	 * @see #getLowerCap()
	 * @generated
	 */
	void setLowerCap(CapType value);

} // WingRibCrossSectionType
