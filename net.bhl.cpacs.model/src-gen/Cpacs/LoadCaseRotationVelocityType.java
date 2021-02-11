/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Rotation Velocity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseRotationVelocityType#getP <em>P</em>}</li>
 *   <li>{@link Cpacs.LoadCaseRotationVelocityType#getQ <em>Q</em>}</li>
 *   <li>{@link Cpacs.LoadCaseRotationVelocityType#getR <em>R</em>}</li>
 *   <li>{@link Cpacs.LoadCaseRotationVelocityType#getPhiDot <em>Phi Dot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseRotationVelocityType#getThetaDot <em>Theta Dot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseRotationVelocityType#getPsiDot <em>Psi Dot</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseRotationVelocityType()
 * @model extendedMetaData="name='loadCaseRotationVelocityType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseRotationVelocityType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular velocity around x (body fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationVelocityType_P()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getP();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationVelocityType#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular velocity around y (body fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' containment reference.
	 * @see #setQ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationVelocityType_Q()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQ();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationVelocityType#getQ <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' containment reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular velocity around z (body fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>R</em>' containment reference.
	 * @see #setR(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationVelocityType_R()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='r' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getR();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationVelocityType#getR <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' containment reference.
	 * @see #getR()
	 * @generated
	 */
	void setR(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Phi Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular velocity around y (earth fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phi Dot</em>' containment reference.
	 * @see #setPhiDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationVelocityType_PhiDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phiDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhiDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationVelocityType#getPhiDot <em>Phi Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi Dot</em>' containment reference.
	 * @see #getPhiDot()
	 * @generated
	 */
	void setPhiDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Theta Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular velocity around x (earth fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theta Dot</em>' containment reference.
	 * @see #setThetaDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationVelocityType_ThetaDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thetaDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThetaDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationVelocityType#getThetaDot <em>Theta Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta Dot</em>' containment reference.
	 * @see #getThetaDot()
	 * @generated
	 */
	void setThetaDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Psi Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular velocity around z (earth fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Psi Dot</em>' containment reference.
	 * @see #setPsiDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationVelocityType_PsiDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='psiDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPsiDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationVelocityType#getPsiDot <em>Psi Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psi Dot</em>' containment reference.
	 * @see #getPsiDot()
	 * @generated
	 */
	void setPsiDot(DoubleBaseType value);

} // LoadCaseRotationVelocityType
