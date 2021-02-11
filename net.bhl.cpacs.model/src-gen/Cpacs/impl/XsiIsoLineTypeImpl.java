/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.XsiIsoLineType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xsi Iso Line Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.XsiIsoLineTypeImpl#getXsi <em>Xsi</em>}</li>
 *   <li>{@link Cpacs.impl.XsiIsoLineTypeImpl#getReferenceUID <em>Reference UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XsiIsoLineTypeImpl extends ComplexBaseTypeImpl implements XsiIsoLineType {
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
	 * The cached value of the '{@link #getReferenceUID() <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType referenceUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XsiIsoLineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getXsiIsoLineType();
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
					CpacsPackage.XSI_ISO_LINE_TYPE__XSI, oldXsi, newXsi);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.XSI_ISO_LINE_TYPE__XSI, null, msgs);
			if (newXsi != null)
				msgs = ((InternalEObject) newXsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.XSI_ISO_LINE_TYPE__XSI, null, msgs);
			msgs = basicSetXsi(newXsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.XSI_ISO_LINE_TYPE__XSI, newXsi, newXsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReferenceUID() {
		return referenceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceUID(StringUIDBaseType newReferenceUID, NotificationChain msgs) {
		StringUIDBaseType oldReferenceUID = referenceUID;
		referenceUID = newReferenceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID, oldReferenceUID, newReferenceUID);
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
	public void setReferenceUID(StringUIDBaseType newReferenceUID) {
		if (newReferenceUID != referenceUID) {
			NotificationChain msgs = null;
			if (referenceUID != null)
				msgs = ((InternalEObject) referenceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID, null, msgs);
			if (newReferenceUID != null)
				msgs = ((InternalEObject) newReferenceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID, null, msgs);
			msgs = basicSetReferenceUID(newReferenceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID,
					newReferenceUID, newReferenceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.XSI_ISO_LINE_TYPE__XSI:
			return basicSetXsi(null, msgs);
		case CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID:
			return basicSetReferenceUID(null, msgs);
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
		case CpacsPackage.XSI_ISO_LINE_TYPE__XSI:
			return getXsi();
		case CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID:
			return getReferenceUID();
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
		case CpacsPackage.XSI_ISO_LINE_TYPE__XSI:
			setXsi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID:
			setReferenceUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.XSI_ISO_LINE_TYPE__XSI:
			setXsi((DoubleBaseType) null);
			return;
		case CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID:
			setReferenceUID((StringUIDBaseType) null);
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
		case CpacsPackage.XSI_ISO_LINE_TYPE__XSI:
			return xsi != null;
		case CpacsPackage.XSI_ISO_LINE_TYPE__REFERENCE_UID:
			return referenceUID != null;
		}
		return super.eIsSet(featureID);
	}

} //XsiIsoLineTypeImpl
