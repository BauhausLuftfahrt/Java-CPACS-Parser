/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Performance Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpecificPerformanceMapType#getPerformanceMapUID <em>Performance Map UID</em>}</li>
 *   <li>{@link Cpacs.SpecificPerformanceMapType#getSegmentUIDs <em>Segment UI Ds</em>}</li>
 *   <li>{@link Cpacs.SpecificPerformanceMapType#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}</li>
 *   <li>{@link Cpacs.SpecificPerformanceMapType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpecificPerformanceMapType()
 * @model extendedMetaData="name='specificPerformanceMapType' kind='elementOnly'"
 * @generated
 */
public interface SpecificPerformanceMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Performance Map UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of performance map to be used for mission segments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performance Map UID</em>' containment reference.
	 * @see #setPerformanceMapUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificPerformanceMapType_PerformanceMapUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='performanceMapUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPerformanceMapUID();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificPerformanceMapType#getPerformanceMapUID <em>Performance Map UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Map UID</em>' containment reference.
	 * @see #getPerformanceMapUID()
	 * @generated
	 */
	void setPerformanceMapUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Segment UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of all mission segment UIDs to which the performance map is to be applied
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UI Ds</em>' containment reference.
	 * @see #setSegmentUIDs(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificPerformanceMapType_SegmentUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='segmentUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getSegmentUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificPerformanceMapType#getSegmentUIDs <em>Segment UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UI Ds</em>' containment reference.
	 * @see #getSegmentUIDs()
	 * @generated
	 */
	void setSegmentUIDs(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Point Performance UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of point performance UIDs to which the  performance map is to be applied
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Performance UI Ds</em>' containment reference.
	 * @see #setPointPerformanceUIDs(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificPerformanceMapType_PointPerformanceUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointPerformanceUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getPointPerformanceUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificPerformanceMapType#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Performance UI Ds</em>' containment reference.
	 * @see #getPointPerformanceUIDs()
	 * @generated
	 */
	void setPointPerformanceUIDs(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSpecificPerformanceMapType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificPerformanceMapType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SpecificPerformanceMapType
