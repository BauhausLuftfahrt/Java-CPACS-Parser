/**
 */
package Cpacs.impl;

import Cpacs.ChargesCostType;
import Cpacs.CpacsPackage;
import Cpacs.CrewCostType;
import Cpacs.DirectOperatingCostType;
import Cpacs.GenericCostType;
import Cpacs.MaintenanceCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Operating Cost Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DirectOperatingCostTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.DirectOperatingCostTypeImpl#getFuel <em>Fuel</em>}</li>
 *   <li>{@link Cpacs.impl.DirectOperatingCostTypeImpl#getCharges <em>Charges</em>}</li>
 *   <li>{@link Cpacs.impl.DirectOperatingCostTypeImpl#getMaintenance <em>Maintenance</em>}</li>
 *   <li>{@link Cpacs.impl.DirectOperatingCostTypeImpl#getCrew <em>Crew</em>}</li>
 *   <li>{@link Cpacs.impl.DirectOperatingCostTypeImpl#getDepreciation <em>Depreciation</em>}</li>
 *   <li>{@link Cpacs.impl.DirectOperatingCostTypeImpl#getInsurance <em>Insurance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectOperatingCostTypeImpl extends ComplexBaseTypeImpl implements DirectOperatingCostType {
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
	 * The cached value of the '{@link #getFuel() <em>Fuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuel()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType fuel;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected ChargesCostType charges;

	/**
	 * The cached value of the '{@link #getMaintenance() <em>Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintenance()
	 * @generated
	 * @ordered
	 */
	protected MaintenanceCostType maintenance;

	/**
	 * The cached value of the '{@link #getCrew() <em>Crew</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrew()
	 * @generated
	 * @ordered
	 */
	protected CrewCostType crew;

	/**
	 * The cached value of the '{@link #getDepreciation() <em>Depreciation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepreciation()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType depreciation;

	/**
	 * The cached value of the '{@link #getInsurance() <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurance()
	 * @generated
	 * @ordered
	 */
	protected GenericCostType insurance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectOperatingCostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDirectOperatingCostType();
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
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION, newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getFuel() {
		return fuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuel(GenericCostType newFuel, NotificationChain msgs) {
		GenericCostType oldFuel = fuel;
		fuel = newFuel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL, oldFuel, newFuel);
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
	public void setFuel(GenericCostType newFuel) {
		if (newFuel != fuel) {
			NotificationChain msgs = null;
			if (fuel != null)
				msgs = ((InternalEObject) fuel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL, null, msgs);
			if (newFuel != null)
				msgs = ((InternalEObject) newFuel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL, null, msgs);
			msgs = basicSetFuel(newFuel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL,
					newFuel, newFuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChargesCostType getCharges() {
		return charges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharges(ChargesCostType newCharges, NotificationChain msgs) {
		ChargesCostType oldCharges = charges;
		charges = newCharges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES, oldCharges, newCharges);
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
	public void setCharges(ChargesCostType newCharges) {
		if (newCharges != charges) {
			NotificationChain msgs = null;
			if (charges != null)
				msgs = ((InternalEObject) charges).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES, null, msgs);
			if (newCharges != null)
				msgs = ((InternalEObject) newCharges).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES, null, msgs);
			msgs = basicSetCharges(newCharges, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES,
					newCharges, newCharges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaintenanceCostType getMaintenance() {
		return maintenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaintenance(MaintenanceCostType newMaintenance, NotificationChain msgs) {
		MaintenanceCostType oldMaintenance = maintenance;
		maintenance = newMaintenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE, oldMaintenance, newMaintenance);
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
	public void setMaintenance(MaintenanceCostType newMaintenance) {
		if (newMaintenance != maintenance) {
			NotificationChain msgs = null;
			if (maintenance != null)
				msgs = ((InternalEObject) maintenance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE, null, msgs);
			if (newMaintenance != null)
				msgs = ((InternalEObject) newMaintenance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE, null, msgs);
			msgs = basicSetMaintenance(newMaintenance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE,
					newMaintenance, newMaintenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrewCostType getCrew() {
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrew(CrewCostType newCrew, NotificationChain msgs) {
		CrewCostType oldCrew = crew;
		crew = newCrew;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW, oldCrew, newCrew);
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
	public void setCrew(CrewCostType newCrew) {
		if (newCrew != crew) {
			NotificationChain msgs = null;
			if (crew != null)
				msgs = ((InternalEObject) crew).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW, null, msgs);
			if (newCrew != null)
				msgs = ((InternalEObject) newCrew).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW, null, msgs);
			msgs = basicSetCrew(newCrew, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW,
					newCrew, newCrew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getDepreciation() {
		return depreciation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepreciation(GenericCostType newDepreciation, NotificationChain msgs) {
		GenericCostType oldDepreciation = depreciation;
		depreciation = newDepreciation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION, oldDepreciation, newDepreciation);
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
	public void setDepreciation(GenericCostType newDepreciation) {
		if (newDepreciation != depreciation) {
			NotificationChain msgs = null;
			if (depreciation != null)
				msgs = ((InternalEObject) depreciation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION, null, msgs);
			if (newDepreciation != null)
				msgs = ((InternalEObject) newDepreciation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION, null, msgs);
			msgs = basicSetDepreciation(newDepreciation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION,
					newDepreciation, newDepreciation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericCostType getInsurance() {
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurance(GenericCostType newInsurance, NotificationChain msgs) {
		GenericCostType oldInsurance = insurance;
		insurance = newInsurance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE, oldInsurance, newInsurance);
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
	public void setInsurance(GenericCostType newInsurance) {
		if (newInsurance != insurance) {
			NotificationChain msgs = null;
			if (insurance != null)
				msgs = ((InternalEObject) insurance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE, null, msgs);
			if (newInsurance != null)
				msgs = ((InternalEObject) newInsurance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE, null, msgs);
			msgs = basicSetInsurance(newInsurance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE,
					newInsurance, newInsurance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL:
			return basicSetFuel(null, msgs);
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES:
			return basicSetCharges(null, msgs);
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE:
			return basicSetMaintenance(null, msgs);
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW:
			return basicSetCrew(null, msgs);
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION:
			return basicSetDepreciation(null, msgs);
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE:
			return basicSetInsurance(null, msgs);
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
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL:
			return getFuel();
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES:
			return getCharges();
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE:
			return getMaintenance();
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW:
			return getCrew();
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION:
			return getDepreciation();
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE:
			return getInsurance();
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
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL:
			setFuel((GenericCostType) newValue);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES:
			setCharges((ChargesCostType) newValue);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE:
			setMaintenance((MaintenanceCostType) newValue);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW:
			setCrew((CrewCostType) newValue);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION:
			setDepreciation((GenericCostType) newValue);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE:
			setInsurance((GenericCostType) newValue);
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
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL:
			setFuel((GenericCostType) null);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES:
			setCharges((ChargesCostType) null);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE:
			setMaintenance((MaintenanceCostType) null);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW:
			setCrew((CrewCostType) null);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION:
			setDepreciation((GenericCostType) null);
			return;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE:
			setInsurance((GenericCostType) null);
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
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__FUEL:
			return fuel != null;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CHARGES:
			return charges != null;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__MAINTENANCE:
			return maintenance != null;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__CREW:
			return crew != null;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__DEPRECIATION:
			return depreciation != null;
		case CpacsPackage.DIRECT_OPERATING_COST_TYPE__INSURANCE:
			return insurance != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectOperatingCostTypeImpl
