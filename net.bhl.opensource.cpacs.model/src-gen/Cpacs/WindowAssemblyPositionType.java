/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WindowAssemblyPositionType#getWindowElementUID <em>Window Element UID</em>}</li>
 *   <li>{@link Cpacs.WindowAssemblyPositionType#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.WindowAssemblyPositionType#getPositionZ <em>Position Z</em>}</li>
 *   <li>{@link Cpacs.WindowAssemblyPositionType#getAngleX <em>Angle X</em>}</li>
 *   <li>{@link Cpacs.WindowAssemblyPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWindowAssemblyPositionType()
 * @model extendedMetaData="name='windowAssemblyPositionType' kind='elementOnly'"
 * @generated
 */
public interface WindowAssemblyPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Window Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the window element to be used
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Window Element UID</em>' containment reference.
	 * @see #setWindowElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWindowAssemblyPositionType_WindowElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='windowElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWindowElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.WindowAssemblyPositionType#getWindowElementUID <em>Window Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Element UID</em>' containment reference.
	 * @see #getWindowElementUID()
	 * @generated
	 */
	void setWindowElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x position of window element on global x axis
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position X</em>' containment reference.
	 * @see #setPositionX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWindowAssemblyPositionType_PositionX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionX();

	/**
	 * Sets the value of the '{@link Cpacs.WindowAssemblyPositionType#getPositionX <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position X</em>' containment reference.
	 * @see #getPositionX()
	 * @generated
	 */
	void setPositionX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Position Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * z position of window element reference point
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Z</em>' containment reference.
	 * @see #setPositionZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWindowAssemblyPositionType_PositionZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionZ();

	/**
	 * Sets the value of the '{@link Cpacs.WindowAssemblyPositionType#getPositionZ <em>Position Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Z</em>' containment reference.
	 * @see #getPositionZ()
	 * @generated
	 */
	void setPositionZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * angle around global x axis to define window
	 *                                 position with respect to positionX and postionZ
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle X</em>' containment reference.
	 * @see #setAngleX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWindowAssemblyPositionType_AngleX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleX();

	/**
	 * Sets the value of the '{@link Cpacs.WindowAssemblyPositionType#getAngleX <em>Angle X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle X</em>' containment reference.
	 * @see #getAngleX()
	 * @generated
	 */
	void setAngleX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWindowAssemblyPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WindowAssemblyPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WindowAssemblyPositionType
