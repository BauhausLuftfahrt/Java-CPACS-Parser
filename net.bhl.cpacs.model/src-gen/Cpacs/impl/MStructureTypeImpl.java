/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MFuselagesStructureType;
import Cpacs.MLandingGearsType;
import Cpacs.MPylonsType;
import Cpacs.MStructureType;
import Cpacs.MWingsStructureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MStructure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MStructureTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MStructureTypeImpl#getMWingsStructure <em>MWings Structure</em>}</li>
 *   <li>{@link Cpacs.impl.MStructureTypeImpl#getMFuselagesStructure <em>MFuselages Structure</em>}</li>
 *   <li>{@link Cpacs.impl.MStructureTypeImpl#getMLandingGears <em>MLanding Gears</em>}</li>
 *   <li>{@link Cpacs.impl.MStructureTypeImpl#getMPylons <em>MPylons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MStructureTypeImpl extends ComplexBaseTypeImpl implements MStructureType {
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
	 * The cached value of the '{@link #getMWingsStructure() <em>MWings Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWingsStructure()
	 * @generated
	 * @ordered
	 */
	protected MWingsStructureType mWingsStructure;

	/**
	 * The cached value of the '{@link #getMFuselagesStructure() <em>MFuselages Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFuselagesStructure()
	 * @generated
	 * @ordered
	 */
	protected MFuselagesStructureType mFuselagesStructure;

	/**
	 * The cached value of the '{@link #getMLandingGears() <em>MLanding Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLandingGears()
	 * @generated
	 * @ordered
	 */
	protected MLandingGearsType mLandingGears;

	/**
	 * The cached value of the '{@link #getMPylons() <em>MPylons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPylons()
	 * @generated
	 * @ordered
	 */
	protected MPylonsType mPylons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMStructureType();
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
					CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWingsStructureType getMWingsStructure() {
		return mWingsStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWingsStructure(MWingsStructureType newMWingsStructure, NotificationChain msgs) {
		MWingsStructureType oldMWingsStructure = mWingsStructure;
		mWingsStructure = newMWingsStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE, oldMWingsStructure, newMWingsStructure);
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
	public void setMWingsStructure(MWingsStructureType newMWingsStructure) {
		if (newMWingsStructure != mWingsStructure) {
			NotificationChain msgs = null;
			if (mWingsStructure != null)
				msgs = ((InternalEObject) mWingsStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE, null, msgs);
			if (newMWingsStructure != null)
				msgs = ((InternalEObject) newMWingsStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE, null, msgs);
			msgs = basicSetMWingsStructure(newMWingsStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE,
					newMWingsStructure, newMWingsStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFuselagesStructureType getMFuselagesStructure() {
		return mFuselagesStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFuselagesStructure(MFuselagesStructureType newMFuselagesStructure,
			NotificationChain msgs) {
		MFuselagesStructureType oldMFuselagesStructure = mFuselagesStructure;
		mFuselagesStructure = newMFuselagesStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE, oldMFuselagesStructure, newMFuselagesStructure);
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
	public void setMFuselagesStructure(MFuselagesStructureType newMFuselagesStructure) {
		if (newMFuselagesStructure != mFuselagesStructure) {
			NotificationChain msgs = null;
			if (mFuselagesStructure != null)
				msgs = ((InternalEObject) mFuselagesStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE, null, msgs);
			if (newMFuselagesStructure != null)
				msgs = ((InternalEObject) newMFuselagesStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE, null, msgs);
			msgs = basicSetMFuselagesStructure(newMFuselagesStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE,
					newMFuselagesStructure, newMFuselagesStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLandingGearsType getMLandingGears() {
		return mLandingGears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLandingGears(MLandingGearsType newMLandingGears, NotificationChain msgs) {
		MLandingGearsType oldMLandingGears = mLandingGears;
		mLandingGears = newMLandingGears;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS, oldMLandingGears, newMLandingGears);
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
	public void setMLandingGears(MLandingGearsType newMLandingGears) {
		if (newMLandingGears != mLandingGears) {
			NotificationChain msgs = null;
			if (mLandingGears != null)
				msgs = ((InternalEObject) mLandingGears).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS, null, msgs);
			if (newMLandingGears != null)
				msgs = ((InternalEObject) newMLandingGears).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS, null, msgs);
			msgs = basicSetMLandingGears(newMLandingGears, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS,
					newMLandingGears, newMLandingGears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPylonsType getMPylons() {
		return mPylons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPylons(MPylonsType newMPylons, NotificationChain msgs) {
		MPylonsType oldMPylons = mPylons;
		mPylons = newMPylons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSTRUCTURE_TYPE__MPYLONS, oldMPylons, newMPylons);
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
	public void setMPylons(MPylonsType newMPylons) {
		if (newMPylons != mPylons) {
			NotificationChain msgs = null;
			if (mPylons != null)
				msgs = ((InternalEObject) mPylons).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MPYLONS, null, msgs);
			if (newMPylons != null)
				msgs = ((InternalEObject) newMPylons).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSTRUCTURE_TYPE__MPYLONS, null, msgs);
			msgs = basicSetMPylons(newMPylons, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSTRUCTURE_TYPE__MPYLONS, newMPylons,
					newMPylons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE:
			return basicSetMWingsStructure(null, msgs);
		case CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE:
			return basicSetMFuselagesStructure(null, msgs);
		case CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS:
			return basicSetMLandingGears(null, msgs);
		case CpacsPackage.MSTRUCTURE_TYPE__MPYLONS:
			return basicSetMPylons(null, msgs);
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
		case CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE:
			return getMWingsStructure();
		case CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE:
			return getMFuselagesStructure();
		case CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS:
			return getMLandingGears();
		case CpacsPackage.MSTRUCTURE_TYPE__MPYLONS:
			return getMPylons();
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
		case CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE:
			setMWingsStructure((MWingsStructureType) newValue);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE:
			setMFuselagesStructure((MFuselagesStructureType) newValue);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS:
			setMLandingGears((MLandingGearsType) newValue);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MPYLONS:
			setMPylons((MPylonsType) newValue);
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
		case CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE:
			setMWingsStructure((MWingsStructureType) null);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE:
			setMFuselagesStructure((MFuselagesStructureType) null);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS:
			setMLandingGears((MLandingGearsType) null);
			return;
		case CpacsPackage.MSTRUCTURE_TYPE__MPYLONS:
			setMPylons((MPylonsType) null);
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
		case CpacsPackage.MSTRUCTURE_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MSTRUCTURE_TYPE__MWINGS_STRUCTURE:
			return mWingsStructure != null;
		case CpacsPackage.MSTRUCTURE_TYPE__MFUSELAGES_STRUCTURE:
			return mFuselagesStructure != null;
		case CpacsPackage.MSTRUCTURE_TYPE__MLANDING_GEARS:
			return mLandingGears != null;
		case CpacsPackage.MSTRUCTURE_TYPE__MPYLONS:
			return mPylons != null;
		}
		return super.eIsSet(featureID);
	}

} //MStructureTypeImpl
