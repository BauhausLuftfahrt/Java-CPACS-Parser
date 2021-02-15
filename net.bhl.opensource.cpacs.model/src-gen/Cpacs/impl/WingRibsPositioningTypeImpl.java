/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurvePointType;
import Cpacs.DoubleBaseType;
import Cpacs.EtaXsiPointType;
import Cpacs.IntegerBaseType;
import Cpacs.RibCrossingBehaviourType1;
import Cpacs.RibRotationType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingRibsPositioningType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Ribs Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getStartEtaXsiPoint <em>Start Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getStartCurvePoint <em>Start Curve Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getStartSparPositionUID <em>Start Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getEndEtaXsiPoint <em>End Eta Xsi Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getEndCurvePoint <em>End Curve Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getEndSparPositionUID <em>End Spar Position UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getRibStart <em>Rib Start</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getRibEnd <em>Rib End</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getNumberOfRibs <em>Number Of Ribs</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getRibReference <em>Rib Reference</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getRibCrossingBehaviour <em>Rib Crossing Behaviour</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibsPositioningTypeImpl#getRibRotation <em>Rib Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingRibsPositioningTypeImpl extends ComplexBaseTypeImpl implements WingRibsPositioningType {
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
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType spacing;

	/**
	 * The cached value of the '{@link #getNumberOfRibs() <em>Number Of Ribs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRibs()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfRibs;

	/**
	 * The cached value of the '{@link #getRibReference() <em>Rib Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibReference()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType ribReference;

	/**
	 * The cached value of the '{@link #getRibCrossingBehaviour() <em>Rib Crossing Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibCrossingBehaviour()
	 * @generated
	 * @ordered
	 */
	protected RibCrossingBehaviourType1 ribCrossingBehaviour;

	/**
	 * The cached value of the '{@link #getRibRotation() <em>Rib Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibRotation()
	 * @generated
	 * @ordered
	 */
	protected RibRotationType ribRotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingRibsPositioningTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingRibsPositioningType();
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT, oldStartEtaXsiPoint,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT, null,
						msgs);
			if (newStartEtaXsiPoint != null)
				msgs = ((InternalEObject) newStartEtaXsiPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT, null,
						msgs);
			msgs = basicSetStartEtaXsiPoint(newStartEtaXsiPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT, newStartEtaXsiPoint,
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT, oldStartCurvePoint, newStartCurvePoint);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT, null,
						msgs);
			if (newStartCurvePoint != null)
				msgs = ((InternalEObject) newStartCurvePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT, null,
						msgs);
			msgs = basicSetStartCurvePoint(newStartCurvePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT, newStartCurvePoint,
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID, oldStartSparPositionUID,
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
				msgs = ((InternalEObject) startSparPositionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID, null,
						msgs);
			if (newStartSparPositionUID != null)
				msgs = ((InternalEObject) newStartSparPositionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID, null,
						msgs);
			msgs = basicSetStartSparPositionUID(newStartSparPositionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID, newStartSparPositionUID,
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT, oldEndEtaXsiPoint, newEndEtaXsiPoint);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT, null,
						msgs);
			if (newEndEtaXsiPoint != null)
				msgs = ((InternalEObject) newEndEtaXsiPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT, null,
						msgs);
			msgs = basicSetEndEtaXsiPoint(newEndEtaXsiPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT, newEndEtaXsiPoint, newEndEtaXsiPoint));
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT, oldEndCurvePoint, newEndCurvePoint);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT, null, msgs);
			if (newEndCurvePoint != null)
				msgs = ((InternalEObject) newEndCurvePoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT, null, msgs);
			msgs = basicSetEndCurvePoint(newEndCurvePoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT, newEndCurvePoint, newEndCurvePoint));
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID, oldEndSparPositionUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID, null,
						msgs);
			if (newEndSparPositionUID != null)
				msgs = ((InternalEObject) newEndSparPositionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID, null,
						msgs);
			msgs = basicSetEndSparPositionUID(newEndSparPositionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID, newEndSparPositionUID,
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START, oldRibStart, newRibStart);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START, null, msgs);
			if (newRibStart != null)
				msgs = ((InternalEObject) newRibStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START, null, msgs);
			msgs = basicSetRibStart(newRibStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START,
					newRibStart, newRibStart));
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
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END, oldRibEnd, newRibEnd);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END, null, msgs);
			if (newRibEnd != null)
				msgs = ((InternalEObject) newRibEnd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END, null, msgs);
			msgs = basicSetRibEnd(newRibEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END,
					newRibEnd, newRibEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpacing(DoubleBaseType newSpacing, NotificationChain msgs) {
		DoubleBaseType oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING, oldSpacing, newSpacing);
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
	public void setSpacing(DoubleBaseType newSpacing) {
		if (newSpacing != spacing) {
			NotificationChain msgs = null;
			if (spacing != null)
				msgs = ((InternalEObject) spacing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING, null, msgs);
			if (newSpacing != null)
				msgs = ((InternalEObject) newSpacing).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING, null, msgs);
			msgs = basicSetSpacing(newSpacing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING,
					newSpacing, newSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfRibs() {
		return numberOfRibs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfRibs(IntegerBaseType newNumberOfRibs, NotificationChain msgs) {
		IntegerBaseType oldNumberOfRibs = numberOfRibs;
		numberOfRibs = newNumberOfRibs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, oldNumberOfRibs, newNumberOfRibs);
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
	public void setNumberOfRibs(IntegerBaseType newNumberOfRibs) {
		if (newNumberOfRibs != numberOfRibs) {
			NotificationChain msgs = null;
			if (numberOfRibs != null)
				msgs = ((InternalEObject) numberOfRibs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, null, msgs);
			if (newNumberOfRibs != null)
				msgs = ((InternalEObject) newNumberOfRibs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, null, msgs);
			msgs = basicSetNumberOfRibs(newNumberOfRibs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS, newNumberOfRibs, newNumberOfRibs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getRibReference() {
		return ribReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibReference(StringBaseType newRibReference, NotificationChain msgs) {
		StringBaseType oldRibReference = ribReference;
		ribReference = newRibReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE, oldRibReference, newRibReference);
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
	public void setRibReference(StringBaseType newRibReference) {
		if (newRibReference != ribReference) {
			NotificationChain msgs = null;
			if (ribReference != null)
				msgs = ((InternalEObject) ribReference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE, null, msgs);
			if (newRibReference != null)
				msgs = ((InternalEObject) newRibReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE, null, msgs);
			msgs = basicSetRibReference(newRibReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE, newRibReference, newRibReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibCrossingBehaviourType1 getRibCrossingBehaviour() {
		return ribCrossingBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibCrossingBehaviour(RibCrossingBehaviourType1 newRibCrossingBehaviour,
			NotificationChain msgs) {
		RibCrossingBehaviourType1 oldRibCrossingBehaviour = ribCrossingBehaviour;
		ribCrossingBehaviour = newRibCrossingBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, oldRibCrossingBehaviour,
					newRibCrossingBehaviour);
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
	public void setRibCrossingBehaviour(RibCrossingBehaviourType1 newRibCrossingBehaviour) {
		if (newRibCrossingBehaviour != ribCrossingBehaviour) {
			NotificationChain msgs = null;
			if (ribCrossingBehaviour != null)
				msgs = ((InternalEObject) ribCrossingBehaviour).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, null,
						msgs);
			if (newRibCrossingBehaviour != null)
				msgs = ((InternalEObject) newRibCrossingBehaviour).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, null,
						msgs);
			msgs = basicSetRibCrossingBehaviour(newRibCrossingBehaviour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR, newRibCrossingBehaviour,
					newRibCrossingBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RibRotationType getRibRotation() {
		return ribRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibRotation(RibRotationType newRibRotation, NotificationChain msgs) {
		RibRotationType oldRibRotation = ribRotation;
		ribRotation = newRibRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION, oldRibRotation, newRibRotation);
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
	public void setRibRotation(RibRotationType newRibRotation) {
		if (newRibRotation != ribRotation) {
			NotificationChain msgs = null;
			if (ribRotation != null)
				msgs = ((InternalEObject) ribRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION, null, msgs);
			if (newRibRotation != null)
				msgs = ((InternalEObject) newRibRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION, null, msgs);
			msgs = basicSetRibRotation(newRibRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION,
					newRibRotation, newRibRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT:
			return basicSetStartEtaXsiPoint(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT:
			return basicSetStartCurvePoint(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			return basicSetStartSparPositionUID(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT:
			return basicSetEndEtaXsiPoint(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT:
			return basicSetEndCurvePoint(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			return basicSetEndSparPositionUID(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START:
			return basicSetRibStart(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END:
			return basicSetRibEnd(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING:
			return basicSetSpacing(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			return basicSetNumberOfRibs(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE:
			return basicSetRibReference(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			return basicSetRibCrossingBehaviour(null, msgs);
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			return basicSetRibRotation(null, msgs);
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
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT:
			return getStartEtaXsiPoint();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT:
			return getStartCurvePoint();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			return getStartSparPositionUID();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT:
			return getEndEtaXsiPoint();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT:
			return getEndCurvePoint();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			return getEndSparPositionUID();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START:
			return getRibStart();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END:
			return getRibEnd();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING:
			return getSpacing();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			return getNumberOfRibs();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE:
			return getRibReference();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			return getRibCrossingBehaviour();
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			return getRibRotation();
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
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT:
			setStartEtaXsiPoint((EtaXsiPointType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT:
			setStartCurvePoint((CurvePointType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			setStartSparPositionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT:
			setEndEtaXsiPoint((EtaXsiPointType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT:
			setEndCurvePoint((CurvePointType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			setEndSparPositionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START:
			setRibStart((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END:
			setRibEnd((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING:
			setSpacing((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			setNumberOfRibs((IntegerBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE:
			setRibReference((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			setRibCrossingBehaviour((RibCrossingBehaviourType1) newValue);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			setRibRotation((RibRotationType) newValue);
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
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT:
			setStartEtaXsiPoint((EtaXsiPointType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT:
			setStartCurvePoint((CurvePointType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			setStartSparPositionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT:
			setEndEtaXsiPoint((EtaXsiPointType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT:
			setEndCurvePoint((CurvePointType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			setEndSparPositionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START:
			setRibStart((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END:
			setRibEnd((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING:
			setSpacing((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			setNumberOfRibs((IntegerBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE:
			setRibReference((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			setRibCrossingBehaviour((RibCrossingBehaviourType1) null);
			return;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			setRibRotation((RibRotationType) null);
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
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_ETA_XSI_POINT:
			return startEtaXsiPoint != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_CURVE_POINT:
			return startCurvePoint != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__START_SPAR_POSITION_UID:
			return startSparPositionUID != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_ETA_XSI_POINT:
			return endEtaXsiPoint != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_CURVE_POINT:
			return endCurvePoint != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__END_SPAR_POSITION_UID:
			return endSparPositionUID != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_START:
			return ribStart != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_END:
			return ribEnd != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__SPACING:
			return spacing != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__NUMBER_OF_RIBS:
			return numberOfRibs != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_REFERENCE:
			return ribReference != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_CROSSING_BEHAVIOUR:
			return ribCrossingBehaviour != null;
		case CpacsPackage.WING_RIBS_POSITIONING_TYPE__RIB_ROTATION:
			return ribRotation != null;
		}
		return super.eIsSet(featureID);
	}

} //WingRibsPositioningTypeImpl
