/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bogie Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BogieType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.BogieType#getTiltAngle <em>Tilt Angle</em>}</li>
 *   <li>{@link Cpacs.BogieType#getStrutProperties <em>Strut Properties</em>}</li>
 *   <li>{@link Cpacs.BogieType#getAxleAssemblies <em>Axle Assemblies</em>}</li>
 *   <li>{@link Cpacs.BogieType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBogieType()
 * @model extendedMetaData="name='bogieType' kind='elementOnly'"
 * @generated
 */
public interface BogieType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Length of the bogie
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBogieType_Length()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.BogieType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tilt Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tilt angle of the bogie in airborne conditions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tilt Angle</em>' containment reference.
	 * @see #setTiltAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getBogieType_TiltAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tiltAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTiltAngle();

	/**
	 * Sets the value of the '{@link Cpacs.BogieType#getTiltAngle <em>Tilt Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Angle</em>' containment reference.
	 * @see #getTiltAngle()
	 * @generated
	 */
	void setTiltAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Strut Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strut Properties</em>' containment reference.
	 * @see #setStrutProperties(StrutPropertiesType)
	 * @see Cpacs.CpacsPackage#getBogieType_StrutProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strutProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutPropertiesType getStrutProperties();

	/**
	 * Sets the value of the '{@link Cpacs.BogieType#getStrutProperties <em>Strut Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strut Properties</em>' containment reference.
	 * @see #getStrutProperties()
	 * @generated
	 */
	void setStrutProperties(StrutPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Axle Assemblies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axle Assemblies</em>' containment reference.
	 * @see #setAxleAssemblies(AxleAssembliesType)
	 * @see Cpacs.CpacsPackage#getBogieType_AxleAssemblies()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axleAssemblies' namespace='##targetNamespace'"
	 * @generated
	 */
	AxleAssembliesType getAxleAssemblies();

	/**
	 * Sets the value of the '{@link Cpacs.BogieType#getAxleAssemblies <em>Axle Assemblies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axle Assemblies</em>' containment reference.
	 * @see #getAxleAssemblies()
	 * @generated
	 */
	void setAxleAssemblies(AxleAssembliesType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getBogieType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.BogieType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // BogieType
