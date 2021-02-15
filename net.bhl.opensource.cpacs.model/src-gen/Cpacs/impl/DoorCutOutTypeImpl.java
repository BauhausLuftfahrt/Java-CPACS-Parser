/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorCutOutType;
import Cpacs.DoubleBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DoorCutOutTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.DoorCutOutTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.DoorCutOutTypeImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link Cpacs.impl.DoorCutOutTypeImpl#getDssDesignUID <em>Dss Design UID</em>}</li>
 *   <li>{@link Cpacs.impl.DoorCutOutTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorCutOutTypeImpl extends ComplexBaseTypeImpl implements DoorCutOutType {
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
	 * The cached value of the '{@link #getFilletRadius() <em>Fillet Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType filletRadius;

	/**
	 * The cached value of the '{@link #getDssDesignUID() <em>Dss Design UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDssDesignUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType dssDesignUID;

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
	protected DoorCutOutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDoorCutOutType();
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
					CpacsPackage.DOOR_CUT_OUT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_CUT_OUT_TYPE__NAME, newName,
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
					CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFilletRadius() {
		return filletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilletRadius(DoubleBaseType newFilletRadius, NotificationChain msgs) {
		DoubleBaseType oldFilletRadius = filletRadius;
		filletRadius = newFilletRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS, oldFilletRadius, newFilletRadius);
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
	public void setFilletRadius(DoubleBaseType newFilletRadius) {
		if (newFilletRadius != filletRadius) {
			NotificationChain msgs = null;
			if (filletRadius != null)
				msgs = ((InternalEObject) filletRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS, null, msgs);
			if (newFilletRadius != null)
				msgs = ((InternalEObject) newFilletRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS, null, msgs);
			msgs = basicSetFilletRadius(newFilletRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS,
					newFilletRadius, newFilletRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDssDesignUID() {
		return dssDesignUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDssDesignUID(StringUIDBaseType newDssDesignUID, NotificationChain msgs) {
		StringUIDBaseType oldDssDesignUID = dssDesignUID;
		dssDesignUID = newDssDesignUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID, oldDssDesignUID, newDssDesignUID);
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
	public void setDssDesignUID(StringUIDBaseType newDssDesignUID) {
		if (newDssDesignUID != dssDesignUID) {
			NotificationChain msgs = null;
			if (dssDesignUID != null)
				msgs = ((InternalEObject) dssDesignUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID, null, msgs);
			if (newDssDesignUID != null)
				msgs = ((InternalEObject) newDssDesignUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID, null, msgs);
			msgs = basicSetDssDesignUID(newDssDesignUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID,
					newDssDesignUID, newDssDesignUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_CUT_OUT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DOOR_CUT_OUT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS:
			return basicSetFilletRadius(null, msgs);
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID:
			return basicSetDssDesignUID(null, msgs);
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
		case CpacsPackage.DOOR_CUT_OUT_TYPE__NAME:
			return getName();
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS:
			return getFilletRadius();
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID:
			return getDssDesignUID();
		case CpacsPackage.DOOR_CUT_OUT_TYPE__UID:
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
		case CpacsPackage.DOOR_CUT_OUT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS:
			setFilletRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID:
			setDssDesignUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__UID:
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
		case CpacsPackage.DOOR_CUT_OUT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS:
			setFilletRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID:
			setDssDesignUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__UID:
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
		case CpacsPackage.DOOR_CUT_OUT_TYPE__NAME:
			return name != null;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__FILLET_RADIUS:
			return filletRadius != null;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__DSS_DESIGN_UID:
			return dssDesignUID != null;
		case CpacsPackage.DOOR_CUT_OUT_TYPE__UID:
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

} //DoorCutOutTypeImpl
