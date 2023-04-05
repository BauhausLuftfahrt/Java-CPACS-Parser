/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightDynamicsAnalysisType;
import Cpacs.FlightPerformanceCasesType;
import Cpacs.FlyingQualitiesCasesType;
import Cpacs.TrimType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsAnalysisTypeImpl#getTrim <em>Trim</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsAnalysisTypeImpl#getFlyingQualities <em>Flying Qualities</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsAnalysisTypeImpl#getFlightPerformance <em>Flight Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsAnalysisTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsAnalysisType {
	/**
	 * The cached value of the '{@link #getTrim() <em>Trim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrim()
	 * @generated
	 * @ordered
	 */
	protected TrimType trim;

	/**
	 * The cached value of the '{@link #getFlyingQualities() <em>Flying Qualities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlyingQualities()
	 * @generated
	 * @ordered
	 */
	protected FlyingQualitiesCasesType flyingQualities;

	/**
	 * The cached value of the '{@link #getFlightPerformance() <em>Flight Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPerformance()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformanceCasesType flightPerformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrimType getTrim() {
		return trim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrim(TrimType newTrim, NotificationChain msgs) {
		TrimType oldTrim = trim;
		trim = newTrim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM, oldTrim, newTrim);
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
	public void setTrim(TrimType newTrim) {
		if (newTrim != trim) {
			NotificationChain msgs = null;
			if (trim != null)
				msgs = ((InternalEObject) trim).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM, null, msgs);
			if (newTrim != null)
				msgs = ((InternalEObject) newTrim).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM, null, msgs);
			msgs = basicSetTrim(newTrim, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM,
					newTrim, newTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlyingQualitiesCasesType getFlyingQualities() {
		return flyingQualities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlyingQualities(FlyingQualitiesCasesType newFlyingQualities,
			NotificationChain msgs) {
		FlyingQualitiesCasesType oldFlyingQualities = flyingQualities;
		flyingQualities = newFlyingQualities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES, oldFlyingQualities,
					newFlyingQualities);
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
	public void setFlyingQualities(FlyingQualitiesCasesType newFlyingQualities) {
		if (newFlyingQualities != flyingQualities) {
			NotificationChain msgs = null;
			if (flyingQualities != null)
				msgs = ((InternalEObject) flyingQualities).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES, null,
						msgs);
			if (newFlyingQualities != null)
				msgs = ((InternalEObject) newFlyingQualities).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES, null,
						msgs);
			msgs = basicSetFlyingQualities(newFlyingQualities, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES, newFlyingQualities,
					newFlyingQualities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceCasesType getFlightPerformance() {
		return flightPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPerformance(FlightPerformanceCasesType newFlightPerformance,
			NotificationChain msgs) {
		FlightPerformanceCasesType oldFlightPerformance = flightPerformance;
		flightPerformance = newFlightPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE, oldFlightPerformance,
					newFlightPerformance);
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
	public void setFlightPerformance(FlightPerformanceCasesType newFlightPerformance) {
		if (newFlightPerformance != flightPerformance) {
			NotificationChain msgs = null;
			if (flightPerformance != null)
				msgs = ((InternalEObject) flightPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE, null,
						msgs);
			if (newFlightPerformance != null)
				msgs = ((InternalEObject) newFlightPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE, null,
						msgs);
			msgs = basicSetFlightPerformance(newFlightPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE, newFlightPerformance,
					newFlightPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM:
			return basicSetTrim(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES:
			return basicSetFlyingQualities(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE:
			return basicSetFlightPerformance(null, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM:
			return getTrim();
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES:
			return getFlyingQualities();
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE:
			return getFlightPerformance();
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM:
			setTrim((TrimType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES:
			setFlyingQualities((FlyingQualitiesCasesType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE:
			setFlightPerformance((FlightPerformanceCasesType) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM:
			setTrim((TrimType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES:
			setFlyingQualities((FlyingQualitiesCasesType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE:
			setFlightPerformance((FlightPerformanceCasesType) null);
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
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__TRIM:
			return trim != null;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLYING_QUALITIES:
			return flyingQualities != null;
		case CpacsPackage.FLIGHT_DYNAMICS_ANALYSIS_TYPE__FLIGHT_PERFORMANCE:
			return flightPerformance != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightDynamicsAnalysisTypeImpl
