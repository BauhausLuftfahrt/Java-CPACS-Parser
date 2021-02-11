/**
 */
package Cpacs.impl;

import Cpacs.BogieAxleType;
import Cpacs.BogieAxlesType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bogie Axles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BogieAxlesTypeImpl#getAxle <em>Axle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BogieAxlesTypeImpl extends ComplexBaseTypeImpl implements BogieAxlesType {
	/**
	 * The cached value of the '{@link #getAxle() <em>Axle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxle()
	 * @generated
	 * @ordered
	 */
	protected EList<BogieAxleType> axle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BogieAxlesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBogieAxlesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BogieAxleType> getAxle() {
		if (axle == null) {
			axle = new EObjectContainmentEList<BogieAxleType>(BogieAxleType.class, this,
					CpacsPackage.BOGIE_AXLES_TYPE__AXLE);
		}
		return axle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BOGIE_AXLES_TYPE__AXLE:
			return ((InternalEList<?>) getAxle()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.BOGIE_AXLES_TYPE__AXLE:
			return getAxle();
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
		case CpacsPackage.BOGIE_AXLES_TYPE__AXLE:
			getAxle().clear();
			getAxle().addAll((Collection<? extends BogieAxleType>) newValue);
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
		case CpacsPackage.BOGIE_AXLES_TYPE__AXLE:
			getAxle().clear();
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
		case CpacsPackage.BOGIE_AXLES_TYPE__AXLE:
			return axle != null && !axle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BogieAxlesTypeImpl
