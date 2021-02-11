/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orthotropic Solid Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getE1 <em>E1</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getE2 <em>E2</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getE3 <em>E3</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getG23 <em>G23</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getG31 <em>G31</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getG12 <em>G12</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getNu23 <em>Nu23</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getNu31 <em>Nu31</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getNu12 <em>Nu12</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getThermalExpansionCoeff3 <em>Thermal Expansion Coeff3</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getThermalConductivity23 <em>Thermal Conductivity23</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getThermalConductivity31 <em>Thermal Conductivity31</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getThermalConductivity12 <em>Thermal Conductivity12</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getSig1t <em>Sig1t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getSig1c <em>Sig1c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getSig2t <em>Sig2t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getSig2c <em>Sig2c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getSig3t <em>Sig3t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getSig3c <em>Sig3c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getTau23 <em>Tau23</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getTau31 <em>Tau31</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getEps1t <em>Eps1t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getEps1c <em>Eps1c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getEps2t <em>Eps2t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getEps2c <em>Eps2c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getEps3t <em>Eps3t</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getEps3c <em>Eps3c</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getGamma23 <em>Gamma23</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getGamma31 <em>Gamma31</em>}</li>
 *   <li>{@link Cpacs.OrthotropicSolidPropertiesType#getGamma12 <em>Gamma12</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType()
 * @model extendedMetaData="name='orthotropicSolidPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface OrthotropicSolidPropertiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>E1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Young's modulus in material direction 1 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>E1</em>' containment reference.
	 * @see #setE1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_E1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='E1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getE1();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getE1 <em>E1</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_E2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='E2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getE2();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getE2 <em>E2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E2</em>' containment reference.
	 * @see #getE2()
	 * @generated
	 */
	void setE2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>E3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Young's modulus in material direction 3 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>E3</em>' containment reference.
	 * @see #setE3(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_E3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='E3' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getE3();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getE3 <em>E3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E3</em>' containment reference.
	 * @see #getE3()
	 * @generated
	 */
	void setE3(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>G23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shear modulus in the 2-3 plane [N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G23</em>' containment reference.
	 * @see #setG23(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_G23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='G23' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG23();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getG23 <em>G23</em>}' containment reference.
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
	 * Shear modulus in the 3-1 plane [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G31</em>' containment reference.
	 * @see #setG31(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_G31()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='G31' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG31();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getG31 <em>G31</em>}' containment reference.
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
	 * Shear modulus in the 1-2 plane [N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>G12</em>' containment reference.
	 * @see #setG12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_G12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='G12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getG12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getG12 <em>G12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>G12</em>' containment reference.
	 * @see #getG12()
	 * @generated
	 */
	void setG12(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Nu23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Poisson's ratio in in 2-3 plane
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nu23</em>' containment reference.
	 * @see #setNu23(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Nu23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nu23' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNu23();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getNu23 <em>Nu23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nu23</em>' containment reference.
	 * @see #getNu23()
	 * @generated
	 */
	void setNu23(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Nu31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Poisson's ratio in in 3-1 plane
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nu31</em>' containment reference.
	 * @see #setNu31(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Nu31()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nu31' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNu31();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getNu31 <em>Nu31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nu31</em>' containment reference.
	 * @see #getNu31()
	 * @generated
	 */
	void setNu31(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Nu12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Poisson's ratio in in 1-2 plane
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nu12</em>' containment reference.
	 * @see #setNu12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Nu12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nu12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNu12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getNu12 <em>Nu12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nu12</em>' containment reference.
	 * @see #getNu12()
	 * @generated
	 */
	void setNu12(DoubleBaseType value);

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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_ThermalExpansionCoeff1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff1();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_ThermalExpansionCoeff2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff2();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coeff2</em>' containment reference.
	 * @see #getThermalExpansionCoeff2()
	 * @generated
	 */
	void setThermalExpansionCoeff2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coeff3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thermal expansion coefficient in material direction
	 *                                 3 [1/K] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Expansion Coeff3</em>' containment reference.
	 * @see #setThermalExpansionCoeff3(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_ThermalExpansionCoeff3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff3' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff3();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getThermalExpansionCoeff3 <em>Thermal Expansion Coeff3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coeff3</em>' containment reference.
	 * @see #getThermalExpansionCoeff3()
	 * @generated
	 */
	void setThermalExpansionCoeff3(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal conductivity of the material which couples heat flux in material direction 2 with temperature gradient in material direction 3 [W/(m*K)]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Conductivity23</em>' containment reference.
	 * @see #setThermalConductivity23(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_ThermalConductivity23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity23' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity23();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getThermalConductivity23 <em>Thermal Conductivity23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity23</em>' containment reference.
	 * @see #getThermalConductivity23()
	 * @generated
	 */
	void setThermalConductivity23(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal conductivity of the material which couples heat flux in material direction 3 with temperature gradient in material direction 1 [W/(m*K)]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Conductivity31</em>' containment reference.
	 * @see #setThermalConductivity31(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_ThermalConductivity31()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity31' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity31();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getThermalConductivity31 <em>Thermal Conductivity31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity31</em>' containment reference.
	 * @see #getThermalConductivity31()
	 * @generated
	 */
	void setThermalConductivity31(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal conductivity of the material which couples heat flux in material direction 1 with temperature gradient in material direction 2 [W/(m*K)]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Conductivity12</em>' containment reference.
	 * @see #setThermalConductivity12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_ThermalConductivity12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getThermalConductivity12 <em>Thermal Conductivity12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity12</em>' containment reference.
	 * @see #getThermalConductivity12()
	 * @generated
	 */
	void setThermalConductivity12(DoubleBaseType value);

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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Sig1t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig1t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig1t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getSig1t <em>Sig1t</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Sig1c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig1c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig1c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getSig1c <em>Sig1c</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Sig2t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig2t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig2t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getSig2t <em>Sig2t</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Sig2c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig2c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig2c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getSig2c <em>Sig2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig2c</em>' containment reference.
	 * @see #getSig2c()
	 * @generated
	 */
	void setSig2c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sig3t</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for tension in material direction 3
	 *                                 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig3t</em>' containment reference.
	 * @see #setSig3t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Sig3t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig3t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig3t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getSig3t <em>Sig3t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig3t</em>' containment reference.
	 * @see #getSig3t()
	 * @generated
	 */
	void setSig3t(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sig3c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for compression in material
	 *                                 direction 3 [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig3c</em>' containment reference.
	 * @see #setSig3c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Sig3c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig3c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig3c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getSig3c <em>Sig3c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sig3c</em>' containment reference.
	 * @see #getSig3c()
	 * @generated
	 */
	void setSig3c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tau23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for shear in 2-3 plane [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tau23</em>' containment reference.
	 * @see #setTau23(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Tau23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tau23' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTau23();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getTau23 <em>Tau23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau23</em>' containment reference.
	 * @see #getTau23()
	 * @generated
	 */
	void setTau23(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tau31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for shear in 3-1 plane [N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tau31</em>' containment reference.
	 * @see #setTau31(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Tau31()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tau31' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTau31();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getTau31 <em>Tau31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau31</em>' containment reference.
	 * @see #getTau31()
	 * @generated
	 */
	void setTau31(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tau12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable stress for shear in 1-2 plane [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tau12</em>' containment reference.
	 * @see #setTau12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Tau12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tau12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTau12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getTau12 <em>Tau12</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Eps1t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps1t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps1t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getEps1t <em>Eps1t</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Eps1c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps1c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps1c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getEps1c <em>Eps1c</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Eps2t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps2t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps2t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getEps2t <em>Eps2t</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Eps2c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps2c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps2c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getEps2c <em>Eps2c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps2c</em>' containment reference.
	 * @see #getEps2c()
	 * @generated
	 */
	void setEps2c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eps3t</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for tension in material direction 3
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps3t</em>' containment reference.
	 * @see #setEps3t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Eps3t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps3t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps3t();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getEps3t <em>Eps3t</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps3t</em>' containment reference.
	 * @see #getEps3t()
	 * @generated
	 */
	void setEps3t(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Eps3c</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for compression in material
	 *                                 direction 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps3c</em>' containment reference.
	 * @see #setEps3c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Eps3c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps3c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps3c();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getEps3c <em>Eps3c</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps3c</em>' containment reference.
	 * @see #getEps3c()
	 * @generated
	 */
	void setEps3c(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gamma23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for shear in 1-3 plane
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma23</em>' containment reference.
	 * @see #setGamma23(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Gamma23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gamma23' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGamma23();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getGamma23 <em>Gamma23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma23</em>' containment reference.
	 * @see #getGamma23()
	 * @generated
	 */
	void setGamma23(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gamma31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for shear in 1-3 plane
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma31</em>' containment reference.
	 * @see #setGamma31(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Gamma31()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gamma31' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGamma31();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getGamma31 <em>Gamma31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma31</em>' containment reference.
	 * @see #getGamma31()
	 * @generated
	 */
	void setGamma31(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gamma12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allowable strain for shear in 1-2 plane
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma12</em>' containment reference.
	 * @see #setGamma12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getOrthotropicSolidPropertiesType_Gamma12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gamma12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGamma12();

	/**
	 * Sets the value of the '{@link Cpacs.OrthotropicSolidPropertiesType#getGamma12 <em>Gamma12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma12</em>' containment reference.
	 * @see #getGamma12()
	 * @generated
	 */
	void setGamma12(DoubleBaseType value);

} // OrthotropicSolidPropertiesType
