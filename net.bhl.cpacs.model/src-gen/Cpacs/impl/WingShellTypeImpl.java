/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingCellsType;
import Cpacs.WingShellType;
import Cpacs.WingSkinType;
import Cpacs.WingStringerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Shell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingShellTypeImpl#getSkin <em>Skin</em>}</li>
 *   <li>{@link Cpacs.impl.WingShellTypeImpl#getStringer <em>Stringer</em>}</li>
 *   <li>{@link Cpacs.impl.WingShellTypeImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link Cpacs.impl.WingShellTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingShellTypeImpl extends ComplexBaseTypeImpl implements WingShellType {
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
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected WingCellsType cells;

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
	protected WingShellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingShellType();
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
					CpacsPackage.WING_SHELL_TYPE__SKIN, oldSkin, newSkin);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SHELL_TYPE__SKIN, null, msgs);
			if (newSkin != null)
				msgs = ((InternalEObject) newSkin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SHELL_TYPE__SKIN, null, msgs);
			msgs = basicSetSkin(newSkin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_SHELL_TYPE__SKIN, newSkin,
					newSkin));
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
					CpacsPackage.WING_SHELL_TYPE__STRINGER, oldStringer, newStringer);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SHELL_TYPE__STRINGER, null, msgs);
			if (newStringer != null)
				msgs = ((InternalEObject) newStringer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SHELL_TYPE__STRINGER, null, msgs);
			msgs = basicSetStringer(newStringer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_SHELL_TYPE__STRINGER, newStringer,
					newStringer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingCellsType getCells() {
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCells(WingCellsType newCells, NotificationChain msgs) {
		WingCellsType oldCells = cells;
		cells = newCells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_SHELL_TYPE__CELLS, oldCells, newCells);
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
	public void setCells(WingCellsType newCells) {
		if (newCells != cells) {
			NotificationChain msgs = null;
			if (cells != null)
				msgs = ((InternalEObject) cells).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SHELL_TYPE__CELLS, null, msgs);
			if (newCells != null)
				msgs = ((InternalEObject) newCells).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SHELL_TYPE__CELLS, null, msgs);
			msgs = basicSetCells(newCells, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_SHELL_TYPE__CELLS, newCells,
					newCells));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_SHELL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_SHELL_TYPE__SKIN:
			return basicSetSkin(null, msgs);
		case CpacsPackage.WING_SHELL_TYPE__STRINGER:
			return basicSetStringer(null, msgs);
		case CpacsPackage.WING_SHELL_TYPE__CELLS:
			return basicSetCells(null, msgs);
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
		case CpacsPackage.WING_SHELL_TYPE__SKIN:
			return getSkin();
		case CpacsPackage.WING_SHELL_TYPE__STRINGER:
			return getStringer();
		case CpacsPackage.WING_SHELL_TYPE__CELLS:
			return getCells();
		case CpacsPackage.WING_SHELL_TYPE__UID:
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
		case CpacsPackage.WING_SHELL_TYPE__SKIN:
			setSkin((WingSkinType) newValue);
			return;
		case CpacsPackage.WING_SHELL_TYPE__STRINGER:
			setStringer((WingStringerType) newValue);
			return;
		case CpacsPackage.WING_SHELL_TYPE__CELLS:
			setCells((WingCellsType) newValue);
			return;
		case CpacsPackage.WING_SHELL_TYPE__UID:
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
		case CpacsPackage.WING_SHELL_TYPE__SKIN:
			setSkin((WingSkinType) null);
			return;
		case CpacsPackage.WING_SHELL_TYPE__STRINGER:
			setStringer((WingStringerType) null);
			return;
		case CpacsPackage.WING_SHELL_TYPE__CELLS:
			setCells((WingCellsType) null);
			return;
		case CpacsPackage.WING_SHELL_TYPE__UID:
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
		case CpacsPackage.WING_SHELL_TYPE__SKIN:
			return skin != null;
		case CpacsPackage.WING_SHELL_TYPE__STRINGER:
			return stringer != null;
		case CpacsPackage.WING_SHELL_TYPE__CELLS:
			return cells != null;
		case CpacsPackage.WING_SHELL_TYPE__UID:
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

} //WingShellTypeImpl
