/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointListXYType;
import Cpacs.SheetListType;
import Cpacs.StringBaseType;
import Cpacs.StructuralProfileType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StructuralProfileTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfileTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfileTypeImpl#getPointList <em>Point List</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfileTypeImpl#getSheetList <em>Sheet List</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfileTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralProfileTypeImpl extends ComplexBaseTypeImpl implements StructuralProfileType {
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
	 * The cached value of the '{@link #getPointList() <em>Point List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointList()
	 * @generated
	 * @ordered
	 */
	protected PointListXYType pointList;

	/**
	 * The cached value of the '{@link #getSheetList() <em>Sheet List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetList()
	 * @generated
	 * @ordered
	 */
	protected SheetListType sheetList;

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
	protected StructuralProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStructuralProfileType();
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
					CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME, newName,
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
					CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYType getPointList() {
		return pointList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointList(PointListXYType newPointList, NotificationChain msgs) {
		PointListXYType oldPointList = pointList;
		pointList = newPointList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST, oldPointList, newPointList);
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
	public void setPointList(PointListXYType newPointList) {
		if (newPointList != pointList) {
			NotificationChain msgs = null;
			if (pointList != null)
				msgs = ((InternalEObject) pointList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST, null, msgs);
			if (newPointList != null)
				msgs = ((InternalEObject) newPointList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST, null, msgs);
			msgs = basicSetPointList(newPointList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST,
					newPointList, newPointList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetListType getSheetList() {
		return sheetList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetList(SheetListType newSheetList, NotificationChain msgs) {
		SheetListType oldSheetList = sheetList;
		sheetList = newSheetList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST, oldSheetList, newSheetList);
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
	public void setSheetList(SheetListType newSheetList) {
		if (newSheetList != sheetList) {
			NotificationChain msgs = null;
			if (sheetList != null)
				msgs = ((InternalEObject) sheetList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST, null, msgs);
			if (newSheetList != null)
				msgs = ((InternalEObject) newSheetList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST, null, msgs);
			msgs = basicSetSheetList(newSheetList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST,
					newSheetList, newSheetList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE_TYPE__UID, oldUID,
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
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST:
			return basicSetPointList(null, msgs);
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST:
			return basicSetSheetList(null, msgs);
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
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME:
			return getName();
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST:
			return getPointList();
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST:
			return getSheetList();
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST:
			setPointList((PointListXYType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST:
			setSheetList((SheetListType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST:
			setPointList((PointListXYType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST:
			setSheetList((SheetListType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__UID:
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
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__NAME:
			return name != null;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__POINT_LIST:
			return pointList != null;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__SHEET_LIST:
			return sheetList != null;
		case CpacsPackage.STRUCTURAL_PROFILE_TYPE__UID:
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

} //StructuralProfileTypeImpl
