/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.Cst2DType;
import Cpacs.PointListXYVectorType;
import Cpacs.ProfileGeometry2DType;
import Cpacs.StringBaseType;
import Cpacs.SymmetryType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Geometry2 DType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ProfileGeometry2DTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileGeometry2DTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileGeometry2DTypeImpl#getPointList <em>Point List</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileGeometry2DTypeImpl#getCst2D <em>Cst2 D</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileGeometry2DTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.ProfileGeometry2DTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileGeometry2DTypeImpl extends ComplexBaseTypeImpl implements ProfileGeometry2DType {
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
	protected PointListXYVectorType pointList;

	/**
	 * The cached value of the '{@link #getCst2D() <em>Cst2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCst2D()
	 * @generated
	 * @ordered
	 */
	protected Cst2DType cst2D;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryType1 SYMMETRY_EDEFAULT = SymmetryType1.XAXIS;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryType1 symmetry = SYMMETRY_EDEFAULT;

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
	protected ProfileGeometry2DTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getProfileGeometry2DType();
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
					CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME, newName,
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
					CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYVectorType getPointList() {
		return pointList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointList(PointListXYVectorType newPointList, NotificationChain msgs) {
		PointListXYVectorType oldPointList = pointList;
		pointList = newPointList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST, oldPointList, newPointList);
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
	public void setPointList(PointListXYVectorType newPointList) {
		if (newPointList != pointList) {
			NotificationChain msgs = null;
			if (pointList != null)
				msgs = ((InternalEObject) pointList).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST, null, msgs);
			if (newPointList != null)
				msgs = ((InternalEObject) newPointList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST, null, msgs);
			msgs = basicSetPointList(newPointList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST,
					newPointList, newPointList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cst2DType getCst2D() {
		return cst2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCst2D(Cst2DType newCst2D, NotificationChain msgs) {
		Cst2DType oldCst2D = cst2D;
		cst2D = newCst2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D, oldCst2D, newCst2D);
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
	public void setCst2D(Cst2DType newCst2D) {
		if (newCst2D != cst2D) {
			NotificationChain msgs = null;
			if (cst2D != null)
				msgs = ((InternalEObject) cst2D).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D, null, msgs);
			if (newCst2D != null)
				msgs = ((InternalEObject) newCst2D).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D, null, msgs);
			msgs = basicSetCst2D(newCst2D, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D,
					newCst2D, newCst2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryType1 getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetry(SymmetryType1 newSymmetry) {
		SymmetryType1 oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILE_GEOMETRY2_DTYPE__SYMMETRY,
					oldSymmetry, symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetry() {
		SymmetryType1 oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.PROFILE_GEOMETRY2_DTYPE__SYMMETRY,
					oldSymmetry, SYMMETRY_EDEFAULT, oldSymmetryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PROFILE_GEOMETRY2_DTYPE__UID, oldUID,
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
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST:
			return basicSetPointList(null, msgs);
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D:
			return basicSetCst2D(null, msgs);
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
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME:
			return getName();
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST:
			return getPointList();
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D:
			return getCst2D();
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__UID:
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
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST:
			setPointList((PointListXYVectorType) newValue);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D:
			setCst2D((Cst2DType) newValue);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__SYMMETRY:
			setSymmetry((SymmetryType1) newValue);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__UID:
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
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST:
			setPointList((PointListXYVectorType) null);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D:
			setCst2D((Cst2DType) null);
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__UID:
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
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__NAME:
			return name != null;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__POINT_LIST:
			return pointList != null;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__CST2_D:
			return cst2D != null;
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.PROFILE_GEOMETRY2_DTYPE__UID:
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

} //ProfileGeometry2DTypeImpl
