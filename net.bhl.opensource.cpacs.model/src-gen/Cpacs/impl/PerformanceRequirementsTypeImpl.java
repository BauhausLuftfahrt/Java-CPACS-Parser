/**
 */
package Cpacs.impl;

import Cpacs.ControllabilityReqsType;
import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceRequirementsType;
import Cpacs.PerformanceRequirementsType;
import Cpacs.TrimRequirementsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PerformanceRequirementsTypeImpl#getFlightPerformanceRequirements <em>Flight Performance Requirements</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceRequirementsTypeImpl#getControllabilityRequirements <em>Controllability Requirements</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceRequirementsTypeImpl#getTrimRequirements <em>Trim Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceRequirementsTypeImpl extends ComplexBaseTypeImpl implements PerformanceRequirementsType {
	/**
	 * The cached value of the '{@link #getFlightPerformanceRequirements() <em>Flight Performance Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPerformanceRequirements()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformanceRequirementsType flightPerformanceRequirements;

	/**
	 * The cached value of the '{@link #getControllabilityRequirements() <em>Controllability Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllabilityRequirements()
	 * @generated
	 * @ordered
	 */
	protected ControllabilityReqsType controllabilityRequirements;

	/**
	 * The cached value of the '{@link #getTrimRequirements() <em>Trim Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimRequirements()
	 * @generated
	 * @ordered
	 */
	protected TrimRequirementsType trimRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceRequirementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPerformanceRequirementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceRequirementsType getFlightPerformanceRequirements() {
		return flightPerformanceRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPerformanceRequirements(
			FlightPerformanceRequirementsType newFlightPerformanceRequirements, NotificationChain msgs) {
		FlightPerformanceRequirementsType oldFlightPerformanceRequirements = flightPerformanceRequirements;
		flightPerformanceRequirements = newFlightPerformanceRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS,
					oldFlightPerformanceRequirements, newFlightPerformanceRequirements);
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
	public void setFlightPerformanceRequirements(FlightPerformanceRequirementsType newFlightPerformanceRequirements) {
		if (newFlightPerformanceRequirements != flightPerformanceRequirements) {
			NotificationChain msgs = null;
			if (flightPerformanceRequirements != null)
				msgs = ((InternalEObject) flightPerformanceRequirements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS,
						null, msgs);
			if (newFlightPerformanceRequirements != null)
				msgs = ((InternalEObject) newFlightPerformanceRequirements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS,
						null, msgs);
			msgs = basicSetFlightPerformanceRequirements(newFlightPerformanceRequirements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS,
					newFlightPerformanceRequirements, newFlightPerformanceRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControllabilityReqsType getControllabilityRequirements() {
		return controllabilityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControllabilityRequirements(ControllabilityReqsType newControllabilityRequirements,
			NotificationChain msgs) {
		ControllabilityReqsType oldControllabilityRequirements = controllabilityRequirements;
		controllabilityRequirements = newControllabilityRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS,
					oldControllabilityRequirements, newControllabilityRequirements);
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
	public void setControllabilityRequirements(ControllabilityReqsType newControllabilityRequirements) {
		if (newControllabilityRequirements != controllabilityRequirements) {
			NotificationChain msgs = null;
			if (controllabilityRequirements != null)
				msgs = ((InternalEObject) controllabilityRequirements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS, null, msgs);
			if (newControllabilityRequirements != null)
				msgs = ((InternalEObject) newControllabilityRequirements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS, null, msgs);
			msgs = basicSetControllabilityRequirements(newControllabilityRequirements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS,
					newControllabilityRequirements, newControllabilityRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrimRequirementsType getTrimRequirements() {
		return trimRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrimRequirements(TrimRequirementsType newTrimRequirements,
			NotificationChain msgs) {
		TrimRequirementsType oldTrimRequirements = trimRequirements;
		trimRequirements = newTrimRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS, oldTrimRequirements,
					newTrimRequirements);
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
	public void setTrimRequirements(TrimRequirementsType newTrimRequirements) {
		if (newTrimRequirements != trimRequirements) {
			NotificationChain msgs = null;
			if (trimRequirements != null)
				msgs = ((InternalEObject) trimRequirements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS, null,
						msgs);
			if (newTrimRequirements != null)
				msgs = ((InternalEObject) newTrimRequirements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS, null,
						msgs);
			msgs = basicSetTrimRequirements(newTrimRequirements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS, newTrimRequirements,
					newTrimRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS:
			return basicSetFlightPerformanceRequirements(null, msgs);
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS:
			return basicSetControllabilityRequirements(null, msgs);
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS:
			return basicSetTrimRequirements(null, msgs);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS:
			return getFlightPerformanceRequirements();
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS:
			return getControllabilityRequirements();
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS:
			return getTrimRequirements();
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS:
			setFlightPerformanceRequirements((FlightPerformanceRequirementsType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS:
			setControllabilityRequirements((ControllabilityReqsType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS:
			setTrimRequirements((TrimRequirementsType) newValue);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS:
			setFlightPerformanceRequirements((FlightPerformanceRequirementsType) null);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS:
			setControllabilityRequirements((ControllabilityReqsType) null);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS:
			setTrimRequirements((TrimRequirementsType) null);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENTS:
			return flightPerformanceRequirements != null;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__CONTROLLABILITY_REQUIREMENTS:
			return controllabilityRequirements != null;
		case CpacsPackage.PERFORMANCE_REQUIREMENTS_TYPE__TRIM_REQUIREMENTS:
			return trimRequirements != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformanceRequirementsTypeImpl
