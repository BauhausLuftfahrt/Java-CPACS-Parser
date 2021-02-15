/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuelType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FuelType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FuelType#getLowerHeatingValue <em>Lower Heating Value</em>}</li>
 *   <li>{@link Cpacs.FuelType#getDensity <em>Density</em>}</li>
 *   <li>{@link Cpacs.FuelType#getFreezingPoint <em>Freezing Point</em>}</li>
 *   <li>{@link Cpacs.FuelType#getBoilingPoint <em>Boiling Point</em>}</li>
 *   <li>{@link Cpacs.FuelType#getFlashPoint <em>Flash Point</em>}</li>
 *   <li>{@link Cpacs.FuelType#getAutoFlammability <em>Auto Flammability</em>}</li>
 *   <li>{@link Cpacs.FuelType#getKinematicViscosity <em>Kinematic Viscosity</em>}</li>
 *   <li>{@link Cpacs.FuelType#getAvgSulfurLevel <em>Avg Sulfur Level</em>}</li>
 *   <li>{@link Cpacs.FuelType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuelType()
 * @model extendedMetaData="name='fuelType' kind='elementOnly'"
 * @generated
 */
public interface FuelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Lower Heating Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Heating Value</em>' containment reference.
	 * @see #setLowerHeatingValue(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_LowerHeatingValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerHeatingValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLowerHeatingValue();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getLowerHeatingValue <em>Lower Heating Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Heating Value</em>' containment reference.
	 * @see #getLowerHeatingValue()
	 * @generated
	 */
	void setLowerHeatingValue(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Density</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * at 15deg C
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Density</em>' containment reference.
	 * @see #setDensity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_Density()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='density' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDensity();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getDensity <em>Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density</em>' containment reference.
	 * @see #getDensity()
	 * @generated
	 */
	void setDensity(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Freezing Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freezing Point</em>' containment reference.
	 * @see #setFreezingPoint(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_FreezingPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='freezingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFreezingPoint();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getFreezingPoint <em>Freezing Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freezing Point</em>' containment reference.
	 * @see #getFreezingPoint()
	 * @generated
	 */
	void setFreezingPoint(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Boiling Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boiling Point</em>' containment reference.
	 * @see #setBoilingPoint(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_BoilingPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='boilingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getBoilingPoint();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getBoilingPoint <em>Boiling Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boiling Point</em>' containment reference.
	 * @see #getBoilingPoint()
	 * @generated
	 */
	void setBoilingPoint(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Flash Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flash Point</em>' containment reference.
	 * @see #setFlashPoint(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_FlashPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flashPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFlashPoint();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getFlashPoint <em>Flash Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flash Point</em>' containment reference.
	 * @see #getFlashPoint()
	 * @generated
	 */
	void setFlashPoint(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Auto Flammability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Flammability</em>' containment reference.
	 * @see #setAutoFlammability(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_AutoFlammability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='autoFlammability' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAutoFlammability();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getAutoFlammability <em>Auto Flammability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Flammability</em>' containment reference.
	 * @see #getAutoFlammability()
	 * @generated
	 */
	void setAutoFlammability(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Kinematic Viscosity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinematic Viscosity</em>' containment reference.
	 * @see #setKinematicViscosity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_KinematicViscosity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='kinematicViscosity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKinematicViscosity();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getKinematicViscosity <em>Kinematic Viscosity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematic Viscosity</em>' containment reference.
	 * @see #getKinematicViscosity()
	 * @generated
	 */
	void setKinematicViscosity(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Avg Sulfur Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Sulfur Level</em>' containment reference.
	 * @see #setAvgSulfurLevel(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFuelType_AvgSulfurLevel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='avgSulfurLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAvgSulfurLevel();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getAvgSulfurLevel <em>Avg Sulfur Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Sulfur Level</em>' containment reference.
	 * @see #getAvgSulfurLevel()
	 * @generated
	 */
	void setAvgSulfurLevel(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFuelType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuelType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FuelType
