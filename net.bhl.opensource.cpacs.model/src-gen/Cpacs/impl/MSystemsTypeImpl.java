/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MAirConditioningType;
import Cpacs.MAutomaticFlightSystemType;
import Cpacs.MAuxillaryPowerUnitType;
import Cpacs.MCommunicationType;
import Cpacs.MDeIcingType;
import Cpacs.MElectricalDistributionType;
import Cpacs.MElectricalGenerationType;
import Cpacs.MFireProtectionType;
import Cpacs.MFlightControlsType;
import Cpacs.MHydraulicDistributionType;
import Cpacs.MHydraulicGenerationType;
import Cpacs.MInstrumentPanelType;
import Cpacs.MIntegratedModularAvionicsType;
import Cpacs.MMillitarySystemsType;
import Cpacs.MNavigationType;
import Cpacs.MSystemsType;
import Cpacs.SingleGenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSystems Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMAuxillaryPowerUnit <em>MAuxillary Power Unit</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMHydraulicGeneration <em>MHydraulic Generation</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMHydraulicDistribution <em>MHydraulic Distribution</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMAirConditioning <em>MAir Conditioning</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMDeIcing <em>MDe Icing</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMFireProtection <em>MFire Protection</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMFlightControls <em>MFlight Controls</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMInstrumentPanel <em>MInstrument Panel</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMAutomaticFlightSystem <em>MAutomatic Flight System</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMCommunication <em>MCommunication</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMElectricalGeneration <em>MElectrical Generation</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMElectricalDistribution <em>MElectrical Distribution</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMIntegratedModularAvionics <em>MIntegrated Modular Avionics</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMMillitarySystems <em>MMillitary Systems</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMNavigation <em>MNavigation</em>}</li>
 *   <li>{@link Cpacs.impl.MSystemsTypeImpl#getMMiscellaneous <em>MMiscellaneous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSystemsTypeImpl extends ComplexBaseTypeImpl implements MSystemsType {
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
	 * The cached value of the '{@link #getMAuxillaryPowerUnit() <em>MAuxillary Power Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAuxillaryPowerUnit()
	 * @generated
	 * @ordered
	 */
	protected MAuxillaryPowerUnitType mAuxillaryPowerUnit;

	/**
	 * The cached value of the '{@link #getMHydraulicGeneration() <em>MHydraulic Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMHydraulicGeneration()
	 * @generated
	 * @ordered
	 */
	protected MHydraulicGenerationType mHydraulicGeneration;

	/**
	 * The cached value of the '{@link #getMHydraulicDistribution() <em>MHydraulic Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMHydraulicDistribution()
	 * @generated
	 * @ordered
	 */
	protected MHydraulicDistributionType mHydraulicDistribution;

	/**
	 * The cached value of the '{@link #getMAirConditioning() <em>MAir Conditioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAirConditioning()
	 * @generated
	 * @ordered
	 */
	protected MAirConditioningType mAirConditioning;

	/**
	 * The cached value of the '{@link #getMDeIcing() <em>MDe Icing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDeIcing()
	 * @generated
	 * @ordered
	 */
	protected MDeIcingType mDeIcing;

	/**
	 * The cached value of the '{@link #getMFireProtection() <em>MFire Protection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFireProtection()
	 * @generated
	 * @ordered
	 */
	protected MFireProtectionType mFireProtection;

	/**
	 * The cached value of the '{@link #getMFlightControls() <em>MFlight Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFlightControls()
	 * @generated
	 * @ordered
	 */
	protected MFlightControlsType mFlightControls;

	/**
	 * The cached value of the '{@link #getMInstrumentPanel() <em>MInstrument Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMInstrumentPanel()
	 * @generated
	 * @ordered
	 */
	protected MInstrumentPanelType mInstrumentPanel;

	/**
	 * The cached value of the '{@link #getMAutomaticFlightSystem() <em>MAutomatic Flight System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAutomaticFlightSystem()
	 * @generated
	 * @ordered
	 */
	protected MAutomaticFlightSystemType mAutomaticFlightSystem;

	/**
	 * The cached value of the '{@link #getMCommunication() <em>MCommunication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCommunication()
	 * @generated
	 * @ordered
	 */
	protected MCommunicationType mCommunication;

	/**
	 * The cached value of the '{@link #getMElectricalGeneration() <em>MElectrical Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMElectricalGeneration()
	 * @generated
	 * @ordered
	 */
	protected MElectricalGenerationType mElectricalGeneration;

	/**
	 * The cached value of the '{@link #getMElectricalDistribution() <em>MElectrical Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMElectricalDistribution()
	 * @generated
	 * @ordered
	 */
	protected MElectricalDistributionType mElectricalDistribution;

	/**
	 * The cached value of the '{@link #getMIntegratedModularAvionics() <em>MIntegrated Modular Avionics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIntegratedModularAvionics()
	 * @generated
	 * @ordered
	 */
	protected MIntegratedModularAvionicsType mIntegratedModularAvionics;

	/**
	 * The cached value of the '{@link #getMMillitarySystems() <em>MMillitary Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMillitarySystems()
	 * @generated
	 * @ordered
	 */
	protected MMillitarySystemsType mMillitarySystems;

	/**
	 * The cached value of the '{@link #getMNavigation() <em>MNavigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMNavigation()
	 * @generated
	 * @ordered
	 */
	protected MNavigationType mNavigation;

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
	protected MSystemsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMSystemsType();
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
					CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAuxillaryPowerUnitType getMAuxillaryPowerUnit() {
		return mAuxillaryPowerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMAuxillaryPowerUnit(MAuxillaryPowerUnitType newMAuxillaryPowerUnit,
			NotificationChain msgs) {
		MAuxillaryPowerUnitType oldMAuxillaryPowerUnit = mAuxillaryPowerUnit;
		mAuxillaryPowerUnit = newMAuxillaryPowerUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT, oldMAuxillaryPowerUnit, newMAuxillaryPowerUnit);
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
	public void setMAuxillaryPowerUnit(MAuxillaryPowerUnitType newMAuxillaryPowerUnit) {
		if (newMAuxillaryPowerUnit != mAuxillaryPowerUnit) {
			NotificationChain msgs = null;
			if (mAuxillaryPowerUnit != null)
				msgs = ((InternalEObject) mAuxillaryPowerUnit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT, null, msgs);
			if (newMAuxillaryPowerUnit != null)
				msgs = ((InternalEObject) newMAuxillaryPowerUnit).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT, null, msgs);
			msgs = basicSetMAuxillaryPowerUnit(newMAuxillaryPowerUnit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT,
					newMAuxillaryPowerUnit, newMAuxillaryPowerUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MHydraulicGenerationType getMHydraulicGeneration() {
		return mHydraulicGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMHydraulicGeneration(MHydraulicGenerationType newMHydraulicGeneration,
			NotificationChain msgs) {
		MHydraulicGenerationType oldMHydraulicGeneration = mHydraulicGeneration;
		mHydraulicGeneration = newMHydraulicGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION, oldMHydraulicGeneration,
					newMHydraulicGeneration);
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
	public void setMHydraulicGeneration(MHydraulicGenerationType newMHydraulicGeneration) {
		if (newMHydraulicGeneration != mHydraulicGeneration) {
			NotificationChain msgs = null;
			if (mHydraulicGeneration != null)
				msgs = ((InternalEObject) mHydraulicGeneration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION, null, msgs);
			if (newMHydraulicGeneration != null)
				msgs = ((InternalEObject) newMHydraulicGeneration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION, null, msgs);
			msgs = basicSetMHydraulicGeneration(newMHydraulicGeneration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION,
					newMHydraulicGeneration, newMHydraulicGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MHydraulicDistributionType getMHydraulicDistribution() {
		return mHydraulicDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMHydraulicDistribution(MHydraulicDistributionType newMHydraulicDistribution,
			NotificationChain msgs) {
		MHydraulicDistributionType oldMHydraulicDistribution = mHydraulicDistribution;
		mHydraulicDistribution = newMHydraulicDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION, oldMHydraulicDistribution,
					newMHydraulicDistribution);
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
	public void setMHydraulicDistribution(MHydraulicDistributionType newMHydraulicDistribution) {
		if (newMHydraulicDistribution != mHydraulicDistribution) {
			NotificationChain msgs = null;
			if (mHydraulicDistribution != null)
				msgs = ((InternalEObject) mHydraulicDistribution).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION, null, msgs);
			if (newMHydraulicDistribution != null)
				msgs = ((InternalEObject) newMHydraulicDistribution).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION, null, msgs);
			msgs = basicSetMHydraulicDistribution(newMHydraulicDistribution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION,
					newMHydraulicDistribution, newMHydraulicDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAirConditioningType getMAirConditioning() {
		return mAirConditioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMAirConditioning(MAirConditioningType newMAirConditioning,
			NotificationChain msgs) {
		MAirConditioningType oldMAirConditioning = mAirConditioning;
		mAirConditioning = newMAirConditioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING, oldMAirConditioning, newMAirConditioning);
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
	public void setMAirConditioning(MAirConditioningType newMAirConditioning) {
		if (newMAirConditioning != mAirConditioning) {
			NotificationChain msgs = null;
			if (mAirConditioning != null)
				msgs = ((InternalEObject) mAirConditioning).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING, null, msgs);
			if (newMAirConditioning != null)
				msgs = ((InternalEObject) newMAirConditioning).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING, null, msgs);
			msgs = basicSetMAirConditioning(newMAirConditioning, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING,
					newMAirConditioning, newMAirConditioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDeIcingType getMDeIcing() {
		return mDeIcing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDeIcing(MDeIcingType newMDeIcing, NotificationChain msgs) {
		MDeIcingType oldMDeIcing = mDeIcing;
		mDeIcing = newMDeIcing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MDE_ICING, oldMDeIcing, newMDeIcing);
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
	public void setMDeIcing(MDeIcingType newMDeIcing) {
		if (newMDeIcing != mDeIcing) {
			NotificationChain msgs = null;
			if (mDeIcing != null)
				msgs = ((InternalEObject) mDeIcing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MDE_ICING, null, msgs);
			if (newMDeIcing != null)
				msgs = ((InternalEObject) newMDeIcing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MDE_ICING, null, msgs);
			msgs = basicSetMDeIcing(newMDeIcing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MDE_ICING, newMDeIcing,
					newMDeIcing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFireProtectionType getMFireProtection() {
		return mFireProtection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFireProtection(MFireProtectionType newMFireProtection, NotificationChain msgs) {
		MFireProtectionType oldMFireProtection = mFireProtection;
		mFireProtection = newMFireProtection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION, oldMFireProtection, newMFireProtection);
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
	public void setMFireProtection(MFireProtectionType newMFireProtection) {
		if (newMFireProtection != mFireProtection) {
			NotificationChain msgs = null;
			if (mFireProtection != null)
				msgs = ((InternalEObject) mFireProtection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION, null, msgs);
			if (newMFireProtection != null)
				msgs = ((InternalEObject) newMFireProtection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION, null, msgs);
			msgs = basicSetMFireProtection(newMFireProtection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION,
					newMFireProtection, newMFireProtection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MFlightControlsType getMFlightControls() {
		return mFlightControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFlightControls(MFlightControlsType newMFlightControls, NotificationChain msgs) {
		MFlightControlsType oldMFlightControls = mFlightControls;
		mFlightControls = newMFlightControls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS, oldMFlightControls, newMFlightControls);
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
	public void setMFlightControls(MFlightControlsType newMFlightControls) {
		if (newMFlightControls != mFlightControls) {
			NotificationChain msgs = null;
			if (mFlightControls != null)
				msgs = ((InternalEObject) mFlightControls).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS, null, msgs);
			if (newMFlightControls != null)
				msgs = ((InternalEObject) newMFlightControls).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS, null, msgs);
			msgs = basicSetMFlightControls(newMFlightControls, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS,
					newMFlightControls, newMFlightControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MInstrumentPanelType getMInstrumentPanel() {
		return mInstrumentPanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMInstrumentPanel(MInstrumentPanelType newMInstrumentPanel,
			NotificationChain msgs) {
		MInstrumentPanelType oldMInstrumentPanel = mInstrumentPanel;
		mInstrumentPanel = newMInstrumentPanel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL, oldMInstrumentPanel, newMInstrumentPanel);
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
	public void setMInstrumentPanel(MInstrumentPanelType newMInstrumentPanel) {
		if (newMInstrumentPanel != mInstrumentPanel) {
			NotificationChain msgs = null;
			if (mInstrumentPanel != null)
				msgs = ((InternalEObject) mInstrumentPanel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL, null, msgs);
			if (newMInstrumentPanel != null)
				msgs = ((InternalEObject) newMInstrumentPanel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL, null, msgs);
			msgs = basicSetMInstrumentPanel(newMInstrumentPanel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL,
					newMInstrumentPanel, newMInstrumentPanel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MAutomaticFlightSystemType getMAutomaticFlightSystem() {
		return mAutomaticFlightSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMAutomaticFlightSystem(MAutomaticFlightSystemType newMAutomaticFlightSystem,
			NotificationChain msgs) {
		MAutomaticFlightSystemType oldMAutomaticFlightSystem = mAutomaticFlightSystem;
		mAutomaticFlightSystem = newMAutomaticFlightSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM, oldMAutomaticFlightSystem,
					newMAutomaticFlightSystem);
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
	public void setMAutomaticFlightSystem(MAutomaticFlightSystemType newMAutomaticFlightSystem) {
		if (newMAutomaticFlightSystem != mAutomaticFlightSystem) {
			NotificationChain msgs = null;
			if (mAutomaticFlightSystem != null)
				msgs = ((InternalEObject) mAutomaticFlightSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM, null, msgs);
			if (newMAutomaticFlightSystem != null)
				msgs = ((InternalEObject) newMAutomaticFlightSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM, null, msgs);
			msgs = basicSetMAutomaticFlightSystem(newMAutomaticFlightSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM,
					newMAutomaticFlightSystem, newMAutomaticFlightSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCommunicationType getMCommunication() {
		return mCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCommunication(MCommunicationType newMCommunication, NotificationChain msgs) {
		MCommunicationType oldMCommunication = mCommunication;
		mCommunication = newMCommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION, oldMCommunication, newMCommunication);
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
	public void setMCommunication(MCommunicationType newMCommunication) {
		if (newMCommunication != mCommunication) {
			NotificationChain msgs = null;
			if (mCommunication != null)
				msgs = ((InternalEObject) mCommunication).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION, null, msgs);
			if (newMCommunication != null)
				msgs = ((InternalEObject) newMCommunication).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION, null, msgs);
			msgs = basicSetMCommunication(newMCommunication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION,
					newMCommunication, newMCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MElectricalGenerationType getMElectricalGeneration() {
		return mElectricalGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMElectricalGeneration(MElectricalGenerationType newMElectricalGeneration,
			NotificationChain msgs) {
		MElectricalGenerationType oldMElectricalGeneration = mElectricalGeneration;
		mElectricalGeneration = newMElectricalGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION, oldMElectricalGeneration,
					newMElectricalGeneration);
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
	public void setMElectricalGeneration(MElectricalGenerationType newMElectricalGeneration) {
		if (newMElectricalGeneration != mElectricalGeneration) {
			NotificationChain msgs = null;
			if (mElectricalGeneration != null)
				msgs = ((InternalEObject) mElectricalGeneration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION, null, msgs);
			if (newMElectricalGeneration != null)
				msgs = ((InternalEObject) newMElectricalGeneration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION, null, msgs);
			msgs = basicSetMElectricalGeneration(newMElectricalGeneration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION,
					newMElectricalGeneration, newMElectricalGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MElectricalDistributionType getMElectricalDistribution() {
		return mElectricalDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMElectricalDistribution(MElectricalDistributionType newMElectricalDistribution,
			NotificationChain msgs) {
		MElectricalDistributionType oldMElectricalDistribution = mElectricalDistribution;
		mElectricalDistribution = newMElectricalDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION, oldMElectricalDistribution,
					newMElectricalDistribution);
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
	public void setMElectricalDistribution(MElectricalDistributionType newMElectricalDistribution) {
		if (newMElectricalDistribution != mElectricalDistribution) {
			NotificationChain msgs = null;
			if (mElectricalDistribution != null)
				msgs = ((InternalEObject) mElectricalDistribution).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION, null, msgs);
			if (newMElectricalDistribution != null)
				msgs = ((InternalEObject) newMElectricalDistribution).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION, null, msgs);
			msgs = basicSetMElectricalDistribution(newMElectricalDistribution, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION,
					newMElectricalDistribution, newMElectricalDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MIntegratedModularAvionicsType getMIntegratedModularAvionics() {
		return mIntegratedModularAvionics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMIntegratedModularAvionics(
			MIntegratedModularAvionicsType newMIntegratedModularAvionics, NotificationChain msgs) {
		MIntegratedModularAvionicsType oldMIntegratedModularAvionics = mIntegratedModularAvionics;
		mIntegratedModularAvionics = newMIntegratedModularAvionics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS, oldMIntegratedModularAvionics,
					newMIntegratedModularAvionics);
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
	public void setMIntegratedModularAvionics(MIntegratedModularAvionicsType newMIntegratedModularAvionics) {
		if (newMIntegratedModularAvionics != mIntegratedModularAvionics) {
			NotificationChain msgs = null;
			if (mIntegratedModularAvionics != null)
				msgs = ((InternalEObject) mIntegratedModularAvionics).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS, null, msgs);
			if (newMIntegratedModularAvionics != null)
				msgs = ((InternalEObject) newMIntegratedModularAvionics).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS, null, msgs);
			msgs = basicSetMIntegratedModularAvionics(newMIntegratedModularAvionics, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS, newMIntegratedModularAvionics,
					newMIntegratedModularAvionics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMillitarySystemsType getMMillitarySystems() {
		return mMillitarySystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMillitarySystems(MMillitarySystemsType newMMillitarySystems,
			NotificationChain msgs) {
		MMillitarySystemsType oldMMillitarySystems = mMillitarySystems;
		mMillitarySystems = newMMillitarySystems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS, oldMMillitarySystems, newMMillitarySystems);
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
	public void setMMillitarySystems(MMillitarySystemsType newMMillitarySystems) {
		if (newMMillitarySystems != mMillitarySystems) {
			NotificationChain msgs = null;
			if (mMillitarySystems != null)
				msgs = ((InternalEObject) mMillitarySystems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS, null, msgs);
			if (newMMillitarySystems != null)
				msgs = ((InternalEObject) newMMillitarySystems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS, null, msgs);
			msgs = basicSetMMillitarySystems(newMMillitarySystems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS,
					newMMillitarySystems, newMMillitarySystems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MNavigationType getMNavigation() {
		return mNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMNavigation(MNavigationType newMNavigation, NotificationChain msgs) {
		MNavigationType oldMNavigation = mNavigation;
		mNavigation = newMNavigation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION, oldMNavigation, newMNavigation);
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
	public void setMNavigation(MNavigationType newMNavigation) {
		if (newMNavigation != mNavigation) {
			NotificationChain msgs = null;
			if (mNavigation != null)
				msgs = ((InternalEObject) mNavigation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION, null, msgs);
			if (newMNavigation != null)
				msgs = ((InternalEObject) newMNavigation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION, null, msgs);
			msgs = basicSetMNavigation(newMNavigation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION,
					newMNavigation, newMNavigation));
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
					CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS, oldMMiscellaneous, newMMiscellaneous);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS, null, msgs);
			if (newMMiscellaneous != null)
				msgs = ((InternalEObject) newMMiscellaneous).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS, null, msgs);
			msgs = basicSetMMiscellaneous(newMMiscellaneous, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS,
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
		case CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT:
			return basicSetMAuxillaryPowerUnit(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION:
			return basicSetMHydraulicGeneration(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION:
			return basicSetMHydraulicDistribution(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING:
			return basicSetMAirConditioning(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MDE_ICING:
			return basicSetMDeIcing(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION:
			return basicSetMFireProtection(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS:
			return basicSetMFlightControls(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL:
			return basicSetMInstrumentPanel(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM:
			return basicSetMAutomaticFlightSystem(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION:
			return basicSetMCommunication(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION:
			return basicSetMElectricalGeneration(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION:
			return basicSetMElectricalDistribution(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS:
			return basicSetMIntegratedModularAvionics(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS:
			return basicSetMMillitarySystems(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION:
			return basicSetMNavigation(null, msgs);
		case CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT:
			return getMAuxillaryPowerUnit();
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION:
			return getMHydraulicGeneration();
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION:
			return getMHydraulicDistribution();
		case CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING:
			return getMAirConditioning();
		case CpacsPackage.MSYSTEMS_TYPE__MDE_ICING:
			return getMDeIcing();
		case CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION:
			return getMFireProtection();
		case CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS:
			return getMFlightControls();
		case CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL:
			return getMInstrumentPanel();
		case CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM:
			return getMAutomaticFlightSystem();
		case CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION:
			return getMCommunication();
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION:
			return getMElectricalGeneration();
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION:
			return getMElectricalDistribution();
		case CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS:
			return getMIntegratedModularAvionics();
		case CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS:
			return getMMillitarySystems();
		case CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION:
			return getMNavigation();
		case CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT:
			setMAuxillaryPowerUnit((MAuxillaryPowerUnitType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION:
			setMHydraulicGeneration((MHydraulicGenerationType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION:
			setMHydraulicDistribution((MHydraulicDistributionType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING:
			setMAirConditioning((MAirConditioningType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MDE_ICING:
			setMDeIcing((MDeIcingType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION:
			setMFireProtection((MFireProtectionType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS:
			setMFlightControls((MFlightControlsType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL:
			setMInstrumentPanel((MInstrumentPanelType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM:
			setMAutomaticFlightSystem((MAutomaticFlightSystemType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION:
			setMCommunication((MCommunicationType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION:
			setMElectricalGeneration((MElectricalGenerationType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION:
			setMElectricalDistribution((MElectricalDistributionType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS:
			setMIntegratedModularAvionics((MIntegratedModularAvionicsType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS:
			setMMillitarySystems((MMillitarySystemsType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION:
			setMNavigation((MNavigationType) newValue);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT:
			setMAuxillaryPowerUnit((MAuxillaryPowerUnitType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION:
			setMHydraulicGeneration((MHydraulicGenerationType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION:
			setMHydraulicDistribution((MHydraulicDistributionType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING:
			setMAirConditioning((MAirConditioningType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MDE_ICING:
			setMDeIcing((MDeIcingType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION:
			setMFireProtection((MFireProtectionType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS:
			setMFlightControls((MFlightControlsType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL:
			setMInstrumentPanel((MInstrumentPanelType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM:
			setMAutomaticFlightSystem((MAutomaticFlightSystemType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION:
			setMCommunication((MCommunicationType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION:
			setMElectricalGeneration((MElectricalGenerationType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION:
			setMElectricalDistribution((MElectricalDistributionType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS:
			setMIntegratedModularAvionics((MIntegratedModularAvionicsType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS:
			setMMillitarySystems((MMillitarySystemsType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION:
			setMNavigation((MNavigationType) null);
			return;
		case CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS:
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
		case CpacsPackage.MSYSTEMS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MSYSTEMS_TYPE__MAUXILLARY_POWER_UNIT:
			return mAuxillaryPowerUnit != null;
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_GENERATION:
			return mHydraulicGeneration != null;
		case CpacsPackage.MSYSTEMS_TYPE__MHYDRAULIC_DISTRIBUTION:
			return mHydraulicDistribution != null;
		case CpacsPackage.MSYSTEMS_TYPE__MAIR_CONDITIONING:
			return mAirConditioning != null;
		case CpacsPackage.MSYSTEMS_TYPE__MDE_ICING:
			return mDeIcing != null;
		case CpacsPackage.MSYSTEMS_TYPE__MFIRE_PROTECTION:
			return mFireProtection != null;
		case CpacsPackage.MSYSTEMS_TYPE__MFLIGHT_CONTROLS:
			return mFlightControls != null;
		case CpacsPackage.MSYSTEMS_TYPE__MINSTRUMENT_PANEL:
			return mInstrumentPanel != null;
		case CpacsPackage.MSYSTEMS_TYPE__MAUTOMATIC_FLIGHT_SYSTEM:
			return mAutomaticFlightSystem != null;
		case CpacsPackage.MSYSTEMS_TYPE__MCOMMUNICATION:
			return mCommunication != null;
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_GENERATION:
			return mElectricalGeneration != null;
		case CpacsPackage.MSYSTEMS_TYPE__MELECTRICAL_DISTRIBUTION:
			return mElectricalDistribution != null;
		case CpacsPackage.MSYSTEMS_TYPE__MINTEGRATED_MODULAR_AVIONICS:
			return mIntegratedModularAvionics != null;
		case CpacsPackage.MSYSTEMS_TYPE__MMILLITARY_SYSTEMS:
			return mMillitarySystems != null;
		case CpacsPackage.MSYSTEMS_TYPE__MNAVIGATION:
			return mNavigation != null;
		case CpacsPackage.MSYSTEMS_TYPE__MMISCELLANEOUS:
			return mMiscellaneous != null;
		}
		return super.eIsSet(featureID);
	}

} //MSystemsTypeImpl
