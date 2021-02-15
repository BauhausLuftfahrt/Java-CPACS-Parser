/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FqRoloscType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Rolosc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqRoloscTypeImpl#getRatioPoscPav <em>Ratio Posc Pav</em>}</li>
 *   <li>{@link Cpacs.impl.FqRoloscTypeImpl#getPhasePsiBeta <em>Phase Psi Beta</em>}</li>
 *   <li>{@link Cpacs.impl.FqRoloscTypeImpl#getPasePBeta <em>Pase PBeta</em>}</li>
 *   <li>{@link Cpacs.impl.FqRoloscTypeImpl#getRatioP2P1 <em>Ratio P2P1</em>}</li>
 *   <li>{@link Cpacs.impl.FqRoloscTypeImpl#getRollRateOsc <em>Roll Rate Osc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqRoloscTypeImpl extends ComplexBaseTypeImpl implements FqRoloscType {
	/**
	 * The cached value of the '{@link #getRatioPoscPav() <em>Ratio Posc Pav</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioPoscPav()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType ratioPoscPav;

	/**
	 * The cached value of the '{@link #getPhasePsiBeta() <em>Phase Psi Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhasePsiBeta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phasePsiBeta;

	/**
	 * The cached value of the '{@link #getPasePBeta() <em>Pase PBeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasePBeta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType pasePBeta;

	/**
	 * The cached value of the '{@link #getRatioP2P1() <em>Ratio P2P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatioP2P1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType ratioP2P1;

	/**
	 * The cached value of the '{@link #getRollRateOsc() <em>Roll Rate Osc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollRateOsc()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType rollRateOsc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqRoloscTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqRoloscType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRatioPoscPav() {
		return ratioPoscPav;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioPoscPav(DoubleBaseType newRatioPoscPav, NotificationChain msgs) {
		DoubleBaseType oldRatioPoscPav = ratioPoscPav;
		ratioPoscPav = newRatioPoscPav;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV, oldRatioPoscPav, newRatioPoscPav);
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
	public void setRatioPoscPav(DoubleBaseType newRatioPoscPav) {
		if (newRatioPoscPav != ratioPoscPav) {
			NotificationChain msgs = null;
			if (ratioPoscPav != null)
				msgs = ((InternalEObject) ratioPoscPav).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV, null, msgs);
			if (newRatioPoscPav != null)
				msgs = ((InternalEObject) newRatioPoscPav).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV, null, msgs);
			msgs = basicSetRatioPoscPav(newRatioPoscPav, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV,
					newRatioPoscPav, newRatioPoscPav));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhasePsiBeta() {
		return phasePsiBeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhasePsiBeta(DoubleBaseType newPhasePsiBeta, NotificationChain msgs) {
		DoubleBaseType oldPhasePsiBeta = phasePsiBeta;
		phasePsiBeta = newPhasePsiBeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA, oldPhasePsiBeta, newPhasePsiBeta);
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
	public void setPhasePsiBeta(DoubleBaseType newPhasePsiBeta) {
		if (newPhasePsiBeta != phasePsiBeta) {
			NotificationChain msgs = null;
			if (phasePsiBeta != null)
				msgs = ((InternalEObject) phasePsiBeta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA, null, msgs);
			if (newPhasePsiBeta != null)
				msgs = ((InternalEObject) newPhasePsiBeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA, null, msgs);
			msgs = basicSetPhasePsiBeta(newPhasePsiBeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA,
					newPhasePsiBeta, newPhasePsiBeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPasePBeta() {
		return pasePBeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPasePBeta(DoubleBaseType newPasePBeta, NotificationChain msgs) {
		DoubleBaseType oldPasePBeta = pasePBeta;
		pasePBeta = newPasePBeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA, oldPasePBeta, newPasePBeta);
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
	public void setPasePBeta(DoubleBaseType newPasePBeta) {
		if (newPasePBeta != pasePBeta) {
			NotificationChain msgs = null;
			if (pasePBeta != null)
				msgs = ((InternalEObject) pasePBeta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA, null, msgs);
			if (newPasePBeta != null)
				msgs = ((InternalEObject) newPasePBeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA, null, msgs);
			msgs = basicSetPasePBeta(newPasePBeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA, newPasePBeta,
					newPasePBeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRatioP2P1() {
		return ratioP2P1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRatioP2P1(DoubleBaseType newRatioP2P1, NotificationChain msgs) {
		DoubleBaseType oldRatioP2P1 = ratioP2P1;
		ratioP2P1 = newRatioP2P1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1, oldRatioP2P1, newRatioP2P1);
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
	public void setRatioP2P1(DoubleBaseType newRatioP2P1) {
		if (newRatioP2P1 != ratioP2P1) {
			NotificationChain msgs = null;
			if (ratioP2P1 != null)
				msgs = ((InternalEObject) ratioP2P1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1, null, msgs);
			if (newRatioP2P1 != null)
				msgs = ((InternalEObject) newRatioP2P1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1, null, msgs);
			msgs = basicSetRatioP2P1(newRatioP2P1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1, newRatioP2P1,
					newRatioP2P1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRollRateOsc() {
		return rollRateOsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRollRateOsc(DoubleBaseType newRollRateOsc, NotificationChain msgs) {
		DoubleBaseType oldRollRateOsc = rollRateOsc;
		rollRateOsc = newRollRateOsc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC, oldRollRateOsc, newRollRateOsc);
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
	public void setRollRateOsc(DoubleBaseType newRollRateOsc) {
		if (newRollRateOsc != rollRateOsc) {
			NotificationChain msgs = null;
			if (rollRateOsc != null)
				msgs = ((InternalEObject) rollRateOsc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC, null, msgs);
			if (newRollRateOsc != null)
				msgs = ((InternalEObject) newRollRateOsc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC, null, msgs);
			msgs = basicSetRollRateOsc(newRollRateOsc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC,
					newRollRateOsc, newRollRateOsc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV:
			return basicSetRatioPoscPav(null, msgs);
		case CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA:
			return basicSetPhasePsiBeta(null, msgs);
		case CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA:
			return basicSetPasePBeta(null, msgs);
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1:
			return basicSetRatioP2P1(null, msgs);
		case CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC:
			return basicSetRollRateOsc(null, msgs);
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
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV:
			return getRatioPoscPav();
		case CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA:
			return getPhasePsiBeta();
		case CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA:
			return getPasePBeta();
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1:
			return getRatioP2P1();
		case CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC:
			return getRollRateOsc();
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
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV:
			setRatioPoscPav((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA:
			setPhasePsiBeta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA:
			setPasePBeta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1:
			setRatioP2P1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC:
			setRollRateOsc((DoubleBaseType) newValue);
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
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV:
			setRatioPoscPav((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA:
			setPhasePsiBeta((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA:
			setPasePBeta((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1:
			setRatioP2P1((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC:
			setRollRateOsc((DoubleBaseType) null);
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
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_POSC_PAV:
			return ratioPoscPav != null;
		case CpacsPackage.FQ_ROLOSC_TYPE__PHASE_PSI_BETA:
			return phasePsiBeta != null;
		case CpacsPackage.FQ_ROLOSC_TYPE__PASE_PBETA:
			return pasePBeta != null;
		case CpacsPackage.FQ_ROLOSC_TYPE__RATIO_P2P1:
			return ratioP2P1 != null;
		case CpacsPackage.FQ_ROLOSC_TYPE__ROLL_RATE_OSC:
			return rollRateOsc != null;
		}
		return super.eIsSet(featureID);
	}

} //FqRoloscTypeImpl
