/**
 */
package Cpacs.impl;

import Cpacs.CertificationCasesType;
import Cpacs.CpacsPackage;
import Cpacs.OperationalCasesType;
import Cpacs.WeightAndBalanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weight And Balance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WeightAndBalanceTypeImpl#getOperationalCases <em>Operational Cases</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalanceTypeImpl#getCertificationCases <em>Certification Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightAndBalanceTypeImpl extends ComplexBaseTypeImpl implements WeightAndBalanceType {
	/**
	 * The cached value of the '{@link #getOperationalCases() <em>Operational Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCases()
	 * @generated
	 * @ordered
	 */
	protected OperationalCasesType operationalCases;

	/**
	 * The cached value of the '{@link #getCertificationCases() <em>Certification Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificationCases()
	 * @generated
	 * @ordered
	 */
	protected CertificationCasesType certificationCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightAndBalanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWeightAndBalanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationalCasesType getOperationalCases() {
		return operationalCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationalCases(OperationalCasesType newOperationalCases,
			NotificationChain msgs) {
		OperationalCasesType oldOperationalCases = operationalCases;
		operationalCases = newOperationalCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES, oldOperationalCases, newOperationalCases);
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
	public void setOperationalCases(OperationalCasesType newOperationalCases) {
		if (newOperationalCases != operationalCases) {
			NotificationChain msgs = null;
			if (operationalCases != null)
				msgs = ((InternalEObject) operationalCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES, null, msgs);
			if (newOperationalCases != null)
				msgs = ((InternalEObject) newOperationalCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES, null, msgs);
			msgs = basicSetOperationalCases(newOperationalCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES, newOperationalCases, newOperationalCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificationCasesType getCertificationCases() {
		return certificationCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificationCases(CertificationCasesType newCertificationCases,
			NotificationChain msgs) {
		CertificationCasesType oldCertificationCases = certificationCases;
		certificationCases = newCertificationCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES, oldCertificationCases,
					newCertificationCases);
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
	public void setCertificationCases(CertificationCasesType newCertificationCases) {
		if (newCertificationCases != certificationCases) {
			NotificationChain msgs = null;
			if (certificationCases != null)
				msgs = ((InternalEObject) certificationCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES, null, msgs);
			if (newCertificationCases != null)
				msgs = ((InternalEObject) newCertificationCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES, null, msgs);
			msgs = basicSetCertificationCases(newCertificationCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES, newCertificationCases,
					newCertificationCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES:
			return basicSetOperationalCases(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES:
			return basicSetCertificationCases(null, msgs);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES:
			return getOperationalCases();
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES:
			return getCertificationCases();
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
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES:
			setOperationalCases((OperationalCasesType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES:
			setCertificationCases((CertificationCasesType) newValue);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES:
			setOperationalCases((OperationalCasesType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES:
			setCertificationCases((CertificationCasesType) null);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__OPERATIONAL_CASES:
			return operationalCases != null;
		case CpacsPackage.WEIGHT_AND_BALANCE_TYPE__CERTIFICATION_CASES:
			return certificationCases != null;
		}
		return super.eIsSet(featureID);
	}

} //WeightAndBalanceTypeImpl
