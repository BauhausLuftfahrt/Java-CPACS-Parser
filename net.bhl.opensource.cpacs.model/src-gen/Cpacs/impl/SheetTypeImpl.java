/**
 */
package Cpacs.impl;

import Cpacs.ContinuityAtP1Type;
import Cpacs.ContinuityAtP2Type;
import Cpacs.CpacsPackage;
import Cpacs.PointXYType;
import Cpacs.SheetType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getFromPointUID <em>From Point UID</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getContinuityAtP1 <em>Continuity At P1</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getOrientationAtP1 <em>Orientation At P1</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getToPointUID <em>To Point UID</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getContinuityAtP2 <em>Continuity At P2</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getOrientationAtP2 <em>Orientation At P2</em>}</li>
 *   <li>{@link Cpacs.impl.SheetTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetTypeImpl extends ComplexBaseTypeImpl implements SheetType {
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
	 * The cached value of the '{@link #getFromPointUID() <em>From Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPointUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromPointUID;

	/**
	 * The cached value of the '{@link #getContinuityAtP1() <em>Continuity At P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuityAtP1()
	 * @generated
	 * @ordered
	 */
	protected ContinuityAtP1Type continuityAtP1;

	/**
	 * The cached value of the '{@link #getOrientationAtP1() <em>Orientation At P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationAtP1()
	 * @generated
	 * @ordered
	 */
	protected PointXYType orientationAtP1;

	/**
	 * The cached value of the '{@link #getToPointUID() <em>To Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPointUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toPointUID;

	/**
	 * The cached value of the '{@link #getContinuityAtP2() <em>Continuity At P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuityAtP2()
	 * @generated
	 * @ordered
	 */
	protected ContinuityAtP2Type continuityAtP2;

	/**
	 * The cached value of the '{@link #getOrientationAtP2() <em>Orientation At P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationAtP2()
	 * @generated
	 * @ordered
	 */
	protected PointXYType orientationAtP2;

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
	protected SheetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSheetType();
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
					CpacsPackage.SHEET_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__NAME, newName, newName));
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
					CpacsPackage.SHEET_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromPointUID() {
		return fromPointUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromPointUID(StringUIDBaseType newFromPointUID, NotificationChain msgs) {
		StringUIDBaseType oldFromPointUID = fromPointUID;
		fromPointUID = newFromPointUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_TYPE__FROM_POINT_UID, oldFromPointUID, newFromPointUID);
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
	public void setFromPointUID(StringUIDBaseType newFromPointUID) {
		if (newFromPointUID != fromPointUID) {
			NotificationChain msgs = null;
			if (fromPointUID != null)
				msgs = ((InternalEObject) fromPointUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__FROM_POINT_UID, null, msgs);
			if (newFromPointUID != null)
				msgs = ((InternalEObject) newFromPointUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__FROM_POINT_UID, null, msgs);
			msgs = basicSetFromPointUID(newFromPointUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__FROM_POINT_UID,
					newFromPointUID, newFromPointUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityAtP1Type getContinuityAtP1() {
		return continuityAtP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuityAtP1(ContinuityAtP1Type newContinuityAtP1, NotificationChain msgs) {
		ContinuityAtP1Type oldContinuityAtP1 = continuityAtP1;
		continuityAtP1 = newContinuityAtP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1, oldContinuityAtP1, newContinuityAtP1);
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
	public void setContinuityAtP1(ContinuityAtP1Type newContinuityAtP1) {
		if (newContinuityAtP1 != continuityAtP1) {
			NotificationChain msgs = null;
			if (continuityAtP1 != null)
				msgs = ((InternalEObject) continuityAtP1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1, null, msgs);
			if (newContinuityAtP1 != null)
				msgs = ((InternalEObject) newContinuityAtP1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1, null, msgs);
			msgs = basicSetContinuityAtP1(newContinuityAtP1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1,
					newContinuityAtP1, newContinuityAtP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYType getOrientationAtP1() {
		return orientationAtP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationAtP1(PointXYType newOrientationAtP1, NotificationChain msgs) {
		PointXYType oldOrientationAtP1 = orientationAtP1;
		orientationAtP1 = newOrientationAtP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1, oldOrientationAtP1, newOrientationAtP1);
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
	public void setOrientationAtP1(PointXYType newOrientationAtP1) {
		if (newOrientationAtP1 != orientationAtP1) {
			NotificationChain msgs = null;
			if (orientationAtP1 != null)
				msgs = ((InternalEObject) orientationAtP1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1, null, msgs);
			if (newOrientationAtP1 != null)
				msgs = ((InternalEObject) newOrientationAtP1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1, null, msgs);
			msgs = basicSetOrientationAtP1(newOrientationAtP1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1,
					newOrientationAtP1, newOrientationAtP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToPointUID() {
		return toPointUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToPointUID(StringUIDBaseType newToPointUID, NotificationChain msgs) {
		StringUIDBaseType oldToPointUID = toPointUID;
		toPointUID = newToPointUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_TYPE__TO_POINT_UID, oldToPointUID, newToPointUID);
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
	public void setToPointUID(StringUIDBaseType newToPointUID) {
		if (newToPointUID != toPointUID) {
			NotificationChain msgs = null;
			if (toPointUID != null)
				msgs = ((InternalEObject) toPointUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__TO_POINT_UID, null, msgs);
			if (newToPointUID != null)
				msgs = ((InternalEObject) newToPointUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__TO_POINT_UID, null, msgs);
			msgs = basicSetToPointUID(newToPointUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__TO_POINT_UID, newToPointUID,
					newToPointUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityAtP2Type getContinuityAtP2() {
		return continuityAtP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuityAtP2(ContinuityAtP2Type newContinuityAtP2, NotificationChain msgs) {
		ContinuityAtP2Type oldContinuityAtP2 = continuityAtP2;
		continuityAtP2 = newContinuityAtP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2, oldContinuityAtP2, newContinuityAtP2);
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
	public void setContinuityAtP2(ContinuityAtP2Type newContinuityAtP2) {
		if (newContinuityAtP2 != continuityAtP2) {
			NotificationChain msgs = null;
			if (continuityAtP2 != null)
				msgs = ((InternalEObject) continuityAtP2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2, null, msgs);
			if (newContinuityAtP2 != null)
				msgs = ((InternalEObject) newContinuityAtP2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2, null, msgs);
			msgs = basicSetContinuityAtP2(newContinuityAtP2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2,
					newContinuityAtP2, newContinuityAtP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYType getOrientationAtP2() {
		return orientationAtP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientationAtP2(PointXYType newOrientationAtP2, NotificationChain msgs) {
		PointXYType oldOrientationAtP2 = orientationAtP2;
		orientationAtP2 = newOrientationAtP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2, oldOrientationAtP2, newOrientationAtP2);
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
	public void setOrientationAtP2(PointXYType newOrientationAtP2) {
		if (newOrientationAtP2 != orientationAtP2) {
			NotificationChain msgs = null;
			if (orientationAtP2 != null)
				msgs = ((InternalEObject) orientationAtP2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2, null, msgs);
			if (newOrientationAtP2 != null)
				msgs = ((InternalEObject) newOrientationAtP2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2, null, msgs);
			msgs = basicSetOrientationAtP2(newOrientationAtP2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2,
					newOrientationAtP2, newOrientationAtP2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SHEET_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.SHEET_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.SHEET_TYPE__FROM_POINT_UID:
			return basicSetFromPointUID(null, msgs);
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1:
			return basicSetContinuityAtP1(null, msgs);
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1:
			return basicSetOrientationAtP1(null, msgs);
		case CpacsPackage.SHEET_TYPE__TO_POINT_UID:
			return basicSetToPointUID(null, msgs);
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2:
			return basicSetContinuityAtP2(null, msgs);
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2:
			return basicSetOrientationAtP2(null, msgs);
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
		case CpacsPackage.SHEET_TYPE__NAME:
			return getName();
		case CpacsPackage.SHEET_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.SHEET_TYPE__FROM_POINT_UID:
			return getFromPointUID();
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1:
			return getContinuityAtP1();
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1:
			return getOrientationAtP1();
		case CpacsPackage.SHEET_TYPE__TO_POINT_UID:
			return getToPointUID();
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2:
			return getContinuityAtP2();
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2:
			return getOrientationAtP2();
		case CpacsPackage.SHEET_TYPE__UID:
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
		case CpacsPackage.SHEET_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__FROM_POINT_UID:
			setFromPointUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1:
			setContinuityAtP1((ContinuityAtP1Type) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1:
			setOrientationAtP1((PointXYType) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__TO_POINT_UID:
			setToPointUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2:
			setContinuityAtP2((ContinuityAtP2Type) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2:
			setOrientationAtP2((PointXYType) newValue);
			return;
		case CpacsPackage.SHEET_TYPE__UID:
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
		case CpacsPackage.SHEET_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.SHEET_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.SHEET_TYPE__FROM_POINT_UID:
			setFromPointUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1:
			setContinuityAtP1((ContinuityAtP1Type) null);
			return;
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1:
			setOrientationAtP1((PointXYType) null);
			return;
		case CpacsPackage.SHEET_TYPE__TO_POINT_UID:
			setToPointUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2:
			setContinuityAtP2((ContinuityAtP2Type) null);
			return;
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2:
			setOrientationAtP2((PointXYType) null);
			return;
		case CpacsPackage.SHEET_TYPE__UID:
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
		case CpacsPackage.SHEET_TYPE__NAME:
			return name != null;
		case CpacsPackage.SHEET_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.SHEET_TYPE__FROM_POINT_UID:
			return fromPointUID != null;
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P1:
			return continuityAtP1 != null;
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P1:
			return orientationAtP1 != null;
		case CpacsPackage.SHEET_TYPE__TO_POINT_UID:
			return toPointUID != null;
		case CpacsPackage.SHEET_TYPE__CONTINUITY_AT_P2:
			return continuityAtP2 != null;
		case CpacsPackage.SHEET_TYPE__ORIENTATION_AT_P2:
			return orientationAtP2 != null;
		case CpacsPackage.SHEET_TYPE__UID:
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

} //SheetTypeImpl
