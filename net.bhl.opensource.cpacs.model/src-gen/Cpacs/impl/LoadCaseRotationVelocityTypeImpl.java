/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LoadCaseRotationVelocityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Rotation Velocity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseRotationVelocityTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseRotationVelocityTypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseRotationVelocityTypeImpl#getR <em>R</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseRotationVelocityTypeImpl#getPhiDot <em>Phi Dot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseRotationVelocityTypeImpl#getThetaDot <em>Theta Dot</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseRotationVelocityTypeImpl#getPsiDot <em>Psi Dot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseRotationVelocityTypeImpl extends ComplexBaseTypeImpl implements LoadCaseRotationVelocityType {
	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType p;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType q;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType r;

	/**
	 * The cached value of the '{@link #getPhiDot() <em>Phi Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phiDot;

	/**
	 * The cached value of the '{@link #getThetaDot() <em>Theta Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThetaDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thetaDot;

	/**
	 * The cached value of the '{@link #getPsiDot() <em>Psi Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsiDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType psiDot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseRotationVelocityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseRotationVelocityType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetP(DoubleBaseType newP, NotificationChain msgs) {
		DoubleBaseType oldP = p;
		p = newP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P, oldP, newP);
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
	public void setP(DoubleBaseType newP) {
		if (newP != p) {
			NotificationChain msgs = null;
			if (p != null)
				msgs = ((InternalEObject) p).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P, null, msgs);
			if (newP != null)
				msgs = ((InternalEObject) newP).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P, null, msgs);
			msgs = basicSetP(newP, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P,
					newP, newP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQ(DoubleBaseType newQ, NotificationChain msgs) {
		DoubleBaseType oldQ = q;
		q = newQ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q, oldQ, newQ);
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
	public void setQ(DoubleBaseType newQ) {
		if (newQ != q) {
			NotificationChain msgs = null;
			if (q != null)
				msgs = ((InternalEObject) q).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q, null, msgs);
			if (newQ != null)
				msgs = ((InternalEObject) newQ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q, null, msgs);
			msgs = basicSetQ(newQ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q,
					newQ, newQ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetR(DoubleBaseType newR, NotificationChain msgs) {
		DoubleBaseType oldR = r;
		r = newR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R, oldR, newR);
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
	public void setR(DoubleBaseType newR) {
		if (newR != r) {
			NotificationChain msgs = null;
			if (r != null)
				msgs = ((InternalEObject) r).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R, null, msgs);
			if (newR != null)
				msgs = ((InternalEObject) newR).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R, null, msgs);
			msgs = basicSetR(newR, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R,
					newR, newR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhiDot() {
		return phiDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhiDot(DoubleBaseType newPhiDot, NotificationChain msgs) {
		DoubleBaseType oldPhiDot = phiDot;
		phiDot = newPhiDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT, oldPhiDot, newPhiDot);
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
	public void setPhiDot(DoubleBaseType newPhiDot) {
		if (newPhiDot != phiDot) {
			NotificationChain msgs = null;
			if (phiDot != null)
				msgs = ((InternalEObject) phiDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT, null, msgs);
			if (newPhiDot != null)
				msgs = ((InternalEObject) newPhiDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT, null, msgs);
			msgs = basicSetPhiDot(newPhiDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT, newPhiDot, newPhiDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThetaDot() {
		return thetaDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThetaDot(DoubleBaseType newThetaDot, NotificationChain msgs) {
		DoubleBaseType oldThetaDot = thetaDot;
		thetaDot = newThetaDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT, oldThetaDot, newThetaDot);
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
	public void setThetaDot(DoubleBaseType newThetaDot) {
		if (newThetaDot != thetaDot) {
			NotificationChain msgs = null;
			if (thetaDot != null)
				msgs = ((InternalEObject) thetaDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT, null, msgs);
			if (newThetaDot != null)
				msgs = ((InternalEObject) newThetaDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT, null, msgs);
			msgs = basicSetThetaDot(newThetaDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT, newThetaDot, newThetaDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPsiDot() {
		return psiDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPsiDot(DoubleBaseType newPsiDot, NotificationChain msgs) {
		DoubleBaseType oldPsiDot = psiDot;
		psiDot = newPsiDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT, oldPsiDot, newPsiDot);
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
	public void setPsiDot(DoubleBaseType newPsiDot) {
		if (newPsiDot != psiDot) {
			NotificationChain msgs = null;
			if (psiDot != null)
				msgs = ((InternalEObject) psiDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT, null, msgs);
			if (newPsiDot != null)
				msgs = ((InternalEObject) newPsiDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT, null, msgs);
			msgs = basicSetPsiDot(newPsiDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT, newPsiDot, newPsiDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P:
			return basicSetP(null, msgs);
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q:
			return basicSetQ(null, msgs);
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R:
			return basicSetR(null, msgs);
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT:
			return basicSetPhiDot(null, msgs);
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT:
			return basicSetThetaDot(null, msgs);
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT:
			return basicSetPsiDot(null, msgs);
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
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P:
			return getP();
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q:
			return getQ();
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R:
			return getR();
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT:
			return getPhiDot();
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT:
			return getThetaDot();
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT:
			return getPsiDot();
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
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P:
			setP((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q:
			setQ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R:
			setR((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT:
			setPhiDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT:
			setThetaDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT:
			setPsiDot((DoubleBaseType) newValue);
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
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P:
			setP((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q:
			setQ((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R:
			setR((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT:
			setPhiDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT:
			setThetaDot((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT:
			setPsiDot((DoubleBaseType) null);
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
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__P:
			return p != null;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__Q:
			return q != null;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__R:
			return r != null;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PHI_DOT:
			return phiDot != null;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__THETA_DOT:
			return thetaDot != null;
		case CpacsPackage.LOAD_CASE_ROTATION_VELOCITY_TYPE__PSI_DOT:
			return psiDot != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseRotationVelocityTypeImpl
