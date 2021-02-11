/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointListType;
import Cpacs.SheetList3DType;
import Cpacs.StringBaseType;
import Cpacs.StructuralProfile3DType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Profile3 DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StructuralProfile3DTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfile3DTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfile3DTypeImpl#getPointList <em>Point List</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfile3DTypeImpl#getSheetList3D <em>Sheet List3 D</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralProfile3DTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralProfile3DTypeImpl extends ComplexBaseTypeImpl implements StructuralProfile3DType {
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
	protected PointListType pointList;

	/**
	 * The cached value of the '{@link #getSheetList3D() <em>Sheet List3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetList3D()
	 * @generated
	 * @ordered
	 */
	protected SheetList3DType sheetList3D;

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
	protected StructuralProfile3DTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStructuralProfile3DType();
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
					CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME, newName,
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
					CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListType getPointList() {
		return pointList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointList(PointListType newPointList, NotificationChain msgs) {
		PointListType oldPointList = pointList;
		pointList = newPointList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST, oldPointList, newPointList);
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
	public void setPointList(PointListType newPointList) {
		if (newPointList != pointList) {
			NotificationChain msgs = null;
			if (pointList != null)
				msgs = ((InternalEObject) pointList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST, null, msgs);
			if (newPointList != null)
				msgs = ((InternalEObject) newPointList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST, null, msgs);
			msgs = basicSetPointList(newPointList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST,
					newPointList, newPointList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetList3DType getSheetList3D() {
		return sheetList3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetList3D(SheetList3DType newSheetList3D, NotificationChain msgs) {
		SheetList3DType oldSheetList3D = sheetList3D;
		sheetList3D = newSheetList3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D, oldSheetList3D, newSheetList3D);
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
	public void setSheetList3D(SheetList3DType newSheetList3D) {
		if (newSheetList3D != sheetList3D) {
			NotificationChain msgs = null;
			if (sheetList3D != null)
				msgs = ((InternalEObject) sheetList3D).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D, null, msgs);
			if (newSheetList3D != null)
				msgs = ((InternalEObject) newSheetList3D).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D, null, msgs);
			msgs = basicSetSheetList3D(newSheetList3D, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D,
					newSheetList3D, newSheetList3D));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__UID, oldUID,
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
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST:
			return basicSetPointList(null, msgs);
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D:
			return basicSetSheetList3D(null, msgs);
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
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME:
			return getName();
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST:
			return getPointList();
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D:
			return getSheetList3D();
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__UID:
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
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST:
			setPointList((PointListType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D:
			setSheetList3D((SheetList3DType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__UID:
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
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST:
			setPointList((PointListType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D:
			setSheetList3D((SheetList3DType) null);
			return;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__UID:
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
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__NAME:
			return name != null;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__POINT_LIST:
			return pointList != null;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__SHEET_LIST3_D:
			return sheetList3D != null;
		case CpacsPackage.STRUCTURAL_PROFILE3_DTYPE__UID:
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

} //StructuralProfile3DTypeImpl
