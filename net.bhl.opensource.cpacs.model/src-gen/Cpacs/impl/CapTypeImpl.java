/**
 */
package Cpacs.impl;

import Cpacs.CapType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MaterialDefinitionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cap Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CapTypeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link Cpacs.impl.CapTypeImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapTypeImpl extends ComplexBaseTypeImpl implements CapType {
	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType area;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType material;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(DoubleBaseType newArea, NotificationChain msgs) {
		DoubleBaseType oldArea = area;
		area = newArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.CAP_TYPE__AREA,
					oldArea, newArea);
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
	public void setArea(DoubleBaseType newArea) {
		if (newArea != area) {
			NotificationChain msgs = null;
			if (area != null)
				msgs = ((InternalEObject) area).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAP_TYPE__AREA, null, msgs);
			if (newArea != null)
				msgs = ((InternalEObject) newArea).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAP_TYPE__AREA, null, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAP_TYPE__AREA, newArea, newArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(MaterialDefinitionType newMaterial, NotificationChain msgs) {
		MaterialDefinitionType oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAP_TYPE__MATERIAL, oldMaterial, newMaterial);
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
	public void setMaterial(MaterialDefinitionType newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject) material).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAP_TYPE__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAP_TYPE__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAP_TYPE__MATERIAL, newMaterial,
					newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CAP_TYPE__AREA:
			return basicSetArea(null, msgs);
		case CpacsPackage.CAP_TYPE__MATERIAL:
			return basicSetMaterial(null, msgs);
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
		case CpacsPackage.CAP_TYPE__AREA:
			return getArea();
		case CpacsPackage.CAP_TYPE__MATERIAL:
			return getMaterial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.CAP_TYPE__AREA:
			setArea((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CAP_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) newValue);
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
		case CpacsPackage.CAP_TYPE__AREA:
			setArea((DoubleBaseType) null);
			return;
		case CpacsPackage.CAP_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) null);
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
		case CpacsPackage.CAP_TYPE__AREA:
			return area != null;
		case CpacsPackage.CAP_TYPE__MATERIAL:
			return material != null;
		}
		return super.eIsSet(featureID);
	}

} //CapTypeImpl
