/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DriveSystemType;
import Cpacs.ShaftsType;
import Cpacs.StringBaseType;
import Cpacs.TransmissionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DriveSystemTypeImpl#getTransmissions <em>Transmissions</em>}</li>
 *   <li>{@link Cpacs.impl.DriveSystemTypeImpl#getShafts <em>Shafts</em>}</li>
 *   <li>{@link Cpacs.impl.DriveSystemTypeImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DriveSystemTypeImpl extends ComplexBaseTypeImpl implements DriveSystemType {
	/**
	 * The cached value of the '{@link #getTransmissions() <em>Transmissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissions()
	 * @generated
	 * @ordered
	 */
	protected TransmissionsType transmissions;

	/**
	 * The cached value of the '{@link #getShafts() <em>Shafts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShafts()
	 * @generated
	 * @ordered
	 */
	protected ShaftsType shafts;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDriveSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmissionsType getTransmissions() {
		return transmissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmissions(TransmissionsType newTransmissions, NotificationChain msgs) {
		TransmissionsType oldTransmissions = transmissions;
		transmissions = newTransmissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS, oldTransmissions, newTransmissions);
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
	public void setTransmissions(TransmissionsType newTransmissions) {
		if (newTransmissions != transmissions) {
			NotificationChain msgs = null;
			if (transmissions != null)
				msgs = ((InternalEObject) transmissions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS, null, msgs);
			if (newTransmissions != null)
				msgs = ((InternalEObject) newTransmissions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS, null, msgs);
			msgs = basicSetTransmissions(newTransmissions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS,
					newTransmissions, newTransmissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShaftsType getShafts() {
		return shafts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShafts(ShaftsType newShafts, NotificationChain msgs) {
		ShaftsType oldShafts = shafts;
		shafts = newShafts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS, oldShafts, newShafts);
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
	public void setShafts(ShaftsType newShafts) {
		if (newShafts != shafts) {
			NotificationChain msgs = null;
			if (shafts != null)
				msgs = ((InternalEObject) shafts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS, null, msgs);
			if (newShafts != null)
				msgs = ((InternalEObject) newShafts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS, null, msgs);
			msgs = basicSetShafts(newShafts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS, newShafts,
					newShafts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getStates() {
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStates(StringBaseType newStates, NotificationChain msgs) {
		StringBaseType oldStates = states;
		states = newStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DRIVE_SYSTEM_TYPE__STATES, oldStates, newStates);
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
	public void setStates(StringBaseType newStates) {
		if (newStates != states) {
			NotificationChain msgs = null;
			if (states != null)
				msgs = ((InternalEObject) states).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRIVE_SYSTEM_TYPE__STATES, null, msgs);
			if (newStates != null)
				msgs = ((InternalEObject) newStates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DRIVE_SYSTEM_TYPE__STATES, null, msgs);
			msgs = basicSetStates(newStates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DRIVE_SYSTEM_TYPE__STATES, newStates,
					newStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS:
			return basicSetTransmissions(null, msgs);
		case CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS:
			return basicSetShafts(null, msgs);
		case CpacsPackage.DRIVE_SYSTEM_TYPE__STATES:
			return basicSetStates(null, msgs);
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
		case CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS:
			return getTransmissions();
		case CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS:
			return getShafts();
		case CpacsPackage.DRIVE_SYSTEM_TYPE__STATES:
			return getStates();
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
		case CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS:
			setTransmissions((TransmissionsType) newValue);
			return;
		case CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS:
			setShafts((ShaftsType) newValue);
			return;
		case CpacsPackage.DRIVE_SYSTEM_TYPE__STATES:
			setStates((StringBaseType) newValue);
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
		case CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS:
			setTransmissions((TransmissionsType) null);
			return;
		case CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS:
			setShafts((ShaftsType) null);
			return;
		case CpacsPackage.DRIVE_SYSTEM_TYPE__STATES:
			setStates((StringBaseType) null);
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
		case CpacsPackage.DRIVE_SYSTEM_TYPE__TRANSMISSIONS:
			return transmissions != null;
		case CpacsPackage.DRIVE_SYSTEM_TYPE__SHAFTS:
			return shafts != null;
		case CpacsPackage.DRIVE_SYSTEM_TYPE__STATES:
			return states != null;
		}
		return super.eIsSet(featureID);
	}

} //DriveSystemTypeImpl
