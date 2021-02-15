/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FuelTankVolumeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuel Tank Volume Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuelTankVolumeTypeImpl#getOptimalVolume <em>Optimal Volume</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTankVolumeTypeImpl#getUsableVolume <em>Usable Volume</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTankVolumeTypeImpl#getRealVolume <em>Real Volume</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTankVolumeTypeImpl#getUseableVolumeFactor <em>Useable Volume Factor</em>}</li>
 *   <li>{@link Cpacs.impl.FuelTankVolumeTypeImpl#getRealVolumeFactor <em>Real Volume Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuelTankVolumeTypeImpl extends ComplexBaseTypeImpl implements FuelTankVolumeType {
	/**
	 * The cached value of the '{@link #getOptimalVolume() <em>Optimal Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimalVolume()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType optimalVolume;

	/**
	 * The cached value of the '{@link #getUsableVolume() <em>Usable Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsableVolume()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType usableVolume;

	/**
	 * The cached value of the '{@link #getRealVolume() <em>Real Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealVolume()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType realVolume;

	/**
	 * The cached value of the '{@link #getUseableVolumeFactor() <em>Useable Volume Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseableVolumeFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType useableVolumeFactor;

	/**
	 * The cached value of the '{@link #getRealVolumeFactor() <em>Real Volume Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealVolumeFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType realVolumeFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuelTankVolumeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuelTankVolumeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOptimalVolume() {
		return optimalVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptimalVolume(DoubleBaseType newOptimalVolume, NotificationChain msgs) {
		DoubleBaseType oldOptimalVolume = optimalVolume;
		optimalVolume = newOptimalVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME, oldOptimalVolume, newOptimalVolume);
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
	public void setOptimalVolume(DoubleBaseType newOptimalVolume) {
		if (newOptimalVolume != optimalVolume) {
			NotificationChain msgs = null;
			if (optimalVolume != null)
				msgs = ((InternalEObject) optimalVolume).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME, null, msgs);
			if (newOptimalVolume != null)
				msgs = ((InternalEObject) newOptimalVolume).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME, null, msgs);
			msgs = basicSetOptimalVolume(newOptimalVolume, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME,
					newOptimalVolume, newOptimalVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getUsableVolume() {
		return usableVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsableVolume(DoubleBaseType newUsableVolume, NotificationChain msgs) {
		DoubleBaseType oldUsableVolume = usableVolume;
		usableVolume = newUsableVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME, oldUsableVolume, newUsableVolume);
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
	public void setUsableVolume(DoubleBaseType newUsableVolume) {
		if (newUsableVolume != usableVolume) {
			NotificationChain msgs = null;
			if (usableVolume != null)
				msgs = ((InternalEObject) usableVolume).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME, null, msgs);
			if (newUsableVolume != null)
				msgs = ((InternalEObject) newUsableVolume).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME, null, msgs);
			msgs = basicSetUsableVolume(newUsableVolume, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME,
					newUsableVolume, newUsableVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRealVolume() {
		return realVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealVolume(DoubleBaseType newRealVolume, NotificationChain msgs) {
		DoubleBaseType oldRealVolume = realVolume;
		realVolume = newRealVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME, oldRealVolume, newRealVolume);
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
	public void setRealVolume(DoubleBaseType newRealVolume) {
		if (newRealVolume != realVolume) {
			NotificationChain msgs = null;
			if (realVolume != null)
				msgs = ((InternalEObject) realVolume).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME, null, msgs);
			if (newRealVolume != null)
				msgs = ((InternalEObject) newRealVolume).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME, null, msgs);
			msgs = basicSetRealVolume(newRealVolume, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME,
					newRealVolume, newRealVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getUseableVolumeFactor() {
		return useableVolumeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseableVolumeFactor(DoubleBaseType newUseableVolumeFactor,
			NotificationChain msgs) {
		DoubleBaseType oldUseableVolumeFactor = useableVolumeFactor;
		useableVolumeFactor = newUseableVolumeFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR, oldUseableVolumeFactor,
					newUseableVolumeFactor);
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
	public void setUseableVolumeFactor(DoubleBaseType newUseableVolumeFactor) {
		if (newUseableVolumeFactor != useableVolumeFactor) {
			NotificationChain msgs = null;
			if (useableVolumeFactor != null)
				msgs = ((InternalEObject) useableVolumeFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR, null, msgs);
			if (newUseableVolumeFactor != null)
				msgs = ((InternalEObject) newUseableVolumeFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR, null, msgs);
			msgs = basicSetUseableVolumeFactor(newUseableVolumeFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR, newUseableVolumeFactor,
					newUseableVolumeFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRealVolumeFactor() {
		return realVolumeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealVolumeFactor(DoubleBaseType newRealVolumeFactor, NotificationChain msgs) {
		DoubleBaseType oldRealVolumeFactor = realVolumeFactor;
		realVolumeFactor = newRealVolumeFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR, oldRealVolumeFactor, newRealVolumeFactor);
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
	public void setRealVolumeFactor(DoubleBaseType newRealVolumeFactor) {
		if (newRealVolumeFactor != realVolumeFactor) {
			NotificationChain msgs = null;
			if (realVolumeFactor != null)
				msgs = ((InternalEObject) realVolumeFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR, null, msgs);
			if (newRealVolumeFactor != null)
				msgs = ((InternalEObject) newRealVolumeFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR, null, msgs);
			msgs = basicSetRealVolumeFactor(newRealVolumeFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR, newRealVolumeFactor, newRealVolumeFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME:
			return basicSetOptimalVolume(null, msgs);
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME:
			return basicSetUsableVolume(null, msgs);
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME:
			return basicSetRealVolume(null, msgs);
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR:
			return basicSetUseableVolumeFactor(null, msgs);
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR:
			return basicSetRealVolumeFactor(null, msgs);
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
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME:
			return getOptimalVolume();
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME:
			return getUsableVolume();
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME:
			return getRealVolume();
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR:
			return getUseableVolumeFactor();
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR:
			return getRealVolumeFactor();
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
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME:
			setOptimalVolume((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME:
			setUsableVolume((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME:
			setRealVolume((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR:
			setUseableVolumeFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR:
			setRealVolumeFactor((DoubleBaseType) newValue);
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
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME:
			setOptimalVolume((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME:
			setUsableVolume((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME:
			setRealVolume((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR:
			setUseableVolumeFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR:
			setRealVolumeFactor((DoubleBaseType) null);
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
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__OPTIMAL_VOLUME:
			return optimalVolume != null;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USABLE_VOLUME:
			return usableVolume != null;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME:
			return realVolume != null;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__USEABLE_VOLUME_FACTOR:
			return useableVolumeFactor != null;
		case CpacsPackage.FUEL_TANK_VOLUME_TYPE__REAL_VOLUME_FACTOR:
			return realVolumeFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //FuelTankVolumeTypeImpl
