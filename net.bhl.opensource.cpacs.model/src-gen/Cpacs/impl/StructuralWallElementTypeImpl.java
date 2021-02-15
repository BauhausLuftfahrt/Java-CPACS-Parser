/**
 */
package Cpacs.impl;

import Cpacs.CapType;
import Cpacs.CpacsPackage;
import Cpacs.LateralCapType;
import Cpacs.StringBaseType;
import Cpacs.StructuralWallElementType;
import Cpacs.WingStringerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Wall Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StructuralWallElementTypeImpl#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralWallElementTypeImpl#getLongitudinalReinforcements <em>Longitudinal Reinforcements</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralWallElementTypeImpl#getLateralReinforcements <em>Lateral Reinforcements</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralWallElementTypeImpl#getInnerLongitudinalCap <em>Inner Longitudinal Cap</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralWallElementTypeImpl#getOuterLongitudinalCap <em>Outer Longitudinal Cap</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralWallElementTypeImpl#getLateralCaps <em>Lateral Caps</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralWallElementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralWallElementTypeImpl extends ComplexBaseTypeImpl implements StructuralWallElementType {
	/**
	 * The cached value of the '{@link #getSheetElementUID() <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType sheetElementUID;

	/**
	 * The cached value of the '{@link #getLongitudinalReinforcements() <em>Longitudinal Reinforcements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalReinforcements()
	 * @generated
	 * @ordered
	 */
	protected WingStringerType longitudinalReinforcements;

	/**
	 * The cached value of the '{@link #getLateralReinforcements() <em>Lateral Reinforcements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateralReinforcements()
	 * @generated
	 * @ordered
	 */
	protected WingStringerType lateralReinforcements;

	/**
	 * The cached value of the '{@link #getInnerLongitudinalCap() <em>Inner Longitudinal Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerLongitudinalCap()
	 * @generated
	 * @ordered
	 */
	protected CapType innerLongitudinalCap;

	/**
	 * The cached value of the '{@link #getOuterLongitudinalCap() <em>Outer Longitudinal Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterLongitudinalCap()
	 * @generated
	 * @ordered
	 */
	protected CapType outerLongitudinalCap;

	/**
	 * The cached value of the '{@link #getLateralCaps() <em>Lateral Caps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLateralCaps()
	 * @generated
	 * @ordered
	 */
	protected LateralCapType lateralCaps;

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
	protected StructuralWallElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStructuralWallElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getSheetElementUID() {
		return sheetElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetElementUID(StringBaseType newSheetElementUID, NotificationChain msgs) {
		StringBaseType oldSheetElementUID = sheetElementUID;
		sheetElementUID = newSheetElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID, oldSheetElementUID,
					newSheetElementUID);
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
	public void setSheetElementUID(StringBaseType newSheetElementUID) {
		if (newSheetElementUID != sheetElementUID) {
			NotificationChain msgs = null;
			if (sheetElementUID != null)
				msgs = ((InternalEObject) sheetElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID, null,
						msgs);
			if (newSheetElementUID != null)
				msgs = ((InternalEObject) newSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID, null,
						msgs);
			msgs = basicSetSheetElementUID(newSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID, newSheetElementUID,
					newSheetElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingStringerType getLongitudinalReinforcements() {
		return longitudinalReinforcements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitudinalReinforcements(WingStringerType newLongitudinalReinforcements,
			NotificationChain msgs) {
		WingStringerType oldLongitudinalReinforcements = longitudinalReinforcements;
		longitudinalReinforcements = newLongitudinalReinforcements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS,
					oldLongitudinalReinforcements, newLongitudinalReinforcements);
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
	public void setLongitudinalReinforcements(WingStringerType newLongitudinalReinforcements) {
		if (newLongitudinalReinforcements != longitudinalReinforcements) {
			NotificationChain msgs = null;
			if (longitudinalReinforcements != null)
				msgs = ((InternalEObject) longitudinalReinforcements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS,
						null, msgs);
			if (newLongitudinalReinforcements != null)
				msgs = ((InternalEObject) newLongitudinalReinforcements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS,
						null, msgs);
			msgs = basicSetLongitudinalReinforcements(newLongitudinalReinforcements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS,
					newLongitudinalReinforcements, newLongitudinalReinforcements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingStringerType getLateralReinforcements() {
		return lateralReinforcements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLateralReinforcements(WingStringerType newLateralReinforcements,
			NotificationChain msgs) {
		WingStringerType oldLateralReinforcements = lateralReinforcements;
		lateralReinforcements = newLateralReinforcements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS, oldLateralReinforcements,
					newLateralReinforcements);
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
	public void setLateralReinforcements(WingStringerType newLateralReinforcements) {
		if (newLateralReinforcements != lateralReinforcements) {
			NotificationChain msgs = null;
			if (lateralReinforcements != null)
				msgs = ((InternalEObject) lateralReinforcements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS,
						null, msgs);
			if (newLateralReinforcements != null)
				msgs = ((InternalEObject) newLateralReinforcements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS,
						null, msgs);
			msgs = basicSetLateralReinforcements(newLateralReinforcements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS, newLateralReinforcements,
					newLateralReinforcements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapType getInnerLongitudinalCap() {
		return innerLongitudinalCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerLongitudinalCap(CapType newInnerLongitudinalCap, NotificationChain msgs) {
		CapType oldInnerLongitudinalCap = innerLongitudinalCap;
		innerLongitudinalCap = newInnerLongitudinalCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP, oldInnerLongitudinalCap,
					newInnerLongitudinalCap);
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
	public void setInnerLongitudinalCap(CapType newInnerLongitudinalCap) {
		if (newInnerLongitudinalCap != innerLongitudinalCap) {
			NotificationChain msgs = null;
			if (innerLongitudinalCap != null)
				msgs = ((InternalEObject) innerLongitudinalCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP,
						null, msgs);
			if (newInnerLongitudinalCap != null)
				msgs = ((InternalEObject) newInnerLongitudinalCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP,
						null, msgs);
			msgs = basicSetInnerLongitudinalCap(newInnerLongitudinalCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP, newInnerLongitudinalCap,
					newInnerLongitudinalCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapType getOuterLongitudinalCap() {
		return outerLongitudinalCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterLongitudinalCap(CapType newOuterLongitudinalCap, NotificationChain msgs) {
		CapType oldOuterLongitudinalCap = outerLongitudinalCap;
		outerLongitudinalCap = newOuterLongitudinalCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP, oldOuterLongitudinalCap,
					newOuterLongitudinalCap);
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
	public void setOuterLongitudinalCap(CapType newOuterLongitudinalCap) {
		if (newOuterLongitudinalCap != outerLongitudinalCap) {
			NotificationChain msgs = null;
			if (outerLongitudinalCap != null)
				msgs = ((InternalEObject) outerLongitudinalCap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP,
						null, msgs);
			if (newOuterLongitudinalCap != null)
				msgs = ((InternalEObject) newOuterLongitudinalCap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP,
						null, msgs);
			msgs = basicSetOuterLongitudinalCap(newOuterLongitudinalCap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP, newOuterLongitudinalCap,
					newOuterLongitudinalCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LateralCapType getLateralCaps() {
		return lateralCaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLateralCaps(LateralCapType newLateralCaps, NotificationChain msgs) {
		LateralCapType oldLateralCaps = lateralCaps;
		lateralCaps = newLateralCaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS, oldLateralCaps, newLateralCaps);
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
	public void setLateralCaps(LateralCapType newLateralCaps) {
		if (newLateralCaps != lateralCaps) {
			NotificationChain msgs = null;
			if (lateralCaps != null)
				msgs = ((InternalEObject) lateralCaps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS, null, msgs);
			if (newLateralCaps != null)
				msgs = ((InternalEObject) newLateralCaps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS, null, msgs);
			msgs = basicSetLateralCaps(newLateralCaps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS, newLateralCaps, newLateralCaps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID:
			return basicSetSheetElementUID(null, msgs);
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS:
			return basicSetLongitudinalReinforcements(null, msgs);
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS:
			return basicSetLateralReinforcements(null, msgs);
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP:
			return basicSetInnerLongitudinalCap(null, msgs);
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP:
			return basicSetOuterLongitudinalCap(null, msgs);
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS:
			return basicSetLateralCaps(null, msgs);
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID:
			return getSheetElementUID();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS:
			return getLongitudinalReinforcements();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS:
			return getLateralReinforcements();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP:
			return getInnerLongitudinalCap();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP:
			return getOuterLongitudinalCap();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS:
			return getLateralCaps();
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS:
			setLongitudinalReinforcements((WingStringerType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS:
			setLateralReinforcements((WingStringerType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP:
			setInnerLongitudinalCap((CapType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP:
			setOuterLongitudinalCap((CapType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS:
			setLateralCaps((LateralCapType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS:
			setLongitudinalReinforcements((WingStringerType) null);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS:
			setLateralReinforcements((WingStringerType) null);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP:
			setInnerLongitudinalCap((CapType) null);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP:
			setOuterLongitudinalCap((CapType) null);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS:
			setLateralCaps((LateralCapType) null);
			return;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__SHEET_ELEMENT_UID:
			return sheetElementUID != null;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LONGITUDINAL_REINFORCEMENTS:
			return longitudinalReinforcements != null;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_REINFORCEMENTS:
			return lateralReinforcements != null;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__INNER_LONGITUDINAL_CAP:
			return innerLongitudinalCap != null;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__OUTER_LONGITUDINAL_CAP:
			return outerLongitudinalCap != null;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__LATERAL_CAPS:
			return lateralCaps != null;
		case CpacsPackage.STRUCTURAL_WALL_ELEMENT_TYPE__UID:
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

} //StructuralWallElementTypeImpl
