/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CrewCostType;
import Cpacs.GenericCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crew Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CrewCostTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CrewCostTypeImpl#getCockpitCrew <em>Cockpit Crew</em>}</li>
 *   <li>{@link Cpacs.impl.CrewCostTypeImpl#getFlightAttendants <em>Flight Attendants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewCostTypeImpl extends ComplexBaseTypeImpl implements CrewCostType {
	/**
	 * The cached value of the '{@link #getCostDescription() <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType costDescription;

	/**
	 * The cached value of the '{@link #getCockpitCrew() <em>Cockpit Crew</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCockpitCrew()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType cockpitCrew;

	/**
	 * The cached value of the '{@link #getFlightAttendants() <em>Flight Attendants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightAttendants()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType flightAttendants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrewCostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCrewCostType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getCostDescription() {
		return costDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCostDescription(GenericCostType newCostDescription, NotificationChain msgs) {
		GenericCostType oldCostDescription = costDescription;
		costDescription = newCostDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
	public void setCostDescription(GenericCostType newCostDescription) {
		if (newCostDescription != costDescription) {
			NotificationChain msgs = null;
			if (costDescription != null)
				msgs = ((InternalEObject) costDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getCockpitCrew() {
		return cockpitCrew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCockpitCrew(GenericCostType newCockpitCrew, NotificationChain msgs) {
		GenericCostType oldCockpitCrew = cockpitCrew;
		cockpitCrew = newCockpitCrew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW, oldCockpitCrew, newCockpitCrew);
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
	public void setCockpitCrew(GenericCostType newCockpitCrew) {
		if (newCockpitCrew != cockpitCrew) {
			NotificationChain msgs = null;
			if (cockpitCrew != null)
				msgs = ((InternalEObject) cockpitCrew).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW, null, msgs);
			if (newCockpitCrew != null)
				msgs = ((InternalEObject) newCockpitCrew).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW, null, msgs);
			msgs = basicSetCockpitCrew(newCockpitCrew, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW,
					newCockpitCrew, newCockpitCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getFlightAttendants() {
		return flightAttendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightAttendants(GenericCostType newFlightAttendants, NotificationChain msgs) {
		GenericCostType oldFlightAttendants = flightAttendants;
		flightAttendants = newFlightAttendants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS, oldFlightAttendants, newFlightAttendants);
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
	public void setFlightAttendants(GenericCostType newFlightAttendants) {
		if (newFlightAttendants != flightAttendants) {
			NotificationChain msgs = null;
			if (flightAttendants != null)
				msgs = ((InternalEObject) flightAttendants).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS, null, msgs);
			if (newFlightAttendants != null)
				msgs = ((InternalEObject) newFlightAttendants).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS, null, msgs);
			msgs = basicSetFlightAttendants(newFlightAttendants, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS,
					newFlightAttendants, newFlightAttendants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW:
			return basicSetCockpitCrew(null, msgs);
		case CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS:
			return basicSetFlightAttendants(null, msgs);
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
		case CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW:
			return getCockpitCrew();
		case CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS:
			return getFlightAttendants();
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
		case CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW:
			setCockpitCrew((GenericCostType) newValue);
			return;
		case CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS:
			setFlightAttendants((GenericCostType) newValue);
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
		case CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW:
			setCockpitCrew((GenericCostType) null);
			return;
		case CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS:
			setFlightAttendants((GenericCostType) null);
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
		case CpacsPackage.CREW_COST_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.CREW_COST_TYPE__COCKPIT_CREW:
			return cockpitCrew != null;
		case CpacsPackage.CREW_COST_TYPE__FLIGHT_ATTENDANTS:
			return flightAttendants != null;
		}
		return super.eIsSet(featureID);
	}

} //CrewCostTypeImpl
