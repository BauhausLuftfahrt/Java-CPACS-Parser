/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Aircraft Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DynamicAircraftModelType#getLoadReferenceAxisPoints <em>Load Reference Axis Points</em>}</li>
 *   <li>{@link Cpacs.DynamicAircraftModelType#getDynamicAircraftModelPoints <em>Dynamic Aircraft Model Points</em>}</li>
 *   <li>{@link Cpacs.DynamicAircraftModelType#getCutLoadIntegrationPoints <em>Cut Load Integration Points</em>}</li>
 *   <li>{@link Cpacs.DynamicAircraftModelType#getConnectivities <em>Connectivities</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDynamicAircraftModelType()
 * @model extendedMetaData="name='dynamicAircraftModelType' kind='elementOnly'"
 * @generated
 */
public interface DynamicAircraftModelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Reference Axis Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Reference Axis Points</em>' containment reference.
	 * @see #setLoadReferenceAxisPoints(LoadReferenceAxisPointsType)
	 * @see Cpacs.CpacsPackage#getDynamicAircraftModelType_LoadReferenceAxisPoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadReferenceAxisPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadReferenceAxisPointsType getLoadReferenceAxisPoints();

	/**
	 * Sets the value of the '{@link Cpacs.DynamicAircraftModelType#getLoadReferenceAxisPoints <em>Load Reference Axis Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Reference Axis Points</em>' containment reference.
	 * @see #getLoadReferenceAxisPoints()
	 * @generated
	 */
	void setLoadReferenceAxisPoints(LoadReferenceAxisPointsType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Aircraft Model Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Aircraft Model Points</em>' containment reference.
	 * @see #setDynamicAircraftModelPoints(DynamicAircraftModelPointsType)
	 * @see Cpacs.CpacsPackage#getDynamicAircraftModelType_DynamicAircraftModelPoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicAircraftModelPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicAircraftModelPointsType getDynamicAircraftModelPoints();

	/**
	 * Sets the value of the '{@link Cpacs.DynamicAircraftModelType#getDynamicAircraftModelPoints <em>Dynamic Aircraft Model Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Aircraft Model Points</em>' containment reference.
	 * @see #getDynamicAircraftModelPoints()
	 * @generated
	 */
	void setDynamicAircraftModelPoints(DynamicAircraftModelPointsType value);

	/**
	 * Returns the value of the '<em><b>Cut Load Integration Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Load Integration Points</em>' containment reference.
	 * @see #setCutLoadIntegrationPoints(CutLoadIntegrationPointsType)
	 * @see Cpacs.CpacsPackage#getDynamicAircraftModelType_CutLoadIntegrationPoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutLoadIntegrationPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	CutLoadIntegrationPointsType getCutLoadIntegrationPoints();

	/**
	 * Sets the value of the '{@link Cpacs.DynamicAircraftModelType#getCutLoadIntegrationPoints <em>Cut Load Integration Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Load Integration Points</em>' containment reference.
	 * @see #getCutLoadIntegrationPoints()
	 * @generated
	 */
	void setCutLoadIntegrationPoints(CutLoadIntegrationPointsType value);

	/**
	 * Returns the value of the '<em><b>Connectivities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivities</em>' containment reference.
	 * @see #setConnectivities(ConnectivitiesType)
	 * @see Cpacs.CpacsPackage#getDynamicAircraftModelType_Connectivities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectivities' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectivitiesType getConnectivities();

	/**
	 * Sets the value of the '{@link Cpacs.DynamicAircraftModelType#getConnectivities <em>Connectivities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivities</em>' containment reference.
	 * @see #getConnectivities()
	 * @generated
	 */
	void setConnectivities(ConnectivitiesType value);

} // DynamicAircraftModelType
