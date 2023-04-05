/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleConstraintBaseType;
import Cpacs.RelationalOperatorType2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Constraint Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DoubleConstraintBaseTypeImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleConstraintBaseTypeImpl extends DoubleBaseTypeImpl implements DoubleConstraintBaseType {
	/**
	 * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperatorType2 RELATIONAL_OPERATOR_EDEFAULT = RelationalOperatorType2.LT;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperatorType2 relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Relational Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationalOperatorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleConstraintBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDoubleConstraintBaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationalOperatorType2 getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationalOperator(RelationalOperatorType2 newRelationalOperator) {
		RelationalOperatorType2 oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator == null ? RELATIONAL_OPERATOR_EDEFAULT : newRelationalOperator;
		boolean oldRelationalOperatorESet = relationalOperatorESet;
		relationalOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR, oldRelationalOperator,
					relationalOperator, !oldRelationalOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRelationalOperator() {
		RelationalOperatorType2 oldRelationalOperator = relationalOperator;
		boolean oldRelationalOperatorESet = relationalOperatorESet;
		relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;
		relationalOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR, oldRelationalOperator,
					RELATIONAL_OPERATOR_EDEFAULT, oldRelationalOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelationalOperator() {
		return relationalOperatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			return getRelationalOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			setRelationalOperator((RelationalOperatorType2) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			unsetRelationalOperator();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CpacsPackage.DOUBLE_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			return isSetRelationalOperator();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (relationalOperator: ");
		if (relationalOperatorESet)
			result.append(relationalOperator);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DoubleConstraintBaseTypeImpl
