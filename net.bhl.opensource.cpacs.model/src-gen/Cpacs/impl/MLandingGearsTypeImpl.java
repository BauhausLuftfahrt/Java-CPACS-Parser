/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MLandingGearsType;
import Cpacs.MMainGearsType;
import Cpacs.MNoseGearsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MLanding Gears Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MLandingGearsTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MLandingGearsTypeImpl#getMNoseGears <em>MNose Gears</em>}</li>
 *   <li>{@link Cpacs.impl.MLandingGearsTypeImpl#getMMainGears <em>MMain Gears</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLandingGearsTypeImpl extends ComplexBaseTypeImpl implements MLandingGearsType {
	/**
	 * The cached value of the '{@link #getMassDescription() <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType massDescription;

	/**
	 * The cached value of the '{@link #getMNoseGears() <em>MNose Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNoseGears()
	 * @generated
	 * @ordered
	 */
	protected MNoseGearsType mNoseGears;

	/**
	 * The cached value of the '{@link #getMMainGears() <em>MMain Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMainGears()
	 * @generated
	 * @ordered
	 */
	protected MMainGearsType mMainGears;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLandingGearsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMLandingGearsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMassDescription() {
		return massDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassDescription(GenericMassType newMassDescription, NotificationChain msgs) {
		GenericMassType oldMassDescription = massDescription;
		massDescription = newMassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
	public void setMassDescription(GenericMassType newMassDescription) {
		if (newMassDescription != massDescription) {
			NotificationChain msgs = null;
			if (massDescription != null)
				msgs = ((InternalEObject) massDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MNoseGearsType getMNoseGears() {
		return mNoseGears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMNoseGears(MNoseGearsType newMNoseGears, NotificationChain msgs) {
		MNoseGearsType oldMNoseGears = mNoseGears;
		mNoseGears = newMNoseGears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS, oldMNoseGears, newMNoseGears);
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
	public void setMNoseGears(MNoseGearsType newMNoseGears) {
		if (newMNoseGears != mNoseGears) {
			NotificationChain msgs = null;
			if (mNoseGears != null)
				msgs = ((InternalEObject) mNoseGears).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS, null, msgs);
			if (newMNoseGears != null)
				msgs = ((InternalEObject) newMNoseGears).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS, null, msgs);
			msgs = basicSetMNoseGears(newMNoseGears, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS,
					newMNoseGears, newMNoseGears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMainGearsType getMMainGears() {
		return mMainGears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMainGears(MMainGearsType newMMainGears, NotificationChain msgs) {
		MMainGearsType oldMMainGears = mMainGears;
		mMainGears = newMMainGears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS, oldMMainGears, newMMainGears);
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
	public void setMMainGears(MMainGearsType newMMainGears) {
		if (newMMainGears != mMainGears) {
			NotificationChain msgs = null;
			if (mMainGears != null)
				msgs = ((InternalEObject) mMainGears).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS, null, msgs);
			if (newMMainGears != null)
				msgs = ((InternalEObject) newMMainGears).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS, null, msgs);
			msgs = basicSetMMainGears(newMMainGears, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS,
					newMMainGears, newMMainGears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS:
			return basicSetMNoseGears(null, msgs);
		case CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS:
			return basicSetMMainGears(null, msgs);
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
		case CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS:
			return getMNoseGears();
		case CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS:
			return getMMainGears();
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
		case CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS:
			setMNoseGears((MNoseGearsType) newValue);
			return;
		case CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS:
			setMMainGears((MMainGearsType) newValue);
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
		case CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS:
			setMNoseGears((MNoseGearsType) null);
			return;
		case CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS:
			setMMainGears((MMainGearsType) null);
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
		case CpacsPackage.MLANDING_GEARS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MLANDING_GEARS_TYPE__MNOSE_GEARS:
			return mNoseGears != null;
		case CpacsPackage.MLANDING_GEARS_TYPE__MMAIN_GEARS:
			return mMainGears != null;
		}
		return super.eIsSet(featureID);
	}

} //MLandingGearsTypeImpl
