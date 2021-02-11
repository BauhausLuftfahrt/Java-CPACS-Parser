/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RunwayILSType;
import Cpacs.RunwayType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runway Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getThresholdNorth <em>Threshold North</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getThresholdEast <em>Threshold East</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getThresholdElevation <em>Threshold Elevation</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getTORA <em>TORA</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getLDA <em>LDA</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getILS <em>ILS</em>}</li>
 *   <li>{@link Cpacs.impl.RunwayTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunwayTypeImpl extends ComplexBaseTypeImpl implements RunwayType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getThresholdNorth() <em>Threshold North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdNorth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thresholdNorth;

	/**
	 * The cached value of the '{@link #getThresholdEast() <em>Threshold East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdEast()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thresholdEast;

	/**
	 * The cached value of the '{@link #getThresholdElevation() <em>Threshold Elevation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdElevation()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thresholdElevation;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType heading;

	/**
	 * The cached value of the '{@link #getTORA() <em>TORA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTORA()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tORA;

	/**
	 * The cached value of the '{@link #getLDA() <em>LDA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDA()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType lDA;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType conditions;

	/**
	 * The cached value of the '{@link #getILS() <em>ILS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getILS()
	 * @generated
	 * @ordered
	 */
	protected RunwayILSType iLS;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunwayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRunwayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThresholdNorth() {
		return thresholdNorth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThresholdNorth(DoubleBaseType newThresholdNorth, NotificationChain msgs) {
		DoubleBaseType oldThresholdNorth = thresholdNorth;
		thresholdNorth = newThresholdNorth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH, oldThresholdNorth, newThresholdNorth);
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
	public void setThresholdNorth(DoubleBaseType newThresholdNorth) {
		if (newThresholdNorth != thresholdNorth) {
			NotificationChain msgs = null;
			if (thresholdNorth != null)
				msgs = ((InternalEObject) thresholdNorth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH, null, msgs);
			if (newThresholdNorth != null)
				msgs = ((InternalEObject) newThresholdNorth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH, null, msgs);
			msgs = basicSetThresholdNorth(newThresholdNorth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH,
					newThresholdNorth, newThresholdNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThresholdEast() {
		return thresholdEast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThresholdEast(DoubleBaseType newThresholdEast, NotificationChain msgs) {
		DoubleBaseType oldThresholdEast = thresholdEast;
		thresholdEast = newThresholdEast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST, oldThresholdEast, newThresholdEast);
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
	public void setThresholdEast(DoubleBaseType newThresholdEast) {
		if (newThresholdEast != thresholdEast) {
			NotificationChain msgs = null;
			if (thresholdEast != null)
				msgs = ((InternalEObject) thresholdEast).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST, null, msgs);
			if (newThresholdEast != null)
				msgs = ((InternalEObject) newThresholdEast).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST, null, msgs);
			msgs = basicSetThresholdEast(newThresholdEast, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST,
					newThresholdEast, newThresholdEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThresholdElevation() {
		return thresholdElevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThresholdElevation(DoubleBaseType newThresholdElevation, NotificationChain msgs) {
		DoubleBaseType oldThresholdElevation = thresholdElevation;
		thresholdElevation = newThresholdElevation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION, oldThresholdElevation, newThresholdElevation);
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
	public void setThresholdElevation(DoubleBaseType newThresholdElevation) {
		if (newThresholdElevation != thresholdElevation) {
			NotificationChain msgs = null;
			if (thresholdElevation != null)
				msgs = ((InternalEObject) thresholdElevation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION, null, msgs);
			if (newThresholdElevation != null)
				msgs = ((InternalEObject) newThresholdElevation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION, null, msgs);
			msgs = basicSetThresholdElevation(newThresholdElevation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION,
					newThresholdElevation, newThresholdElevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeading(DoubleBaseType newHeading, NotificationChain msgs) {
		DoubleBaseType oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__HEADING, oldHeading, newHeading);
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
	public void setHeading(DoubleBaseType newHeading) {
		if (newHeading != heading) {
			NotificationChain msgs = null;
			if (heading != null)
				msgs = ((InternalEObject) heading).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__HEADING, null, msgs);
			if (newHeading != null)
				msgs = ((InternalEObject) newHeading).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__HEADING, null, msgs);
			msgs = basicSetHeading(newHeading, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__HEADING, newHeading,
					newHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTORA() {
		return tORA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTORA(DoubleBaseType newTORA, NotificationChain msgs) {
		DoubleBaseType oldTORA = tORA;
		tORA = newTORA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__TORA, oldTORA, newTORA);
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
	public void setTORA(DoubleBaseType newTORA) {
		if (newTORA != tORA) {
			NotificationChain msgs = null;
			if (tORA != null)
				msgs = ((InternalEObject) tORA).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__TORA, null, msgs);
			if (newTORA != null)
				msgs = ((InternalEObject) newTORA).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__TORA, null, msgs);
			msgs = basicSetTORA(newTORA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__TORA, newTORA, newTORA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLDA() {
		return lDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDA(DoubleBaseType newLDA, NotificationChain msgs) {
		DoubleBaseType oldLDA = lDA;
		lDA = newLDA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__LDA, oldLDA, newLDA);
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
	public void setLDA(DoubleBaseType newLDA) {
		if (newLDA != lDA) {
			NotificationChain msgs = null;
			if (lDA != null)
				msgs = ((InternalEObject) lDA).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__LDA, null, msgs);
			if (newLDA != null)
				msgs = ((InternalEObject) newLDA).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__LDA, null, msgs);
			msgs = basicSetLDA(newLDA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__LDA, newLDA, newLDA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditions(DoubleBaseType newConditions, NotificationChain msgs) {
		DoubleBaseType oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__CONDITIONS, oldConditions, newConditions);
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
	public void setConditions(DoubleBaseType newConditions) {
		if (newConditions != conditions) {
			NotificationChain msgs = null;
			if (conditions != null)
				msgs = ((InternalEObject) conditions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__CONDITIONS, null, msgs);
			if (newConditions != null)
				msgs = ((InternalEObject) newConditions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__CONDITIONS, null, msgs);
			msgs = basicSetConditions(newConditions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__CONDITIONS, newConditions,
					newConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunwayILSType getILS() {
		return iLS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetILS(RunwayILSType newILS, NotificationChain msgs) {
		RunwayILSType oldILS = iLS;
		iLS = newILS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RUNWAY_TYPE__ILS, oldILS, newILS);
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
	public void setILS(RunwayILSType newILS) {
		if (newILS != iLS) {
			NotificationChain msgs = null;
			if (iLS != null)
				msgs = ((InternalEObject) iLS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__ILS, null, msgs);
			if (newILS != null)
				msgs = ((InternalEObject) newILS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RUNWAY_TYPE__ILS, null, msgs);
			msgs = basicSetILS(newILS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__ILS, newILS, newILS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RUNWAY_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RUNWAY_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH:
			return basicSetThresholdNorth(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST:
			return basicSetThresholdEast(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION:
			return basicSetThresholdElevation(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__HEADING:
			return basicSetHeading(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__TORA:
			return basicSetTORA(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__LDA:
			return basicSetLDA(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__CONDITIONS:
			return basicSetConditions(null, msgs);
		case CpacsPackage.RUNWAY_TYPE__ILS:
			return basicSetILS(null, msgs);
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
		case CpacsPackage.RUNWAY_TYPE__NAME:
			return getName();
		case CpacsPackage.RUNWAY_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH:
			return getThresholdNorth();
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST:
			return getThresholdEast();
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION:
			return getThresholdElevation();
		case CpacsPackage.RUNWAY_TYPE__HEADING:
			return getHeading();
		case CpacsPackage.RUNWAY_TYPE__TORA:
			return getTORA();
		case CpacsPackage.RUNWAY_TYPE__LDA:
			return getLDA();
		case CpacsPackage.RUNWAY_TYPE__CONDITIONS:
			return getConditions();
		case CpacsPackage.RUNWAY_TYPE__ILS:
			return getILS();
		case CpacsPackage.RUNWAY_TYPE__UID:
			return getUID();
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
		case CpacsPackage.RUNWAY_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH:
			setThresholdNorth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST:
			setThresholdEast((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION:
			setThresholdElevation((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__HEADING:
			setHeading((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__TORA:
			setTORA((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__LDA:
			setLDA((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__CONDITIONS:
			setConditions((DoubleBaseType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__ILS:
			setILS((RunwayILSType) newValue);
			return;
		case CpacsPackage.RUNWAY_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.RUNWAY_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH:
			setThresholdNorth((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST:
			setThresholdEast((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION:
			setThresholdElevation((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__HEADING:
			setHeading((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__TORA:
			setTORA((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__LDA:
			setLDA((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__CONDITIONS:
			setConditions((DoubleBaseType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__ILS:
			setILS((RunwayILSType) null);
			return;
		case CpacsPackage.RUNWAY_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.RUNWAY_TYPE__NAME:
			return name != null;
		case CpacsPackage.RUNWAY_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_NORTH:
			return thresholdNorth != null;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_EAST:
			return thresholdEast != null;
		case CpacsPackage.RUNWAY_TYPE__THRESHOLD_ELEVATION:
			return thresholdElevation != null;
		case CpacsPackage.RUNWAY_TYPE__HEADING:
			return heading != null;
		case CpacsPackage.RUNWAY_TYPE__TORA:
			return tORA != null;
		case CpacsPackage.RUNWAY_TYPE__LDA:
			return lDA != null;
		case CpacsPackage.RUNWAY_TYPE__CONDITIONS:
			return conditions != null;
		case CpacsPackage.RUNWAY_TYPE__ILS:
			return iLS != null;
		case CpacsPackage.RUNWAY_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //RunwayTypeImpl
