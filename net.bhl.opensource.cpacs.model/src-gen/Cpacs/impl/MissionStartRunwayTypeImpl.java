/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MissionStartRunwayType;
import Cpacs.RunwayStartPositionType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Start Runway Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionStartRunwayTypeImpl#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartRunwayTypeImpl#getRunwayStartPosition <em>Runway Start Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionStartRunwayTypeImpl extends ComplexBaseTypeImpl implements MissionStartRunwayType {
	/**
	 * The cached value of the '{@link #getRunwayUID() <em>Runway UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunwayUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType runwayUID;

	/**
	 * The cached value of the '{@link #getRunwayStartPosition() <em>Runway Start Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunwayStartPosition()
	 * @generated
	 * @ordered
	 */
	protected RunwayStartPositionType runwayStartPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionStartRunwayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionStartRunwayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRunwayUID() {
		return runwayUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunwayUID(StringUIDBaseType newRunwayUID, NotificationChain msgs) {
		StringUIDBaseType oldRunwayUID = runwayUID;
		runwayUID = newRunwayUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID, oldRunwayUID, newRunwayUID);
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
	public void setRunwayUID(StringUIDBaseType newRunwayUID) {
		if (newRunwayUID != runwayUID) {
			NotificationChain msgs = null;
			if (runwayUID != null)
				msgs = ((InternalEObject) runwayUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID, null, msgs);
			if (newRunwayUID != null)
				msgs = ((InternalEObject) newRunwayUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID, null, msgs);
			msgs = basicSetRunwayUID(newRunwayUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID,
					newRunwayUID, newRunwayUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunwayStartPositionType getRunwayStartPosition() {
		return runwayStartPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunwayStartPosition(RunwayStartPositionType newRunwayStartPosition,
			NotificationChain msgs) {
		RunwayStartPositionType oldRunwayStartPosition = runwayStartPosition;
		runwayStartPosition = newRunwayStartPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION, oldRunwayStartPosition,
					newRunwayStartPosition);
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
	public void setRunwayStartPosition(RunwayStartPositionType newRunwayStartPosition) {
		if (newRunwayStartPosition != runwayStartPosition) {
			NotificationChain msgs = null;
			if (runwayStartPosition != null)
				msgs = ((InternalEObject) runwayStartPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION, null,
						msgs);
			if (newRunwayStartPosition != null)
				msgs = ((InternalEObject) newRunwayStartPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION, null,
						msgs);
			msgs = basicSetRunwayStartPosition(newRunwayStartPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION, newRunwayStartPosition,
					newRunwayStartPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID:
			return basicSetRunwayUID(null, msgs);
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION:
			return basicSetRunwayStartPosition(null, msgs);
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
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID:
			return getRunwayUID();
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION:
			return getRunwayStartPosition();
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
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION:
			setRunwayStartPosition((RunwayStartPositionType) newValue);
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
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION:
			setRunwayStartPosition((RunwayStartPositionType) null);
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
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_UID:
			return runwayUID != null;
		case CpacsPackage.MISSION_START_RUNWAY_TYPE__RUNWAY_START_POSITION:
			return runwayStartPosition != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionStartRunwayTypeImpl
