/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Eiglat Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqEiglatType#getDutchRollFrequency <em>Dutch Roll Frequency</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getDutchRollDamping <em>Dutch Roll Damping</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getRollTimeConstant <em>Roll Time Constant</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getSpiralDoublingTime <em>Spiral Doubling Time</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getRatioPhiBeta <em>Ratio Phi Beta</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getRollFrequency <em>Roll Frequency</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getRollSpiralDamping <em>Roll Spiral Damping</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getRollSpiralProduct <em>Roll Spiral Product</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getDurchroll <em>Durchroll</em>}</li>
 *   <li>{@link Cpacs.FqEiglatType#getRoll <em>Roll</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqEiglatType()
 * @model extendedMetaData="name='fqEiglatType' kind='elementOnly'"
 * @generated
 */
public interface FqEiglatType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Dutch Roll Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * natural frequency of dutch roll mode [rad/s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dutch Roll Frequency</em>' containment reference.
	 * @see #setDutchRollFrequency(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_DutchRollFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dutchRollFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDutchRollFrequency();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getDutchRollFrequency <em>Dutch Roll Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dutch Roll Frequency</em>' containment reference.
	 * @see #getDutchRollFrequency()
	 * @generated
	 */
	void setDutchRollFrequency(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Dutch Roll Damping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * damping of dutch roll mode [-]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dutch Roll Damping</em>' containment reference.
	 * @see #setDutchRollDamping(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_DutchRollDamping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dutchRollDamping' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDutchRollDamping();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getDutchRollDamping <em>Dutch Roll Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dutch Roll Damping</em>' containment reference.
	 * @see #getDutchRollDamping()
	 * @generated
	 */
	void setDutchRollDamping(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Time Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * roll time constant [s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Time Constant</em>' containment reference.
	 * @see #setRollTimeConstant(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_RollTimeConstant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollTimeConstant' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollTimeConstant();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getRollTimeConstant <em>Roll Time Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Time Constant</em>' containment reference.
	 * @see #getRollTimeConstant()
	 * @generated
	 */
	void setRollTimeConstant(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Spiral Doubling Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time to double of spiral mode [s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spiral Doubling Time</em>' containment reference.
	 * @see #setSpiralDoublingTime(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_SpiralDoublingTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spiralDoublingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpiralDoublingTime();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getSpiralDoublingTime <em>Spiral Doubling Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spiral Doubling Time</em>' containment reference.
	 * @see #getSpiralDoublingTime()
	 * @generated
	 */
	void setSpiralDoublingTime(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ratio Phi Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ratio of bank to sideslip angle [-]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratio Phi Beta</em>' containment reference.
	 * @see #setRatioPhiBeta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_RatioPhiBeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ratioPhiBeta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRatioPhiBeta();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getRatioPhiBeta <em>Ratio Phi Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Phi Beta</em>' containment reference.
	 * @see #getRatioPhiBeta()
	 * @generated
	 */
	void setRatioPhiBeta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * natural frequency of coupled rollspiral motion
	 *                                 [rad/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Frequency</em>' containment reference.
	 * @see #setRollFrequency(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_RollFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollFrequency();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getRollFrequency <em>Roll Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Frequency</em>' containment reference.
	 * @see #getRollFrequency()
	 * @generated
	 */
	void setRollFrequency(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Spiral Damping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * damping ratio of coupled roll-spiral motion
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Spiral Damping</em>' containment reference.
	 * @see #setRollSpiralDamping(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_RollSpiralDamping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollSpiralDamping' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollSpiralDamping();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getRollSpiralDamping <em>Roll Spiral Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Spiral Damping</em>' containment reference.
	 * @see #getRollSpiralDamping()
	 * @generated
	 */
	void setRollSpiralDamping(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Spiral Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * product of roll-spiral damping and natural
	 *                                 frequency [rad/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Spiral Product</em>' containment reference.
	 * @see #setRollSpiralProduct(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_RollSpiralProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollSpiralProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollSpiralProduct();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getRollSpiralProduct <em>Roll Spiral Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Spiral Product</em>' containment reference.
	 * @see #getRollSpiralProduct()
	 * @generated
	 */
	void setRollSpiralProduct(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Durchroll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * handling qualities level of roll time constant
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Durchroll</em>' containment reference.
	 * @see #setDurchroll(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_Durchroll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='durchroll' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDurchroll();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getDurchroll <em>Durchroll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durchroll</em>' containment reference.
	 * @see #getDurchroll()
	 * @generated
	 */
	void setDurchroll(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * handling qualities level of roll spiral mode
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll</em>' containment reference.
	 * @see #setRoll(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqEiglatType_Roll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='roll' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRoll();

	/**
	 * Sets the value of the '{@link Cpacs.FqEiglatType#getRoll <em>Roll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' containment reference.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(DoubleBaseType value);

} // FqEiglatType
