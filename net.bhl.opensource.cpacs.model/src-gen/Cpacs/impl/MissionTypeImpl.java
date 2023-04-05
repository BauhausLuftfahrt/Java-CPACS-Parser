/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MissionStartConditionType;
import Cpacs.MissionType;
import Cpacs.StringBaseType;
import Cpacs.UIDSequenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.MissionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.MissionTypeImpl#getStartCondition <em>Start Condition</em>}</li>
 *   <li>{@link Cpacs.impl.MissionTypeImpl#getSegmentBlockUIDs <em>Segment Block UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.MissionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionTypeImpl extends ComplexBaseTypeImpl implements MissionType {
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
	 * The cached value of the '{@link #getStartCondition() <em>Start Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCondition()
	 * @generated
	 * @ordered
	 */
	protected MissionStartConditionType startCondition;

	/**
	 * The cached value of the '{@link #getSegmentBlockUIDs() <em>Segment Block UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentBlockUIDs()
	 * @generated
	 * @ordered
	 */
	protected UIDSequenceType segmentBlockUIDs;

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
	protected MissionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionType();
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
					CpacsPackage.MISSION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_TYPE__NAME, newName, newName));
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
					CpacsPackage.MISSION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionStartConditionType getStartCondition() {
		return startCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartCondition(MissionStartConditionType newStartCondition,
			NotificationChain msgs) {
		MissionStartConditionType oldStartCondition = startCondition;
		startCondition = newStartCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_TYPE__START_CONDITION, oldStartCondition, newStartCondition);
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
	public void setStartCondition(MissionStartConditionType newStartCondition) {
		if (newStartCondition != startCondition) {
			NotificationChain msgs = null;
			if (startCondition != null)
				msgs = ((InternalEObject) startCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__START_CONDITION, null, msgs);
			if (newStartCondition != null)
				msgs = ((InternalEObject) newStartCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__START_CONDITION, null, msgs);
			msgs = basicSetStartCondition(newStartCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_TYPE__START_CONDITION,
					newStartCondition, newStartCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDSequenceType getSegmentBlockUIDs() {
		return segmentBlockUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentBlockUIDs(UIDSequenceType newSegmentBlockUIDs, NotificationChain msgs) {
		UIDSequenceType oldSegmentBlockUIDs = segmentBlockUIDs;
		segmentBlockUIDs = newSegmentBlockUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS, oldSegmentBlockUIDs, newSegmentBlockUIDs);
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
	public void setSegmentBlockUIDs(UIDSequenceType newSegmentBlockUIDs) {
		if (newSegmentBlockUIDs != segmentBlockUIDs) {
			NotificationChain msgs = null;
			if (segmentBlockUIDs != null)
				msgs = ((InternalEObject) segmentBlockUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS, null, msgs);
			if (newSegmentBlockUIDs != null)
				msgs = ((InternalEObject) newSegmentBlockUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS, null, msgs);
			msgs = basicSetSegmentBlockUIDs(newSegmentBlockUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS,
					newSegmentBlockUIDs, newSegmentBlockUIDs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.MISSION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.MISSION_TYPE__START_CONDITION:
			return basicSetStartCondition(null, msgs);
		case CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS:
			return basicSetSegmentBlockUIDs(null, msgs);
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
		case CpacsPackage.MISSION_TYPE__NAME:
			return getName();
		case CpacsPackage.MISSION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.MISSION_TYPE__START_CONDITION:
			return getStartCondition();
		case CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS:
			return getSegmentBlockUIDs();
		case CpacsPackage.MISSION_TYPE__UID:
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
		case CpacsPackage.MISSION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_TYPE__START_CONDITION:
			setStartCondition((MissionStartConditionType) newValue);
			return;
		case CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS:
			setSegmentBlockUIDs((UIDSequenceType) newValue);
			return;
		case CpacsPackage.MISSION_TYPE__UID:
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
		case CpacsPackage.MISSION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_TYPE__START_CONDITION:
			setStartCondition((MissionStartConditionType) null);
			return;
		case CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS:
			setSegmentBlockUIDs((UIDSequenceType) null);
			return;
		case CpacsPackage.MISSION_TYPE__UID:
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
		case CpacsPackage.MISSION_TYPE__NAME:
			return name != null;
		case CpacsPackage.MISSION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.MISSION_TYPE__START_CONDITION:
			return startCondition != null;
		case CpacsPackage.MISSION_TYPE__SEGMENT_BLOCK_UI_DS:
			return segmentBlockUIDs != null;
		case CpacsPackage.MISSION_TYPE__UID:
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

} //MissionTypeImpl
