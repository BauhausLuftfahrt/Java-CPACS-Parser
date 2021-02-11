/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VariableSegmentType#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.VariableSegmentType#getVariableConditions <em>Variable Conditions</em>}</li>
 *   <li>{@link Cpacs.VariableSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVariableSegmentType()
 * @model extendedMetaData="name='variableSegmentType' kind='elementOnly'"
 * @generated
 */
public interface VariableSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * defines uID of the segment having variable conditions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UID</em>' containment reference.
	 * @see #setSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getVariableSegmentType_SegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.VariableSegmentType#getSegmentUID <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID</em>' containment reference.
	 * @see #getSegmentUID()
	 * @generated
	 */
	void setSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Variable Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * defines which condition(s) are variable within the segment (must be one of the defined
	 *                             endConditions for the segmentBlock)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Conditions</em>' containment reference.
	 * @see #setVariableConditions(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getVariableSegmentType_VariableConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='variableConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getVariableConditions();

	/**
	 * Sets the value of the '{@link Cpacs.VariableSegmentType#getVariableConditions <em>Variable Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Conditions</em>' containment reference.
	 * @see #getVariableConditions()
	 * @generated
	 */
	void setVariableConditions(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getVariableSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.VariableSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // VariableSegmentType
