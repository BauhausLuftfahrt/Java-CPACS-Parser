/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StructuralMountType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Mount Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StructuralMountTypeImpl#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralMountTypeImpl#getTakeOnlyEndPoints <em>Take Only End Points</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralMountTypeImpl#getFromStructureUID <em>From Structure UID</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralMountTypeImpl#getFromStructureCounter <em>From Structure Counter</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralMountTypeImpl#getToStructureUID <em>To Structure UID</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralMountTypeImpl#getToStructureCounter <em>To Structure Counter</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralMountTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralMountTypeImpl extends ComplexBaseTypeImpl implements StructuralMountType {
	/**
	 * The cached value of the '{@link #getBlockedDOF() <em>Blocked DOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockedDOF()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType blockedDOF;

	/**
	 * The cached value of the '{@link #getTakeOnlyEndPoints() <em>Take Only End Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeOnlyEndPoints()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType takeOnlyEndPoints;

	/**
	 * The cached value of the '{@link #getFromStructureUID() <em>From Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStructureUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromStructureUID;

	/**
	 * The cached value of the '{@link #getFromStructureCounter() <em>From Structure Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromStructureCounter()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType fromStructureCounter;

	/**
	 * The cached value of the '{@link #getToStructureUID() <em>To Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStructureUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toStructureUID;

	/**
	 * The cached value of the '{@link #getToStructureCounter() <em>To Structure Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStructureCounter()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType toStructureCounter;

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
	protected StructuralMountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStructuralMountType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getBlockedDOF() {
		return blockedDOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockedDOF(IntegerBaseType newBlockedDOF, NotificationChain msgs) {
		IntegerBaseType oldBlockedDOF = blockedDOF;
		blockedDOF = newBlockedDOF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF, oldBlockedDOF, newBlockedDOF);
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
	public void setBlockedDOF(IntegerBaseType newBlockedDOF) {
		if (newBlockedDOF != blockedDOF) {
			NotificationChain msgs = null;
			if (blockedDOF != null)
				msgs = ((InternalEObject) blockedDOF).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF, null, msgs);
			if (newBlockedDOF != null)
				msgs = ((InternalEObject) newBlockedDOF).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF, null, msgs);
			msgs = basicSetBlockedDOF(newBlockedDOF, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF,
					newBlockedDOF, newBlockedDOF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getTakeOnlyEndPoints() {
		return takeOnlyEndPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTakeOnlyEndPoints(BooleanBaseType newTakeOnlyEndPoints, NotificationChain msgs) {
		BooleanBaseType oldTakeOnlyEndPoints = takeOnlyEndPoints;
		takeOnlyEndPoints = newTakeOnlyEndPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS, oldTakeOnlyEndPoints,
					newTakeOnlyEndPoints);
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
	public void setTakeOnlyEndPoints(BooleanBaseType newTakeOnlyEndPoints) {
		if (newTakeOnlyEndPoints != takeOnlyEndPoints) {
			NotificationChain msgs = null;
			if (takeOnlyEndPoints != null)
				msgs = ((InternalEObject) takeOnlyEndPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS, null, msgs);
			if (newTakeOnlyEndPoints != null)
				msgs = ((InternalEObject) newTakeOnlyEndPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS, null, msgs);
			msgs = basicSetTakeOnlyEndPoints(newTakeOnlyEndPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS, newTakeOnlyEndPoints,
					newTakeOnlyEndPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromStructureUID() {
		return fromStructureUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromStructureUID(StringUIDBaseType newFromStructureUID, NotificationChain msgs) {
		StringUIDBaseType oldFromStructureUID = fromStructureUID;
		fromStructureUID = newFromStructureUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID, oldFromStructureUID, newFromStructureUID);
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
	public void setFromStructureUID(StringUIDBaseType newFromStructureUID) {
		if (newFromStructureUID != fromStructureUID) {
			NotificationChain msgs = null;
			if (fromStructureUID != null)
				msgs = ((InternalEObject) fromStructureUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID, null, msgs);
			if (newFromStructureUID != null)
				msgs = ((InternalEObject) newFromStructureUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID, null, msgs);
			msgs = basicSetFromStructureUID(newFromStructureUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID, newFromStructureUID, newFromStructureUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getFromStructureCounter() {
		return fromStructureCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromStructureCounter(IntegerBaseType newFromStructureCounter,
			NotificationChain msgs) {
		IntegerBaseType oldFromStructureCounter = fromStructureCounter;
		fromStructureCounter = newFromStructureCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER, oldFromStructureCounter,
					newFromStructureCounter);
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
	public void setFromStructureCounter(IntegerBaseType newFromStructureCounter) {
		if (newFromStructureCounter != fromStructureCounter) {
			NotificationChain msgs = null;
			if (fromStructureCounter != null)
				msgs = ((InternalEObject) fromStructureCounter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER, null,
						msgs);
			if (newFromStructureCounter != null)
				msgs = ((InternalEObject) newFromStructureCounter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER, null,
						msgs);
			msgs = basicSetFromStructureCounter(newFromStructureCounter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER, newFromStructureCounter,
					newFromStructureCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToStructureUID() {
		return toStructureUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToStructureUID(StringUIDBaseType newToStructureUID, NotificationChain msgs) {
		StringUIDBaseType oldToStructureUID = toStructureUID;
		toStructureUID = newToStructureUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID, oldToStructureUID, newToStructureUID);
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
	public void setToStructureUID(StringUIDBaseType newToStructureUID) {
		if (newToStructureUID != toStructureUID) {
			NotificationChain msgs = null;
			if (toStructureUID != null)
				msgs = ((InternalEObject) toStructureUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID, null, msgs);
			if (newToStructureUID != null)
				msgs = ((InternalEObject) newToStructureUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID, null, msgs);
			msgs = basicSetToStructureUID(newToStructureUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID,
					newToStructureUID, newToStructureUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getToStructureCounter() {
		return toStructureCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToStructureCounter(IntegerBaseType newToStructureCounter, NotificationChain msgs) {
		IntegerBaseType oldToStructureCounter = toStructureCounter;
		toStructureCounter = newToStructureCounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER, oldToStructureCounter,
					newToStructureCounter);
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
	public void setToStructureCounter(IntegerBaseType newToStructureCounter) {
		if (newToStructureCounter != toStructureCounter) {
			NotificationChain msgs = null;
			if (toStructureCounter != null)
				msgs = ((InternalEObject) toStructureCounter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER, null, msgs);
			if (newToStructureCounter != null)
				msgs = ((InternalEObject) newToStructureCounter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER, null, msgs);
			msgs = basicSetToStructureCounter(newToStructureCounter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER, newToStructureCounter,
					newToStructureCounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_MOUNT_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF:
			return basicSetBlockedDOF(null, msgs);
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS:
			return basicSetTakeOnlyEndPoints(null, msgs);
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID:
			return basicSetFromStructureUID(null, msgs);
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER:
			return basicSetFromStructureCounter(null, msgs);
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID:
			return basicSetToStructureUID(null, msgs);
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER:
			return basicSetToStructureCounter(null, msgs);
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
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF:
			return getBlockedDOF();
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS:
			return getTakeOnlyEndPoints();
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID:
			return getFromStructureUID();
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER:
			return getFromStructureCounter();
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID:
			return getToStructureUID();
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER:
			return getToStructureCounter();
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF:
			setBlockedDOF((IntegerBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS:
			setTakeOnlyEndPoints((BooleanBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID:
			setFromStructureUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER:
			setFromStructureCounter((IntegerBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID:
			setToStructureUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER:
			setToStructureCounter((IntegerBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF:
			setBlockedDOF((IntegerBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS:
			setTakeOnlyEndPoints((BooleanBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID:
			setFromStructureUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER:
			setFromStructureCounter((IntegerBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID:
			setToStructureUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER:
			setToStructureCounter((IntegerBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__BLOCKED_DOF:
			return blockedDOF != null;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TAKE_ONLY_END_POINTS:
			return takeOnlyEndPoints != null;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_UID:
			return fromStructureUID != null;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__FROM_STRUCTURE_COUNTER:
			return fromStructureCounter != null;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_UID:
			return toStructureUID != null;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__TO_STRUCTURE_COUNTER:
			return toStructureCounter != null;
		case CpacsPackage.STRUCTURAL_MOUNT_TYPE__UID:
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

} //StructuralMountTypeImpl
