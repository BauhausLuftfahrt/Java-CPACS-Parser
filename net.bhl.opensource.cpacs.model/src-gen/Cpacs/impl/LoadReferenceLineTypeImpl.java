/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadReferenceLineType;
import Cpacs.LoadReferencePointType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Reference Line Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadReferenceLineTypeImpl#getLoadReferencePoint <em>Load Reference Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadReferenceLineTypeImpl extends ComplexBaseTypeImpl implements LoadReferenceLineType {
	/**
	 * The cached value of the '{@link #getLoadReferencePoint() <em>Load Reference Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadReferencePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadReferencePointType> loadReferencePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadReferenceLineTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadReferenceLineType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadReferencePointType> getLoadReferencePoint() {
		if (loadReferencePoint == null) {
			loadReferencePoint = new EObjectContainmentEList<LoadReferencePointType>(LoadReferencePointType.class, this,
					CpacsPackage.LOAD_REFERENCE_LINE_TYPE__LOAD_REFERENCE_POINT);
		}
		return loadReferencePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_REFERENCE_LINE_TYPE__LOAD_REFERENCE_POINT:
			return ((InternalEList<?>) getLoadReferencePoint()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOAD_REFERENCE_LINE_TYPE__LOAD_REFERENCE_POINT:
			return getLoadReferencePoint();
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
		case CpacsPackage.LOAD_REFERENCE_LINE_TYPE__LOAD_REFERENCE_POINT:
			getLoadReferencePoint().clear();
			getLoadReferencePoint().addAll((Collection<? extends LoadReferencePointType>) newValue);
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
		case CpacsPackage.LOAD_REFERENCE_LINE_TYPE__LOAD_REFERENCE_POINT:
			getLoadReferencePoint().clear();
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
		case CpacsPackage.LOAD_REFERENCE_LINE_TYPE__LOAD_REFERENCE_POINT:
			return loadReferencePoint != null && !loadReferencePoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadReferenceLineTypeImpl
