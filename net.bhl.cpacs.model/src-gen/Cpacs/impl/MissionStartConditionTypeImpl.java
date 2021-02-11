/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.GeographicPointType;
import Cpacs.MissionStartConditionType;
import Cpacs.OrientationType;
import Cpacs.PointType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Start Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getMach <em>Mach</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionStartConditionTypeImpl extends ComplexBaseTypeImpl implements MissionStartConditionType {
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
	 * The cached value of the '{@link #getCAS() <em>CAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAS()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cAS;

	/**
	 * The cached value of the '{@link #getMach() <em>Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMach()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType mach;

	/**
	 * The cached value of the '{@link #getPositionXYZ() <em>Position XYZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXYZ()
	 * @generated
	 * @ordered
	 */
	protected PointType positionXYZ;

	/**
	 * The cached value of the '{@link #getPositionGeo() <em>Position Geo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionGeo()
	 * @generated
	 * @ordered
	 */
	protected GeographicPointType positionGeo;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType orientation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionStartConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionStartConditionType();
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
					CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID, oldRunwayUID, newRunwayUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID, null, msgs);
			if (newRunwayUID != null)
				msgs = ((InternalEObject) newRunwayUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID, null, msgs);
			msgs = basicSetRunwayUID(newRunwayUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID,
					newRunwayUID, newRunwayUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCAS() {
		return cAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCAS(DoubleBaseType newCAS, NotificationChain msgs) {
		DoubleBaseType oldCAS = cAS;
		cAS = newCAS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__CAS, oldCAS, newCAS);
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
	public void setCAS(DoubleBaseType newCAS) {
		if (newCAS != cAS) {
			NotificationChain msgs = null;
			if (cAS != null)
				msgs = ((InternalEObject) cAS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__CAS, null, msgs);
			if (newCAS != null)
				msgs = ((InternalEObject) newCAS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__CAS, null, msgs);
			msgs = basicSetCAS(newCAS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_START_CONDITION_TYPE__CAS,
					newCAS, newCAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMach() {
		return mach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMach(DoubleBaseType newMach, NotificationChain msgs) {
		DoubleBaseType oldMach = mach;
		mach = newMach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__MACH, oldMach, newMach);
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
	public void setMach(DoubleBaseType newMach) {
		if (newMach != mach) {
			NotificationChain msgs = null;
			if (mach != null)
				msgs = ((InternalEObject) mach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__MACH, null, msgs);
			if (newMach != null)
				msgs = ((InternalEObject) newMach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__MACH, null, msgs);
			msgs = basicSetMach(newMach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_START_CONDITION_TYPE__MACH,
					newMach, newMach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getPositionXYZ() {
		return positionXYZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXYZ(PointType newPositionXYZ, NotificationChain msgs) {
		PointType oldPositionXYZ = positionXYZ;
		positionXYZ = newPositionXYZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, oldPositionXYZ, newPositionXYZ);
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
	public void setPositionXYZ(PointType newPositionXYZ) {
		if (newPositionXYZ != positionXYZ) {
			NotificationChain msgs = null;
			if (positionXYZ != null)
				msgs = ((InternalEObject) positionXYZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, null, msgs);
			if (newPositionXYZ != null)
				msgs = ((InternalEObject) newPositionXYZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, null, msgs);
			msgs = basicSetPositionXYZ(newPositionXYZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, newPositionXYZ, newPositionXYZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicPointType getPositionGeo() {
		return positionGeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionGeo(GeographicPointType newPositionGeo, NotificationChain msgs) {
		GeographicPointType oldPositionGeo = positionGeo;
		positionGeo = newPositionGeo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, oldPositionGeo, newPositionGeo);
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
	public void setPositionGeo(GeographicPointType newPositionGeo) {
		if (newPositionGeo != positionGeo) {
			NotificationChain msgs = null;
			if (positionGeo != null)
				msgs = ((InternalEObject) positionGeo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, null, msgs);
			if (newPositionGeo != null)
				msgs = ((InternalEObject) newPositionGeo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, null, msgs);
			msgs = basicSetPositionGeo(newPositionGeo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, newPositionGeo, newPositionGeo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType newOrientation, NotificationChain msgs) {
		OrientationType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION, oldOrientation, newOrientation);
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
	public void setOrientation(OrientationType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject) orientation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject) newOrientation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID:
			return basicSetRunwayUID(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CAS:
			return basicSetCAS(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH:
			return basicSetMach(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			return basicSetPositionXYZ(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			return basicSetPositionGeo(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION:
			return basicSetOrientation(null, msgs);
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID:
			return getRunwayUID();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CAS:
			return getCAS();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH:
			return getMach();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			return getPositionXYZ();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			return getPositionGeo();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION:
			return getOrientation();
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CAS:
			setCAS((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH:
			setMach((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION:
			setOrientation((OrientationType) newValue);
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CAS:
			setCAS((DoubleBaseType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH:
			setMach((DoubleBaseType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION:
			setOrientation((OrientationType) null);
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY_UID:
			return runwayUID != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CAS:
			return cAS != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH:
			return mach != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			return positionXYZ != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			return positionGeo != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ORIENTATION:
			return orientation != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionStartConditionTypeImpl
