/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.InterconnectionStrutType;
import Cpacs.InterconnectionStrutsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interconnection Struts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.InterconnectionStrutsTypeImpl#getInterconnectionStrut <em>Interconnection Strut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterconnectionStrutsTypeImpl extends ComplexBaseTypeImpl implements InterconnectionStrutsType {
	/**
	 * The cached value of the '{@link #getInterconnectionStrut() <em>Interconnection Strut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectionStrut()
	 * @generated
	 * @ordered
	 */
	protected EList<InterconnectionStrutType> interconnectionStrut;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterconnectionStrutsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getInterconnectionStrutsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterconnectionStrutType> getInterconnectionStrut() {
		if (interconnectionStrut == null) {
			interconnectionStrut = new EObjectContainmentEList<InterconnectionStrutType>(InterconnectionStrutType.class,
					this, CpacsPackage.INTERCONNECTION_STRUTS_TYPE__INTERCONNECTION_STRUT);
		}
		return interconnectionStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE__INTERCONNECTION_STRUT:
			return ((InternalEList<?>) getInterconnectionStrut()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE__INTERCONNECTION_STRUT:
			return getInterconnectionStrut();
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
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE__INTERCONNECTION_STRUT:
			getInterconnectionStrut().clear();
			getInterconnectionStrut().addAll((Collection<? extends InterconnectionStrutType>) newValue);
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
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE__INTERCONNECTION_STRUT:
			getInterconnectionStrut().clear();
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
		case CpacsPackage.INTERCONNECTION_STRUTS_TYPE__INTERCONNECTION_STRUT:
			return interconnectionStrut != null && !interconnectionStrut.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterconnectionStrutsTypeImpl
