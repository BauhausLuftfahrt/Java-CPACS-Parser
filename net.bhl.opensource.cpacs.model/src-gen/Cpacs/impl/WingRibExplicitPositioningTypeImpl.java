/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurvePointType;
import Cpacs.EtaXsiPointType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingRibExplicitPositioningType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Rib Explicit Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getStartEtaXsiPoint <em>Start Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getStartCurvePoint <em>Start Curve Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getStartSparPositionUID <em>Start Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getEndEtaXsiPoint <em>End Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getEndCurvePoint <em>End Curve Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getEndSparPositionUID <em>End Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getRibStart <em>Rib Start</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibExplicitPositioningTypeImpl#getRibEnd <em>Rib End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingRibExplicitPositioningTypeImpl extends ComplexBaseTypeImpl implements WingRibExplicitPositioningType {
	/**
	 * The cached value of the '{@link #getStartEtaXsiPoint() <em>Start Eta Xsi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartEtaXsiPoint()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiPointType startEtaXsiPoint;

	/**
	 * The cached value of the '{@link #getStartCurvePoint() <em>Start Curve Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCurvePoint()
	 * @generated
	 * @ordered
	 */
	protected CurvePointType startCurvePoint;

	/**
	 * The cached value of the '{@link #getStartSparPositionUID() <em>Start Spar Position UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSparPositionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startSparPositionUID;

	/**
	 * The cached value of the '{@link #getEndEtaXsiPoint() <em>End Eta Xsi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndEtaXsiPoint()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiPointType endEtaXsiPoint;

	/**
	 * The cached value of the '{@link #getEndCurvePoint() <em>End Curve Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCurvePoint()
	 * @generated
	 * @ordered
	 */
	protected CurvePointType endCurvePoint;

	/**
	 * The cached value of the '{@link #getEndSparPositionUID() <em>End Spar Position UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSparPositionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endSparPositionUID;

	/**
	 * The cached value of the '{@link #getRibStart() <em>Rib Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibStart()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType ribStart;

	/**
	 * The cached value of the '{@link #getRibEnd() <em>Rib End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibEnd()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType ribEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingRibExplicitPositioningTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingRibExplicitPositioningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiPointType getStartEtaXsiPoint() {
		return startEtaXsiPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartEtaXsiPoint(EtaXsiPointType newStartEtaXsiPoint, NotificationChain msgs) {
		EtaXsiPointType oldStartEtaXsiPoint = startEtaXsiPoint;
		startEtaXsiPoint = newStartEtaXsiPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT, oldStartEtaXsiPoint,
					newStartEtaXsiPoint);
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
	public void setStartEtaXsiPoint(EtaXsiPointType newStartEtaXsiPoint) {
		if (newStartEtaXsiPoint != startEtaXsiPoint) {
			NotificationChain msgs = null;
			if (startEtaXsiPoint != null)
				msgs = ((InternalEObject) startEtaXsiPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT,
						null, msgs);
			if (newStartEtaXsiPoint != null)
				msgs = ((InternalEObject) newStartEtaXsiPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT,
						null, msgs);
			msgs = basicSetStartEtaXsiPoint(newStartEtaXsiPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT, newStartEtaXsiPoint,
					newStartEtaXsiPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePointType getStartCurvePoint() {
		return startCurvePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCurvePoint(CurvePointType newStartCurvePoint, NotificationChain msgs) {
		CurvePointType oldStartCurvePoint = startCurvePoint;
		startCurvePoint = newStartCurvePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT, oldStartCurvePoint,
					newStartCurvePoint);
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
	public void setStartCurvePoint(CurvePointType newStartCurvePoint) {
		if (newStartCurvePoint != startCurvePoint) {
			NotificationChain msgs = null;
			if (startCurvePoint != null)
				msgs = ((InternalEObject) startCurvePoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT,
						null, msgs);
			if (newStartCurvePoint != null)
				msgs = ((InternalEObject) newStartCurvePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT,
						null, msgs);
			msgs = basicSetStartCurvePoint(newStartCurvePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT, newStartCurvePoint,
					newStartCurvePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartSparPositionUID() {
		return startSparPositionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSparPositionUID(StringUIDBaseType newStartSparPositionUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStartSparPositionUID = startSparPositionUID;
		startSparPositionUID = newStartSparPositionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID, oldStartSparPositionUID,
					newStartSparPositionUID);
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
	public void setStartSparPositionUID(StringUIDBaseType newStartSparPositionUID) {
		if (newStartSparPositionUID != startSparPositionUID) {
			NotificationChain msgs = null;
			if (startSparPositionUID != null)
				msgs = ((InternalEObject) startSparPositionUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID, null, msgs);
			if (newStartSparPositionUID != null)
				msgs = ((InternalEObject) newStartSparPositionUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID, null, msgs);
			msgs = basicSetStartSparPositionUID(newStartSparPositionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID, newStartSparPositionUID,
					newStartSparPositionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiPointType getEndEtaXsiPoint() {
		return endEtaXsiPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndEtaXsiPoint(EtaXsiPointType newEndEtaXsiPoint, NotificationChain msgs) {
		EtaXsiPointType oldEndEtaXsiPoint = endEtaXsiPoint;
		endEtaXsiPoint = newEndEtaXsiPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT, oldEndEtaXsiPoint,
					newEndEtaXsiPoint);
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
	public void setEndEtaXsiPoint(EtaXsiPointType newEndEtaXsiPoint) {
		if (newEndEtaXsiPoint != endEtaXsiPoint) {
			NotificationChain msgs = null;
			if (endEtaXsiPoint != null)
				msgs = ((InternalEObject) endEtaXsiPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT,
						null, msgs);
			if (newEndEtaXsiPoint != null)
				msgs = ((InternalEObject) newEndEtaXsiPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT,
						null, msgs);
			msgs = basicSetEndEtaXsiPoint(newEndEtaXsiPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT, newEndEtaXsiPoint,
					newEndEtaXsiPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePointType getEndCurvePoint() {
		return endCurvePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndCurvePoint(CurvePointType newEndCurvePoint, NotificationChain msgs) {
		CurvePointType oldEndCurvePoint = endCurvePoint;
		endCurvePoint = newEndCurvePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT, oldEndCurvePoint,
					newEndCurvePoint);
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
	public void setEndCurvePoint(CurvePointType newEndCurvePoint) {
		if (newEndCurvePoint != endCurvePoint) {
			NotificationChain msgs = null;
			if (endCurvePoint != null)
				msgs = ((InternalEObject) endCurvePoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT, null,
						msgs);
			if (newEndCurvePoint != null)
				msgs = ((InternalEObject) newEndCurvePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT, null,
						msgs);
			msgs = basicSetEndCurvePoint(newEndCurvePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT, newEndCurvePoint,
					newEndCurvePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndSparPositionUID() {
		return endSparPositionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndSparPositionUID(StringUIDBaseType newEndSparPositionUID,
			NotificationChain msgs) {
		StringUIDBaseType oldEndSparPositionUID = endSparPositionUID;
		endSparPositionUID = newEndSparPositionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID, oldEndSparPositionUID,
					newEndSparPositionUID);
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
	public void setEndSparPositionUID(StringUIDBaseType newEndSparPositionUID) {
		if (newEndSparPositionUID != endSparPositionUID) {
			NotificationChain msgs = null;
			if (endSparPositionUID != null)
				msgs = ((InternalEObject) endSparPositionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID,
						null, msgs);
			if (newEndSparPositionUID != null)
				msgs = ((InternalEObject) newEndSparPositionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID,
						null, msgs);
			msgs = basicSetEndSparPositionUID(newEndSparPositionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID, newEndSparPositionUID,
					newEndSparPositionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getRibStart() {
		return ribStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibStart(StringBaseType newRibStart, NotificationChain msgs) {
		StringBaseType oldRibStart = ribStart;
		ribStart = newRibStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START, oldRibStart, newRibStart);
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
	public void setRibStart(StringBaseType newRibStart) {
		if (newRibStart != ribStart) {
			NotificationChain msgs = null;
			if (ribStart != null)
				msgs = ((InternalEObject) ribStart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START, null,
						msgs);
			if (newRibStart != null)
				msgs = ((InternalEObject) newRibStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START, null,
						msgs);
			msgs = basicSetRibStart(newRibStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START, newRibStart, newRibStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getRibEnd() {
		return ribEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibEnd(StringBaseType newRibEnd, NotificationChain msgs) {
		StringBaseType oldRibEnd = ribEnd;
		ribEnd = newRibEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END, oldRibEnd, newRibEnd);
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
	public void setRibEnd(StringBaseType newRibEnd) {
		if (newRibEnd != ribEnd) {
			NotificationChain msgs = null;
			if (ribEnd != null)
				msgs = ((InternalEObject) ribEnd).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END, null, msgs);
			if (newRibEnd != null)
				msgs = ((InternalEObject) newRibEnd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END, null, msgs);
			msgs = basicSetRibEnd(newRibEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END, newRibEnd, newRibEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT:
			return basicSetStartEtaXsiPoint(null, msgs);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT:
			return basicSetStartCurvePoint(null, msgs);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			return basicSetStartSparPositionUID(null, msgs);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT:
			return basicSetEndEtaXsiPoint(null, msgs);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT:
			return basicSetEndCurvePoint(null, msgs);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			return basicSetEndSparPositionUID(null, msgs);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START:
			return basicSetRibStart(null, msgs);
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END:
			return basicSetRibEnd(null, msgs);
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
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT:
			return getStartEtaXsiPoint();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT:
			return getStartCurvePoint();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			return getStartSparPositionUID();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT:
			return getEndEtaXsiPoint();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT:
			return getEndCurvePoint();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			return getEndSparPositionUID();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START:
			return getRibStart();
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END:
			return getRibEnd();
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
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT:
			setStartEtaXsiPoint((EtaXsiPointType) newValue);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT:
			setStartCurvePoint((CurvePointType) newValue);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			setStartSparPositionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT:
			setEndEtaXsiPoint((EtaXsiPointType) newValue);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT:
			setEndCurvePoint((CurvePointType) newValue);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			setEndSparPositionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START:
			setRibStart((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END:
			setRibEnd((StringBaseType) newValue);
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
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT:
			setStartEtaXsiPoint((EtaXsiPointType) null);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT:
			setStartCurvePoint((CurvePointType) null);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			setStartSparPositionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT:
			setEndEtaXsiPoint((EtaXsiPointType) null);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT:
			setEndCurvePoint((CurvePointType) null);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			setEndSparPositionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START:
			setRibStart((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END:
			setRibEnd((StringBaseType) null);
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
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_ETA_XSI_POINT:
			return startEtaXsiPoint != null;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_CURVE_POINT:
			return startCurvePoint != null;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			return startSparPositionUID != null;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_ETA_XSI_POINT:
			return endEtaXsiPoint != null;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_CURVE_POINT:
			return endCurvePoint != null;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			return endSparPositionUID != null;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_START:
			return ribStart != null;
		case CpacsPackage.WING_RIB_EXPLICIT_POSITIONING_TYPE__RIB_END:
			return ribEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //WingRibExplicitPositioningTypeImpl
