/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightAnalysisType;
import Cpacs.TotalOperatingCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightAnalysisTypeImpl#getTotalOperatingCost <em>Total Operating Cost</em>}</li>
 *   <li>{@link Cpacs.impl.FlightAnalysisTypeImpl#getRevenue <em>Revenue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightAnalysisTypeImpl extends ComplexBaseTypeImpl implements FlightAnalysisType {
	/**
	 * The cached value of the '{@link #getTotalOperatingCost() <em>Total Operating Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOperatingCost()
	 * @generated
	 * @ordered
	 */
	protected TotalOperatingCostType totalOperatingCost;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType revenue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TotalOperatingCostType getTotalOperatingCost() {
		return totalOperatingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalOperatingCost(TotalOperatingCostType newTotalOperatingCost,
			NotificationChain msgs) {
		TotalOperatingCostType oldTotalOperatingCost = totalOperatingCost;
		totalOperatingCost = newTotalOperatingCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST, oldTotalOperatingCost,
					newTotalOperatingCost);
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
	public void setTotalOperatingCost(TotalOperatingCostType newTotalOperatingCost) {
		if (newTotalOperatingCost != totalOperatingCost) {
			NotificationChain msgs = null;
			if (totalOperatingCost != null)
				msgs = ((InternalEObject) totalOperatingCost).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST, null, msgs);
			if (newTotalOperatingCost != null)
				msgs = ((InternalEObject) newTotalOperatingCost).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST, null, msgs);
			msgs = basicSetTotalOperatingCost(newTotalOperatingCost, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST, newTotalOperatingCost,
					newTotalOperatingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevenue(DoubleBaseType newRevenue, NotificationChain msgs) {
		DoubleBaseType oldRevenue = revenue;
		revenue = newRevenue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE, oldRevenue, newRevenue);
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
	public void setRevenue(DoubleBaseType newRevenue) {
		if (newRevenue != revenue) {
			NotificationChain msgs = null;
			if (revenue != null)
				msgs = ((InternalEObject) revenue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE, null, msgs);
			if (newRevenue != null)
				msgs = ((InternalEObject) newRevenue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE, null, msgs);
			msgs = basicSetRevenue(newRevenue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE,
					newRevenue, newRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST:
			return basicSetTotalOperatingCost(null, msgs);
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE:
			return basicSetRevenue(null, msgs);
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
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST:
			return getTotalOperatingCost();
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE:
			return getRevenue();
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
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST:
			setTotalOperatingCost((TotalOperatingCostType) newValue);
			return;
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE:
			setRevenue((DoubleBaseType) newValue);
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
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST:
			setTotalOperatingCost((TotalOperatingCostType) null);
			return;
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE:
			setRevenue((DoubleBaseType) null);
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
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__TOTAL_OPERATING_COST:
			return totalOperatingCost != null;
		case CpacsPackage.FLIGHT_ANALYSIS_TYPE__REVENUE:
			return revenue != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightAnalysisTypeImpl
