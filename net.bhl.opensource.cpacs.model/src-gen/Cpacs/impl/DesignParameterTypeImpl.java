/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DesignParameterType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DesignParameterTypeImpl#getParameterUID <em>Parameter UID</em>}</li>
 *   <li>{@link Cpacs.impl.DesignParameterTypeImpl#getValues <em>Values</em>}</li>
 *   <li>{@link Cpacs.impl.DesignParameterTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignParameterTypeImpl extends ComplexBaseTypeImpl implements DesignParameterType {
	/**
	 * The cached value of the '{@link #getParameterUID() <em>Parameter UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parameterUID;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType values;

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
	protected DesignParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDesignParameterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParameterUID() {
		return parameterUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterUID(StringUIDBaseType newParameterUID, NotificationChain msgs) {
		StringUIDBaseType oldParameterUID = parameterUID;
		parameterUID = newParameterUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID, oldParameterUID, newParameterUID);
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
	public void setParameterUID(StringUIDBaseType newParameterUID) {
		if (newParameterUID != parameterUID) {
			NotificationChain msgs = null;
			if (parameterUID != null)
				msgs = ((InternalEObject) parameterUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID, null, msgs);
			if (newParameterUID != null)
				msgs = ((InternalEObject) newParameterUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID, null, msgs);
			msgs = basicSetParameterUID(newParameterUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID,
					newParameterUID, newParameterUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getValues() {
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValues(StringVectorBaseType newValues, NotificationChain msgs) {
		StringVectorBaseType oldValues = values;
		values = newValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES, oldValues, newValues);
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
	public void setValues(StringVectorBaseType newValues) {
		if (newValues != values) {
			NotificationChain msgs = null;
			if (values != null)
				msgs = ((InternalEObject) values).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES, null, msgs);
			if (newValues != null)
				msgs = ((InternalEObject) newValues).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES, null, msgs);
			msgs = basicSetValues(newValues, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES, newValues,
					newValues));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_PARAMETER_TYPE__UID, oldUID,
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
		case CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID:
			return basicSetParameterUID(null, msgs);
		case CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES:
			return basicSetValues(null, msgs);
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
		case CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID:
			return getParameterUID();
		case CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES:
			return getValues();
		case CpacsPackage.DESIGN_PARAMETER_TYPE__UID:
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
		case CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID:
			setParameterUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES:
			setValues((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DESIGN_PARAMETER_TYPE__UID:
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
		case CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID:
			setParameterUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES:
			setValues((StringVectorBaseType) null);
			return;
		case CpacsPackage.DESIGN_PARAMETER_TYPE__UID:
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
		case CpacsPackage.DESIGN_PARAMETER_TYPE__PARAMETER_UID:
			return parameterUID != null;
		case CpacsPackage.DESIGN_PARAMETER_TYPE__VALUES:
			return values != null;
		case CpacsPackage.DESIGN_PARAMETER_TYPE__UID:
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

} //DesignParameterTypeImpl
