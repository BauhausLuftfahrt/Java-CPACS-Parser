/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceAirfoilType;
import Cpacs.ControlSurfaceContoursType;
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
 * An implementation of the model object '<em><b>Control Surface Contours Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceContoursTypeImpl#getIntermediateAirfoil <em>Intermediate Airfoil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceContoursTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceContoursType {
	/**
	 * The cached value of the '{@link #getIntermediateAirfoil() <em>Intermediate Airfoil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateAirfoil()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlSurfaceAirfoilType> intermediateAirfoil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceContoursTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceContoursType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlSurfaceAirfoilType> getIntermediateAirfoil() {
		if (intermediateAirfoil == null) {
			intermediateAirfoil = new EObjectContainmentEList<ControlSurfaceAirfoilType>(
					ControlSurfaceAirfoilType.class, this,
					CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE__INTERMEDIATE_AIRFOIL);
		}
		return intermediateAirfoil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE__INTERMEDIATE_AIRFOIL:
			return ((InternalEList<?>) getIntermediateAirfoil()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE__INTERMEDIATE_AIRFOIL:
			return getIntermediateAirfoil();
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
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE__INTERMEDIATE_AIRFOIL:
			getIntermediateAirfoil().clear();
			getIntermediateAirfoil().addAll((Collection<? extends ControlSurfaceAirfoilType>) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE__INTERMEDIATE_AIRFOIL:
			getIntermediateAirfoil().clear();
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
		case CpacsPackage.CONTROL_SURFACE_CONTOURS_TYPE__INTERMEDIATE_AIRFOIL:
			return intermediateAirfoil != null && !intermediateAirfoil.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceContoursTypeImpl
