/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MAdditionalCenterTanksType;
import Cpacs.MCateringsType;
import Cpacs.MCrewMembersType;
import Cpacs.MDocumentsToolsType;
import Cpacs.MEmergencyEquipmentsType;
import Cpacs.MEngineAPUOilsType;
import Cpacs.MFixedGalleysType;
import Cpacs.MIFESystemsType;
import Cpacs.MOperatorItemsType;
import Cpacs.MRemovableCrewRestsType;
import Cpacs.MSeatsType;
import Cpacs.MToiletFluidsType;
import Cpacs.MUnusableFuelsType;
import Cpacs.MWaterReservoirsType;
import Cpacs.SingleGenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOperator Items Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMDocumentsTools <em>MDocuments Tools</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMFixedGalleys <em>MFixed Galleys</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMSeats <em>MSeats</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMIFEs <em>MIF Es</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMEmergencyEquipments <em>MEmergency Equipments</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMCaterings <em>MCaterings</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMCrewMembers <em>MCrew Members</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMAdditionalCenterTanks <em>MAdditional Center Tanks</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMEngineAPUOils <em>MEngine APU Oils</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMRemovableCrewRests <em>MRemovable Crew Rests</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMToiletFluids <em>MToilet Fluids</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMUnusableFuels <em>MUnusable Fuels</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMWaterReservoirs <em>MWater Reservoirs</em>}</li>
 *   <li>{@link Cpacs.impl.MOperatorItemsTypeImpl#getMMiscellaneous <em>MMiscellaneous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOperatorItemsTypeImpl extends ComplexBaseTypeImpl implements MOperatorItemsType {
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
	 * The cached value of the '{@link #getMDocumentsTools() <em>MDocuments Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDocumentsTools()
	 * @generated
	 * @ordered
	 */
	protected MDocumentsToolsType mDocumentsTools;

	/**
	 * The cached value of the '{@link #getMFixedGalleys() <em>MFixed Galleys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFixedGalleys()
	 * @generated
	 * @ordered
	 */
	protected MFixedGalleysType mFixedGalleys;

	/**
	 * The cached value of the '{@link #getMSeats() <em>MSeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSeats()
	 * @generated
	 * @ordered
	 */
	protected MSeatsType mSeats;

	/**
	 * The cached value of the '{@link #getMIFEs() <em>MIF Es</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIFEs()
	 * @generated
	 * @ordered
	 */
	protected MIFESystemsType mIFEs;

	/**
	 * The cached value of the '{@link #getMEmergencyEquipments() <em>MEmergency Equipments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEmergencyEquipments()
	 * @generated
	 * @ordered
	 */
	protected MEmergencyEquipmentsType mEmergencyEquipments;

	/**
	 * The cached value of the '{@link #getMCaterings() <em>MCaterings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCaterings()
	 * @generated
	 * @ordered
	 */
	protected MCateringsType mCaterings;

	/**
	 * The cached value of the '{@link #getMCrewMembers() <em>MCrew Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCrewMembers()
	 * @generated
	 * @ordered
	 */
	protected MCrewMembersType mCrewMembers;

	/**
	 * The cached value of the '{@link #getMAdditionalCenterTanks() <em>MAdditional Center Tanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAdditionalCenterTanks()
	 * @generated
	 * @ordered
	 */
	protected MAdditionalCenterTanksType mAdditionalCenterTanks;

	/**
	 * The cached value of the '{@link #getMEngineAPUOils() <em>MEngine APU Oils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEngineAPUOils()
	 * @generated
	 * @ordered
	 */
	protected MEngineAPUOilsType mEngineAPUOils;

	/**
	 * The cached value of the '{@link #getMRemovableCrewRests() <em>MRemovable Crew Rests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRemovableCrewRests()
	 * @generated
	 * @ordered
	 */
	protected MRemovableCrewRestsType mRemovableCrewRests;

	/**
	 * The cached value of the '{@link #getMToiletFluids() <em>MToilet Fluids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMToiletFluids()
	 * @generated
	 * @ordered
	 */
	protected MToiletFluidsType mToiletFluids;

	/**
	 * The cached value of the '{@link #getMUnusableFuels() <em>MUnusable Fuels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUnusableFuels()
	 * @generated
	 * @ordered
	 */
	protected MUnusableFuelsType mUnusableFuels;

	/**
	 * The cached value of the '{@link #getMWaterReservoirs() <em>MWater Reservoirs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMWaterReservoirs()
	 * @generated
	 * @ordered
	 */
	protected MWaterReservoirsType mWaterReservoirs;

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
	protected MOperatorItemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMOperatorItemsType();
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
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDocumentsToolsType getMDocumentsTools() {
		return mDocumentsTools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDocumentsTools(MDocumentsToolsType newMDocumentsTools, NotificationChain msgs) {
		MDocumentsToolsType oldMDocumentsTools = mDocumentsTools;
		mDocumentsTools = newMDocumentsTools;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS, oldMDocumentsTools, newMDocumentsTools);
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
	public void setMDocumentsTools(MDocumentsToolsType newMDocumentsTools) {
		if (newMDocumentsTools != mDocumentsTools) {
			NotificationChain msgs = null;
			if (mDocumentsTools != null)
				msgs = ((InternalEObject) mDocumentsTools).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS, null, msgs);
			if (newMDocumentsTools != null)
				msgs = ((InternalEObject) newMDocumentsTools).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS, null, msgs);
			msgs = basicSetMDocumentsTools(newMDocumentsTools, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS,
					newMDocumentsTools, newMDocumentsTools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFixedGalleysType getMFixedGalleys() {
		return mFixedGalleys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFixedGalleys(MFixedGalleysType newMFixedGalleys, NotificationChain msgs) {
		MFixedGalleysType oldMFixedGalleys = mFixedGalleys;
		mFixedGalleys = newMFixedGalleys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS, oldMFixedGalleys, newMFixedGalleys);
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
	public void setMFixedGalleys(MFixedGalleysType newMFixedGalleys) {
		if (newMFixedGalleys != mFixedGalleys) {
			NotificationChain msgs = null;
			if (mFixedGalleys != null)
				msgs = ((InternalEObject) mFixedGalleys).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS, null, msgs);
			if (newMFixedGalleys != null)
				msgs = ((InternalEObject) newMFixedGalleys).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS, null, msgs);
			msgs = basicSetMFixedGalleys(newMFixedGalleys, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS,
					newMFixedGalleys, newMFixedGalleys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSeatsType getMSeats() {
		return mSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSeats(MSeatsType newMSeats, NotificationChain msgs) {
		MSeatsType oldMSeats = mSeats;
		mSeats = newMSeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS, oldMSeats, newMSeats);
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
	public void setMSeats(MSeatsType newMSeats) {
		if (newMSeats != mSeats) {
			NotificationChain msgs = null;
			if (mSeats != null)
				msgs = ((InternalEObject) mSeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS, null, msgs);
			if (newMSeats != null)
				msgs = ((InternalEObject) newMSeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS, null, msgs);
			msgs = basicSetMSeats(newMSeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS, newMSeats,
					newMSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MIFESystemsType getMIFEs() {
		return mIFEs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMIFEs(MIFESystemsType newMIFEs, NotificationChain msgs) {
		MIFESystemsType oldMIFEs = mIFEs;
		mIFEs = newMIFEs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES, oldMIFEs, newMIFEs);
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
	public void setMIFEs(MIFESystemsType newMIFEs) {
		if (newMIFEs != mIFEs) {
			NotificationChain msgs = null;
			if (mIFEs != null)
				msgs = ((InternalEObject) mIFEs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES, null, msgs);
			if (newMIFEs != null)
				msgs = ((InternalEObject) newMIFEs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES, null, msgs);
			msgs = basicSetMIFEs(newMIFEs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES, newMIFEs,
					newMIFEs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEmergencyEquipmentsType getMEmergencyEquipments() {
		return mEmergencyEquipments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEmergencyEquipments(MEmergencyEquipmentsType newMEmergencyEquipments,
			NotificationChain msgs) {
		MEmergencyEquipmentsType oldMEmergencyEquipments = mEmergencyEquipments;
		mEmergencyEquipments = newMEmergencyEquipments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS, oldMEmergencyEquipments,
					newMEmergencyEquipments);
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
	public void setMEmergencyEquipments(MEmergencyEquipmentsType newMEmergencyEquipments) {
		if (newMEmergencyEquipments != mEmergencyEquipments) {
			NotificationChain msgs = null;
			if (mEmergencyEquipments != null)
				msgs = ((InternalEObject) mEmergencyEquipments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS, null, msgs);
			if (newMEmergencyEquipments != null)
				msgs = ((InternalEObject) newMEmergencyEquipments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS, null, msgs);
			msgs = basicSetMEmergencyEquipments(newMEmergencyEquipments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS, newMEmergencyEquipments,
					newMEmergencyEquipments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCateringsType getMCaterings() {
		return mCaterings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCaterings(MCateringsType newMCaterings, NotificationChain msgs) {
		MCateringsType oldMCaterings = mCaterings;
		mCaterings = newMCaterings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS, oldMCaterings, newMCaterings);
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
	public void setMCaterings(MCateringsType newMCaterings) {
		if (newMCaterings != mCaterings) {
			NotificationChain msgs = null;
			if (mCaterings != null)
				msgs = ((InternalEObject) mCaterings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS, null, msgs);
			if (newMCaterings != null)
				msgs = ((InternalEObject) newMCaterings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS, null, msgs);
			msgs = basicSetMCaterings(newMCaterings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS,
					newMCaterings, newMCaterings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCrewMembersType getMCrewMembers() {
		return mCrewMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCrewMembers(MCrewMembersType newMCrewMembers, NotificationChain msgs) {
		MCrewMembersType oldMCrewMembers = mCrewMembers;
		mCrewMembers = newMCrewMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS, oldMCrewMembers, newMCrewMembers);
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
	public void setMCrewMembers(MCrewMembersType newMCrewMembers) {
		if (newMCrewMembers != mCrewMembers) {
			NotificationChain msgs = null;
			if (mCrewMembers != null)
				msgs = ((InternalEObject) mCrewMembers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS, null, msgs);
			if (newMCrewMembers != null)
				msgs = ((InternalEObject) newMCrewMembers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS, null, msgs);
			msgs = basicSetMCrewMembers(newMCrewMembers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS,
					newMCrewMembers, newMCrewMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAdditionalCenterTanksType getMAdditionalCenterTanks() {
		return mAdditionalCenterTanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMAdditionalCenterTanks(MAdditionalCenterTanksType newMAdditionalCenterTanks,
			NotificationChain msgs) {
		MAdditionalCenterTanksType oldMAdditionalCenterTanks = mAdditionalCenterTanks;
		mAdditionalCenterTanks = newMAdditionalCenterTanks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS, oldMAdditionalCenterTanks,
					newMAdditionalCenterTanks);
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
	public void setMAdditionalCenterTanks(MAdditionalCenterTanksType newMAdditionalCenterTanks) {
		if (newMAdditionalCenterTanks != mAdditionalCenterTanks) {
			NotificationChain msgs = null;
			if (mAdditionalCenterTanks != null)
				msgs = ((InternalEObject) mAdditionalCenterTanks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS, null,
						msgs);
			if (newMAdditionalCenterTanks != null)
				msgs = ((InternalEObject) newMAdditionalCenterTanks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS, null,
						msgs);
			msgs = basicSetMAdditionalCenterTanks(newMAdditionalCenterTanks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS, newMAdditionalCenterTanks,
					newMAdditionalCenterTanks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEngineAPUOilsType getMEngineAPUOils() {
		return mEngineAPUOils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEngineAPUOils(MEngineAPUOilsType newMEngineAPUOils, NotificationChain msgs) {
		MEngineAPUOilsType oldMEngineAPUOils = mEngineAPUOils;
		mEngineAPUOils = newMEngineAPUOils;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS, oldMEngineAPUOils, newMEngineAPUOils);
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
	public void setMEngineAPUOils(MEngineAPUOilsType newMEngineAPUOils) {
		if (newMEngineAPUOils != mEngineAPUOils) {
			NotificationChain msgs = null;
			if (mEngineAPUOils != null)
				msgs = ((InternalEObject) mEngineAPUOils).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS, null, msgs);
			if (newMEngineAPUOils != null)
				msgs = ((InternalEObject) newMEngineAPUOils).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS, null, msgs);
			msgs = basicSetMEngineAPUOils(newMEngineAPUOils, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS,
					newMEngineAPUOils, newMEngineAPUOils));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MRemovableCrewRestsType getMRemovableCrewRests() {
		return mRemovableCrewRests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRemovableCrewRests(MRemovableCrewRestsType newMRemovableCrewRests,
			NotificationChain msgs) {
		MRemovableCrewRestsType oldMRemovableCrewRests = mRemovableCrewRests;
		mRemovableCrewRests = newMRemovableCrewRests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS, oldMRemovableCrewRests,
					newMRemovableCrewRests);
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
	public void setMRemovableCrewRests(MRemovableCrewRestsType newMRemovableCrewRests) {
		if (newMRemovableCrewRests != mRemovableCrewRests) {
			NotificationChain msgs = null;
			if (mRemovableCrewRests != null)
				msgs = ((InternalEObject) mRemovableCrewRests).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS, null, msgs);
			if (newMRemovableCrewRests != null)
				msgs = ((InternalEObject) newMRemovableCrewRests).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS, null, msgs);
			msgs = basicSetMRemovableCrewRests(newMRemovableCrewRests, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS, newMRemovableCrewRests,
					newMRemovableCrewRests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MToiletFluidsType getMToiletFluids() {
		return mToiletFluids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMToiletFluids(MToiletFluidsType newMToiletFluids, NotificationChain msgs) {
		MToiletFluidsType oldMToiletFluids = mToiletFluids;
		mToiletFluids = newMToiletFluids;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS, oldMToiletFluids, newMToiletFluids);
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
	public void setMToiletFluids(MToiletFluidsType newMToiletFluids) {
		if (newMToiletFluids != mToiletFluids) {
			NotificationChain msgs = null;
			if (mToiletFluids != null)
				msgs = ((InternalEObject) mToiletFluids).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS, null, msgs);
			if (newMToiletFluids != null)
				msgs = ((InternalEObject) newMToiletFluids).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS, null, msgs);
			msgs = basicSetMToiletFluids(newMToiletFluids, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS,
					newMToiletFluids, newMToiletFluids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MUnusableFuelsType getMUnusableFuels() {
		return mUnusableFuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUnusableFuels(MUnusableFuelsType newMUnusableFuels, NotificationChain msgs) {
		MUnusableFuelsType oldMUnusableFuels = mUnusableFuels;
		mUnusableFuels = newMUnusableFuels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS, oldMUnusableFuels, newMUnusableFuels);
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
	public void setMUnusableFuels(MUnusableFuelsType newMUnusableFuels) {
		if (newMUnusableFuels != mUnusableFuels) {
			NotificationChain msgs = null;
			if (mUnusableFuels != null)
				msgs = ((InternalEObject) mUnusableFuels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS, null, msgs);
			if (newMUnusableFuels != null)
				msgs = ((InternalEObject) newMUnusableFuels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS, null, msgs);
			msgs = basicSetMUnusableFuels(newMUnusableFuels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS,
					newMUnusableFuels, newMUnusableFuels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MWaterReservoirsType getMWaterReservoirs() {
		return mWaterReservoirs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMWaterReservoirs(MWaterReservoirsType newMWaterReservoirs,
			NotificationChain msgs) {
		MWaterReservoirsType oldMWaterReservoirs = mWaterReservoirs;
		mWaterReservoirs = newMWaterReservoirs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS, oldMWaterReservoirs, newMWaterReservoirs);
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
	public void setMWaterReservoirs(MWaterReservoirsType newMWaterReservoirs) {
		if (newMWaterReservoirs != mWaterReservoirs) {
			NotificationChain msgs = null;
			if (mWaterReservoirs != null)
				msgs = ((InternalEObject) mWaterReservoirs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS, null, msgs);
			if (newMWaterReservoirs != null)
				msgs = ((InternalEObject) newMWaterReservoirs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS, null, msgs);
			msgs = basicSetMWaterReservoirs(newMWaterReservoirs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS,
					newMWaterReservoirs, newMWaterReservoirs));
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
					CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS, oldMMiscellaneous, newMMiscellaneous);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS, null, msgs);
			if (newMMiscellaneous != null)
				msgs = ((InternalEObject) newMMiscellaneous).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS, null, msgs);
			msgs = basicSetMMiscellaneous(newMMiscellaneous, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS,
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
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS:
			return basicSetMDocumentsTools(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS:
			return basicSetMFixedGalleys(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS:
			return basicSetMSeats(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES:
			return basicSetMIFEs(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS:
			return basicSetMEmergencyEquipments(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS:
			return basicSetMCaterings(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS:
			return basicSetMCrewMembers(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS:
			return basicSetMAdditionalCenterTanks(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS:
			return basicSetMEngineAPUOils(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS:
			return basicSetMRemovableCrewRests(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS:
			return basicSetMToiletFluids(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS:
			return basicSetMUnusableFuels(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS:
			return basicSetMWaterReservoirs(null, msgs);
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS:
			return getMDocumentsTools();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS:
			return getMFixedGalleys();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS:
			return getMSeats();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES:
			return getMIFEs();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS:
			return getMEmergencyEquipments();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS:
			return getMCaterings();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS:
			return getMCrewMembers();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS:
			return getMAdditionalCenterTanks();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS:
			return getMEngineAPUOils();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS:
			return getMRemovableCrewRests();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS:
			return getMToiletFluids();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS:
			return getMUnusableFuels();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS:
			return getMWaterReservoirs();
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS:
			setMDocumentsTools((MDocumentsToolsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS:
			setMFixedGalleys((MFixedGalleysType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS:
			setMSeats((MSeatsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES:
			setMIFEs((MIFESystemsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS:
			setMEmergencyEquipments((MEmergencyEquipmentsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS:
			setMCaterings((MCateringsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS:
			setMCrewMembers((MCrewMembersType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS:
			setMAdditionalCenterTanks((MAdditionalCenterTanksType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS:
			setMEngineAPUOils((MEngineAPUOilsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS:
			setMRemovableCrewRests((MRemovableCrewRestsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS:
			setMToiletFluids((MToiletFluidsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS:
			setMUnusableFuels((MUnusableFuelsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS:
			setMWaterReservoirs((MWaterReservoirsType) newValue);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS:
			setMDocumentsTools((MDocumentsToolsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS:
			setMFixedGalleys((MFixedGalleysType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS:
			setMSeats((MSeatsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES:
			setMIFEs((MIFESystemsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS:
			setMEmergencyEquipments((MEmergencyEquipmentsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS:
			setMCaterings((MCateringsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS:
			setMCrewMembers((MCrewMembersType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS:
			setMAdditionalCenterTanks((MAdditionalCenterTanksType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS:
			setMEngineAPUOils((MEngineAPUOilsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS:
			setMRemovableCrewRests((MRemovableCrewRestsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS:
			setMToiletFluids((MToiletFluidsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS:
			setMUnusableFuels((MUnusableFuelsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS:
			setMWaterReservoirs((MWaterReservoirsType) null);
			return;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MDOCUMENTS_TOOLS:
			return mDocumentsTools != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MFIXED_GALLEYS:
			return mFixedGalleys != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MSEATS:
			return mSeats != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MIF_ES:
			return mIFEs != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MEMERGENCY_EQUIPMENTS:
			return mEmergencyEquipments != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCATERINGS:
			return mCaterings != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MCREW_MEMBERS:
			return mCrewMembers != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MADDITIONAL_CENTER_TANKS:
			return mAdditionalCenterTanks != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MENGINE_APU_OILS:
			return mEngineAPUOils != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MREMOVABLE_CREW_RESTS:
			return mRemovableCrewRests != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MTOILET_FLUIDS:
			return mToiletFluids != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MUNUSABLE_FUELS:
			return mUnusableFuels != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MWATER_RESERVOIRS:
			return mWaterReservoirs != null;
		case CpacsPackage.MOPERATOR_ITEMS_TYPE__MMISCELLANEOUS:
			return mMiscellaneous != null;
		}
		return super.eIsSet(featureID);
	}

} //MOperatorItemsTypeImpl
