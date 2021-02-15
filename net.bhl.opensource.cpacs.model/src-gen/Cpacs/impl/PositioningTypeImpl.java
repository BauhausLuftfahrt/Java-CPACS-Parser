/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PositioningType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positioning Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getSweepAngle <em>Sweep Angle</em>}</li>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getDihedralAngle <em>Dihedral Angle</em>}</li>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getFromSectionUID <em>From Section UID</em>}</li>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getToSectionUID <em>To Section UID</em>}</li>
 *   <li>{@link Cpacs.impl.PositioningTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositioningTypeImpl extends ComplexBaseTypeImpl implements PositioningType {
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
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType length;

	/**
	 * The cached value of the '{@link #getSweepAngle() <em>Sweep Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSweepAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sweepAngle;

	/**
	 * The cached value of the '{@link #getDihedralAngle() <em>Dihedral Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDihedralAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType dihedralAngle;

	/**
	 * The cached value of the '{@link #getFromSectionUID() <em>From Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSectionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromSectionUID;

	/**
	 * The cached value of the '{@link #getToSectionUID() <em>To Section UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSectionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toSectionUID;

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
	protected PositioningTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPositioningType();
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
					CpacsPackage.POSITIONING_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__NAME, newName,
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
					CpacsPackage.POSITIONING_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(DoubleBaseType newLength, NotificationChain msgs) {
		DoubleBaseType oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POSITIONING_TYPE__LENGTH, oldLength, newLength);
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
	public void setLength(DoubleBaseType newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject) length).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__LENGTH, newLength,
					newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSweepAngle() {
		return sweepAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSweepAngle(DoubleBaseType newSweepAngle, NotificationChain msgs) {
		DoubleBaseType oldSweepAngle = sweepAngle;
		sweepAngle = newSweepAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE, oldSweepAngle, newSweepAngle);
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
	public void setSweepAngle(DoubleBaseType newSweepAngle) {
		if (newSweepAngle != sweepAngle) {
			NotificationChain msgs = null;
			if (sweepAngle != null)
				msgs = ((InternalEObject) sweepAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE, null, msgs);
			if (newSweepAngle != null)
				msgs = ((InternalEObject) newSweepAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE, null, msgs);
			msgs = basicSetSweepAngle(newSweepAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE,
					newSweepAngle, newSweepAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDihedralAngle() {
		return dihedralAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDihedralAngle(DoubleBaseType newDihedralAngle, NotificationChain msgs) {
		DoubleBaseType oldDihedralAngle = dihedralAngle;
		dihedralAngle = newDihedralAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE, oldDihedralAngle, newDihedralAngle);
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
	public void setDihedralAngle(DoubleBaseType newDihedralAngle) {
		if (newDihedralAngle != dihedralAngle) {
			NotificationChain msgs = null;
			if (dihedralAngle != null)
				msgs = ((InternalEObject) dihedralAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE, null, msgs);
			if (newDihedralAngle != null)
				msgs = ((InternalEObject) newDihedralAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE, null, msgs);
			msgs = basicSetDihedralAngle(newDihedralAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE,
					newDihedralAngle, newDihedralAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromSectionUID() {
		return fromSectionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromSectionUID(StringUIDBaseType newFromSectionUID, NotificationChain msgs) {
		StringUIDBaseType oldFromSectionUID = fromSectionUID;
		fromSectionUID = newFromSectionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID, oldFromSectionUID, newFromSectionUID);
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
	public void setFromSectionUID(StringUIDBaseType newFromSectionUID) {
		if (newFromSectionUID != fromSectionUID) {
			NotificationChain msgs = null;
			if (fromSectionUID != null)
				msgs = ((InternalEObject) fromSectionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID, null, msgs);
			if (newFromSectionUID != null)
				msgs = ((InternalEObject) newFromSectionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID, null, msgs);
			msgs = basicSetFromSectionUID(newFromSectionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID,
					newFromSectionUID, newFromSectionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToSectionUID() {
		return toSectionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToSectionUID(StringUIDBaseType newToSectionUID, NotificationChain msgs) {
		StringUIDBaseType oldToSectionUID = toSectionUID;
		toSectionUID = newToSectionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID, oldToSectionUID, newToSectionUID);
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
	public void setToSectionUID(StringUIDBaseType newToSectionUID) {
		if (newToSectionUID != toSectionUID) {
			NotificationChain msgs = null;
			if (toSectionUID != null)
				msgs = ((InternalEObject) toSectionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID, null, msgs);
			if (newToSectionUID != null)
				msgs = ((InternalEObject) newToSectionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID, null, msgs);
			msgs = basicSetToSectionUID(newToSectionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID,
					newToSectionUID, newToSectionUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POSITIONING_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POSITIONING_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.POSITIONING_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.POSITIONING_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE:
			return basicSetSweepAngle(null, msgs);
		case CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE:
			return basicSetDihedralAngle(null, msgs);
		case CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID:
			return basicSetFromSectionUID(null, msgs);
		case CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID:
			return basicSetToSectionUID(null, msgs);
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
		case CpacsPackage.POSITIONING_TYPE__NAME:
			return getName();
		case CpacsPackage.POSITIONING_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.POSITIONING_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE:
			return getSweepAngle();
		case CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE:
			return getDihedralAngle();
		case CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID:
			return getFromSectionUID();
		case CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID:
			return getToSectionUID();
		case CpacsPackage.POSITIONING_TYPE__UID:
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
		case CpacsPackage.POSITIONING_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.POSITIONING_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.POSITIONING_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE:
			setSweepAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE:
			setDihedralAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID:
			setFromSectionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID:
			setToSectionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.POSITIONING_TYPE__UID:
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
		case CpacsPackage.POSITIONING_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.POSITIONING_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.POSITIONING_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE:
			setSweepAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE:
			setDihedralAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID:
			setFromSectionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID:
			setToSectionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.POSITIONING_TYPE__UID:
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
		case CpacsPackage.POSITIONING_TYPE__NAME:
			return name != null;
		case CpacsPackage.POSITIONING_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.POSITIONING_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.POSITIONING_TYPE__SWEEP_ANGLE:
			return sweepAngle != null;
		case CpacsPackage.POSITIONING_TYPE__DIHEDRAL_ANGLE:
			return dihedralAngle != null;
		case CpacsPackage.POSITIONING_TYPE__FROM_SECTION_UID:
			return fromSectionUID != null;
		case CpacsPackage.POSITIONING_TYPE__TO_SECTION_UID:
			return toSectionUID != null;
		case CpacsPackage.POSITIONING_TYPE__UID:
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

} //PositioningTypeImpl
