/**
 */
package Cpacs.impl;

import Cpacs.CostAirConditioningSystemsType;
import Cpacs.CostAutomaticFlightSystemsType;
import Cpacs.CostAuxilaryPowerUnitsType;
import Cpacs.CostCommunicationSystemsType;
import Cpacs.CostDeIcingSystemsType;
import Cpacs.CostElectricalSystemsType;
import Cpacs.CostFireProtectionSystemsType;
import Cpacs.CostFlightControlSystemsType;
import Cpacs.CostHydraulicSystemsType;
import Cpacs.CostInstrumentSystemsType;
import Cpacs.CostNavigationSystemsType;
import Cpacs.CostSystemsType;
import Cpacs.CpacsPackage;
import Cpacs.GenericCostType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cost Systems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getAuxilaryPowerUnits <em>Auxilary Power Units</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getHydraulicSystems <em>Hydraulic Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getAirConditioningSystems <em>Air Conditioning Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getDeIcingSystems <em>De Icing Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getFireProtectionSystems <em>Fire Protection Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getFlightControlSystems <em>Flight Control Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getInstrumentSystems <em>Instrument Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getAutomaticFlightSystems <em>Automatic Flight Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getNavigationSystems <em>Navigation Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getCommunicationSystems <em>Communication Systems</em>}</li>
 *   <li>{@link Cpacs.impl.CostSystemsTypeImpl#getElectricalSystems <em>Electrical Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CostSystemsTypeImpl extends ComplexBaseTypeImpl implements CostSystemsType {
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
	 * The cached value of the '{@link #getAuxilaryPowerUnits() <em>Auxilary Power Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxilaryPowerUnits()
	 * @generated
	 * @ordered
	 */
	protected CostAuxilaryPowerUnitsType auxilaryPowerUnits;

	/**
	 * The cached value of the '{@link #getHydraulicSystems() <em>Hydraulic Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydraulicSystems()
	 * @generated
	 * @ordered
	 */
	protected CostHydraulicSystemsType hydraulicSystems;

	/**
	 * The cached value of the '{@link #getAirConditioningSystems() <em>Air Conditioning Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirConditioningSystems()
	 * @generated
	 * @ordered
	 */
	protected CostAirConditioningSystemsType airConditioningSystems;

	/**
	 * The cached value of the '{@link #getDeIcingSystems() <em>De Icing Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeIcingSystems()
	 * @generated
	 * @ordered
	 */
	protected CostDeIcingSystemsType deIcingSystems;

	/**
	 * The cached value of the '{@link #getFireProtectionSystems() <em>Fire Protection Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFireProtectionSystems()
	 * @generated
	 * @ordered
	 */
	protected CostFireProtectionSystemsType fireProtectionSystems;

	/**
	 * The cached value of the '{@link #getFlightControlSystems() <em>Flight Control Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightControlSystems()
	 * @generated
	 * @ordered
	 */
	protected CostFlightControlSystemsType flightControlSystems;

	/**
	 * The cached value of the '{@link #getInstrumentSystems() <em>Instrument Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrumentSystems()
	 * @generated
	 * @ordered
	 */
	protected CostInstrumentSystemsType instrumentSystems;

	/**
	 * The cached value of the '{@link #getAutomaticFlightSystems() <em>Automatic Flight Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticFlightSystems()
	 * @generated
	 * @ordered
	 */
	protected CostAutomaticFlightSystemsType automaticFlightSystems;

	/**
	 * The cached value of the '{@link #getNavigationSystems() <em>Navigation Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationSystems()
	 * @generated
	 * @ordered
	 */
	protected CostNavigationSystemsType navigationSystems;

	/**
	 * The cached value of the '{@link #getCommunicationSystems() <em>Communication Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationSystems()
	 * @generated
	 * @ordered
	 */
	protected CostCommunicationSystemsType communicationSystems;

	/**
	 * The cached value of the '{@link #getElectricalSystems() <em>Electrical Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalSystems()
	 * @generated
	 * @ordered
	 */
	protected CostElectricalSystemsType electricalSystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CostSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCostSystemsType();
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
					CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION, oldCostDescription, newCostDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION, null, msgs);
			if (newCostDescription != null)
				msgs = ((InternalEObject) newCostDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION, null, msgs);
			msgs = basicSetCostDescription(newCostDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION,
					newCostDescription, newCostDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostAuxilaryPowerUnitsType getAuxilaryPowerUnits() {
		return auxilaryPowerUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuxilaryPowerUnits(CostAuxilaryPowerUnitsType newAuxilaryPowerUnits,
			NotificationChain msgs) {
		CostAuxilaryPowerUnitsType oldAuxilaryPowerUnits = auxilaryPowerUnits;
		auxilaryPowerUnits = newAuxilaryPowerUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS, oldAuxilaryPowerUnits, newAuxilaryPowerUnits);
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
	public void setAuxilaryPowerUnits(CostAuxilaryPowerUnitsType newAuxilaryPowerUnits) {
		if (newAuxilaryPowerUnits != auxilaryPowerUnits) {
			NotificationChain msgs = null;
			if (auxilaryPowerUnits != null)
				msgs = ((InternalEObject) auxilaryPowerUnits).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS, null, msgs);
			if (newAuxilaryPowerUnits != null)
				msgs = ((InternalEObject) newAuxilaryPowerUnits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS, null, msgs);
			msgs = basicSetAuxilaryPowerUnits(newAuxilaryPowerUnits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS,
					newAuxilaryPowerUnits, newAuxilaryPowerUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostHydraulicSystemsType getHydraulicSystems() {
		return hydraulicSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHydraulicSystems(CostHydraulicSystemsType newHydraulicSystems,
			NotificationChain msgs) {
		CostHydraulicSystemsType oldHydraulicSystems = hydraulicSystems;
		hydraulicSystems = newHydraulicSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS, oldHydraulicSystems, newHydraulicSystems);
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
	public void setHydraulicSystems(CostHydraulicSystemsType newHydraulicSystems) {
		if (newHydraulicSystems != hydraulicSystems) {
			NotificationChain msgs = null;
			if (hydraulicSystems != null)
				msgs = ((InternalEObject) hydraulicSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS, null, msgs);
			if (newHydraulicSystems != null)
				msgs = ((InternalEObject) newHydraulicSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS, null, msgs);
			msgs = basicSetHydraulicSystems(newHydraulicSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS,
					newHydraulicSystems, newHydraulicSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostAirConditioningSystemsType getAirConditioningSystems() {
		return airConditioningSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirConditioningSystems(CostAirConditioningSystemsType newAirConditioningSystems,
			NotificationChain msgs) {
		CostAirConditioningSystemsType oldAirConditioningSystems = airConditioningSystems;
		airConditioningSystems = newAirConditioningSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS, oldAirConditioningSystems,
					newAirConditioningSystems);
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
	public void setAirConditioningSystems(CostAirConditioningSystemsType newAirConditioningSystems) {
		if (newAirConditioningSystems != airConditioningSystems) {
			NotificationChain msgs = null;
			if (airConditioningSystems != null)
				msgs = ((InternalEObject) airConditioningSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS, null, msgs);
			if (newAirConditioningSystems != null)
				msgs = ((InternalEObject) newAirConditioningSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS, null, msgs);
			msgs = basicSetAirConditioningSystems(newAirConditioningSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS, newAirConditioningSystems,
					newAirConditioningSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostDeIcingSystemsType getDeIcingSystems() {
		return deIcingSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeIcingSystems(CostDeIcingSystemsType newDeIcingSystems, NotificationChain msgs) {
		CostDeIcingSystemsType oldDeIcingSystems = deIcingSystems;
		deIcingSystems = newDeIcingSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS, oldDeIcingSystems, newDeIcingSystems);
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
	public void setDeIcingSystems(CostDeIcingSystemsType newDeIcingSystems) {
		if (newDeIcingSystems != deIcingSystems) {
			NotificationChain msgs = null;
			if (deIcingSystems != null)
				msgs = ((InternalEObject) deIcingSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS, null, msgs);
			if (newDeIcingSystems != null)
				msgs = ((InternalEObject) newDeIcingSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS, null, msgs);
			msgs = basicSetDeIcingSystems(newDeIcingSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS,
					newDeIcingSystems, newDeIcingSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFireProtectionSystemsType getFireProtectionSystems() {
		return fireProtectionSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFireProtectionSystems(CostFireProtectionSystemsType newFireProtectionSystems,
			NotificationChain msgs) {
		CostFireProtectionSystemsType oldFireProtectionSystems = fireProtectionSystems;
		fireProtectionSystems = newFireProtectionSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS, oldFireProtectionSystems,
					newFireProtectionSystems);
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
	public void setFireProtectionSystems(CostFireProtectionSystemsType newFireProtectionSystems) {
		if (newFireProtectionSystems != fireProtectionSystems) {
			NotificationChain msgs = null;
			if (fireProtectionSystems != null)
				msgs = ((InternalEObject) fireProtectionSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS, null, msgs);
			if (newFireProtectionSystems != null)
				msgs = ((InternalEObject) newFireProtectionSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS, null, msgs);
			msgs = basicSetFireProtectionSystems(newFireProtectionSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS, newFireProtectionSystems,
					newFireProtectionSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostFlightControlSystemsType getFlightControlSystems() {
		return flightControlSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightControlSystems(CostFlightControlSystemsType newFlightControlSystems,
			NotificationChain msgs) {
		CostFlightControlSystemsType oldFlightControlSystems = flightControlSystems;
		flightControlSystems = newFlightControlSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS, oldFlightControlSystems,
					newFlightControlSystems);
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
	public void setFlightControlSystems(CostFlightControlSystemsType newFlightControlSystems) {
		if (newFlightControlSystems != flightControlSystems) {
			NotificationChain msgs = null;
			if (flightControlSystems != null)
				msgs = ((InternalEObject) flightControlSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS, null, msgs);
			if (newFlightControlSystems != null)
				msgs = ((InternalEObject) newFlightControlSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS, null, msgs);
			msgs = basicSetFlightControlSystems(newFlightControlSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS, newFlightControlSystems,
					newFlightControlSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostInstrumentSystemsType getInstrumentSystems() {
		return instrumentSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstrumentSystems(CostInstrumentSystemsType newInstrumentSystems,
			NotificationChain msgs) {
		CostInstrumentSystemsType oldInstrumentSystems = instrumentSystems;
		instrumentSystems = newInstrumentSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS, oldInstrumentSystems, newInstrumentSystems);
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
	public void setInstrumentSystems(CostInstrumentSystemsType newInstrumentSystems) {
		if (newInstrumentSystems != instrumentSystems) {
			NotificationChain msgs = null;
			if (instrumentSystems != null)
				msgs = ((InternalEObject) instrumentSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS, null, msgs);
			if (newInstrumentSystems != null)
				msgs = ((InternalEObject) newInstrumentSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS, null, msgs);
			msgs = basicSetInstrumentSystems(newInstrumentSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS,
					newInstrumentSystems, newInstrumentSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostAutomaticFlightSystemsType getAutomaticFlightSystems() {
		return automaticFlightSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomaticFlightSystems(CostAutomaticFlightSystemsType newAutomaticFlightSystems,
			NotificationChain msgs) {
		CostAutomaticFlightSystemsType oldAutomaticFlightSystems = automaticFlightSystems;
		automaticFlightSystems = newAutomaticFlightSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS, oldAutomaticFlightSystems,
					newAutomaticFlightSystems);
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
	public void setAutomaticFlightSystems(CostAutomaticFlightSystemsType newAutomaticFlightSystems) {
		if (newAutomaticFlightSystems != automaticFlightSystems) {
			NotificationChain msgs = null;
			if (automaticFlightSystems != null)
				msgs = ((InternalEObject) automaticFlightSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS, null, msgs);
			if (newAutomaticFlightSystems != null)
				msgs = ((InternalEObject) newAutomaticFlightSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS, null, msgs);
			msgs = basicSetAutomaticFlightSystems(newAutomaticFlightSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS, newAutomaticFlightSystems,
					newAutomaticFlightSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostNavigationSystemsType getNavigationSystems() {
		return navigationSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNavigationSystems(CostNavigationSystemsType newNavigationSystems,
			NotificationChain msgs) {
		CostNavigationSystemsType oldNavigationSystems = navigationSystems;
		navigationSystems = newNavigationSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS, oldNavigationSystems, newNavigationSystems);
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
	public void setNavigationSystems(CostNavigationSystemsType newNavigationSystems) {
		if (newNavigationSystems != navigationSystems) {
			NotificationChain msgs = null;
			if (navigationSystems != null)
				msgs = ((InternalEObject) navigationSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS, null, msgs);
			if (newNavigationSystems != null)
				msgs = ((InternalEObject) newNavigationSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS, null, msgs);
			msgs = basicSetNavigationSystems(newNavigationSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS,
					newNavigationSystems, newNavigationSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostCommunicationSystemsType getCommunicationSystems() {
		return communicationSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationSystems(CostCommunicationSystemsType newCommunicationSystems,
			NotificationChain msgs) {
		CostCommunicationSystemsType oldCommunicationSystems = communicationSystems;
		communicationSystems = newCommunicationSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS, oldCommunicationSystems,
					newCommunicationSystems);
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
	public void setCommunicationSystems(CostCommunicationSystemsType newCommunicationSystems) {
		if (newCommunicationSystems != communicationSystems) {
			NotificationChain msgs = null;
			if (communicationSystems != null)
				msgs = ((InternalEObject) communicationSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS, null, msgs);
			if (newCommunicationSystems != null)
				msgs = ((InternalEObject) newCommunicationSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS, null, msgs);
			msgs = basicSetCommunicationSystems(newCommunicationSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS,
					newCommunicationSystems, newCommunicationSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostElectricalSystemsType getElectricalSystems() {
		return electricalSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectricalSystems(CostElectricalSystemsType newElectricalSystems,
			NotificationChain msgs) {
		CostElectricalSystemsType oldElectricalSystems = electricalSystems;
		electricalSystems = newElectricalSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS, oldElectricalSystems, newElectricalSystems);
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
	public void setElectricalSystems(CostElectricalSystemsType newElectricalSystems) {
		if (newElectricalSystems != electricalSystems) {
			NotificationChain msgs = null;
			if (electricalSystems != null)
				msgs = ((InternalEObject) electricalSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS, null, msgs);
			if (newElectricalSystems != null)
				msgs = ((InternalEObject) newElectricalSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS, null, msgs);
			msgs = basicSetElectricalSystems(newElectricalSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS,
					newElectricalSystems, newElectricalSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION:
			return basicSetCostDescription(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS:
			return basicSetAuxilaryPowerUnits(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS:
			return basicSetHydraulicSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS:
			return basicSetAirConditioningSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS:
			return basicSetDeIcingSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS:
			return basicSetFireProtectionSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS:
			return basicSetFlightControlSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS:
			return basicSetInstrumentSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS:
			return basicSetAutomaticFlightSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS:
			return basicSetNavigationSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS:
			return basicSetCommunicationSystems(null, msgs);
		case CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS:
			return basicSetElectricalSystems(null, msgs);
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
		case CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION:
			return getCostDescription();
		case CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS:
			return getAuxilaryPowerUnits();
		case CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS:
			return getHydraulicSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS:
			return getAirConditioningSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS:
			return getDeIcingSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS:
			return getFireProtectionSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS:
			return getFlightControlSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS:
			return getInstrumentSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS:
			return getAutomaticFlightSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS:
			return getNavigationSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS:
			return getCommunicationSystems();
		case CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS:
			return getElectricalSystems();
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
		case CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS:
			setAuxilaryPowerUnits((CostAuxilaryPowerUnitsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS:
			setHydraulicSystems((CostHydraulicSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS:
			setAirConditioningSystems((CostAirConditioningSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS:
			setDeIcingSystems((CostDeIcingSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS:
			setFireProtectionSystems((CostFireProtectionSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS:
			setFlightControlSystems((CostFlightControlSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS:
			setInstrumentSystems((CostInstrumentSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS:
			setAutomaticFlightSystems((CostAutomaticFlightSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS:
			setNavigationSystems((CostNavigationSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS:
			setCommunicationSystems((CostCommunicationSystemsType) newValue);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS:
			setElectricalSystems((CostElectricalSystemsType) newValue);
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
		case CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION:
			setCostDescription((GenericCostType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS:
			setAuxilaryPowerUnits((CostAuxilaryPowerUnitsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS:
			setHydraulicSystems((CostHydraulicSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS:
			setAirConditioningSystems((CostAirConditioningSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS:
			setDeIcingSystems((CostDeIcingSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS:
			setFireProtectionSystems((CostFireProtectionSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS:
			setFlightControlSystems((CostFlightControlSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS:
			setInstrumentSystems((CostInstrumentSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS:
			setAutomaticFlightSystems((CostAutomaticFlightSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS:
			setNavigationSystems((CostNavigationSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS:
			setCommunicationSystems((CostCommunicationSystemsType) null);
			return;
		case CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS:
			setElectricalSystems((CostElectricalSystemsType) null);
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
		case CpacsPackage.COST_SYSTEMS_TYPE__COST_DESCRIPTION:
			return costDescription != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__AUXILARY_POWER_UNITS:
			return auxilaryPowerUnits != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__HYDRAULIC_SYSTEMS:
			return hydraulicSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__AIR_CONDITIONING_SYSTEMS:
			return airConditioningSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__DE_ICING_SYSTEMS:
			return deIcingSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__FIRE_PROTECTION_SYSTEMS:
			return fireProtectionSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__FLIGHT_CONTROL_SYSTEMS:
			return flightControlSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__INSTRUMENT_SYSTEMS:
			return instrumentSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__AUTOMATIC_FLIGHT_SYSTEMS:
			return automaticFlightSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__NAVIGATION_SYSTEMS:
			return navigationSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__COMMUNICATION_SYSTEMS:
			return communicationSystems != null;
		case CpacsPackage.COST_SYSTEMS_TYPE__ELECTRICAL_SYSTEMS:
			return electricalSystems != null;
		}
		return super.eIsSet(featureID);
	}

} //CostSystemsTypeImpl
