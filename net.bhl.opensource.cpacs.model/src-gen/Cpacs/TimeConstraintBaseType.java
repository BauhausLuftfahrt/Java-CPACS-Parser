/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TimeConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTimeConstraintBaseType()
 * @model extendedMetaData="name='timeConstraintBaseType' kind='simple'"
 * @generated
 */
public interface TimeConstraintBaseType extends TimeBaseType {
	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.RelationalOperatorType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Operator</em>' attribute.
	 * @see Cpacs.RelationalOperatorType1
	 * @see #isSetRelationalOperator()
	 * @see #unsetRelationalOperator()
	 * @see #setRelationalOperator(RelationalOperatorType1)
	 * @see Cpacs.CpacsPackage#getTimeConstraintBaseType_RelationalOperator()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='relationalOperator' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationalOperatorType1 getRelationalOperator();

	/**
	 * Sets the value of the '{@link Cpacs.TimeConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' attribute.
	 * @see Cpacs.RelationalOperatorType1
	 * @see #isSetRelationalOperator()
	 * @see #unsetRelationalOperator()
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(RelationalOperatorType1 value);

	/**
	 * Unsets the value of the '{@link Cpacs.TimeConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationalOperator()
	 * @see #getRelationalOperator()
	 * @see #setRelationalOperator(RelationalOperatorType1)
	 * @generated
	 */
	void unsetRelationalOperator();

	/**
	 * Returns whether the value of the '{@link Cpacs.TimeConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relational Operator</em>' attribute is set.
	 * @see #unsetRelationalOperator()
	 * @see #getRelationalOperator()
	 * @see #setRelationalOperator(RelationalOperatorType1)
	 * @generated
	 */
	boolean isSetRelationalOperator();

} // TimeConstraintBaseType
