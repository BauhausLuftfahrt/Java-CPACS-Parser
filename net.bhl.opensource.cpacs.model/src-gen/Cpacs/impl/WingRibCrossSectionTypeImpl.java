/**
 */
package Cpacs.impl;

import Cpacs.CapType;
import Cpacs.CpacsPackage;
import Cpacs.MaterialDefinitionType;
import Cpacs.PointXType;
import Cpacs.WingRibCellType;
import Cpacs.WingRibCrossSectionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Rib Cross Section Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingRibCrossSectionTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCrossSectionTypeImpl#getRibRotation <em>Rib Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCrossSectionTypeImpl#getRibCell <em>Rib Cell</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCrossSectionTypeImpl#getUpperCap <em>Upper Cap</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCrossSectionTypeImpl#getLowerCap <em>Lower Cap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingRibCrossSectionTypeImpl extends ComplexBaseTypeImpl implements WingRibCrossSectionType {
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
	 * The cached value of the '{@link #getRibRotation() <em>Rib Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXType ribRotation;

	/**
	 * The cached value of the '{@link #getRibCell() <em>Rib Cell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibCell()
	 * @generated
	 * @ordered
	 */
	protected WingRibCellType ribCell;

	/**
	 * The cached value of the '{@link #getUpperCap() <em>Upper Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCap()
	 * @generated
	 * @ordered
	 */
	protected CapType upperCap;

	/**
	 * The cached value of the '{@link #getLowerCap() <em>Lower Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerCap()
	 * @generated
	 * @ordered
	 */
	protected CapType lowerCap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingRibCrossSectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingRibCrossSectionType();
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
					CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL, oldMaterial, newMaterial);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL,
					newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXType getRibRotation() {
		return ribRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibRotation(PointXType newRibRotation, NotificationChain msgs) {
		PointXType oldRibRotation = ribRotation;
		ribRotation = newRibRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION, oldRibRotation, newRibRotation);
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
	public void setRibRotation(PointXType newRibRotation) {
		if (newRibRotation != ribRotation) {
			NotificationChain msgs = null;
			if (ribRotation != null)
				msgs = ((InternalEObject) ribRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION, null, msgs);
			if (newRibRotation != null)
				msgs = ((InternalEObject) newRibRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION, null, msgs);
			msgs = basicSetRibRotation(newRibRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION, newRibRotation, newRibRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingRibCellType getRibCell() {
		return ribCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibCell(WingRibCellType newRibCell, NotificationChain msgs) {
		WingRibCellType oldRibCell = ribCell;
		ribCell = newRibCell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL, oldRibCell, newRibCell);
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
	public void setRibCell(WingRibCellType newRibCell) {
		if (newRibCell != ribCell) {
			NotificationChain msgs = null;
			if (ribCell != null)
				msgs = ((InternalEObject) ribCell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL, null, msgs);
			if (newRibCell != null)
				msgs = ((InternalEObject) newRibCell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL, null, msgs);
			msgs = basicSetRibCell(newRibCell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL,
					newRibCell, newRibCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapType getUpperCap() {
		return upperCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperCap(CapType newUpperCap, NotificationChain msgs) {
		CapType oldUpperCap = upperCap;
		upperCap = newUpperCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP, oldUpperCap, newUpperCap);
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
	public void setUpperCap(CapType newUpperCap) {
		if (newUpperCap != upperCap) {
			NotificationChain msgs = null;
			if (upperCap != null)
				msgs = ((InternalEObject) upperCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP, null, msgs);
			if (newUpperCap != null)
				msgs = ((InternalEObject) newUpperCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP, null, msgs);
			msgs = basicSetUpperCap(newUpperCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP,
					newUpperCap, newUpperCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapType getLowerCap() {
		return lowerCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerCap(CapType newLowerCap, NotificationChain msgs) {
		CapType oldLowerCap = lowerCap;
		lowerCap = newLowerCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP, oldLowerCap, newLowerCap);
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
	public void setLowerCap(CapType newLowerCap) {
		if (newLowerCap != lowerCap) {
			NotificationChain msgs = null;
			if (lowerCap != null)
				msgs = ((InternalEObject) lowerCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP, null, msgs);
			if (newLowerCap != null)
				msgs = ((InternalEObject) newLowerCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP, null, msgs);
			msgs = basicSetLowerCap(newLowerCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP,
					newLowerCap, newLowerCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL:
			return basicSetMaterial(null, msgs);
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION:
			return basicSetRibRotation(null, msgs);
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL:
			return basicSetRibCell(null, msgs);
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP:
			return basicSetUpperCap(null, msgs);
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP:
			return basicSetLowerCap(null, msgs);
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
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL:
			return getMaterial();
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION:
			return getRibRotation();
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL:
			return getRibCell();
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP:
			return getUpperCap();
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP:
			return getLowerCap();
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
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION:
			setRibRotation((PointXType) newValue);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL:
			setRibCell((WingRibCellType) newValue);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP:
			setUpperCap((CapType) newValue);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP:
			setLowerCap((CapType) newValue);
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
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) null);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION:
			setRibRotation((PointXType) null);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL:
			setRibCell((WingRibCellType) null);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP:
			setUpperCap((CapType) null);
			return;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP:
			setLowerCap((CapType) null);
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
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__MATERIAL:
			return material != null;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_ROTATION:
			return ribRotation != null;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__RIB_CELL:
			return ribCell != null;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__UPPER_CAP:
			return upperCap != null;
		case CpacsPackage.WING_RIB_CROSS_SECTION_TYPE__LOWER_CAP:
			return lowerCap != null;
		}
		return super.eIsSet(featureID);
	}

} //WingRibCrossSectionTypeImpl
