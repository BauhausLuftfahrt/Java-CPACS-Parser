/**
 */
package Cpacs.impl;

import Cpacs.AircraftGlobalType;
import Cpacs.AirportCompatabilityGlobalType;
import Cpacs.CpacsPackage;
import Cpacs.PayloadGlobalType;
import Cpacs.PerformanceTargetsGlobalType;
import Cpacs.RequirementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aircraft Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AircraftGlobalTypeImpl#getDesignRange <em>Design Range</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftGlobalTypeImpl#getPayload <em>Payload</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftGlobalTypeImpl#getAirportCompatability <em>Airport Compatability</em>}</li>
 *   <li>{@link Cpacs.impl.AircraftGlobalTypeImpl#getPerformanceTargets <em>Performance Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AircraftGlobalTypeImpl extends ComplexBaseTypeImpl implements AircraftGlobalType {
	/**
	 * The cached value of the '{@link #getDesignRange() <em>Design Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignRange()
	 * @generated
	 * @ordered
	 */
	protected RequirementType designRange;

	/**
	 * The cached value of the '{@link #getPayload() <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayload()
	 * @generated
	 * @ordered
	 */
	protected PayloadGlobalType payload;

	/**
	 * The cached value of the '{@link #getAirportCompatability() <em>Airport Compatability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirportCompatability()
	 * @generated
	 * @ordered
	 */
	protected AirportCompatabilityGlobalType airportCompatability;

	/**
	 * The cached value of the '{@link #getPerformanceTargets() <em>Performance Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceTargets()
	 * @generated
	 * @ordered
	 */
	protected PerformanceTargetsGlobalType performanceTargets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AircraftGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAircraftGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getDesignRange() {
		return designRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignRange(RequirementType newDesignRange, NotificationChain msgs) {
		RequirementType oldDesignRange = designRange;
		designRange = newDesignRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE, oldDesignRange, newDesignRange);
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
	public void setDesignRange(RequirementType newDesignRange) {
		if (newDesignRange != designRange) {
			NotificationChain msgs = null;
			if (designRange != null)
				msgs = ((InternalEObject) designRange).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE, null, msgs);
			if (newDesignRange != null)
				msgs = ((InternalEObject) newDesignRange).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE, null, msgs);
			msgs = basicSetDesignRange(newDesignRange, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE,
					newDesignRange, newDesignRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayloadGlobalType getPayload() {
		return payload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayload(PayloadGlobalType newPayload, NotificationChain msgs) {
		PayloadGlobalType oldPayload = payload;
		payload = newPayload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD, oldPayload, newPayload);
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
	public void setPayload(PayloadGlobalType newPayload) {
		if (newPayload != payload) {
			NotificationChain msgs = null;
			if (payload != null)
				msgs = ((InternalEObject) payload).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD, null, msgs);
			if (newPayload != null)
				msgs = ((InternalEObject) newPayload).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD, null, msgs);
			msgs = basicSetPayload(newPayload, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD,
					newPayload, newPayload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirportCompatabilityGlobalType getAirportCompatability() {
		return airportCompatability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirportCompatability(AirportCompatabilityGlobalType newAirportCompatability,
			NotificationChain msgs) {
		AirportCompatabilityGlobalType oldAirportCompatability = airportCompatability;
		airportCompatability = newAirportCompatability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY, oldAirportCompatability,
					newAirportCompatability);
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
	public void setAirportCompatability(AirportCompatabilityGlobalType newAirportCompatability) {
		if (newAirportCompatability != airportCompatability) {
			NotificationChain msgs = null;
			if (airportCompatability != null)
				msgs = ((InternalEObject) airportCompatability).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY, null, msgs);
			if (newAirportCompatability != null)
				msgs = ((InternalEObject) newAirportCompatability).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY, null, msgs);
			msgs = basicSetAirportCompatability(newAirportCompatability, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY, newAirportCompatability,
					newAirportCompatability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceTargetsGlobalType getPerformanceTargets() {
		return performanceTargets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceTargets(PerformanceTargetsGlobalType newPerformanceTargets,
			NotificationChain msgs) {
		PerformanceTargetsGlobalType oldPerformanceTargets = performanceTargets;
		performanceTargets = newPerformanceTargets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS, oldPerformanceTargets,
					newPerformanceTargets);
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
	public void setPerformanceTargets(PerformanceTargetsGlobalType newPerformanceTargets) {
		if (newPerformanceTargets != performanceTargets) {
			NotificationChain msgs = null;
			if (performanceTargets != null)
				msgs = ((InternalEObject) performanceTargets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS, null, msgs);
			if (newPerformanceTargets != null)
				msgs = ((InternalEObject) newPerformanceTargets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS, null, msgs);
			msgs = basicSetPerformanceTargets(newPerformanceTargets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS, newPerformanceTargets,
					newPerformanceTargets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE:
			return basicSetDesignRange(null, msgs);
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD:
			return basicSetPayload(null, msgs);
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY:
			return basicSetAirportCompatability(null, msgs);
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS:
			return basicSetPerformanceTargets(null, msgs);
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
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE:
			return getDesignRange();
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD:
			return getPayload();
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY:
			return getAirportCompatability();
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS:
			return getPerformanceTargets();
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
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE:
			setDesignRange((RequirementType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD:
			setPayload((PayloadGlobalType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY:
			setAirportCompatability((AirportCompatabilityGlobalType) newValue);
			return;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS:
			setPerformanceTargets((PerformanceTargetsGlobalType) newValue);
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
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE:
			setDesignRange((RequirementType) null);
			return;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD:
			setPayload((PayloadGlobalType) null);
			return;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY:
			setAirportCompatability((AirportCompatabilityGlobalType) null);
			return;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS:
			setPerformanceTargets((PerformanceTargetsGlobalType) null);
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
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__DESIGN_RANGE:
			return designRange != null;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PAYLOAD:
			return payload != null;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__AIRPORT_COMPATABILITY:
			return airportCompatability != null;
		case CpacsPackage.AIRCRAFT_GLOBAL_TYPE__PERFORMANCE_TARGETS:
			return performanceTargets != null;
		}
		return super.eIsSet(featureID);
	}

} //AircraftGlobalTypeImpl
