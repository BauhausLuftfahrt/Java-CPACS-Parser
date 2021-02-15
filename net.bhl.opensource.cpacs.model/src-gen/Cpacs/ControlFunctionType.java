/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlFunctionType#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.ControlFunctionType#getKRate <em>KRate</em>}</li>
 *   <li>{@link Cpacs.ControlFunctionType#getKRateI <em>KRate I</em>}</li>
 *   <li>{@link Cpacs.ControlFunctionType#getKAngle <em>KAngle</em>}</li>
 *   <li>{@link Cpacs.ControlFunctionType#getKAngleI <em>KAngle I</em>}</li>
 *   <li>{@link Cpacs.ControlFunctionType#getKAngleRateF1 <em>KAngle Rate F1</em>}</li>
 *   <li>{@link Cpacs.ControlFunctionType#getKAngleRateF2 <em>KAngle Rate F2</em>}</li>
 *   <li>{@link Cpacs.ControlFunctionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlFunctionType()
 * @model extendedMetaData="name='controlFunctionType' kind='elementOnly'"
 * @generated
 */
public interface ControlFunctionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Distributor UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #setControlDistributorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_ControlDistributorUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlDistributorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDistributorUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getControlDistributorUID <em>Control Distributor UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #getControlDistributorUID()
	 * @generated
	 */
	void setControlDistributorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>KRate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KRate</em>' containment reference.
	 * @see #setKRate(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_KRate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kRate' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKRate();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getKRate <em>KRate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KRate</em>' containment reference.
	 * @see #getKRate()
	 * @generated
	 */
	void setKRate(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>KRate I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KRate I</em>' containment reference.
	 * @see #setKRateI(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_KRateI()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kRateI' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKRateI();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getKRateI <em>KRate I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KRate I</em>' containment reference.
	 * @see #getKRateI()
	 * @generated
	 */
	void setKRateI(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>KAngle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KAngle</em>' containment reference.
	 * @see #setKAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_KAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKAngle();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getKAngle <em>KAngle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KAngle</em>' containment reference.
	 * @see #getKAngle()
	 * @generated
	 */
	void setKAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>KAngle I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KAngle I</em>' containment reference.
	 * @see #setKAngleI(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_KAngleI()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kAngleI' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKAngleI();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getKAngleI <em>KAngle I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KAngle I</em>' containment reference.
	 * @see #getKAngleI()
	 * @generated
	 */
	void setKAngleI(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>KAngle Rate F1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KAngle Rate F1</em>' containment reference.
	 * @see #setKAngleRateF1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_KAngleRateF1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kAngleRateF1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKAngleRateF1();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getKAngleRateF1 <em>KAngle Rate F1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KAngle Rate F1</em>' containment reference.
	 * @see #getKAngleRateF1()
	 * @generated
	 */
	void setKAngleRateF1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>KAngle Rate F2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KAngle Rate F2</em>' containment reference.
	 * @see #setKAngleRateF2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_KAngleRateF2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kAngleRateF2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKAngleRateF2();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getKAngleRateF2 <em>KAngle Rate F2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KAngle Rate F2</em>' containment reference.
	 * @see #getKAngleRateF2()
	 * @generated
	 */
	void setKAngleRateF2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getControlFunctionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlFunctionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ControlFunctionType
