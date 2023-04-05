/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Application Point Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadApplicationPointSetType#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointSetType#getLoadReferenceLine <em>Load Reference Line</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointSetType#getLoadApplicationPoints <em>Load Application Points</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointSetType#getCutLoadIntegrationPoints <em>Cut Load Integration Points</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointSetType#getConnectivities <em>Connectivities</em>}</li>
 *   <li>{@link Cpacs.LoadApplicationPointSetType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetType()
 * @model extendedMetaData="name='loadApplicationPointSetType' kind='elementOnly'"
 * @generated
 */
public interface LoadApplicationPointSetType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Component UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     UID of a wing, fuselage or control surface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component UID</em>' containment reference.
	 * @see #setComponentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetType_ComponentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getComponentUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointSetType#getComponentUID <em>Component UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component UID</em>' containment reference.
	 * @see #getComponentUID()
	 * @generated
	 */
	void setComponentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Reference Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Reference axis (line) for load distribution
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Reference Line</em>' containment reference.
	 * @see #setLoadReferenceLine(LoadReferenceLineType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetType_LoadReferenceLine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadReferenceLine' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadReferenceLineType getLoadReferenceLine();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointSetType#getLoadReferenceLine <em>Load Reference Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Reference Line</em>' containment reference.
	 * @see #getLoadReferenceLine()
	 * @generated
	 */
	void setLoadReferenceLine(LoadReferenceLineType value);

	/**
	 * Returns the value of the '<em><b>Load Application Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 List of points at which load vectors are
	 *                                 applied to
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Application Points</em>' containment reference.
	 * @see #setLoadApplicationPoints(LoadApplicationPointsType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetType_LoadApplicationPoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadApplicationPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadApplicationPointsType getLoadApplicationPoints();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointSetType#getLoadApplicationPoints <em>Load Application Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Application Points</em>' containment reference.
	 * @see #getLoadApplicationPoints()
	 * @generated
	 */
	void setLoadApplicationPoints(LoadApplicationPointsType value);

	/**
	 * Returns the value of the '<em><b>Cut Load Integration Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     List of points at which cut loads are applied to
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut Load Integration Points</em>' containment reference.
	 * @see #setCutLoadIntegrationPoints(CutLoadPointsType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetType_CutLoadIntegrationPoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutLoadIntegrationPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	CutLoadPointsType getCutLoadIntegrationPoints();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointSetType#getCutLoadIntegrationPoints <em>Cut Load Integration Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Load Integration Points</em>' containment reference.
	 * @see #getCutLoadIntegrationPoints()
	 * @generated
	 */
	void setCutLoadIntegrationPoints(CutLoadPointsType value);

	/**
	 * Returns the value of the '<em><b>Connectivities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Specification of connectivity properties between points
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connectivities</em>' containment reference.
	 * @see #setConnectivities(ConnectivitiesType)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetType_Connectivities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectivities' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectivitiesType getConnectivities();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointSetType#getConnectivities <em>Connectivities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectivities</em>' containment reference.
	 * @see #getConnectivities()
	 * @generated
	 */
	void setConnectivities(ConnectivitiesType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLoadApplicationPointSetType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadApplicationPointSetType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LoadApplicationPointSetType
