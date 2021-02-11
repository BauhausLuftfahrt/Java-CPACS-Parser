/**
 */
package Cpacs.impl;

import Cpacs.CabGeometryType;
import Cpacs.CabinAislesType;
import Cpacs.CabinDoorsType;
import Cpacs.CabinFloorElementsType;
import Cpacs.CabinSeatElementsType;
import Cpacs.CabinSpacesType;
import Cpacs.CpacsPackage;
import Cpacs.DeckType;
import Cpacs.DoubleBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TypeType7;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getZ0 <em>Z0</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getCabGeometry <em>Cab Geometry</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getAisles <em>Aisles</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getSeatElements <em>Seat Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getFloorElements <em>Floor Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckTypeImpl extends ComplexBaseTypeImpl implements DeckType {
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
	 * The cached value of the '{@link #getParentUID() <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parentUID;

	/**
	 * The cached value of the '{@link #getX0() <em>X0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX0()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType x0;

	/**
	 * The cached value of the '{@link #getZ0() <em>Z0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ0()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType z0;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType7 type;

	/**
	 * The cached value of the '{@link #getCabGeometry() <em>Cab Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabGeometry()
	 * @generated
	 * @ordered
	 */
	protected CabGeometryType cabGeometry;

	/**
	 * The cached value of the '{@link #getAisles() <em>Aisles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAisles()
	 * @generated
	 * @ordered
	 */
	protected CabinAislesType aisles;

	/**
	 * The cached value of the '{@link #getSpaces() <em>Spaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaces()
	 * @generated
	 * @ordered
	 */
	protected CabinSpacesType spaces;

	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected CabinDoorsType doors;

	/**
	 * The cached value of the '{@link #getSeatElements() <em>Seat Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatElements()
	 * @generated
	 * @ordered
	 */
	protected CabinSeatElementsType seatElements;

	/**
	 * The cached value of the '{@link #getFloorElements() <em>Floor Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorElements()
	 * @generated
	 * @ordered
	 */
	protected CabinFloorElementsType floorElements;

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
	protected DeckTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__NAME,
					oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__NAME, newName, newName));
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
					CpacsPackage.DECK_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParentUID() {
		return parentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUID(StringUIDBaseType newParentUID, NotificationChain msgs) {
		StringUIDBaseType oldParentUID = parentUID;
		parentUID = newParentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
	public void setParentUID(StringUIDBaseType newParentUID) {
		if (newParentUID != parentUID) {
			NotificationChain msgs = null;
			if (parentUID != null)
				msgs = ((InternalEObject) parentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__PARENT_UID, newParentUID,
					newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getX0() {
		return x0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX0(DoubleBaseType newX0, NotificationChain msgs) {
		DoubleBaseType oldX0 = x0;
		x0 = newX0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__X0,
					oldX0, newX0);
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
	public void setX0(DoubleBaseType newX0) {
		if (newX0 != x0) {
			NotificationChain msgs = null;
			if (x0 != null)
				msgs = ((InternalEObject) x0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__X0,
						null, msgs);
			if (newX0 != null)
				msgs = ((InternalEObject) newX0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__X0,
						null, msgs);
			msgs = basicSetX0(newX0, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__X0, newX0, newX0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getZ0() {
		return z0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ0(DoubleBaseType newZ0, NotificationChain msgs) {
		DoubleBaseType oldZ0 = z0;
		z0 = newZ0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__Z0,
					oldZ0, newZ0);
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
	public void setZ0(DoubleBaseType newZ0) {
		if (newZ0 != z0) {
			NotificationChain msgs = null;
			if (z0 != null)
				msgs = ((InternalEObject) z0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__Z0,
						null, msgs);
			if (newZ0 != null)
				msgs = ((InternalEObject) newZ0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__Z0,
						null, msgs);
			msgs = basicSetZ0(newZ0, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__Z0, newZ0, newZ0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType7 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeType7 newType, NotificationChain msgs) {
		TypeType7 oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__TYPE,
					oldType, newType);
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
	public void setType(TypeType7 newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabGeometryType getCabGeometry() {
		return cabGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCabGeometry(CabGeometryType newCabGeometry, NotificationChain msgs) {
		CabGeometryType oldCabGeometry = cabGeometry;
		cabGeometry = newCabGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__CAB_GEOMETRY, oldCabGeometry, newCabGeometry);
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
	public void setCabGeometry(CabGeometryType newCabGeometry) {
		if (newCabGeometry != cabGeometry) {
			NotificationChain msgs = null;
			if (cabGeometry != null)
				msgs = ((InternalEObject) cabGeometry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CAB_GEOMETRY, null, msgs);
			if (newCabGeometry != null)
				msgs = ((InternalEObject) newCabGeometry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CAB_GEOMETRY, null, msgs);
			msgs = basicSetCabGeometry(newCabGeometry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__CAB_GEOMETRY, newCabGeometry,
					newCabGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinAislesType getAisles() {
		return aisles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAisles(CabinAislesType newAisles, NotificationChain msgs) {
		CabinAislesType oldAisles = aisles;
		aisles = newAisles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__AISLES, oldAisles, newAisles);
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
	public void setAisles(CabinAislesType newAisles) {
		if (newAisles != aisles) {
			NotificationChain msgs = null;
			if (aisles != null)
				msgs = ((InternalEObject) aisles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__AISLES, null, msgs);
			if (newAisles != null)
				msgs = ((InternalEObject) newAisles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__AISLES, null, msgs);
			msgs = basicSetAisles(newAisles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__AISLES, newAisles,
					newAisles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinSpacesType getSpaces() {
		return spaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpaces(CabinSpacesType newSpaces, NotificationChain msgs) {
		CabinSpacesType oldSpaces = spaces;
		spaces = newSpaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__SPACES, oldSpaces, newSpaces);
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
	public void setSpaces(CabinSpacesType newSpaces) {
		if (newSpaces != spaces) {
			NotificationChain msgs = null;
			if (spaces != null)
				msgs = ((InternalEObject) spaces).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SPACES, null, msgs);
			if (newSpaces != null)
				msgs = ((InternalEObject) newSpaces).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SPACES, null, msgs);
			msgs = basicSetSpaces(newSpaces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__SPACES, newSpaces,
					newSpaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinDoorsType getDoors() {
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoors(CabinDoorsType newDoors, NotificationChain msgs) {
		CabinDoorsType oldDoors = doors;
		doors = newDoors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__DOORS, oldDoors, newDoors);
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
	public void setDoors(CabinDoorsType newDoors) {
		if (newDoors != doors) {
			NotificationChain msgs = null;
			if (doors != null)
				msgs = ((InternalEObject) doors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DOORS, null, msgs);
			if (newDoors != null)
				msgs = ((InternalEObject) newDoors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DOORS, null, msgs);
			msgs = basicSetDoors(newDoors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__DOORS, newDoors, newDoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinSeatElementsType getSeatElements() {
		return seatElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeatElements(CabinSeatElementsType newSeatElements, NotificationChain msgs) {
		CabinSeatElementsType oldSeatElements = seatElements;
		seatElements = newSeatElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__SEAT_ELEMENTS, oldSeatElements, newSeatElements);
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
	public void setSeatElements(CabinSeatElementsType newSeatElements) {
		if (newSeatElements != seatElements) {
			NotificationChain msgs = null;
			if (seatElements != null)
				msgs = ((InternalEObject) seatElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SEAT_ELEMENTS, null, msgs);
			if (newSeatElements != null)
				msgs = ((InternalEObject) newSeatElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SEAT_ELEMENTS, null, msgs);
			msgs = basicSetSeatElements(newSeatElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__SEAT_ELEMENTS,
					newSeatElements, newSeatElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinFloorElementsType getFloorElements() {
		return floorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloorElements(CabinFloorElementsType newFloorElements, NotificationChain msgs) {
		CabinFloorElementsType oldFloorElements = floorElements;
		floorElements = newFloorElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS, oldFloorElements, newFloorElements);
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
	public void setFloorElements(CabinFloorElementsType newFloorElements) {
		if (newFloorElements != floorElements) {
			NotificationChain msgs = null;
			if (floorElements != null)
				msgs = ((InternalEObject) floorElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS, null, msgs);
			if (newFloorElements != null)
				msgs = ((InternalEObject) newFloorElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS, null, msgs);
			msgs = basicSetFloorElements(newFloorElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS,
					newFloorElements, newFloorElements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DECK_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.DECK_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.DECK_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.DECK_TYPE__X0:
			return basicSetX0(null, msgs);
		case CpacsPackage.DECK_TYPE__Z0:
			return basicSetZ0(null, msgs);
		case CpacsPackage.DECK_TYPE__TYPE:
			return basicSetType(null, msgs);
		case CpacsPackage.DECK_TYPE__CAB_GEOMETRY:
			return basicSetCabGeometry(null, msgs);
		case CpacsPackage.DECK_TYPE__AISLES:
			return basicSetAisles(null, msgs);
		case CpacsPackage.DECK_TYPE__SPACES:
			return basicSetSpaces(null, msgs);
		case CpacsPackage.DECK_TYPE__DOORS:
			return basicSetDoors(null, msgs);
		case CpacsPackage.DECK_TYPE__SEAT_ELEMENTS:
			return basicSetSeatElements(null, msgs);
		case CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS:
			return basicSetFloorElements(null, msgs);
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
		case CpacsPackage.DECK_TYPE__NAME:
			return getName();
		case CpacsPackage.DECK_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.DECK_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.DECK_TYPE__X0:
			return getX0();
		case CpacsPackage.DECK_TYPE__Z0:
			return getZ0();
		case CpacsPackage.DECK_TYPE__TYPE:
			return getType();
		case CpacsPackage.DECK_TYPE__CAB_GEOMETRY:
			return getCabGeometry();
		case CpacsPackage.DECK_TYPE__AISLES:
			return getAisles();
		case CpacsPackage.DECK_TYPE__SPACES:
			return getSpaces();
		case CpacsPackage.DECK_TYPE__DOORS:
			return getDoors();
		case CpacsPackage.DECK_TYPE__SEAT_ELEMENTS:
			return getSeatElements();
		case CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS:
			return getFloorElements();
		case CpacsPackage.DECK_TYPE__UID:
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
		case CpacsPackage.DECK_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__X0:
			setX0((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__Z0:
			setZ0((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__TYPE:
			setType((TypeType7) newValue);
			return;
		case CpacsPackage.DECK_TYPE__CAB_GEOMETRY:
			setCabGeometry((CabGeometryType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__AISLES:
			setAisles((CabinAislesType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__SPACES:
			setSpaces((CabinSpacesType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__DOORS:
			setDoors((CabinDoorsType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__SEAT_ELEMENTS:
			setSeatElements((CabinSeatElementsType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS:
			setFloorElements((CabinFloorElementsType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__UID:
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
		case CpacsPackage.DECK_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.DECK_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.DECK_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DECK_TYPE__X0:
			setX0((DoubleBaseType) null);
			return;
		case CpacsPackage.DECK_TYPE__Z0:
			setZ0((DoubleBaseType) null);
			return;
		case CpacsPackage.DECK_TYPE__TYPE:
			setType((TypeType7) null);
			return;
		case CpacsPackage.DECK_TYPE__CAB_GEOMETRY:
			setCabGeometry((CabGeometryType) null);
			return;
		case CpacsPackage.DECK_TYPE__AISLES:
			setAisles((CabinAislesType) null);
			return;
		case CpacsPackage.DECK_TYPE__SPACES:
			setSpaces((CabinSpacesType) null);
			return;
		case CpacsPackage.DECK_TYPE__DOORS:
			setDoors((CabinDoorsType) null);
			return;
		case CpacsPackage.DECK_TYPE__SEAT_ELEMENTS:
			setSeatElements((CabinSeatElementsType) null);
			return;
		case CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS:
			setFloorElements((CabinFloorElementsType) null);
			return;
		case CpacsPackage.DECK_TYPE__UID:
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
		case CpacsPackage.DECK_TYPE__NAME:
			return name != null;
		case CpacsPackage.DECK_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.DECK_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.DECK_TYPE__X0:
			return x0 != null;
		case CpacsPackage.DECK_TYPE__Z0:
			return z0 != null;
		case CpacsPackage.DECK_TYPE__TYPE:
			return type != null;
		case CpacsPackage.DECK_TYPE__CAB_GEOMETRY:
			return cabGeometry != null;
		case CpacsPackage.DECK_TYPE__AISLES:
			return aisles != null;
		case CpacsPackage.DECK_TYPE__SPACES:
			return spaces != null;
		case CpacsPackage.DECK_TYPE__DOORS:
			return doors != null;
		case CpacsPackage.DECK_TYPE__SEAT_ELEMENTS:
			return seatElements != null;
		case CpacsPackage.DECK_TYPE__FLOOR_ELEMENTS:
			return floorElements != null;
		case CpacsPackage.DECK_TYPE__UID:
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

} //DeckTypeImpl
