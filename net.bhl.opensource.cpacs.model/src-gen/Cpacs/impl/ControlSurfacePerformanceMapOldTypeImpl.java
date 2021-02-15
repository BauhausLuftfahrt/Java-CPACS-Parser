/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfacePerformanceMapOldType;
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
 * An implementation of the model object '<em><b>Control Surface Performance Map Old Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getControlSurfaceUID <em>Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getRelDeflection <em>Rel Deflection</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getDcd <em>Dcd</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getDcs <em>Dcs</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getDcl <em>Dcl</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getDcmd <em>Dcmd</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getDcms <em>Dcms</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacePerformanceMapOldTypeImpl#getDcml <em>Dcml</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfacePerformanceMapOldTypeImpl extends ComplexBaseTypeImpl
		implements ControlSurfacePerformanceMapOldType {
	/**
	 * The cached value of the '{@link #getControlSurfaceUID() <em>Control Surface UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlSurfaceUID;

	/**
	 * The cached value of the '{@link #getRelDeflection() <em>Rel Deflection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelDeflection()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType relDeflection;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfacePerformanceMapOldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfacePerformanceMapOldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlSurfaceUID() {
		return controlSurfaceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaceUID(StringUIDBaseType newControlSurfaceUID, NotificationChain msgs) {
		StringUIDBaseType oldControlSurfaceUID = controlSurfaceUID;
		controlSurfaceUID = newControlSurfaceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID, oldControlSurfaceUID,
					newControlSurfaceUID);
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
	public void setControlSurfaceUID(StringUIDBaseType newControlSurfaceUID) {
		if (newControlSurfaceUID != controlSurfaceUID) {
			NotificationChain msgs = null;
			if (controlSurfaceUID != null)
				msgs = ((InternalEObject) controlSurfaceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID,
						null, msgs);
			if (newControlSurfaceUID != null)
				msgs = ((InternalEObject) newControlSurfaceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID,
						null, msgs);
			msgs = basicSetControlSurfaceUID(newControlSurfaceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID, newControlSurfaceUID,
					newControlSurfaceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getRelDeflection() {
		return relDeflection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelDeflection(StringVectorBaseType newRelDeflection, NotificationChain msgs) {
		StringVectorBaseType oldRelDeflection = relDeflection;
		relDeflection = newRelDeflection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION, oldRelDeflection,
					newRelDeflection);
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
	public void setRelDeflection(StringVectorBaseType newRelDeflection) {
		if (newRelDeflection != relDeflection) {
			NotificationChain msgs = null;
			if (relDeflection != null)
				msgs = ((InternalEObject) relDeflection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION,
						null, msgs);
			if (newRelDeflection != null)
				msgs = ((InternalEObject) newRelDeflection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION,
						null, msgs);
			msgs = basicSetRelDeflection(newRelDeflection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION, newRelDeflection,
					newRelDeflection));
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
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD, oldDcd, newDcd);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD, null,
						msgs);
			if (newDcd != null)
				msgs = ((InternalEObject) newDcd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD, null,
						msgs);
			msgs = basicSetDcd(newDcd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD, newDcd, newDcd));
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
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS, oldDcs, newDcs);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS, null,
						msgs);
			if (newDcs != null)
				msgs = ((InternalEObject) newDcs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS, null,
						msgs);
			msgs = basicSetDcs(newDcs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS, newDcs, newDcs));
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
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL, oldDcl, newDcl);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL, null,
						msgs);
			if (newDcl != null)
				msgs = ((InternalEObject) newDcl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL, null,
						msgs);
			msgs = basicSetDcl(newDcl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL, newDcl, newDcl));
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
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD, oldDcmd, newDcmd);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD, null,
						msgs);
			if (newDcmd != null)
				msgs = ((InternalEObject) newDcmd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD, null,
						msgs);
			msgs = basicSetDcmd(newDcmd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD, newDcmd, newDcmd));
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
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS, oldDcms, newDcms);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS, null,
						msgs);
			if (newDcms != null)
				msgs = ((InternalEObject) newDcms).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS, null,
						msgs);
			msgs = basicSetDcms(newDcms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS, newDcms, newDcms));
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
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML, oldDcml, newDcml);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML, null,
						msgs);
			if (newDcml != null)
				msgs = ((InternalEObject) newDcml).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML, null,
						msgs);
			msgs = basicSetDcml(newDcml, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML, newDcml, newDcml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID:
			return basicSetControlSurfaceUID(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION:
			return basicSetRelDeflection(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD:
			return basicSetDcd(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS:
			return basicSetDcs(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL:
			return basicSetDcl(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD:
			return basicSetDcmd(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS:
			return basicSetDcms(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML:
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
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID:
			return getControlSurfaceUID();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION:
			return getRelDeflection();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD:
			return getDcd();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS:
			return getDcs();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL:
			return getDcl();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD:
			return getDcmd();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS:
			return getDcms();
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML:
			return getDcml();
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
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID:
			setControlSurfaceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION:
			setRelDeflection((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD:
			setDcd((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS:
			setDcs((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL:
			setDcl((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD:
			setDcmd((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS:
			setDcms((StringArrayBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML:
			setDcml((StringArrayBaseType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID:
			setControlSurfaceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION:
			setRelDeflection((StringVectorBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD:
			setDcd((StringArrayBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS:
			setDcs((StringArrayBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL:
			setDcl((StringArrayBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD:
			setDcmd((StringArrayBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS:
			setDcms((StringArrayBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML:
			setDcml((StringArrayBaseType) null);
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
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__CONTROL_SURFACE_UID:
			return controlSurfaceUID != null;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__REL_DEFLECTION:
			return relDeflection != null;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCD:
			return dcd != null;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCS:
			return dcs != null;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCL:
			return dcl != null;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMD:
			return dcmd != null;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCMS:
			return dcms != null;
		case CpacsPackage.CONTROL_SURFACE_PERFORMANCE_MAP_OLD_TYPE__DCML:
			return dcml != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfacePerformanceMapOldTypeImpl
