/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Skin Cut Out Border Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getEtaLE <em>Eta LE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getEtaTE <em>Eta TE</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutBorderType()
 * @model extendedMetaData="name='controlSurfaceSkinCutOutBorderType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceSkinCutOutBorderType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rib Definition UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link to a rib definition
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #setRibDefinitionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutBorderType_RibDefinitionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribDefinitionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRibDefinitionUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getRibDefinitionUID <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #getRibDefinitionUID()
	 * @generated
	 */
	void setRibDefinitionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rib number in the corresponding
	 *                                     ribDefinitionUID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Number</em>' containment reference.
	 * @see #setRibNumber(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutBorderType_RibNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getRibNumber();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getRibNumber <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Number</em>' containment reference.
	 * @see #getRibNumber()
	 * @generated
	 */
	void setRibNumber(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Eta LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spanwise location of the border at the
	 *                                     leading edge of the cut out
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta LE</em>' containment reference.
	 * @see #setEtaLE(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutBorderType_EtaLE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etaLE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaLE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getEtaLE <em>Eta LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta LE</em>' containment reference.
	 * @see #getEtaLE()
	 * @generated
	 */
	void setEtaLE(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Eta TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spanwise location of the border at the
	 *                                     trailing edge of the cut out
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta TE</em>' containment reference.
	 * @see #setEtaTE(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutBorderType_EtaTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etaTE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaTE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceSkinCutOutBorderType#getEtaTE <em>Eta TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta TE</em>' containment reference.
	 * @see #getEtaTE()
	 * @generated
	 */
	void setEtaTE(EtaIsoLineType value);

} // ControlSurfaceSkinCutOutBorderType
