/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DateTimeBaseType;
import Cpacs.StringBaseType;
import Cpacs.UpdateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.UpdateTypeImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link Cpacs.impl.UpdateTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link Cpacs.impl.UpdateTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link Cpacs.impl.UpdateTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Cpacs.impl.UpdateTypeImpl#getCpacsVersion <em>Cpacs Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateTypeImpl extends ComplexBaseTypeImpl implements UpdateType {
	/**
	 * The cached value of the '{@link #getModification() <em>Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType modification;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType creator;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected DateTimeBaseType timestamp;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType version;

	/**
	 * The cached value of the '{@link #getCpacsVersion() <em>Cpacs Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpacsVersion()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType cpacsVersion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getUpdateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getModification() {
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModification(StringBaseType newModification, NotificationChain msgs) {
		StringBaseType oldModification = modification;
		modification = newModification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.UPDATE_TYPE__MODIFICATION, oldModification, newModification);
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
	public void setModification(StringBaseType newModification) {
		if (newModification != modification) {
			NotificationChain msgs = null;
			if (modification != null)
				msgs = ((InternalEObject) modification).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__MODIFICATION, null, msgs);
			if (newModification != null)
				msgs = ((InternalEObject) newModification).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__MODIFICATION, null, msgs);
			msgs = basicSetModification(newModification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UPDATE_TYPE__MODIFICATION,
					newModification, newModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(StringBaseType newCreator, NotificationChain msgs) {
		StringBaseType oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.UPDATE_TYPE__CREATOR, oldCreator, newCreator);
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
	public void setCreator(StringBaseType newCreator) {
		if (newCreator != creator) {
			NotificationChain msgs = null;
			if (creator != null)
				msgs = ((InternalEObject) creator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject) newCreator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UPDATE_TYPE__CREATOR, newCreator,
					newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimeBaseType getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(DateTimeBaseType newTimestamp, NotificationChain msgs) {
		DateTimeBaseType oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.UPDATE_TYPE__TIMESTAMP, oldTimestamp, newTimestamp);
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
	public void setTimestamp(DateTimeBaseType newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject) timestamp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject) newTimestamp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UPDATE_TYPE__TIMESTAMP, newTimestamp,
					newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(StringBaseType newVersion, NotificationChain msgs) {
		StringBaseType oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.UPDATE_TYPE__VERSION, oldVersion, newVersion);
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
	public void setVersion(StringBaseType newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject) version).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject) newVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UPDATE_TYPE__VERSION, newVersion,
					newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getCpacsVersion() {
		return cpacsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpacsVersion(StringBaseType newCpacsVersion, NotificationChain msgs) {
		StringBaseType oldCpacsVersion = cpacsVersion;
		cpacsVersion = newCpacsVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.UPDATE_TYPE__CPACS_VERSION, oldCpacsVersion, newCpacsVersion);
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
	public void setCpacsVersion(StringBaseType newCpacsVersion) {
		if (newCpacsVersion != cpacsVersion) {
			NotificationChain msgs = null;
			if (cpacsVersion != null)
				msgs = ((InternalEObject) cpacsVersion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__CPACS_VERSION, null, msgs);
			if (newCpacsVersion != null)
				msgs = ((InternalEObject) newCpacsVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UPDATE_TYPE__CPACS_VERSION, null, msgs);
			msgs = basicSetCpacsVersion(newCpacsVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UPDATE_TYPE__CPACS_VERSION,
					newCpacsVersion, newCpacsVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.UPDATE_TYPE__MODIFICATION:
			return basicSetModification(null, msgs);
		case CpacsPackage.UPDATE_TYPE__CREATOR:
			return basicSetCreator(null, msgs);
		case CpacsPackage.UPDATE_TYPE__TIMESTAMP:
			return basicSetTimestamp(null, msgs);
		case CpacsPackage.UPDATE_TYPE__VERSION:
			return basicSetVersion(null, msgs);
		case CpacsPackage.UPDATE_TYPE__CPACS_VERSION:
			return basicSetCpacsVersion(null, msgs);
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
		case CpacsPackage.UPDATE_TYPE__MODIFICATION:
			return getModification();
		case CpacsPackage.UPDATE_TYPE__CREATOR:
			return getCreator();
		case CpacsPackage.UPDATE_TYPE__TIMESTAMP:
			return getTimestamp();
		case CpacsPackage.UPDATE_TYPE__VERSION:
			return getVersion();
		case CpacsPackage.UPDATE_TYPE__CPACS_VERSION:
			return getCpacsVersion();
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
		case CpacsPackage.UPDATE_TYPE__MODIFICATION:
			setModification((StringBaseType) newValue);
			return;
		case CpacsPackage.UPDATE_TYPE__CREATOR:
			setCreator((StringBaseType) newValue);
			return;
		case CpacsPackage.UPDATE_TYPE__TIMESTAMP:
			setTimestamp((DateTimeBaseType) newValue);
			return;
		case CpacsPackage.UPDATE_TYPE__VERSION:
			setVersion((StringBaseType) newValue);
			return;
		case CpacsPackage.UPDATE_TYPE__CPACS_VERSION:
			setCpacsVersion((StringBaseType) newValue);
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
		case CpacsPackage.UPDATE_TYPE__MODIFICATION:
			setModification((StringBaseType) null);
			return;
		case CpacsPackage.UPDATE_TYPE__CREATOR:
			setCreator((StringBaseType) null);
			return;
		case CpacsPackage.UPDATE_TYPE__TIMESTAMP:
			setTimestamp((DateTimeBaseType) null);
			return;
		case CpacsPackage.UPDATE_TYPE__VERSION:
			setVersion((StringBaseType) null);
			return;
		case CpacsPackage.UPDATE_TYPE__CPACS_VERSION:
			setCpacsVersion((StringBaseType) null);
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
		case CpacsPackage.UPDATE_TYPE__MODIFICATION:
			return modification != null;
		case CpacsPackage.UPDATE_TYPE__CREATOR:
			return creator != null;
		case CpacsPackage.UPDATE_TYPE__TIMESTAMP:
			return timestamp != null;
		case CpacsPackage.UPDATE_TYPE__VERSION:
			return version != null;
		case CpacsPackage.UPDATE_TYPE__CPACS_VERSION:
			return cpacsVersion != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateTypeImpl
