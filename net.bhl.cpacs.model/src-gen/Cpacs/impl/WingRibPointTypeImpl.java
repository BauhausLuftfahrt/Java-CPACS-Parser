/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingRibPointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Rib Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingRibPointTypeImpl#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibPointTypeImpl#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibPointTypeImpl#getXsi <em>Xsi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingRibPointTypeImpl extends ComplexBaseTypeImpl implements WingRibPointType {
	/**
	 * The cached value of the '{@link #getRibDefinitionUID() <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibDefinitionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType ribDefinitionUID;

	/**
	 * The cached value of the '{@link #getRibNumber() <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibNumber()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType ribNumber;

	/**
	 * The cached value of the '{@link #getXsi() <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingRibPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingRibPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRibDefinitionUID() {
		return ribDefinitionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibDefinitionUID(StringUIDBaseType newRibDefinitionUID, NotificationChain msgs) {
		StringUIDBaseType oldRibDefinitionUID = ribDefinitionUID;
		ribDefinitionUID = newRibDefinitionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID, oldRibDefinitionUID, newRibDefinitionUID);
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
	public void setRibDefinitionUID(StringUIDBaseType newRibDefinitionUID) {
		if (newRibDefinitionUID != ribDefinitionUID) {
			NotificationChain msgs = null;
			if (ribDefinitionUID != null)
				msgs = ((InternalEObject) ribDefinitionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID, null, msgs);
			if (newRibDefinitionUID != null)
				msgs = ((InternalEObject) newRibDefinitionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID, null, msgs);
			msgs = basicSetRibDefinitionUID(newRibDefinitionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID,
					newRibDefinitionUID, newRibDefinitionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getRibNumber() {
		return ribNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibNumber(IntegerBaseType newRibNumber, NotificationChain msgs) {
		IntegerBaseType oldRibNumber = ribNumber;
		ribNumber = newRibNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER, oldRibNumber, newRibNumber);
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
	public void setRibNumber(IntegerBaseType newRibNumber) {
		if (newRibNumber != ribNumber) {
			NotificationChain msgs = null;
			if (ribNumber != null)
				msgs = ((InternalEObject) ribNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER, null, msgs);
			if (newRibNumber != null)
				msgs = ((InternalEObject) newRibNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER, null, msgs);
			msgs = basicSetRibNumber(newRibNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER,
					newRibNumber, newRibNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsi() {
		return xsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsi(DoubleBaseType newXsi, NotificationChain msgs) {
		DoubleBaseType oldXsi = xsi;
		xsi = newXsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_POINT_TYPE__XSI, oldXsi, newXsi);
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
	public void setXsi(DoubleBaseType newXsi) {
		if (newXsi != xsi) {
			NotificationChain msgs = null;
			if (xsi != null)
				msgs = ((InternalEObject) xsi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_POINT_TYPE__XSI, null, msgs);
			if (newXsi != null)
				msgs = ((InternalEObject) newXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_POINT_TYPE__XSI, null, msgs);
			msgs = basicSetXsi(newXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_POINT_TYPE__XSI, newXsi,
					newXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID:
			return basicSetRibDefinitionUID(null, msgs);
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER:
			return basicSetRibNumber(null, msgs);
		case CpacsPackage.WING_RIB_POINT_TYPE__XSI:
			return basicSetXsi(null, msgs);
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
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID:
			return getRibDefinitionUID();
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER:
			return getRibNumber();
		case CpacsPackage.WING_RIB_POINT_TYPE__XSI:
			return getXsi();
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
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) newValue);
			return;
		case CpacsPackage.WING_RIB_POINT_TYPE__XSI:
			setXsi((DoubleBaseType) newValue);
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
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID:
			setRibDefinitionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) null);
			return;
		case CpacsPackage.WING_RIB_POINT_TYPE__XSI:
			setXsi((DoubleBaseType) null);
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
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_DEFINITION_UID:
			return ribDefinitionUID != null;
		case CpacsPackage.WING_RIB_POINT_TYPE__RIB_NUMBER:
			return ribNumber != null;
		case CpacsPackage.WING_RIB_POINT_TYPE__XSI:
			return xsi != null;
		}
		return super.eIsSet(featureID);
	}

} //WingRibPointTypeImpl
