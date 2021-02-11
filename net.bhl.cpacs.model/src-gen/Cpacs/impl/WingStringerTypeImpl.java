/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingStringerType;
import Cpacs.XsiIsoLineType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Stringer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getStringerStructureUID <em>Stringer Structure UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getRefPoint <em>Ref Point</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getAngleReference <em>Angle Reference</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getNumberOfStringers <em>Number Of Stringers</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getAngle1 <em>Angle1</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getAngleReference1 <em>Angle Reference1</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getInnerBorderXsiLE <em>Inner Border Xsi LE</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getOuterBorderXsiLE <em>Outer Border Xsi LE</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getInnerBorderXsiTE <em>Inner Border Xsi TE</em>}</li>
 *   <li>{@link Cpacs.impl.WingStringerTypeImpl#getOuterBorderXsiTE <em>Outer Border Xsi TE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingStringerTypeImpl extends ComplexBaseTypeImpl implements WingStringerType {
	/**
	 * The cached value of the '{@link #getStringerStructureUID() <em>Stringer Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringerStructureUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType stringerStructureUID;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType pitch;

	/**
	 * The cached value of the '{@link #getRefPoint() <em>Ref Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPoint()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType refPoint;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angle;

	/**
	 * The cached value of the '{@link #getAngleReference() <em>Angle Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleReference()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType angleReference;

	/**
	 * The cached value of the '{@link #getNumberOfStringers() <em>Number Of Stringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStringers()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfStringers;

	/**
	 * The cached value of the '{@link #getAngle1() <em>Angle1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angle1;

	/**
	 * The cached value of the '{@link #getAngleReference1() <em>Angle Reference1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleReference1()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType angleReference1;

	/**
	 * The cached value of the '{@link #getInnerBorderXsiLE() <em>Inner Border Xsi LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBorderXsiLE()
	 * @generated
	 * @ordered
	 */
	protected XsiIsoLineType innerBorderXsiLE;

	/**
	 * The cached value of the '{@link #getOuterBorderXsiLE() <em>Outer Border Xsi LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBorderXsiLE()
	 * @generated
	 * @ordered
	 */
	protected XsiIsoLineType outerBorderXsiLE;

	/**
	 * The cached value of the '{@link #getInnerBorderXsiTE() <em>Inner Border Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBorderXsiTE()
	 * @generated
	 * @ordered
	 */
	protected XsiIsoLineType innerBorderXsiTE;

	/**
	 * The cached value of the '{@link #getOuterBorderXsiTE() <em>Outer Border Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBorderXsiTE()
	 * @generated
	 * @ordered
	 */
	protected XsiIsoLineType outerBorderXsiTE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingStringerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingStringerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStringerStructureUID() {
		return stringerStructureUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringerStructureUID(StringUIDBaseType newStringerStructureUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStringerStructureUID = stringerStructureUID;
		stringerStructureUID = newStringerStructureUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID, oldStringerStructureUID,
					newStringerStructureUID);
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
	public void setStringerStructureUID(StringUIDBaseType newStringerStructureUID) {
		if (newStringerStructureUID != stringerStructureUID) {
			NotificationChain msgs = null;
			if (stringerStructureUID != null)
				msgs = ((InternalEObject) stringerStructureUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID, null, msgs);
			if (newStringerStructureUID != null)
				msgs = ((InternalEObject) newStringerStructureUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID, null, msgs);
			msgs = basicSetStringerStructureUID(newStringerStructureUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID, newStringerStructureUID,
					newStringerStructureUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPitch(DoubleBaseType newPitch, NotificationChain msgs) {
		DoubleBaseType oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__PITCH, oldPitch, newPitch);
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
	public void setPitch(DoubleBaseType newPitch) {
		if (newPitch != pitch) {
			NotificationChain msgs = null;
			if (pitch != null)
				msgs = ((InternalEObject) pitch).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__PITCH, null, msgs);
			if (newPitch != null)
				msgs = ((InternalEObject) newPitch).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__PITCH, null, msgs);
			msgs = basicSetPitch(newPitch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__PITCH, newPitch,
					newPitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getRefPoint() {
		return refPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefPoint(EtaXsiRelHeightPointType newRefPoint, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldRefPoint = refPoint;
		refPoint = newRefPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__REF_POINT, oldRefPoint, newRefPoint);
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
	public void setRefPoint(EtaXsiRelHeightPointType newRefPoint) {
		if (newRefPoint != refPoint) {
			NotificationChain msgs = null;
			if (refPoint != null)
				msgs = ((InternalEObject) refPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__REF_POINT, null, msgs);
			if (newRefPoint != null)
				msgs = ((InternalEObject) newRefPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__REF_POINT, null, msgs);
			msgs = basicSetRefPoint(newRefPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__REF_POINT,
					newRefPoint, newRefPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(DoubleBaseType newAngle, NotificationChain msgs) {
		DoubleBaseType oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__ANGLE, oldAngle, newAngle);
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
	public void setAngle(DoubleBaseType newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject) angle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject) newAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__ANGLE, newAngle,
					newAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getAngleReference() {
		return angleReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleReference(StringBaseType newAngleReference, NotificationChain msgs) {
		StringBaseType oldAngleReference = angleReference;
		angleReference = newAngleReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE, oldAngleReference, newAngleReference);
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
	public void setAngleReference(StringBaseType newAngleReference) {
		if (newAngleReference != angleReference) {
			NotificationChain msgs = null;
			if (angleReference != null)
				msgs = ((InternalEObject) angleReference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE, null, msgs);
			if (newAngleReference != null)
				msgs = ((InternalEObject) newAngleReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE, null, msgs);
			msgs = basicSetAngleReference(newAngleReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE,
					newAngleReference, newAngleReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfStringers() {
		return numberOfStringers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfStringers(IntegerBaseType newNumberOfStringers, NotificationChain msgs) {
		IntegerBaseType oldNumberOfStringers = numberOfStringers;
		numberOfStringers = newNumberOfStringers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS, oldNumberOfStringers, newNumberOfStringers);
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
	public void setNumberOfStringers(IntegerBaseType newNumberOfStringers) {
		if (newNumberOfStringers != numberOfStringers) {
			NotificationChain msgs = null;
			if (numberOfStringers != null)
				msgs = ((InternalEObject) numberOfStringers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS, null, msgs);
			if (newNumberOfStringers != null)
				msgs = ((InternalEObject) newNumberOfStringers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS, null, msgs);
			msgs = basicSetNumberOfStringers(newNumberOfStringers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS,
					newNumberOfStringers, newNumberOfStringers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngle1() {
		return angle1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle1(DoubleBaseType newAngle1, NotificationChain msgs) {
		DoubleBaseType oldAngle1 = angle1;
		angle1 = newAngle1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__ANGLE1, oldAngle1, newAngle1);
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
	public void setAngle1(DoubleBaseType newAngle1) {
		if (newAngle1 != angle1) {
			NotificationChain msgs = null;
			if (angle1 != null)
				msgs = ((InternalEObject) angle1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE1, null, msgs);
			if (newAngle1 != null)
				msgs = ((InternalEObject) newAngle1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE1, null, msgs);
			msgs = basicSetAngle1(newAngle1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__ANGLE1, newAngle1,
					newAngle1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getAngleReference1() {
		return angleReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleReference1(StringBaseType newAngleReference1, NotificationChain msgs) {
		StringBaseType oldAngleReference1 = angleReference1;
		angleReference1 = newAngleReference1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1, oldAngleReference1, newAngleReference1);
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
	public void setAngleReference1(StringBaseType newAngleReference1) {
		if (newAngleReference1 != angleReference1) {
			NotificationChain msgs = null;
			if (angleReference1 != null)
				msgs = ((InternalEObject) angleReference1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1, null, msgs);
			if (newAngleReference1 != null)
				msgs = ((InternalEObject) newAngleReference1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1, null, msgs);
			msgs = basicSetAngleReference1(newAngleReference1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1,
					newAngleReference1, newAngleReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType getInnerBorderXsiLE() {
		return innerBorderXsiLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBorderXsiLE(XsiIsoLineType newInnerBorderXsiLE, NotificationChain msgs) {
		XsiIsoLineType oldInnerBorderXsiLE = innerBorderXsiLE;
		innerBorderXsiLE = newInnerBorderXsiLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE, oldInnerBorderXsiLE, newInnerBorderXsiLE);
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
	public void setInnerBorderXsiLE(XsiIsoLineType newInnerBorderXsiLE) {
		if (newInnerBorderXsiLE != innerBorderXsiLE) {
			NotificationChain msgs = null;
			if (innerBorderXsiLE != null)
				msgs = ((InternalEObject) innerBorderXsiLE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE, null, msgs);
			if (newInnerBorderXsiLE != null)
				msgs = ((InternalEObject) newInnerBorderXsiLE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE, null, msgs);
			msgs = basicSetInnerBorderXsiLE(newInnerBorderXsiLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE,
					newInnerBorderXsiLE, newInnerBorderXsiLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType getOuterBorderXsiLE() {
		return outerBorderXsiLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBorderXsiLE(XsiIsoLineType newOuterBorderXsiLE, NotificationChain msgs) {
		XsiIsoLineType oldOuterBorderXsiLE = outerBorderXsiLE;
		outerBorderXsiLE = newOuterBorderXsiLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE, oldOuterBorderXsiLE, newOuterBorderXsiLE);
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
	public void setOuterBorderXsiLE(XsiIsoLineType newOuterBorderXsiLE) {
		if (newOuterBorderXsiLE != outerBorderXsiLE) {
			NotificationChain msgs = null;
			if (outerBorderXsiLE != null)
				msgs = ((InternalEObject) outerBorderXsiLE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE, null, msgs);
			if (newOuterBorderXsiLE != null)
				msgs = ((InternalEObject) newOuterBorderXsiLE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE, null, msgs);
			msgs = basicSetOuterBorderXsiLE(newOuterBorderXsiLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE,
					newOuterBorderXsiLE, newOuterBorderXsiLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType getInnerBorderXsiTE() {
		return innerBorderXsiTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerBorderXsiTE(XsiIsoLineType newInnerBorderXsiTE, NotificationChain msgs) {
		XsiIsoLineType oldInnerBorderXsiTE = innerBorderXsiTE;
		innerBorderXsiTE = newInnerBorderXsiTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE, oldInnerBorderXsiTE, newInnerBorderXsiTE);
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
	public void setInnerBorderXsiTE(XsiIsoLineType newInnerBorderXsiTE) {
		if (newInnerBorderXsiTE != innerBorderXsiTE) {
			NotificationChain msgs = null;
			if (innerBorderXsiTE != null)
				msgs = ((InternalEObject) innerBorderXsiTE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE, null, msgs);
			if (newInnerBorderXsiTE != null)
				msgs = ((InternalEObject) newInnerBorderXsiTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE, null, msgs);
			msgs = basicSetInnerBorderXsiTE(newInnerBorderXsiTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE,
					newInnerBorderXsiTE, newInnerBorderXsiTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XsiIsoLineType getOuterBorderXsiTE() {
		return outerBorderXsiTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBorderXsiTE(XsiIsoLineType newOuterBorderXsiTE, NotificationChain msgs) {
		XsiIsoLineType oldOuterBorderXsiTE = outerBorderXsiTE;
		outerBorderXsiTE = newOuterBorderXsiTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE, oldOuterBorderXsiTE, newOuterBorderXsiTE);
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
	public void setOuterBorderXsiTE(XsiIsoLineType newOuterBorderXsiTE) {
		if (newOuterBorderXsiTE != outerBorderXsiTE) {
			NotificationChain msgs = null;
			if (outerBorderXsiTE != null)
				msgs = ((InternalEObject) outerBorderXsiTE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE, null, msgs);
			if (newOuterBorderXsiTE != null)
				msgs = ((InternalEObject) newOuterBorderXsiTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE, null, msgs);
			msgs = basicSetOuterBorderXsiTE(newOuterBorderXsiTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE,
					newOuterBorderXsiTE, newOuterBorderXsiTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID:
			return basicSetStringerStructureUID(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__PITCH:
			return basicSetPitch(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__REF_POINT:
			return basicSetRefPoint(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE:
			return basicSetAngle(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE:
			return basicSetAngleReference(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS:
			return basicSetNumberOfStringers(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE1:
			return basicSetAngle1(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1:
			return basicSetAngleReference1(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE:
			return basicSetInnerBorderXsiLE(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE:
			return basicSetOuterBorderXsiLE(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE:
			return basicSetInnerBorderXsiTE(null, msgs);
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE:
			return basicSetOuterBorderXsiTE(null, msgs);
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
		case CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID:
			return getStringerStructureUID();
		case CpacsPackage.WING_STRINGER_TYPE__PITCH:
			return getPitch();
		case CpacsPackage.WING_STRINGER_TYPE__REF_POINT:
			return getRefPoint();
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE:
			return getAngle();
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE:
			return getAngleReference();
		case CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS:
			return getNumberOfStringers();
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE1:
			return getAngle1();
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1:
			return getAngleReference1();
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE:
			return getInnerBorderXsiLE();
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE:
			return getOuterBorderXsiLE();
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE:
			return getInnerBorderXsiTE();
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE:
			return getOuterBorderXsiTE();
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
		case CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID:
			setStringerStructureUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__PITCH:
			setPitch((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__REF_POINT:
			setRefPoint((EtaXsiRelHeightPointType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE:
			setAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE:
			setAngleReference((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS:
			setNumberOfStringers((IntegerBaseType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE1:
			setAngle1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1:
			setAngleReference1((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE:
			setInnerBorderXsiLE((XsiIsoLineType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE:
			setOuterBorderXsiLE((XsiIsoLineType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE:
			setInnerBorderXsiTE((XsiIsoLineType) newValue);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE:
			setOuterBorderXsiTE((XsiIsoLineType) newValue);
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
		case CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID:
			setStringerStructureUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__PITCH:
			setPitch((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__REF_POINT:
			setRefPoint((EtaXsiRelHeightPointType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE:
			setAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE:
			setAngleReference((StringBaseType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS:
			setNumberOfStringers((IntegerBaseType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE1:
			setAngle1((DoubleBaseType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1:
			setAngleReference1((StringBaseType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE:
			setInnerBorderXsiLE((XsiIsoLineType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE:
			setOuterBorderXsiLE((XsiIsoLineType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE:
			setInnerBorderXsiTE((XsiIsoLineType) null);
			return;
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE:
			setOuterBorderXsiTE((XsiIsoLineType) null);
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
		case CpacsPackage.WING_STRINGER_TYPE__STRINGER_STRUCTURE_UID:
			return stringerStructureUID != null;
		case CpacsPackage.WING_STRINGER_TYPE__PITCH:
			return pitch != null;
		case CpacsPackage.WING_STRINGER_TYPE__REF_POINT:
			return refPoint != null;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE:
			return angle != null;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE:
			return angleReference != null;
		case CpacsPackage.WING_STRINGER_TYPE__NUMBER_OF_STRINGERS:
			return numberOfStringers != null;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE1:
			return angle1 != null;
		case CpacsPackage.WING_STRINGER_TYPE__ANGLE_REFERENCE1:
			return angleReference1 != null;
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_LE:
			return innerBorderXsiLE != null;
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_LE:
			return outerBorderXsiLE != null;
		case CpacsPackage.WING_STRINGER_TYPE__INNER_BORDER_XSI_TE:
			return innerBorderXsiTE != null;
		case CpacsPackage.WING_STRINGER_TYPE__OUTER_BORDER_XSI_TE:
			return outerBorderXsiTE != null;
		}
		return super.eIsSet(featureID);
	}

} //WingStringerTypeImpl
