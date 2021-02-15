/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monetary Values Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MonetaryValuesAnalysisType#getNonRecurringCost <em>Non Recurring Cost</em>}</li>
 *   <li>{@link Cpacs.MonetaryValuesAnalysisType#getRecurringCost <em>Recurring Cost</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMonetaryValuesAnalysisType()
 * @model extendedMetaData="name='monetaryValuesAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface MonetaryValuesAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Non Recurring Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Recurring Cost</em>' containment reference.
	 * @see #setNonRecurringCost(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMonetaryValuesAnalysisType_NonRecurringCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nonRecurringCost' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNonRecurringCost();

	/**
	 * Sets the value of the '{@link Cpacs.MonetaryValuesAnalysisType#getNonRecurringCost <em>Non Recurring Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Recurring Cost</em>' containment reference.
	 * @see #getNonRecurringCost()
	 * @generated
	 */
	void setNonRecurringCost(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Recurring Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurring Cost</em>' containment reference.
	 * @see #setRecurringCost(RecurringCostType)
	 * @see Cpacs.CpacsPackage#getMonetaryValuesAnalysisType_RecurringCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recurringCost' namespace='##targetNamespace'"
	 * @generated
	 */
	RecurringCostType getRecurringCost();

	/**
	 * Sets the value of the '{@link Cpacs.MonetaryValuesAnalysisType#getRecurringCost <em>Recurring Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurring Cost</em>' containment reference.
	 * @see #getRecurringCost()
	 * @generated
	 */
	void setRecurringCost(RecurringCostType value);

} // MonetaryValuesAnalysisType
