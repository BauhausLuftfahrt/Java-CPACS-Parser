/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineGeometryType#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.EngineGeometryType#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link Cpacs.EngineGeometryType#getDiameterProp <em>Diameter Prop</em>}</li>
 *   <li>{@link Cpacs.EngineGeometryType#getChordlength <em>Chordlength</em>}</li>
 *   <li>{@link Cpacs.EngineGeometryType#getFan <em>Fan</em>}</li>
 *   <li>{@link Cpacs.EngineGeometryType#getSpinner <em>Spinner</em>}</li>
 *   <li>{@link Cpacs.EngineGeometryType#getEngineMounts <em>Engine Mounts</em>}</li>
 *   <li>{@link Cpacs.EngineGeometryType#getLiner <em>Liner</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineGeometryType()
 * @model extendedMetaData="name='engineGeometryType' kind='elementOnly'"
 * @generated
 */
public interface EngineGeometryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * length of engine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLength();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * diameter of engine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diameter</em>' containment reference.
	 * @see #setDiameter(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_Diameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDiameter();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getDiameter <em>Diameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' containment reference.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Diameter Prop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dProp
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diameter Prop</em>' containment reference.
	 * @see #setDiameterProp(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_DiameterProp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diameterProp' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDiameterProp();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getDiameterProp <em>Diameter Prop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Prop</em>' containment reference.
	 * @see #getDiameterProp()
	 * @generated
	 */
	void setDiameterProp(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Chordlength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chordlength of a fan blade
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chordlength</em>' containment reference.
	 * @see #setChordlength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_Chordlength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chordlength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getChordlength();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getChordlength <em>Chordlength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chordlength</em>' containment reference.
	 * @see #getChordlength()
	 * @generated
	 */
	void setChordlength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fan</em>' containment reference.
	 * @see #setFan(EngineFanType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_Fan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fan' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineFanType getFan();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getFan <em>Fan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fan</em>' containment reference.
	 * @see #getFan()
	 * @generated
	 */
	void setFan(EngineFanType value);

	/**
	 * Returns the value of the '<em><b>Spinner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spinner</em>' containment reference.
	 * @see #setSpinner(EngineSpinnerType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_Spinner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spinner' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineSpinnerType getSpinner();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getSpinner <em>Spinner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spinner</em>' containment reference.
	 * @see #getSpinner()
	 * @generated
	 */
	void setSpinner(EngineSpinnerType value);

	/**
	 * Returns the value of the '<em><b>Engine Mounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Mounts</em>' containment reference.
	 * @see #setEngineMounts(EngineMountsType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_EngineMounts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engineMounts' namespace='##targetNamespace'"
	 * @generated
	 */
	EngineMountsType getEngineMounts();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getEngineMounts <em>Engine Mounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Mounts</em>' containment reference.
	 * @see #getEngineMounts()
	 * @generated
	 */
	void setEngineMounts(EngineMountsType value);

	/**
	 * Returns the value of the '<em><b>Liner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liner</em>' containment reference.
	 * @see #setLiner(LinerType)
	 * @see Cpacs.CpacsPackage#getEngineGeometryType_Liner()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='liner' namespace='##targetNamespace'"
	 * @generated
	 */
	LinerType getLiner();

	/**
	 * Sets the value of the '{@link Cpacs.EngineGeometryType#getLiner <em>Liner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liner</em>' containment reference.
	 * @see #getLiner()
	 * @generated
	 */
	void setLiner(LinerType value);

} // EngineGeometryType
