/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceTrackTypeType;
import Cpacs.CpacsPackage;
import Cpacs.EtaIsoLineType;
import Cpacs.TrackActuatorType;
import Cpacs.TrackStructureType;
import Cpacs.TrackSubTypeType;
import Cpacs.TrackTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surface Track Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceTrackTypeTypeImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceTrackTypeTypeImpl#getTrackType <em>Track Type</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceTrackTypeTypeImpl#getTrackSubType <em>Track Sub Type</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceTrackTypeTypeImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceTrackTypeTypeImpl#getTrackStructure <em>Track Structure</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceTrackTypeTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceTrackTypeTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceTrackTypeType {
	/**
	 * The cached value of the '{@link #getEta() <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected EtaIsoLineType eta;

	/**
	 * The cached value of the '{@link #getTrackType() <em>Track Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackType()
	 * @generated
	 * @ordered
	 */
	protected TrackTypeType trackType;

	/**
	 * The cached value of the '{@link #getTrackSubType() <em>Track Sub Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackSubType()
	 * @generated
	 * @ordered
	 */
	protected TrackSubTypeType trackSubType;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected TrackActuatorType actuator;

	/**
	 * The cached value of the '{@link #getTrackStructure() <em>Track Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackStructure()
	 * @generated
	 * @ordered
	 */
	protected TrackStructureType trackStructure;

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
	protected ControlSurfaceTrackTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceTrackTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaIsoLineType getEta() {
		return eta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEta(EtaIsoLineType newEta, NotificationChain msgs) {
		EtaIsoLineType oldEta = eta;
		eta = newEta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA, oldEta, newEta);
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
	public void setEta(EtaIsoLineType newEta) {
		if (newEta != eta) {
			NotificationChain msgs = null;
			if (eta != null)
				msgs = ((InternalEObject) eta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA, null, msgs);
			if (newEta != null)
				msgs = ((InternalEObject) newEta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA, null, msgs);
			msgs = basicSetEta(newEta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA,
					newEta, newEta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackTypeType getTrackType() {
		return trackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackType(TrackTypeType newTrackType, NotificationChain msgs) {
		TrackTypeType oldTrackType = trackType;
		trackType = newTrackType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE, oldTrackType, newTrackType);
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
	public void setTrackType(TrackTypeType newTrackType) {
		if (newTrackType != trackType) {
			NotificationChain msgs = null;
			if (trackType != null)
				msgs = ((InternalEObject) trackType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE, null, msgs);
			if (newTrackType != null)
				msgs = ((InternalEObject) newTrackType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE, null, msgs);
			msgs = basicSetTrackType(newTrackType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE, newTrackType, newTrackType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackSubTypeType getTrackSubType() {
		return trackSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackSubType(TrackSubTypeType newTrackSubType, NotificationChain msgs) {
		TrackSubTypeType oldTrackSubType = trackSubType;
		trackSubType = newTrackSubType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE, oldTrackSubType, newTrackSubType);
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
	public void setTrackSubType(TrackSubTypeType newTrackSubType) {
		if (newTrackSubType != trackSubType) {
			NotificationChain msgs = null;
			if (trackSubType != null)
				msgs = ((InternalEObject) trackSubType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE, null,
						msgs);
			if (newTrackSubType != null)
				msgs = ((InternalEObject) newTrackSubType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE, null,
						msgs);
			msgs = basicSetTrackSubType(newTrackSubType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE, newTrackSubType, newTrackSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackActuatorType getActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuator(TrackActuatorType newActuator, NotificationChain msgs) {
		TrackActuatorType oldActuator = actuator;
		actuator = newActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR, oldActuator, newActuator);
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
	public void setActuator(TrackActuatorType newActuator) {
		if (newActuator != actuator) {
			NotificationChain msgs = null;
			if (actuator != null)
				msgs = ((InternalEObject) actuator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR, null, msgs);
			if (newActuator != null)
				msgs = ((InternalEObject) newActuator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR, null, msgs);
			msgs = basicSetActuator(newActuator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR, newActuator, newActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackStructureType getTrackStructure() {
		return trackStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackStructure(TrackStructureType newTrackStructure, NotificationChain msgs) {
		TrackStructureType oldTrackStructure = trackStructure;
		trackStructure = newTrackStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE, oldTrackStructure,
					newTrackStructure);
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
	public void setTrackStructure(TrackStructureType newTrackStructure) {
		if (newTrackStructure != trackStructure) {
			NotificationChain msgs = null;
			if (trackStructure != null)
				msgs = ((InternalEObject) trackStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE, null,
						msgs);
			if (newTrackStructure != null)
				msgs = ((InternalEObject) newTrackStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE, null,
						msgs);
			msgs = basicSetTrackStructure(newTrackStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE, newTrackStructure,
					newTrackStructure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA:
			return basicSetEta(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE:
			return basicSetTrackType(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE:
			return basicSetTrackSubType(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR:
			return basicSetActuator(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE:
			return basicSetTrackStructure(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA:
			return getEta();
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE:
			return getTrackType();
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE:
			return getTrackSubType();
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR:
			return getActuator();
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE:
			return getTrackStructure();
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__UID:
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
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA:
			setEta((EtaIsoLineType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE:
			setTrackType((TrackTypeType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE:
			setTrackSubType((TrackSubTypeType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR:
			setActuator((TrackActuatorType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE:
			setTrackStructure((TrackStructureType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__UID:
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
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA:
			setEta((EtaIsoLineType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE:
			setTrackType((TrackTypeType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE:
			setTrackSubType((TrackSubTypeType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR:
			setActuator((TrackActuatorType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE:
			setTrackStructure((TrackStructureType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__UID:
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
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ETA:
			return eta != null;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_TYPE:
			return trackType != null;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_SUB_TYPE:
			return trackSubType != null;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__ACTUATOR:
			return actuator != null;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__TRACK_STRUCTURE:
			return trackStructure != null;
		case CpacsPackage.CONTROL_SURFACE_TRACK_TYPE_TYPE__UID:
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

} //ControlSurfaceTrackTypeTypeImpl
