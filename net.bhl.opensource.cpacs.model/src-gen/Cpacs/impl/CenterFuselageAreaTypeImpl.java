/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageAreaType;
import Cpacs.CenterFuselageHighWingConfigurationType;
import Cpacs.CenterFuselageLowWingConfigurationType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Fuselage Area Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageAreaTypeImpl#getStartFrameUID <em>Start Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageAreaTypeImpl#getEndFrameUID <em>End Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageAreaTypeImpl#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageAreaTypeImpl#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageAreaTypeImpl#getCenterFuselageLowWingConfiguration <em>Center Fuselage Low Wing Configuration</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageAreaTypeImpl#getCenterFuselageHighWingConfiguration <em>Center Fuselage High Wing Configuration</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageAreaTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageAreaTypeImpl extends ComplexBaseTypeImpl implements CenterFuselageAreaType {
	/**
	 * The cached value of the '{@link #getStartFrameUID() <em>Start Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startFrameUID;

	/**
	 * The cached value of the '{@link #getEndFrameUID() <em>End Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endFrameUID;

	/**
	 * The cached value of the '{@link #getStartStringerUID() <em>Start Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startStringerUID;

	/**
	 * The cached value of the '{@link #getEndStringerUID() <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endStringerUID;

	/**
	 * The cached value of the '{@link #getCenterFuselageLowWingConfiguration() <em>Center Fuselage Low Wing Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageLowWingConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageLowWingConfigurationType centerFuselageLowWingConfiguration;

	/**
	 * The cached value of the '{@link #getCenterFuselageHighWingConfiguration() <em>Center Fuselage High Wing Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageHighWingConfiguration()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageHighWingConfigurationType centerFuselageHighWingConfiguration;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CenterFuselageAreaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageAreaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartFrameUID() {
		return startFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartFrameUID(StringUIDBaseType newStartFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldStartFrameUID = startFrameUID;
		startFrameUID = newStartFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID, oldStartFrameUID, newStartFrameUID);
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
	public void setStartFrameUID(StringUIDBaseType newStartFrameUID) {
		if (newStartFrameUID != startFrameUID) {
			NotificationChain msgs = null;
			if (startFrameUID != null)
				msgs = ((InternalEObject) startFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID, null, msgs);
			if (newStartFrameUID != null)
				msgs = ((InternalEObject) newStartFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID, null, msgs);
			msgs = basicSetStartFrameUID(newStartFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID, newStartFrameUID, newStartFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndFrameUID() {
		return endFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndFrameUID(StringUIDBaseType newEndFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldEndFrameUID = endFrameUID;
		endFrameUID = newEndFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID, oldEndFrameUID, newEndFrameUID);
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
	public void setEndFrameUID(StringUIDBaseType newEndFrameUID) {
		if (newEndFrameUID != endFrameUID) {
			NotificationChain msgs = null;
			if (endFrameUID != null)
				msgs = ((InternalEObject) endFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID, null, msgs);
			if (newEndFrameUID != null)
				msgs = ((InternalEObject) newEndFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID, null, msgs);
			msgs = basicSetEndFrameUID(newEndFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID,
					newEndFrameUID, newEndFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartStringerUID() {
		return startStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartStringerUID(StringUIDBaseType newStartStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldStartStringerUID = startStringerUID;
		startStringerUID = newStartStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID, oldStartStringerUID,
					newStartStringerUID);
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
	public void setStartStringerUID(StringUIDBaseType newStartStringerUID) {
		if (newStartStringerUID != startStringerUID) {
			NotificationChain msgs = null;
			if (startStringerUID != null)
				msgs = ((InternalEObject) startStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID, null,
						msgs);
			if (newStartStringerUID != null)
				msgs = ((InternalEObject) newStartStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID, null,
						msgs);
			msgs = basicSetStartStringerUID(newStartStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID, newStartStringerUID,
					newStartStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndStringerUID() {
		return endStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndStringerUID(StringUIDBaseType newEndStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldEndStringerUID = endStringerUID;
		endStringerUID = newEndStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID, oldEndStringerUID, newEndStringerUID);
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
	public void setEndStringerUID(StringUIDBaseType newEndStringerUID) {
		if (newEndStringerUID != endStringerUID) {
			NotificationChain msgs = null;
			if (endStringerUID != null)
				msgs = ((InternalEObject) endStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID, null, msgs);
			if (newEndStringerUID != null)
				msgs = ((InternalEObject) newEndStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID, null, msgs);
			msgs = basicSetEndStringerUID(newEndStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID, newEndStringerUID, newEndStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageLowWingConfigurationType getCenterFuselageLowWingConfiguration() {
		return centerFuselageLowWingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageLowWingConfiguration(
			CenterFuselageLowWingConfigurationType newCenterFuselageLowWingConfiguration, NotificationChain msgs) {
		CenterFuselageLowWingConfigurationType oldCenterFuselageLowWingConfiguration = centerFuselageLowWingConfiguration;
		centerFuselageLowWingConfiguration = newCenterFuselageLowWingConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION,
					oldCenterFuselageLowWingConfiguration, newCenterFuselageLowWingConfiguration);
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
	public void setCenterFuselageLowWingConfiguration(
			CenterFuselageLowWingConfigurationType newCenterFuselageLowWingConfiguration) {
		if (newCenterFuselageLowWingConfiguration != centerFuselageLowWingConfiguration) {
			NotificationChain msgs = null;
			if (centerFuselageLowWingConfiguration != null)
				msgs = ((InternalEObject) centerFuselageLowWingConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION,
						null, msgs);
			if (newCenterFuselageLowWingConfiguration != null)
				msgs = ((InternalEObject) newCenterFuselageLowWingConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION,
						null, msgs);
			msgs = basicSetCenterFuselageLowWingConfiguration(newCenterFuselageLowWingConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION,
					newCenterFuselageLowWingConfiguration, newCenterFuselageLowWingConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageHighWingConfigurationType getCenterFuselageHighWingConfiguration() {
		return centerFuselageHighWingConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageHighWingConfiguration(
			CenterFuselageHighWingConfigurationType newCenterFuselageHighWingConfiguration, NotificationChain msgs) {
		CenterFuselageHighWingConfigurationType oldCenterFuselageHighWingConfiguration = centerFuselageHighWingConfiguration;
		centerFuselageHighWingConfiguration = newCenterFuselageHighWingConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION,
					oldCenterFuselageHighWingConfiguration, newCenterFuselageHighWingConfiguration);
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
	public void setCenterFuselageHighWingConfiguration(
			CenterFuselageHighWingConfigurationType newCenterFuselageHighWingConfiguration) {
		if (newCenterFuselageHighWingConfiguration != centerFuselageHighWingConfiguration) {
			NotificationChain msgs = null;
			if (centerFuselageHighWingConfiguration != null)
				msgs = ((InternalEObject) centerFuselageHighWingConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION,
						null, msgs);
			if (newCenterFuselageHighWingConfiguration != null)
				msgs = ((InternalEObject) newCenterFuselageHighWingConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION,
						null, msgs);
			msgs = basicSetCenterFuselageHighWingConfiguration(newCenterFuselageHighWingConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION,
					newCenterFuselageHighWingConfiguration, newCenterFuselageHighWingConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID:
			return basicSetStartFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID:
			return basicSetEndFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID:
			return basicSetStartStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID:
			return basicSetEndStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION:
			return basicSetCenterFuselageLowWingConfiguration(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION:
			return basicSetCenterFuselageHighWingConfiguration(null, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID:
			return getStartFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID:
			return getEndFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID:
			return getStartStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID:
			return getEndStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION:
			return getCenterFuselageLowWingConfiguration();
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION:
			return getCenterFuselageHighWingConfiguration();
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__UID:
			return getUID();
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
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID:
			setStartFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID:
			setEndFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION:
			setCenterFuselageLowWingConfiguration((CenterFuselageLowWingConfigurationType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION:
			setCenterFuselageHighWingConfiguration((CenterFuselageHighWingConfigurationType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID:
			setStartFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID:
			setEndFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION:
			setCenterFuselageLowWingConfiguration((CenterFuselageLowWingConfigurationType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION:
			setCenterFuselageHighWingConfiguration((CenterFuselageHighWingConfigurationType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_FRAME_UID:
			return startFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_FRAME_UID:
			return endFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__START_STRINGER_UID:
			return startStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__END_STRINGER_UID:
			return endStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_LOW_WING_CONFIGURATION:
			return centerFuselageLowWingConfiguration != null;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__CENTER_FUSELAGE_HIGH_WING_CONFIGURATION:
			return centerFuselageHighWingConfiguration != null;
		case CpacsPackage.CENTER_FUSELAGE_AREA_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
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
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //CenterFuselageAreaTypeImpl
