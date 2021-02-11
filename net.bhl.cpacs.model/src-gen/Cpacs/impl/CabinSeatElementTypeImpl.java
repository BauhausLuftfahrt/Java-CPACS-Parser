/**
 */
package Cpacs.impl;

import Cpacs.CabinSeatElementType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;
import Cpacs.TypeType6;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Seat Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getNSeats <em>NSeats</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getY <em>Y</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getDySeats <em>Dy Seats</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getSeatModuleElementUID <em>Seat Module Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getLongFloorBeam1UID <em>Long Floor Beam1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getLongFloorBeam2UID <em>Long Floor Beam2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.CabinSeatElementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinSeatElementTypeImpl extends ComplexBaseTypeImpl implements CabinSeatElementType {
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
	 * The cached value of the '{@link #getNSeats() <em>NSeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSeats()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType nSeats;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType6 type;

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
	 * The cached value of the '{@link #getDySeats() <em>Dy Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDySeats()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dySeats;

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
	 * The cached value of the '{@link #getSeatModuleElementUID() <em>Seat Module Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatModuleElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType seatModuleElementUID;

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
	protected CabinSeatElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinSeatElementType();
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME, newName,
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNSeats() {
		return nSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSeats(IntegerBaseType newNSeats, NotificationChain msgs) {
		IntegerBaseType oldNSeats = nSeats;
		nSeats = newNSeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS, oldNSeats, newNSeats);
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
	public void setNSeats(IntegerBaseType newNSeats) {
		if (newNSeats != nSeats) {
			NotificationChain msgs = null;
			if (nSeats != null)
				msgs = ((InternalEObject) nSeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS, null, msgs);
			if (newNSeats != null)
				msgs = ((InternalEObject) newNSeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS, null, msgs);
			msgs = basicSetNSeats(newNSeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS,
					newNSeats, newNSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType6 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType6 newType, NotificationChain msgs) {
		TypeType6 oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE, oldType, newType);
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
	public void setType(TypeType6 newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE, newType,
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X, oldX, newX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X, newX, newX));
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y, oldY, newY);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y, null, msgs);
			if (newY != null)
				msgs = ((InternalEObject) newY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y, null, msgs);
			msgs = basicSetY(newY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y, newY, newY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDySeats() {
		return dySeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDySeats(StringVectorBaseType newDySeats, NotificationChain msgs) {
		StringVectorBaseType oldDySeats = dySeats;
		dySeats = newDySeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS, oldDySeats, newDySeats);
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
	public void setDySeats(StringVectorBaseType newDySeats) {
		if (newDySeats != dySeats) {
			NotificationChain msgs = null;
			if (dySeats != null)
				msgs = ((InternalEObject) dySeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS, null, msgs);
			if (newDySeats != null)
				msgs = ((InternalEObject) newDySeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS, null, msgs);
			msgs = basicSetDySeats(newDySeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS,
					newDySeats, newDySeats));
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH, oldLength, newLength);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH,
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH, oldWidth, newWidth);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH, newWidth,
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT, oldHeight, newHeight);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT,
					newHeight, newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSeatModuleElementUID() {
		return seatModuleElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeatModuleElementUID(StringUIDBaseType newSeatModuleElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldSeatModuleElementUID = seatModuleElementUID;
		seatModuleElementUID = newSeatModuleElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID, oldSeatModuleElementUID,
					newSeatModuleElementUID);
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
	public void setSeatModuleElementUID(StringUIDBaseType newSeatModuleElementUID) {
		if (newSeatModuleElementUID != seatModuleElementUID) {
			NotificationChain msgs = null;
			if (seatModuleElementUID != null)
				msgs = ((InternalEObject) seatModuleElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID, null,
						msgs);
			if (newSeatModuleElementUID != null)
				msgs = ((InternalEObject) newSeatModuleElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID, null,
						msgs);
			msgs = basicSetSeatModuleElementUID(newSeatModuleElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID, newSeatModuleElementUID,
					newSeatModuleElementUID));
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID, oldLongFloorBeam1UID,
					newLongFloorBeam1UID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID, null,
						msgs);
			if (newLongFloorBeam1UID != null)
				msgs = ((InternalEObject) newLongFloorBeam1UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID, null,
						msgs);
			msgs = basicSetLongFloorBeam1UID(newLongFloorBeam1UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID, newLongFloorBeam1UID,
					newLongFloorBeam1UID));
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
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID, oldLongFloorBeam2UID,
					newLongFloorBeam2UID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID, null,
						msgs);
			if (newLongFloorBeam2UID != null)
				msgs = ((InternalEObject) newLongFloorBeam2UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID, null,
						msgs);
			msgs = basicSetLongFloorBeam2UID(newLongFloorBeam2UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID, newLongFloorBeam2UID,
					newLongFloorBeam2UID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__UID, oldUID,
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
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS:
			return basicSetNSeats(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE:
			return basicSetType(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X:
			return basicSetX(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y:
			return basicSetY(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS:
			return basicSetDySeats(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH:
			return basicSetWidth(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT:
			return basicSetHeight(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID:
			return basicSetSeatModuleElementUID(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID:
			return basicSetLongFloorBeam1UID(null, msgs);
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID:
			return basicSetLongFloorBeam2UID(null, msgs);
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
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS:
			return getNSeats();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE:
			return getType();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X:
			return getX();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y:
			return getY();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS:
			return getDySeats();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH:
			return getWidth();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT:
			return getHeight();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID:
			return getSeatModuleElementUID();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID:
			return getLongFloorBeam1UID();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID:
			return getLongFloorBeam2UID();
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS:
			setNSeats((IntegerBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE:
			setType((TypeType6) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X:
			setX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y:
			setY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS:
			setDySeats((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH:
			setWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT:
			setHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID:
			setSeatModuleElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID:
			setLongFloorBeam1UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID:
			setLongFloorBeam2UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS:
			setNSeats((IntegerBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE:
			setType((TypeType6) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X:
			setX((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y:
			setY((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS:
			setDySeats((StringVectorBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH:
			setWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT:
			setHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID:
			setSeatModuleElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID:
			setLongFloorBeam1UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID:
			setLongFloorBeam2UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__NSEATS:
			return nSeats != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__TYPE:
			return type != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__X:
			return x != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__Y:
			return y != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__DY_SEATS:
			return dySeats != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__WIDTH:
			return width != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__HEIGHT:
			return height != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__SEAT_MODULE_ELEMENT_UID:
			return seatModuleElementUID != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM1_UID:
			return longFloorBeam1UID != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__LONG_FLOOR_BEAM2_UID:
			return longFloorBeam2UID != null;
		case CpacsPackage.CABIN_SEAT_ELEMENT_TYPE__UID:
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

} //CabinSeatElementTypeImpl
