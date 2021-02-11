/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LandingGearInterfaceDefinitionsType;
import Cpacs.LandingGearInterfaceKeelbeamType;
import Cpacs.LandingGearInterfaceLateralPanelsType;
import Cpacs.LandingGearInterfaceLongFloorBeamsConnectionType;
import Cpacs.LandingGearInterfaceMainFramesType;
import Cpacs.LandingGearInterfacePressureFloorType;
import Cpacs.LandingGearInterfaceSideboxType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Interface Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceDefinitionsTypeImpl#getLandingGearInterfaceMainFrames <em>Landing Gear Interface Main Frames</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceDefinitionsTypeImpl#getLandingGearInterfacePressureFloor <em>Landing Gear Interface Pressure Floor</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceDefinitionsTypeImpl#getLandingGearInterfaceSidebox <em>Landing Gear Interface Sidebox</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceDefinitionsTypeImpl#getLandingGearInterfaceLateralPanels <em>Landing Gear Interface Lateral Panels</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceDefinitionsTypeImpl#getLandingGearInterfaceKeelbeam <em>Landing Gear Interface Keelbeam</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceDefinitionsTypeImpl#getLandingGearInterfaceLongFloorBeamsConnection <em>Landing Gear Interface Long Floor Beams Connection</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearInterfaceDefinitionsTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearInterfaceDefinitionsTypeImpl extends ComplexBaseTypeImpl
		implements LandingGearInterfaceDefinitionsType {
	/**
	 * The cached value of the '{@link #getLandingGearInterfaceMainFrames() <em>Landing Gear Interface Main Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearInterfaceMainFrames()
	 * @generated
	 * @ordered
	 */
	protected LandingGearInterfaceMainFramesType landingGearInterfaceMainFrames;

	/**
	 * The cached value of the '{@link #getLandingGearInterfacePressureFloor() <em>Landing Gear Interface Pressure Floor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearInterfacePressureFloor()
	 * @generated
	 * @ordered
	 */
	protected LandingGearInterfacePressureFloorType landingGearInterfacePressureFloor;

	/**
	 * The cached value of the '{@link #getLandingGearInterfaceSidebox() <em>Landing Gear Interface Sidebox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearInterfaceSidebox()
	 * @generated
	 * @ordered
	 */
	protected LandingGearInterfaceSideboxType landingGearInterfaceSidebox;

	/**
	 * The cached value of the '{@link #getLandingGearInterfaceLateralPanels() <em>Landing Gear Interface Lateral Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearInterfaceLateralPanels()
	 * @generated
	 * @ordered
	 */
	protected LandingGearInterfaceLateralPanelsType landingGearInterfaceLateralPanels;

	/**
	 * The cached value of the '{@link #getLandingGearInterfaceKeelbeam() <em>Landing Gear Interface Keelbeam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearInterfaceKeelbeam()
	 * @generated
	 * @ordered
	 */
	protected LandingGearInterfaceKeelbeamType landingGearInterfaceKeelbeam;

	/**
	 * The cached value of the '{@link #getLandingGearInterfaceLongFloorBeamsConnection() <em>Landing Gear Interface Long Floor Beams Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearInterfaceLongFloorBeamsConnection()
	 * @generated
	 * @ordered
	 */
	protected LandingGearInterfaceLongFloorBeamsConnectionType landingGearInterfaceLongFloorBeamsConnection;

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
	protected LandingGearInterfaceDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearInterfaceDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceMainFramesType getLandingGearInterfaceMainFrames() {
		return landingGearInterfaceMainFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearInterfaceMainFrames(
			LandingGearInterfaceMainFramesType newLandingGearInterfaceMainFrames, NotificationChain msgs) {
		LandingGearInterfaceMainFramesType oldLandingGearInterfaceMainFrames = landingGearInterfaceMainFrames;
		landingGearInterfaceMainFrames = newLandingGearInterfaceMainFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES,
					oldLandingGearInterfaceMainFrames, newLandingGearInterfaceMainFrames);
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
	public void setLandingGearInterfaceMainFrames(
			LandingGearInterfaceMainFramesType newLandingGearInterfaceMainFrames) {
		if (newLandingGearInterfaceMainFrames != landingGearInterfaceMainFrames) {
			NotificationChain msgs = null;
			if (landingGearInterfaceMainFrames != null)
				msgs = ((InternalEObject) landingGearInterfaceMainFrames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES,
						null, msgs);
			if (newLandingGearInterfaceMainFrames != null)
				msgs = ((InternalEObject) newLandingGearInterfaceMainFrames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES,
						null, msgs);
			msgs = basicSetLandingGearInterfaceMainFrames(newLandingGearInterfaceMainFrames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES,
					newLandingGearInterfaceMainFrames, newLandingGearInterfaceMainFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfacePressureFloorType getLandingGearInterfacePressureFloor() {
		return landingGearInterfacePressureFloor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearInterfacePressureFloor(
			LandingGearInterfacePressureFloorType newLandingGearInterfacePressureFloor, NotificationChain msgs) {
		LandingGearInterfacePressureFloorType oldLandingGearInterfacePressureFloor = landingGearInterfacePressureFloor;
		landingGearInterfacePressureFloor = newLandingGearInterfacePressureFloor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR,
					oldLandingGearInterfacePressureFloor, newLandingGearInterfacePressureFloor);
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
	public void setLandingGearInterfacePressureFloor(
			LandingGearInterfacePressureFloorType newLandingGearInterfacePressureFloor) {
		if (newLandingGearInterfacePressureFloor != landingGearInterfacePressureFloor) {
			NotificationChain msgs = null;
			if (landingGearInterfacePressureFloor != null)
				msgs = ((InternalEObject) landingGearInterfacePressureFloor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR,
						null, msgs);
			if (newLandingGearInterfacePressureFloor != null)
				msgs = ((InternalEObject) newLandingGearInterfacePressureFloor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR,
						null, msgs);
			msgs = basicSetLandingGearInterfacePressureFloor(newLandingGearInterfacePressureFloor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR,
					newLandingGearInterfacePressureFloor, newLandingGearInterfacePressureFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceSideboxType getLandingGearInterfaceSidebox() {
		return landingGearInterfaceSidebox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearInterfaceSidebox(
			LandingGearInterfaceSideboxType newLandingGearInterfaceSidebox, NotificationChain msgs) {
		LandingGearInterfaceSideboxType oldLandingGearInterfaceSidebox = landingGearInterfaceSidebox;
		landingGearInterfaceSidebox = newLandingGearInterfaceSidebox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX,
					oldLandingGearInterfaceSidebox, newLandingGearInterfaceSidebox);
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
	public void setLandingGearInterfaceSidebox(LandingGearInterfaceSideboxType newLandingGearInterfaceSidebox) {
		if (newLandingGearInterfaceSidebox != landingGearInterfaceSidebox) {
			NotificationChain msgs = null;
			if (landingGearInterfaceSidebox != null)
				msgs = ((InternalEObject) landingGearInterfaceSidebox).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX,
						null, msgs);
			if (newLandingGearInterfaceSidebox != null)
				msgs = ((InternalEObject) newLandingGearInterfaceSidebox).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX,
						null, msgs);
			msgs = basicSetLandingGearInterfaceSidebox(newLandingGearInterfaceSidebox, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX,
					newLandingGearInterfaceSidebox, newLandingGearInterfaceSidebox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceLateralPanelsType getLandingGearInterfaceLateralPanels() {
		return landingGearInterfaceLateralPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearInterfaceLateralPanels(
			LandingGearInterfaceLateralPanelsType newLandingGearInterfaceLateralPanels, NotificationChain msgs) {
		LandingGearInterfaceLateralPanelsType oldLandingGearInterfaceLateralPanels = landingGearInterfaceLateralPanels;
		landingGearInterfaceLateralPanels = newLandingGearInterfaceLateralPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS,
					oldLandingGearInterfaceLateralPanels, newLandingGearInterfaceLateralPanels);
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
	public void setLandingGearInterfaceLateralPanels(
			LandingGearInterfaceLateralPanelsType newLandingGearInterfaceLateralPanels) {
		if (newLandingGearInterfaceLateralPanels != landingGearInterfaceLateralPanels) {
			NotificationChain msgs = null;
			if (landingGearInterfaceLateralPanels != null)
				msgs = ((InternalEObject) landingGearInterfaceLateralPanels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS,
						null, msgs);
			if (newLandingGearInterfaceLateralPanels != null)
				msgs = ((InternalEObject) newLandingGearInterfaceLateralPanels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS,
						null, msgs);
			msgs = basicSetLandingGearInterfaceLateralPanels(newLandingGearInterfaceLateralPanels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS,
					newLandingGearInterfaceLateralPanels, newLandingGearInterfaceLateralPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceKeelbeamType getLandingGearInterfaceKeelbeam() {
		return landingGearInterfaceKeelbeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearInterfaceKeelbeam(
			LandingGearInterfaceKeelbeamType newLandingGearInterfaceKeelbeam, NotificationChain msgs) {
		LandingGearInterfaceKeelbeamType oldLandingGearInterfaceKeelbeam = landingGearInterfaceKeelbeam;
		landingGearInterfaceKeelbeam = newLandingGearInterfaceKeelbeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM,
					oldLandingGearInterfaceKeelbeam, newLandingGearInterfaceKeelbeam);
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
	public void setLandingGearInterfaceKeelbeam(LandingGearInterfaceKeelbeamType newLandingGearInterfaceKeelbeam) {
		if (newLandingGearInterfaceKeelbeam != landingGearInterfaceKeelbeam) {
			NotificationChain msgs = null;
			if (landingGearInterfaceKeelbeam != null)
				msgs = ((InternalEObject) landingGearInterfaceKeelbeam).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM,
						null, msgs);
			if (newLandingGearInterfaceKeelbeam != null)
				msgs = ((InternalEObject) newLandingGearInterfaceKeelbeam).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM,
						null, msgs);
			msgs = basicSetLandingGearInterfaceKeelbeam(newLandingGearInterfaceKeelbeam, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM,
					newLandingGearInterfaceKeelbeam, newLandingGearInterfaceKeelbeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceLongFloorBeamsConnectionType getLandingGearInterfaceLongFloorBeamsConnection() {
		return landingGearInterfaceLongFloorBeamsConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearInterfaceLongFloorBeamsConnection(
			LandingGearInterfaceLongFloorBeamsConnectionType newLandingGearInterfaceLongFloorBeamsConnection,
			NotificationChain msgs) {
		LandingGearInterfaceLongFloorBeamsConnectionType oldLandingGearInterfaceLongFloorBeamsConnection = landingGearInterfaceLongFloorBeamsConnection;
		landingGearInterfaceLongFloorBeamsConnection = newLandingGearInterfaceLongFloorBeamsConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION,
					oldLandingGearInterfaceLongFloorBeamsConnection, newLandingGearInterfaceLongFloorBeamsConnection);
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
	public void setLandingGearInterfaceLongFloorBeamsConnection(
			LandingGearInterfaceLongFloorBeamsConnectionType newLandingGearInterfaceLongFloorBeamsConnection) {
		if (newLandingGearInterfaceLongFloorBeamsConnection != landingGearInterfaceLongFloorBeamsConnection) {
			NotificationChain msgs = null;
			if (landingGearInterfaceLongFloorBeamsConnection != null)
				msgs = ((InternalEObject) landingGearInterfaceLongFloorBeamsConnection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION,
						null, msgs);
			if (newLandingGearInterfaceLongFloorBeamsConnection != null)
				msgs = ((InternalEObject) newLandingGearInterfaceLongFloorBeamsConnection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION,
						null, msgs);
			msgs = basicSetLandingGearInterfaceLongFloorBeamsConnection(newLandingGearInterfaceLongFloorBeamsConnection,
					msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION,
					newLandingGearInterfaceLongFloorBeamsConnection, newLandingGearInterfaceLongFloorBeamsConnection));
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
					CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES:
			return basicSetLandingGearInterfaceMainFrames(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR:
			return basicSetLandingGearInterfacePressureFloor(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX:
			return basicSetLandingGearInterfaceSidebox(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS:
			return basicSetLandingGearInterfaceLateralPanels(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM:
			return basicSetLandingGearInterfaceKeelbeam(null, msgs);
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION:
			return basicSetLandingGearInterfaceLongFloorBeamsConnection(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES:
			return getLandingGearInterfaceMainFrames();
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR:
			return getLandingGearInterfacePressureFloor();
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX:
			return getLandingGearInterfaceSidebox();
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS:
			return getLandingGearInterfaceLateralPanels();
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM:
			return getLandingGearInterfaceKeelbeam();
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION:
			return getLandingGearInterfaceLongFloorBeamsConnection();
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES:
			setLandingGearInterfaceMainFrames((LandingGearInterfaceMainFramesType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR:
			setLandingGearInterfacePressureFloor((LandingGearInterfacePressureFloorType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX:
			setLandingGearInterfaceSidebox((LandingGearInterfaceSideboxType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS:
			setLandingGearInterfaceLateralPanels((LandingGearInterfaceLateralPanelsType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM:
			setLandingGearInterfaceKeelbeam((LandingGearInterfaceKeelbeamType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION:
			setLandingGearInterfaceLongFloorBeamsConnection(
					(LandingGearInterfaceLongFloorBeamsConnectionType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES:
			setLandingGearInterfaceMainFrames((LandingGearInterfaceMainFramesType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR:
			setLandingGearInterfacePressureFloor((LandingGearInterfacePressureFloorType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX:
			setLandingGearInterfaceSidebox((LandingGearInterfaceSideboxType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS:
			setLandingGearInterfaceLateralPanels((LandingGearInterfaceLateralPanelsType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM:
			setLandingGearInterfaceKeelbeam((LandingGearInterfaceKeelbeamType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION:
			setLandingGearInterfaceLongFloorBeamsConnection((LandingGearInterfaceLongFloorBeamsConnectionType) null);
			return;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__UID:
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
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_MAIN_FRAMES:
			return landingGearInterfaceMainFrames != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_PRESSURE_FLOOR:
			return landingGearInterfacePressureFloor != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_SIDEBOX:
			return landingGearInterfaceSidebox != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LATERAL_PANELS:
			return landingGearInterfaceLateralPanels != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_KEELBEAM:
			return landingGearInterfaceKeelbeam != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__LANDING_GEAR_INTERFACE_LONG_FLOOR_BEAMS_CONNECTION:
			return landingGearInterfaceLongFloorBeamsConnection != null;
		case CpacsPackage.LANDING_GEAR_INTERFACE_DEFINITIONS_TYPE__UID:
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

} //LandingGearInterfaceDefinitionsTypeImpl
