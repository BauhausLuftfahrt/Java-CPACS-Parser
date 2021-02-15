/**
 */
package Cpacs.impl;

import Cpacs.CompositeLayerType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Layer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CompositeLayerTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CompositeLayerTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CompositeLayerTypeImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link Cpacs.impl.CompositeLayerTypeImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link Cpacs.impl.CompositeLayerTypeImpl#getMaterialUID <em>Material UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeLayerTypeImpl extends ComplexBaseTypeImpl implements CompositeLayerType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

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
	 * The cached value of the '{@link #getPhi() <em>Phi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phi;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeLayerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCompositeLayerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPOSITE_LAYER_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPOSITE_LAYER_TYPE__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION,
					newDescription, newDescription));
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
					CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS, oldThickness, newThickness);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS, null, msgs);
			if (newThickness != null)
				msgs = ((InternalEObject) newThickness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS, null, msgs);
			msgs = basicSetThickness(newThickness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS,
					newThickness, newThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhi() {
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhi(DoubleBaseType newPhi, NotificationChain msgs) {
		DoubleBaseType oldPhi = phi;
		phi = newPhi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMPOSITE_LAYER_TYPE__PHI, oldPhi, newPhi);
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
	public void setPhi(DoubleBaseType newPhi) {
		if (newPhi != phi) {
			NotificationChain msgs = null;
			if (phi != null)
				msgs = ((InternalEObject) phi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__PHI, null, msgs);
			if (newPhi != null)
				msgs = ((InternalEObject) newPhi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__PHI, null, msgs);
			msgs = basicSetPhi(newPhi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPOSITE_LAYER_TYPE__PHI, newPhi,
					newPhi));
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
					CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID, oldMaterialUID, newMaterialUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID, null, msgs);
			if (newMaterialUID != null)
				msgs = ((InternalEObject) newMaterialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID, null, msgs);
			msgs = basicSetMaterialUID(newMaterialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID,
					newMaterialUID, newMaterialUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMPOSITE_LAYER_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS:
			return basicSetThickness(null, msgs);
		case CpacsPackage.COMPOSITE_LAYER_TYPE__PHI:
			return basicSetPhi(null, msgs);
		case CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID:
			return basicSetMaterialUID(null, msgs);
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
		case CpacsPackage.COMPOSITE_LAYER_TYPE__NAME:
			return getName();
		case CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS:
			return getThickness();
		case CpacsPackage.COMPOSITE_LAYER_TYPE__PHI:
			return getPhi();
		case CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID:
			return getMaterialUID();
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
		case CpacsPackage.COMPOSITE_LAYER_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS:
			setThickness((DoubleBaseType) newValue);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__PHI:
			setPhi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) newValue);
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
		case CpacsPackage.COMPOSITE_LAYER_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS:
			setThickness((DoubleBaseType) null);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__PHI:
			setPhi((DoubleBaseType) null);
			return;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) null);
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
		case CpacsPackage.COMPOSITE_LAYER_TYPE__NAME:
			return name != null;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__THICKNESS:
			return thickness != null;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__PHI:
			return phi != null;
		case CpacsPackage.COMPOSITE_LAYER_TYPE__MATERIAL_UID:
			return materialUID != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeLayerTypeImpl
