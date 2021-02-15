/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceTakeoffType;
import Cpacs.TakeoffPerformanceParametersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Takeoff Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceTakeoffTypeImpl#getVMinLOF <em>VMin LOF</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceTakeoffTypeImpl#getV2Min <em>V2 Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceTakeoffTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceTakeoffType {
	/**
	 * The cached value of the '{@link #getVMinLOF() <em>VMin LOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMinLOF()
	 * @generated
	 * @ordered
	 */
	protected TakeoffPerformanceParametersType vMinLOF;

	/**
	 * The cached value of the '{@link #getV2Min() <em>V2 Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2Min()
	 * @generated
	 * @ordered
	 */
	protected TakeoffPerformanceParametersType v2Min;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceTakeoffTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceTakeoffType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TakeoffPerformanceParametersType getVMinLOF() {
		return vMinLOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVMinLOF(TakeoffPerformanceParametersType newVMinLOF, NotificationChain msgs) {
		TakeoffPerformanceParametersType oldVMinLOF = vMinLOF;
		vMinLOF = newVMinLOF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF, oldVMinLOF, newVMinLOF);
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
	public void setVMinLOF(TakeoffPerformanceParametersType newVMinLOF) {
		if (newVMinLOF != vMinLOF) {
			NotificationChain msgs = null;
			if (vMinLOF != null)
				msgs = ((InternalEObject) vMinLOF).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF, null, msgs);
			if (newVMinLOF != null)
				msgs = ((InternalEObject) newVMinLOF).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF, null, msgs);
			msgs = basicSetVMinLOF(newVMinLOF, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF, newVMinLOF, newVMinLOF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TakeoffPerformanceParametersType getV2Min() {
		return v2Min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV2Min(TakeoffPerformanceParametersType newV2Min, NotificationChain msgs) {
		TakeoffPerformanceParametersType oldV2Min = v2Min;
		v2Min = newV2Min;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN, oldV2Min, newV2Min);
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
	public void setV2Min(TakeoffPerformanceParametersType newV2Min) {
		if (newV2Min != v2Min) {
			NotificationChain msgs = null;
			if (v2Min != null)
				msgs = ((InternalEObject) v2Min).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN, null, msgs);
			if (newV2Min != null)
				msgs = ((InternalEObject) newV2Min).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN, null, msgs);
			msgs = basicSetV2Min(newV2Min, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN,
					newV2Min, newV2Min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF:
			return basicSetVMinLOF(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN:
			return basicSetV2Min(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF:
			return getVMinLOF();
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN:
			return getV2Min();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF:
			setVMinLOF((TakeoffPerformanceParametersType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN:
			setV2Min((TakeoffPerformanceParametersType) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF:
			setVMinLOF((TakeoffPerformanceParametersType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN:
			setV2Min((TakeoffPerformanceParametersType) null);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__VMIN_LOF:
			return vMinLOF != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_TAKEOFF_TYPE__V2_MIN:
			return v2Min != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightPerformanceTakeoffTypeImpl
