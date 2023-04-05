/**
 */
package Cpacs.impl;

import Cpacs.ChangeLogType;
import Cpacs.CpacsPackage;
import Cpacs.DateTimeBaseType;
import Cpacs.StringBaseType;
import Cpacs.VersionInfoType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VersionInfoTypeImpl#getCpacsVersion <em>Cpacs Version</em>}</li>
 *   <li>{@link Cpacs.impl.VersionInfoTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.VersionInfoTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link Cpacs.impl.VersionInfoTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link Cpacs.impl.VersionInfoTypeImpl#getChangeLog <em>Change Log</em>}</li>
 *   <li>{@link Cpacs.impl.VersionInfoTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionInfoTypeImpl extends ComplexBaseTypeImpl implements VersionInfoType {
	/**
	 * The default value of the '{@link #getCpacsVersion() <em>Cpacs Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpacsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CPACS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpacsVersion() <em>Cpacs Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpacsVersion()
	 * @generated
	 * @ordered
	 */
	protected String cpacsVersion = CPACS_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

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
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType creator;

	/**
	 * The cached value of the '{@link #getChangeLog() <em>Change Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeLog()
	 * @generated
	 * @ordered
	 */
	protected ChangeLogType changeLog;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVersionInfoType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpacsVersion() {
		return cpacsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpacsVersion(String newCpacsVersion) {
		String oldCpacsVersion = cpacsVersion;
		cpacsVersion = newCpacsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VERSION_INFO_TYPE__CPACS_VERSION,
					oldCpacsVersion, cpacsVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION,
					newDescription, newDescription));
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
					CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP, oldTimestamp, newTimestamp);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject) newTimestamp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP,
					newTimestamp, newTimestamp));
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
					CpacsPackage.VERSION_INFO_TYPE__CREATOR, oldCreator, newCreator);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject) newCreator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VERSION_INFO_TYPE__CREATOR, newCreator,
					newCreator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeLogType getChangeLog() {
		return changeLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeLog(ChangeLogType newChangeLog, NotificationChain msgs) {
		ChangeLogType oldChangeLog = changeLog;
		changeLog = newChangeLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG, oldChangeLog, newChangeLog);
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
	public void setChangeLog(ChangeLogType newChangeLog) {
		if (newChangeLog != changeLog) {
			NotificationChain msgs = null;
			if (changeLog != null)
				msgs = ((InternalEObject) changeLog).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG, null, msgs);
			if (newChangeLog != null)
				msgs = ((InternalEObject) newChangeLog).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG, null, msgs);
			msgs = basicSetChangeLog(newChangeLog, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG,
					newChangeLog, newChangeLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VERSION_INFO_TYPE__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP:
			return basicSetTimestamp(null, msgs);
		case CpacsPackage.VERSION_INFO_TYPE__CREATOR:
			return basicSetCreator(null, msgs);
		case CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG:
			return basicSetChangeLog(null, msgs);
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
		case CpacsPackage.VERSION_INFO_TYPE__CPACS_VERSION:
			return getCpacsVersion();
		case CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP:
			return getTimestamp();
		case CpacsPackage.VERSION_INFO_TYPE__CREATOR:
			return getCreator();
		case CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG:
			return getChangeLog();
		case CpacsPackage.VERSION_INFO_TYPE__VERSION:
			return getVersion();
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
		case CpacsPackage.VERSION_INFO_TYPE__CPACS_VERSION:
			setCpacsVersion((String) newValue);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP:
			setTimestamp((DateTimeBaseType) newValue);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__CREATOR:
			setCreator((StringBaseType) newValue);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG:
			setChangeLog((ChangeLogType) newValue);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__VERSION:
			setVersion((String) newValue);
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
		case CpacsPackage.VERSION_INFO_TYPE__CPACS_VERSION:
			setCpacsVersion(CPACS_VERSION_EDEFAULT);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP:
			setTimestamp((DateTimeBaseType) null);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__CREATOR:
			setCreator((StringBaseType) null);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG:
			setChangeLog((ChangeLogType) null);
			return;
		case CpacsPackage.VERSION_INFO_TYPE__VERSION:
			setVersion(VERSION_EDEFAULT);
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
		case CpacsPackage.VERSION_INFO_TYPE__CPACS_VERSION:
			return CPACS_VERSION_EDEFAULT == null ? cpacsVersion != null : !CPACS_VERSION_EDEFAULT.equals(cpacsVersion);
		case CpacsPackage.VERSION_INFO_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.VERSION_INFO_TYPE__TIMESTAMP:
			return timestamp != null;
		case CpacsPackage.VERSION_INFO_TYPE__CREATOR:
			return creator != null;
		case CpacsPackage.VERSION_INFO_TYPE__CHANGE_LOG:
			return changeLog != null;
		case CpacsPackage.VERSION_INFO_TYPE__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cpacsVersion: ");
		result.append(cpacsVersion);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //VersionInfoTypeImpl
