/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MBellyFairingsType;
import Cpacs.MBulkheadsType;
import Cpacs.MCabinFloorsType;
import Cpacs.MCargoFloorsType;
import Cpacs.MDoorsType;
import Cpacs.MFramesType;
import Cpacs.MFuselageStructureType;
import Cpacs.MSkinPanelsType;
import Cpacs.MSpecialStructuresType;
import Cpacs.MStringersType;
import Cpacs.MWindowsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFuselage Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMSkinPanels <em>MSkin Panels</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMBulkheads <em>MBulkheads</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMDoors <em>MDoors</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMWindows <em>MWindows</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMCabinFloors <em>MCabin Floors</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMCargoFloors <em>MCargo Floors</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMSpecialStructures <em>MSpecial Structures</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMBellyFairings <em>MBelly Fairings</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMStringers <em>MStringers</em>}</li>
 *   <li>{@link Cpacs.impl.MFuselageStructureTypeImpl#getMFrames <em>MFrames</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFuselageStructureTypeImpl extends ComplexBaseTypeImpl implements MFuselageStructureType {
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
	 * The cached value of the '{@link #getMSkinPanels() <em>MSkin Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSkinPanels()
	 * @generated
	 * @ordered
	 */
	protected MSkinPanelsType mSkinPanels;

	/**
	 * The cached value of the '{@link #getMBulkheads() <em>MBulkheads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBulkheads()
	 * @generated
	 * @ordered
	 */
	protected MBulkheadsType mBulkheads;

	/**
	 * The cached value of the '{@link #getMDoors() <em>MDoors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDoors()
	 * @generated
	 * @ordered
	 */
	protected MDoorsType mDoors;

	/**
	 * The cached value of the '{@link #getMWindows() <em>MWindows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWindows()
	 * @generated
	 * @ordered
	 */
	protected MWindowsType mWindows;

	/**
	 * The cached value of the '{@link #getMCabinFloors() <em>MCabin Floors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCabinFloors()
	 * @generated
	 * @ordered
	 */
	protected MCabinFloorsType mCabinFloors;

	/**
	 * The cached value of the '{@link #getMCargoFloors() <em>MCargo Floors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCargoFloors()
	 * @generated
	 * @ordered
	 */
	protected MCargoFloorsType mCargoFloors;

	/**
	 * The cached value of the '{@link #getMSpecialStructures() <em>MSpecial Structures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSpecialStructures()
	 * @generated
	 * @ordered
	 */
	protected MSpecialStructuresType mSpecialStructures;

	/**
	 * The cached value of the '{@link #getMBellyFairings() <em>MBelly Fairings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBellyFairings()
	 * @generated
	 * @ordered
	 */
	protected MBellyFairingsType mBellyFairings;

	/**
	 * The cached value of the '{@link #getMStringers() <em>MStringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStringers()
	 * @generated
	 * @ordered
	 */
	protected MStringersType mStringers;

	/**
	 * The cached value of the '{@link #getMFrames() <em>MFrames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFrames()
	 * @generated
	 * @ordered
	 */
	protected MFramesType mFrames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFuselageStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMFuselageStructureType();
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
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION, newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSkinPanelsType getMSkinPanels() {
		return mSkinPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSkinPanels(MSkinPanelsType newMSkinPanels, NotificationChain msgs) {
		MSkinPanelsType oldMSkinPanels = mSkinPanels;
		mSkinPanels = newMSkinPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS, oldMSkinPanels, newMSkinPanels);
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
	public void setMSkinPanels(MSkinPanelsType newMSkinPanels) {
		if (newMSkinPanels != mSkinPanels) {
			NotificationChain msgs = null;
			if (mSkinPanels != null)
				msgs = ((InternalEObject) mSkinPanels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS, null, msgs);
			if (newMSkinPanels != null)
				msgs = ((InternalEObject) newMSkinPanels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS, null, msgs);
			msgs = basicSetMSkinPanels(newMSkinPanels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS,
					newMSkinPanels, newMSkinPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBulkheadsType getMBulkheads() {
		return mBulkheads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBulkheads(MBulkheadsType newMBulkheads, NotificationChain msgs) {
		MBulkheadsType oldMBulkheads = mBulkheads;
		mBulkheads = newMBulkheads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS, oldMBulkheads, newMBulkheads);
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
	public void setMBulkheads(MBulkheadsType newMBulkheads) {
		if (newMBulkheads != mBulkheads) {
			NotificationChain msgs = null;
			if (mBulkheads != null)
				msgs = ((InternalEObject) mBulkheads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS, null, msgs);
			if (newMBulkheads != null)
				msgs = ((InternalEObject) newMBulkheads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS, null, msgs);
			msgs = basicSetMBulkheads(newMBulkheads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS,
					newMBulkheads, newMBulkheads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDoorsType getMDoors() {
		return mDoors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDoors(MDoorsType newMDoors, NotificationChain msgs) {
		MDoorsType oldMDoors = mDoors;
		mDoors = newMDoors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS, oldMDoors, newMDoors);
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
	public void setMDoors(MDoorsType newMDoors) {
		if (newMDoors != mDoors) {
			NotificationChain msgs = null;
			if (mDoors != null)
				msgs = ((InternalEObject) mDoors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS, null, msgs);
			if (newMDoors != null)
				msgs = ((InternalEObject) newMDoors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS, null, msgs);
			msgs = basicSetMDoors(newMDoors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS,
					newMDoors, newMDoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWindowsType getMWindows() {
		return mWindows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWindows(MWindowsType newMWindows, NotificationChain msgs) {
		MWindowsType oldMWindows = mWindows;
		mWindows = newMWindows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS, oldMWindows, newMWindows);
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
	public void setMWindows(MWindowsType newMWindows) {
		if (newMWindows != mWindows) {
			NotificationChain msgs = null;
			if (mWindows != null)
				msgs = ((InternalEObject) mWindows).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS, null, msgs);
			if (newMWindows != null)
				msgs = ((InternalEObject) newMWindows).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS, null, msgs);
			msgs = basicSetMWindows(newMWindows, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS,
					newMWindows, newMWindows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCabinFloorsType getMCabinFloors() {
		return mCabinFloors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCabinFloors(MCabinFloorsType newMCabinFloors, NotificationChain msgs) {
		MCabinFloorsType oldMCabinFloors = mCabinFloors;
		mCabinFloors = newMCabinFloors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS, oldMCabinFloors, newMCabinFloors);
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
	public void setMCabinFloors(MCabinFloorsType newMCabinFloors) {
		if (newMCabinFloors != mCabinFloors) {
			NotificationChain msgs = null;
			if (mCabinFloors != null)
				msgs = ((InternalEObject) mCabinFloors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS, null, msgs);
			if (newMCabinFloors != null)
				msgs = ((InternalEObject) newMCabinFloors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS, null, msgs);
			msgs = basicSetMCabinFloors(newMCabinFloors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS,
					newMCabinFloors, newMCabinFloors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoFloorsType getMCargoFloors() {
		return mCargoFloors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCargoFloors(MCargoFloorsType newMCargoFloors, NotificationChain msgs) {
		MCargoFloorsType oldMCargoFloors = mCargoFloors;
		mCargoFloors = newMCargoFloors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS, oldMCargoFloors, newMCargoFloors);
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
	public void setMCargoFloors(MCargoFloorsType newMCargoFloors) {
		if (newMCargoFloors != mCargoFloors) {
			NotificationChain msgs = null;
			if (mCargoFloors != null)
				msgs = ((InternalEObject) mCargoFloors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS, null, msgs);
			if (newMCargoFloors != null)
				msgs = ((InternalEObject) newMCargoFloors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS, null, msgs);
			msgs = basicSetMCargoFloors(newMCargoFloors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS,
					newMCargoFloors, newMCargoFloors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSpecialStructuresType getMSpecialStructures() {
		return mSpecialStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSpecialStructures(MSpecialStructuresType newMSpecialStructures,
			NotificationChain msgs) {
		MSpecialStructuresType oldMSpecialStructures = mSpecialStructures;
		mSpecialStructures = newMSpecialStructures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES, oldMSpecialStructures,
					newMSpecialStructures);
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
	public void setMSpecialStructures(MSpecialStructuresType newMSpecialStructures) {
		if (newMSpecialStructures != mSpecialStructures) {
			NotificationChain msgs = null;
			if (mSpecialStructures != null)
				msgs = ((InternalEObject) mSpecialStructures).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES, null,
						msgs);
			if (newMSpecialStructures != null)
				msgs = ((InternalEObject) newMSpecialStructures).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES, null,
						msgs);
			msgs = basicSetMSpecialStructures(newMSpecialStructures, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES, newMSpecialStructures,
					newMSpecialStructures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBellyFairingsType getMBellyFairings() {
		return mBellyFairings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBellyFairings(MBellyFairingsType newMBellyFairings, NotificationChain msgs) {
		MBellyFairingsType oldMBellyFairings = mBellyFairings;
		mBellyFairings = newMBellyFairings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS, oldMBellyFairings, newMBellyFairings);
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
	public void setMBellyFairings(MBellyFairingsType newMBellyFairings) {
		if (newMBellyFairings != mBellyFairings) {
			NotificationChain msgs = null;
			if (mBellyFairings != null)
				msgs = ((InternalEObject) mBellyFairings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS, null, msgs);
			if (newMBellyFairings != null)
				msgs = ((InternalEObject) newMBellyFairings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS, null, msgs);
			msgs = basicSetMBellyFairings(newMBellyFairings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS, newMBellyFairings, newMBellyFairings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MStringersType getMStringers() {
		return mStringers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStringers(MStringersType newMStringers, NotificationChain msgs) {
		MStringersType oldMStringers = mStringers;
		mStringers = newMStringers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS, oldMStringers, newMStringers);
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
	public void setMStringers(MStringersType newMStringers) {
		if (newMStringers != mStringers) {
			NotificationChain msgs = null;
			if (mStringers != null)
				msgs = ((InternalEObject) mStringers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS, null, msgs);
			if (newMStringers != null)
				msgs = ((InternalEObject) newMStringers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS, null, msgs);
			msgs = basicSetMStringers(newMStringers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS,
					newMStringers, newMStringers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFramesType getMFrames() {
		return mFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFrames(MFramesType newMFrames, NotificationChain msgs) {
		MFramesType oldMFrames = mFrames;
		mFrames = newMFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES, oldMFrames, newMFrames);
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
	public void setMFrames(MFramesType newMFrames) {
		if (newMFrames != mFrames) {
			NotificationChain msgs = null;
			if (mFrames != null)
				msgs = ((InternalEObject) mFrames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES, null, msgs);
			if (newMFrames != null)
				msgs = ((InternalEObject) newMFrames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES, null, msgs);
			msgs = basicSetMFrames(newMFrames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES,
					newMFrames, newMFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS:
			return basicSetMSkinPanels(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS:
			return basicSetMBulkheads(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS:
			return basicSetMDoors(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS:
			return basicSetMWindows(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS:
			return basicSetMCabinFloors(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS:
			return basicSetMCargoFloors(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES:
			return basicSetMSpecialStructures(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS:
			return basicSetMBellyFairings(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS:
			return basicSetMStringers(null, msgs);
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES:
			return basicSetMFrames(null, msgs);
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
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS:
			return getMSkinPanels();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS:
			return getMBulkheads();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS:
			return getMDoors();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS:
			return getMWindows();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS:
			return getMCabinFloors();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS:
			return getMCargoFloors();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES:
			return getMSpecialStructures();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS:
			return getMBellyFairings();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS:
			return getMStringers();
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES:
			return getMFrames();
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
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS:
			setMSkinPanels((MSkinPanelsType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS:
			setMBulkheads((MBulkheadsType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS:
			setMDoors((MDoorsType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS:
			setMWindows((MWindowsType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS:
			setMCabinFloors((MCabinFloorsType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS:
			setMCargoFloors((MCargoFloorsType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES:
			setMSpecialStructures((MSpecialStructuresType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS:
			setMBellyFairings((MBellyFairingsType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS:
			setMStringers((MStringersType) newValue);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES:
			setMFrames((MFramesType) newValue);
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
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS:
			setMSkinPanels((MSkinPanelsType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS:
			setMBulkheads((MBulkheadsType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS:
			setMDoors((MDoorsType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS:
			setMWindows((MWindowsType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS:
			setMCabinFloors((MCabinFloorsType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS:
			setMCargoFloors((MCargoFloorsType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES:
			setMSpecialStructures((MSpecialStructuresType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS:
			setMBellyFairings((MBellyFairingsType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS:
			setMStringers((MStringersType) null);
			return;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES:
			setMFrames((MFramesType) null);
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
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSKIN_PANELS:
			return mSkinPanels != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBULKHEADS:
			return mBulkheads != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MDOORS:
			return mDoors != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MWINDOWS:
			return mWindows != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCABIN_FLOORS:
			return mCabinFloors != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MCARGO_FLOORS:
			return mCargoFloors != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSPECIAL_STRUCTURES:
			return mSpecialStructures != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MBELLY_FAIRINGS:
			return mBellyFairings != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MSTRINGERS:
			return mStringers != null;
		case CpacsPackage.MFUSELAGE_STRUCTURE_TYPE__MFRAMES:
			return mFrames != null;
		}
		return super.eIsSet(featureID);
	}

} //MFuselageStructureTypeImpl
