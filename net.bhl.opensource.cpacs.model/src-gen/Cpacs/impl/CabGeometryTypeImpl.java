/**
 */
package Cpacs.impl;

import Cpacs.CabGeometryType;
import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cab Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getYZ1 <em>YZ1</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getYZ2 <em>YZ2</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getYZ3 <em>YZ3</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getYZ4 <em>YZ4</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getYZ5 <em>YZ5</em>}</li>
 *   <li>{@link Cpacs.impl.CabGeometryTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabGeometryTypeImpl extends ComplexBaseTypeImpl implements CabGeometryType {
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
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType x;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType z;

	/**
	 * The cached value of the '{@link #getYZ1() <em>YZ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYZ1()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType yZ1;

	/**
	 * The cached value of the '{@link #getYZ2() <em>YZ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYZ2()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType yZ2;

	/**
	 * The cached value of the '{@link #getYZ3() <em>YZ3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYZ3()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType yZ3;

	/**
	 * The cached value of the '{@link #getYZ4() <em>YZ4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYZ4()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType yZ4;

	/**
	 * The cached value of the '{@link #getYZ5() <em>YZ5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYZ5()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType yZ5;

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
	protected CabGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabGeometryType();
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
					CpacsPackage.CAB_GEOMETRY_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__NAME, newName,
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
					CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(StringVectorBaseType newX, NotificationChain msgs) {
		StringVectorBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__X, oldX, newX);
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
	public void setX(StringVectorBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(StringVectorBaseType newZ, NotificationChain msgs) {
		StringVectorBaseType oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__Z, oldZ, newZ);
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
	public void setZ(StringVectorBaseType newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject) z).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__Z, newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getYZ1() {
		return yZ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYZ1(StringVectorBaseType newYZ1, NotificationChain msgs) {
		StringVectorBaseType oldYZ1 = yZ1;
		yZ1 = newYZ1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__YZ1, oldYZ1, newYZ1);
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
	public void setYZ1(StringVectorBaseType newYZ1) {
		if (newYZ1 != yZ1) {
			NotificationChain msgs = null;
			if (yZ1 != null)
				msgs = ((InternalEObject) yZ1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ1, null, msgs);
			if (newYZ1 != null)
				msgs = ((InternalEObject) newYZ1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ1, null, msgs);
			msgs = basicSetYZ1(newYZ1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__YZ1, newYZ1, newYZ1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getYZ2() {
		return yZ2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYZ2(StringVectorBaseType newYZ2, NotificationChain msgs) {
		StringVectorBaseType oldYZ2 = yZ2;
		yZ2 = newYZ2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__YZ2, oldYZ2, newYZ2);
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
	public void setYZ2(StringVectorBaseType newYZ2) {
		if (newYZ2 != yZ2) {
			NotificationChain msgs = null;
			if (yZ2 != null)
				msgs = ((InternalEObject) yZ2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ2, null, msgs);
			if (newYZ2 != null)
				msgs = ((InternalEObject) newYZ2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ2, null, msgs);
			msgs = basicSetYZ2(newYZ2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__YZ2, newYZ2, newYZ2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getYZ3() {
		return yZ3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYZ3(StringVectorBaseType newYZ3, NotificationChain msgs) {
		StringVectorBaseType oldYZ3 = yZ3;
		yZ3 = newYZ3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__YZ3, oldYZ3, newYZ3);
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
	public void setYZ3(StringVectorBaseType newYZ3) {
		if (newYZ3 != yZ3) {
			NotificationChain msgs = null;
			if (yZ3 != null)
				msgs = ((InternalEObject) yZ3).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ3, null, msgs);
			if (newYZ3 != null)
				msgs = ((InternalEObject) newYZ3).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ3, null, msgs);
			msgs = basicSetYZ3(newYZ3, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__YZ3, newYZ3, newYZ3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getYZ4() {
		return yZ4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYZ4(StringVectorBaseType newYZ4, NotificationChain msgs) {
		StringVectorBaseType oldYZ4 = yZ4;
		yZ4 = newYZ4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__YZ4, oldYZ4, newYZ4);
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
	public void setYZ4(StringVectorBaseType newYZ4) {
		if (newYZ4 != yZ4) {
			NotificationChain msgs = null;
			if (yZ4 != null)
				msgs = ((InternalEObject) yZ4).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ4, null, msgs);
			if (newYZ4 != null)
				msgs = ((InternalEObject) newYZ4).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ4, null, msgs);
			msgs = basicSetYZ4(newYZ4, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__YZ4, newYZ4, newYZ4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getYZ5() {
		return yZ5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYZ5(StringVectorBaseType newYZ5, NotificationChain msgs) {
		StringVectorBaseType oldYZ5 = yZ5;
		yZ5 = newYZ5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CAB_GEOMETRY_TYPE__YZ5, oldYZ5, newYZ5);
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
	public void setYZ5(StringVectorBaseType newYZ5) {
		if (newYZ5 != yZ5) {
			NotificationChain msgs = null;
			if (yZ5 != null)
				msgs = ((InternalEObject) yZ5).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ5, null, msgs);
			if (newYZ5 != null)
				msgs = ((InternalEObject) newYZ5).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CAB_GEOMETRY_TYPE__YZ5, null, msgs);
			msgs = basicSetYZ5(newYZ5, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__YZ5, newYZ5, newYZ5));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CAB_GEOMETRY_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ1:
			return basicSetYZ1(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ2:
			return basicSetYZ2(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ3:
			return basicSetYZ3(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ4:
			return basicSetYZ4(null, msgs);
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ5:
			return basicSetYZ5(null, msgs);
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			return getName();
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			return getX();
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			return getZ();
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ1:
			return getYZ1();
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ2:
			return getYZ2();
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ3:
			return getYZ3();
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ4:
			return getYZ4();
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ5:
			return getYZ5();
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			setX((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			setZ((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ1:
			setYZ1((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ2:
			setYZ2((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ3:
			setYZ3((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ4:
			setYZ4((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ5:
			setYZ5((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			setX((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			setZ((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ1:
			setYZ1((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ2:
			setYZ2((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ3:
			setYZ3((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ4:
			setYZ4((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ5:
			setYZ5((StringVectorBaseType) null);
			return;
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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
		case CpacsPackage.CAB_GEOMETRY_TYPE__NAME:
			return name != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__X:
			return x != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__Z:
			return z != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ1:
			return yZ1 != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ2:
			return yZ2 != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ3:
			return yZ3 != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ4:
			return yZ4 != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__YZ5:
			return yZ5 != null;
		case CpacsPackage.CAB_GEOMETRY_TYPE__UID:
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

} //CabGeometryTypeImpl
