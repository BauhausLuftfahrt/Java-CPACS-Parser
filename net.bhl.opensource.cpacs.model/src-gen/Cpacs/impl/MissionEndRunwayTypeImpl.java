/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MissionEndRunwayType;
import Cpacs.PointXYZType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission End Runway Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionEndRunwayTypeImpl#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.impl.MissionEndRunwayTypeImpl#getRunwayEndPosition <em>Runway End Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionEndRunwayTypeImpl extends ComplexBaseTypeImpl implements MissionEndRunwayType {
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
	 * The cached value of the '{@link #getRunwayEndPosition() <em>Runway End Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunwayEndPosition()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType runwayEndPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionEndRunwayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionEndRunwayType();
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
					CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID, oldRunwayUID, newRunwayUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID, null, msgs);
			if (newRunwayUID != null)
				msgs = ((InternalEObject) newRunwayUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID, null, msgs);
			msgs = basicSetRunwayUID(newRunwayUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID,
					newRunwayUID, newRunwayUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getRunwayEndPosition() {
		return runwayEndPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunwayEndPosition(PointXYZType newRunwayEndPosition, NotificationChain msgs) {
		PointXYZType oldRunwayEndPosition = runwayEndPosition;
		runwayEndPosition = newRunwayEndPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION, oldRunwayEndPosition,
					newRunwayEndPosition);
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
	public void setRunwayEndPosition(PointXYZType newRunwayEndPosition) {
		if (newRunwayEndPosition != runwayEndPosition) {
			NotificationChain msgs = null;
			if (runwayEndPosition != null)
				msgs = ((InternalEObject) runwayEndPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION, null, msgs);
			if (newRunwayEndPosition != null)
				msgs = ((InternalEObject) newRunwayEndPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION, null, msgs);
			msgs = basicSetRunwayEndPosition(newRunwayEndPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION, newRunwayEndPosition,
					newRunwayEndPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID:
			return basicSetRunwayUID(null, msgs);
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION:
			return basicSetRunwayEndPosition(null, msgs);
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
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID:
			return getRunwayUID();
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION:
			return getRunwayEndPosition();
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
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION:
			setRunwayEndPosition((PointXYZType) newValue);
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
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION:
			setRunwayEndPosition((PointXYZType) null);
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
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_UID:
			return runwayUID != null;
		case CpacsPackage.MISSION_END_RUNWAY_TYPE__RUNWAY_END_POSITION:
			return runwayEndPosition != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionEndRunwayTypeImpl
