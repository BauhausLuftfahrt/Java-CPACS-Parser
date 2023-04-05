/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MCabinLightingsType;
import Cpacs.MCargoLiningsType;
import Cpacs.MCargoLoadingsType;
import Cpacs.MCockpitLightingsType;
import Cpacs.MCrewSeatsType;
import Cpacs.MEmergencyOxygenSystemsType;
import Cpacs.MExtLightingsType;
import Cpacs.MFloorCoveringsType;
import Cpacs.MFreshWaterSystemsType;
import Cpacs.MFurnishingType;
import Cpacs.MInsulationsType;
import Cpacs.MLavatoriesType;
import Cpacs.MLiningsType;
import Cpacs.MOverheadBinsType;
import Cpacs.MPartStowDoorsType;
import Cpacs.MVacuumWasteSystemsType;
import Cpacs.MWasteWaterSystemsType;
import Cpacs.SingleGenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFurnishing Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMInsulations <em>MInsulations</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMLinings <em>MLinings</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMCrewSeats <em>MCrew Seats</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMPartStowDoors <em>MPart Stow Doors</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMLavatories <em>MLavatories</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMOverheadBins <em>MOverhead Bins</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMFloorCoverings <em>MFloor Coverings</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMCargoLinings <em>MCargo Linings</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMCargoLoadings <em>MCargo Loadings</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMEmergencyOxygenSystems <em>MEmergency Oxygen Systems</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMCockpitLightings <em>MCockpit Lightings</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMCabinLightings <em>MCabin Lightings</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMExtLightings <em>MExt Lightings</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMWasteWaterSystems <em>MWaste Water Systems</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMFreshWaterSystems <em>MFresh Water Systems</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMVacuumWasteSystems <em>MVacuum Waste Systems</em>}</li>
 *   <li>{@link Cpacs.impl.MFurnishingTypeImpl#getMMiscellaneous <em>MMiscellaneous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFurnishingTypeImpl extends ComplexBaseTypeImpl implements MFurnishingType {
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
	 * The cached value of the '{@link #getMInsulations() <em>MInsulations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInsulations()
	 * @generated
	 * @ordered
	 */
	protected MInsulationsType mInsulations;

	/**
	 * The cached value of the '{@link #getMLinings() <em>MLinings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLinings()
	 * @generated
	 * @ordered
	 */
	protected MLiningsType mLinings;

	/**
	 * The cached value of the '{@link #getMCrewSeats() <em>MCrew Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCrewSeats()
	 * @generated
	 * @ordered
	 */
	protected MCrewSeatsType mCrewSeats;

	/**
	 * The cached value of the '{@link #getMPartStowDoors() <em>MPart Stow Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPartStowDoors()
	 * @generated
	 * @ordered
	 */
	protected MPartStowDoorsType mPartStowDoors;

	/**
	 * The cached value of the '{@link #getMLavatories() <em>MLavatories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLavatories()
	 * @generated
	 * @ordered
	 */
	protected MLavatoriesType mLavatories;

	/**
	 * The cached value of the '{@link #getMOverheadBins() <em>MOverhead Bins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOverheadBins()
	 * @generated
	 * @ordered
	 */
	protected MOverheadBinsType mOverheadBins;

	/**
	 * The cached value of the '{@link #getMFloorCoverings() <em>MFloor Coverings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFloorCoverings()
	 * @generated
	 * @ordered
	 */
	protected MFloorCoveringsType mFloorCoverings;

	/**
	 * The cached value of the '{@link #getMCargoLinings() <em>MCargo Linings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCargoLinings()
	 * @generated
	 * @ordered
	 */
	protected MCargoLiningsType mCargoLinings;

	/**
	 * The cached value of the '{@link #getMCargoLoadings() <em>MCargo Loadings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCargoLoadings()
	 * @generated
	 * @ordered
	 */
	protected MCargoLoadingsType mCargoLoadings;

	/**
	 * The cached value of the '{@link #getMEmergencyOxygenSystems() <em>MEmergency Oxygen Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEmergencyOxygenSystems()
	 * @generated
	 * @ordered
	 */
	protected MEmergencyOxygenSystemsType mEmergencyOxygenSystems;

	/**
	 * The cached value of the '{@link #getMCockpitLightings() <em>MCockpit Lightings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCockpitLightings()
	 * @generated
	 * @ordered
	 */
	protected MCockpitLightingsType mCockpitLightings;

	/**
	 * The cached value of the '{@link #getMCabinLightings() <em>MCabin Lightings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCabinLightings()
	 * @generated
	 * @ordered
	 */
	protected MCabinLightingsType mCabinLightings;

	/**
	 * The cached value of the '{@link #getMExtLightings() <em>MExt Lightings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMExtLightings()
	 * @generated
	 * @ordered
	 */
	protected MExtLightingsType mExtLightings;

	/**
	 * The cached value of the '{@link #getMWasteWaterSystems() <em>MWaste Water Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWasteWaterSystems()
	 * @generated
	 * @ordered
	 */
	protected MWasteWaterSystemsType mWasteWaterSystems;

	/**
	 * The cached value of the '{@link #getMFreshWaterSystems() <em>MFresh Water Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFreshWaterSystems()
	 * @generated
	 * @ordered
	 */
	protected MFreshWaterSystemsType mFreshWaterSystems;

	/**
	 * The cached value of the '{@link #getMVacuumWasteSystems() <em>MVacuum Waste Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVacuumWasteSystems()
	 * @generated
	 * @ordered
	 */
	protected MVacuumWasteSystemsType mVacuumWasteSystems;

	/**
	 * The cached value of the '{@link #getMMiscellaneous() <em>MMiscellaneous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMiscellaneous()
	 * @generated
	 * @ordered
	 */
	protected SingleGenericMassType mMiscellaneous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFurnishingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMFurnishingType();
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
					CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MInsulationsType getMInsulations() {
		return mInsulations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMInsulations(MInsulationsType newMInsulations, NotificationChain msgs) {
		MInsulationsType oldMInsulations = mInsulations;
		mInsulations = newMInsulations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MINSULATIONS, oldMInsulations, newMInsulations);
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
	public void setMInsulations(MInsulationsType newMInsulations) {
		if (newMInsulations != mInsulations) {
			NotificationChain msgs = null;
			if (mInsulations != null)
				msgs = ((InternalEObject) mInsulations).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MINSULATIONS, null, msgs);
			if (newMInsulations != null)
				msgs = ((InternalEObject) newMInsulations).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MINSULATIONS, null, msgs);
			msgs = basicSetMInsulations(newMInsulations, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MINSULATIONS,
					newMInsulations, newMInsulations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLiningsType getMLinings() {
		return mLinings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLinings(MLiningsType newMLinings, NotificationChain msgs) {
		MLiningsType oldMLinings = mLinings;
		mLinings = newMLinings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MLININGS, oldMLinings, newMLinings);
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
	public void setMLinings(MLiningsType newMLinings) {
		if (newMLinings != mLinings) {
			NotificationChain msgs = null;
			if (mLinings != null)
				msgs = ((InternalEObject) mLinings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MLININGS, null, msgs);
			if (newMLinings != null)
				msgs = ((InternalEObject) newMLinings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MLININGS, null, msgs);
			msgs = basicSetMLinings(newMLinings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MLININGS, newMLinings,
					newMLinings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCrewSeatsType getMCrewSeats() {
		return mCrewSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCrewSeats(MCrewSeatsType newMCrewSeats, NotificationChain msgs) {
		MCrewSeatsType oldMCrewSeats = mCrewSeats;
		mCrewSeats = newMCrewSeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS, oldMCrewSeats, newMCrewSeats);
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
	public void setMCrewSeats(MCrewSeatsType newMCrewSeats) {
		if (newMCrewSeats != mCrewSeats) {
			NotificationChain msgs = null;
			if (mCrewSeats != null)
				msgs = ((InternalEObject) mCrewSeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS, null, msgs);
			if (newMCrewSeats != null)
				msgs = ((InternalEObject) newMCrewSeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS, null, msgs);
			msgs = basicSetMCrewSeats(newMCrewSeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS,
					newMCrewSeats, newMCrewSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPartStowDoorsType getMPartStowDoors() {
		return mPartStowDoors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPartStowDoors(MPartStowDoorsType newMPartStowDoors, NotificationChain msgs) {
		MPartStowDoorsType oldMPartStowDoors = mPartStowDoors;
		mPartStowDoors = newMPartStowDoors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS, oldMPartStowDoors, newMPartStowDoors);
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
	public void setMPartStowDoors(MPartStowDoorsType newMPartStowDoors) {
		if (newMPartStowDoors != mPartStowDoors) {
			NotificationChain msgs = null;
			if (mPartStowDoors != null)
				msgs = ((InternalEObject) mPartStowDoors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS, null, msgs);
			if (newMPartStowDoors != null)
				msgs = ((InternalEObject) newMPartStowDoors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS, null, msgs);
			msgs = basicSetMPartStowDoors(newMPartStowDoors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS,
					newMPartStowDoors, newMPartStowDoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLavatoriesType getMLavatories() {
		return mLavatories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLavatories(MLavatoriesType newMLavatories, NotificationChain msgs) {
		MLavatoriesType oldMLavatories = mLavatories;
		mLavatories = newMLavatories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MLAVATORIES, oldMLavatories, newMLavatories);
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
	public void setMLavatories(MLavatoriesType newMLavatories) {
		if (newMLavatories != mLavatories) {
			NotificationChain msgs = null;
			if (mLavatories != null)
				msgs = ((InternalEObject) mLavatories).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MLAVATORIES, null, msgs);
			if (newMLavatories != null)
				msgs = ((InternalEObject) newMLavatories).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MLAVATORIES, null, msgs);
			msgs = basicSetMLavatories(newMLavatories, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MLAVATORIES,
					newMLavatories, newMLavatories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MOverheadBinsType getMOverheadBins() {
		return mOverheadBins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOverheadBins(MOverheadBinsType newMOverheadBins, NotificationChain msgs) {
		MOverheadBinsType oldMOverheadBins = mOverheadBins;
		mOverheadBins = newMOverheadBins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS, oldMOverheadBins, newMOverheadBins);
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
	public void setMOverheadBins(MOverheadBinsType newMOverheadBins) {
		if (newMOverheadBins != mOverheadBins) {
			NotificationChain msgs = null;
			if (mOverheadBins != null)
				msgs = ((InternalEObject) mOverheadBins).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS, null, msgs);
			if (newMOverheadBins != null)
				msgs = ((InternalEObject) newMOverheadBins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS, null, msgs);
			msgs = basicSetMOverheadBins(newMOverheadBins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS,
					newMOverheadBins, newMOverheadBins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFloorCoveringsType getMFloorCoverings() {
		return mFloorCoverings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFloorCoverings(MFloorCoveringsType newMFloorCoverings, NotificationChain msgs) {
		MFloorCoveringsType oldMFloorCoverings = mFloorCoverings;
		mFloorCoverings = newMFloorCoverings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS, oldMFloorCoverings, newMFloorCoverings);
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
	public void setMFloorCoverings(MFloorCoveringsType newMFloorCoverings) {
		if (newMFloorCoverings != mFloorCoverings) {
			NotificationChain msgs = null;
			if (mFloorCoverings != null)
				msgs = ((InternalEObject) mFloorCoverings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS, null, msgs);
			if (newMFloorCoverings != null)
				msgs = ((InternalEObject) newMFloorCoverings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS, null, msgs);
			msgs = basicSetMFloorCoverings(newMFloorCoverings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS,
					newMFloorCoverings, newMFloorCoverings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoLiningsType getMCargoLinings() {
		return mCargoLinings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCargoLinings(MCargoLiningsType newMCargoLinings, NotificationChain msgs) {
		MCargoLiningsType oldMCargoLinings = mCargoLinings;
		mCargoLinings = newMCargoLinings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS, oldMCargoLinings, newMCargoLinings);
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
	public void setMCargoLinings(MCargoLiningsType newMCargoLinings) {
		if (newMCargoLinings != mCargoLinings) {
			NotificationChain msgs = null;
			if (mCargoLinings != null)
				msgs = ((InternalEObject) mCargoLinings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS, null, msgs);
			if (newMCargoLinings != null)
				msgs = ((InternalEObject) newMCargoLinings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS, null, msgs);
			msgs = basicSetMCargoLinings(newMCargoLinings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS,
					newMCargoLinings, newMCargoLinings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCargoLoadingsType getMCargoLoadings() {
		return mCargoLoadings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCargoLoadings(MCargoLoadingsType newMCargoLoadings, NotificationChain msgs) {
		MCargoLoadingsType oldMCargoLoadings = mCargoLoadings;
		mCargoLoadings = newMCargoLoadings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS, oldMCargoLoadings, newMCargoLoadings);
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
	public void setMCargoLoadings(MCargoLoadingsType newMCargoLoadings) {
		if (newMCargoLoadings != mCargoLoadings) {
			NotificationChain msgs = null;
			if (mCargoLoadings != null)
				msgs = ((InternalEObject) mCargoLoadings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS, null, msgs);
			if (newMCargoLoadings != null)
				msgs = ((InternalEObject) newMCargoLoadings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS, null, msgs);
			msgs = basicSetMCargoLoadings(newMCargoLoadings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS,
					newMCargoLoadings, newMCargoLoadings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEmergencyOxygenSystemsType getMEmergencyOxygenSystems() {
		return mEmergencyOxygenSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEmergencyOxygenSystems(MEmergencyOxygenSystemsType newMEmergencyOxygenSystems,
			NotificationChain msgs) {
		MEmergencyOxygenSystemsType oldMEmergencyOxygenSystems = mEmergencyOxygenSystems;
		mEmergencyOxygenSystems = newMEmergencyOxygenSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS, oldMEmergencyOxygenSystems,
					newMEmergencyOxygenSystems);
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
	public void setMEmergencyOxygenSystems(MEmergencyOxygenSystemsType newMEmergencyOxygenSystems) {
		if (newMEmergencyOxygenSystems != mEmergencyOxygenSystems) {
			NotificationChain msgs = null;
			if (mEmergencyOxygenSystems != null)
				msgs = ((InternalEObject) mEmergencyOxygenSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS, null, msgs);
			if (newMEmergencyOxygenSystems != null)
				msgs = ((InternalEObject) newMEmergencyOxygenSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS, null, msgs);
			msgs = basicSetMEmergencyOxygenSystems(newMEmergencyOxygenSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS, newMEmergencyOxygenSystems,
					newMEmergencyOxygenSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCockpitLightingsType getMCockpitLightings() {
		return mCockpitLightings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCockpitLightings(MCockpitLightingsType newMCockpitLightings,
			NotificationChain msgs) {
		MCockpitLightingsType oldMCockpitLightings = mCockpitLightings;
		mCockpitLightings = newMCockpitLightings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS, oldMCockpitLightings, newMCockpitLightings);
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
	public void setMCockpitLightings(MCockpitLightingsType newMCockpitLightings) {
		if (newMCockpitLightings != mCockpitLightings) {
			NotificationChain msgs = null;
			if (mCockpitLightings != null)
				msgs = ((InternalEObject) mCockpitLightings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS, null, msgs);
			if (newMCockpitLightings != null)
				msgs = ((InternalEObject) newMCockpitLightings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS, null, msgs);
			msgs = basicSetMCockpitLightings(newMCockpitLightings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS,
					newMCockpitLightings, newMCockpitLightings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCabinLightingsType getMCabinLightings() {
		return mCabinLightings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCabinLightings(MCabinLightingsType newMCabinLightings, NotificationChain msgs) {
		MCabinLightingsType oldMCabinLightings = mCabinLightings;
		mCabinLightings = newMCabinLightings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS, oldMCabinLightings, newMCabinLightings);
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
	public void setMCabinLightings(MCabinLightingsType newMCabinLightings) {
		if (newMCabinLightings != mCabinLightings) {
			NotificationChain msgs = null;
			if (mCabinLightings != null)
				msgs = ((InternalEObject) mCabinLightings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS, null, msgs);
			if (newMCabinLightings != null)
				msgs = ((InternalEObject) newMCabinLightings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS, null, msgs);
			msgs = basicSetMCabinLightings(newMCabinLightings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS,
					newMCabinLightings, newMCabinLightings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MExtLightingsType getMExtLightings() {
		return mExtLightings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMExtLightings(MExtLightingsType newMExtLightings, NotificationChain msgs) {
		MExtLightingsType oldMExtLightings = mExtLightings;
		mExtLightings = newMExtLightings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS, oldMExtLightings, newMExtLightings);
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
	public void setMExtLightings(MExtLightingsType newMExtLightings) {
		if (newMExtLightings != mExtLightings) {
			NotificationChain msgs = null;
			if (mExtLightings != null)
				msgs = ((InternalEObject) mExtLightings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS, null, msgs);
			if (newMExtLightings != null)
				msgs = ((InternalEObject) newMExtLightings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS, null, msgs);
			msgs = basicSetMExtLightings(newMExtLightings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS,
					newMExtLightings, newMExtLightings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWasteWaterSystemsType getMWasteWaterSystems() {
		return mWasteWaterSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWasteWaterSystems(MWasteWaterSystemsType newMWasteWaterSystems,
			NotificationChain msgs) {
		MWasteWaterSystemsType oldMWasteWaterSystems = mWasteWaterSystems;
		mWasteWaterSystems = newMWasteWaterSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS, oldMWasteWaterSystems, newMWasteWaterSystems);
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
	public void setMWasteWaterSystems(MWasteWaterSystemsType newMWasteWaterSystems) {
		if (newMWasteWaterSystems != mWasteWaterSystems) {
			NotificationChain msgs = null;
			if (mWasteWaterSystems != null)
				msgs = ((InternalEObject) mWasteWaterSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS, null, msgs);
			if (newMWasteWaterSystems != null)
				msgs = ((InternalEObject) newMWasteWaterSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS, null, msgs);
			msgs = basicSetMWasteWaterSystems(newMWasteWaterSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS,
					newMWasteWaterSystems, newMWasteWaterSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFreshWaterSystemsType getMFreshWaterSystems() {
		return mFreshWaterSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFreshWaterSystems(MFreshWaterSystemsType newMFreshWaterSystems,
			NotificationChain msgs) {
		MFreshWaterSystemsType oldMFreshWaterSystems = mFreshWaterSystems;
		mFreshWaterSystems = newMFreshWaterSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS, oldMFreshWaterSystems, newMFreshWaterSystems);
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
	public void setMFreshWaterSystems(MFreshWaterSystemsType newMFreshWaterSystems) {
		if (newMFreshWaterSystems != mFreshWaterSystems) {
			NotificationChain msgs = null;
			if (mFreshWaterSystems != null)
				msgs = ((InternalEObject) mFreshWaterSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS, null, msgs);
			if (newMFreshWaterSystems != null)
				msgs = ((InternalEObject) newMFreshWaterSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS, null, msgs);
			msgs = basicSetMFreshWaterSystems(newMFreshWaterSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS,
					newMFreshWaterSystems, newMFreshWaterSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MVacuumWasteSystemsType getMVacuumWasteSystems() {
		return mVacuumWasteSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMVacuumWasteSystems(MVacuumWasteSystemsType newMVacuumWasteSystems,
			NotificationChain msgs) {
		MVacuumWasteSystemsType oldMVacuumWasteSystems = mVacuumWasteSystems;
		mVacuumWasteSystems = newMVacuumWasteSystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS, oldMVacuumWasteSystems,
					newMVacuumWasteSystems);
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
	public void setMVacuumWasteSystems(MVacuumWasteSystemsType newMVacuumWasteSystems) {
		if (newMVacuumWasteSystems != mVacuumWasteSystems) {
			NotificationChain msgs = null;
			if (mVacuumWasteSystems != null)
				msgs = ((InternalEObject) mVacuumWasteSystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS, null, msgs);
			if (newMVacuumWasteSystems != null)
				msgs = ((InternalEObject) newMVacuumWasteSystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS, null, msgs);
			msgs = basicSetMVacuumWasteSystems(newMVacuumWasteSystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS,
					newMVacuumWasteSystems, newMVacuumWasteSystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleGenericMassType getMMiscellaneous() {
		return mMiscellaneous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMiscellaneous(SingleGenericMassType newMMiscellaneous, NotificationChain msgs) {
		SingleGenericMassType oldMMiscellaneous = mMiscellaneous;
		mMiscellaneous = newMMiscellaneous;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS, oldMMiscellaneous, newMMiscellaneous);
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
	public void setMMiscellaneous(SingleGenericMassType newMMiscellaneous) {
		if (newMMiscellaneous != mMiscellaneous) {
			NotificationChain msgs = null;
			if (mMiscellaneous != null)
				msgs = ((InternalEObject) mMiscellaneous).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS, null, msgs);
			if (newMMiscellaneous != null)
				msgs = ((InternalEObject) newMMiscellaneous).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS, null, msgs);
			msgs = basicSetMMiscellaneous(newMMiscellaneous, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS,
					newMMiscellaneous, newMMiscellaneous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MINSULATIONS:
			return basicSetMInsulations(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MLININGS:
			return basicSetMLinings(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS:
			return basicSetMCrewSeats(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS:
			return basicSetMPartStowDoors(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MLAVATORIES:
			return basicSetMLavatories(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS:
			return basicSetMOverheadBins(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS:
			return basicSetMFloorCoverings(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS:
			return basicSetMCargoLinings(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS:
			return basicSetMCargoLoadings(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS:
			return basicSetMEmergencyOxygenSystems(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS:
			return basicSetMCockpitLightings(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS:
			return basicSetMCabinLightings(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS:
			return basicSetMExtLightings(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS:
			return basicSetMWasteWaterSystems(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS:
			return basicSetMFreshWaterSystems(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS:
			return basicSetMVacuumWasteSystems(null, msgs);
		case CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS:
			return basicSetMMiscellaneous(null, msgs);
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
		case CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MFURNISHING_TYPE__MINSULATIONS:
			return getMInsulations();
		case CpacsPackage.MFURNISHING_TYPE__MLININGS:
			return getMLinings();
		case CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS:
			return getMCrewSeats();
		case CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS:
			return getMPartStowDoors();
		case CpacsPackage.MFURNISHING_TYPE__MLAVATORIES:
			return getMLavatories();
		case CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS:
			return getMOverheadBins();
		case CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS:
			return getMFloorCoverings();
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS:
			return getMCargoLinings();
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS:
			return getMCargoLoadings();
		case CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS:
			return getMEmergencyOxygenSystems();
		case CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS:
			return getMCockpitLightings();
		case CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS:
			return getMCabinLightings();
		case CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS:
			return getMExtLightings();
		case CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS:
			return getMWasteWaterSystems();
		case CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS:
			return getMFreshWaterSystems();
		case CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS:
			return getMVacuumWasteSystems();
		case CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS:
			return getMMiscellaneous();
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
		case CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MINSULATIONS:
			setMInsulations((MInsulationsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MLININGS:
			setMLinings((MLiningsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS:
			setMCrewSeats((MCrewSeatsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS:
			setMPartStowDoors((MPartStowDoorsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MLAVATORIES:
			setMLavatories((MLavatoriesType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS:
			setMOverheadBins((MOverheadBinsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS:
			setMFloorCoverings((MFloorCoveringsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS:
			setMCargoLinings((MCargoLiningsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS:
			setMCargoLoadings((MCargoLoadingsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS:
			setMEmergencyOxygenSystems((MEmergencyOxygenSystemsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS:
			setMCockpitLightings((MCockpitLightingsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS:
			setMCabinLightings((MCabinLightingsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS:
			setMExtLightings((MExtLightingsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS:
			setMWasteWaterSystems((MWasteWaterSystemsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS:
			setMFreshWaterSystems((MFreshWaterSystemsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS:
			setMVacuumWasteSystems((MVacuumWasteSystemsType) newValue);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS:
			setMMiscellaneous((SingleGenericMassType) newValue);
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
		case CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MINSULATIONS:
			setMInsulations((MInsulationsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MLININGS:
			setMLinings((MLiningsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS:
			setMCrewSeats((MCrewSeatsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS:
			setMPartStowDoors((MPartStowDoorsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MLAVATORIES:
			setMLavatories((MLavatoriesType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS:
			setMOverheadBins((MOverheadBinsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS:
			setMFloorCoverings((MFloorCoveringsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS:
			setMCargoLinings((MCargoLiningsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS:
			setMCargoLoadings((MCargoLoadingsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS:
			setMEmergencyOxygenSystems((MEmergencyOxygenSystemsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS:
			setMCockpitLightings((MCockpitLightingsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS:
			setMCabinLightings((MCabinLightingsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS:
			setMExtLightings((MExtLightingsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS:
			setMWasteWaterSystems((MWasteWaterSystemsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS:
			setMFreshWaterSystems((MFreshWaterSystemsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS:
			setMVacuumWasteSystems((MVacuumWasteSystemsType) null);
			return;
		case CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS:
			setMMiscellaneous((SingleGenericMassType) null);
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
		case CpacsPackage.MFURNISHING_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MFURNISHING_TYPE__MINSULATIONS:
			return mInsulations != null;
		case CpacsPackage.MFURNISHING_TYPE__MLININGS:
			return mLinings != null;
		case CpacsPackage.MFURNISHING_TYPE__MCREW_SEATS:
			return mCrewSeats != null;
		case CpacsPackage.MFURNISHING_TYPE__MPART_STOW_DOORS:
			return mPartStowDoors != null;
		case CpacsPackage.MFURNISHING_TYPE__MLAVATORIES:
			return mLavatories != null;
		case CpacsPackage.MFURNISHING_TYPE__MOVERHEAD_BINS:
			return mOverheadBins != null;
		case CpacsPackage.MFURNISHING_TYPE__MFLOOR_COVERINGS:
			return mFloorCoverings != null;
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LININGS:
			return mCargoLinings != null;
		case CpacsPackage.MFURNISHING_TYPE__MCARGO_LOADINGS:
			return mCargoLoadings != null;
		case CpacsPackage.MFURNISHING_TYPE__MEMERGENCY_OXYGEN_SYSTEMS:
			return mEmergencyOxygenSystems != null;
		case CpacsPackage.MFURNISHING_TYPE__MCOCKPIT_LIGHTINGS:
			return mCockpitLightings != null;
		case CpacsPackage.MFURNISHING_TYPE__MCABIN_LIGHTINGS:
			return mCabinLightings != null;
		case CpacsPackage.MFURNISHING_TYPE__MEXT_LIGHTINGS:
			return mExtLightings != null;
		case CpacsPackage.MFURNISHING_TYPE__MWASTE_WATER_SYSTEMS:
			return mWasteWaterSystems != null;
		case CpacsPackage.MFURNISHING_TYPE__MFRESH_WATER_SYSTEMS:
			return mFreshWaterSystems != null;
		case CpacsPackage.MFURNISHING_TYPE__MVACUUM_WASTE_SYSTEMS:
			return mVacuumWasteSystems != null;
		case CpacsPackage.MFURNISHING_TYPE__MMISCELLANEOUS:
			return mMiscellaneous != null;
		}
		return super.eIsSet(featureID);
	}

} //MFurnishingTypeImpl
