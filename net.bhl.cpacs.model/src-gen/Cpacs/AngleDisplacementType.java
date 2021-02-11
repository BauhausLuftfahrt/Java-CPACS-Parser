/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Displacement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AngleDisplacementType#getPhi <em>Phi</em>}</li>
 *   <li>{@link Cpacs.AngleDisplacementType#getTheta <em>Theta</em>}</li>
 *   <li>{@link Cpacs.AngleDisplacementType#getPsi <em>Psi</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAngleDisplacementType()
 * @model extendedMetaData="name='angleDisplacementType' kind='elementOnly'"
 * @generated
 */
public interface AngleDisplacementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Phi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * phi (euler agle) (bank angle)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phi</em>' containment reference.
	 * @see #setPhi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleDisplacementType_Phi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='phi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhi();

	/**
	 * Sets the value of the '{@link Cpacs.AngleDisplacementType#getPhi <em>Phi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' containment reference.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Theta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * theta (euler agle) (pich angle)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theta</em>' containment reference.
	 * @see #setTheta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleDisplacementType_Theta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='theta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTheta();

	/**
	 * Sets the value of the '{@link Cpacs.AngleDisplacementType#getTheta <em>Theta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' containment reference.
	 * @see #getTheta()
	 * @generated
	 */
	void setTheta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Psi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * psi (euler agle) (heading)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Psi</em>' containment reference.
	 * @see #setPsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAngleDisplacementType_Psi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='psi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPsi();

	/**
	 * Sets the value of the '{@link Cpacs.AngleDisplacementType#getPsi <em>Psi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psi</em>' containment reference.
	 * @see #getPsi()
	 * @generated
	 */
	void setPsi(DoubleBaseType value);

} // AngleDisplacementType
