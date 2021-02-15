/**
 */
package Cpacs.impl;

import Cpacs.CabinFloorElementType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.TypeType5;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Floor Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Cpacs.impl.CabinFloorElementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinFloorElementTypeImpl extends ComplexBaseTypeImpl implements CabinFloorElementType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType5 type;

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
	 * The cached value of the '{@link #getY() <em>Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType y;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType length;

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
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType number;

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
	protected CabinFloorElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinFloorElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType5 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType5 newType, NotificationChain msgs) {
		TypeType5 oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE, oldType, newType);
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
	public void setType(TypeType5 newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE, newType,
					newType));
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
					CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X, oldX, newX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X, newX,
					newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetY(DoubleBaseType newY, NotificationChain msgs) {
		DoubleBaseType oldY = y;
		y = newY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y, oldY, newY);
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
	public void setY(DoubleBaseType newY) {
		if (newY != y) {
			NotificationChain msgs = null;
			if (y != null)
				msgs = ((InternalEObject) y).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y, newY,
					newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLength(DoubleBaseType newLength, NotificationChain msgs) {
		DoubleBaseType oldLength = length;
		length = newLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH, oldLength, newLength);
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
	public void setLength(DoubleBaseType newLength) {
		if (newLength != length) {
			NotificationChain msgs = null;
			if (length != null)
				msgs = ((InternalEObject) length).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH,
					newLength, newLength));
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
					CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH, oldWidth, newWidth);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH,
					newWidth, newWidth));
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
					CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT, oldHeight, newHeight);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT,
					newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(DoubleBaseType newNumber, NotificationChain msgs) {
		DoubleBaseType oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER, oldNumber, newNumber);
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
	public void setNumber(DoubleBaseType newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject) number).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject) newNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER,
					newNumber, newNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__UID, oldUID,
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
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE:
			return basicSetType(null, msgs);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH:
			return basicSetWidth(null, msgs);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT:
			return basicSetHeight(null, msgs);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER:
			return basicSetNumber(null, msgs);
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
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE:
			return getType();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X:
			return getX();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y:
			return getY();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH:
			return getWidth();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT:
			return getHeight();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER:
			return getNumber();
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NAME:
			setName((String) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE:
			setType((TypeType5) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y:
			setY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH:
			setWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT:
			setHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER:
			setNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE:
			setType((TypeType5) null);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y:
			setY((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH:
			setWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT:
			setHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER:
			setNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__TYPE:
			return type != null;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__X:
			return x != null;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__Y:
			return y != null;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__WIDTH:
			return width != null;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__HEIGHT:
			return height != null;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__NUMBER:
			return number != null;
		case CpacsPackage.CABIN_FLOOR_ELEMENT_TYPE__UID:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //CabinFloorElementTypeImpl
