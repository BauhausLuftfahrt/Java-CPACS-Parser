/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FatigueStressBasedBrownMillerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fatigue Stress Based Brown Miller Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FatigueStressBasedBrownMillerTypeImpl#getSigmaF <em>Sigma F</em>}</li>
 *   <li>{@link Cpacs.impl.FatigueStressBasedBrownMillerTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link Cpacs.impl.FatigueStressBasedBrownMillerTypeImpl#getEpsilonF <em>Epsilon F</em>}</li>
 *   <li>{@link Cpacs.impl.FatigueStressBasedBrownMillerTypeImpl#getC <em>C</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FatigueStressBasedBrownMillerTypeImpl extends ComplexBaseTypeImpl
		implements FatigueStressBasedBrownMillerType {
	/**
	 * The cached value of the '{@link #getSigmaF() <em>Sigma F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSigmaF()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sigmaF;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType b;

	/**
	 * The cached value of the '{@link #getEpsilonF() <em>Epsilon F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpsilonF()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType epsilonF;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType c;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FatigueStressBasedBrownMillerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFatigueStressBasedBrownMillerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSigmaF() {
		return sigmaF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSigmaF(DoubleBaseType newSigmaF, NotificationChain msgs) {
		DoubleBaseType oldSigmaF = sigmaF;
		sigmaF = newSigmaF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F, oldSigmaF, newSigmaF);
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
	public void setSigmaF(DoubleBaseType newSigmaF) {
		if (newSigmaF != sigmaF) {
			NotificationChain msgs = null;
			if (sigmaF != null)
				msgs = ((InternalEObject) sigmaF).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F, null,
						msgs);
			if (newSigmaF != null)
				msgs = ((InternalEObject) newSigmaF).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F, null,
						msgs);
			msgs = basicSetSigmaF(newSigmaF, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F, newSigmaF, newSigmaF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetB(DoubleBaseType newB, NotificationChain msgs) {
		DoubleBaseType oldB = b;
		b = newB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B, oldB, newB);
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
	public void setB(DoubleBaseType newB) {
		if (newB != b) {
			NotificationChain msgs = null;
			if (b != null)
				msgs = ((InternalEObject) b).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B, null, msgs);
			if (newB != null)
				msgs = ((InternalEObject) newB).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B, null, msgs);
			msgs = basicSetB(newB, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B, newB, newB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEpsilonF() {
		return epsilonF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpsilonF(DoubleBaseType newEpsilonF, NotificationChain msgs) {
		DoubleBaseType oldEpsilonF = epsilonF;
		epsilonF = newEpsilonF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F, oldEpsilonF, newEpsilonF);
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
	public void setEpsilonF(DoubleBaseType newEpsilonF) {
		if (newEpsilonF != epsilonF) {
			NotificationChain msgs = null;
			if (epsilonF != null)
				msgs = ((InternalEObject) epsilonF).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F, null,
						msgs);
			if (newEpsilonF != null)
				msgs = ((InternalEObject) newEpsilonF).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F, null,
						msgs);
			msgs = basicSetEpsilonF(newEpsilonF, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F, newEpsilonF, newEpsilonF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetC(DoubleBaseType newC, NotificationChain msgs) {
		DoubleBaseType oldC = c;
		c = newC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C, oldC, newC);
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
	public void setC(DoubleBaseType newC) {
		if (newC != c) {
			NotificationChain msgs = null;
			if (c != null)
				msgs = ((InternalEObject) c).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C, null, msgs);
			if (newC != null)
				msgs = ((InternalEObject) newC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C, null, msgs);
			msgs = basicSetC(newC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C, newC, newC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F:
			return basicSetSigmaF(null, msgs);
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B:
			return basicSetB(null, msgs);
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F:
			return basicSetEpsilonF(null, msgs);
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C:
			return basicSetC(null, msgs);
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
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F:
			return getSigmaF();
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B:
			return getB();
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F:
			return getEpsilonF();
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C:
			return getC();
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
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F:
			setSigmaF((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B:
			setB((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F:
			setEpsilonF((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C:
			setC((DoubleBaseType) newValue);
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
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F:
			setSigmaF((DoubleBaseType) null);
			return;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B:
			setB((DoubleBaseType) null);
			return;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F:
			setEpsilonF((DoubleBaseType) null);
			return;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C:
			setC((DoubleBaseType) null);
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
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__SIGMA_F:
			return sigmaF != null;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__B:
			return b != null;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__EPSILON_F:
			return epsilonF != null;
		case CpacsPackage.FATIGUE_STRESS_BASED_BROWN_MILLER_TYPE__C:
			return c != null;
		}
		return super.eIsSet(featureID);
	}

} //FatigueStressBasedBrownMillerTypeImpl
