/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GuideCurveProfileGeometryType;
import Cpacs.PointListRelXYZVectorType;
import Cpacs.StringBaseType;
import Cpacs.SymmetryXyXzYzType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guide Curve Profile Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GuideCurveProfileGeometryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveProfileGeometryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveProfileGeometryTypeImpl#getPointList <em>Point List</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveProfileGeometryTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.GuideCurveProfileGeometryTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuideCurveProfileGeometryTypeImpl extends ComplexBaseTypeImpl implements GuideCurveProfileGeometryType {
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
	protected PointListRelXYZVectorType pointList;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryXyXzYzType SYMMETRY_EDEFAULT = SymmetryXyXzYzType.NONE;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryXyXzYzType symmetry = SYMMETRY_EDEFAULT;

	/**
	 * This is true if the Symmetry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetryESet;

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
	protected GuideCurveProfileGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGuideCurveProfileGeometryType();
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
					CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME,
					newName, newName));
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
					CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListRelXYZVectorType getPointList() {
		return pointList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointList(PointListRelXYZVectorType newPointList, NotificationChain msgs) {
		PointListRelXYZVectorType oldPointList = pointList;
		pointList = newPointList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST, oldPointList, newPointList);
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
	public void setPointList(PointListRelXYZVectorType newPointList) {
		if (newPointList != pointList) {
			NotificationChain msgs = null;
			if (pointList != null)
				msgs = ((InternalEObject) pointList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST, null,
						msgs);
			if (newPointList != null)
				msgs = ((InternalEObject) newPointList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST, null,
						msgs);
			msgs = basicSetPointList(newPointList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST, newPointList, newPointList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryXyXzYzType getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetry(SymmetryXyXzYzType newSymmetry) {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__SYMMETRY, oldSymmetry, symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetry() {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__SYMMETRY, oldSymmetry, SYMMETRY_EDEFAULT,
					oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSymmetry() {
		return symmetryESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__UID,
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
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST:
			return basicSetPointList(null, msgs);
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
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME:
			return getName();
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST:
			return getPointList();
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST:
			setPointList((PointListRelXYZVectorType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__SYMMETRY:
			setSymmetry((SymmetryXyXzYzType) newValue);
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST:
			setPointList((PointListRelXYZVectorType) null);
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__NAME:
			return name != null;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__POINT_LIST:
			return pointList != null;
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.GUIDE_CURVE_PROFILE_GEOMETRY_TYPE__UID:
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
		result.append(" (symmetry: ");
		if (symmetryESet)
			result.append(symmetry);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //GuideCurveProfileGeometryTypeImpl
