/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringerType;
import Cpacs.StringersAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stringers Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StringersAssemblyTypeImpl#getStringer <em>Stringer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringersAssemblyTypeImpl extends ComplexBaseTypeImpl implements StringersAssemblyType {
	/**
	 * The cached value of the '{@link #getStringer() <em>Stringer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringer()
	 * @generated
	 * @ordered
	 */
	protected EList<StringerType> stringer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringersAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStringersAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringerType> getStringer() {
		if (stringer == null) {
			stringer = new EObjectContainmentEList<StringerType>(StringerType.class, this,
					CpacsPackage.STRINGERS_ASSEMBLY_TYPE__STRINGER);
		}
		return stringer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE__STRINGER:
			return ((InternalEList<?>) getStringer()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE__STRINGER:
			return getStringer();
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
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE__STRINGER:
			getStringer().clear();
			getStringer().addAll((Collection<? extends StringerType>) newValue);
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
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE__STRINGER:
			getStringer().clear();
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
		case CpacsPackage.STRINGERS_ASSEMBLY_TYPE__STRINGER:
			return stringer != null && !stringer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StringersAssemblyTypeImpl
