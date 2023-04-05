/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RelationalOperatorType1;
import Cpacs.TimeConstraintBaseType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Constraint Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TimeConstraintBaseTypeImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeConstraintBaseTypeImpl extends TimeBaseTypeImpl implements TimeConstraintBaseType {
	/**
	 * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperatorType1 RELATIONAL_OPERATOR_EDEFAULT = RelationalOperatorType1.LT;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperatorType1 relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

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
	protected TimeConstraintBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTimeConstraintBaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationalOperatorType1 getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationalOperator(RelationalOperatorType1 newRelationalOperator) {
		RelationalOperatorType1 oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator == null ? RELATIONAL_OPERATOR_EDEFAULT : newRelationalOperator;
		boolean oldRelationalOperatorESet = relationalOperatorESet;
		relationalOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TIME_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR, oldRelationalOperator,
					relationalOperator, !oldRelationalOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRelationalOperator() {
		RelationalOperatorType1 oldRelationalOperator = relationalOperator;
		boolean oldRelationalOperatorESet = relationalOperatorESet;
		relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;
		relationalOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.TIME_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR, oldRelationalOperator,
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
		case CpacsPackage.TIME_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
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
		case CpacsPackage.TIME_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
			setRelationalOperator((RelationalOperatorType1) newValue);
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
		case CpacsPackage.TIME_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
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
		case CpacsPackage.TIME_CONSTRAINT_BASE_TYPE__RELATIONAL_OPERATOR:
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

} //TimeConstraintBaseTypeImpl
