/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CpacsVersionType;
import Cpacs.DateTimeBaseType;
import Cpacs.HeaderType;
import Cpacs.StringBaseType;
import Cpacs.UpdatesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.HeaderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.HeaderTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.HeaderTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link Cpacs.impl.HeaderTypeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link Cpacs.impl.HeaderTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link Cpacs.impl.HeaderTypeImpl#getCpacsVersion <em>Cpacs Version</em>}</li>
 *   <li>{@link Cpacs.impl.HeaderTypeImpl#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderTypeImpl extends ComplexBaseTypeImpl implements HeaderType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

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
	 * The default value of the '{@link #getCpacsVersion() <em>Cpacs Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpacsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final CpacsVersionType CPACS_VERSION_EDEFAULT = CpacsVersionType._32;

	/**
	 * The cached value of the '{@link #getCpacsVersion() <em>Cpacs Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpacsVersion()
	 * @generated
	 * @ordered
	 */
	protected CpacsVersionType cpacsVersion = CPACS_VERSION_EDEFAULT;

	/**
	 * This is true if the Cpacs Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cpacsVersionESet;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected UpdatesType updates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getHeaderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HEADER_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HEADER_TYPE__NAME, newName, newName));
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
					CpacsPackage.HEADER_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HEADER_TYPE__DESCRIPTION, newDescription,
					newDescription));
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
					CpacsPackage.HEADER_TYPE__CREATOR, oldCreator, newCreator);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__CREATOR, null, msgs);
			if (newCreator != null)
				msgs = ((InternalEObject) newCreator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__CREATOR, null, msgs);
			msgs = basicSetCreator(newCreator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HEADER_TYPE__CREATOR, newCreator,
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
					CpacsPackage.HEADER_TYPE__TIMESTAMP, oldTimestamp, newTimestamp);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject) newTimestamp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HEADER_TYPE__TIMESTAMP, newTimestamp,
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
					CpacsPackage.HEADER_TYPE__VERSION, oldVersion, newVersion);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject) newVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HEADER_TYPE__VERSION, newVersion,
					newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpacsVersionType getCpacsVersion() {
		return cpacsVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpacsVersion(CpacsVersionType newCpacsVersion) {
		CpacsVersionType oldCpacsVersion = cpacsVersion;
		cpacsVersion = newCpacsVersion == null ? CPACS_VERSION_EDEFAULT : newCpacsVersion;
		boolean oldCpacsVersionESet = cpacsVersionESet;
		cpacsVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HEADER_TYPE__CPACS_VERSION,
					oldCpacsVersion, cpacsVersion, !oldCpacsVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCpacsVersion() {
		CpacsVersionType oldCpacsVersion = cpacsVersion;
		boolean oldCpacsVersionESet = cpacsVersionESet;
		cpacsVersion = CPACS_VERSION_EDEFAULT;
		cpacsVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.HEADER_TYPE__CPACS_VERSION,
					oldCpacsVersion, CPACS_VERSION_EDEFAULT, oldCpacsVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCpacsVersion() {
		return cpacsVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpdatesType getUpdates() {
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdates(UpdatesType newUpdates, NotificationChain msgs) {
		UpdatesType oldUpdates = updates;
		updates = newUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HEADER_TYPE__UPDATES, oldUpdates, newUpdates);
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
	public void setUpdates(UpdatesType newUpdates) {
		if (newUpdates != updates) {
			NotificationChain msgs = null;
			if (updates != null)
				msgs = ((InternalEObject) updates).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__UPDATES, null, msgs);
			if (newUpdates != null)
				msgs = ((InternalEObject) newUpdates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HEADER_TYPE__UPDATES, null, msgs);
			msgs = basicSetUpdates(newUpdates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HEADER_TYPE__UPDATES, newUpdates,
					newUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.HEADER_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.HEADER_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.HEADER_TYPE__CREATOR:
			return basicSetCreator(null, msgs);
		case CpacsPackage.HEADER_TYPE__TIMESTAMP:
			return basicSetTimestamp(null, msgs);
		case CpacsPackage.HEADER_TYPE__VERSION:
			return basicSetVersion(null, msgs);
		case CpacsPackage.HEADER_TYPE__UPDATES:
			return basicSetUpdates(null, msgs);
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
		case CpacsPackage.HEADER_TYPE__NAME:
			return getName();
		case CpacsPackage.HEADER_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.HEADER_TYPE__CREATOR:
			return getCreator();
		case CpacsPackage.HEADER_TYPE__TIMESTAMP:
			return getTimestamp();
		case CpacsPackage.HEADER_TYPE__VERSION:
			return getVersion();
		case CpacsPackage.HEADER_TYPE__CPACS_VERSION:
			return getCpacsVersion();
		case CpacsPackage.HEADER_TYPE__UPDATES:
			return getUpdates();
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
		case CpacsPackage.HEADER_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.HEADER_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.HEADER_TYPE__CREATOR:
			setCreator((StringBaseType) newValue);
			return;
		case CpacsPackage.HEADER_TYPE__TIMESTAMP:
			setTimestamp((DateTimeBaseType) newValue);
			return;
		case CpacsPackage.HEADER_TYPE__VERSION:
			setVersion((StringBaseType) newValue);
			return;
		case CpacsPackage.HEADER_TYPE__CPACS_VERSION:
			setCpacsVersion((CpacsVersionType) newValue);
			return;
		case CpacsPackage.HEADER_TYPE__UPDATES:
			setUpdates((UpdatesType) newValue);
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
		case CpacsPackage.HEADER_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.HEADER_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.HEADER_TYPE__CREATOR:
			setCreator((StringBaseType) null);
			return;
		case CpacsPackage.HEADER_TYPE__TIMESTAMP:
			setTimestamp((DateTimeBaseType) null);
			return;
		case CpacsPackage.HEADER_TYPE__VERSION:
			setVersion((StringBaseType) null);
			return;
		case CpacsPackage.HEADER_TYPE__CPACS_VERSION:
			unsetCpacsVersion();
			return;
		case CpacsPackage.HEADER_TYPE__UPDATES:
			setUpdates((UpdatesType) null);
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
		case CpacsPackage.HEADER_TYPE__NAME:
			return name != null;
		case CpacsPackage.HEADER_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.HEADER_TYPE__CREATOR:
			return creator != null;
		case CpacsPackage.HEADER_TYPE__TIMESTAMP:
			return timestamp != null;
		case CpacsPackage.HEADER_TYPE__VERSION:
			return version != null;
		case CpacsPackage.HEADER_TYPE__CPACS_VERSION:
			return isSetCpacsVersion();
		case CpacsPackage.HEADER_TYPE__UPDATES:
			return updates != null;
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
		if (cpacsVersionESet)
			result.append(cpacsVersion);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HeaderTypeImpl
