/**
 */
package Cpacs.impl;

import Cpacs.AngleAccelerationType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle Acceleration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AngleAccelerationTypeImpl#getPDot <em>PDot</em>}</li>
 *   <li>{@link Cpacs.impl.AngleAccelerationTypeImpl#getQDot <em>QDot</em>}</li>
 *   <li>{@link Cpacs.impl.AngleAccelerationTypeImpl#getRDot <em>RDot</em>}</li>
 *   <li>{@link Cpacs.impl.AngleAccelerationTypeImpl#getPhiDotDot <em>Phi Dot Dot</em>}</li>
 *   <li>{@link Cpacs.impl.AngleAccelerationTypeImpl#getThetaDotDot <em>Theta Dot Dot</em>}</li>
 *   <li>{@link Cpacs.impl.AngleAccelerationTypeImpl#getPsiDotDot <em>Psi Dot Dot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngleAccelerationTypeImpl extends ComplexBaseTypeImpl implements AngleAccelerationType {
	/**
	 * The cached value of the '{@link #getPDot() <em>PDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType pDot;

	/**
	 * The cached value of the '{@link #getQDot() <em>QDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType qDot;

	/**
	 * The cached value of the '{@link #getRDot() <em>RDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rDot;

	/**
	 * The cached value of the '{@link #getPhiDotDot() <em>Phi Dot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiDotDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phiDotDot;

	/**
	 * The cached value of the '{@link #getThetaDotDot() <em>Theta Dot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThetaDotDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thetaDotDot;

	/**
	 * The cached value of the '{@link #getPsiDotDot() <em>Psi Dot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsiDotDot()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType psiDotDot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleAccelerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAngleAccelerationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPDot() {
		return pDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDot(DoubleBaseType newPDot, NotificationChain msgs) {
		DoubleBaseType oldPDot = pDot;
		pDot = newPDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT, oldPDot, newPDot);
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
	public void setPDot(DoubleBaseType newPDot) {
		if (newPDot != pDot) {
			NotificationChain msgs = null;
			if (pDot != null)
				msgs = ((InternalEObject) pDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT, null, msgs);
			if (newPDot != null)
				msgs = ((InternalEObject) newPDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT, null, msgs);
			msgs = basicSetPDot(newPDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT, newPDot,
					newPDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQDot() {
		return qDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQDot(DoubleBaseType newQDot, NotificationChain msgs) {
		DoubleBaseType oldQDot = qDot;
		qDot = newQDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT, oldQDot, newQDot);
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
	public void setQDot(DoubleBaseType newQDot) {
		if (newQDot != qDot) {
			NotificationChain msgs = null;
			if (qDot != null)
				msgs = ((InternalEObject) qDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT, null, msgs);
			if (newQDot != null)
				msgs = ((InternalEObject) newQDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT, null, msgs);
			msgs = basicSetQDot(newQDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT, newQDot,
					newQDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRDot() {
		return rDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRDot(DoubleBaseType newRDot, NotificationChain msgs) {
		DoubleBaseType oldRDot = rDot;
		rDot = newRDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT, oldRDot, newRDot);
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
	public void setRDot(DoubleBaseType newRDot) {
		if (newRDot != rDot) {
			NotificationChain msgs = null;
			if (rDot != null)
				msgs = ((InternalEObject) rDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT, null, msgs);
			if (newRDot != null)
				msgs = ((InternalEObject) newRDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT, null, msgs);
			msgs = basicSetRDot(newRDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT, newRDot,
					newRDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhiDotDot() {
		return phiDotDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhiDotDot(DoubleBaseType newPhiDotDot, NotificationChain msgs) {
		DoubleBaseType oldPhiDotDot = phiDotDot;
		phiDotDot = newPhiDotDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT, oldPhiDotDot, newPhiDotDot);
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
	public void setPhiDotDot(DoubleBaseType newPhiDotDot) {
		if (newPhiDotDot != phiDotDot) {
			NotificationChain msgs = null;
			if (phiDotDot != null)
				msgs = ((InternalEObject) phiDotDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT, null, msgs);
			if (newPhiDotDot != null)
				msgs = ((InternalEObject) newPhiDotDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT, null, msgs);
			msgs = basicSetPhiDotDot(newPhiDotDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT,
					newPhiDotDot, newPhiDotDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThetaDotDot() {
		return thetaDotDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThetaDotDot(DoubleBaseType newThetaDotDot, NotificationChain msgs) {
		DoubleBaseType oldThetaDotDot = thetaDotDot;
		thetaDotDot = newThetaDotDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT, oldThetaDotDot, newThetaDotDot);
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
	public void setThetaDotDot(DoubleBaseType newThetaDotDot) {
		if (newThetaDotDot != thetaDotDot) {
			NotificationChain msgs = null;
			if (thetaDotDot != null)
				msgs = ((InternalEObject) thetaDotDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT, null, msgs);
			if (newThetaDotDot != null)
				msgs = ((InternalEObject) newThetaDotDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT, null, msgs);
			msgs = basicSetThetaDotDot(newThetaDotDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT,
					newThetaDotDot, newThetaDotDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPsiDotDot() {
		return psiDotDot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPsiDotDot(DoubleBaseType newPsiDotDot, NotificationChain msgs) {
		DoubleBaseType oldPsiDotDot = psiDotDot;
		psiDotDot = newPsiDotDot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT, oldPsiDotDot, newPsiDotDot);
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
	public void setPsiDotDot(DoubleBaseType newPsiDotDot) {
		if (newPsiDotDot != psiDotDot) {
			NotificationChain msgs = null;
			if (psiDotDot != null)
				msgs = ((InternalEObject) psiDotDot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT, null, msgs);
			if (newPsiDotDot != null)
				msgs = ((InternalEObject) newPsiDotDot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT, null, msgs);
			msgs = basicSetPsiDotDot(newPsiDotDot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT,
					newPsiDotDot, newPsiDotDot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT:
			return basicSetPDot(null, msgs);
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT:
			return basicSetQDot(null, msgs);
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT:
			return basicSetRDot(null, msgs);
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT:
			return basicSetPhiDotDot(null, msgs);
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT:
			return basicSetThetaDotDot(null, msgs);
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT:
			return basicSetPsiDotDot(null, msgs);
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
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT:
			return getPDot();
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT:
			return getQDot();
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT:
			return getRDot();
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT:
			return getPhiDotDot();
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT:
			return getThetaDotDot();
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT:
			return getPsiDotDot();
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
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT:
			setPDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT:
			setQDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT:
			setRDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT:
			setPhiDotDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT:
			setThetaDotDot((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT:
			setPsiDotDot((DoubleBaseType) newValue);
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
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT:
			setPDot((DoubleBaseType) null);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT:
			setQDot((DoubleBaseType) null);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT:
			setRDot((DoubleBaseType) null);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT:
			setPhiDotDot((DoubleBaseType) null);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT:
			setThetaDotDot((DoubleBaseType) null);
			return;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT:
			setPsiDotDot((DoubleBaseType) null);
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
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PDOT:
			return pDot != null;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__QDOT:
			return qDot != null;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__RDOT:
			return rDot != null;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PHI_DOT_DOT:
			return phiDotDot != null;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__THETA_DOT_DOT:
			return thetaDotDot != null;
		case CpacsPackage.ANGLE_ACCELERATION_TYPE__PSI_DOT_DOT:
			return psiDotDot != null;
		}
		return super.eIsSet(featureID);
	}

} //AngleAccelerationTypeImpl
