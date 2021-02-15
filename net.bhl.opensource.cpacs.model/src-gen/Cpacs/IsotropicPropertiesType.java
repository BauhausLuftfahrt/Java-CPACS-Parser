/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Isotropic Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getE <em>E</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getG <em>G</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getNu <em>Nu</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getThermalExpansionCoeff <em>Thermal Expansion Coeff</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getThermalConductivity <em>Thermal Conductivity</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getSigt <em>Sigt</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getSigc <em>Sigc</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getEpst <em>Epst</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getEpsc <em>Epsc</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getGamma12 <em>Gamma12</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getYieldStrengthT <em>Yield Strength T</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getYieldStrengthC <em>Yield Strength C</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getPlasticityCurves <em>Plasticity Curves</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getFatigueFactor <em>Fatigue Factor</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getFatigueBehaviour <em>Fatigue Behaviour</em>}</li>
 *   <li>{@link Cpacs.IsotropicPropertiesType#getDamageToleranceBehaviour <em>Damage Tolerance Behaviour</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType()
 * @model extendedMetaData="name='isotropicPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface IsotropicPropertiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>E</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Young's modulus [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>E</em>' containment reference.
	 * @see #setE(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_E()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='E' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getE();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getE <em>E</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E</em>' containment reference.
	 * @see #getE()
	 * @generated
	 */
	void setE(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Shear modulus [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G</em>' containment reference.
	 * @see #setG(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_G()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='G' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getG <em>G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G</em>' containment reference.
	 * @see #getG()
	 * @generated
	 */
	void setG(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Nu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Poisson's ratio
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nu</em>' containment reference.
	 * @see #setNu(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_Nu()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nu' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNu();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getNu <em>Nu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nu</em>' containment reference.
	 * @see #getNu()
	 * @generated
	 */
	void setNu(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coeff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Thermal expansion coefficient [1/K]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Expansion Coeff</em>' containment reference.
	 * @see #setThermalExpansionCoeff(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_ThermalExpansionCoeff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getThermalExpansionCoeff <em>Thermal Expansion Coeff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coeff</em>' containment reference.
	 * @see #getThermalExpansionCoeff()
	 * @generated
	 */
	void setThermalExpansionCoeff(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Thermal conductivity of the material in
	 *                                 [W/(m*K)]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Conductivity</em>' containment reference.
	 * @see #setThermalConductivity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_ThermalConductivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getThermalConductivity <em>Thermal Conductivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity</em>' containment reference.
	 * @see #getThermalConductivity()
	 * @generated
	 */
	void setThermalConductivity(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sigt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Allowable stress for tension [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sigt</em>' containment reference.
	 * @see #setSigt(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_Sigt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sigt' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSigt();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getSigt <em>Sigt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigt</em>' containment reference.
	 * @see #getSigt()
	 * @generated
	 */
	void setSigt(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sigc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Allowable stress for compression [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sigc</em>' containment reference.
	 * @see #setSigc(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_Sigc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sigc' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSigc();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getSigc <em>Sigc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigc</em>' containment reference.
	 * @see #getSigc()
	 * @generated
	 */
	void setSigc(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tau12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Allowable stress for shear [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tau12</em>' containment reference.
	 * @see #setTau12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_Tau12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tau12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTau12();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getTau12 <em>Tau12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau12</em>' containment reference.
	 * @see #getTau12()
	 * @generated
	 */
	void setTau12(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Epst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Allowable strain for tension
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Epst</em>' containment reference.
	 * @see #setEpst(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_Epst()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='epst' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEpst();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getEpst <em>Epst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epst</em>' containment reference.
	 * @see #getEpst()
	 * @generated
	 */
	void setEpst(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Epsc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Allowable strain for compression
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Epsc</em>' containment reference.
	 * @see #setEpsc(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_Epsc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='epsc' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEpsc();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getEpsc <em>Epsc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epsc</em>' containment reference.
	 * @see #getEpsc()
	 * @generated
	 */
	void setEpsc(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gamma12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Allowable strain for shear
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma12</em>' containment reference.
	 * @see #setGamma12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_Gamma12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gamma12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGamma12();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getGamma12 <em>Gamma12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma12</em>' containment reference.
	 * @see #getGamma12()
	 * @generated
	 */
	void setGamma12(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Yield Strength T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Yield strength, tension [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yield Strength T</em>' containment reference.
	 * @see #setYieldStrengthT(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_YieldStrengthT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='yieldStrengthT' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getYieldStrengthT();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getYieldStrengthT <em>Yield Strength T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield Strength T</em>' containment reference.
	 * @see #getYieldStrengthT()
	 * @generated
	 */
	void setYieldStrengthT(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Yield Strength C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Yield strength, compression [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yield Strength C</em>' containment reference.
	 * @see #setYieldStrengthC(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_YieldStrengthC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='yieldStrengthC' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getYieldStrengthC();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getYieldStrengthC <em>Yield Strength C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield Strength C</em>' containment reference.
	 * @see #getYieldStrengthC()
	 * @generated
	 */
	void setYieldStrengthC(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Plasticity Curves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Plastification curves for isotropic
	 *                                 materials incl. element elimination
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plasticity Curves</em>' containment reference.
	 * @see #setPlasticityCurves(PlasticityCurvesType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_PlasticityCurves()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plasticityCurves' namespace='##targetNamespace'"
	 * @generated
	 */
	PlasticityCurvesType getPlasticityCurves();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getPlasticityCurves <em>Plasticity Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plasticity Curves</em>' containment reference.
	 * @see #getPlasticityCurves()
	 * @generated
	 */
	void setPlasticityCurves(PlasticityCurvesType value);

	/**
	 * Returns the value of the '<em><b>Fatigue Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Optional knockdown factor for fatiuqe
	 *                                 (defaults to 1)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fatigue Factor</em>' containment reference.
	 * @see #setFatigueFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_FatigueFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fatigueFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFatigueFactor();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getFatigueFactor <em>Fatigue Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fatigue Factor</em>' containment reference.
	 * @see #getFatigueFactor()
	 * @generated
	 */
	void setFatigueFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fatigue Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Fatigue behaviour of the material
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fatigue Behaviour</em>' containment reference.
	 * @see #setFatigueBehaviour(FatigueBehaviourType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_FatigueBehaviour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fatigueBehaviour' namespace='##targetNamespace'"
	 * @generated
	 */
	FatigueBehaviourType getFatigueBehaviour();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getFatigueBehaviour <em>Fatigue Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fatigue Behaviour</em>' containment reference.
	 * @see #getFatigueBehaviour()
	 * @generated
	 */
	void setFatigueBehaviour(FatigueBehaviourType value);

	/**
	 * Returns the value of the '<em><b>Damage Tolerance Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Damage tolerance behaviour of the
	 *                                 material
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Damage Tolerance Behaviour</em>' containment reference.
	 * @see #setDamageToleranceBehaviour(DamTolBehaviourType)
	 * @see Cpacs.CpacsPackage#getIsotropicPropertiesType_DamageToleranceBehaviour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='damageToleranceBehaviour' namespace='##targetNamespace'"
	 * @generated
	 */
	DamTolBehaviourType getDamageToleranceBehaviour();

	/**
	 * Sets the value of the '{@link Cpacs.IsotropicPropertiesType#getDamageToleranceBehaviour <em>Damage Tolerance Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Tolerance Behaviour</em>' containment reference.
	 * @see #getDamageToleranceBehaviour()
	 * @generated
	 */
	void setDamageToleranceBehaviour(DamTolBehaviourType value);

} // IsotropicPropertiesType
