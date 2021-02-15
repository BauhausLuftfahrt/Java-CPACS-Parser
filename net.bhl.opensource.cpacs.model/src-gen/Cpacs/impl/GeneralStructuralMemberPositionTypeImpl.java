/**
 */
package Cpacs.impl;

import Cpacs.AlignmentStringFrameType;
import Cpacs.ContinuityType1;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.GeneralStructuralMemberPositionType;
import Cpacs.InterpolationType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Structural Member Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXUidStart <em>Position XUid Start</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXUidEnd <em>Position XUid End</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXUidMin <em>Position XUid Min</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXUidMid <em>Position XUid Mid</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXUidMax <em>Position XUid Max</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXAngle <em>Position XAngle</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXFact <em>Position XFact</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getPositionXoffset <em>Position Xoffset</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getInterpolation <em>Interpolation</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralStructuralMemberPositionTypeImpl extends ComplexBaseTypeImpl
		implements GeneralStructuralMemberPositionType {
	/**
	 * The cached value of the '{@link #getStructuralElementUID() <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementUID;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionX;

	/**
	 * The cached value of the '{@link #getPositionXUidStart() <em>Position XUid Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUidStart()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType positionXUidStart;

	/**
	 * The cached value of the '{@link #getPositionXUidEnd() <em>Position XUid End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUidEnd()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType positionXUidEnd;

	/**
	 * The cached value of the '{@link #getPositionXUidMin() <em>Position XUid Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUidMin()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType positionXUidMin;

	/**
	 * The cached value of the '{@link #getPositionXUidMid() <em>Position XUid Mid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUidMid()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType positionXUidMid;

	/**
	 * The cached value of the '{@link #getPositionXUidMax() <em>Position XUid Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXUidMax()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType positionXUidMax;

	/**
	 * The cached value of the '{@link #getPositionXAngle() <em>Position XAngle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionXAngle;

	/**
	 * The cached value of the '{@link #getPositionXFact() <em>Position XFact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXFact()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionXFact;

	/**
	 * The cached value of the '{@link #getPositionXoffset() <em>Position Xoffset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXoffset()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionXoffset;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentStringFrameType alignment;

	/**
	 * The cached value of the '{@link #getContinuity() <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuity()
	 * @generated
	 * @ordered
	 */
	protected ContinuityType1 continuity;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected InterpolationType interpolation;

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
	protected GeneralStructuralMemberPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGeneralStructuralMemberPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralElementUID() {
		return structuralElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElementUID(StringUIDBaseType newStructuralElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralElementUID = structuralElementUID;
		structuralElementUID = newStructuralElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
					oldStructuralElementUID, newStructuralElementUID);
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
	public void setStructuralElementUID(StringUIDBaseType newStructuralElementUID) {
		if (newStructuralElementUID != structuralElementUID) {
			NotificationChain msgs = null;
			if (structuralElementUID != null)
				msgs = ((InternalEObject) structuralElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID,
					newStructuralElementUID, newStructuralElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionX(DoubleBaseType newPositionX, NotificationChain msgs) {
		DoubleBaseType oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X, oldPositionX, newPositionX);
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
	public void setPositionX(DoubleBaseType newPositionX) {
		if (newPositionX != positionX) {
			NotificationChain msgs = null;
			if (positionX != null)
				msgs = ((InternalEObject) positionX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X, null,
						msgs);
			if (newPositionX != null)
				msgs = ((InternalEObject) newPositionX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X, null,
						msgs);
			msgs = basicSetPositionX(newPositionX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X, newPositionX, newPositionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPositionXUidStart() {
		return positionXUidStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXUidStart(StringUIDBaseType newPositionXUidStart, NotificationChain msgs) {
		StringUIDBaseType oldPositionXUidStart = positionXUidStart;
		positionXUidStart = newPositionXUidStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START, oldPositionXUidStart,
					newPositionXUidStart);
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
	public void setPositionXUidStart(StringUIDBaseType newPositionXUidStart) {
		if (newPositionXUidStart != positionXUidStart) {
			NotificationChain msgs = null;
			if (positionXUidStart != null)
				msgs = ((InternalEObject) positionXUidStart).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START,
						null, msgs);
			if (newPositionXUidStart != null)
				msgs = ((InternalEObject) newPositionXUidStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START,
						null, msgs);
			msgs = basicSetPositionXUidStart(newPositionXUidStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START, newPositionXUidStart,
					newPositionXUidStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPositionXUidEnd() {
		return positionXUidEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXUidEnd(StringUIDBaseType newPositionXUidEnd, NotificationChain msgs) {
		StringUIDBaseType oldPositionXUidEnd = positionXUidEnd;
		positionXUidEnd = newPositionXUidEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END, oldPositionXUidEnd,
					newPositionXUidEnd);
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
	public void setPositionXUidEnd(StringUIDBaseType newPositionXUidEnd) {
		if (newPositionXUidEnd != positionXUidEnd) {
			NotificationChain msgs = null;
			if (positionXUidEnd != null)
				msgs = ((InternalEObject) positionXUidEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END, null, msgs);
			if (newPositionXUidEnd != null)
				msgs = ((InternalEObject) newPositionXUidEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END, null, msgs);
			msgs = basicSetPositionXUidEnd(newPositionXUidEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END, newPositionXUidEnd,
					newPositionXUidEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPositionXUidMin() {
		return positionXUidMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXUidMin(StringUIDBaseType newPositionXUidMin, NotificationChain msgs) {
		StringUIDBaseType oldPositionXUidMin = positionXUidMin;
		positionXUidMin = newPositionXUidMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN, oldPositionXUidMin,
					newPositionXUidMin);
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
	public void setPositionXUidMin(StringUIDBaseType newPositionXUidMin) {
		if (newPositionXUidMin != positionXUidMin) {
			NotificationChain msgs = null;
			if (positionXUidMin != null)
				msgs = ((InternalEObject) positionXUidMin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN, null, msgs);
			if (newPositionXUidMin != null)
				msgs = ((InternalEObject) newPositionXUidMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN, null, msgs);
			msgs = basicSetPositionXUidMin(newPositionXUidMin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN, newPositionXUidMin,
					newPositionXUidMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPositionXUidMid() {
		return positionXUidMid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXUidMid(StringUIDBaseType newPositionXUidMid, NotificationChain msgs) {
		StringUIDBaseType oldPositionXUidMid = positionXUidMid;
		positionXUidMid = newPositionXUidMid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID, oldPositionXUidMid,
					newPositionXUidMid);
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
	public void setPositionXUidMid(StringUIDBaseType newPositionXUidMid) {
		if (newPositionXUidMid != positionXUidMid) {
			NotificationChain msgs = null;
			if (positionXUidMid != null)
				msgs = ((InternalEObject) positionXUidMid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID, null, msgs);
			if (newPositionXUidMid != null)
				msgs = ((InternalEObject) newPositionXUidMid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID, null, msgs);
			msgs = basicSetPositionXUidMid(newPositionXUidMid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID, newPositionXUidMid,
					newPositionXUidMid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPositionXUidMax() {
		return positionXUidMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXUidMax(StringUIDBaseType newPositionXUidMax, NotificationChain msgs) {
		StringUIDBaseType oldPositionXUidMax = positionXUidMax;
		positionXUidMax = newPositionXUidMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX, oldPositionXUidMax,
					newPositionXUidMax);
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
	public void setPositionXUidMax(StringUIDBaseType newPositionXUidMax) {
		if (newPositionXUidMax != positionXUidMax) {
			NotificationChain msgs = null;
			if (positionXUidMax != null)
				msgs = ((InternalEObject) positionXUidMax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX, null, msgs);
			if (newPositionXUidMax != null)
				msgs = ((InternalEObject) newPositionXUidMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX, null, msgs);
			msgs = basicSetPositionXUidMax(newPositionXUidMax, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX, newPositionXUidMax,
					newPositionXUidMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionXAngle() {
		return positionXAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXAngle(DoubleBaseType newPositionXAngle, NotificationChain msgs) {
		DoubleBaseType oldPositionXAngle = positionXAngle;
		positionXAngle = newPositionXAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE, oldPositionXAngle,
					newPositionXAngle);
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
	public void setPositionXAngle(DoubleBaseType newPositionXAngle) {
		if (newPositionXAngle != positionXAngle) {
			NotificationChain msgs = null;
			if (positionXAngle != null)
				msgs = ((InternalEObject) positionXAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE,
						null, msgs);
			if (newPositionXAngle != null)
				msgs = ((InternalEObject) newPositionXAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE,
						null, msgs);
			msgs = basicSetPositionXAngle(newPositionXAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE, newPositionXAngle,
					newPositionXAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionXFact() {
		return positionXFact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXFact(DoubleBaseType newPositionXFact, NotificationChain msgs) {
		DoubleBaseType oldPositionXFact = positionXFact;
		positionXFact = newPositionXFact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT, oldPositionXFact,
					newPositionXFact);
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
	public void setPositionXFact(DoubleBaseType newPositionXFact) {
		if (newPositionXFact != positionXFact) {
			NotificationChain msgs = null;
			if (positionXFact != null)
				msgs = ((InternalEObject) positionXFact).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT,
						null, msgs);
			if (newPositionXFact != null)
				msgs = ((InternalEObject) newPositionXFact).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT,
						null, msgs);
			msgs = basicSetPositionXFact(newPositionXFact, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT, newPositionXFact,
					newPositionXFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionXoffset() {
		return positionXoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXoffset(DoubleBaseType newPositionXoffset, NotificationChain msgs) {
		DoubleBaseType oldPositionXoffset = positionXoffset;
		positionXoffset = newPositionXoffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET, oldPositionXoffset,
					newPositionXoffset);
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
	public void setPositionXoffset(DoubleBaseType newPositionXoffset) {
		if (newPositionXoffset != positionXoffset) {
			NotificationChain msgs = null;
			if (positionXoffset != null)
				msgs = ((InternalEObject) positionXoffset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET,
						null, msgs);
			if (newPositionXoffset != null)
				msgs = ((InternalEObject) newPositionXoffset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET,
						null, msgs);
			msgs = basicSetPositionXoffset(newPositionXoffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET, newPositionXoffset,
					newPositionXoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentStringFrameType getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlignment(AlignmentStringFrameType newAlignment, NotificationChain msgs) {
		AlignmentStringFrameType oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT, oldAlignment, newAlignment);
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
	public void setAlignment(AlignmentStringFrameType newAlignment) {
		if (newAlignment != alignment) {
			NotificationChain msgs = null;
			if (alignment != null)
				msgs = ((InternalEObject) alignment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT, null,
						msgs);
			if (newAlignment != null)
				msgs = ((InternalEObject) newAlignment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT, null,
						msgs);
			msgs = basicSetAlignment(newAlignment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT, newAlignment, newAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType1 getContinuity() {
		return continuity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuity(ContinuityType1 newContinuity, NotificationChain msgs) {
		ContinuityType1 oldContinuity = continuity;
		continuity = newContinuity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY, oldContinuity, newContinuity);
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
	public void setContinuity(ContinuityType1 newContinuity) {
		if (newContinuity != continuity) {
			NotificationChain msgs = null;
			if (continuity != null)
				msgs = ((InternalEObject) continuity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY, null,
						msgs);
			if (newContinuity != null)
				msgs = ((InternalEObject) newContinuity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY, null,
						msgs);
			msgs = basicSetContinuity(newContinuity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY, newContinuity, newContinuity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterpolationType getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterpolation(InterpolationType newInterpolation, NotificationChain msgs) {
		InterpolationType oldInterpolation = interpolation;
		interpolation = newInterpolation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION, oldInterpolation,
					newInterpolation);
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
	public void setInterpolation(InterpolationType newInterpolation) {
		if (newInterpolation != interpolation) {
			NotificationChain msgs = null;
			if (interpolation != null)
				msgs = ((InternalEObject) interpolation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION,
						null, msgs);
			if (newInterpolation != null)
				msgs = ((InternalEObject) newInterpolation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION,
						null, msgs);
			msgs = basicSetInterpolation(newInterpolation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION, newInterpolation,
					newInterpolation));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X:
			return basicSetPositionX(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START:
			return basicSetPositionXUidStart(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END:
			return basicSetPositionXUidEnd(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN:
			return basicSetPositionXUidMin(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID:
			return basicSetPositionXUidMid(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX:
			return basicSetPositionXUidMax(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE:
			return basicSetPositionXAngle(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT:
			return basicSetPositionXFact(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET:
			return basicSetPositionXoffset(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT:
			return basicSetAlignment(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY:
			return basicSetContinuity(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION:
			return basicSetInterpolation(null, msgs);
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X:
			return getPositionX();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START:
			return getPositionXUidStart();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END:
			return getPositionXUidEnd();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN:
			return getPositionXUidMin();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID:
			return getPositionXUidMid();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX:
			return getPositionXUidMax();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE:
			return getPositionXAngle();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT:
			return getPositionXFact();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET:
			return getPositionXoffset();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT:
			return getAlignment();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY:
			return getContinuity();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION:
			return getInterpolation();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__UID:
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START:
			setPositionXUidStart((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END:
			setPositionXUidEnd((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN:
			setPositionXUidMin((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID:
			setPositionXUidMid((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX:
			setPositionXUidMax((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE:
			setPositionXAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT:
			setPositionXFact((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET:
			setPositionXoffset((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentStringFrameType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY:
			setContinuity((ContinuityType1) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION:
			setInterpolation((InterpolationType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__UID:
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X:
			setPositionX((DoubleBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START:
			setPositionXUidStart((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END:
			setPositionXUidEnd((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN:
			setPositionXUidMin((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID:
			setPositionXUidMid((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX:
			setPositionXUidMax((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE:
			setPositionXAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT:
			setPositionXFact((DoubleBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET:
			setPositionXoffset((DoubleBaseType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT:
			setAlignment((AlignmentStringFrameType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY:
			setContinuity((ContinuityType1) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION:
			setInterpolation((InterpolationType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__UID:
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_X:
			return positionX != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_START:
			return positionXUidStart != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_END:
			return positionXUidEnd != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MIN:
			return positionXUidMin != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MID:
			return positionXUidMid != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XUID_MAX:
			return positionXUidMax != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XANGLE:
			return positionXAngle != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XFACT:
			return positionXFact != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__POSITION_XOFFSET:
			return positionXoffset != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__ALIGNMENT:
			return alignment != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__CONTINUITY:
			return continuity != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__INTERPOLATION:
			return interpolation != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_POSITION_TYPE__UID:
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

} //GeneralStructuralMemberPositionTypeImpl
