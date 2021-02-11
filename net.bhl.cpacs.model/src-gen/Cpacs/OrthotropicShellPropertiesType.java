/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orthotropic Shell Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getE1 <em>E1</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getE2 <em>E2</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getG23 <em>G23</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getG31 <em>G31</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getG12 <em>G12</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getNu <em>Nu</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getThermalConductivity1 <em>Thermal Conductivity1</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getThermalConductivity2 <em>Thermal Conductivity2</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getSig1t <em>Sig1t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getSig1c <em>Sig1c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getSig2t <em>Sig2t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getSig2c <em>Sig2c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getEps1t <em>Eps1t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getEps1c <em>Eps1c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getEps2t <em>Eps2t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getEps2c <em>Eps2c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicShellPropertiesType#getGamma12 <em>Gamma12</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType()
 * @model extendedMetaData="name='orthotropicShellPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface OrthotropicShellPropertiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>E1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Young's modulus in material direction 1 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>E1</em>' containment reference.
	 * @see #setE1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_E1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='E1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getE1();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getE1 <em>E1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E1</em>' containment reference.
	 * @see #getE1()
	 * @generated
	 */
	void setE1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>E2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Young's modulus in material direction 2 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>E2</em>' containment reference.
	 * @see #setE2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_E2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='E2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getE2();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getE2 <em>E2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E2</em>' containment reference.
	 * @see #getE2()
	 * @generated
	 */
	void setE2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>G23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Shear modulus in material in 2-3 plane [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G23</em>' containment reference.
	 * @see #setG23(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_G23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='G23' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG23();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getG23 <em>G23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G23</em>' containment reference.
	 * @see #getG23()
	 * @generated
	 */
	void setG23(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>G31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Shear modulus in material in 3-1 plane [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G31</em>' containment reference.
	 * @see #setG31(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_G31()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='G31' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG31();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getG31 <em>G31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G31</em>' containment reference.
	 * @see #getG31()
	 * @generated
	 */
	void setG31(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>G12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Shear modulus in material in 1-2 plane [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G12</em>' containment reference.
	 * @see #setG12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_G12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='G12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getG12 <em>G12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G12</em>' containment reference.
	 * @see #getG12()
	 * @generated
	 */
	void setG12(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Nu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Poisson's ratio 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nu</em>' containment reference.
	 * @see #setNu(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Nu()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nu' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNu();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getNu <em>Nu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nu</em>' containment reference.
	 * @see #getNu()
	 * @generated
	 */
	void setNu(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coeff1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thermal expansion coefficient in material direction
	 *                                 1 [1/K] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Expansion Coeff1</em>' containment reference.
	 * @see #setThermalExpansionCoeff1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_ThermalExpansionCoeff1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff1();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coeff1</em>' containment reference.
	 * @see #getThermalExpansionCoeff1()
	 * @generated
	 */
	void setThermalExpansionCoeff1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coeff2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thermal expansion coefficient in material direction
	 *                                 2 [1/K] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Expansion Coeff2</em>' containment reference.
	 * @see #setThermalExpansionCoeff2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_ThermalExpansionCoeff2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff2();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coeff2</em>' containment reference.
	 * @see #getThermalExpansionCoeff2()
	 * @generated
	 */
	void setThermalExpansionCoeff2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal conductivity of the material in material direction 1 [W/(m*K)]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Conductivity1</em>' containment reference.
	 * @see #setThermalConductivity1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_ThermalConductivity1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity1();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getThermalConductivity1 <em>Thermal Conductivity1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity1</em>' containment reference.
	 * @see #getThermalConductivity1()
	 * @generated
	 */
	void setThermalConductivity1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal conductivity of the material in material direction 2 [W/(m*K)]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Conductivity2</em>' containment reference.
	 * @see #setThermalConductivity2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_ThermalConductivity2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity2();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getThermalConductivity2 <em>Thermal Conductivity2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity2</em>' containment reference.
	 * @see #getThermalConductivity2()
	 * @generated
	 */
	void setThermalConductivity2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sig1t</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for tension in material direction 1
	 *                                 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig1t</em>' containment reference.
	 * @see #setSig1t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Sig1t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig1t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig1t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getSig1t <em>Sig1t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig1t</em>' containment reference.
	 * @see #getSig1t()
	 * @generated
	 */
	void setSig1t(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sig1c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for compression in material
	 *                                 direction 1 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig1c</em>' containment reference.
	 * @see #setSig1c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Sig1c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig1c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig1c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getSig1c <em>Sig1c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig1c</em>' containment reference.
	 * @see #getSig1c()
	 * @generated
	 */
	void setSig1c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sig2t</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for tension in material direction 2
	 *                                 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig2t</em>' containment reference.
	 * @see #setSig2t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Sig2t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig2t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig2t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getSig2t <em>Sig2t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig2t</em>' containment reference.
	 * @see #getSig2t()
	 * @generated
	 */
	void setSig2t(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sig2c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for compression in material
	 *                                 direction 2 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig2c</em>' containment reference.
	 * @see #setSig2c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Sig2c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig2c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig2c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getSig2c <em>Sig2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig2c</em>' containment reference.
	 * @see #getSig2c()
	 * @generated
	 */
	void setSig2c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tau12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for shear [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tau12</em>' containment reference.
	 * @see #setTau12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Tau12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tau12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTau12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getTau12 <em>Tau12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau12</em>' containment reference.
	 * @see #getTau12()
	 * @generated
	 */
	void setTau12(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eps1t</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for tension in material direction 1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps1t</em>' containment reference.
	 * @see #setEps1t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Eps1t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps1t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps1t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getEps1t <em>Eps1t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps1t</em>' containment reference.
	 * @see #getEps1t()
	 * @generated
	 */
	void setEps1t(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eps1c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for compression in material
	 *                                 direction 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps1c</em>' containment reference.
	 * @see #setEps1c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Eps1c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps1c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps1c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getEps1c <em>Eps1c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps1c</em>' containment reference.
	 * @see #getEps1c()
	 * @generated
	 */
	void setEps1c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eps2t</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for tension in material direction 2
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps2t</em>' containment reference.
	 * @see #setEps2t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Eps2t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps2t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps2t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getEps2t <em>Eps2t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps2t</em>' containment reference.
	 * @see #getEps2t()
	 * @generated
	 */
	void setEps2t(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eps2c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for compression in material
	 *                                 direction 2 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps2c</em>' containment reference.
	 * @see #setEps2c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Eps2c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps2c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps2c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getEps2c <em>Eps2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps2c</em>' containment reference.
	 * @see #getEps2c()
	 * @generated
	 */
	void setEps2c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gamma12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for shear 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma12</em>' containment reference.
	 * @see #setGamma12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicShellPropertiesType_Gamma12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gamma12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGamma12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicShellPropertiesType#getGamma12 <em>Gamma12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma12</em>' containment reference.
	 * @see #getGamma12()
	 * @generated
	 */
	void setGamma12(DoubleBaseType value);

} // OrthotropicShellPropertiesType
