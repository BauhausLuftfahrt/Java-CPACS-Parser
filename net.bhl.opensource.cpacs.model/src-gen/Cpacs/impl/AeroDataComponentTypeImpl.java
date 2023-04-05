/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseCoefficientsType;
import Cpacs.AeroDataComponentType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Data Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroDataComponentTypeImpl#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroDataComponentTypeImpl#getCoefficients <em>Coefficients</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroDataComponentTypeImpl extends ComplexBaseTypeImpl implements AeroDataComponentType {
	/**
	 * The cached value of the '{@link #getComponentUID() <em>Component UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType componentUID;

	/**
	 * The cached value of the '{@link #getCoefficients() <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficients()
	 * @generated
	 * @ordered
	 */
	protected AeroCaseCoefficientsType coefficients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroDataComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroDataComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getComponentUID() {
		return componentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentUID(StringUIDBaseType newComponentUID, NotificationChain msgs) {
		StringUIDBaseType oldComponentUID = componentUID;
		componentUID = newComponentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID, oldComponentUID, newComponentUID);
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
	public void setComponentUID(StringUIDBaseType newComponentUID) {
		if (newComponentUID != componentUID) {
			NotificationChain msgs = null;
			if (componentUID != null)
				msgs = ((InternalEObject) componentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID, null, msgs);
			if (newComponentUID != null)
				msgs = ((InternalEObject) newComponentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID, null, msgs);
			msgs = basicSetComponentUID(newComponentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID,
					newComponentUID, newComponentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroCaseCoefficientsType getCoefficients() {
		return coefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoefficients(AeroCaseCoefficientsType newCoefficients, NotificationChain msgs) {
		AeroCaseCoefficientsType oldCoefficients = coefficients;
		coefficients = newCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS, oldCoefficients, newCoefficients);
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
	public void setCoefficients(AeroCaseCoefficientsType newCoefficients) {
		if (newCoefficients != coefficients) {
			NotificationChain msgs = null;
			if (coefficients != null)
				msgs = ((InternalEObject) coefficients).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS, null, msgs);
			if (newCoefficients != null)
				msgs = ((InternalEObject) newCoefficients).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS, null, msgs);
			msgs = basicSetCoefficients(newCoefficients, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS,
					newCoefficients, newCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID:
			return basicSetComponentUID(null, msgs);
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS:
			return basicSetCoefficients(null, msgs);
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
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID:
			return getComponentUID();
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS:
			return getCoefficients();
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
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) newValue);
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
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS:
			setCoefficients((AeroCaseCoefficientsType) null);
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
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COMPONENT_UID:
			return componentUID != null;
		case CpacsPackage.AERO_DATA_COMPONENT_TYPE__COEFFICIENTS:
			return coefficients != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroDataComponentTypeImpl
