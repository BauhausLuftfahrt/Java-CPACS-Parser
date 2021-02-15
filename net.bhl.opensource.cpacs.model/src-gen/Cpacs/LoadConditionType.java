/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadConditionType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link Cpacs.LoadConditionType#getSizingType <em>Sizing Type</em>}</li>
 *   <li>{@link Cpacs.LoadConditionType#getSafetyFactor <em>Safety Factor</em>}</li>
 *   <li>{@link Cpacs.LoadConditionType#getDesignSpeed <em>Design Speed</em>}</li>
 *   <li>{@link Cpacs.LoadConditionType#getAdditionalParameters <em>Additional Parameters</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadConditionType()
 * @model extendedMetaData="name='loadConditionType' kind='elementOnly'"
 * @generated
 */
public interface LoadConditionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IdentifierType)
	 * @see Cpacs.CpacsPackage#getLoadConditionType_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getIdentifier();

	/**
	 * Sets the value of the '{@link Cpacs.LoadConditionType#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Sizing Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizing Type</em>' containment reference.
	 * @see #setSizingType(SizingTypeType)
	 * @see Cpacs.CpacsPackage#getLoadConditionType_SizingType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sizingType' namespace='##targetNamespace'"
	 * @generated
	 */
	SizingTypeType getSizingType();

	/**
	 * Sets the value of the '{@link Cpacs.LoadConditionType#getSizingType <em>Sizing Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizing Type</em>' containment reference.
	 * @see #getSizingType()
	 * @generated
	 */
	void setSizingType(SizingTypeType value);

	/**
	 * Returns the value of the '<em><b>Safety Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Factor</em>' containment reference.
	 * @see #setSafetyFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadConditionType_SafetyFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='safetyFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSafetyFactor();

	/**
	 * Sets the value of the '{@link Cpacs.LoadConditionType#getSafetyFactor <em>Safety Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Factor</em>' containment reference.
	 * @see #getSafetyFactor()
	 * @generated
	 */
	void setSafetyFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Design Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Speed</em>' containment reference.
	 * @see #setDesignSpeed(DesignSpeedType)
	 * @see Cpacs.CpacsPackage#getLoadConditionType_DesignSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DesignSpeedType getDesignSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.LoadConditionType#getDesignSpeed <em>Design Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Speed</em>' containment reference.
	 * @see #getDesignSpeed()
	 * @generated
	 */
	void setDesignSpeed(DesignSpeedType value);

	/**
	 * Returns the value of the '<em><b>Additional Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Parameters</em>' containment reference.
	 * @see #setAdditionalParameters(AdditionalParametersType)
	 * @see Cpacs.CpacsPackage#getLoadConditionType_AdditionalParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalParametersType getAdditionalParameters();

	/**
	 * Sets the value of the '{@link Cpacs.LoadConditionType#getAdditionalParameters <em>Additional Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Parameters</em>' containment reference.
	 * @see #getAdditionalParameters()
	 * @generated
	 */
	void setAdditionalParameters(AdditionalParametersType value);

} // LoadConditionType
