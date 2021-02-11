/**
 */
package Cpacs.impl;

import Cpacs.CapType;
import Cpacs.CpacsPackage;
import Cpacs.MaterialDefinitionType;
import Cpacs.PointXType;
import Cpacs.StringBaseType;
import Cpacs.WingRibCellType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Rib Cell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingRibCellTypeImpl#getFromRib <em>From Rib</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCellTypeImpl#getToRib <em>To Rib</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCellTypeImpl#getRibRotation <em>Rib Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCellTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCellTypeImpl#getUpperCap <em>Upper Cap</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCellTypeImpl#getLowerCap <em>Lower Cap</em>}</li>
 *   <li>{@link Cpacs.impl.WingRibCellTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingRibCellTypeImpl extends ComplexBaseTypeImpl implements WingRibCellType {
	/**
	 * The cached value of the '{@link #getFromRib() <em>From Rib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRib()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType fromRib;

	/**
	 * The cached value of the '{@link #getToRib() <em>To Rib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRib()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType toRib;

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
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType material;

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
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingRibCellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingRibCellType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getFromRib() {
		return fromRib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromRib(StringBaseType newFromRib, NotificationChain msgs) {
		StringBaseType oldFromRib = fromRib;
		fromRib = newFromRib;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB, oldFromRib, newFromRib);
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
	public void setFromRib(StringBaseType newFromRib) {
		if (newFromRib != fromRib) {
			NotificationChain msgs = null;
			if (fromRib != null)
				msgs = ((InternalEObject) fromRib).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB, null, msgs);
			if (newFromRib != null)
				msgs = ((InternalEObject) newFromRib).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB, null, msgs);
			msgs = basicSetFromRib(newFromRib, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB, newFromRib,
					newFromRib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getToRib() {
		return toRib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToRib(StringBaseType newToRib, NotificationChain msgs) {
		StringBaseType oldToRib = toRib;
		toRib = newToRib;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB, oldToRib, newToRib);
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
	public void setToRib(StringBaseType newToRib) {
		if (newToRib != toRib) {
			NotificationChain msgs = null;
			if (toRib != null)
				msgs = ((InternalEObject) toRib).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB, null, msgs);
			if (newToRib != null)
				msgs = ((InternalEObject) newToRib).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB, null, msgs);
			msgs = basicSetToRib(newToRib, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB, newToRib,
					newToRib));
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
					CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION, oldRibRotation, newRibRotation);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION, null, msgs);
			if (newRibRotation != null)
				msgs = ((InternalEObject) newRibRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION, null, msgs);
			msgs = basicSetRibRotation(newRibRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION,
					newRibRotation, newRibRotation));
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
					CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL, oldMaterial, newMaterial);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL,
					newMaterial, newMaterial));
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
					CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP, oldUpperCap, newUpperCap);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP, null, msgs);
			if (newUpperCap != null)
				msgs = ((InternalEObject) newUpperCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP, null, msgs);
			msgs = basicSetUpperCap(newUpperCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP,
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
					CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP, oldLowerCap, newLowerCap);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP, null, msgs);
			if (newLowerCap != null)
				msgs = ((InternalEObject) newLowerCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP, null, msgs);
			msgs = basicSetLowerCap(newLowerCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP,
					newLowerCap, newLowerCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_RIB_CELL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB:
			return basicSetFromRib(null, msgs);
		case CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB:
			return basicSetToRib(null, msgs);
		case CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION:
			return basicSetRibRotation(null, msgs);
		case CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL:
			return basicSetMaterial(null, msgs);
		case CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP:
			return basicSetUpperCap(null, msgs);
		case CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP:
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
		case CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB:
			return getFromRib();
		case CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB:
			return getToRib();
		case CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION:
			return getRibRotation();
		case CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL:
			return getMaterial();
		case CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP:
			return getUpperCap();
		case CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP:
			return getLowerCap();
		case CpacsPackage.WING_RIB_CELL_TYPE__UID:
			return getUID();
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
		case CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB:
			setFromRib((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB:
			setToRib((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION:
			setRibRotation((PointXType) newValue);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP:
			setUpperCap((CapType) newValue);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP:
			setLowerCap((CapType) newValue);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB:
			setFromRib((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB:
			setToRib((StringBaseType) null);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION:
			setRibRotation((PointXType) null);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) null);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP:
			setUpperCap((CapType) null);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP:
			setLowerCap((CapType) null);
			return;
		case CpacsPackage.WING_RIB_CELL_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.WING_RIB_CELL_TYPE__FROM_RIB:
			return fromRib != null;
		case CpacsPackage.WING_RIB_CELL_TYPE__TO_RIB:
			return toRib != null;
		case CpacsPackage.WING_RIB_CELL_TYPE__RIB_ROTATION:
			return ribRotation != null;
		case CpacsPackage.WING_RIB_CELL_TYPE__MATERIAL:
			return material != null;
		case CpacsPackage.WING_RIB_CELL_TYPE__UPPER_CAP:
			return upperCap != null;
		case CpacsPackage.WING_RIB_CELL_TYPE__LOWER_CAP:
			return lowerCap != null;
		case CpacsPackage.WING_RIB_CELL_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //WingRibCellTypeImpl
