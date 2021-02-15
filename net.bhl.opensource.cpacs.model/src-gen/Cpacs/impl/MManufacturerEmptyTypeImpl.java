/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MFurnishingType;
import Cpacs.MManufacturerEmptyType;
import Cpacs.MPowerUnitsType;
import Cpacs.MStructureType;
import Cpacs.MSystemsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MManufacturer Empty Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MManufacturerEmptyTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MManufacturerEmptyTypeImpl#getMStructure <em>MStructure</em>}</li>
 *   <li>{@link Cpacs.impl.MManufacturerEmptyTypeImpl#getMPowerUnits <em>MPower Units</em>}</li>
 *   <li>{@link Cpacs.impl.MManufacturerEmptyTypeImpl#getMSystems <em>MSystems</em>}</li>
 *   <li>{@link Cpacs.impl.MManufacturerEmptyTypeImpl#getMFurnishing <em>MFurnishing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MManufacturerEmptyTypeImpl extends ComplexBaseTypeImpl implements MManufacturerEmptyType {
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
	 * The cached value of the '{@link #getMStructure() <em>MStructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStructure()
	 * @generated
	 * @ordered
	 */
	protected MStructureType mStructure;

	/**
	 * The cached value of the '{@link #getMPowerUnits() <em>MPower Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPowerUnits()
	 * @generated
	 * @ordered
	 */
	protected MPowerUnitsType mPowerUnits;

	/**
	 * The cached value of the '{@link #getMSystems() <em>MSystems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSystems()
	 * @generated
	 * @ordered
	 */
	protected MSystemsType mSystems;

	/**
	 * The cached value of the '{@link #getMFurnishing() <em>MFurnishing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFurnishing()
	 * @generated
	 * @ordered
	 */
	protected MFurnishingType mFurnishing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MManufacturerEmptyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMManufacturerEmptyType();
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
					CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION, newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MStructureType getMStructure() {
		return mStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStructure(MStructureType newMStructure, NotificationChain msgs) {
		MStructureType oldMStructure = mStructure;
		mStructure = newMStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE, oldMStructure, newMStructure);
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
	public void setMStructure(MStructureType newMStructure) {
		if (newMStructure != mStructure) {
			NotificationChain msgs = null;
			if (mStructure != null)
				msgs = ((InternalEObject) mStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE, null, msgs);
			if (newMStructure != null)
				msgs = ((InternalEObject) newMStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE, null, msgs);
			msgs = basicSetMStructure(newMStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE,
					newMStructure, newMStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPowerUnitsType getMPowerUnits() {
		return mPowerUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPowerUnits(MPowerUnitsType newMPowerUnits, NotificationChain msgs) {
		MPowerUnitsType oldMPowerUnits = mPowerUnits;
		mPowerUnits = newMPowerUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS, oldMPowerUnits, newMPowerUnits);
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
	public void setMPowerUnits(MPowerUnitsType newMPowerUnits) {
		if (newMPowerUnits != mPowerUnits) {
			NotificationChain msgs = null;
			if (mPowerUnits != null)
				msgs = ((InternalEObject) mPowerUnits).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS, null, msgs);
			if (newMPowerUnits != null)
				msgs = ((InternalEObject) newMPowerUnits).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS, null, msgs);
			msgs = basicSetMPowerUnits(newMPowerUnits, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS,
					newMPowerUnits, newMPowerUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSystemsType getMSystems() {
		return mSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSystems(MSystemsType newMSystems, NotificationChain msgs) {
		MSystemsType oldMSystems = mSystems;
		mSystems = newMSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS, oldMSystems, newMSystems);
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
	public void setMSystems(MSystemsType newMSystems) {
		if (newMSystems != mSystems) {
			NotificationChain msgs = null;
			if (mSystems != null)
				msgs = ((InternalEObject) mSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS, null, msgs);
			if (newMSystems != null)
				msgs = ((InternalEObject) newMSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS, null, msgs);
			msgs = basicSetMSystems(newMSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS,
					newMSystems, newMSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFurnishingType getMFurnishing() {
		return mFurnishing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFurnishing(MFurnishingType newMFurnishing, NotificationChain msgs) {
		MFurnishingType oldMFurnishing = mFurnishing;
		mFurnishing = newMFurnishing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING, oldMFurnishing, newMFurnishing);
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
	public void setMFurnishing(MFurnishingType newMFurnishing) {
		if (newMFurnishing != mFurnishing) {
			NotificationChain msgs = null;
			if (mFurnishing != null)
				msgs = ((InternalEObject) mFurnishing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING, null, msgs);
			if (newMFurnishing != null)
				msgs = ((InternalEObject) newMFurnishing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING, null, msgs);
			msgs = basicSetMFurnishing(newMFurnishing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING,
					newMFurnishing, newMFurnishing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE:
			return basicSetMStructure(null, msgs);
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS:
			return basicSetMPowerUnits(null, msgs);
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS:
			return basicSetMSystems(null, msgs);
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING:
			return basicSetMFurnishing(null, msgs);
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
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE:
			return getMStructure();
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS:
			return getMPowerUnits();
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS:
			return getMSystems();
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING:
			return getMFurnishing();
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
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE:
			setMStructure((MStructureType) newValue);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS:
			setMPowerUnits((MPowerUnitsType) newValue);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS:
			setMSystems((MSystemsType) newValue);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING:
			setMFurnishing((MFurnishingType) newValue);
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
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE:
			setMStructure((MStructureType) null);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS:
			setMPowerUnits((MPowerUnitsType) null);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS:
			setMSystems((MSystemsType) null);
			return;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING:
			setMFurnishing((MFurnishingType) null);
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
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSTRUCTURE:
			return mStructure != null;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MPOWER_UNITS:
			return mPowerUnits != null;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MSYSTEMS:
			return mSystems != null;
		case CpacsPackage.MMANUFACTURER_EMPTY_TYPE__MFURNISHING:
			return mFurnishing != null;
		}
		return super.eIsSet(featureID);
	}

} //MManufacturerEmptyTypeImpl
