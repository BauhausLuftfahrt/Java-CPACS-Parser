/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DesignParameterType#getParameterUID <em>Parameter UID</em>}</li>
 *   <li>{@link Cpacs.DesignParameterType#getValues <em>Values</em>}</li>
 *   <li>{@link Cpacs.DesignParameterType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDesignParameterType()
 * @model extendedMetaData="name='designParameterType' kind='elementOnly'"
 * @generated
 */
public interface DesignParameterType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parameter UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter UID</em>' containment reference.
	 * @see #setParameterUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDesignParameterType_ParameterUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameterUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParameterUID();

	/**
	 * Sets the value of the '{@link Cpacs.DesignParameterType#getParameterUID <em>Parameter UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getDesignParameterType_Values()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='values' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getValues();

	/**
	 * Sets the value of the '{@link Cpacs.DesignParameterType#getValues <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values</em>' containment reference.
	 * @see #getValues()
	 * @generated
	 */
	void setValues(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDesignParameterType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DesignParameterType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DesignParameterType
