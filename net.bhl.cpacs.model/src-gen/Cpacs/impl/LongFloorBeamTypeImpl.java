/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LongFloorBeamPositionType;
import Cpacs.LongFloorBeamType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Floor Beam Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LongFloorBeamTypeImpl#getLongFloorBeamPosition <em>Long Floor Beam Position</em>}</li>
 *   <li>{@link Cpacs.impl.LongFloorBeamTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LongFloorBeamTypeImpl extends ComplexBaseTypeImpl implements LongFloorBeamType {
	/**
	 * The cached value of the '{@link #getLongFloorBeamPosition() <em>Long Floor Beam Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFloorBeamPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<LongFloorBeamPositionType> longFloorBeamPosition;

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
	protected LongFloorBeamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLongFloorBeamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LongFloorBeamPositionType> getLongFloorBeamPosition() {
		if (longFloorBeamPosition == null) {
			longFloorBeamPosition = new EObjectContainmentEList<LongFloorBeamPositionType>(
					LongFloorBeamPositionType.class, this, CpacsPackage.LONG_FLOOR_BEAM_TYPE__LONG_FLOOR_BEAM_POSITION);
		}
		return longFloorBeamPosition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LONG_FLOOR_BEAM_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__LONG_FLOOR_BEAM_POSITION:
			return ((InternalEList<?>) getLongFloorBeamPosition()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__LONG_FLOOR_BEAM_POSITION:
			return getLongFloorBeamPosition();
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__UID:
			return getUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__LONG_FLOOR_BEAM_POSITION:
			getLongFloorBeamPosition().clear();
			getLongFloorBeamPosition().addAll((Collection<? extends LongFloorBeamPositionType>) newValue);
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__UID:
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
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__LONG_FLOOR_BEAM_POSITION:
			getLongFloorBeamPosition().clear();
			return;
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__UID:
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
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__LONG_FLOOR_BEAM_POSITION:
			return longFloorBeamPosition != null && !longFloorBeamPosition.isEmpty();
		case CpacsPackage.LONG_FLOOR_BEAM_TYPE__UID:
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

} //LongFloorBeamTypeImpl
