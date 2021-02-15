/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anisotropic Shell Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getQ11 <em>Q11</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getQ12 <em>Q12</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getQ13 <em>Q13</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getQ22 <em>Q22</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getQ23 <em>Q23</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getQ33 <em>Q33</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getThermalExpansionCoeff12 <em>Thermal Expansion Coeff12</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getThermalConductivity1 <em>Thermal Conductivity1</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getThermalConductivity2 <em>Thermal Conductivity2</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getThermalConductivity3 <em>Thermal Conductivity3</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getSig1t <em>Sig1t</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getSig1c <em>Sig1c</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getSig2t <em>Sig2t</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getSig2c <em>Sig2c</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getTau12 <em>Tau12</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getEps1t <em>Eps1t</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getEps1c <em>Eps1c</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getEps2t <em>Eps2t</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getEps2c <em>Eps2c</em>}</li>
 *   <li>{@link Cpacs.AnisotropicShellPropertiesType#getGamma12 <em>Gamma12</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType()
 * @model extendedMetaData="name='anisotropicShellPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface AnisotropicShellPropertiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Q11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Coefficient 11 of reduced stiffness matrix [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q11</em>' containment reference.
	 * @see #setQ11(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Q11()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Q11' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQ11();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getQ11 <em>Q11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q11</em>' containment reference.
	 * @see #getQ11()
	 * @generated
	 */
	void setQ11(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Q12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Coefficient 12 of reduced stiffness matrix [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q12</em>' containment reference.
	 * @see #setQ12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Q12()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Q12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQ12();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getQ12 <em>Q12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q12</em>' containment reference.
	 * @see #getQ12()
	 * @generated
	 */
	void setQ12(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Q13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Coefficient 13 of reduced stiffness matrix [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q13</em>' containment reference.
	 * @see #setQ13(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Q13()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Q13' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQ13();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getQ13 <em>Q13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q13</em>' containment reference.
	 * @see #getQ13()
	 * @generated
	 */
	void setQ13(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Q22</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Coefficient 22 of reduced stiffness matrix [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q22</em>' containment reference.
	 * @see #setQ22(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Q22()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Q22' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQ22();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getQ22 <em>Q22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q22</em>' containment reference.
	 * @see #getQ22()
	 * @generated
	 */
	void setQ22(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Q23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Coefficient 23 of reduced stiffness matrix [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q23</em>' containment reference.
	 * @see #setQ23(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Q23()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Q23' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQ23();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getQ23 <em>Q23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q23</em>' containment reference.
	 * @see #getQ23()
	 * @generated
	 */
	void setQ23(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Q33</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Coefficient 33 of reduced stiffness matrix [N/m^2] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q33</em>' containment reference.
	 * @see #setQ33(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Q33()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Q33' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQ33();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getQ33 <em>Q33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q33</em>' containment reference.
	 * @see #getQ33()
	 * @generated
	 */
	void setQ33(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coeff1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal expansion coefficient in material direction
	 *                                 1 [1/K] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Expansion Coeff1</em>' containment reference.
	 * @see #setThermalExpansionCoeff1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_ThermalExpansionCoeff1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff1();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getThermalExpansionCoeff1 <em>Thermal Expansion Coeff1</em>}' containment reference.
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
	 *  Thermal expansion coefficient in material direction
	 *                                 2 [1/K] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Expansion Coeff2</em>' containment reference.
	 * @see #setThermalExpansionCoeff2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_ThermalExpansionCoeff2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff2();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getThermalExpansionCoeff2 <em>Thermal Expansion Coeff2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coeff2</em>' containment reference.
	 * @see #getThermalExpansionCoeff2()
	 * @generated
	 */
	void setThermalExpansionCoeff2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coeff12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal expansion coefficient in material direction
	 *                                 12 [1/K] 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Expansion Coeff12</em>' containment reference.
	 * @see #setThermalExpansionCoeff12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_ThermalExpansionCoeff12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalExpansionCoeff12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalExpansionCoeff12();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getThermalExpansionCoeff12 <em>Thermal Expansion Coeff12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coeff12</em>' containment reference.
	 * @see #getThermalExpansionCoeff12()
	 * @generated
	 */
	void setThermalExpansionCoeff12(DoubleBaseType value);

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
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_ThermalConductivity1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity1();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getThermalConductivity1 <em>Thermal Conductivity1</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_ThermalConductivity2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity2();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getThermalConductivity2 <em>Thermal Conductivity2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity2</em>' containment reference.
	 * @see #getThermalConductivity2()
	 * @generated
	 */
	void setThermalConductivity2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Thermal Conductivity3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Thermal conductivity of the material in material direction 3 [W/(m*K)]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermal Conductivity3</em>' containment reference.
	 * @see #setThermalConductivity3(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_ThermalConductivity3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thermalConductivity3' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThermalConductivity3();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getThermalConductivity3 <em>Thermal Conductivity3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Conductivity3</em>' containment reference.
	 * @see #getThermalConductivity3()
	 * @generated
	 */
	void setThermalConductivity3(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sig1t</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Allowable stress for tension in material direction 1 [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig1t</em>' containment reference.
	 * @see #setSig1t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Sig1t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig1t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig1t();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getSig1t <em>Sig1t</em>}' containment reference.
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
	 *  Allowable stress for compression in material direction 1 [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig1c</em>' containment reference.
	 * @see #setSig1c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Sig1c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig1c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig1c();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getSig1c <em>Sig1c</em>}' containment reference.
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
	 *  Allowable stress for tension in material direction 2 [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig2t</em>' containment reference.
	 * @see #setSig2t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Sig2t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig2t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig2t();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getSig2t <em>Sig2t</em>}' containment reference.
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
	 *  Allowable stress for compression in material direction 2 [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sig2c</em>' containment reference.
	 * @see #setSig2c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Sig2c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sig2c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSig2c();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getSig2c <em>Sig2c</em>}' containment reference.
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
	 *  Allowable stress for shear [N/m^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tau12</em>' containment reference.
	 * @see #setTau12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Tau12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tau12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTau12();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getTau12 <em>Tau12</em>}' containment reference.
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
	 *  Allowable strain for tension in material direction 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps1t</em>' containment reference.
	 * @see #setEps1t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Eps1t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps1t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps1t();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getEps1t <em>Eps1t</em>}' containment reference.
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
	 *  Allowable strain for compression in material direction 1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps1c</em>' containment reference.
	 * @see #setEps1c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Eps1c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps1c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps1c();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getEps1c <em>Eps1c</em>}' containment reference.
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
	 *  Allowable strain for tension in material direction 2 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps2t</em>' containment reference.
	 * @see #setEps2t(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Eps2t()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps2t' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps2t();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getEps2t <em>Eps2t</em>}' containment reference.
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
	 *  Allowable strain for compression in material direction 2
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eps2c</em>' containment reference.
	 * @see #setEps2c(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Eps2c()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eps2c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEps2c();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getEps2c <em>Eps2c</em>}' containment reference.
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
	 *  Allowable strain for shear 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma12</em>' containment reference.
	 * @see #setGamma12(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAnisotropicShellPropertiesType_Gamma12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gamma12' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGamma12();

	/**
	 * Sets the value of the '{@link Cpacs.AnisotropicShellPropertiesType#getGamma12 <em>Gamma12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma12</em>' containment reference.
	 * @see #getGamma12()
	 * @generated
	 */
	void setGamma12(DoubleBaseType value);

} // AnisotropicShellPropertiesType
