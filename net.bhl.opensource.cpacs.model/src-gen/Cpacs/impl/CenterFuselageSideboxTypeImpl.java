/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageSideboxType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Fuselage Sidebox Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageSideboxTypeImpl#getSideboxWidthFactor <em>Sidebox Width Factor</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageSideboxTypeImpl#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageSideboxTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageSideboxTypeImpl extends ComplexBaseTypeImpl implements CenterFuselageSideboxType {
	/**
	 * The cached value of the '{@link #getSideboxWidthFactor() <em>Sidebox Width Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideboxWidthFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sideboxWidthFactor;

	/**
	 * The cached value of the '{@link #getSheetElementUID() <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sheetElementUID;

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
	protected CenterFuselageSideboxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageSideboxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSideboxWidthFactor() {
		return sideboxWidthFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSideboxWidthFactor(DoubleBaseType newSideboxWidthFactor, NotificationChain msgs) {
		DoubleBaseType oldSideboxWidthFactor = sideboxWidthFactor;
		sideboxWidthFactor = newSideboxWidthFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR, oldSideboxWidthFactor,
					newSideboxWidthFactor);
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
	public void setSideboxWidthFactor(DoubleBaseType newSideboxWidthFactor) {
		if (newSideboxWidthFactor != sideboxWidthFactor) {
			NotificationChain msgs = null;
			if (sideboxWidthFactor != null)
				msgs = ((InternalEObject) sideboxWidthFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR, null,
						msgs);
			if (newSideboxWidthFactor != null)
				msgs = ((InternalEObject) newSideboxWidthFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR, null,
						msgs);
			msgs = basicSetSideboxWidthFactor(newSideboxWidthFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR, newSideboxWidthFactor,
					newSideboxWidthFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSheetElementUID() {
		return sheetElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetElementUID(StringUIDBaseType newSheetElementUID, NotificationChain msgs) {
		StringUIDBaseType oldSheetElementUID = sheetElementUID;
		sheetElementUID = newSheetElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID, oldSheetElementUID,
					newSheetElementUID);
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
	public void setSheetElementUID(StringUIDBaseType newSheetElementUID) {
		if (newSheetElementUID != sheetElementUID) {
			NotificationChain msgs = null;
			if (sheetElementUID != null)
				msgs = ((InternalEObject) sheetElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID, null,
						msgs);
			if (newSheetElementUID != null)
				msgs = ((InternalEObject) newSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID, null,
						msgs);
			msgs = basicSetSheetElementUID(newSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID, newSheetElementUID,
					newSheetElementUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR:
			return basicSetSideboxWidthFactor(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID:
			return basicSetSheetElementUID(null, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR:
			return getSideboxWidthFactor();
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID:
			return getSheetElementUID();
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR:
			setSideboxWidthFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR:
			setSideboxWidthFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SIDEBOX_WIDTH_FACTOR:
			return sideboxWidthFactor != null;
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__SHEET_ELEMENT_UID:
			return sheetElementUID != null;
		case CpacsPackage.CENTER_FUSELAGE_SIDEBOX_TYPE__UID:
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

} //CenterFuselageSideboxTypeImpl
