/**
 */
package Cpacs.impl;

import Cpacs.CellPositioningChordwiseType;
import Cpacs.CellPositioningSpanwiseType;
import Cpacs.CpacsPackage;
import Cpacs.WingCellType;
import Cpacs.WingSkinType;
import Cpacs.WingStringerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Cell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingCellTypeImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link Cpacs.impl.WingCellTypeImpl#getStringer <em>Stringer</em>}</li>
 *   <li>{@link Cpacs.impl.WingCellTypeImpl#getPositioningLeadingEdge <em>Positioning Leading Edge</em>}</li>
 *   <li>{@link Cpacs.impl.WingCellTypeImpl#getPositioningTrailingEdge <em>Positioning Trailing Edge</em>}</li>
 *   <li>{@link Cpacs.impl.WingCellTypeImpl#getPositioningInnerBorder <em>Positioning Inner Border</em>}</li>
 *   <li>{@link Cpacs.impl.WingCellTypeImpl#getPositioningOuterBorder <em>Positioning Outer Border</em>}</li>
 *   <li>{@link Cpacs.impl.WingCellTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingCellTypeImpl extends ComplexBaseTypeImpl implements WingCellType {
	/**
	 * The cached value of the '{@link #getSkin() <em>Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkin()
	 * @generated
	 * @ordered
	 */
	protected WingSkinType skin;

	/**
	 * The cached value of the '{@link #getStringer() <em>Stringer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringer()
	 * @generated
	 * @ordered
	 */
	protected WingStringerType stringer;

	/**
	 * The cached value of the '{@link #getPositioningLeadingEdge() <em>Positioning Leading Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningLeadingEdge()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningChordwiseType positioningLeadingEdge;

	/**
	 * The cached value of the '{@link #getPositioningTrailingEdge() <em>Positioning Trailing Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningTrailingEdge()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningChordwiseType positioningTrailingEdge;

	/**
	 * The cached value of the '{@link #getPositioningInnerBorder() <em>Positioning Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningInnerBorder()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningSpanwiseType positioningInnerBorder;

	/**
	 * The cached value of the '{@link #getPositioningOuterBorder() <em>Positioning Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositioningOuterBorder()
	 * @generated
	 * @ordered
	 */
	protected CellPositioningSpanwiseType positioningOuterBorder;

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
	protected WingCellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingCellType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingSkinType getSkin() {
		return skin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkin(WingSkinType newSkin, NotificationChain msgs) {
		WingSkinType oldSkin = skin;
		skin = newSkin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_CELL_TYPE__SKIN, oldSkin, newSkin);
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
	public void setSkin(WingSkinType newSkin) {
		if (newSkin != skin) {
			NotificationChain msgs = null;
			if (skin != null)
				msgs = ((InternalEObject) skin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__SKIN, null, msgs);
			if (newSkin != null)
				msgs = ((InternalEObject) newSkin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__SKIN, null, msgs);
			msgs = basicSetSkin(newSkin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_CELL_TYPE__SKIN, newSkin, newSkin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingStringerType getStringer() {
		return stringer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringer(WingStringerType newStringer, NotificationChain msgs) {
		WingStringerType oldStringer = stringer;
		stringer = newStringer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_CELL_TYPE__STRINGER, oldStringer, newStringer);
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
	public void setStringer(WingStringerType newStringer) {
		if (newStringer != stringer) {
			NotificationChain msgs = null;
			if (stringer != null)
				msgs = ((InternalEObject) stringer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__STRINGER, null, msgs);
			if (newStringer != null)
				msgs = ((InternalEObject) newStringer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__STRINGER, null, msgs);
			msgs = basicSetStringer(newStringer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_CELL_TYPE__STRINGER, newStringer,
					newStringer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningChordwiseType getPositioningLeadingEdge() {
		return positioningLeadingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningLeadingEdge(CellPositioningChordwiseType newPositioningLeadingEdge,
			NotificationChain msgs) {
		CellPositioningChordwiseType oldPositioningLeadingEdge = positioningLeadingEdge;
		positioningLeadingEdge = newPositioningLeadingEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE, oldPositioningLeadingEdge,
					newPositioningLeadingEdge);
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
	public void setPositioningLeadingEdge(CellPositioningChordwiseType newPositioningLeadingEdge) {
		if (newPositioningLeadingEdge != positioningLeadingEdge) {
			NotificationChain msgs = null;
			if (positioningLeadingEdge != null)
				msgs = ((InternalEObject) positioningLeadingEdge).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE, null, msgs);
			if (newPositioningLeadingEdge != null)
				msgs = ((InternalEObject) newPositioningLeadingEdge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE, null, msgs);
			msgs = basicSetPositioningLeadingEdge(newPositioningLeadingEdge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE,
					newPositioningLeadingEdge, newPositioningLeadingEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningChordwiseType getPositioningTrailingEdge() {
		return positioningTrailingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningTrailingEdge(CellPositioningChordwiseType newPositioningTrailingEdge,
			NotificationChain msgs) {
		CellPositioningChordwiseType oldPositioningTrailingEdge = positioningTrailingEdge;
		positioningTrailingEdge = newPositioningTrailingEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE, oldPositioningTrailingEdge,
					newPositioningTrailingEdge);
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
	public void setPositioningTrailingEdge(CellPositioningChordwiseType newPositioningTrailingEdge) {
		if (newPositioningTrailingEdge != positioningTrailingEdge) {
			NotificationChain msgs = null;
			if (positioningTrailingEdge != null)
				msgs = ((InternalEObject) positioningTrailingEdge).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE, null, msgs);
			if (newPositioningTrailingEdge != null)
				msgs = ((InternalEObject) newPositioningTrailingEdge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE, null, msgs);
			msgs = basicSetPositioningTrailingEdge(newPositioningTrailingEdge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE, newPositioningTrailingEdge,
					newPositioningTrailingEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningSpanwiseType getPositioningInnerBorder() {
		return positioningInnerBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningInnerBorder(CellPositioningSpanwiseType newPositioningInnerBorder,
			NotificationChain msgs) {
		CellPositioningSpanwiseType oldPositioningInnerBorder = positioningInnerBorder;
		positioningInnerBorder = newPositioningInnerBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER, oldPositioningInnerBorder,
					newPositioningInnerBorder);
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
	public void setPositioningInnerBorder(CellPositioningSpanwiseType newPositioningInnerBorder) {
		if (newPositioningInnerBorder != positioningInnerBorder) {
			NotificationChain msgs = null;
			if (positioningInnerBorder != null)
				msgs = ((InternalEObject) positioningInnerBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER, null, msgs);
			if (newPositioningInnerBorder != null)
				msgs = ((InternalEObject) newPositioningInnerBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER, null, msgs);
			msgs = basicSetPositioningInnerBorder(newPositioningInnerBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER,
					newPositioningInnerBorder, newPositioningInnerBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellPositioningSpanwiseType getPositioningOuterBorder() {
		return positioningOuterBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositioningOuterBorder(CellPositioningSpanwiseType newPositioningOuterBorder,
			NotificationChain msgs) {
		CellPositioningSpanwiseType oldPositioningOuterBorder = positioningOuterBorder;
		positioningOuterBorder = newPositioningOuterBorder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER, oldPositioningOuterBorder,
					newPositioningOuterBorder);
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
	public void setPositioningOuterBorder(CellPositioningSpanwiseType newPositioningOuterBorder) {
		if (newPositioningOuterBorder != positioningOuterBorder) {
			NotificationChain msgs = null;
			if (positioningOuterBorder != null)
				msgs = ((InternalEObject) positioningOuterBorder).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER, null, msgs);
			if (newPositioningOuterBorder != null)
				msgs = ((InternalEObject) newPositioningOuterBorder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER, null, msgs);
			msgs = basicSetPositioningOuterBorder(newPositioningOuterBorder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER,
					newPositioningOuterBorder, newPositioningOuterBorder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_CELL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_CELL_TYPE__SKIN:
			return basicSetSkin(null, msgs);
		case CpacsPackage.WING_CELL_TYPE__STRINGER:
			return basicSetStringer(null, msgs);
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE:
			return basicSetPositioningLeadingEdge(null, msgs);
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			return basicSetPositioningTrailingEdge(null, msgs);
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER:
			return basicSetPositioningInnerBorder(null, msgs);
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER:
			return basicSetPositioningOuterBorder(null, msgs);
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
		case CpacsPackage.WING_CELL_TYPE__SKIN:
			return getSkin();
		case CpacsPackage.WING_CELL_TYPE__STRINGER:
			return getStringer();
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE:
			return getPositioningLeadingEdge();
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			return getPositioningTrailingEdge();
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER:
			return getPositioningInnerBorder();
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER:
			return getPositioningOuterBorder();
		case CpacsPackage.WING_CELL_TYPE__UID:
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
		case CpacsPackage.WING_CELL_TYPE__SKIN:
			setSkin((WingSkinType) newValue);
			return;
		case CpacsPackage.WING_CELL_TYPE__STRINGER:
			setStringer((WingStringerType) newValue);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE:
			setPositioningLeadingEdge((CellPositioningChordwiseType) newValue);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			setPositioningTrailingEdge((CellPositioningChordwiseType) newValue);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER:
			setPositioningInnerBorder((CellPositioningSpanwiseType) newValue);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER:
			setPositioningOuterBorder((CellPositioningSpanwiseType) newValue);
			return;
		case CpacsPackage.WING_CELL_TYPE__UID:
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
		case CpacsPackage.WING_CELL_TYPE__SKIN:
			setSkin((WingSkinType) null);
			return;
		case CpacsPackage.WING_CELL_TYPE__STRINGER:
			setStringer((WingStringerType) null);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE:
			setPositioningLeadingEdge((CellPositioningChordwiseType) null);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			setPositioningTrailingEdge((CellPositioningChordwiseType) null);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER:
			setPositioningInnerBorder((CellPositioningSpanwiseType) null);
			return;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER:
			setPositioningOuterBorder((CellPositioningSpanwiseType) null);
			return;
		case CpacsPackage.WING_CELL_TYPE__UID:
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
		case CpacsPackage.WING_CELL_TYPE__SKIN:
			return skin != null;
		case CpacsPackage.WING_CELL_TYPE__STRINGER:
			return stringer != null;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_LEADING_EDGE:
			return positioningLeadingEdge != null;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_TRAILING_EDGE:
			return positioningTrailingEdge != null;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_INNER_BORDER:
			return positioningInnerBorder != null;
		case CpacsPackage.WING_CELL_TYPE__POSITIONING_OUTER_BORDER:
			return positioningOuterBorder != null;
		case CpacsPackage.WING_CELL_TYPE__UID:
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

} //WingCellTypeImpl
