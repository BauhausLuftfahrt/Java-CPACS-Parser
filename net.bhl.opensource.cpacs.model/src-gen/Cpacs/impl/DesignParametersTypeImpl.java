/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DesignParameterType;
import Cpacs.DesignParametersType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DesignParametersTypeImpl#getDesignParameter <em>Design Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignParametersTypeImpl extends ComplexBaseTypeImpl implements DesignParametersType {
	/**
	 * The cached value of the '{@link #getDesignParameter() <em>Design Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignParameterType> designParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesignParametersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDesignParametersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DesignParameterType> getDesignParameter() {
		if (designParameter == null) {
			designParameter = new EObjectContainmentEList<DesignParameterType>(DesignParameterType.class, this,
					CpacsPackage.DESIGN_PARAMETERS_TYPE__DESIGN_PARAMETER);
		}
		return designParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DESIGN_PARAMETERS_TYPE__DESIGN_PARAMETER:
			return ((InternalEList<?>) getDesignParameter()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.DESIGN_PARAMETERS_TYPE__DESIGN_PARAMETER:
			return getDesignParameter();
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
		case CpacsPackage.DESIGN_PARAMETERS_TYPE__DESIGN_PARAMETER:
			getDesignParameter().clear();
			getDesignParameter().addAll((Collection<? extends DesignParameterType>) newValue);
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
		case CpacsPackage.DESIGN_PARAMETERS_TYPE__DESIGN_PARAMETER:
			getDesignParameter().clear();
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
		case CpacsPackage.DESIGN_PARAMETERS_TYPE__DESIGN_PARAMETER:
			return designParameter != null && !designParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DesignParametersTypeImpl
