/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piston Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PistonType#getMaxSpringDeflection <em>Max Spring Deflection</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPistonType()
 * @model extendedMetaData="name='pistonType' kind='elementOnly'"
 * @generated
 */
public interface PistonType extends StrutType {
	/**
	 * Returns the value of the '<em><b>Max Spring Deflection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum spring deflection of the piston
	 *                                 (difference between minimum and maximum deflection).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Spring Deflection</em>' containment reference.
	 * @see #setMaxSpringDeflection(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPistonType_MaxSpringDeflection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maxSpringDeflection' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMaxSpringDeflection();

	/**
	 * Sets the value of the '{@link Cpacs.PistonType#getMaxSpringDeflection <em>Max Spring Deflection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Spring Deflection</em>' containment reference.
	 * @see #getMaxSpringDeflection()
	 * @generated
	 */
	void setMaxSpringDeflection(DoubleBaseType value);

} // PistonType
