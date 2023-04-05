/**
 */
package Cpacs.impl;

import Cpacs.ContinuityType4;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.GuideCurveType;
import Cpacs.PointXYZType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guide Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getGuideCurveProfileUID <em>Guide Curve Profile UID</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getFromGuideCurveUID <em>From Guide Curve UID</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getFromRelativeCircumference <em>From Relative Circumference</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getTangent <em>Tangent</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getToRelativeCircumference <em>To Relative Circumference</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getTangent1 <em>Tangent1</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getRXDirection <em>RX Direction</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuideCurveTypeImpl extends ComplexBaseTypeImpl implements GuideCurveType {
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
	 * The cached value of the '{@link #getGuideCurveProfileUID() <em>Guide Curve Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideCurveProfileUID()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType guideCurveProfileUID;

	/**
	 * The cached value of the '{@link #getFromGuideCurveUID() <em>From Guide Curve UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromGuideCurveUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromGuideCurveUID;

	/**
	 * The cached value of the '{@link #getContinuity() <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuity()
	 * @generated
	 * @ordered
	 */
	protected ContinuityType4 continuity;

	/**
	 * The cached value of the '{@link #getFromRelativeCircumference() <em>From Relative Circumference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRelativeCircumference()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fromRelativeCircumference;

	/**
	 * The cached value of the '{@link #getTangent() <em>Tangent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTangent()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType tangent;

	/**
	 * The cached value of the '{@link #getToRelativeCircumference() <em>To Relative Circumference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRelativeCircumference()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType toRelativeCircumference;

	/**
	 * The cached value of the '{@link #getTangent1() <em>Tangent1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTangent1()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType tangent1;

	/**
	 * The cached value of the '{@link #getRXDirection() <em>RX Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXDirection()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType rXDirection;

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
	protected GuideCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGuideCurveType();
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
					CpacsPackage.GUIDE_CURVE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__NAME, newName,
					newName));
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
					CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getGuideCurveProfileUID() {
		return guideCurveProfileUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuideCurveProfileUID(StringBaseType newGuideCurveProfileUID,
			NotificationChain msgs) {
		StringBaseType oldGuideCurveProfileUID = guideCurveProfileUID;
		guideCurveProfileUID = newGuideCurveProfileUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, oldGuideCurveProfileUID,
					newGuideCurveProfileUID);
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
	public void setGuideCurveProfileUID(StringBaseType newGuideCurveProfileUID) {
		if (newGuideCurveProfileUID != guideCurveProfileUID) {
			NotificationChain msgs = null;
			if (guideCurveProfileUID != null)
				msgs = ((InternalEObject) guideCurveProfileUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, null, msgs);
			if (newGuideCurveProfileUID != null)
				msgs = ((InternalEObject) newGuideCurveProfileUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, null, msgs);
			msgs = basicSetGuideCurveProfileUID(newGuideCurveProfileUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID, newGuideCurveProfileUID,
					newGuideCurveProfileUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromGuideCurveUID() {
		return fromGuideCurveUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromGuideCurveUID(StringUIDBaseType newFromGuideCurveUID, NotificationChain msgs) {
		StringUIDBaseType oldFromGuideCurveUID = fromGuideCurveUID;
		fromGuideCurveUID = newFromGuideCurveUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID, oldFromGuideCurveUID, newFromGuideCurveUID);
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
	public void setFromGuideCurveUID(StringUIDBaseType newFromGuideCurveUID) {
		if (newFromGuideCurveUID != fromGuideCurveUID) {
			NotificationChain msgs = null;
			if (fromGuideCurveUID != null)
				msgs = ((InternalEObject) fromGuideCurveUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID, null, msgs);
			if (newFromGuideCurveUID != null)
				msgs = ((InternalEObject) newFromGuideCurveUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID, null, msgs);
			msgs = basicSetFromGuideCurveUID(newFromGuideCurveUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID,
					newFromGuideCurveUID, newFromGuideCurveUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType4 getContinuity() {
		return continuity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuity(ContinuityType4 newContinuity, NotificationChain msgs) {
		ContinuityType4 oldContinuity = continuity;
		continuity = newContinuity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY, oldContinuity, newContinuity);
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
	public void setContinuity(ContinuityType4 newContinuity) {
		if (newContinuity != continuity) {
			NotificationChain msgs = null;
			if (continuity != null)
				msgs = ((InternalEObject) continuity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY, null, msgs);
			if (newContinuity != null)
				msgs = ((InternalEObject) newContinuity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY, null, msgs);
			msgs = basicSetContinuity(newContinuity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY,
					newContinuity, newContinuity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFromRelativeCircumference() {
		return fromRelativeCircumference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromRelativeCircumference(DoubleBaseType newFromRelativeCircumference,
			NotificationChain msgs) {
		DoubleBaseType oldFromRelativeCircumference = fromRelativeCircumference;
		fromRelativeCircumference = newFromRelativeCircumference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE, oldFromRelativeCircumference,
					newFromRelativeCircumference);
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
	public void setFromRelativeCircumference(DoubleBaseType newFromRelativeCircumference) {
		if (newFromRelativeCircumference != fromRelativeCircumference) {
			NotificationChain msgs = null;
			if (fromRelativeCircumference != null)
				msgs = ((InternalEObject) fromRelativeCircumference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE, null,
						msgs);
			if (newFromRelativeCircumference != null)
				msgs = ((InternalEObject) newFromRelativeCircumference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE, null,
						msgs);
			msgs = basicSetFromRelativeCircumference(newFromRelativeCircumference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE, newFromRelativeCircumference,
					newFromRelativeCircumference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getTangent() {
		return tangent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTangent(PointXYZType newTangent, NotificationChain msgs) {
		PointXYZType oldTangent = tangent;
		tangent = newTangent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__TANGENT, oldTangent, newTangent);
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
	public void setTangent(PointXYZType newTangent) {
		if (newTangent != tangent) {
			NotificationChain msgs = null;
			if (tangent != null)
				msgs = ((InternalEObject) tangent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__TANGENT, null, msgs);
			if (newTangent != null)
				msgs = ((InternalEObject) newTangent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__TANGENT, null, msgs);
			msgs = basicSetTangent(newTangent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__TANGENT, newTangent,
					newTangent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getToRelativeCircumference() {
		return toRelativeCircumference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToRelativeCircumference(DoubleBaseType newToRelativeCircumference,
			NotificationChain msgs) {
		DoubleBaseType oldToRelativeCircumference = toRelativeCircumference;
		toRelativeCircumference = newToRelativeCircumference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE, oldToRelativeCircumference,
					newToRelativeCircumference);
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
	public void setToRelativeCircumference(DoubleBaseType newToRelativeCircumference) {
		if (newToRelativeCircumference != toRelativeCircumference) {
			NotificationChain msgs = null;
			if (toRelativeCircumference != null)
				msgs = ((InternalEObject) toRelativeCircumference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE, null, msgs);
			if (newToRelativeCircumference != null)
				msgs = ((InternalEObject) newToRelativeCircumference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE, null, msgs);
			msgs = basicSetToRelativeCircumference(newToRelativeCircumference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE, newToRelativeCircumference,
					newToRelativeCircumference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getTangent1() {
		return tangent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTangent1(PointXYZType newTangent1, NotificationChain msgs) {
		PointXYZType oldTangent1 = tangent1;
		tangent1 = newTangent1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1, oldTangent1, newTangent1);
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
	public void setTangent1(PointXYZType newTangent1) {
		if (newTangent1 != tangent1) {
			NotificationChain msgs = null;
			if (tangent1 != null)
				msgs = ((InternalEObject) tangent1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1, null, msgs);
			if (newTangent1 != null)
				msgs = ((InternalEObject) newTangent1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1, null, msgs);
			msgs = basicSetTangent1(newTangent1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1, newTangent1,
					newTangent1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getRXDirection() {
		return rXDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXDirection(PointXYZType newRXDirection, NotificationChain msgs) {
		PointXYZType oldRXDirection = rXDirection;
		rXDirection = newRXDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION, oldRXDirection, newRXDirection);
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
	public void setRXDirection(PointXYZType newRXDirection) {
		if (newRXDirection != rXDirection) {
			NotificationChain msgs = null;
			if (rXDirection != null)
				msgs = ((InternalEObject) rXDirection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION, null, msgs);
			if (newRXDirection != null)
				msgs = ((InternalEObject) newRXDirection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION, null, msgs);
			msgs = basicSetRXDirection(newRXDirection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION,
					newRXDirection, newRXDirection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GUIDE_CURVE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			return basicSetGuideCurveProfileUID(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID:
			return basicSetFromGuideCurveUID(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY:
			return basicSetContinuity(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE:
			return basicSetFromRelativeCircumference(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT:
			return basicSetTangent(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE:
			return basicSetToRelativeCircumference(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1:
			return basicSetTangent1(null, msgs);
		case CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION:
			return basicSetRXDirection(null, msgs);
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
		case CpacsPackage.GUIDE_CURVE_TYPE__NAME:
			return getName();
		case CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			return getGuideCurveProfileUID();
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID:
			return getFromGuideCurveUID();
		case CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY:
			return getContinuity();
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE:
			return getFromRelativeCircumference();
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT:
			return getTangent();
		case CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE:
			return getToRelativeCircumference();
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1:
			return getTangent1();
		case CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION:
			return getRXDirection();
		case CpacsPackage.GUIDE_CURVE_TYPE__UID:
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
		case CpacsPackage.GUIDE_CURVE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			setGuideCurveProfileUID((StringBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID:
			setFromGuideCurveUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY:
			setContinuity((ContinuityType4) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE:
			setFromRelativeCircumference((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT:
			setTangent((PointXYZType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE:
			setToRelativeCircumference((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1:
			setTangent1((PointXYZType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION:
			setRXDirection((PointXYZType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__UID:
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
		case CpacsPackage.GUIDE_CURVE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			setGuideCurveProfileUID((StringBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID:
			setFromGuideCurveUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY:
			setContinuity((ContinuityType4) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE:
			setFromRelativeCircumference((DoubleBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT:
			setTangent((PointXYZType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE:
			setToRelativeCircumference((DoubleBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1:
			setTangent1((PointXYZType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION:
			setRXDirection((PointXYZType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_TYPE__UID:
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
		case CpacsPackage.GUIDE_CURVE_TYPE__NAME:
			return name != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__GUIDE_CURVE_PROFILE_UID:
			return guideCurveProfileUID != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_GUIDE_CURVE_UID:
			return fromGuideCurveUID != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__CONTINUITY:
			return continuity != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__FROM_RELATIVE_CIRCUMFERENCE:
			return fromRelativeCircumference != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT:
			return tangent != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__TO_RELATIVE_CIRCUMFERENCE:
			return toRelativeCircumference != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__TANGENT1:
			return tangent1 != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__RX_DIRECTION:
			return rXDirection != null;
		case CpacsPackage.GUIDE_CURVE_TYPE__UID:
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

} //GuideCurveTypeImpl
