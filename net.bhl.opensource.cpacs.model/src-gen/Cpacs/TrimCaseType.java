/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trim Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrimCaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.TrimCaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.TrimCaseType#getTrimReqUID <em>Trim Req UID</em>}</li>
 *   <li>{@link Cpacs.TrimCaseType#getTrimResult <em>Trim Result</em>}</li>
 *   <li>{@link Cpacs.TrimCaseType#getLinearModel <em>Linear Model</em>}</li>
 *   <li>{@link Cpacs.TrimCaseType#getLinearModelDescription <em>Linear Model Description</em>}</li>
 *   <li>{@link Cpacs.TrimCaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrimCaseType()
 * @model extendedMetaData="name='trimCaseType' kind='elementOnly'"
 * @generated
 */
public interface TrimCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrimCaseType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.TrimCaseType#getName <em>Name</em>}' containment reference.
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
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrimCaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.TrimCaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Trim Req UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of trim requirement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trim Req UID</em>' containment reference.
	 * @see #setTrimReqUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrimCaseType_TrimReqUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trimReqUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getTrimReqUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrimCaseType#getTrimReqUID <em>Trim Req UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim Req UID</em>' containment reference.
	 * @see #getTrimReqUID()
	 * @generated
	 */
	void setTrimReqUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Trim Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Result</em>' containment reference.
	 * @see #setTrimResult(FlightDynamicsTrimResultType)
	 * @see Cpacs.CpacsPackage#getTrimCaseType_TrimResult()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trimResult' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightDynamicsTrimResultType getTrimResult();

	/**
	 * Sets the value of the '{@link Cpacs.TrimCaseType#getTrimResult <em>Trim Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim Result</em>' containment reference.
	 * @see #getTrimResult()
	 * @generated
	 */
	void setTrimResult(FlightDynamicsTrimResultType value);

	/**
	 * Returns the value of the '<em><b>Linear Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Model</em>' containment reference.
	 * @see #setLinearModel(FlightDynamicsLinearModelType)
	 * @see Cpacs.CpacsPackage#getTrimCaseType_LinearModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linearModel' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightDynamicsLinearModelType getLinearModel();

	/**
	 * Sets the value of the '{@link Cpacs.TrimCaseType#getLinearModel <em>Linear Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Model</em>' containment reference.
	 * @see #getLinearModel()
	 * @generated
	 */
	void setLinearModel(FlightDynamicsLinearModelType value);

	/**
	 * Returns the value of the '<em><b>Linear Model Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the linear model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Model Description</em>' containment reference.
	 * @see #setLinearModelDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrimCaseType_LinearModelDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linearModelDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getLinearModelDescription();

	/**
	 * Sets the value of the '{@link Cpacs.TrimCaseType#getLinearModelDescription <em>Linear Model Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Model Description</em>' containment reference.
	 * @see #getLinearModelDescription()
	 * @generated
	 */
	void setLinearModelDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTrimCaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrimCaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TrimCaseType
