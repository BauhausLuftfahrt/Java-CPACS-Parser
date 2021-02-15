/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GuideCurveType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getGuideCurveProfileUID <em>Guide Curve Profile UID</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getFromGuideCurveUID <em>From Guide Curve UID</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getFromRelativeCircumference <em>From Relative Circumference</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getTangent <em>Tangent</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getToRelativeCircumference <em>To Relative Circumference</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getTangent1 <em>Tangent1</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getRXDirection <em>RX Direction</em>}</li>
 *   <li>{@link Cpacs.GuideCurveType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGuideCurveType()
 * @model extendedMetaData="name='guideCurveType' kind='elementOnly'"
 * @generated
 */
public interface GuideCurveType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of guide curve
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getName <em>Name</em>}' containment reference.
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
	 * Description of guide curve
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Guide Curve Profile UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a guide curve profile
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guide Curve Profile UID</em>' containment reference.
	 * @see #setGuideCurveProfileUID(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_GuideCurveProfileUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='guideCurveProfileUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getGuideCurveProfileUID();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getGuideCurveProfileUID <em>Guide Curve Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Curve Profile UID</em>' containment reference.
	 * @see #getGuideCurveProfileUID()
	 * @generated
	 */
	void setGuideCurveProfileUID(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>From Guide Curve UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the previous guide curve from
	 *                                         which this guide curve shall start.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Guide Curve UID</em>' containment reference.
	 * @see #setFromGuideCurveUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_FromGuideCurveUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fromGuideCurveUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromGuideCurveUID();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getFromGuideCurveUID <em>From Guide Curve UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Guide Curve UID</em>' containment reference.
	 * @see #getFromGuideCurveUID()
	 * @generated
	 */
	void setFromGuideCurveUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Continuity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuity definition for geometry
	 *                                         generation. Possible options: C0, C1 from previous, C2 from
	 *                                         previous, C1 to previous, C2 to previous
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuity</em>' containment reference.
	 * @see #setContinuity(ContinuityType3)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_Continuity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continuity' namespace='##targetNamespace'"
	 * @generated
	 */
	ContinuityType3 getContinuity();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getContinuity <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuity</em>' containment reference.
	 * @see #getContinuity()
	 * @generated
	 */
	void setContinuity(ContinuityType3 value);

	/**
	 * Returns the value of the '<em><b>From Relative Circumference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the relative circumference
	 *                                         position from which the guide curve shall start. Valid values
	 *                                         are in the interval -1.0...1.0.
	 *                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Relative Circumference</em>' containment reference.
	 * @see #setFromRelativeCircumference(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_FromRelativeCircumference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fromRelativeCircumference' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFromRelativeCircumference();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getFromRelativeCircumference <em>From Relative Circumference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Relative Circumference</em>' containment reference.
	 * @see #getFromRelativeCircumference()
	 * @generated
	 */
	void setFromRelativeCircumference(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tangent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tangent at first point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tangent</em>' containment reference.
	 * @see #setTangent(PointXYZType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_Tangent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tangent' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getTangent();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getTangent <em>Tangent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tangent</em>' containment reference.
	 * @see #getTangent()
	 * @generated
	 */
	void setTangent(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>To Relative Circumference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative circumference
	 *                                     position at which the guide curve shall end. Valid values
	 *                                     are in the interval -1.0...1.0.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Relative Circumference</em>' containment reference.
	 * @see #setToRelativeCircumference(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_ToRelativeCircumference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toRelativeCircumference' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getToRelativeCircumference();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getToRelativeCircumference <em>To Relative Circumference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Relative Circumference</em>' containment reference.
	 * @see #getToRelativeCircumference()
	 * @generated
	 */
	void setToRelativeCircumference(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tangent1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tangent at last point
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tangent1</em>' containment reference.
	 * @see #setTangent1(PointXYZType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_Tangent1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tangent' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getTangent1();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getTangent1 <em>Tangent1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tangent1</em>' containment reference.
	 * @see #getTangent1()
	 * @generated
	 */
	void setTangent1(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>RX Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Local direction along which the relative x-coordinates of
	 *                                     the guide curve points are defined. For the wing the default is
	 *                                     the wing's local x-axis, for the fuselage its the fuselage's local z-axis.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RX Direction</em>' containment reference.
	 * @see #setRXDirection(PointXYZType)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_RXDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rXDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRXDirection();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getRXDirection <em>RX Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RX Direction</em>' containment reference.
	 * @see #getRXDirection()
	 * @generated
	 */
	void setRXDirection(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGuideCurveType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GuideCurveType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GuideCurveType
