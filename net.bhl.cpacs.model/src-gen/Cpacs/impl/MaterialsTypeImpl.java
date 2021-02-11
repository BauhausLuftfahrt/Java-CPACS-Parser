/**
 */
package Cpacs.impl;

import Cpacs.CompositesType;
import Cpacs.CpacsPackage;
import Cpacs.MaterialType;
import Cpacs.MaterialsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Materials Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MaterialsTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialsTypeImpl#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialsTypeImpl extends ComplexBaseTypeImpl implements MaterialsType {
	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialType> material;

	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected CompositesType composites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMaterialsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MaterialType> getMaterial() {
		if (material == null) {
			material = new EObjectContainmentEList<MaterialType>(MaterialType.class, this,
					CpacsPackage.MATERIALS_TYPE__MATERIAL);
		}
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositesType getComposites() {
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposites(CompositesType newComposites, NotificationChain msgs) {
		CompositesType oldComposites = composites;
		composites = newComposites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIALS_TYPE__COMPOSITES, oldComposites, newComposites);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComposites(CompositesType newComposites) {
		if (newComposites != composites) {
			NotificationChain msgs = null;
			if (composites != null)
				msgs = ((InternalEObject) composites).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIALS_TYPE__COMPOSITES, null, msgs);
			if (newComposites != null)
				msgs = ((InternalEObject) newComposites).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIALS_TYPE__COMPOSITES, null, msgs);
			msgs = basicSetComposites(newComposites, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIALS_TYPE__COMPOSITES,
					newComposites, newComposites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MATERIALS_TYPE__MATERIAL:
			return ((InternalEList<?>) getMaterial()).basicRemove(otherEnd, msgs);
		case CpacsPackage.MATERIALS_TYPE__COMPOSITES:
			return basicSetComposites(null, msgs);
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
		case CpacsPackage.MATERIALS_TYPE__MATERIAL:
			return getMaterial();
		case CpacsPackage.MATERIALS_TYPE__COMPOSITES:
			return getComposites();
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
		case CpacsPackage.MATERIALS_TYPE__MATERIAL:
			getMaterial().clear();
			getMaterial().addAll((Collection<? extends MaterialType>) newValue);
			return;
		case CpacsPackage.MATERIALS_TYPE__COMPOSITES:
			setComposites((CompositesType) newValue);
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
		case CpacsPackage.MATERIALS_TYPE__MATERIAL:
			getMaterial().clear();
			return;
		case CpacsPackage.MATERIALS_TYPE__COMPOSITES:
			setComposites((CompositesType) null);
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
		case CpacsPackage.MATERIALS_TYPE__MATERIAL:
			return material != null && !material.isEmpty();
		case CpacsPackage.MATERIALS_TYPE__COMPOSITES:
			return composites != null;
		}
		return super.eIsSet(featureID);
	}

} //MaterialsTypeImpl
