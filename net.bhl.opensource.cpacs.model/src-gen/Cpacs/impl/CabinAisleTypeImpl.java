/**
 */
package Cpacs.impl;

import Cpacs.CabinAisleType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Aisle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinAisleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CabinAisleTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CabinAisleTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CabinAisleTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.CabinAisleTypeImpl#getWidthY <em>Width Y</em>}</li>
 *   <li>{@link Cpacs.impl.CabinAisleTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinAisleTypeImpl extends ComplexBaseTypeImpl implements CabinAisleType {
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
	protected DoubleVectorBaseType x;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType y;

	/**
	 * The cached value of the '{@link #getWidthY() <em>Width Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthY()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType widthY;

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
	protected CabinAisleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinAisleType();
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
					CpacsPackage.CABIN_AISLE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_AISLE_TYPE__NAME, newName,
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
					CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(DoubleVectorBaseType newX, NotificationChain msgs) {
		DoubleVectorBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_AISLE_TYPE__X, oldX, newX);
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
	public void setX(DoubleVectorBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_AISLE_TYPE__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(DoubleVectorBaseType newY, NotificationChain msgs) {
		DoubleVectorBaseType oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_AISLE_TYPE__Y, oldY, newY);
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
	public void setY(DoubleVectorBaseType newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject) y).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_AISLE_TYPE__Y, newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getWidthY() {
		return widthY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidthY(DoubleVectorBaseType newWidthY, NotificationChain msgs) {
		DoubleVectorBaseType oldWidthY = widthY;
		widthY = newWidthY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y, oldWidthY, newWidthY);
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
	public void setWidthY(DoubleVectorBaseType newWidthY) {
		if (newWidthY != widthY) {
			NotificationChain msgs = null;
			if (widthY != null)
				msgs = ((InternalEObject) widthY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y, null, msgs);
			if (newWidthY != null)
				msgs = ((InternalEObject) newWidthY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y, null, msgs);
			msgs = basicSetWidthY(newWidthY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y, newWidthY,
					newWidthY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_AISLE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CABIN_AISLE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CABIN_AISLE_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CABIN_AISLE_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y:
			return basicSetWidthY(null, msgs);
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
		case CpacsPackage.CABIN_AISLE_TYPE__NAME:
			return getName();
		case CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CABIN_AISLE_TYPE__X:
			return getX();
		case CpacsPackage.CABIN_AISLE_TYPE__Y:
			return getY();
		case CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y:
			return getWidthY();
		case CpacsPackage.CABIN_AISLE_TYPE__UID:
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
		case CpacsPackage.CABIN_AISLE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__X:
			setX((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__Y:
			setY((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y:
			setWidthY((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__UID:
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
		case CpacsPackage.CABIN_AISLE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__X:
			setX((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__Y:
			setY((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y:
			setWidthY((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CABIN_AISLE_TYPE__UID:
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
		case CpacsPackage.CABIN_AISLE_TYPE__NAME:
			return name != null;
		case CpacsPackage.CABIN_AISLE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CABIN_AISLE_TYPE__X:
			return x != null;
		case CpacsPackage.CABIN_AISLE_TYPE__Y:
			return y != null;
		case CpacsPackage.CABIN_AISLE_TYPE__WIDTH_Y:
			return widthY != null;
		case CpacsPackage.CABIN_AISLE_TYPE__UID:
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

} //CabinAisleTypeImpl
