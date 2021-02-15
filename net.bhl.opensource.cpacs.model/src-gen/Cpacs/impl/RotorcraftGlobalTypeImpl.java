/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.RotorcraftGlobalType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotorcraft Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorcraftGlobalTypeImpl#getPaxSeats <em>Pax Seats</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftGlobalTypeImpl#getCargoCapacity <em>Cargo Capacity</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftGlobalTypeImpl#getMachCruise <em>Mach Cruise</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftGlobalTypeImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorcraftGlobalTypeImpl extends ComplexBaseTypeImpl implements RotorcraftGlobalType {
	/**
	 * The cached value of the '{@link #getPaxSeats() <em>Pax Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxSeats()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType paxSeats;

	/**
	 * The cached value of the '{@link #getCargoCapacity() <em>Cargo Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoCapacity()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cargoCapacity;

	/**
	 * The cached value of the '{@link #getMachCruise() <em>Mach Cruise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachCruise()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType machCruise;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorcraftGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorcraftGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getPaxSeats() {
		return paxSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaxSeats(IntegerBaseType newPaxSeats, NotificationChain msgs) {
		IntegerBaseType oldPaxSeats = paxSeats;
		paxSeats = newPaxSeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS, oldPaxSeats, newPaxSeats);
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
	public void setPaxSeats(IntegerBaseType newPaxSeats) {
		if (newPaxSeats != paxSeats) {
			NotificationChain msgs = null;
			if (paxSeats != null)
				msgs = ((InternalEObject) paxSeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS, null, msgs);
			if (newPaxSeats != null)
				msgs = ((InternalEObject) newPaxSeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS, null, msgs);
			msgs = basicSetPaxSeats(newPaxSeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS,
					newPaxSeats, newPaxSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCargoCapacity() {
		return cargoCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCargoCapacity(DoubleBaseType newCargoCapacity, NotificationChain msgs) {
		DoubleBaseType oldCargoCapacity = cargoCapacity;
		cargoCapacity = newCargoCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY, oldCargoCapacity, newCargoCapacity);
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
	public void setCargoCapacity(DoubleBaseType newCargoCapacity) {
		if (newCargoCapacity != cargoCapacity) {
			NotificationChain msgs = null;
			if (cargoCapacity != null)
				msgs = ((InternalEObject) cargoCapacity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY, null, msgs);
			if (newCargoCapacity != null)
				msgs = ((InternalEObject) newCargoCapacity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY, null, msgs);
			msgs = basicSetCargoCapacity(newCargoCapacity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY,
					newCargoCapacity, newCargoCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMachCruise() {
		return machCruise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachCruise(DoubleBaseType newMachCruise, NotificationChain msgs) {
		DoubleBaseType oldMachCruise = machCruise;
		machCruise = newMachCruise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE, oldMachCruise, newMachCruise);
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
	public void setMachCruise(DoubleBaseType newMachCruise) {
		if (newMachCruise != machCruise) {
			NotificationChain msgs = null;
			if (machCruise != null)
				msgs = ((InternalEObject) machCruise).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE, null, msgs);
			if (newMachCruise != null)
				msgs = ((InternalEObject) newMachCruise).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE, null, msgs);
			msgs = basicSetMachCruise(newMachCruise, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE,
					newMachCruise, newMachCruise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(StringBaseType newConfiguration, NotificationChain msgs) {
		StringBaseType oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(StringBaseType newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject) configuration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject) newConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION,
					newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS:
			return basicSetPaxSeats(null, msgs);
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY:
			return basicSetCargoCapacity(null, msgs);
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE:
			return basicSetMachCruise(null, msgs);
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION:
			return basicSetConfiguration(null, msgs);
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
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS:
			return getPaxSeats();
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY:
			return getCargoCapacity();
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE:
			return getMachCruise();
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION:
			return getConfiguration();
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
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS:
			setPaxSeats((IntegerBaseType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY:
			setCargoCapacity((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE:
			setMachCruise((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION:
			setConfiguration((StringBaseType) newValue);
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
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS:
			setPaxSeats((IntegerBaseType) null);
			return;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY:
			setCargoCapacity((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE:
			setMachCruise((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION:
			setConfiguration((StringBaseType) null);
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
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__PAX_SEATS:
			return paxSeats != null;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CARGO_CAPACITY:
			return cargoCapacity != null;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__MACH_CRUISE:
			return machCruise != null;
		case CpacsPackage.ROTORCRAFT_GLOBAL_TYPE__CONFIGURATION:
			return configuration != null;
		}
		return super.eIsSet(featureID);
	}

} //RotorcraftGlobalTypeImpl
