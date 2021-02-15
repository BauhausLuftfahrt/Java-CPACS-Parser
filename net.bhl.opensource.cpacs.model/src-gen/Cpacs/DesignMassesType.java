/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Masses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DesignMassesType#getMTOM <em>MTOM</em>}</li>
 *   <li>{@link Cpacs.DesignMassesType#getMZFM <em>MZFM</em>}</li>
 *   <li>{@link Cpacs.DesignMassesType#getMMLM <em>MMLM</em>}</li>
 *   <li>{@link Cpacs.DesignMassesType#getMMRM <em>MMRM</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDesignMassesType()
 * @model extendedMetaData="name='designMassesType' kind='elementOnly'"
 * @generated
 */
public interface DesignMassesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>MTOM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take off mass
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MTOM</em>' containment reference.
	 * @see #setMTOM(GenericMassType)
	 * @see Cpacs.CpacsPackage#getDesignMassesType_MTOM()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mTOM' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMTOM();

	/**
	 * Sets the value of the '{@link Cpacs.DesignMassesType#getMTOM <em>MTOM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTOM</em>' containment reference.
	 * @see #getMTOM()
	 * @generated
	 */
	void setMTOM(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MZFM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zero Fuel mass
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MZFM</em>' containment reference.
	 * @see #setMZFM(GenericMassType)
	 * @see Cpacs.CpacsPackage#getDesignMassesType_MZFM()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mZFM' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMZFM();

	/**
	 * Sets the value of the '{@link Cpacs.DesignMassesType#getMZFM <em>MZFM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MZFM</em>' containment reference.
	 * @see #getMZFM()
	 * @generated
	 */
	void setMZFM(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MMLM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum landing mass
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MMLM</em>' containment reference.
	 * @see #setMMLM(GenericMassType)
	 * @see Cpacs.CpacsPackage#getDesignMassesType_MMLM()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mMLM' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMMLM();

	/**
	 * Sets the value of the '{@link Cpacs.DesignMassesType#getMMLM <em>MMLM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMLM</em>' containment reference.
	 * @see #getMMLM()
	 * @generated
	 */
	void setMMLM(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MMRM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum ramp mass (the maximum weight
	 *                                 authorised for the ground handling)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MMRM</em>' containment reference.
	 * @see #setMMRM(GenericMassType)
	 * @see Cpacs.CpacsPackage#getDesignMassesType_MMRM()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mMRM' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMMRM();

	/**
	 * Sets the value of the '{@link Cpacs.DesignMassesType#getMMRM <em>MMRM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMRM</em>' containment reference.
	 * @see #getMMRM()
	 * @generated
	 */
	void setMMRM(GenericMassType value);

} // DesignMassesType
