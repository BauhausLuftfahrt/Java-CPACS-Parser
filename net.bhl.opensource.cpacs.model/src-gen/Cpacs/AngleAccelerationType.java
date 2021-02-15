/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Acceleration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AngleAccelerationType#getPDot <em>PDot</em>}</li>
 *   <li>{@link Cpacs.AngleAccelerationType#getQDot <em>QDot</em>}</li>
 *   <li>{@link Cpacs.AngleAccelerationType#getRDot <em>RDot</em>}</li>
 *   <li>{@link Cpacs.AngleAccelerationType#getPhiDotDot <em>Phi Dot Dot</em>}</li>
 *   <li>{@link Cpacs.AngleAccelerationType#getThetaDotDot <em>Theta Dot Dot</em>}</li>
 *   <li>{@link Cpacs.AngleAccelerationType#getPsiDotDot <em>Psi Dot Dot</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAngleAccelerationType()
 * @model extendedMetaData="name='angleAccelerationType' kind='elementOnly'"
 * @generated
 */
public interface AngleAccelerationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>PDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular acceleration around x (body fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PDot</em>' containment reference.
	 * @see #setPDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleAccelerationType_PDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPDot();

	/**
	 * Sets the value of the '{@link Cpacs.AngleAccelerationType#getPDot <em>PDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDot</em>' containment reference.
	 * @see #getPDot()
	 * @generated
	 */
	void setPDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>QDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular acceleration around y (body fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>QDot</em>' containment reference.
	 * @see #setQDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleAccelerationType_QDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQDot();

	/**
	 * Sets the value of the '{@link Cpacs.AngleAccelerationType#getQDot <em>QDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QDot</em>' containment reference.
	 * @see #getQDot()
	 * @generated
	 */
	void setQDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>RDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular acceleration around z (body fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RDot</em>' containment reference.
	 * @see #setRDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleAccelerationType_RDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRDot();

	/**
	 * Sets the value of the '{@link Cpacs.AngleAccelerationType#getRDot <em>RDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDot</em>' containment reference.
	 * @see #getRDot()
	 * @generated
	 */
	void setRDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Phi Dot Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular acceleration around phi (earth fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phi Dot Dot</em>' containment reference.
	 * @see #setPhiDotDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleAccelerationType_PhiDotDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phiDotDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhiDotDot();

	/**
	 * Sets the value of the '{@link Cpacs.AngleAccelerationType#getPhiDotDot <em>Phi Dot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi Dot Dot</em>' containment reference.
	 * @see #getPhiDotDot()
	 * @generated
	 */
	void setPhiDotDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Theta Dot Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular acceleration around theta (earth
	 *                                     fixed coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theta Dot Dot</em>' containment reference.
	 * @see #setThetaDotDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleAccelerationType_ThetaDotDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thetaDotDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThetaDotDot();

	/**
	 * Sets the value of the '{@link Cpacs.AngleAccelerationType#getThetaDotDot <em>Theta Dot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta Dot Dot</em>' containment reference.
	 * @see #getThetaDotDot()
	 * @generated
	 */
	void setThetaDotDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Psi Dot Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angular acceleration around psi (earth fixed
	 *                                     coord.sys.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Psi Dot Dot</em>' containment reference.
	 * @see #setPsiDotDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleAccelerationType_PsiDotDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='psiDotDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPsiDotDot();

	/**
	 * Sets the value of the '{@link Cpacs.AngleAccelerationType#getPsiDotDot <em>Psi Dot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psi Dot Dot</em>' containment reference.
	 * @see #getPsiDotDot()
	 * @generated
	 */
	void setPsiDotDot(DoubleBaseType value);

} // AngleAccelerationType
