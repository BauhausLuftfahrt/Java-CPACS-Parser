/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MaterialDefinitionType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MaterialDefinitionTypeImpl#getCompositeUID <em>Composite UID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionTypeImpl#getOrthotropyDirection <em>Orthotropy Direction</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionTypeImpl#getThicknessScaling <em>Thickness Scaling</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionTypeImpl#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionTypeImpl#getThickness <em>Thickness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialDefinitionTypeImpl extends ComplexBaseTypeImpl implements MaterialDefinitionType {
	/**
	 * The cached value of the '{@link #getCompositeUID() <em>Composite UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType compositeUID;

	/**
	 * The cached value of the '{@link #getOrthotropyDirection() <em>Orthotropy Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrthotropyDirection()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType orthotropyDirection;

	/**
	 * The cached value of the '{@link #getThicknessScaling() <em>Thickness Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessScaling()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thicknessScaling;

	/**
	 * The cached value of the '{@link #getMaterialUID() <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType materialUID;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thickness;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMaterialDefinitionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCompositeUID() {
		return compositeUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeUID(StringUIDBaseType newCompositeUID, NotificationChain msgs) {
		StringUIDBaseType oldCompositeUID = compositeUID;
		compositeUID = newCompositeUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID, oldCompositeUID, newCompositeUID);
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
	public void setCompositeUID(StringUIDBaseType newCompositeUID) {
		if (newCompositeUID != compositeUID) {
			NotificationChain msgs = null;
			if (compositeUID != null)
				msgs = ((InternalEObject) compositeUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID, null, msgs);
			if (newCompositeUID != null)
				msgs = ((InternalEObject) newCompositeUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID, null, msgs);
			msgs = basicSetCompositeUID(newCompositeUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID,
					newCompositeUID, newCompositeUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOrthotropyDirection() {
		return orthotropyDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrthotropyDirection(DoubleBaseType newOrthotropyDirection,
			NotificationChain msgs) {
		DoubleBaseType oldOrthotropyDirection = orthotropyDirection;
		orthotropyDirection = newOrthotropyDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION, oldOrthotropyDirection,
					newOrthotropyDirection);
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
	public void setOrthotropyDirection(DoubleBaseType newOrthotropyDirection) {
		if (newOrthotropyDirection != orthotropyDirection) {
			NotificationChain msgs = null;
			if (orthotropyDirection != null)
				msgs = ((InternalEObject) orthotropyDirection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION, null,
						msgs);
			if (newOrthotropyDirection != null)
				msgs = ((InternalEObject) newOrthotropyDirection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION, null,
						msgs);
			msgs = basicSetOrthotropyDirection(newOrthotropyDirection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION, newOrthotropyDirection,
					newOrthotropyDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThicknessScaling() {
		return thicknessScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThicknessScaling(DoubleBaseType newThicknessScaling, NotificationChain msgs) {
		DoubleBaseType oldThicknessScaling = thicknessScaling;
		thicknessScaling = newThicknessScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING, oldThicknessScaling, newThicknessScaling);
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
	public void setThicknessScaling(DoubleBaseType newThicknessScaling) {
		if (newThicknessScaling != thicknessScaling) {
			NotificationChain msgs = null;
			if (thicknessScaling != null)
				msgs = ((InternalEObject) thicknessScaling).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING, null, msgs);
			if (newThicknessScaling != null)
				msgs = ((InternalEObject) newThicknessScaling).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING, null, msgs);
			msgs = basicSetThicknessScaling(newThicknessScaling, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING, newThicknessScaling,
					newThicknessScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMaterialUID() {
		return materialUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialUID(StringUIDBaseType newMaterialUID, NotificationChain msgs) {
		StringUIDBaseType oldMaterialUID = materialUID;
		materialUID = newMaterialUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID, oldMaterialUID, newMaterialUID);
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
	public void setMaterialUID(StringUIDBaseType newMaterialUID) {
		if (newMaterialUID != materialUID) {
			NotificationChain msgs = null;
			if (materialUID != null)
				msgs = ((InternalEObject) materialUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID, null, msgs);
			if (newMaterialUID != null)
				msgs = ((InternalEObject) newMaterialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID, null, msgs);
			msgs = basicSetMaterialUID(newMaterialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID,
					newMaterialUID, newMaterialUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThickness(DoubleBaseType newThickness, NotificationChain msgs) {
		DoubleBaseType oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS, oldThickness, newThickness);
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
	public void setThickness(DoubleBaseType newThickness) {
		if (newThickness != thickness) {
			NotificationChain msgs = null;
			if (thickness != null)
				msgs = ((InternalEObject) thickness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS, null, msgs);
			if (newThickness != null)
				msgs = ((InternalEObject) newThickness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS, null, msgs);
			msgs = basicSetThickness(newThickness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS,
					newThickness, newThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID:
			return basicSetCompositeUID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION:
			return basicSetOrthotropyDirection(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING:
			return basicSetThicknessScaling(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID:
			return basicSetMaterialUID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS:
			return basicSetThickness(null, msgs);
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
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID:
			return getCompositeUID();
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION:
			return getOrthotropyDirection();
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING:
			return getThicknessScaling();
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID:
			return getMaterialUID();
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS:
			return getThickness();
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
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID:
			setCompositeUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION:
			setOrthotropyDirection((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING:
			setThicknessScaling((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS:
			setThickness((DoubleBaseType) newValue);
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
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID:
			setCompositeUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION:
			setOrthotropyDirection((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING:
			setThicknessScaling((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS:
			setThickness((DoubleBaseType) null);
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
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__COMPOSITE_UID:
			return compositeUID != null;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__ORTHOTROPY_DIRECTION:
			return orthotropyDirection != null;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS_SCALING:
			return thicknessScaling != null;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__MATERIAL_UID:
			return materialUID != null;
		case CpacsPackage.MATERIAL_DEFINITION_TYPE__THICKNESS:
			return thickness != null;
		}
		return super.eIsSet(featureID);
	}

} //MaterialDefinitionTypeImpl
