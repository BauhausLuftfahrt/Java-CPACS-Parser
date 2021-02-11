/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WindowAssemblyPositionType;
import Cpacs.WindowsAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Windows Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WindowsAssemblyTypeImpl#getWindow <em>Window</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowsAssemblyTypeImpl extends ComplexBaseTypeImpl implements WindowsAssemblyType {
	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected EList<WindowAssemblyPositionType> window;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWindowsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WindowAssemblyPositionType> getWindow() {
		if (window == null) {
			window = new EObjectContainmentEList<WindowAssemblyPositionType>(WindowAssemblyPositionType.class, this,
					CpacsPackage.WINDOWS_ASSEMBLY_TYPE__WINDOW);
		}
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE__WINDOW:
			return ((InternalEList<?>) getWindow()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE__WINDOW:
			return getWindow();
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
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE__WINDOW:
			getWindow().clear();
			getWindow().addAll((Collection<? extends WindowAssemblyPositionType>) newValue);
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
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE__WINDOW:
			getWindow().clear();
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
		case CpacsPackage.WINDOWS_ASSEMBLY_TYPE__WINDOW:
			return window != null && !window.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WindowsAssemblyTypeImpl
