/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceDeflectionType;
import Cpacs.ControlSurfaceDeflectionsType;
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
 * An implementation of the model object '<em><b>Control Surface Deflections Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceDeflectionsTypeImpl#getControlSurface <em>Control Surface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceDeflectionsTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceDeflectionsType {
	/**
	 * The cached value of the '{@link #getControlSurface() <em>Control Surface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurface()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlSurfaceDeflectionType> controlSurface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceDeflectionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceDeflectionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlSurfaceDeflectionType> getControlSurface() {
		if (controlSurface == null) {
			controlSurface = new EObjectContainmentEList<ControlSurfaceDeflectionType>(
					ControlSurfaceDeflectionType.class, this,
					CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE__CONTROL_SURFACE);
		}
		return controlSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE__CONTROL_SURFACE:
			return ((InternalEList<?>) getControlSurface()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE__CONTROL_SURFACE:
			return getControlSurface();
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE__CONTROL_SURFACE:
			getControlSurface().clear();
			getControlSurface().addAll((Collection<? extends ControlSurfaceDeflectionType>) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE__CONTROL_SURFACE:
			getControlSurface().clear();
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTIONS_TYPE__CONTROL_SURFACE:
			return controlSurface != null && !controlSurface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceDeflectionsTypeImpl
