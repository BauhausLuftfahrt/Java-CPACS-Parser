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
 *   <li>{@link Cpacs.PistonType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.PistonType#getStrutProperties <em>Strut Properties</em>}</li>
 *   <li>{@link Cpacs.PistonType#getMaxSpringDeflection <em>Max Spring Deflection</em>}</li>
 *   <li>{@link Cpacs.PistonType#getCompressedExternalLength <em>Compressed External Length</em>}</li>
 *   <li>{@link Cpacs.PistonType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPistonType()
 * @model extendedMetaData="name='pistonType' kind='elementOnly'"
 * @generated
 */
public interface PistonType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the piston
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPistonType_Length()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.PistonType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Strut Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strut Properties</em>' containment reference.
	 * @see #setStrutProperties(StrutPropertiesType)
	 * @see Cpacs.CpacsPackage#getPistonType_StrutProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strutProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutPropertiesType getStrutProperties();

	/**
	 * Sets the value of the '{@link Cpacs.PistonType#getStrutProperties <em>Strut Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strut Properties</em>' containment reference.
	 * @see #getStrutProperties()
	 * @generated
	 */
	void setStrutProperties(StrutPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Max Spring Deflection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum spring deflection of the piston (difference between minimum and maximum deflection)
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

	/**
	 * Returns the value of the '<em><b>Compressed External Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the piston that remains outside of the main strut in fully compressed state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compressed External Length</em>' containment reference.
	 * @see #setCompressedExternalLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPistonType_CompressedExternalLength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='compressedExternalLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCompressedExternalLength();

	/**
	 * Sets the value of the '{@link Cpacs.PistonType#getCompressedExternalLength <em>Compressed External Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressed External Length</em>' containment reference.
	 * @see #getCompressedExternalLength()
	 * @generated
	 */
	void setCompressedExternalLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPistonType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PistonType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PistonType
