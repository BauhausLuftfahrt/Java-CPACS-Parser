/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Vector Constraint Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoubleVectorConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoubleVectorConstraintBaseType()
 * @model extendedMetaData="name='doubleVectorConstraintBaseType' kind='simple'"
 * @generated
 */
public interface DoubleVectorConstraintBaseType extends DoubleVectorBaseType {
	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.RelationalOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Operator</em>' attribute.
	 * @see Cpacs.RelationalOperatorType
	 * @see #isSetRelationalOperator()
	 * @see #unsetRelationalOperator()
	 * @see #setRelationalOperator(RelationalOperatorType)
	 * @see Cpacs.CpacsPackage#getDoubleVectorConstraintBaseType_RelationalOperator()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='relationalOperator' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationalOperatorType getRelationalOperator();

	/**
	 * Sets the value of the '{@link Cpacs.DoubleVectorConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' attribute.
	 * @see Cpacs.RelationalOperatorType
	 * @see #isSetRelationalOperator()
	 * @see #unsetRelationalOperator()
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(RelationalOperatorType value);

	/**
	 * Unsets the value of the '{@link Cpacs.DoubleVectorConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationalOperator()
	 * @see #getRelationalOperator()
	 * @see #setRelationalOperator(RelationalOperatorType)
	 * @generated
	 */
	void unsetRelationalOperator();

	/**
	 * Returns whether the value of the '{@link Cpacs.DoubleVectorConstraintBaseType#getRelationalOperator <em>Relational Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relational Operator</em>' attribute is set.
	 * @see #unsetRelationalOperator()
	 * @see #getRelationalOperator()
	 * @see #setRelationalOperator(RelationalOperatorType)
	 * @generated
	 */
	boolean isSetRelationalOperator();

} // DoubleVectorConstraintBaseType
