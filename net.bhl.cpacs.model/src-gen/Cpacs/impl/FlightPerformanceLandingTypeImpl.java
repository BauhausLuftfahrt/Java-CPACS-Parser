/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightPerformanceLandingType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Landing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceLandingTypeImpl#getLdgDistance <em>Ldg Distance</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceLandingTypeImpl#getGrdPhaseDist <em>Grd Phase Dist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceLandingTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceLandingType {
	/**
	 * The cached value of the '{@link #getLdgDistance() <em>Ldg Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdgDistance()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType ldgDistance;

	/**
	 * The cached value of the '{@link #getGrdPhaseDist() <em>Grd Phase Dist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrdPhaseDist()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType grdPhaseDist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceLandingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceLandingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLdgDistance() {
		return ldgDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLdgDistance(DoubleBaseType newLdgDistance, NotificationChain msgs) {
		DoubleBaseType oldLdgDistance = ldgDistance;
		ldgDistance = newLdgDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE, oldLdgDistance, newLdgDistance);
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
	public void setLdgDistance(DoubleBaseType newLdgDistance) {
		if (newLdgDistance != ldgDistance) {
			NotificationChain msgs = null;
			if (ldgDistance != null)
				msgs = ((InternalEObject) ldgDistance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE, null,
						msgs);
			if (newLdgDistance != null)
				msgs = ((InternalEObject) newLdgDistance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE, null,
						msgs);
			msgs = basicSetLdgDistance(newLdgDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE, newLdgDistance, newLdgDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGrdPhaseDist() {
		return grdPhaseDist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrdPhaseDist(DoubleBaseType newGrdPhaseDist, NotificationChain msgs) {
		DoubleBaseType oldGrdPhaseDist = grdPhaseDist;
		grdPhaseDist = newGrdPhaseDist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST, oldGrdPhaseDist, newGrdPhaseDist);
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
	public void setGrdPhaseDist(DoubleBaseType newGrdPhaseDist) {
		if (newGrdPhaseDist != grdPhaseDist) {
			NotificationChain msgs = null;
			if (grdPhaseDist != null)
				msgs = ((InternalEObject) grdPhaseDist).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST, null,
						msgs);
			if (newGrdPhaseDist != null)
				msgs = ((InternalEObject) newGrdPhaseDist).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST, null,
						msgs);
			msgs = basicSetGrdPhaseDist(newGrdPhaseDist, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST, newGrdPhaseDist, newGrdPhaseDist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE:
			return basicSetLdgDistance(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST:
			return basicSetGrdPhaseDist(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE:
			return getLdgDistance();
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST:
			return getGrdPhaseDist();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE:
			setLdgDistance((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST:
			setGrdPhaseDist((DoubleBaseType) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE:
			setLdgDistance((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST:
			setGrdPhaseDist((DoubleBaseType) null);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__LDG_DISTANCE:
			return ldgDistance != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_LANDING_TYPE__GRD_PHASE_DIST:
			return grdPhaseDist != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightPerformanceLandingTypeImpl
