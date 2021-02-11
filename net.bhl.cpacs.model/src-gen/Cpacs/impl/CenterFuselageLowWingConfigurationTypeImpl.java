/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageKeelbeamType;
import Cpacs.CenterFuselageLateralPanelsType;
import Cpacs.CenterFuselageLongFloorBeamsConnectionType;
import Cpacs.CenterFuselageLowWingConfigurationType;
import Cpacs.CenterFuselageMainFramesType;
import Cpacs.CenterFuselagePressureFloorType;
import Cpacs.CenterFuselageSideboxType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Fuselage Low Wing Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageLowWingConfigurationTypeImpl#getCenterFuselageMainFrames <em>Center Fuselage Main Frames</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLowWingConfigurationTypeImpl#getCenterFuselagePressureFloor <em>Center Fuselage Pressure Floor</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLowWingConfigurationTypeImpl#getCenterFuselageSidebox <em>Center Fuselage Sidebox</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLowWingConfigurationTypeImpl#getCenterFuselageLateralPanels <em>Center Fuselage Lateral Panels</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLowWingConfigurationTypeImpl#getCenterFuselageKeelbeam <em>Center Fuselage Keelbeam</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLowWingConfigurationTypeImpl#getCenterFuselageLongFloorBeamsConnection <em>Center Fuselage Long Floor Beams Connection</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageLowWingConfigurationTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageLowWingConfigurationTypeImpl extends ComplexBaseTypeImpl
		implements CenterFuselageLowWingConfigurationType {
	/**
	 * The cached value of the '{@link #getCenterFuselageMainFrames() <em>Center Fuselage Main Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageMainFrames()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageMainFramesType centerFuselageMainFrames;

	/**
	 * The cached value of the '{@link #getCenterFuselagePressureFloor() <em>Center Fuselage Pressure Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselagePressureFloor()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselagePressureFloorType centerFuselagePressureFloor;

	/**
	 * The cached value of the '{@link #getCenterFuselageSidebox() <em>Center Fuselage Sidebox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageSidebox()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageSideboxType centerFuselageSidebox;

	/**
	 * The cached value of the '{@link #getCenterFuselageLateralPanels() <em>Center Fuselage Lateral Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageLateralPanels()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageLateralPanelsType centerFuselageLateralPanels;

	/**
	 * The cached value of the '{@link #getCenterFuselageKeelbeam() <em>Center Fuselage Keelbeam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageKeelbeam()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageKeelbeamType centerFuselageKeelbeam;

	/**
	 * The cached value of the '{@link #getCenterFuselageLongFloorBeamsConnection() <em>Center Fuselage Long Floor Beams Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterFuselageLongFloorBeamsConnection()
	 * @generated
	 * @ordered
	 */
	protected CenterFuselageLongFloorBeamsConnectionType centerFuselageLongFloorBeamsConnection;

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
	protected CenterFuselageLowWingConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageLowWingConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageMainFramesType getCenterFuselageMainFrames() {
		return centerFuselageMainFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageMainFrames(CenterFuselageMainFramesType newCenterFuselageMainFrames,
			NotificationChain msgs) {
		CenterFuselageMainFramesType oldCenterFuselageMainFrames = centerFuselageMainFrames;
		centerFuselageMainFrames = newCenterFuselageMainFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES,
					oldCenterFuselageMainFrames, newCenterFuselageMainFrames);
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
	public void setCenterFuselageMainFrames(CenterFuselageMainFramesType newCenterFuselageMainFrames) {
		if (newCenterFuselageMainFrames != centerFuselageMainFrames) {
			NotificationChain msgs = null;
			if (centerFuselageMainFrames != null)
				msgs = ((InternalEObject) centerFuselageMainFrames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES,
						null, msgs);
			if (newCenterFuselageMainFrames != null)
				msgs = ((InternalEObject) newCenterFuselageMainFrames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES,
						null, msgs);
			msgs = basicSetCenterFuselageMainFrames(newCenterFuselageMainFrames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES,
					newCenterFuselageMainFrames, newCenterFuselageMainFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselagePressureFloorType getCenterFuselagePressureFloor() {
		return centerFuselagePressureFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselagePressureFloor(
			CenterFuselagePressureFloorType newCenterFuselagePressureFloor, NotificationChain msgs) {
		CenterFuselagePressureFloorType oldCenterFuselagePressureFloor = centerFuselagePressureFloor;
		centerFuselagePressureFloor = newCenterFuselagePressureFloor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR,
					oldCenterFuselagePressureFloor, newCenterFuselagePressureFloor);
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
	public void setCenterFuselagePressureFloor(CenterFuselagePressureFloorType newCenterFuselagePressureFloor) {
		if (newCenterFuselagePressureFloor != centerFuselagePressureFloor) {
			NotificationChain msgs = null;
			if (centerFuselagePressureFloor != null)
				msgs = ((InternalEObject) centerFuselagePressureFloor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR,
						null, msgs);
			if (newCenterFuselagePressureFloor != null)
				msgs = ((InternalEObject) newCenterFuselagePressureFloor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR,
						null, msgs);
			msgs = basicSetCenterFuselagePressureFloor(newCenterFuselagePressureFloor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR,
					newCenterFuselagePressureFloor, newCenterFuselagePressureFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageSideboxType getCenterFuselageSidebox() {
		return centerFuselageSidebox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageSidebox(CenterFuselageSideboxType newCenterFuselageSidebox,
			NotificationChain msgs) {
		CenterFuselageSideboxType oldCenterFuselageSidebox = centerFuselageSidebox;
		centerFuselageSidebox = newCenterFuselageSidebox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX,
					oldCenterFuselageSidebox, newCenterFuselageSidebox);
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
	public void setCenterFuselageSidebox(CenterFuselageSideboxType newCenterFuselageSidebox) {
		if (newCenterFuselageSidebox != centerFuselageSidebox) {
			NotificationChain msgs = null;
			if (centerFuselageSidebox != null)
				msgs = ((InternalEObject) centerFuselageSidebox).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX,
						null, msgs);
			if (newCenterFuselageSidebox != null)
				msgs = ((InternalEObject) newCenterFuselageSidebox).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX,
						null, msgs);
			msgs = basicSetCenterFuselageSidebox(newCenterFuselageSidebox, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX,
					newCenterFuselageSidebox, newCenterFuselageSidebox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageLateralPanelsType getCenterFuselageLateralPanels() {
		return centerFuselageLateralPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageLateralPanels(
			CenterFuselageLateralPanelsType newCenterFuselageLateralPanels, NotificationChain msgs) {
		CenterFuselageLateralPanelsType oldCenterFuselageLateralPanels = centerFuselageLateralPanels;
		centerFuselageLateralPanels = newCenterFuselageLateralPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS,
					oldCenterFuselageLateralPanels, newCenterFuselageLateralPanels);
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
	public void setCenterFuselageLateralPanels(CenterFuselageLateralPanelsType newCenterFuselageLateralPanels) {
		if (newCenterFuselageLateralPanels != centerFuselageLateralPanels) {
			NotificationChain msgs = null;
			if (centerFuselageLateralPanels != null)
				msgs = ((InternalEObject) centerFuselageLateralPanels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS,
						null, msgs);
			if (newCenterFuselageLateralPanels != null)
				msgs = ((InternalEObject) newCenterFuselageLateralPanels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS,
						null, msgs);
			msgs = basicSetCenterFuselageLateralPanels(newCenterFuselageLateralPanels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS,
					newCenterFuselageLateralPanels, newCenterFuselageLateralPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageKeelbeamType getCenterFuselageKeelbeam() {
		return centerFuselageKeelbeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageKeelbeam(CenterFuselageKeelbeamType newCenterFuselageKeelbeam,
			NotificationChain msgs) {
		CenterFuselageKeelbeamType oldCenterFuselageKeelbeam = centerFuselageKeelbeam;
		centerFuselageKeelbeam = newCenterFuselageKeelbeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM,
					oldCenterFuselageKeelbeam, newCenterFuselageKeelbeam);
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
	public void setCenterFuselageKeelbeam(CenterFuselageKeelbeamType newCenterFuselageKeelbeam) {
		if (newCenterFuselageKeelbeam != centerFuselageKeelbeam) {
			NotificationChain msgs = null;
			if (centerFuselageKeelbeam != null)
				msgs = ((InternalEObject) centerFuselageKeelbeam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM,
						null, msgs);
			if (newCenterFuselageKeelbeam != null)
				msgs = ((InternalEObject) newCenterFuselageKeelbeam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM,
						null, msgs);
			msgs = basicSetCenterFuselageKeelbeam(newCenterFuselageKeelbeam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM,
					newCenterFuselageKeelbeam, newCenterFuselageKeelbeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CenterFuselageLongFloorBeamsConnectionType getCenterFuselageLongFloorBeamsConnection() {
		return centerFuselageLongFloorBeamsConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenterFuselageLongFloorBeamsConnection(
			CenterFuselageLongFloorBeamsConnectionType newCenterFuselageLongFloorBeamsConnection,
			NotificationChain msgs) {
		CenterFuselageLongFloorBeamsConnectionType oldCenterFuselageLongFloorBeamsConnection = centerFuselageLongFloorBeamsConnection;
		centerFuselageLongFloorBeamsConnection = newCenterFuselageLongFloorBeamsConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION,
					oldCenterFuselageLongFloorBeamsConnection, newCenterFuselageLongFloorBeamsConnection);
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
	public void setCenterFuselageLongFloorBeamsConnection(
			CenterFuselageLongFloorBeamsConnectionType newCenterFuselageLongFloorBeamsConnection) {
		if (newCenterFuselageLongFloorBeamsConnection != centerFuselageLongFloorBeamsConnection) {
			NotificationChain msgs = null;
			if (centerFuselageLongFloorBeamsConnection != null)
				msgs = ((InternalEObject) centerFuselageLongFloorBeamsConnection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION,
						null, msgs);
			if (newCenterFuselageLongFloorBeamsConnection != null)
				msgs = ((InternalEObject) newCenterFuselageLongFloorBeamsConnection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION,
						null, msgs);
			msgs = basicSetCenterFuselageLongFloorBeamsConnection(newCenterFuselageLongFloorBeamsConnection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION,
					newCenterFuselageLongFloorBeamsConnection, newCenterFuselageLongFloorBeamsConnection));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES:
			return basicSetCenterFuselageMainFrames(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR:
			return basicSetCenterFuselagePressureFloor(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX:
			return basicSetCenterFuselageSidebox(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS:
			return basicSetCenterFuselageLateralPanels(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM:
			return basicSetCenterFuselageKeelbeam(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION:
			return basicSetCenterFuselageLongFloorBeamsConnection(null, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES:
			return getCenterFuselageMainFrames();
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR:
			return getCenterFuselagePressureFloor();
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX:
			return getCenterFuselageSidebox();
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS:
			return getCenterFuselageLateralPanels();
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM:
			return getCenterFuselageKeelbeam();
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION:
			return getCenterFuselageLongFloorBeamsConnection();
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES:
			setCenterFuselageMainFrames((CenterFuselageMainFramesType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR:
			setCenterFuselagePressureFloor((CenterFuselagePressureFloorType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX:
			setCenterFuselageSidebox((CenterFuselageSideboxType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS:
			setCenterFuselageLateralPanels((CenterFuselageLateralPanelsType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM:
			setCenterFuselageKeelbeam((CenterFuselageKeelbeamType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION:
			setCenterFuselageLongFloorBeamsConnection((CenterFuselageLongFloorBeamsConnectionType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES:
			setCenterFuselageMainFrames((CenterFuselageMainFramesType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR:
			setCenterFuselagePressureFloor((CenterFuselagePressureFloorType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX:
			setCenterFuselageSidebox((CenterFuselageSideboxType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS:
			setCenterFuselageLateralPanels((CenterFuselageLateralPanelsType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM:
			setCenterFuselageKeelbeam((CenterFuselageKeelbeamType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION:
			setCenterFuselageLongFloorBeamsConnection((CenterFuselageLongFloorBeamsConnectionType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_MAIN_FRAMES:
			return centerFuselageMainFrames != null;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_PRESSURE_FLOOR:
			return centerFuselagePressureFloor != null;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_SIDEBOX:
			return centerFuselageSidebox != null;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LATERAL_PANELS:
			return centerFuselageLateralPanels != null;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_KEELBEAM:
			return centerFuselageKeelbeam != null;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__CENTER_FUSELAGE_LONG_FLOOR_BEAMS_CONNECTION:
			return centerFuselageLongFloorBeamsConnection != null;
		case CpacsPackage.CENTER_FUSELAGE_LOW_WING_CONFIGURATION_TYPE__UID:
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

} //CenterFuselageLowWingConfigurationTypeImpl
