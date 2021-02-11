/**
 */
package Cpacs.impl;

import Cpacs.AlignmentFloorPanelType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alignment Floor Panel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AlignmentFloorPanelTypeImpl#getOffset1LocY <em>Offset1 Loc Y</em>}</li>
 *   <li>{@link Cpacs.impl.AlignmentFloorPanelTypeImpl#getOffset2LocY <em>Offset2 Loc Y</em>}</li>
 *   <li>{@link Cpacs.impl.AlignmentFloorPanelTypeImpl#getOffsetLocZ <em>Offset Loc Z</em>}</li>
 *   <li>{@link Cpacs.impl.AlignmentFloorPanelTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlignmentFloorPanelTypeImpl extends ComplexBaseTypeImpl implements AlignmentFloorPanelType {
	/**
	 * The cached value of the '{@link #getOffset1LocY() <em>Offset1 Loc Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset1LocY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType offset1LocY;

	/**
	 * The cached value of the '{@link #getOffset2LocY() <em>Offset2 Loc Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset2LocY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType offset2LocY;

	/**
	 * The cached value of the '{@link #getOffsetLocZ() <em>Offset Loc Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetLocZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType offsetLocZ;

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
	protected AlignmentFloorPanelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAlignmentFloorPanelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOffset1LocY() {
		return offset1LocY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset1LocY(DoubleBaseType newOffset1LocY, NotificationChain msgs) {
		DoubleBaseType oldOffset1LocY = offset1LocY;
		offset1LocY = newOffset1LocY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y, oldOffset1LocY, newOffset1LocY);
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
	public void setOffset1LocY(DoubleBaseType newOffset1LocY) {
		if (newOffset1LocY != offset1LocY) {
			NotificationChain msgs = null;
			if (offset1LocY != null)
				msgs = ((InternalEObject) offset1LocY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y, null, msgs);
			if (newOffset1LocY != null)
				msgs = ((InternalEObject) newOffset1LocY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y, null, msgs);
			msgs = basicSetOffset1LocY(newOffset1LocY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y, newOffset1LocY, newOffset1LocY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOffset2LocY() {
		return offset2LocY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset2LocY(DoubleBaseType newOffset2LocY, NotificationChain msgs) {
		DoubleBaseType oldOffset2LocY = offset2LocY;
		offset2LocY = newOffset2LocY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y, oldOffset2LocY, newOffset2LocY);
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
	public void setOffset2LocY(DoubleBaseType newOffset2LocY) {
		if (newOffset2LocY != offset2LocY) {
			NotificationChain msgs = null;
			if (offset2LocY != null)
				msgs = ((InternalEObject) offset2LocY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y, null, msgs);
			if (newOffset2LocY != null)
				msgs = ((InternalEObject) newOffset2LocY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y, null, msgs);
			msgs = basicSetOffset2LocY(newOffset2LocY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y, newOffset2LocY, newOffset2LocY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOffsetLocZ() {
		return offsetLocZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetLocZ(DoubleBaseType newOffsetLocZ, NotificationChain msgs) {
		DoubleBaseType oldOffsetLocZ = offsetLocZ;
		offsetLocZ = newOffsetLocZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z, oldOffsetLocZ, newOffsetLocZ);
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
	public void setOffsetLocZ(DoubleBaseType newOffsetLocZ) {
		if (newOffsetLocZ != offsetLocZ) {
			NotificationChain msgs = null;
			if (offsetLocZ != null)
				msgs = ((InternalEObject) offsetLocZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z, null, msgs);
			if (newOffsetLocZ != null)
				msgs = ((InternalEObject) newOffsetLocZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z, null, msgs);
			msgs = basicSetOffsetLocZ(newOffsetLocZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z,
					newOffsetLocZ, newOffsetLocZ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y:
			return basicSetOffset1LocY(null, msgs);
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y:
			return basicSetOffset2LocY(null, msgs);
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z:
			return basicSetOffsetLocZ(null, msgs);
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
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y:
			return getOffset1LocY();
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y:
			return getOffset2LocY();
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z:
			return getOffsetLocZ();
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__UID:
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
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y:
			setOffset1LocY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y:
			setOffset2LocY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z:
			setOffsetLocZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__UID:
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
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y:
			setOffset1LocY((DoubleBaseType) null);
			return;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y:
			setOffset2LocY((DoubleBaseType) null);
			return;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z:
			setOffsetLocZ((DoubleBaseType) null);
			return;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__UID:
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
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET1_LOC_Y:
			return offset1LocY != null;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET2_LOC_Y:
			return offset2LocY != null;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__OFFSET_LOC_Z:
			return offsetLocZ != null;
		case CpacsPackage.ALIGNMENT_FLOOR_PANEL_TYPE__UID:
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

} //AlignmentFloorPanelTypeImpl
