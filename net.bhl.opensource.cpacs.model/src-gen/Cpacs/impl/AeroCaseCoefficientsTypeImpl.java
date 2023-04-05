/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;
import Cpacs.DragContributionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Case Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroCaseCoefficientsTypeImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseCoefficientsTypeImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseCoefficientsTypeImpl#getCl <em>Cl</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseCoefficientsTypeImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseCoefficientsTypeImpl#getCms <em>Cms</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseCoefficientsTypeImpl#getCml <em>Cml</em>}</li>
 *   <li>{@link Cpacs.impl.AeroCaseCoefficientsTypeImpl#getDragContributions <em>Drag Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroCaseCoefficientsTypeImpl extends ComplexBaseTypeImpl implements AeroCaseCoefficientsType {
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
	 * The cached value of the '{@link #getDragContributions() <em>Drag Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDragContributions()
	 * @generated
	 * @ordered
	 */
	protected DragContributionsType dragContributions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroCaseCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroCaseCoefficientsType();
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
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD, oldCd, newCd);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD, null, msgs);
			if (newCd != null)
				msgs = ((InternalEObject) newCd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD, null, msgs);
			msgs = basicSetCd(newCd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD, newCd,
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
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS, oldCs, newCs);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS, null, msgs);
			if (newCs != null)
				msgs = ((InternalEObject) newCs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS, null, msgs);
			msgs = basicSetCs(newCs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS, newCs,
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
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL, oldCl, newCl);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL, null, msgs);
			if (newCl != null)
				msgs = ((InternalEObject) newCl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL, null, msgs);
			msgs = basicSetCl(newCl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL, newCl,
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
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD, oldCmd, newCmd);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD, null, msgs);
			if (newCmd != null)
				msgs = ((InternalEObject) newCmd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD, null, msgs);
			msgs = basicSetCmd(newCmd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD, newCmd,
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
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS, oldCms, newCms);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS, null, msgs);
			if (newCms != null)
				msgs = ((InternalEObject) newCms).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS, null, msgs);
			msgs = basicSetCms(newCms, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS, newCms,
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
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML, oldCml, newCml);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML, null, msgs);
			if (newCml != null)
				msgs = ((InternalEObject) newCml).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML, null, msgs);
			msgs = basicSetCml(newCml, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML, newCml,
					newCml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DragContributionsType getDragContributions() {
		return dragContributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDragContributions(DragContributionsType newDragContributions,
			NotificationChain msgs) {
		DragContributionsType oldDragContributions = dragContributions;
		dragContributions = newDragContributions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS, oldDragContributions,
					newDragContributions);
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
	public void setDragContributions(DragContributionsType newDragContributions) {
		if (newDragContributions != dragContributions) {
			NotificationChain msgs = null;
			if (dragContributions != null)
				msgs = ((InternalEObject) dragContributions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS, null,
						msgs);
			if (newDragContributions != null)
				msgs = ((InternalEObject) newDragContributions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS, null,
						msgs);
			msgs = basicSetDragContributions(newDragContributions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS, newDragContributions,
					newDragContributions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD:
			return basicSetCd(null, msgs);
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS:
			return basicSetCs(null, msgs);
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL:
			return basicSetCl(null, msgs);
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD:
			return basicSetCmd(null, msgs);
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS:
			return basicSetCms(null, msgs);
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML:
			return basicSetCml(null, msgs);
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS:
			return basicSetDragContributions(null, msgs);
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
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD:
			return getCd();
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS:
			return getCs();
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL:
			return getCl();
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD:
			return getCmd();
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS:
			return getCms();
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML:
			return getCml();
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS:
			return getDragContributions();
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
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD:
			setCd((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS:
			setCs((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL:
			setCl((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD:
			setCmd((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS:
			setCms((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML:
			setCml((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS:
			setDragContributions((DragContributionsType) newValue);
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
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD:
			setCd((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS:
			setCs((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL:
			setCl((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD:
			setCmd((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS:
			setCms((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML:
			setCml((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS:
			setDragContributions((DragContributionsType) null);
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
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CD:
			return cd != null;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CS:
			return cs != null;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CL:
			return cl != null;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMD:
			return cmd != null;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CMS:
			return cms != null;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__CML:
			return cml != null;
		case CpacsPackage.AERO_CASE_COEFFICIENTS_TYPE__DRAG_CONTRIBUTIONS:
			return dragContributions != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroCaseCoefficientsTypeImpl
