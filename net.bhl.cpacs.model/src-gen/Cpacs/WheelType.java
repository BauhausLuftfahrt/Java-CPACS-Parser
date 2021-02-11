/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WheelType#getRadius <em>Radius</em>}</li>
 *   <li>{@link Cpacs.WheelType#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.WheelType#getBraked <em>Braked</em>}</li>
 *   <li>{@link Cpacs.WheelType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWheelType()
 * @model extendedMetaData="name='wheelType' kind='elementOnly'"
 * @generated
 */
public interface WheelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Radius of the wheel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius</em>' containment reference.
	 * @see #setRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWheelType_Radius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='radius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRadius();

	/**
	 * Sets the value of the '{@link Cpacs.WheelType#getRadius <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' containment reference.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of the wheel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getWheelType_Width()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getWidth();

	/**
	 * Sets the value of the '{@link Cpacs.WheelType#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Braked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition if the wheel is braked or not. 0 =
	 *                                 not braked; 1 = braked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Braked</em>' containment reference.
	 * @see #setBraked(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getWheelType_Braked()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='braked' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getBraked();

	/**
	 * Sets the value of the '{@link Cpacs.WheelType#getBraked <em>Braked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Braked</em>' containment reference.
	 * @see #getBraked()
	 * @generated
	 */
	void setBraked(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWheelType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WheelType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WheelType
