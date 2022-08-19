/**
 */
package Cpacs.impl;

import Cpacs.CabGeometryType;
import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cab Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabGeometryTypeImpl extends ComplexBaseTypeImpl implements CabGeometryType {
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
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType x;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType z;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType y;

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
	protected CabGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabGeometryType();
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
					CpacsPackage.CAB_GEOMETRY_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__NAME, newName,
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
					CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(StringVectorBaseType newX, NotificationChain msgs) {
		StringVectorBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__X, oldX, newX);
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
	public void setX(StringVectorBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(StringVectorBaseType newZ, NotificationChain msgs) {
		StringVectorBaseType oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__Z, oldZ, newZ);
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
	public void setZ(StringVectorBaseType newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject) z).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__Z, newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(StringVectorBaseType newY, NotificationChain msgs) {
		StringVectorBaseType oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__Y, oldY, newY);
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
	public void setY(StringVectorBaseType newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject) y).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__Y, newY, newY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__Y:
			return basicSetY(null, msgs);
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			return getName();
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			return getX();
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			return getZ();
		case CpacsPackage.CAB_GEOMETRY_TYPE__Y:
			return getY();
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			setX((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			setZ((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Y:
			setY((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			setX((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			setZ((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Y:
			setY((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			return name != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			return x != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			return z != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Y:
			return y != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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

} //CabGeometryTypeImpl
