/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Fan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineFanType#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link Cpacs.EngineFanType#getOuterRadius <em>Outer Radius</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineFanType()
 * @model extendedMetaData="name='engineFanType' kind='elementOnly'"
 * @generated
 */
public interface EngineFanType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inner Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inner radius of the fan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Radius</em>' containment reference.
	 * @see #setInnerRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineFanType_InnerRadius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getInnerRadius();

	/**
	 * Sets the value of the '{@link Cpacs.EngineFanType#getInnerRadius <em>Inner Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Radius</em>' containment reference.
	 * @see #getInnerRadius()
	 * @generated
	 */
	void setInnerRadius(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Outer Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outer radius of the fan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer Radius</em>' containment reference.
	 * @see #setOuterRadius(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineFanType_OuterRadius()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOuterRadius();

	/**
	 * Sets the value of the '{@link Cpacs.EngineFanType#getOuterRadius <em>Outer Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Radius</em>' containment reference.
	 * @see #getOuterRadius()
	 * @generated
	 */
	void setOuterRadius(DoubleBaseType value);

} // EngineFanType
