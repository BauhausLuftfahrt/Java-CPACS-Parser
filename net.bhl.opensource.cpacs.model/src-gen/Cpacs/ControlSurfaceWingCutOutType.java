/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Wing Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceWingCutOutType#getUpperSkin <em>Upper Skin</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceWingCutOutType#getLowerSkin <em>Lower Skin</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceWingCutOutType#getCutOutProfileControlPoint <em>Cut Out Profile Control Point</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceWingCutOutType#getCutOutProfiles <em>Cut Out Profiles</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceWingCutOutType#getInnerBorder <em>Inner Border</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceWingCutOutType#getOuterBorder <em>Outer Border</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceWingCutOutType()
 * @model extendedMetaData="name='controlSurfaceWingCutOutType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceWingCutOutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Upper Skin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Skin</em>' containment reference.
	 * @see #setUpperSkin(ControlSurfaceSkinCutOutType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceWingCutOutType_UpperSkin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperSkin' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceSkinCutOutType getUpperSkin();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceWingCutOutType#getUpperSkin <em>Upper Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Skin</em>' containment reference.
	 * @see #getUpperSkin()
	 * @generated
	 */
	void setUpperSkin(ControlSurfaceSkinCutOutType value);

	/**
	 * Returns the value of the '<em><b>Lower Skin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Skin</em>' containment reference.
	 * @see #setLowerSkin(ControlSurfaceSkinCutOutType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceWingCutOutType_LowerSkin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerSkin' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceSkinCutOutType getLowerSkin();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceWingCutOutType#getLowerSkin <em>Lower Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Skin</em>' containment reference.
	 * @see #getLowerSkin()
	 * @generated
	 */
	void setLowerSkin(ControlSurfaceSkinCutOutType value);

	/**
	 * Returns the value of the '<em><b>Cut Out Profile Control Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Out Profile Control Point</em>' containment reference.
	 * @see #setCutOutProfileControlPoint(CutOutControlPointsType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceWingCutOutType_CutOutProfileControlPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutOutProfileControlPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	CutOutControlPointsType getCutOutProfileControlPoint();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceWingCutOutType#getCutOutProfileControlPoint <em>Cut Out Profile Control Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Out Profile Control Point</em>' containment reference.
	 * @see #getCutOutProfileControlPoint()
	 * @generated
	 */
	void setCutOutProfileControlPoint(CutOutControlPointsType value);

	/**
	 * Returns the value of the '<em><b>Cut Out Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Out Profiles</em>' containment reference.
	 * @see #setCutOutProfiles(CutOutProfilesType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceWingCutOutType_CutOutProfiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutOutProfiles' namespace='##targetNamespace'"
	 * @generated
	 */
	CutOutProfilesType getCutOutProfiles();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceWingCutOutType#getCutOutProfiles <em>Cut Out Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Out Profiles</em>' containment reference.
	 * @see #getCutOutProfiles()
	 * @generated
	 */
	void setCutOutProfiles(CutOutProfilesType value);

	/**
	 * Returns the value of the '<em><b>Inner Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Border</em>' containment reference.
	 * @see #setInnerBorder(ControlSurfaceSkinCutOutBorderType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceWingCutOutType_InnerBorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceSkinCutOutBorderType getInnerBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceWingCutOutType#getInnerBorder <em>Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Border</em>' containment reference.
	 * @see #getInnerBorder()
	 * @generated
	 */
	void setInnerBorder(ControlSurfaceSkinCutOutBorderType value);

	/**
	 * Returns the value of the '<em><b>Outer Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Border</em>' containment reference.
	 * @see #setOuterBorder(ControlSurfaceSkinCutOutBorderType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceWingCutOutType_OuterBorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceSkinCutOutBorderType getOuterBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceWingCutOutType#getOuterBorder <em>Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Border</em>' containment reference.
	 * @see #getOuterBorder()
	 * @generated
	 */
	void setOuterBorder(ControlSurfaceSkinCutOutBorderType value);

} // ControlSurfaceWingCutOutType
