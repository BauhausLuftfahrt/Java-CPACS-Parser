/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.ReleasedStoreType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Released Store Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ReleasedStoreTypeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link Cpacs.impl.ReleasedStoreTypeImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleasedStoreTypeImpl extends ComplexBaseTypeImpl implements ReleasedStoreType {
	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType uID;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType quantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleasedStoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getReleasedStoreType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUID(StringUIDBaseType newUID, NotificationChain msgs) {
		StringUIDBaseType oldUID = uID;
		uID = newUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RELEASED_STORE_TYPE__UID, oldUID, newUID);
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
	public void setUID(StringUIDBaseType newUID) {
		if (newUID != uID) {
			NotificationChain msgs = null;
			if (uID != null)
				msgs = ((InternalEObject) uID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RELEASED_STORE_TYPE__UID, null, msgs);
			if (newUID != null)
				msgs = ((InternalEObject) newUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RELEASED_STORE_TYPE__UID, null, msgs);
			msgs = basicSetUID(newUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RELEASED_STORE_TYPE__UID, newUID,
					newUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(IntegerBaseType newQuantity, NotificationChain msgs) {
		IntegerBaseType oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RELEASED_STORE_TYPE__QUANTITY, oldQuantity, newQuantity);
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
	public void setQuantity(IntegerBaseType newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject) quantity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RELEASED_STORE_TYPE__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject) newQuantity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RELEASED_STORE_TYPE__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RELEASED_STORE_TYPE__QUANTITY,
					newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RELEASED_STORE_TYPE__UID:
			return basicSetUID(null, msgs);
		case CpacsPackage.RELEASED_STORE_TYPE__QUANTITY:
			return basicSetQuantity(null, msgs);
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
		case CpacsPackage.RELEASED_STORE_TYPE__UID:
			return getUID();
		case CpacsPackage.RELEASED_STORE_TYPE__QUANTITY:
			return getQuantity();
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
		case CpacsPackage.RELEASED_STORE_TYPE__UID:
			setUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.RELEASED_STORE_TYPE__QUANTITY:
			setQuantity((IntegerBaseType) newValue);
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
		case CpacsPackage.RELEASED_STORE_TYPE__UID:
			setUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.RELEASED_STORE_TYPE__QUANTITY:
			setQuantity((IntegerBaseType) null);
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
		case CpacsPackage.RELEASED_STORE_TYPE__UID:
			return uID != null;
		case CpacsPackage.RELEASED_STORE_TYPE__QUANTITY:
			return quantity != null;
		}
		return super.eIsSet(featureID);
	}

} //ReleasedStoreTypeImpl
