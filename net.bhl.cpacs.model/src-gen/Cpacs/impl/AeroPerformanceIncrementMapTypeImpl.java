/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceIncrementMapType;
import Cpacs.CpacsPackage;
import Cpacs.StringArrayBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Performance Increment Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getCommandInputs <em>Command Inputs</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getDcd <em>Dcd</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getDcs <em>Dcs</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getDcl <em>Dcl</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getDcmd <em>Dcmd</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getDcms <em>Dcms</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getDcml <em>Dcml</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceIncrementMapTypeImpl extends ComplexBaseTypeImpl
		implements AeroPerformanceIncrementMapType {
	/**
	 * The cached value of the '{@link #getControlDeviceUID() <em>Control Device UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDeviceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlDeviceUID;

	/**
	 * The cached value of the '{@link #getControlParameters() <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameters()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType controlParameters;

	/**
	 * The cached value of the '{@link #getControlDistributorUID() <em>Control Distributor UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDistributorUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlDistributorUID;

	/**
	 * The cached value of the '{@link #getCommandInputs() <em>Command Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandInputs()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType commandInputs;

	/**
	 * The cached value of the '{@link #getDcd() <em>Dcd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcd()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType dcd;

	/**
	 * The cached value of the '{@link #getDcs() <em>Dcs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcs()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType dcs;

	/**
	 * The cached value of the '{@link #getDcl() <em>Dcl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcl()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType dcl;

	/**
	 * The cached value of the '{@link #getDcmd() <em>Dcmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcmd()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType dcmd;

	/**
	 * The cached value of the '{@link #getDcms() <em>Dcms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcms()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType dcms;

	/**
	 * The cached value of the '{@link #getDcml() <em>Dcml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcml()
	 * @generated
	 * @ordered
	 */
	protected StringArrayBaseType dcml;

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
	protected AeroPerformanceIncrementMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceIncrementMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlDeviceUID() {
		return controlDeviceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlDeviceUID(StringUIDBaseType newControlDeviceUID, NotificationChain msgs) {
		StringUIDBaseType oldControlDeviceUID = controlDeviceUID;
		controlDeviceUID = newControlDeviceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID, oldControlDeviceUID,
					newControlDeviceUID);
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
	public void setControlDeviceUID(StringUIDBaseType newControlDeviceUID) {
		if (newControlDeviceUID != controlDeviceUID) {
			NotificationChain msgs = null;
			if (controlDeviceUID != null)
				msgs = ((InternalEObject) controlDeviceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID,
						null, msgs);
			if (newControlDeviceUID != null)
				msgs = ((InternalEObject) newControlDeviceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID,
						null, msgs);
			msgs = basicSetControlDeviceUID(newControlDeviceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID, newControlDeviceUID,
					newControlDeviceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getControlParameters() {
		return controlParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameters(StringVectorBaseType newControlParameters,
			NotificationChain msgs) {
		StringVectorBaseType oldControlParameters = controlParameters;
		controlParameters = newControlParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS, oldControlParameters,
					newControlParameters);
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
	public void setControlParameters(StringVectorBaseType newControlParameters) {
		if (newControlParameters != controlParameters) {
			NotificationChain msgs = null;
			if (controlParameters != null)
				msgs = ((InternalEObject) controlParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS,
						null, msgs);
			if (newControlParameters != null)
				msgs = ((InternalEObject) newControlParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS,
						null, msgs);
			msgs = basicSetControlParameters(newControlParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS, newControlParameters,
					newControlParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlDistributorUID() {
		return controlDistributorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlDistributorUID(StringUIDBaseType newControlDistributorUID,
			NotificationChain msgs) {
		StringUIDBaseType oldControlDistributorUID = controlDistributorUID;
		controlDistributorUID = newControlDistributorUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID, oldControlDistributorUID,
					newControlDistributorUID);
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
	public void setControlDistributorUID(StringUIDBaseType newControlDistributorUID) {
		if (newControlDistributorUID != controlDistributorUID) {
			NotificationChain msgs = null;
			if (controlDistributorUID != null)
				msgs = ((InternalEObject) controlDistributorUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID,
						null, msgs);
			if (newControlDistributorUID != null)
				msgs = ((InternalEObject) newControlDistributorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID,
						null, msgs);
			msgs = basicSetControlDistributorUID(newControlDistributorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID, newControlDistributorUID,
					newControlDistributorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCommandInputs() {
		return commandInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandInputs(StringVectorBaseType newCommandInputs, NotificationChain msgs) {
		StringVectorBaseType oldCommandInputs = commandInputs;
		commandInputs = newCommandInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS, oldCommandInputs,
					newCommandInputs);
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
	public void setCommandInputs(StringVectorBaseType newCommandInputs) {
		if (newCommandInputs != commandInputs) {
			NotificationChain msgs = null;
			if (commandInputs != null)
				msgs = ((InternalEObject) commandInputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS, null,
						msgs);
			if (newCommandInputs != null)
				msgs = ((InternalEObject) newCommandInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS, null,
						msgs);
			msgs = basicSetCommandInputs(newCommandInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS, newCommandInputs,
					newCommandInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getDcd() {
		return dcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcd(StringArrayBaseType newDcd, NotificationChain msgs) {
		StringArrayBaseType oldDcd = dcd;
		dcd = newDcd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD, oldDcd, newDcd);
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
	public void setDcd(StringArrayBaseType newDcd) {
		if (newDcd != dcd) {
			NotificationChain msgs = null;
			if (dcd != null)
				msgs = ((InternalEObject) dcd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD, null, msgs);
			if (newDcd != null)
				msgs = ((InternalEObject) newDcd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD, null, msgs);
			msgs = basicSetDcd(newDcd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD,
					newDcd, newDcd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getDcs() {
		return dcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcs(StringArrayBaseType newDcs, NotificationChain msgs) {
		StringArrayBaseType oldDcs = dcs;
		dcs = newDcs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS, oldDcs, newDcs);
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
	public void setDcs(StringArrayBaseType newDcs) {
		if (newDcs != dcs) {
			NotificationChain msgs = null;
			if (dcs != null)
				msgs = ((InternalEObject) dcs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS, null, msgs);
			if (newDcs != null)
				msgs = ((InternalEObject) newDcs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS, null, msgs);
			msgs = basicSetDcs(newDcs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS,
					newDcs, newDcs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getDcl() {
		return dcl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcl(StringArrayBaseType newDcl, NotificationChain msgs) {
		StringArrayBaseType oldDcl = dcl;
		dcl = newDcl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL, oldDcl, newDcl);
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
	public void setDcl(StringArrayBaseType newDcl) {
		if (newDcl != dcl) {
			NotificationChain msgs = null;
			if (dcl != null)
				msgs = ((InternalEObject) dcl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL, null, msgs);
			if (newDcl != null)
				msgs = ((InternalEObject) newDcl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL, null, msgs);
			msgs = basicSetDcl(newDcl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL,
					newDcl, newDcl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getDcmd() {
		return dcmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcmd(StringArrayBaseType newDcmd, NotificationChain msgs) {
		StringArrayBaseType oldDcmd = dcmd;
		dcmd = newDcmd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD, oldDcmd, newDcmd);
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
	public void setDcmd(StringArrayBaseType newDcmd) {
		if (newDcmd != dcmd) {
			NotificationChain msgs = null;
			if (dcmd != null)
				msgs = ((InternalEObject) dcmd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD, null, msgs);
			if (newDcmd != null)
				msgs = ((InternalEObject) newDcmd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD, null, msgs);
			msgs = basicSetDcmd(newDcmd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD, newDcmd, newDcmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getDcms() {
		return dcms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcms(StringArrayBaseType newDcms, NotificationChain msgs) {
		StringArrayBaseType oldDcms = dcms;
		dcms = newDcms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS, oldDcms, newDcms);
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
	public void setDcms(StringArrayBaseType newDcms) {
		if (newDcms != dcms) {
			NotificationChain msgs = null;
			if (dcms != null)
				msgs = ((InternalEObject) dcms).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS, null, msgs);
			if (newDcms != null)
				msgs = ((InternalEObject) newDcms).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS, null, msgs);
			msgs = basicSetDcms(newDcms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS, newDcms, newDcms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringArrayBaseType getDcml() {
		return dcml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDcml(StringArrayBaseType newDcml, NotificationChain msgs) {
		StringArrayBaseType oldDcml = dcml;
		dcml = newDcml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML, oldDcml, newDcml);
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
	public void setDcml(StringArrayBaseType newDcml) {
		if (newDcml != dcml) {
			NotificationChain msgs = null;
			if (dcml != null)
				msgs = ((InternalEObject) dcml).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML, null, msgs);
			if (newDcml != null)
				msgs = ((InternalEObject) newDcml).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML, null, msgs);
			msgs = basicSetDcml(newDcml, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML, newDcml, newDcml));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__UID,
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			return basicSetControlDeviceUID(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			return basicSetControlParameters(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			return basicSetControlDistributorUID(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			return basicSetCommandInputs(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD:
			return basicSetDcd(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS:
			return basicSetDcs(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL:
			return basicSetDcl(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD:
			return basicSetDcmd(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS:
			return basicSetDcms(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML:
			return basicSetDcml(null, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			return getControlDeviceUID();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			return getControlParameters();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			return getControlDistributorUID();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			return getCommandInputs();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD:
			return getDcd();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS:
			return getDcs();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL:
			return getDcl();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD:
			return getDcmd();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS:
			return getDcms();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML:
			return getDcml();
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__UID:
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			setControlParameters((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			setCommandInputs((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD:
			setDcd((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS:
			setDcs((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL:
			setDcl((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD:
			setDcmd((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS:
			setDcms((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML:
			setDcml((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__UID:
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			setControlParameters((StringVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			setCommandInputs((StringVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD:
			setDcd((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS:
			setDcs((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL:
			setDcl((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD:
			setDcmd((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS:
			setDcms((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML:
			setDcml((StringArrayBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__UID:
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			return controlDeviceUID != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			return controlParameters != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			return controlDistributorUID != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			return commandInputs != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCD:
			return dcd != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCS:
			return dcs != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCL:
			return dcl != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMD:
			return dcmd != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCMS:
			return dcms != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__DCML:
			return dcml != null;
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAP_TYPE__UID:
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

} //AeroPerformanceIncrementMapTypeImpl
