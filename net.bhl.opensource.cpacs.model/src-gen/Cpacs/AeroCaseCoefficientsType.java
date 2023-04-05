/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Case Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroCaseCoefficientsType#getCd <em>Cd</em>}</li>
 *   <li>{@link Cpacs.AeroCaseCoefficientsType#getCs <em>Cs</em>}</li>
 *   <li>{@link Cpacs.AeroCaseCoefficientsType#getCl <em>Cl</em>}</li>
 *   <li>{@link Cpacs.AeroCaseCoefficientsType#getCmd <em>Cmd</em>}</li>
 *   <li>{@link Cpacs.AeroCaseCoefficientsType#getCms <em>Cms</em>}</li>
 *   <li>{@link Cpacs.AeroCaseCoefficientsType#getCml <em>Cml</em>}</li>
 *   <li>{@link Cpacs.AeroCaseCoefficientsType#getDragContributions <em>Drag Contributions</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType()
 * @model extendedMetaData="name='aeroCaseCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface AeroCaseCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag coefficient in aerodynamic
	 *                                 coordinates
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType_Cd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getCd();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseCoefficientsType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Coefficient of the side force vector in
	 *                                 aerodynamic coordinates (perpendicular
	 *                                 to lift and drag)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cs</em>' containment reference.
	 * @see #setCs(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType_Cs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getCs();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseCoefficientsType#getCs <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs</em>' containment reference.
	 * @see #getCs()
	 * @generated
	 */
	void setCs(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Lift coefficient in aerodynamic
	 *                                 coordinates
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cl</em>' containment reference.
	 * @see #setCl(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType_Cl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cl' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getCl();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseCoefficientsType#getCl <em>Cl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cl</em>' containment reference.
	 * @see #getCl()
	 * @generated
	 */
	void setCl(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Aerodynamic moment around d-axis of the aerodynamic coordinate system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmd</em>' containment reference.
	 * @see #setCmd(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType_Cmd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmd' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getCmd();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseCoefficientsType#getCmd <em>Cmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' containment reference.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Aerodynamic moment around s-axis of the aerodynamic coordinate system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cms</em>' containment reference.
	 * @see #setCms(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType_Cms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cms' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getCms();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseCoefficientsType#getCms <em>Cms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cms</em>' containment reference.
	 * @see #getCms()
	 * @generated
	 */
	void setCms(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Aerodynamic moment around l-axis of the aerodynamic coordinate system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cml</em>' containment reference.
	 * @see #setCml(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType_Cml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cml' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getCml();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseCoefficientsType#getCml <em>Cml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cml</em>' containment reference.
	 * @see #getCml()
	 * @generated
	 */
	void setCml(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Drag Contributions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drag Contributions</em>' containment reference.
	 * @see #setDragContributions(DragContributionsType)
	 * @see Cpacs.CpacsPackage#getAeroCaseCoefficientsType_DragContributions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dragContributions' namespace='##targetNamespace'"
	 * @generated
	 */
	DragContributionsType getDragContributions();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseCoefficientsType#getDragContributions <em>Drag Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drag Contributions</em>' containment reference.
	 * @see #getDragContributions()
	 * @generated
	 */
	void setDragContributions(DragContributionsType value);

} // AeroCaseCoefficientsType
