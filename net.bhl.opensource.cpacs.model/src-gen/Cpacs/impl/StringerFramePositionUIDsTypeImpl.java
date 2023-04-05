/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.StringerFramePositionUIDsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stringer Frame Position UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StringerFramePositionUIDsTypeImpl#getStringerFramePositionUID <em>Stringer Frame Position UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringerFramePositionUIDsTypeImpl extends ComplexBaseTypeImpl implements StringerFramePositionUIDsType {
	/**
	 * The cached value of the '{@link #getStringerFramePositionUID() <em>Stringer Frame Position UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringerFramePositionUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> stringerFramePositionUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringerFramePositionUIDsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStringerFramePositionUIDsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getStringerFramePositionUID() {
		if (stringerFramePositionUID == null) {
			stringerFramePositionUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.STRINGER_FRAME_POSITION_UI_DS_TYPE__STRINGER_FRAME_POSITION_UID);
		}
		return stringerFramePositionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRINGER_FRAME_POSITION_UI_DS_TYPE__STRINGER_FRAME_POSITION_UID:
			return ((InternalEList<?>) getStringerFramePositionUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.STRINGER_FRAME_POSITION_UI_DS_TYPE__STRINGER_FRAME_POSITION_UID:
			return getStringerFramePositionUID();
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
		case CpacsPackage.STRINGER_FRAME_POSITION_UI_DS_TYPE__STRINGER_FRAME_POSITION_UID:
			getStringerFramePositionUID().clear();
			getStringerFramePositionUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
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
		case CpacsPackage.STRINGER_FRAME_POSITION_UI_DS_TYPE__STRINGER_FRAME_POSITION_UID:
			getStringerFramePositionUID().clear();
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
		case CpacsPackage.STRINGER_FRAME_POSITION_UI_DS_TYPE__STRINGER_FRAME_POSITION_UID:
			return stringerFramePositionUID != null && !stringerFramePositionUID.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StringerFramePositionUIDsTypeImpl
