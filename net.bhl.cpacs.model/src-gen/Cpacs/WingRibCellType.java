/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Rib Cell Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingRibCellType#getFromRib <em>From Rib</em>}</li>
 *   <li>{@link Cpacs.WingRibCellType#getToRib <em>To Rib</em>}</li>
 *   <li>{@link Cpacs.WingRibCellType#getRibRotation <em>Rib Rotation</em>}</li>
 *   <li>{@link Cpacs.WingRibCellType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.WingRibCellType#getUpperCap <em>Upper Cap</em>}</li>
 *   <li>{@link Cpacs.WingRibCellType#getLowerCap <em>Lower Cap</em>}</li>
 *   <li>{@link Cpacs.WingRibCellType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingRibCellType()
 * @model extendedMetaData="name='wingRibCellType' kind='elementOnly'"
 * @generated
 */
public interface WingRibCellType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>From Rib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the beginning of the ribCell. The
	 *                                 enumeration is within the ribSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Rib</em>' containment reference.
	 * @see #setFromRib(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibCellType_FromRib()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromRib' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getFromRib();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCellType#getFromRib <em>From Rib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Rib</em>' containment reference.
	 * @see #getFromRib()
	 * @generated
	 */
	void setFromRib(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>To Rib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the ending of the ribCell. The
	 *                                 enumeration is within the ribSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Rib</em>' containment reference.
	 * @see #setToRib(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingRibCellType_ToRib()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toRib' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getToRib();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCellType#getToRib <em>To Rib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Rib</em>' containment reference.
	 * @see #getToRib()
	 * @generated
	 */
	void setToRib(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * WING: The Rotation along the x describes a
	 *                                 rotation around a line, that is defined by the intersection of
	 *                                 the rib with the wing middle plane (orientated from leading to
	 *                                 trailing edge). This angle defaults to 90° which means, that the
	 *                                 rib is perpendicular on the wings middle plane. PYLON: The
	 *                                 Rotation along the z describes a rotation around the pylons
	 *                                 z-axis (= rotation in top view). This angle defaults to 90°
	 *                                 which means, that the rib is perpendicular to the pylons x-axis.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #setRibRotation(PointXType)
	 * @see Cpacs.CpacsPackage#getWingRibCellType_RibRotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXType getRibRotation();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCellType#getRibRotation <em>Rib Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Rotation</em>' containment reference.
	 * @see #getRibRotation()
	 * @generated
	 */
	void setRibRotation(PointXType value);

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
	 * @see Cpacs.CpacsPackage#getWingRibCellType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCellType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Upper Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Cap</em>' containment reference.
	 * @see #setUpperCap(CapType)
	 * @see Cpacs.CpacsPackage#getWingRibCellType_UpperCap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getUpperCap();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCellType#getUpperCap <em>Upper Cap</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingRibCellType_LowerCap()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerCap' namespace='##targetNamespace'"
	 * @generated
	 */
	CapType getLowerCap();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCellType#getLowerCap <em>Lower Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Cap</em>' containment reference.
	 * @see #getLowerCap()
	 * @generated
	 */
	void setLowerCap(CapType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingRibCellType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingRibCellType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingRibCellType
