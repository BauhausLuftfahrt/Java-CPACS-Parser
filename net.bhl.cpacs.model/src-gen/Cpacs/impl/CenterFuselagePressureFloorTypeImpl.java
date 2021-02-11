/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselagePressureFloorType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Fuselage Pressure Floor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselagePressureFloorTypeImpl#getPositionZStringerUID <em>Position ZStringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselagePressureFloorTypeImpl#getStartHorizontalFrameUID <em>Start Horizontal Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselagePressureFloorTypeImpl#getMembraneRadius <em>Membrane Radius</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselagePressureFloorTypeImpl#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselagePressureFloorTypeImpl#getReinforcementElementUID <em>Reinforcement Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselagePressureFloorTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselagePressureFloorTypeImpl extends ComplexBaseTypeImpl
		implements CenterFuselagePressureFloorType {
	/**
	 * The cached value of the '{@link #getPositionZStringerUID() <em>Position ZStringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionZStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType positionZStringerUID;

	/**
	 * The cached value of the '{@link #getStartHorizontalFrameUID() <em>Start Horizontal Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartHorizontalFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startHorizontalFrameUID;

	/**
	 * The cached value of the '{@link #getMembraneRadius() <em>Membrane Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembraneRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType membraneRadius;

	/**
	 * The cached value of the '{@link #getSheetElementUID() <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sheetElementUID;

	/**
	 * The cached value of the '{@link #getReinforcementElementUID() <em>Reinforcement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType reinforcementElementUID;

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
	protected CenterFuselagePressureFloorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselagePressureFloorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPositionZStringerUID() {
		return positionZStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionZStringerUID(StringUIDBaseType newPositionZStringerUID,
			NotificationChain msgs) {
		StringUIDBaseType oldPositionZStringerUID = positionZStringerUID;
		positionZStringerUID = newPositionZStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID, oldPositionZStringerUID,
					newPositionZStringerUID);
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
	public void setPositionZStringerUID(StringUIDBaseType newPositionZStringerUID) {
		if (newPositionZStringerUID != positionZStringerUID) {
			NotificationChain msgs = null;
			if (positionZStringerUID != null)
				msgs = ((InternalEObject) positionZStringerUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID, null, msgs);
			if (newPositionZStringerUID != null)
				msgs = ((InternalEObject) newPositionZStringerUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID, null, msgs);
			msgs = basicSetPositionZStringerUID(newPositionZStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID, newPositionZStringerUID,
					newPositionZStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartHorizontalFrameUID() {
		return startHorizontalFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartHorizontalFrameUID(StringUIDBaseType newStartHorizontalFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStartHorizontalFrameUID = startHorizontalFrameUID;
		startHorizontalFrameUID = newStartHorizontalFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID,
					oldStartHorizontalFrameUID, newStartHorizontalFrameUID);
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
	public void setStartHorizontalFrameUID(StringUIDBaseType newStartHorizontalFrameUID) {
		if (newStartHorizontalFrameUID != startHorizontalFrameUID) {
			NotificationChain msgs = null;
			if (startHorizontalFrameUID != null)
				msgs = ((InternalEObject) startHorizontalFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID,
						null, msgs);
			if (newStartHorizontalFrameUID != null)
				msgs = ((InternalEObject) newStartHorizontalFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID,
						null, msgs);
			msgs = basicSetStartHorizontalFrameUID(newStartHorizontalFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID,
					newStartHorizontalFrameUID, newStartHorizontalFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMembraneRadius() {
		return membraneRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembraneRadius(DoubleBaseType newMembraneRadius, NotificationChain msgs) {
		DoubleBaseType oldMembraneRadius = membraneRadius;
		membraneRadius = newMembraneRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS, oldMembraneRadius,
					newMembraneRadius);
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
	public void setMembraneRadius(DoubleBaseType newMembraneRadius) {
		if (newMembraneRadius != membraneRadius) {
			NotificationChain msgs = null;
			if (membraneRadius != null)
				msgs = ((InternalEObject) membraneRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS,
						null, msgs);
			if (newMembraneRadius != null)
				msgs = ((InternalEObject) newMembraneRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS,
						null, msgs);
			msgs = basicSetMembraneRadius(newMembraneRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS, newMembraneRadius,
					newMembraneRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSheetElementUID() {
		return sheetElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetElementUID(StringUIDBaseType newSheetElementUID, NotificationChain msgs) {
		StringUIDBaseType oldSheetElementUID = sheetElementUID;
		sheetElementUID = newSheetElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID, oldSheetElementUID,
					newSheetElementUID);
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
	public void setSheetElementUID(StringUIDBaseType newSheetElementUID) {
		if (newSheetElementUID != sheetElementUID) {
			NotificationChain msgs = null;
			if (sheetElementUID != null)
				msgs = ((InternalEObject) sheetElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID,
						null, msgs);
			if (newSheetElementUID != null)
				msgs = ((InternalEObject) newSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID,
						null, msgs);
			msgs = basicSetSheetElementUID(newSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID, newSheetElementUID,
					newSheetElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReinforcementElementUID() {
		return reinforcementElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReinforcementElementUID(StringUIDBaseType newReinforcementElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldReinforcementElementUID = reinforcementElementUID;
		reinforcementElementUID = newReinforcementElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID,
					oldReinforcementElementUID, newReinforcementElementUID);
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
	public void setReinforcementElementUID(StringUIDBaseType newReinforcementElementUID) {
		if (newReinforcementElementUID != reinforcementElementUID) {
			NotificationChain msgs = null;
			if (reinforcementElementUID != null)
				msgs = ((InternalEObject) reinforcementElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID,
						null, msgs);
			if (newReinforcementElementUID != null)
				msgs = ((InternalEObject) newReinforcementElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID,
						null, msgs);
			msgs = basicSetReinforcementElementUID(newReinforcementElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID,
					newReinforcementElementUID, newReinforcementElementUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__UID,
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
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID:
			return basicSetPositionZStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID:
			return basicSetStartHorizontalFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS:
			return basicSetMembraneRadius(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID:
			return basicSetSheetElementUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID:
			return basicSetReinforcementElementUID(null, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID:
			return getPositionZStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID:
			return getStartHorizontalFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS:
			return getMembraneRadius();
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID:
			return getSheetElementUID();
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID:
			return getReinforcementElementUID();
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID:
			setPositionZStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID:
			setStartHorizontalFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS:
			setMembraneRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID:
			setReinforcementElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID:
			setPositionZStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID:
			setStartHorizontalFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS:
			setMembraneRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID:
			setReinforcementElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__POSITION_ZSTRINGER_UID:
			return positionZStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__START_HORIZONTAL_FRAME_UID:
			return startHorizontalFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__MEMBRANE_RADIUS:
			return membraneRadius != null;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__SHEET_ELEMENT_UID:
			return sheetElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__REINFORCEMENT_ELEMENT_UID:
			return reinforcementElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_PRESSURE_FLOOR_TYPE__UID:
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

} //CenterFuselagePressureFloorTypeImpl
