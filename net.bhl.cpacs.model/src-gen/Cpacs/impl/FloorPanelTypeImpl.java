/**
 */
package Cpacs.impl;

import Cpacs.AlignmentFloorPanelType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FloorPanelType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floor Panel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FloorPanelTypeImpl#getStartX <em>Start X</em>}</li>
 *   <li>{@link Cpacs.impl.FloorPanelTypeImpl#getEndX <em>End X</em>}</li>
 *   <li>{@link Cpacs.impl.FloorPanelTypeImpl#getLongFloorBeam1UID <em>Long Floor Beam1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.FloorPanelTypeImpl#getLongFloorBeam2UID <em>Long Floor Beam2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.FloorPanelTypeImpl#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.FloorPanelTypeImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.impl.FloorPanelTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloorPanelTypeImpl extends ComplexBaseTypeImpl implements FloorPanelType {
	/**
	 * The cached value of the '{@link #getStartX() <em>Start X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType startX;

	/**
	 * The cached value of the '{@link #getEndX() <em>End X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType endX;

	/**
	 * The cached value of the '{@link #getLongFloorBeam1UID() <em>Long Floor Beam1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFloorBeam1UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType longFloorBeam1UID;

	/**
	 * The cached value of the '{@link #getLongFloorBeam2UID() <em>Long Floor Beam2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongFloorBeam2UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType longFloorBeam2UID;

	/**
	 * The cached value of the '{@link #getSheetElementUID() <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType sheetElementUID;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentFloorPanelType alignment;

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
	protected FloorPanelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFloorPanelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStartX() {
		return startX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartX(DoubleBaseType newStartX, NotificationChain msgs) {
		DoubleBaseType oldStartX = startX;
		startX = newStartX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOOR_PANEL_TYPE__START_X, oldStartX, newStartX);
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
	public void setStartX(DoubleBaseType newStartX) {
		if (newStartX != startX) {
			NotificationChain msgs = null;
			if (startX != null)
				msgs = ((InternalEObject) startX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__START_X, null, msgs);
			if (newStartX != null)
				msgs = ((InternalEObject) newStartX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__START_X, null, msgs);
			msgs = basicSetStartX(newStartX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOOR_PANEL_TYPE__START_X, newStartX,
					newStartX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEndX() {
		return endX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndX(DoubleBaseType newEndX, NotificationChain msgs) {
		DoubleBaseType oldEndX = endX;
		endX = newEndX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOOR_PANEL_TYPE__END_X, oldEndX, newEndX);
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
	public void setEndX(DoubleBaseType newEndX) {
		if (newEndX != endX) {
			NotificationChain msgs = null;
			if (endX != null)
				msgs = ((InternalEObject) endX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__END_X, null, msgs);
			if (newEndX != null)
				msgs = ((InternalEObject) newEndX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__END_X, null, msgs);
			msgs = basicSetEndX(newEndX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOOR_PANEL_TYPE__END_X, newEndX,
					newEndX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getLongFloorBeam1UID() {
		return longFloorBeam1UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongFloorBeam1UID(StringUIDBaseType newLongFloorBeam1UID, NotificationChain msgs) {
		StringUIDBaseType oldLongFloorBeam1UID = longFloorBeam1UID;
		longFloorBeam1UID = newLongFloorBeam1UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID, oldLongFloorBeam1UID, newLongFloorBeam1UID);
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
	public void setLongFloorBeam1UID(StringUIDBaseType newLongFloorBeam1UID) {
		if (newLongFloorBeam1UID != longFloorBeam1UID) {
			NotificationChain msgs = null;
			if (longFloorBeam1UID != null)
				msgs = ((InternalEObject) longFloorBeam1UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID, null, msgs);
			if (newLongFloorBeam1UID != null)
				msgs = ((InternalEObject) newLongFloorBeam1UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID, null, msgs);
			msgs = basicSetLongFloorBeam1UID(newLongFloorBeam1UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID,
					newLongFloorBeam1UID, newLongFloorBeam1UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getLongFloorBeam2UID() {
		return longFloorBeam2UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongFloorBeam2UID(StringUIDBaseType newLongFloorBeam2UID, NotificationChain msgs) {
		StringUIDBaseType oldLongFloorBeam2UID = longFloorBeam2UID;
		longFloorBeam2UID = newLongFloorBeam2UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID, oldLongFloorBeam2UID, newLongFloorBeam2UID);
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
	public void setLongFloorBeam2UID(StringUIDBaseType newLongFloorBeam2UID) {
		if (newLongFloorBeam2UID != longFloorBeam2UID) {
			NotificationChain msgs = null;
			if (longFloorBeam2UID != null)
				msgs = ((InternalEObject) longFloorBeam2UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID, null, msgs);
			if (newLongFloorBeam2UID != null)
				msgs = ((InternalEObject) newLongFloorBeam2UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID, null, msgs);
			msgs = basicSetLongFloorBeam2UID(newLongFloorBeam2UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID,
					newLongFloorBeam2UID, newLongFloorBeam2UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSheetElementUID() {
		return sheetElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetElementUID(StringUIDBaseType newSheetElementUID, NotificationChain msgs) {
		StringUIDBaseType oldSheetElementUID = sheetElementUID;
		sheetElementUID = newSheetElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID, oldSheetElementUID, newSheetElementUID);
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
	public void setSheetElementUID(StringUIDBaseType newSheetElementUID) {
		if (newSheetElementUID != sheetElementUID) {
			NotificationChain msgs = null;
			if (sheetElementUID != null)
				msgs = ((InternalEObject) sheetElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID, null, msgs);
			if (newSheetElementUID != null)
				msgs = ((InternalEObject) newSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID, null, msgs);
			msgs = basicSetSheetElementUID(newSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID,
					newSheetElementUID, newSheetElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlignmentFloorPanelType getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlignment(AlignmentFloorPanelType newAlignment, NotificationChain msgs) {
		AlignmentFloorPanelType oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT, oldAlignment, newAlignment);
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
	public void setAlignment(AlignmentFloorPanelType newAlignment) {
		if (newAlignment != alignment) {
			NotificationChain msgs = null;
			if (alignment != null)
				msgs = ((InternalEObject) alignment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT, null, msgs);
			if (newAlignment != null)
				msgs = ((InternalEObject) newAlignment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT, null, msgs);
			msgs = basicSetAlignment(newAlignment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT,
					newAlignment, newAlignment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOOR_PANEL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLOOR_PANEL_TYPE__START_X:
			return basicSetStartX(null, msgs);
		case CpacsPackage.FLOOR_PANEL_TYPE__END_X:
			return basicSetEndX(null, msgs);
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID:
			return basicSetLongFloorBeam1UID(null, msgs);
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID:
			return basicSetLongFloorBeam2UID(null, msgs);
		case CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID:
			return basicSetSheetElementUID(null, msgs);
		case CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT:
			return basicSetAlignment(null, msgs);
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
		case CpacsPackage.FLOOR_PANEL_TYPE__START_X:
			return getStartX();
		case CpacsPackage.FLOOR_PANEL_TYPE__END_X:
			return getEndX();
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID:
			return getLongFloorBeam1UID();
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID:
			return getLongFloorBeam2UID();
		case CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID:
			return getSheetElementUID();
		case CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT:
			return getAlignment();
		case CpacsPackage.FLOOR_PANEL_TYPE__UID:
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
		case CpacsPackage.FLOOR_PANEL_TYPE__START_X:
			setStartX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__END_X:
			setEndX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID:
			setLongFloorBeam1UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID:
			setLongFloorBeam2UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT:
			setAlignment((AlignmentFloorPanelType) newValue);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__UID:
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
		case CpacsPackage.FLOOR_PANEL_TYPE__START_X:
			setStartX((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__END_X:
			setEndX((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID:
			setLongFloorBeam1UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID:
			setLongFloorBeam2UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID:
			setSheetElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT:
			setAlignment((AlignmentFloorPanelType) null);
			return;
		case CpacsPackage.FLOOR_PANEL_TYPE__UID:
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
		case CpacsPackage.FLOOR_PANEL_TYPE__START_X:
			return startX != null;
		case CpacsPackage.FLOOR_PANEL_TYPE__END_X:
			return endX != null;
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM1_UID:
			return longFloorBeam1UID != null;
		case CpacsPackage.FLOOR_PANEL_TYPE__LONG_FLOOR_BEAM2_UID:
			return longFloorBeam2UID != null;
		case CpacsPackage.FLOOR_PANEL_TYPE__SHEET_ELEMENT_UID:
			return sheetElementUID != null;
		case CpacsPackage.FLOOR_PANEL_TYPE__ALIGNMENT:
			return alignment != null;
		case CpacsPackage.FLOOR_PANEL_TYPE__UID:
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

} //FloorPanelTypeImpl
