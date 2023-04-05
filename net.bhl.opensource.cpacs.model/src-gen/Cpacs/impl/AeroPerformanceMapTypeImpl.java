/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceIncrementMapsType;
import Cpacs.AeroPerformanceMapType;
import Cpacs.CpacsPackage;
import Cpacs.DampingDerivativesRatesType;
import Cpacs.DoubleVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Performance Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getCl <em>Cl</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getCms <em>Cms</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getCml <em>Cml</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getDampingDerivatives <em>Damping Derivatives</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapTypeImpl#getIncrementMaps <em>Increment Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceMapTypeImpl extends ComplexBaseTypeImpl implements AeroPerformanceMapType {
	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType altitude;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType machNumber;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getCd() <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCd()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType cd;

	/**
	 * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType cs;

	/**
	 * The cached value of the '{@link #getCl() <em>Cl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCl()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType cl;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType cmd;

	/**
	 * The cached value of the '{@link #getCms() <em>Cms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCms()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType cms;

	/**
	 * The cached value of the '{@link #getCml() <em>Cml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCml()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType cml;

	/**
	 * The cached value of the '{@link #getDampingDerivatives() <em>Damping Derivatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDampingDerivatives()
	 * @generated
	 * @ordered
	 */
	protected DampingDerivativesRatesType dampingDerivatives;

	/**
	 * The cached value of the '{@link #getIncrementMaps() <em>Increment Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementMaps()
	 * @generated
	 * @ordered
	 */
	protected AeroPerformanceIncrementMapsType incrementMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroPerformanceMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleVectorBaseType newAltitude, NotificationChain msgs) {
		DoubleVectorBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleVectorBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleVectorBaseType newMachNumber, NotificationChain msgs) {
		DoubleVectorBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleVectorBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER,
					newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(DoubleVectorBaseType newAngleOfSideslip, NotificationChain msgs) {
		DoubleVectorBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip, newAngleOfSideslip);
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
	public void setAngleOfSideslip(DoubleVectorBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP, newAngleOfSideslip, newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(DoubleVectorBaseType newAngleOfAttack, NotificationChain msgs) {
		DoubleVectorBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(DoubleVectorBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getCd() {
		return cd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCd(DoubleVectorBaseType newCd, NotificationChain msgs) {
		DoubleVectorBaseType oldCd = cd;
		cd = newCd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD, oldCd, newCd);
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
	public void setCd(DoubleVectorBaseType newCd) {
		if (newCd != cd) {
			NotificationChain msgs = null;
			if (cd != null)
				msgs = ((InternalEObject) cd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD, null, msgs);
			if (newCd != null)
				msgs = ((InternalEObject) newCd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD, null, msgs);
			msgs = basicSetCd(newCd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD, newCd,
					newCd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getCs() {
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCs(DoubleVectorBaseType newCs, NotificationChain msgs) {
		DoubleVectorBaseType oldCs = cs;
		cs = newCs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS, oldCs, newCs);
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
	public void setCs(DoubleVectorBaseType newCs) {
		if (newCs != cs) {
			NotificationChain msgs = null;
			if (cs != null)
				msgs = ((InternalEObject) cs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS, null, msgs);
			if (newCs != null)
				msgs = ((InternalEObject) newCs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS, null, msgs);
			msgs = basicSetCs(newCs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS, newCs,
					newCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getCl() {
		return cl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCl(DoubleVectorBaseType newCl, NotificationChain msgs) {
		DoubleVectorBaseType oldCl = cl;
		cl = newCl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL, oldCl, newCl);
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
	public void setCl(DoubleVectorBaseType newCl) {
		if (newCl != cl) {
			NotificationChain msgs = null;
			if (cl != null)
				msgs = ((InternalEObject) cl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL, null, msgs);
			if (newCl != null)
				msgs = ((InternalEObject) newCl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL, null, msgs);
			msgs = basicSetCl(newCl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL, newCl,
					newCl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getCmd() {
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmd(DoubleVectorBaseType newCmd, NotificationChain msgs) {
		DoubleVectorBaseType oldCmd = cmd;
		cmd = newCmd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD, oldCmd, newCmd);
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
	public void setCmd(DoubleVectorBaseType newCmd) {
		if (newCmd != cmd) {
			NotificationChain msgs = null;
			if (cmd != null)
				msgs = ((InternalEObject) cmd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD, null, msgs);
			if (newCmd != null)
				msgs = ((InternalEObject) newCmd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD, null, msgs);
			msgs = basicSetCmd(newCmd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD, newCmd,
					newCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getCms() {
		return cms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCms(DoubleVectorBaseType newCms, NotificationChain msgs) {
		DoubleVectorBaseType oldCms = cms;
		cms = newCms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS, oldCms, newCms);
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
	public void setCms(DoubleVectorBaseType newCms) {
		if (newCms != cms) {
			NotificationChain msgs = null;
			if (cms != null)
				msgs = ((InternalEObject) cms).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS, null, msgs);
			if (newCms != null)
				msgs = ((InternalEObject) newCms).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS, null, msgs);
			msgs = basicSetCms(newCms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS, newCms,
					newCms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getCml() {
		return cml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCml(DoubleVectorBaseType newCml, NotificationChain msgs) {
		DoubleVectorBaseType oldCml = cml;
		cml = newCml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML, oldCml, newCml);
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
	public void setCml(DoubleVectorBaseType newCml) {
		if (newCml != cml) {
			NotificationChain msgs = null;
			if (cml != null)
				msgs = ((InternalEObject) cml).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML, null, msgs);
			if (newCml != null)
				msgs = ((InternalEObject) newCml).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML, null, msgs);
			msgs = basicSetCml(newCml, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML, newCml,
					newCml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DampingDerivativesRatesType getDampingDerivatives() {
		return dampingDerivatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDampingDerivatives(DampingDerivativesRatesType newDampingDerivatives,
			NotificationChain msgs) {
		DampingDerivativesRatesType oldDampingDerivatives = dampingDerivatives;
		dampingDerivatives = newDampingDerivatives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES, oldDampingDerivatives,
					newDampingDerivatives);
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
	public void setDampingDerivatives(DampingDerivativesRatesType newDampingDerivatives) {
		if (newDampingDerivatives != dampingDerivatives) {
			NotificationChain msgs = null;
			if (dampingDerivatives != null)
				msgs = ((InternalEObject) dampingDerivatives).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES, null,
						msgs);
			if (newDampingDerivatives != null)
				msgs = ((InternalEObject) newDampingDerivatives).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES, null,
						msgs);
			msgs = basicSetDampingDerivatives(newDampingDerivatives, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES, newDampingDerivatives,
					newDampingDerivatives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceIncrementMapsType getIncrementMaps() {
		return incrementMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrementMaps(AeroPerformanceIncrementMapsType newIncrementMaps,
			NotificationChain msgs) {
		AeroPerformanceIncrementMapsType oldIncrementMaps = incrementMaps;
		incrementMaps = newIncrementMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS, oldIncrementMaps, newIncrementMaps);
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
	public void setIncrementMaps(AeroPerformanceIncrementMapsType newIncrementMaps) {
		if (newIncrementMaps != incrementMaps) {
			NotificationChain msgs = null;
			if (incrementMaps != null)
				msgs = ((InternalEObject) incrementMaps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS, null, msgs);
			if (newIncrementMaps != null)
				msgs = ((InternalEObject) newIncrementMaps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS, null, msgs);
			msgs = basicSetIncrementMaps(newIncrementMaps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS, newIncrementMaps, newIncrementMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD:
			return basicSetCd(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS:
			return basicSetCs(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL:
			return basicSetCl(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD:
			return basicSetCmd(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS:
			return basicSetCms(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML:
			return basicSetCml(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES:
			return basicSetDampingDerivatives(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS:
			return basicSetIncrementMaps(null, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD:
			return getCd();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS:
			return getCs();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL:
			return getCl();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD:
			return getCmd();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS:
			return getCms();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML:
			return getCml();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES:
			return getDampingDerivatives();
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS:
			return getIncrementMaps();
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE:
			setAltitude((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			setMachNumber((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD:
			setCd((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS:
			setCs((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL:
			setCl((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD:
			setCmd((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS:
			setCms((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML:
			setCml((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES:
			setDampingDerivatives((DampingDerivativesRatesType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS:
			setIncrementMaps((AeroPerformanceIncrementMapsType) newValue);
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE:
			setAltitude((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			setMachNumber((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD:
			setCd((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS:
			setCs((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL:
			setCl((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD:
			setCmd((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS:
			setCms((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML:
			setCml((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES:
			setDampingDerivatives((DampingDerivativesRatesType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS:
			setIncrementMaps((AeroPerformanceIncrementMapsType) null);
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
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CD:
			return cd != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CS:
			return cs != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CL:
			return cl != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMD:
			return cmd != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CMS:
			return cms != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__CML:
			return cml != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__DAMPING_DERIVATIVES:
			return dampingDerivatives != null;
		case CpacsPackage.AERO_PERFORMANCE_MAP_TYPE__INCREMENT_MAPS:
			return incrementMaps != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroPerformanceMapTypeImpl
