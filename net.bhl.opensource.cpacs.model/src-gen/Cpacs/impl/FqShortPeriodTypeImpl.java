/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FqShortPeriodType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Short Period Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqShortPeriodTypeImpl#getNAlpha <em>NAlpha</em>}</li>
 *   <li>{@link Cpacs.impl.FqShortPeriodTypeImpl#getSpFrequency <em>Sp Frequency</em>}</li>
 *   <li>{@link Cpacs.impl.FqShortPeriodTypeImpl#getSpDamping <em>Sp Damping</em>}</li>
 *   <li>{@link Cpacs.impl.FqShortPeriodTypeImpl#getSpTauRed <em>Sp Tau Red</em>}</li>
 *   <li>{@link Cpacs.impl.FqShortPeriodTypeImpl#getCap <em>Cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqShortPeriodTypeImpl extends ComplexBaseTypeImpl implements FqShortPeriodType {
	/**
	 * The cached value of the '{@link #getNAlpha() <em>NAlpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAlpha()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType nAlpha;

	/**
	 * The cached value of the '{@link #getSpFrequency() <em>Sp Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpFrequency()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType spFrequency;

	/**
	 * The cached value of the '{@link #getSpDamping() <em>Sp Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpDamping()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType spDamping;

	/**
	 * The cached value of the '{@link #getSpTauRed() <em>Sp Tau Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpTauRed()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType spTauRed;

	/**
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType cap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqShortPeriodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqShortPeriodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNAlpha() {
		return nAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNAlpha(DoubleBaseType newNAlpha, NotificationChain msgs) {
		DoubleBaseType oldNAlpha = nAlpha;
		nAlpha = newNAlpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA, oldNAlpha, newNAlpha);
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
	public void setNAlpha(DoubleBaseType newNAlpha) {
		if (newNAlpha != nAlpha) {
			NotificationChain msgs = null;
			if (nAlpha != null)
				msgs = ((InternalEObject) nAlpha).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA, null, msgs);
			if (newNAlpha != null)
				msgs = ((InternalEObject) newNAlpha).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA, null, msgs);
			msgs = basicSetNAlpha(newNAlpha, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA, newNAlpha,
					newNAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpFrequency() {
		return spFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpFrequency(DoubleBaseType newSpFrequency, NotificationChain msgs) {
		DoubleBaseType oldSpFrequency = spFrequency;
		spFrequency = newSpFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY, oldSpFrequency, newSpFrequency);
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
	public void setSpFrequency(DoubleBaseType newSpFrequency) {
		if (newSpFrequency != spFrequency) {
			NotificationChain msgs = null;
			if (spFrequency != null)
				msgs = ((InternalEObject) spFrequency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY, null, msgs);
			if (newSpFrequency != null)
				msgs = ((InternalEObject) newSpFrequency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY, null, msgs);
			msgs = basicSetSpFrequency(newSpFrequency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY,
					newSpFrequency, newSpFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpDamping() {
		return spDamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpDamping(DoubleBaseType newSpDamping, NotificationChain msgs) {
		DoubleBaseType oldSpDamping = spDamping;
		spDamping = newSpDamping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING, oldSpDamping, newSpDamping);
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
	public void setSpDamping(DoubleBaseType newSpDamping) {
		if (newSpDamping != spDamping) {
			NotificationChain msgs = null;
			if (spDamping != null)
				msgs = ((InternalEObject) spDamping).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING, null, msgs);
			if (newSpDamping != null)
				msgs = ((InternalEObject) newSpDamping).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING, null, msgs);
			msgs = basicSetSpDamping(newSpDamping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING,
					newSpDamping, newSpDamping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpTauRed() {
		return spTauRed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpTauRed(DoubleBaseType newSpTauRed, NotificationChain msgs) {
		DoubleBaseType oldSpTauRed = spTauRed;
		spTauRed = newSpTauRed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED, oldSpTauRed, newSpTauRed);
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
	public void setSpTauRed(DoubleBaseType newSpTauRed) {
		if (newSpTauRed != spTauRed) {
			NotificationChain msgs = null;
			if (spTauRed != null)
				msgs = ((InternalEObject) spTauRed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED, null, msgs);
			if (newSpTauRed != null)
				msgs = ((InternalEObject) newSpTauRed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED, null, msgs);
			msgs = basicSetSpTauRed(newSpTauRed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED,
					newSpTauRed, newSpTauRed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCap(DoubleBaseType newCap, NotificationChain msgs) {
		DoubleBaseType oldCap = cap;
		cap = newCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP, oldCap, newCap);
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
	public void setCap(DoubleBaseType newCap) {
		if (newCap != cap) {
			NotificationChain msgs = null;
			if (cap != null)
				msgs = ((InternalEObject) cap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP, null, msgs);
			if (newCap != null)
				msgs = ((InternalEObject) newCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP, null, msgs);
			msgs = basicSetCap(newCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP, newCap,
					newCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA:
			return basicSetNAlpha(null, msgs);
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY:
			return basicSetSpFrequency(null, msgs);
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING:
			return basicSetSpDamping(null, msgs);
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED:
			return basicSetSpTauRed(null, msgs);
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP:
			return basicSetCap(null, msgs);
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
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA:
			return getNAlpha();
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY:
			return getSpFrequency();
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING:
			return getSpDamping();
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED:
			return getSpTauRed();
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP:
			return getCap();
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
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA:
			setNAlpha((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY:
			setSpFrequency((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING:
			setSpDamping((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED:
			setSpTauRed((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP:
			setCap((DoubleBaseType) newValue);
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
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA:
			setNAlpha((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY:
			setSpFrequency((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING:
			setSpDamping((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED:
			setSpTauRed((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP:
			setCap((DoubleBaseType) null);
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
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__NALPHA:
			return nAlpha != null;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_FREQUENCY:
			return spFrequency != null;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_DAMPING:
			return spDamping != null;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__SP_TAU_RED:
			return spTauRed != null;
		case CpacsPackage.FQ_SHORT_PERIOD_TYPE__CAP:
			return cap != null;
		}
		return super.eIsSet(featureID);
	}

} //FqShortPeriodTypeImpl
