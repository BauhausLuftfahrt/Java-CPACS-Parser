/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fatigue Behaviour Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FatigueBehaviourType#getStressBasedBrownMillerFatigue <em>Stress Based Brown Miller Fatigue</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFatigueBehaviourType()
 * @model extendedMetaData="name='fatigueBehaviourType' kind='elementOnly'"
 * @generated
 */
public interface FatigueBehaviourType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Stress Based Brown Miller Fatigue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fatigue law, stress based Brown Miller approach [N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stress Based Brown Miller Fatigue</em>' containment reference.
	 * @see #setStressBasedBrownMillerFatigue(FatigueStressBasedBrownMillerType)
	 * @see Cpacs.CpacsPackage#getFatigueBehaviourType_StressBasedBrownMillerFatigue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stressBasedBrownMillerFatigue' namespace='##targetNamespace'"
	 * @generated
	 */
	FatigueStressBasedBrownMillerType getStressBasedBrownMillerFatigue();

	/**
	 * Sets the value of the '{@link Cpacs.FatigueBehaviourType#getStressBasedBrownMillerFatigue <em>Stress Based Brown Miller Fatigue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stress Based Brown Miller Fatigue</em>' containment reference.
	 * @see #getStressBasedBrownMillerFatigue()
	 * @generated
	 */
	void setStressBasedBrownMillerFatigue(FatigueStressBasedBrownMillerType value);

} // FatigueBehaviourType
