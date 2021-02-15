/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StateParameterType#getParameterUID <em>Parameter UID</em>}</li>
 *   <li>{@link Cpacs.StateParameterType#getValues <em>Values</em>}</li>
 *   <li>{@link Cpacs.StateParameterType#getJacobian <em>Jacobian</em>}</li>
 *   <li>{@link Cpacs.StateParameterType#getHessian <em>Hessian</em>}</li>
 *   <li>{@link Cpacs.StateParameterType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStateParameterType()
 * @model extendedMetaData="name='stateParameterType' kind='elementOnly'"
 * @generated
 */
public interface StateParameterType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parameter UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter UID</em>' containment reference.
	 * @see #setParameterUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getStateParameterType_ParameterUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameterUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParameterUID();

	/**
	 * Sets the value of the '{@link Cpacs.StateParameterType#getParameterUID <em>Parameter UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter UID</em>' containment reference.
	 * @see #getParameterUID()
	 * @generated
	 */
	void setParameterUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference.
	 * @see #setValues(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getStateParameterType_Values()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='values' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getValues();

	/**
	 * Sets the value of the '{@link Cpacs.StateParameterType#getValues <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' containment reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Jacobian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jacobian</em>' containment reference.
	 * @see #setJacobian(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getStateParameterType_Jacobian()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='jacobian' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getJacobian();

	/**
	 * Sets the value of the '{@link Cpacs.StateParameterType#getJacobian <em>Jacobian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jacobian</em>' containment reference.
	 * @see #getJacobian()
	 * @generated
	 */
	void setJacobian(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Hessian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hessian</em>' containment reference.
	 * @see #setHessian(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getStateParameterType_Hessian()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hessian' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getHessian();

	/**
	 * Sets the value of the '{@link Cpacs.StateParameterType#getHessian <em>Hessian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hessian</em>' containment reference.
	 * @see #getHessian()
	 * @generated
	 */
	void setHessian(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStateParameterType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StateParameterType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StateParameterType
