/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageSegmentType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentType#getFromElementUID <em>From Element UID</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentType#getToElementUID <em>To Element UID</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentType#getGuideCurves <em>Guide Curves</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageSegmentType()
 * @model extendedMetaData="name='fuselageSegmentType' kind='elementOnly'"
 * @generated
 */
public interface FuselageSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of fuselage segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of fuselage segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>From Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to element from which the segment
	 *                                 shall start
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Element UID</em>' containment reference.
	 * @see #setFromElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentType_FromElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentType#getFromElementUID <em>From Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element UID</em>' containment reference.
	 * @see #getFromElementUID()
	 * @generated
	 */
	void setFromElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>To Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to element at which the segment
	 *                                 shall end
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Element UID</em>' containment reference.
	 * @see #setToElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentType_ToElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentType#getToElementUID <em>To Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element UID</em>' containment reference.
	 * @see #getToElementUID()
	 * @generated
	 */
	void setToElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Guide Curves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional and additional guidecurves to shape
	 *                                 the outer geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guide Curves</em>' containment reference.
	 * @see #setGuideCurves(GuideCurvesType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentType_GuideCurves()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guideCurves' namespace='##targetNamespace'"
	 * @generated
	 */
	GuideCurvesType getGuideCurves();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentType#getGuideCurves <em>Guide Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Curves</em>' containment reference.
	 * @see #getGuideCurves()
	 * @generated
	 */
	void setGuideCurves(GuideCurvesType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FuselageSegmentType
