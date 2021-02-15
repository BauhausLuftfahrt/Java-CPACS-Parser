/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DesignSpaceType;
import Cpacs.DesignStudiesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Studies Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DesignStudiesTypeImpl#getDesignSpace <em>Design Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignStudiesTypeImpl extends ComplexBaseTypeImpl implements DesignStudiesType {
	/**
	 * The cached value of the '{@link #getDesignSpace() <em>Design Space</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignSpace()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignSpaceType> designSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignStudiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDesignStudiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DesignSpaceType> getDesignSpace() {
		if (designSpace == null) {
			designSpace = new EObjectContainmentEList<DesignSpaceType>(DesignSpaceType.class, this,
					CpacsPackage.DESIGN_STUDIES_TYPE__DESIGN_SPACE);
		}
		return designSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DESIGN_STUDIES_TYPE__DESIGN_SPACE:
			return ((InternalEList<?>) getDesignSpace()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.DESIGN_STUDIES_TYPE__DESIGN_SPACE:
			return getDesignSpace();
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
		case CpacsPackage.DESIGN_STUDIES_TYPE__DESIGN_SPACE:
			getDesignSpace().clear();
			getDesignSpace().addAll((Collection<? extends DesignSpaceType>) newValue);
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
		case CpacsPackage.DESIGN_STUDIES_TYPE__DESIGN_SPACE:
			getDesignSpace().clear();
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
		case CpacsPackage.DESIGN_STUDIES_TYPE__DESIGN_SPACE:
			return designSpace != null && !designSpace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DesignStudiesTypeImpl
