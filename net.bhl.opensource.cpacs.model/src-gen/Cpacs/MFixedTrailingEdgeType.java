/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFixed Trailing Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFixedTrailingEdgeType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFixedTrailingEdgeType#getMPanelsAndFalsework <em>MPanels And Falsework</em>}</li>
 *   <li>{@link Cpacs.MFixedTrailingEdgeType#getMControlSurfaceSupports <em>MControl Surface Supports</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFixedTrailingEdgeType()
 * @model extendedMetaData="name='mFixedTrailingEdgeType' kind='elementOnly'"
 * @generated
 */
public interface MFixedTrailingEdgeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFixedTrailingEdgeType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFixedTrailingEdgeType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MPanels And Falsework</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPanels And Falsework</em>' containment reference.
	 * @see #setMPanelsAndFalsework(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMFixedTrailingEdgeType_MPanelsAndFalsework()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPanelsAndFalsework' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMPanelsAndFalsework();

	/**
	 * Sets the value of the '{@link Cpacs.MFixedTrailingEdgeType#getMPanelsAndFalsework <em>MPanels And Falsework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPanels And Falsework</em>' containment reference.
	 * @see #getMPanelsAndFalsework()
	 * @generated
	 */
	void setMPanelsAndFalsework(SingleGenericMassType value);

	/**
	 * Returns the value of the '<em><b>MControl Surface Supports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MControl Surface Supports</em>' containment reference.
	 * @see #setMControlSurfaceSupports(MControlSurfaceSupportsType)
	 * @see Cpacs.CpacsPackage#getMFixedTrailingEdgeType_MControlSurfaceSupports()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mControlSurfaceSupports' namespace='##targetNamespace'"
	 * @generated
	 */
	MControlSurfaceSupportsType getMControlSurfaceSupports();

	/**
	 * Sets the value of the '{@link Cpacs.MFixedTrailingEdgeType#getMControlSurfaceSupports <em>MControl Surface Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MControl Surface Supports</em>' containment reference.
	 * @see #getMControlSurfaceSupports()
	 * @generated
	 */
	void setMControlSurfaceSupports(MControlSurfaceSupportsType value);

} // MFixedTrailingEdgeType
