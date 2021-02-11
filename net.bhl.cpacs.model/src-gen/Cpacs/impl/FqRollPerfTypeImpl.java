/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FqRollPerfType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Roll Perf Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqRollPerfTypeImpl#getTPhi <em>TPhi</em>}</li>
 *   <li>{@link Cpacs.impl.FqRollPerfTypeImpl#getPhiCrit <em>Phi Crit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqRollPerfTypeImpl extends ComplexBaseTypeImpl implements FqRollPerfType {
	/**
	 * The cached value of the '{@link #getTPhi() <em>TPhi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTPhi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tPhi;

	/**
	 * The cached value of the '{@link #getPhiCrit() <em>Phi Crit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiCrit()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phiCrit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqRollPerfTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqRollPerfType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTPhi() {
		return tPhi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTPhi(DoubleBaseType newTPhi, NotificationChain msgs) {
		DoubleBaseType oldTPhi = tPhi;
		tPhi = newTPhi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI, oldTPhi, newTPhi);
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
	public void setTPhi(DoubleBaseType newTPhi) {
		if (newTPhi != tPhi) {
			NotificationChain msgs = null;
			if (tPhi != null)
				msgs = ((InternalEObject) tPhi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI, null, msgs);
			if (newTPhi != null)
				msgs = ((InternalEObject) newTPhi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI, null, msgs);
			msgs = basicSetTPhi(newTPhi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI, newTPhi,
					newTPhi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhiCrit() {
		return phiCrit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhiCrit(DoubleBaseType newPhiCrit, NotificationChain msgs) {
		DoubleBaseType oldPhiCrit = phiCrit;
		phiCrit = newPhiCrit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT, oldPhiCrit, newPhiCrit);
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
	public void setPhiCrit(DoubleBaseType newPhiCrit) {
		if (newPhiCrit != phiCrit) {
			NotificationChain msgs = null;
			if (phiCrit != null)
				msgs = ((InternalEObject) phiCrit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT, null, msgs);
			if (newPhiCrit != null)
				msgs = ((InternalEObject) newPhiCrit).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT, null, msgs);
			msgs = basicSetPhiCrit(newPhiCrit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT, newPhiCrit,
					newPhiCrit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI:
			return basicSetTPhi(null, msgs);
		case CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT:
			return basicSetPhiCrit(null, msgs);
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
		case CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI:
			return getTPhi();
		case CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT:
			return getPhiCrit();
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
		case CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI:
			setTPhi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT:
			setPhiCrit((DoubleBaseType) newValue);
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
		case CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI:
			setTPhi((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT:
			setPhiCrit((DoubleBaseType) null);
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
		case CpacsPackage.FQ_ROLL_PERF_TYPE__TPHI:
			return tPhi != null;
		case CpacsPackage.FQ_ROLL_PERF_TYPE__PHI_CRIT:
			return phiCrit != null;
		}
		return super.eIsSet(featureID);
	}

} //FqRollPerfTypeImpl
