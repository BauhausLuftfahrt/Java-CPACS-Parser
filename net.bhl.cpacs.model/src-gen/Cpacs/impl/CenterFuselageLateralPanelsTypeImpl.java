/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageLateralPanelsType;
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
 * An implementation of the model object '<em><b>Center Fuselage Lateral Panels Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getTransitionFrameUID <em>Transition Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getFwdLatPanelLowY <em>Fwd Lat Panel Low Y</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getFwdLatPanelSheetUID <em>Fwd Lat Panel Sheet UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getFwdLatPanelReinforcementUID <em>Fwd Lat Panel Reinforcement UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getRearLatPanelHeightStringerUID <em>Rear Lat Panel Height Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getRearLatPanelSheetUID <em>Rear Lat Panel Sheet UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getRearLatPanelReinforcementUID <em>Rear Lat Panel Reinforcement UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLateralPanelsTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageLateralPanelsTypeImpl extends ComplexBaseTypeImpl
		implements CenterFuselageLateralPanelsType {
	/**
	 * The cached value of the '{@link #getTransitionFrameUID() <em>Transition Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType transitionFrameUID;

	/**
	 * The cached value of the '{@link #getFwdLatPanelLowY() <em>Fwd Lat Panel Low Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwdLatPanelLowY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fwdLatPanelLowY;

	/**
	 * The cached value of the '{@link #getFwdLatPanelSheetUID() <em>Fwd Lat Panel Sheet UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwdLatPanelSheetUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fwdLatPanelSheetUID;

	/**
	 * The cached value of the '{@link #getFwdLatPanelReinforcementUID() <em>Fwd Lat Panel Reinforcement UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwdLatPanelReinforcementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fwdLatPanelReinforcementUID;

	/**
	 * The cached value of the '{@link #getRearLatPanelHeightStringerUID() <em>Rear Lat Panel Height Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearLatPanelHeightStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType rearLatPanelHeightStringerUID;

	/**
	 * The cached value of the '{@link #getRearLatPanelSheetUID() <em>Rear Lat Panel Sheet UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearLatPanelSheetUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType rearLatPanelSheetUID;

	/**
	 * The cached value of the '{@link #getRearLatPanelReinforcementUID() <em>Rear Lat Panel Reinforcement UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearLatPanelReinforcementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType rearLatPanelReinforcementUID;

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
	protected CenterFuselageLateralPanelsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageLateralPanelsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getTransitionFrameUID() {
		return transitionFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionFrameUID(StringUIDBaseType newTransitionFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldTransitionFrameUID = transitionFrameUID;
		transitionFrameUID = newTransitionFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID, oldTransitionFrameUID,
					newTransitionFrameUID);
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
	public void setTransitionFrameUID(StringUIDBaseType newTransitionFrameUID) {
		if (newTransitionFrameUID != transitionFrameUID) {
			NotificationChain msgs = null;
			if (transitionFrameUID != null)
				msgs = ((InternalEObject) transitionFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID,
						null, msgs);
			if (newTransitionFrameUID != null)
				msgs = ((InternalEObject) newTransitionFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID,
						null, msgs);
			msgs = basicSetTransitionFrameUID(newTransitionFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID, newTransitionFrameUID,
					newTransitionFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFwdLatPanelLowY() {
		return fwdLatPanelLowY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFwdLatPanelLowY(DoubleBaseType newFwdLatPanelLowY, NotificationChain msgs) {
		DoubleBaseType oldFwdLatPanelLowY = fwdLatPanelLowY;
		fwdLatPanelLowY = newFwdLatPanelLowY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y, oldFwdLatPanelLowY,
					newFwdLatPanelLowY);
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
	public void setFwdLatPanelLowY(DoubleBaseType newFwdLatPanelLowY) {
		if (newFwdLatPanelLowY != fwdLatPanelLowY) {
			NotificationChain msgs = null;
			if (fwdLatPanelLowY != null)
				msgs = ((InternalEObject) fwdLatPanelLowY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y,
						null, msgs);
			if (newFwdLatPanelLowY != null)
				msgs = ((InternalEObject) newFwdLatPanelLowY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y,
						null, msgs);
			msgs = basicSetFwdLatPanelLowY(newFwdLatPanelLowY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y, newFwdLatPanelLowY,
					newFwdLatPanelLowY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFwdLatPanelSheetUID() {
		return fwdLatPanelSheetUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFwdLatPanelSheetUID(StringUIDBaseType newFwdLatPanelSheetUID,
			NotificationChain msgs) {
		StringUIDBaseType oldFwdLatPanelSheetUID = fwdLatPanelSheetUID;
		fwdLatPanelSheetUID = newFwdLatPanelSheetUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID, oldFwdLatPanelSheetUID,
					newFwdLatPanelSheetUID);
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
	public void setFwdLatPanelSheetUID(StringUIDBaseType newFwdLatPanelSheetUID) {
		if (newFwdLatPanelSheetUID != fwdLatPanelSheetUID) {
			NotificationChain msgs = null;
			if (fwdLatPanelSheetUID != null)
				msgs = ((InternalEObject) fwdLatPanelSheetUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID,
						null, msgs);
			if (newFwdLatPanelSheetUID != null)
				msgs = ((InternalEObject) newFwdLatPanelSheetUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID,
						null, msgs);
			msgs = basicSetFwdLatPanelSheetUID(newFwdLatPanelSheetUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID, newFwdLatPanelSheetUID,
					newFwdLatPanelSheetUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFwdLatPanelReinforcementUID() {
		return fwdLatPanelReinforcementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFwdLatPanelReinforcementUID(StringUIDBaseType newFwdLatPanelReinforcementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldFwdLatPanelReinforcementUID = fwdLatPanelReinforcementUID;
		fwdLatPanelReinforcementUID = newFwdLatPanelReinforcementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID,
					oldFwdLatPanelReinforcementUID, newFwdLatPanelReinforcementUID);
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
	public void setFwdLatPanelReinforcementUID(StringUIDBaseType newFwdLatPanelReinforcementUID) {
		if (newFwdLatPanelReinforcementUID != fwdLatPanelReinforcementUID) {
			NotificationChain msgs = null;
			if (fwdLatPanelReinforcementUID != null)
				msgs = ((InternalEObject) fwdLatPanelReinforcementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID,
						null, msgs);
			if (newFwdLatPanelReinforcementUID != null)
				msgs = ((InternalEObject) newFwdLatPanelReinforcementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID,
						null, msgs);
			msgs = basicSetFwdLatPanelReinforcementUID(newFwdLatPanelReinforcementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID,
					newFwdLatPanelReinforcementUID, newFwdLatPanelReinforcementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRearLatPanelHeightStringerUID() {
		return rearLatPanelHeightStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRearLatPanelHeightStringerUID(StringUIDBaseType newRearLatPanelHeightStringerUID,
			NotificationChain msgs) {
		StringUIDBaseType oldRearLatPanelHeightStringerUID = rearLatPanelHeightStringerUID;
		rearLatPanelHeightStringerUID = newRearLatPanelHeightStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID,
					oldRearLatPanelHeightStringerUID, newRearLatPanelHeightStringerUID);
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
	public void setRearLatPanelHeightStringerUID(StringUIDBaseType newRearLatPanelHeightStringerUID) {
		if (newRearLatPanelHeightStringerUID != rearLatPanelHeightStringerUID) {
			NotificationChain msgs = null;
			if (rearLatPanelHeightStringerUID != null)
				msgs = ((InternalEObject) rearLatPanelHeightStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID,
						null, msgs);
			if (newRearLatPanelHeightStringerUID != null)
				msgs = ((InternalEObject) newRearLatPanelHeightStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID,
						null, msgs);
			msgs = basicSetRearLatPanelHeightStringerUID(newRearLatPanelHeightStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID,
					newRearLatPanelHeightStringerUID, newRearLatPanelHeightStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRearLatPanelSheetUID() {
		return rearLatPanelSheetUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRearLatPanelSheetUID(StringUIDBaseType newRearLatPanelSheetUID,
			NotificationChain msgs) {
		StringUIDBaseType oldRearLatPanelSheetUID = rearLatPanelSheetUID;
		rearLatPanelSheetUID = newRearLatPanelSheetUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID, oldRearLatPanelSheetUID,
					newRearLatPanelSheetUID);
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
	public void setRearLatPanelSheetUID(StringUIDBaseType newRearLatPanelSheetUID) {
		if (newRearLatPanelSheetUID != rearLatPanelSheetUID) {
			NotificationChain msgs = null;
			if (rearLatPanelSheetUID != null)
				msgs = ((InternalEObject) rearLatPanelSheetUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID,
						null, msgs);
			if (newRearLatPanelSheetUID != null)
				msgs = ((InternalEObject) newRearLatPanelSheetUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID,
						null, msgs);
			msgs = basicSetRearLatPanelSheetUID(newRearLatPanelSheetUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID, newRearLatPanelSheetUID,
					newRearLatPanelSheetUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRearLatPanelReinforcementUID() {
		return rearLatPanelReinforcementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRearLatPanelReinforcementUID(StringUIDBaseType newRearLatPanelReinforcementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldRearLatPanelReinforcementUID = rearLatPanelReinforcementUID;
		rearLatPanelReinforcementUID = newRearLatPanelReinforcementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID,
					oldRearLatPanelReinforcementUID, newRearLatPanelReinforcementUID);
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
	public void setRearLatPanelReinforcementUID(StringUIDBaseType newRearLatPanelReinforcementUID) {
		if (newRearLatPanelReinforcementUID != rearLatPanelReinforcementUID) {
			NotificationChain msgs = null;
			if (rearLatPanelReinforcementUID != null)
				msgs = ((InternalEObject) rearLatPanelReinforcementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID,
						null, msgs);
			if (newRearLatPanelReinforcementUID != null)
				msgs = ((InternalEObject) newRearLatPanelReinforcementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID,
						null, msgs);
			msgs = basicSetRearLatPanelReinforcementUID(newRearLatPanelReinforcementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID,
					newRearLatPanelReinforcementUID, newRearLatPanelReinforcementUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__UID,
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
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID:
			return basicSetTransitionFrameUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y:
			return basicSetFwdLatPanelLowY(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID:
			return basicSetFwdLatPanelSheetUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID:
			return basicSetFwdLatPanelReinforcementUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID:
			return basicSetRearLatPanelHeightStringerUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID:
			return basicSetRearLatPanelSheetUID(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID:
			return basicSetRearLatPanelReinforcementUID(null, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID:
			return getTransitionFrameUID();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y:
			return getFwdLatPanelLowY();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID:
			return getFwdLatPanelSheetUID();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID:
			return getFwdLatPanelReinforcementUID();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID:
			return getRearLatPanelHeightStringerUID();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID:
			return getRearLatPanelSheetUID();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID:
			return getRearLatPanelReinforcementUID();
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID:
			setTransitionFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y:
			setFwdLatPanelLowY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID:
			setFwdLatPanelSheetUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID:
			setFwdLatPanelReinforcementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID:
			setRearLatPanelHeightStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID:
			setRearLatPanelSheetUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID:
			setRearLatPanelReinforcementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID:
			setTransitionFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y:
			setFwdLatPanelLowY((DoubleBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID:
			setFwdLatPanelSheetUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID:
			setFwdLatPanelReinforcementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID:
			setRearLatPanelHeightStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID:
			setRearLatPanelSheetUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID:
			setRearLatPanelReinforcementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__TRANSITION_FRAME_UID:
			return transitionFrameUID != null;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_LOW_Y:
			return fwdLatPanelLowY != null;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_SHEET_UID:
			return fwdLatPanelSheetUID != null;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__FWD_LAT_PANEL_REINFORCEMENT_UID:
			return fwdLatPanelReinforcementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_HEIGHT_STRINGER_UID:
			return rearLatPanelHeightStringerUID != null;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_SHEET_UID:
			return rearLatPanelSheetUID != null;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__REAR_LAT_PANEL_REINFORCEMENT_UID:
			return rearLatPanelReinforcementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_LATERAL_PANELS_TYPE__UID:
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

} //CenterFuselageLateralPanelsTypeImpl
