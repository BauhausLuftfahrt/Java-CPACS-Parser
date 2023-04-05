/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LowerHeightFractionType;
import Cpacs.PosExcl0DoubleBaseType;
import Cpacs.SuperEllipseProfileType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Ellipse Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SuperEllipseProfileTypeImpl#getMUpper <em>MUpper</em>}</li>
 *   <li>{@link Cpacs.impl.SuperEllipseProfileTypeImpl#getNUpper <em>NUpper</em>}</li>
 *   <li>{@link Cpacs.impl.SuperEllipseProfileTypeImpl#getMLower <em>MLower</em>}</li>
 *   <li>{@link Cpacs.impl.SuperEllipseProfileTypeImpl#getNLower <em>NLower</em>}</li>
 *   <li>{@link Cpacs.impl.SuperEllipseProfileTypeImpl#getLowerHeightFraction <em>Lower Height Fraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperEllipseProfileTypeImpl extends ComplexBaseTypeImpl implements SuperEllipseProfileType {
	/**
	 * The cached value of the '{@link #getMUpper() <em>MUpper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpper()
	 * @generated
	 * @ordered
	 */
	protected PosExcl0DoubleBaseType mUpper;

	/**
	 * The cached value of the '{@link #getNUpper() <em>NUpper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNUpper()
	 * @generated
	 * @ordered
	 */
	protected PosExcl0DoubleBaseType nUpper;

	/**
	 * The cached value of the '{@link #getMLower() <em>MLower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLower()
	 * @generated
	 * @ordered
	 */
	protected PosExcl0DoubleBaseType mLower;

	/**
	 * The cached value of the '{@link #getNLower() <em>NLower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLower()
	 * @generated
	 * @ordered
	 */
	protected PosExcl0DoubleBaseType nLower;

	/**
	 * The cached value of the '{@link #getLowerHeightFraction() <em>Lower Height Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerHeightFraction()
	 * @generated
	 * @ordered
	 */
	protected LowerHeightFractionType lowerHeightFraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperEllipseProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSuperEllipseProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosExcl0DoubleBaseType getMUpper() {
		return mUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpper(PosExcl0DoubleBaseType newMUpper, NotificationChain msgs) {
		PosExcl0DoubleBaseType oldMUpper = mUpper;
		mUpper = newMUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER, oldMUpper, newMUpper);
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
	public void setMUpper(PosExcl0DoubleBaseType newMUpper) {
		if (newMUpper != mUpper) {
			NotificationChain msgs = null;
			if (mUpper != null)
				msgs = ((InternalEObject) mUpper).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER, null, msgs);
			if (newMUpper != null)
				msgs = ((InternalEObject) newMUpper).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER, null, msgs);
			msgs = basicSetMUpper(newMUpper, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER,
					newMUpper, newMUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosExcl0DoubleBaseType getNUpper() {
		return nUpper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNUpper(PosExcl0DoubleBaseType newNUpper, NotificationChain msgs) {
		PosExcl0DoubleBaseType oldNUpper = nUpper;
		nUpper = newNUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER, oldNUpper, newNUpper);
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
	public void setNUpper(PosExcl0DoubleBaseType newNUpper) {
		if (newNUpper != nUpper) {
			NotificationChain msgs = null;
			if (nUpper != null)
				msgs = ((InternalEObject) nUpper).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER, null, msgs);
			if (newNUpper != null)
				msgs = ((InternalEObject) newNUpper).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER, null, msgs);
			msgs = basicSetNUpper(newNUpper, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER,
					newNUpper, newNUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosExcl0DoubleBaseType getMLower() {
		return mLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLower(PosExcl0DoubleBaseType newMLower, NotificationChain msgs) {
		PosExcl0DoubleBaseType oldMLower = mLower;
		mLower = newMLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER, oldMLower, newMLower);
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
	public void setMLower(PosExcl0DoubleBaseType newMLower) {
		if (newMLower != mLower) {
			NotificationChain msgs = null;
			if (mLower != null)
				msgs = ((InternalEObject) mLower).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER, null, msgs);
			if (newMLower != null)
				msgs = ((InternalEObject) newMLower).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER, null, msgs);
			msgs = basicSetMLower(newMLower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER,
					newMLower, newMLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosExcl0DoubleBaseType getNLower() {
		return nLower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNLower(PosExcl0DoubleBaseType newNLower, NotificationChain msgs) {
		PosExcl0DoubleBaseType oldNLower = nLower;
		nLower = newNLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER, oldNLower, newNLower);
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
	public void setNLower(PosExcl0DoubleBaseType newNLower) {
		if (newNLower != nLower) {
			NotificationChain msgs = null;
			if (nLower != null)
				msgs = ((InternalEObject) nLower).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER, null, msgs);
			if (newNLower != null)
				msgs = ((InternalEObject) newNLower).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER, null, msgs);
			msgs = basicSetNLower(newNLower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER,
					newNLower, newNLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LowerHeightFractionType getLowerHeightFraction() {
		return lowerHeightFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerHeightFraction(LowerHeightFractionType newLowerHeightFraction,
			NotificationChain msgs) {
		LowerHeightFractionType oldLowerHeightFraction = lowerHeightFraction;
		lowerHeightFraction = newLowerHeightFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION, oldLowerHeightFraction,
					newLowerHeightFraction);
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
	public void setLowerHeightFraction(LowerHeightFractionType newLowerHeightFraction) {
		if (newLowerHeightFraction != lowerHeightFraction) {
			NotificationChain msgs = null;
			if (lowerHeightFraction != null)
				msgs = ((InternalEObject) lowerHeightFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION, null,
						msgs);
			if (newLowerHeightFraction != null)
				msgs = ((InternalEObject) newLowerHeightFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION, null,
						msgs);
			msgs = basicSetLowerHeightFraction(newLowerHeightFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION, newLowerHeightFraction,
					newLowerHeightFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER:
			return basicSetMUpper(null, msgs);
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER:
			return basicSetNUpper(null, msgs);
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER:
			return basicSetMLower(null, msgs);
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER:
			return basicSetNLower(null, msgs);
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION:
			return basicSetLowerHeightFraction(null, msgs);
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
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER:
			return getMUpper();
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER:
			return getNUpper();
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER:
			return getMLower();
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER:
			return getNLower();
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION:
			return getLowerHeightFraction();
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
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER:
			setMUpper((PosExcl0DoubleBaseType) newValue);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER:
			setNUpper((PosExcl0DoubleBaseType) newValue);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER:
			setMLower((PosExcl0DoubleBaseType) newValue);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER:
			setNLower((PosExcl0DoubleBaseType) newValue);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION:
			setLowerHeightFraction((LowerHeightFractionType) newValue);
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
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER:
			setMUpper((PosExcl0DoubleBaseType) null);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER:
			setNUpper((PosExcl0DoubleBaseType) null);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER:
			setMLower((PosExcl0DoubleBaseType) null);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER:
			setNLower((PosExcl0DoubleBaseType) null);
			return;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION:
			setLowerHeightFraction((LowerHeightFractionType) null);
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
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MUPPER:
			return mUpper != null;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NUPPER:
			return nUpper != null;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__MLOWER:
			return mLower != null;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__NLOWER:
			return nLower != null;
		case CpacsPackage.SUPER_ELLIPSE_PROFILE_TYPE__LOWER_HEIGHT_FRACTION:
			return lowerHeightFraction != null;
		}
		return super.eIsSet(featureID);
	}

} //SuperEllipseProfileTypeImpl
