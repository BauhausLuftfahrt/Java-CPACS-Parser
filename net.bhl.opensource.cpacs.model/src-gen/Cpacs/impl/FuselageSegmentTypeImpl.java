/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuselageSegmentType;
import Cpacs.GuideCurvesType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageSegmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentTypeImpl#getFromElementUID <em>From Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentTypeImpl#getToElementUID <em>To Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentTypeImpl#getGuideCurves <em>Guide Curves</em>}</li>
 *   <li>{@link Cpacs.impl.FuselageSegmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageSegmentTypeImpl extends ComplexBaseTypeImpl implements FuselageSegmentType {
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
	 * The cached value of the '{@link #getFromElementUID() <em>From Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromElementUID;

	/**
	 * The cached value of the '{@link #getToElementUID() <em>To Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toElementUID;

	/**
	 * The cached value of the '{@link #getGuideCurves() <em>Guide Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideCurves()
	 * @generated
	 * @ordered
	 */
	protected GuideCurvesType guideCurves;

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
	protected FuselageSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageSegmentType();
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
					CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME, newName,
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
					CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromElementUID() {
		return fromElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromElementUID(StringUIDBaseType newFromElementUID, NotificationChain msgs) {
		StringUIDBaseType oldFromElementUID = fromElementUID;
		fromElementUID = newFromElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID, oldFromElementUID, newFromElementUID);
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
	public void setFromElementUID(StringUIDBaseType newFromElementUID) {
		if (newFromElementUID != fromElementUID) {
			NotificationChain msgs = null;
			if (fromElementUID != null)
				msgs = ((InternalEObject) fromElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID, null, msgs);
			if (newFromElementUID != null)
				msgs = ((InternalEObject) newFromElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID, null, msgs);
			msgs = basicSetFromElementUID(newFromElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID,
					newFromElementUID, newFromElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToElementUID() {
		return toElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToElementUID(StringUIDBaseType newToElementUID, NotificationChain msgs) {
		StringUIDBaseType oldToElementUID = toElementUID;
		toElementUID = newToElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID, oldToElementUID, newToElementUID);
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
	public void setToElementUID(StringUIDBaseType newToElementUID) {
		if (newToElementUID != toElementUID) {
			NotificationChain msgs = null;
			if (toElementUID != null)
				msgs = ((InternalEObject) toElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID, null, msgs);
			if (newToElementUID != null)
				msgs = ((InternalEObject) newToElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID, null, msgs);
			msgs = basicSetToElementUID(newToElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID,
					newToElementUID, newToElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideCurvesType getGuideCurves() {
		return guideCurves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuideCurves(GuideCurvesType newGuideCurves, NotificationChain msgs) {
		GuideCurvesType oldGuideCurves = guideCurves;
		guideCurves = newGuideCurves;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES, oldGuideCurves, newGuideCurves);
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
	public void setGuideCurves(GuideCurvesType newGuideCurves) {
		if (newGuideCurves != guideCurves) {
			NotificationChain msgs = null;
			if (guideCurves != null)
				msgs = ((InternalEObject) guideCurves).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES, null, msgs);
			if (newGuideCurves != null)
				msgs = ((InternalEObject) newGuideCurves).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES, null, msgs);
			msgs = basicSetGuideCurves(newGuideCurves, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES,
					newGuideCurves, newGuideCurves));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FUSELAGE_SEGMENT_TYPE__UID, oldUID,
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
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID:
			return basicSetFromElementUID(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID:
			return basicSetToElementUID(null, msgs);
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES:
			return basicSetGuideCurves(null, msgs);
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
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID:
			return getFromElementUID();
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID:
			return getToElementUID();
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES:
			return getGuideCurves();
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID:
			setFromElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID:
			setToElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES:
			setGuideCurves((GuideCurvesType) newValue);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID:
			setFromElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID:
			setToElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES:
			setGuideCurves((GuideCurvesType) null);
			return;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__UID:
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
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__FROM_ELEMENT_UID:
			return fromElementUID != null;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__TO_ELEMENT_UID:
			return toElementUID != null;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__GUIDE_CURVES:
			return guideCurves != null;
		case CpacsPackage.FUSELAGE_SEGMENT_TYPE__UID:
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

} //FuselageSegmentTypeImpl
