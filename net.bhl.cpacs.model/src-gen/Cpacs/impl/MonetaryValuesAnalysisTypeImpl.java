/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MonetaryValuesAnalysisType;
import Cpacs.RecurringCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monetary Values Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MonetaryValuesAnalysisTypeImpl#getNonRecurringCost <em>Non Recurring Cost</em>}</li>
 *   <li>{@link Cpacs.impl.MonetaryValuesAnalysisTypeImpl#getRecurringCost <em>Recurring Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonetaryValuesAnalysisTypeImpl extends ComplexBaseTypeImpl implements MonetaryValuesAnalysisType {
	/**
	 * The cached value of the '{@link #getNonRecurringCost() <em>Non Recurring Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonRecurringCost()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nonRecurringCost;

	/**
	 * The cached value of the '{@link #getRecurringCost() <em>Recurring Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringCost()
	 * @generated
	 * @ordered
	 */
	protected RecurringCostType recurringCost;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonetaryValuesAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMonetaryValuesAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNonRecurringCost() {
		return nonRecurringCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNonRecurringCost(DoubleBaseType newNonRecurringCost, NotificationChain msgs) {
		DoubleBaseType oldNonRecurringCost = nonRecurringCost;
		nonRecurringCost = newNonRecurringCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST, oldNonRecurringCost,
					newNonRecurringCost);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonRecurringCost(DoubleBaseType newNonRecurringCost) {
		if (newNonRecurringCost != nonRecurringCost) {
			NotificationChain msgs = null;
			if (nonRecurringCost != null)
				msgs = ((InternalEObject) nonRecurringCost).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST, null,
						msgs);
			if (newNonRecurringCost != null)
				msgs = ((InternalEObject) newNonRecurringCost).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST, null,
						msgs);
			msgs = basicSetNonRecurringCost(newNonRecurringCost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST, newNonRecurringCost,
					newNonRecurringCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecurringCostType getRecurringCost() {
		return recurringCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecurringCost(RecurringCostType newRecurringCost, NotificationChain msgs) {
		RecurringCostType oldRecurringCost = recurringCost;
		recurringCost = newRecurringCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST, oldRecurringCost, newRecurringCost);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurringCost(RecurringCostType newRecurringCost) {
		if (newRecurringCost != recurringCost) {
			NotificationChain msgs = null;
			if (recurringCost != null)
				msgs = ((InternalEObject) recurringCost).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST, null,
						msgs);
			if (newRecurringCost != null)
				msgs = ((InternalEObject) newRecurringCost).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST, null,
						msgs);
			msgs = basicSetRecurringCost(newRecurringCost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST, newRecurringCost, newRecurringCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST:
			return basicSetNonRecurringCost(null, msgs);
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST:
			return basicSetRecurringCost(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST:
			return getNonRecurringCost();
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST:
			return getRecurringCost();
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
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST:
			setNonRecurringCost((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST:
			setRecurringCost((RecurringCostType) newValue);
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
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST:
			setNonRecurringCost((DoubleBaseType) null);
			return;
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST:
			setRecurringCost((RecurringCostType) null);
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
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__NON_RECURRING_COST:
			return nonRecurringCost != null;
		case CpacsPackage.MONETARY_VALUES_ANALYSIS_TYPE__RECURRING_COST:
			return recurringCost != null;
		}
		return super.eIsSet(featureID);
	}

} //MonetaryValuesAnalysisTypeImpl
