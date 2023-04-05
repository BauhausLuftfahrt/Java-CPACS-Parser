/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RelativeStrutPositionType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Strut Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RelativeStrutPositionTypeImpl#getStrutUID <em>Strut UID</em>}</li>
 *   <li>{@link Cpacs.impl.RelativeStrutPositionTypeImpl#getRelativePosition <em>Relative Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeStrutPositionTypeImpl extends MinimalEObjectImpl.Container implements RelativeStrutPositionType {
	/**
	 * The cached value of the '{@link #getStrutUID() <em>Strut UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrutUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType strutUID;

	/**
	 * The default value of the '{@link #getRelativePosition() <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRelativePosition() <em>Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected double relativePosition = RELATIVE_POSITION_EDEFAULT;

	/**
	 * This is true if the Relative Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relativePositionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeStrutPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRelativeStrutPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStrutUID() {
		return strutUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrutUID(StringUIDBaseType newStrutUID, NotificationChain msgs) {
		StringUIDBaseType oldStrutUID = strutUID;
		strutUID = newStrutUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID, oldStrutUID, newStrutUID);
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
	public void setStrutUID(StringUIDBaseType newStrutUID) {
		if (newStrutUID != strutUID) {
			NotificationChain msgs = null;
			if (strutUID != null)
				msgs = ((InternalEObject) strutUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID, null, msgs);
			if (newStrutUID != null)
				msgs = ((InternalEObject) newStrutUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID, null, msgs);
			msgs = basicSetStrutUID(newStrutUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID,
					newStrutUID, newStrutUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRelativePosition() {
		return relativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePosition(double newRelativePosition) {
		double oldRelativePosition = relativePosition;
		relativePosition = newRelativePosition;
		boolean oldRelativePositionESet = relativePositionESet;
		relativePositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__RELATIVE_POSITION, oldRelativePosition, relativePosition,
					!oldRelativePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRelativePosition() {
		double oldRelativePosition = relativePosition;
		boolean oldRelativePositionESet = relativePositionESet;
		relativePosition = RELATIVE_POSITION_EDEFAULT;
		relativePositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__RELATIVE_POSITION, oldRelativePosition,
					RELATIVE_POSITION_EDEFAULT, oldRelativePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelativePosition() {
		return relativePositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID:
			return basicSetStrutUID(null, msgs);
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
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID:
			return getStrutUID();
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__RELATIVE_POSITION:
			return getRelativePosition();
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
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID:
			setStrutUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__RELATIVE_POSITION:
			setRelativePosition((Double) newValue);
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
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID:
			setStrutUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__RELATIVE_POSITION:
			unsetRelativePosition();
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
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__STRUT_UID:
			return strutUID != null;
		case CpacsPackage.RELATIVE_STRUT_POSITION_TYPE__RELATIVE_POSITION:
			return isSetRelativePosition();
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
		result.append(" (relativePosition: ");
		if (relativePositionESet)
			result.append(relativePosition);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RelativeStrutPositionTypeImpl
