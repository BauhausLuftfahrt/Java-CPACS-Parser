/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RequirementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RequirementTypeImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link Cpacs.impl.RequirementTypeImpl#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementTypeImpl extends ComplexBaseTypeImpl implements RequirementType {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType required;

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType actual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRequirementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(DoubleBaseType newRequired, NotificationChain msgs) {
		DoubleBaseType oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.REQUIREMENT_TYPE__REQUIRED, oldRequired, newRequired);
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
	public void setRequired(DoubleBaseType newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject) required).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REQUIREMENT_TYPE__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject) newRequired).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REQUIREMENT_TYPE__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.REQUIREMENT_TYPE__REQUIRED, newRequired,
					newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getActual() {
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActual(DoubleBaseType newActual, NotificationChain msgs) {
		DoubleBaseType oldActual = actual;
		actual = newActual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.REQUIREMENT_TYPE__ACTUAL, oldActual, newActual);
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
	public void setActual(DoubleBaseType newActual) {
		if (newActual != actual) {
			NotificationChain msgs = null;
			if (actual != null)
				msgs = ((InternalEObject) actual).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REQUIREMENT_TYPE__ACTUAL, null, msgs);
			if (newActual != null)
				msgs = ((InternalEObject) newActual).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.REQUIREMENT_TYPE__ACTUAL, null, msgs);
			msgs = basicSetActual(newActual, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.REQUIREMENT_TYPE__ACTUAL, newActual,
					newActual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.REQUIREMENT_TYPE__REQUIRED:
			return basicSetRequired(null, msgs);
		case CpacsPackage.REQUIREMENT_TYPE__ACTUAL:
			return basicSetActual(null, msgs);
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
		case CpacsPackage.REQUIREMENT_TYPE__REQUIRED:
			return getRequired();
		case CpacsPackage.REQUIREMENT_TYPE__ACTUAL:
			return getActual();
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
		case CpacsPackage.REQUIREMENT_TYPE__REQUIRED:
			setRequired((DoubleBaseType) newValue);
			return;
		case CpacsPackage.REQUIREMENT_TYPE__ACTUAL:
			setActual((DoubleBaseType) newValue);
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
		case CpacsPackage.REQUIREMENT_TYPE__REQUIRED:
			setRequired((DoubleBaseType) null);
			return;
		case CpacsPackage.REQUIREMENT_TYPE__ACTUAL:
			setActual((DoubleBaseType) null);
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
		case CpacsPackage.REQUIREMENT_TYPE__REQUIRED:
			return required != null;
		case CpacsPackage.REQUIREMENT_TYPE__ACTUAL:
			return actual != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementTypeImpl
