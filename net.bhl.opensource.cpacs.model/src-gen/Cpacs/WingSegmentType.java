/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingSegmentType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.WingSegmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.WingSegmentType#getFromElementUID <em>From Element UID</em>}</li>
 *   <li>{@link Cpacs.WingSegmentType#getToElementUID <em>To Element UID</em>}</li>
 *   <li>{@link Cpacs.WingSegmentType#getGuideCurves <em>Guide Curves</em>}</li>
 *   <li>{@link Cpacs.WingSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingSegmentType()
 * @model extendedMetaData="name='wingSegmentType' kind='elementOnly'"
 * @generated
 */
public interface WingSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of wing the wing segment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingSegmentType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentType#getName <em>Name</em>}' containment reference.
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
	 * Description of the wing segment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingSegmentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentType#getDescription <em>Description</em>}' containment reference.
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
	 * Reference to the element from which the
	 *                                 segment shall start.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Element UID</em>' containment reference.
	 * @see #setFromElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingSegmentType_FromElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentType#getFromElementUID <em>From Element UID</em>}' containment reference.
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
	 * Reference to the element at which the segment
	 *                                 shall end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Element UID</em>' containment reference.
	 * @see #setToElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingSegmentType_ToElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentType#getToElementUID <em>To Element UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingSegmentType_GuideCurves()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guideCurves' namespace='##targetNamespace'"
	 * @generated
	 */
	GuideCurvesType getGuideCurves();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentType#getGuideCurves <em>Guide Curves</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingSegmentType
