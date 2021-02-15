/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dam Tol Behaviour Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DamTolBehaviourType#getWalkerDamageTolerance <em>Walker Damage Tolerance</em>}</li>
 *   <li>{@link Cpacs.DamTolBehaviourType#getFormanDamageTolerance <em>Forman Damage Tolerance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDamTolBehaviourType()
 * @model extendedMetaData="name='damTolBehaviourType' kind='elementOnly'"
 * @generated
 */
public interface DamTolBehaviourType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Walker Damage Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Damage tolerance law, Walker approach
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Walker Damage Tolerance</em>' containment reference.
	 * @see #setWalkerDamageTolerance(DamTolWalkerType)
	 * @see Cpacs.CpacsPackage#getDamTolBehaviourType_WalkerDamageTolerance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WalkerDamageTolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	DamTolWalkerType getWalkerDamageTolerance();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolBehaviourType#getWalkerDamageTolerance <em>Walker Damage Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walker Damage Tolerance</em>' containment reference.
	 * @see #getWalkerDamageTolerance()
	 * @generated
	 */
	void setWalkerDamageTolerance(DamTolWalkerType value);

	/**
	 * Returns the value of the '<em><b>Forman Damage Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Damage tolerance law, Forman approach
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forman Damage Tolerance</em>' containment reference.
	 * @see #setFormanDamageTolerance(DamTolFormanType)
	 * @see Cpacs.CpacsPackage#getDamTolBehaviourType_FormanDamageTolerance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FormanDamageTolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	DamTolFormanType getFormanDamageTolerance();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolBehaviourType#getFormanDamageTolerance <em>Forman Damage Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forman Damage Tolerance</em>' containment reference.
	 * @see #getFormanDamageTolerance()
	 * @generated
	 */
	void setFormanDamageTolerance(DamTolFormanType value);

} // DamTolBehaviourType
