/**
 */
package Cpacs.impl;

import Cpacs.AirportCompatabilityGlobalType;
import Cpacs.CpacsPackage;
import Cpacs.RequirementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airport Compatability Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AirportCompatabilityGlobalTypeImpl#getWingSpan <em>Wing Span</em>}</li>
 *   <li>{@link Cpacs.impl.AirportCompatabilityGlobalTypeImpl#getWheelTrackWidth <em>Wheel Track Width</em>}</li>
 *   <li>{@link Cpacs.impl.AirportCompatabilityGlobalTypeImpl#getRunwayLoading <em>Runway Loading</em>}</li>
 *   <li>{@link Cpacs.impl.AirportCompatabilityGlobalTypeImpl#getTakeOffFieldLength <em>Take Off Field Length</em>}</li>
 *   <li>{@link Cpacs.impl.AirportCompatabilityGlobalTypeImpl#getLandingFieldLength <em>Landing Field Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirportCompatabilityGlobalTypeImpl extends ComplexBaseTypeImpl implements AirportCompatabilityGlobalType {
	/**
	 * The cached value of the '{@link #getWingSpan() <em>Wing Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingSpan()
	 * @generated
	 * @ordered
	 */
	protected RequirementType wingSpan;

	/**
	 * The cached value of the '{@link #getWheelTrackWidth() <em>Wheel Track Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheelTrackWidth()
	 * @generated
	 * @ordered
	 */
	protected RequirementType wheelTrackWidth;

	/**
	 * The cached value of the '{@link #getRunwayLoading() <em>Runway Loading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunwayLoading()
	 * @generated
	 * @ordered
	 */
	protected RequirementType runwayLoading;

	/**
	 * The cached value of the '{@link #getTakeOffFieldLength() <em>Take Off Field Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeOffFieldLength()
	 * @generated
	 * @ordered
	 */
	protected RequirementType takeOffFieldLength;

	/**
	 * The cached value of the '{@link #getLandingFieldLength() <em>Landing Field Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingFieldLength()
	 * @generated
	 * @ordered
	 */
	protected RequirementType landingFieldLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirportCompatabilityGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAirportCompatabilityGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getWingSpan() {
		return wingSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingSpan(RequirementType newWingSpan, NotificationChain msgs) {
		RequirementType oldWingSpan = wingSpan;
		wingSpan = newWingSpan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN, oldWingSpan, newWingSpan);
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
	public void setWingSpan(RequirementType newWingSpan) {
		if (newWingSpan != wingSpan) {
			NotificationChain msgs = null;
			if (wingSpan != null)
				msgs = ((InternalEObject) wingSpan).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN, null, msgs);
			if (newWingSpan != null)
				msgs = ((InternalEObject) newWingSpan).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN, null, msgs);
			msgs = basicSetWingSpan(newWingSpan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN, newWingSpan, newWingSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getWheelTrackWidth() {
		return wheelTrackWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWheelTrackWidth(RequirementType newWheelTrackWidth, NotificationChain msgs) {
		RequirementType oldWheelTrackWidth = wheelTrackWidth;
		wheelTrackWidth = newWheelTrackWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH, oldWheelTrackWidth,
					newWheelTrackWidth);
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
	public void setWheelTrackWidth(RequirementType newWheelTrackWidth) {
		if (newWheelTrackWidth != wheelTrackWidth) {
			NotificationChain msgs = null;
			if (wheelTrackWidth != null)
				msgs = ((InternalEObject) wheelTrackWidth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH,
						null, msgs);
			if (newWheelTrackWidth != null)
				msgs = ((InternalEObject) newWheelTrackWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH,
						null, msgs);
			msgs = basicSetWheelTrackWidth(newWheelTrackWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH, newWheelTrackWidth,
					newWheelTrackWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getRunwayLoading() {
		return runwayLoading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunwayLoading(RequirementType newRunwayLoading, NotificationChain msgs) {
		RequirementType oldRunwayLoading = runwayLoading;
		runwayLoading = newRunwayLoading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING, oldRunwayLoading, newRunwayLoading);
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
	public void setRunwayLoading(RequirementType newRunwayLoading) {
		if (newRunwayLoading != runwayLoading) {
			NotificationChain msgs = null;
			if (runwayLoading != null)
				msgs = ((InternalEObject) runwayLoading).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING, null,
						msgs);
			if (newRunwayLoading != null)
				msgs = ((InternalEObject) newRunwayLoading).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING, null,
						msgs);
			msgs = basicSetRunwayLoading(newRunwayLoading, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING, newRunwayLoading,
					newRunwayLoading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getTakeOffFieldLength() {
		return takeOffFieldLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTakeOffFieldLength(RequirementType newTakeOffFieldLength, NotificationChain msgs) {
		RequirementType oldTakeOffFieldLength = takeOffFieldLength;
		takeOffFieldLength = newTakeOffFieldLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH, oldTakeOffFieldLength,
					newTakeOffFieldLength);
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
	public void setTakeOffFieldLength(RequirementType newTakeOffFieldLength) {
		if (newTakeOffFieldLength != takeOffFieldLength) {
			NotificationChain msgs = null;
			if (takeOffFieldLength != null)
				msgs = ((InternalEObject) takeOffFieldLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH,
						null, msgs);
			if (newTakeOffFieldLength != null)
				msgs = ((InternalEObject) newTakeOffFieldLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH,
						null, msgs);
			msgs = basicSetTakeOffFieldLength(newTakeOffFieldLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH, newTakeOffFieldLength,
					newTakeOffFieldLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getLandingFieldLength() {
		return landingFieldLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingFieldLength(RequirementType newLandingFieldLength, NotificationChain msgs) {
		RequirementType oldLandingFieldLength = landingFieldLength;
		landingFieldLength = newLandingFieldLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH, oldLandingFieldLength,
					newLandingFieldLength);
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
	public void setLandingFieldLength(RequirementType newLandingFieldLength) {
		if (newLandingFieldLength != landingFieldLength) {
			NotificationChain msgs = null;
			if (landingFieldLength != null)
				msgs = ((InternalEObject) landingFieldLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH,
						null, msgs);
			if (newLandingFieldLength != null)
				msgs = ((InternalEObject) newLandingFieldLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH,
						null, msgs);
			msgs = basicSetLandingFieldLength(newLandingFieldLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH, newLandingFieldLength,
					newLandingFieldLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN:
			return basicSetWingSpan(null, msgs);
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH:
			return basicSetWheelTrackWidth(null, msgs);
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING:
			return basicSetRunwayLoading(null, msgs);
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH:
			return basicSetTakeOffFieldLength(null, msgs);
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH:
			return basicSetLandingFieldLength(null, msgs);
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
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN:
			return getWingSpan();
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH:
			return getWheelTrackWidth();
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING:
			return getRunwayLoading();
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH:
			return getTakeOffFieldLength();
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH:
			return getLandingFieldLength();
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
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN:
			setWingSpan((RequirementType) newValue);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH:
			setWheelTrackWidth((RequirementType) newValue);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING:
			setRunwayLoading((RequirementType) newValue);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH:
			setTakeOffFieldLength((RequirementType) newValue);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH:
			setLandingFieldLength((RequirementType) newValue);
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
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN:
			setWingSpan((RequirementType) null);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH:
			setWheelTrackWidth((RequirementType) null);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING:
			setRunwayLoading((RequirementType) null);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH:
			setTakeOffFieldLength((RequirementType) null);
			return;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH:
			setLandingFieldLength((RequirementType) null);
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
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WING_SPAN:
			return wingSpan != null;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__WHEEL_TRACK_WIDTH:
			return wheelTrackWidth != null;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__RUNWAY_LOADING:
			return runwayLoading != null;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__TAKE_OFF_FIELD_LENGTH:
			return takeOffFieldLength != null;
		case CpacsPackage.AIRPORT_COMPATABILITY_GLOBAL_TYPE__LANDING_FIELD_LENGTH:
			return landingFieldLength != null;
		}
		return super.eIsSet(featureID);
	}

} //AirportCompatabilityGlobalTypeImpl
