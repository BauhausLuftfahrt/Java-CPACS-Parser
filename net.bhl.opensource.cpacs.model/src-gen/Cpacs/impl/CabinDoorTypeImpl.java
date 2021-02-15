/**
 */
package Cpacs.impl;

import Cpacs.CabinDoorType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.SideType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TypeType2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Door Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getStructuralUID <em>Structural UID</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getPaxCapacity <em>Pax Capacity</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getSide <em>Side</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.CabinDoorTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinDoorTypeImpl extends ComplexBaseTypeImpl implements CabinDoorType {
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
	 * The cached value of the '{@link #getStructuralUID() <em>Structural UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralUID;

	/**
	 * The cached value of the '{@link #getPaxCapacity() <em>Pax Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType paxCapacity;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType x;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType z;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType width;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType height;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected SideType side;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType2 type;

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
	protected CabinDoorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinDoorType();
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
					CpacsPackage.CABIN_DOOR_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__NAME, newName,
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
					CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralUID() {
		return structuralUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralUID(StringUIDBaseType newStructuralUID, NotificationChain msgs) {
		StringUIDBaseType oldStructuralUID = structuralUID;
		structuralUID = newStructuralUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID, oldStructuralUID, newStructuralUID);
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
	public void setStructuralUID(StringUIDBaseType newStructuralUID) {
		if (newStructuralUID != structuralUID) {
			NotificationChain msgs = null;
			if (structuralUID != null)
				msgs = ((InternalEObject) structuralUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID, null, msgs);
			if (newStructuralUID != null)
				msgs = ((InternalEObject) newStructuralUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID, null, msgs);
			msgs = basicSetStructuralUID(newStructuralUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID,
					newStructuralUID, newStructuralUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getPaxCapacity() {
		return paxCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaxCapacity(IntegerBaseType newPaxCapacity, NotificationChain msgs) {
		IntegerBaseType oldPaxCapacity = paxCapacity;
		paxCapacity = newPaxCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY, oldPaxCapacity, newPaxCapacity);
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
	public void setPaxCapacity(IntegerBaseType newPaxCapacity) {
		if (newPaxCapacity != paxCapacity) {
			NotificationChain msgs = null;
			if (paxCapacity != null)
				msgs = ((InternalEObject) paxCapacity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY, null, msgs);
			if (newPaxCapacity != null)
				msgs = ((InternalEObject) newPaxCapacity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY, null, msgs);
			msgs = basicSetPaxCapacity(newPaxCapacity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY,
					newPaxCapacity, newPaxCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(DoubleBaseType newX, NotificationChain msgs) {
		DoubleBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__X, oldX, newX);
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
	public void setX(DoubleBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(DoubleBaseType newZ, NotificationChain msgs) {
		DoubleBaseType oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__Z, oldZ, newZ);
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
	public void setZ(DoubleBaseType newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject) z).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__Z, newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(DoubleBaseType newWidth, NotificationChain msgs) {
		DoubleBaseType oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__WIDTH, oldWidth, newWidth);
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
	public void setWidth(DoubleBaseType newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject) width).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__WIDTH, newWidth,
					newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(DoubleBaseType newHeight, NotificationChain msgs) {
		DoubleBaseType oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__HEIGHT, oldHeight, newHeight);
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
	public void setHeight(DoubleBaseType newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject) height).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__HEIGHT, newHeight,
					newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideType getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSide(SideType newSide, NotificationChain msgs) {
		SideType oldSide = side;
		side = newSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__SIDE, oldSide, newSide);
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
	public void setSide(SideType newSide) {
		if (newSide != side) {
			NotificationChain msgs = null;
			if (side != null)
				msgs = ((InternalEObject) side).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__SIDE, null, msgs);
			if (newSide != null)
				msgs = ((InternalEObject) newSide).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__SIDE, null, msgs);
			msgs = basicSetSide(newSide, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__SIDE, newSide,
					newSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType2 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType2 newType, NotificationChain msgs) {
		TypeType2 oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_DOOR_TYPE__TYPE, oldType, newType);
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
	public void setType(TypeType2 newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_DOOR_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__TYPE, newType,
					newType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_DOOR_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CABIN_DOOR_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID:
			return basicSetStructuralUID(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY:
			return basicSetPaxCapacity(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__Z:
			return basicSetZ(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__WIDTH:
			return basicSetWidth(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__HEIGHT:
			return basicSetHeight(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__SIDE:
			return basicSetSide(null, msgs);
		case CpacsPackage.CABIN_DOOR_TYPE__TYPE:
			return basicSetType(null, msgs);
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
		case CpacsPackage.CABIN_DOOR_TYPE__NAME:
			return getName();
		case CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID:
			return getStructuralUID();
		case CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY:
			return getPaxCapacity();
		case CpacsPackage.CABIN_DOOR_TYPE__X:
			return getX();
		case CpacsPackage.CABIN_DOOR_TYPE__Z:
			return getZ();
		case CpacsPackage.CABIN_DOOR_TYPE__WIDTH:
			return getWidth();
		case CpacsPackage.CABIN_DOOR_TYPE__HEIGHT:
			return getHeight();
		case CpacsPackage.CABIN_DOOR_TYPE__SIDE:
			return getSide();
		case CpacsPackage.CABIN_DOOR_TYPE__TYPE:
			return getType();
		case CpacsPackage.CABIN_DOOR_TYPE__UID:
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
		case CpacsPackage.CABIN_DOOR_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID:
			setStructuralUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY:
			setPaxCapacity((IntegerBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__Z:
			setZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__WIDTH:
			setWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__HEIGHT:
			setHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__SIDE:
			setSide((SideType) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__TYPE:
			setType((TypeType2) newValue);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__UID:
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
		case CpacsPackage.CABIN_DOOR_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID:
			setStructuralUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY:
			setPaxCapacity((IntegerBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__Z:
			setZ((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__WIDTH:
			setWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__HEIGHT:
			setHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__SIDE:
			setSide((SideType) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__TYPE:
			setType((TypeType2) null);
			return;
		case CpacsPackage.CABIN_DOOR_TYPE__UID:
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
		case CpacsPackage.CABIN_DOOR_TYPE__NAME:
			return name != null;
		case CpacsPackage.CABIN_DOOR_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CABIN_DOOR_TYPE__STRUCTURAL_UID:
			return structuralUID != null;
		case CpacsPackage.CABIN_DOOR_TYPE__PAX_CAPACITY:
			return paxCapacity != null;
		case CpacsPackage.CABIN_DOOR_TYPE__X:
			return x != null;
		case CpacsPackage.CABIN_DOOR_TYPE__Z:
			return z != null;
		case CpacsPackage.CABIN_DOOR_TYPE__WIDTH:
			return width != null;
		case CpacsPackage.CABIN_DOOR_TYPE__HEIGHT:
			return height != null;
		case CpacsPackage.CABIN_DOOR_TYPE__SIDE:
			return side != null;
		case CpacsPackage.CABIN_DOOR_TYPE__TYPE:
			return type != null;
		case CpacsPackage.CABIN_DOOR_TYPE__UID:
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

} //CabinDoorTypeImpl
