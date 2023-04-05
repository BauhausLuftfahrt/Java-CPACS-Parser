/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LinerType;
import Cpacs.TypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Liner Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LinerTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.LinerTypeImpl#getIntakeLength <em>Intake Length</em>}</li>
 *   <li>{@link Cpacs.impl.LinerTypeImpl#getBypassLength <em>Bypass Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinerTypeImpl extends ComplexBaseTypeImpl implements LinerType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type;

	/**
	 * The cached value of the '{@link #getIntakeLength() <em>Intake Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntakeLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType intakeLength;

	/**
	 * The cached value of the '{@link #getBypassLength() <em>Bypass Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBypassLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType bypassLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLinerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType newType, NotificationChain msgs) {
		TypeType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LINER_TYPE__TYPE, oldType, newType);
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
	public void setType(TypeType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LINER_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LINER_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LINER_TYPE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getIntakeLength() {
		return intakeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntakeLength(DoubleBaseType newIntakeLength, NotificationChain msgs) {
		DoubleBaseType oldIntakeLength = intakeLength;
		intakeLength = newIntakeLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LINER_TYPE__INTAKE_LENGTH, oldIntakeLength, newIntakeLength);
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
	public void setIntakeLength(DoubleBaseType newIntakeLength) {
		if (newIntakeLength != intakeLength) {
			NotificationChain msgs = null;
			if (intakeLength != null)
				msgs = ((InternalEObject) intakeLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LINER_TYPE__INTAKE_LENGTH, null, msgs);
			if (newIntakeLength != null)
				msgs = ((InternalEObject) newIntakeLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LINER_TYPE__INTAKE_LENGTH, null, msgs);
			msgs = basicSetIntakeLength(newIntakeLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LINER_TYPE__INTAKE_LENGTH,
					newIntakeLength, newIntakeLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getBypassLength() {
		return bypassLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBypassLength(DoubleBaseType newBypassLength, NotificationChain msgs) {
		DoubleBaseType oldBypassLength = bypassLength;
		bypassLength = newBypassLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LINER_TYPE__BYPASS_LENGTH, oldBypassLength, newBypassLength);
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
	public void setBypassLength(DoubleBaseType newBypassLength) {
		if (newBypassLength != bypassLength) {
			NotificationChain msgs = null;
			if (bypassLength != null)
				msgs = ((InternalEObject) bypassLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LINER_TYPE__BYPASS_LENGTH, null, msgs);
			if (newBypassLength != null)
				msgs = ((InternalEObject) newBypassLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LINER_TYPE__BYPASS_LENGTH, null, msgs);
			msgs = basicSetBypassLength(newBypassLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LINER_TYPE__BYPASS_LENGTH,
					newBypassLength, newBypassLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LINER_TYPE__TYPE:
			return basicSetType(null, msgs);
		case CpacsPackage.LINER_TYPE__INTAKE_LENGTH:
			return basicSetIntakeLength(null, msgs);
		case CpacsPackage.LINER_TYPE__BYPASS_LENGTH:
			return basicSetBypassLength(null, msgs);
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
		case CpacsPackage.LINER_TYPE__TYPE:
			return getType();
		case CpacsPackage.LINER_TYPE__INTAKE_LENGTH:
			return getIntakeLength();
		case CpacsPackage.LINER_TYPE__BYPASS_LENGTH:
			return getBypassLength();
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
		case CpacsPackage.LINER_TYPE__TYPE:
			setType((TypeType) newValue);
			return;
		case CpacsPackage.LINER_TYPE__INTAKE_LENGTH:
			setIntakeLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LINER_TYPE__BYPASS_LENGTH:
			setBypassLength((DoubleBaseType) newValue);
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
		case CpacsPackage.LINER_TYPE__TYPE:
			setType((TypeType) null);
			return;
		case CpacsPackage.LINER_TYPE__INTAKE_LENGTH:
			setIntakeLength((DoubleBaseType) null);
			return;
		case CpacsPackage.LINER_TYPE__BYPASS_LENGTH:
			setBypassLength((DoubleBaseType) null);
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
		case CpacsPackage.LINER_TYPE__TYPE:
			return type != null;
		case CpacsPackage.LINER_TYPE__INTAKE_LENGTH:
			return intakeLength != null;
		case CpacsPackage.LINER_TYPE__BYPASS_LENGTH:
			return bypassLength != null;
		}
		return super.eIsSet(featureID);
	}

} //LinerTypeImpl
