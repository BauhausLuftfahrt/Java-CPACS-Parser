/**
 */
package Cpacs.impl;

import Cpacs.CabinAislesType;
import Cpacs.CabinGeometryType;
import Cpacs.CabinSpacesType;
import Cpacs.CargoContainersType;
import Cpacs.CeilingPanelsType;
import Cpacs.ClassDividersType;
import Cpacs.CpacsPackage;
import Cpacs.DeckDoorsType;
import Cpacs.DeckType;
import Cpacs.DeckTypeType;
import Cpacs.GalleysType;
import Cpacs.GenericFloorModulesType;
import Cpacs.LavatoriesType;
import Cpacs.LuggageCompartmentsType;
import Cpacs.SeatModulesType;
import Cpacs.SidewallPanelsType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TransformationType;

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
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getFloorStructureUID <em>Floor Structure UID</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getDeckType <em>Deck Type</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getCabinGeometry <em>Cabin Geometry</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getSeatModules <em>Seat Modules</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getAisles <em>Aisles</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getSidewallPanels <em>Sidewall Panels</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getLuggageCompartments <em>Luggage Compartments</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getCeilingPanels <em>Ceiling Panels</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getGenericFloorModules <em>Generic Floor Modules</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getClassDividers <em>Class Dividers</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getCargoContainers <em>Cargo Containers</em>}</li>
 *   <li>{@link Cpacs.impl.DeckTypeImpl#getDeckDoors <em>Deck Doors</em>}</li>
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
	 * The cached value of the '{@link #getFloorStructureUID() <em>Floor Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorStructureUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType floorStructureUID;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected TransformationType transformation;

	/**
	 * The cached value of the '{@link #getDeckType() <em>Deck Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckType()
	 * @generated
	 * @ordered
	 */
	protected DeckTypeType deckType;

	/**
	 * The cached value of the '{@link #getCabinGeometry() <em>Cabin Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCabinGeometry()
	 * @generated
	 * @ordered
	 */
	protected CabinGeometryType cabinGeometry;

	/**
	 * The cached value of the '{@link #getSeatModules() <em>Seat Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatModules()
	 * @generated
	 * @ordered
	 */
	protected SeatModulesType seatModules;

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
	 * The cached value of the '{@link #getSidewallPanels() <em>Sidewall Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewallPanels()
	 * @generated
	 * @ordered
	 */
	protected SidewallPanelsType sidewallPanels;

	/**
	 * The cached value of the '{@link #getLuggageCompartments() <em>Luggage Compartments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageCompartments()
	 * @generated
	 * @ordered
	 */
	protected LuggageCompartmentsType luggageCompartments;

	/**
	 * The cached value of the '{@link #getCeilingPanels() <em>Ceiling Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilingPanels()
	 * @generated
	 * @ordered
	 */
	protected CeilingPanelsType ceilingPanels;

	/**
	 * The cached value of the '{@link #getGalleys() <em>Galleys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalleys()
	 * @generated
	 * @ordered
	 */
	protected GalleysType galleys;

	/**
	 * The cached value of the '{@link #getGenericFloorModules() <em>Generic Floor Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericFloorModules()
	 * @generated
	 * @ordered
	 */
	protected GenericFloorModulesType genericFloorModules;

	/**
	 * The cached value of the '{@link #getLavatories() <em>Lavatories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLavatories()
	 * @generated
	 * @ordered
	 */
	protected LavatoriesType lavatories;

	/**
	 * The cached value of the '{@link #getClassDividers() <em>Class Dividers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDividers()
	 * @generated
	 * @ordered
	 */
	protected ClassDividersType classDividers;

	/**
	 * The cached value of the '{@link #getCargoContainers() <em>Cargo Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoContainers()
	 * @generated
	 * @ordered
	 */
	protected CargoContainersType cargoContainers;

	/**
	 * The cached value of the '{@link #getDeckDoors() <em>Deck Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckDoors()
	 * @generated
	 * @ordered
	 */
	protected DeckDoorsType deckDoors;

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
	public StringUIDBaseType getFloorStructureUID() {
		return floorStructureUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloorStructureUID(StringUIDBaseType newFloorStructureUID, NotificationChain msgs) {
		StringUIDBaseType oldFloorStructureUID = floorStructureUID;
		floorStructureUID = newFloorStructureUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID, oldFloorStructureUID, newFloorStructureUID);
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
	public void setFloorStructureUID(StringUIDBaseType newFloorStructureUID) {
		if (newFloorStructureUID != floorStructureUID) {
			NotificationChain msgs = null;
			if (floorStructureUID != null)
				msgs = ((InternalEObject) floorStructureUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID, null, msgs);
			if (newFloorStructureUID != null)
				msgs = ((InternalEObject) newFloorStructureUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID, null, msgs);
			msgs = basicSetFloorStructureUID(newFloorStructureUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID,
					newFloorStructureUID, newFloorStructureUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		TransformationType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
	public void setTransformation(TransformationType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckTypeType getDeckType() {
		return deckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeckType(DeckTypeType newDeckType, NotificationChain msgs) {
		DeckTypeType oldDeckType = deckType;
		deckType = newDeckType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__DECK_TYPE, oldDeckType, newDeckType);
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
	public void setDeckType(DeckTypeType newDeckType) {
		if (newDeckType != deckType) {
			NotificationChain msgs = null;
			if (deckType != null)
				msgs = ((InternalEObject) deckType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DECK_TYPE, null, msgs);
			if (newDeckType != null)
				msgs = ((InternalEObject) newDeckType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DECK_TYPE, null, msgs);
			msgs = basicSetDeckType(newDeckType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__DECK_TYPE, newDeckType,
					newDeckType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinGeometryType getCabinGeometry() {
		return cabinGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCabinGeometry(CabinGeometryType newCabinGeometry, NotificationChain msgs) {
		CabinGeometryType oldCabinGeometry = cabinGeometry;
		cabinGeometry = newCabinGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__CABIN_GEOMETRY, oldCabinGeometry, newCabinGeometry);
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
	public void setCabinGeometry(CabinGeometryType newCabinGeometry) {
		if (newCabinGeometry != cabinGeometry) {
			NotificationChain msgs = null;
			if (cabinGeometry != null)
				msgs = ((InternalEObject) cabinGeometry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CABIN_GEOMETRY, null, msgs);
			if (newCabinGeometry != null)
				msgs = ((InternalEObject) newCabinGeometry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CABIN_GEOMETRY, null, msgs);
			msgs = basicSetCabinGeometry(newCabinGeometry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__CABIN_GEOMETRY,
					newCabinGeometry, newCabinGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeatModulesType getSeatModules() {
		return seatModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeatModules(SeatModulesType newSeatModules, NotificationChain msgs) {
		SeatModulesType oldSeatModules = seatModules;
		seatModules = newSeatModules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__SEAT_MODULES, oldSeatModules, newSeatModules);
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
	public void setSeatModules(SeatModulesType newSeatModules) {
		if (newSeatModules != seatModules) {
			NotificationChain msgs = null;
			if (seatModules != null)
				msgs = ((InternalEObject) seatModules).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SEAT_MODULES, null, msgs);
			if (newSeatModules != null)
				msgs = ((InternalEObject) newSeatModules).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SEAT_MODULES, null, msgs);
			msgs = basicSetSeatModules(newSeatModules, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__SEAT_MODULES, newSeatModules,
					newSeatModules));
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
	public SidewallPanelsType getSidewallPanels() {
		return sidewallPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSidewallPanels(SidewallPanelsType newSidewallPanels, NotificationChain msgs) {
		SidewallPanelsType oldSidewallPanels = sidewallPanels;
		sidewallPanels = newSidewallPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__SIDEWALL_PANELS, oldSidewallPanels, newSidewallPanels);
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
	public void setSidewallPanels(SidewallPanelsType newSidewallPanels) {
		if (newSidewallPanels != sidewallPanels) {
			NotificationChain msgs = null;
			if (sidewallPanels != null)
				msgs = ((InternalEObject) sidewallPanels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SIDEWALL_PANELS, null, msgs);
			if (newSidewallPanels != null)
				msgs = ((InternalEObject) newSidewallPanels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__SIDEWALL_PANELS, null, msgs);
			msgs = basicSetSidewallPanels(newSidewallPanels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__SIDEWALL_PANELS,
					newSidewallPanels, newSidewallPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LuggageCompartmentsType getLuggageCompartments() {
		return luggageCompartments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLuggageCompartments(LuggageCompartmentsType newLuggageCompartments,
			NotificationChain msgs) {
		LuggageCompartmentsType oldLuggageCompartments = luggageCompartments;
		luggageCompartments = newLuggageCompartments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS, oldLuggageCompartments, newLuggageCompartments);
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
	public void setLuggageCompartments(LuggageCompartmentsType newLuggageCompartments) {
		if (newLuggageCompartments != luggageCompartments) {
			NotificationChain msgs = null;
			if (luggageCompartments != null)
				msgs = ((InternalEObject) luggageCompartments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS, null, msgs);
			if (newLuggageCompartments != null)
				msgs = ((InternalEObject) newLuggageCompartments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS, null, msgs);
			msgs = basicSetLuggageCompartments(newLuggageCompartments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS,
					newLuggageCompartments, newLuggageCompartments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CeilingPanelsType getCeilingPanels() {
		return ceilingPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCeilingPanels(CeilingPanelsType newCeilingPanels, NotificationChain msgs) {
		CeilingPanelsType oldCeilingPanels = ceilingPanels;
		ceilingPanels = newCeilingPanels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__CEILING_PANELS, oldCeilingPanels, newCeilingPanels);
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
	public void setCeilingPanels(CeilingPanelsType newCeilingPanels) {
		if (newCeilingPanels != ceilingPanels) {
			NotificationChain msgs = null;
			if (ceilingPanels != null)
				msgs = ((InternalEObject) ceilingPanels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CEILING_PANELS, null, msgs);
			if (newCeilingPanels != null)
				msgs = ((InternalEObject) newCeilingPanels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CEILING_PANELS, null, msgs);
			msgs = basicSetCeilingPanels(newCeilingPanels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__CEILING_PANELS,
					newCeilingPanels, newCeilingPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GalleysType getGalleys() {
		return galleys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGalleys(GalleysType newGalleys, NotificationChain msgs) {
		GalleysType oldGalleys = galleys;
		galleys = newGalleys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__GALLEYS, oldGalleys, newGalleys);
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
	public void setGalleys(GalleysType newGalleys) {
		if (newGalleys != galleys) {
			NotificationChain msgs = null;
			if (galleys != null)
				msgs = ((InternalEObject) galleys).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__GALLEYS, null, msgs);
			if (newGalleys != null)
				msgs = ((InternalEObject) newGalleys).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__GALLEYS, null, msgs);
			msgs = basicSetGalleys(newGalleys, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__GALLEYS, newGalleys,
					newGalleys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericFloorModulesType getGenericFloorModules() {
		return genericFloorModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericFloorModules(GenericFloorModulesType newGenericFloorModules,
			NotificationChain msgs) {
		GenericFloorModulesType oldGenericFloorModules = genericFloorModules;
		genericFloorModules = newGenericFloorModules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES, oldGenericFloorModules, newGenericFloorModules);
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
	public void setGenericFloorModules(GenericFloorModulesType newGenericFloorModules) {
		if (newGenericFloorModules != genericFloorModules) {
			NotificationChain msgs = null;
			if (genericFloorModules != null)
				msgs = ((InternalEObject) genericFloorModules).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES, null, msgs);
			if (newGenericFloorModules != null)
				msgs = ((InternalEObject) newGenericFloorModules).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES, null, msgs);
			msgs = basicSetGenericFloorModules(newGenericFloorModules, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES,
					newGenericFloorModules, newGenericFloorModules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LavatoriesType getLavatories() {
		return lavatories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLavatories(LavatoriesType newLavatories, NotificationChain msgs) {
		LavatoriesType oldLavatories = lavatories;
		lavatories = newLavatories;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__LAVATORIES, oldLavatories, newLavatories);
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
	public void setLavatories(LavatoriesType newLavatories) {
		if (newLavatories != lavatories) {
			NotificationChain msgs = null;
			if (lavatories != null)
				msgs = ((InternalEObject) lavatories).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__LAVATORIES, null, msgs);
			if (newLavatories != null)
				msgs = ((InternalEObject) newLavatories).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__LAVATORIES, null, msgs);
			msgs = basicSetLavatories(newLavatories, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__LAVATORIES, newLavatories,
					newLavatories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDividersType getClassDividers() {
		return classDividers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassDividers(ClassDividersType newClassDividers, NotificationChain msgs) {
		ClassDividersType oldClassDividers = classDividers;
		classDividers = newClassDividers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__CLASS_DIVIDERS, oldClassDividers, newClassDividers);
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
	public void setClassDividers(ClassDividersType newClassDividers) {
		if (newClassDividers != classDividers) {
			NotificationChain msgs = null;
			if (classDividers != null)
				msgs = ((InternalEObject) classDividers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CLASS_DIVIDERS, null, msgs);
			if (newClassDividers != null)
				msgs = ((InternalEObject) newClassDividers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CLASS_DIVIDERS, null, msgs);
			msgs = basicSetClassDividers(newClassDividers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__CLASS_DIVIDERS,
					newClassDividers, newClassDividers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoContainersType getCargoContainers() {
		return cargoContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCargoContainers(CargoContainersType newCargoContainers, NotificationChain msgs) {
		CargoContainersType oldCargoContainers = cargoContainers;
		cargoContainers = newCargoContainers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__CARGO_CONTAINERS, oldCargoContainers, newCargoContainers);
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
	public void setCargoContainers(CargoContainersType newCargoContainers) {
		if (newCargoContainers != cargoContainers) {
			NotificationChain msgs = null;
			if (cargoContainers != null)
				msgs = ((InternalEObject) cargoContainers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CARGO_CONTAINERS, null, msgs);
			if (newCargoContainers != null)
				msgs = ((InternalEObject) newCargoContainers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__CARGO_CONTAINERS, null, msgs);
			msgs = basicSetCargoContainers(newCargoContainers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__CARGO_CONTAINERS,
					newCargoContainers, newCargoContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckDoorsType getDeckDoors() {
		return deckDoors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeckDoors(DeckDoorsType newDeckDoors, NotificationChain msgs) {
		DeckDoorsType oldDeckDoors = deckDoors;
		deckDoors = newDeckDoors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_TYPE__DECK_DOORS, oldDeckDoors, newDeckDoors);
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
	public void setDeckDoors(DeckDoorsType newDeckDoors) {
		if (newDeckDoors != deckDoors) {
			NotificationChain msgs = null;
			if (deckDoors != null)
				msgs = ((InternalEObject) deckDoors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DECK_DOORS, null, msgs);
			if (newDeckDoors != null)
				msgs = ((InternalEObject) newDeckDoors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_TYPE__DECK_DOORS, null, msgs);
			msgs = basicSetDeckDoors(newDeckDoors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_TYPE__DECK_DOORS, newDeckDoors,
					newDeckDoors));
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
		case CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID:
			return basicSetFloorStructureUID(null, msgs);
		case CpacsPackage.DECK_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case CpacsPackage.DECK_TYPE__DECK_TYPE:
			return basicSetDeckType(null, msgs);
		case CpacsPackage.DECK_TYPE__CABIN_GEOMETRY:
			return basicSetCabinGeometry(null, msgs);
		case CpacsPackage.DECK_TYPE__SEAT_MODULES:
			return basicSetSeatModules(null, msgs);
		case CpacsPackage.DECK_TYPE__AISLES:
			return basicSetAisles(null, msgs);
		case CpacsPackage.DECK_TYPE__SPACES:
			return basicSetSpaces(null, msgs);
		case CpacsPackage.DECK_TYPE__SIDEWALL_PANELS:
			return basicSetSidewallPanels(null, msgs);
		case CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS:
			return basicSetLuggageCompartments(null, msgs);
		case CpacsPackage.DECK_TYPE__CEILING_PANELS:
			return basicSetCeilingPanels(null, msgs);
		case CpacsPackage.DECK_TYPE__GALLEYS:
			return basicSetGalleys(null, msgs);
		case CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES:
			return basicSetGenericFloorModules(null, msgs);
		case CpacsPackage.DECK_TYPE__LAVATORIES:
			return basicSetLavatories(null, msgs);
		case CpacsPackage.DECK_TYPE__CLASS_DIVIDERS:
			return basicSetClassDividers(null, msgs);
		case CpacsPackage.DECK_TYPE__CARGO_CONTAINERS:
			return basicSetCargoContainers(null, msgs);
		case CpacsPackage.DECK_TYPE__DECK_DOORS:
			return basicSetDeckDoors(null, msgs);
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
		case CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID:
			return getFloorStructureUID();
		case CpacsPackage.DECK_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.DECK_TYPE__DECK_TYPE:
			return getDeckType();
		case CpacsPackage.DECK_TYPE__CABIN_GEOMETRY:
			return getCabinGeometry();
		case CpacsPackage.DECK_TYPE__SEAT_MODULES:
			return getSeatModules();
		case CpacsPackage.DECK_TYPE__AISLES:
			return getAisles();
		case CpacsPackage.DECK_TYPE__SPACES:
			return getSpaces();
		case CpacsPackage.DECK_TYPE__SIDEWALL_PANELS:
			return getSidewallPanels();
		case CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS:
			return getLuggageCompartments();
		case CpacsPackage.DECK_TYPE__CEILING_PANELS:
			return getCeilingPanels();
		case CpacsPackage.DECK_TYPE__GALLEYS:
			return getGalleys();
		case CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES:
			return getGenericFloorModules();
		case CpacsPackage.DECK_TYPE__LAVATORIES:
			return getLavatories();
		case CpacsPackage.DECK_TYPE__CLASS_DIVIDERS:
			return getClassDividers();
		case CpacsPackage.DECK_TYPE__CARGO_CONTAINERS:
			return getCargoContainers();
		case CpacsPackage.DECK_TYPE__DECK_DOORS:
			return getDeckDoors();
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
		case CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID:
			setFloorStructureUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__DECK_TYPE:
			setDeckType((DeckTypeType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__CABIN_GEOMETRY:
			setCabinGeometry((CabinGeometryType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__SEAT_MODULES:
			setSeatModules((SeatModulesType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__AISLES:
			setAisles((CabinAislesType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__SPACES:
			setSpaces((CabinSpacesType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__SIDEWALL_PANELS:
			setSidewallPanels((SidewallPanelsType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS:
			setLuggageCompartments((LuggageCompartmentsType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__CEILING_PANELS:
			setCeilingPanels((CeilingPanelsType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__GALLEYS:
			setGalleys((GalleysType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES:
			setGenericFloorModules((GenericFloorModulesType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__LAVATORIES:
			setLavatories((LavatoriesType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__CLASS_DIVIDERS:
			setClassDividers((ClassDividersType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__CARGO_CONTAINERS:
			setCargoContainers((CargoContainersType) newValue);
			return;
		case CpacsPackage.DECK_TYPE__DECK_DOORS:
			setDeckDoors((DeckDoorsType) newValue);
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
		case CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID:
			setFloorStructureUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DECK_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.DECK_TYPE__DECK_TYPE:
			setDeckType((DeckTypeType) null);
			return;
		case CpacsPackage.DECK_TYPE__CABIN_GEOMETRY:
			setCabinGeometry((CabinGeometryType) null);
			return;
		case CpacsPackage.DECK_TYPE__SEAT_MODULES:
			setSeatModules((SeatModulesType) null);
			return;
		case CpacsPackage.DECK_TYPE__AISLES:
			setAisles((CabinAislesType) null);
			return;
		case CpacsPackage.DECK_TYPE__SPACES:
			setSpaces((CabinSpacesType) null);
			return;
		case CpacsPackage.DECK_TYPE__SIDEWALL_PANELS:
			setSidewallPanels((SidewallPanelsType) null);
			return;
		case CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS:
			setLuggageCompartments((LuggageCompartmentsType) null);
			return;
		case CpacsPackage.DECK_TYPE__CEILING_PANELS:
			setCeilingPanels((CeilingPanelsType) null);
			return;
		case CpacsPackage.DECK_TYPE__GALLEYS:
			setGalleys((GalleysType) null);
			return;
		case CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES:
			setGenericFloorModules((GenericFloorModulesType) null);
			return;
		case CpacsPackage.DECK_TYPE__LAVATORIES:
			setLavatories((LavatoriesType) null);
			return;
		case CpacsPackage.DECK_TYPE__CLASS_DIVIDERS:
			setClassDividers((ClassDividersType) null);
			return;
		case CpacsPackage.DECK_TYPE__CARGO_CONTAINERS:
			setCargoContainers((CargoContainersType) null);
			return;
		case CpacsPackage.DECK_TYPE__DECK_DOORS:
			setDeckDoors((DeckDoorsType) null);
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
		case CpacsPackage.DECK_TYPE__FLOOR_STRUCTURE_UID:
			return floorStructureUID != null;
		case CpacsPackage.DECK_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.DECK_TYPE__DECK_TYPE:
			return deckType != null;
		case CpacsPackage.DECK_TYPE__CABIN_GEOMETRY:
			return cabinGeometry != null;
		case CpacsPackage.DECK_TYPE__SEAT_MODULES:
			return seatModules != null;
		case CpacsPackage.DECK_TYPE__AISLES:
			return aisles != null;
		case CpacsPackage.DECK_TYPE__SPACES:
			return spaces != null;
		case CpacsPackage.DECK_TYPE__SIDEWALL_PANELS:
			return sidewallPanels != null;
		case CpacsPackage.DECK_TYPE__LUGGAGE_COMPARTMENTS:
			return luggageCompartments != null;
		case CpacsPackage.DECK_TYPE__CEILING_PANELS:
			return ceilingPanels != null;
		case CpacsPackage.DECK_TYPE__GALLEYS:
			return galleys != null;
		case CpacsPackage.DECK_TYPE__GENERIC_FLOOR_MODULES:
			return genericFloorModules != null;
		case CpacsPackage.DECK_TYPE__LAVATORIES:
			return lavatories != null;
		case CpacsPackage.DECK_TYPE__CLASS_DIVIDERS:
			return classDividers != null;
		case CpacsPackage.DECK_TYPE__CARGO_CONTAINERS:
			return cargoContainers != null;
		case CpacsPackage.DECK_TYPE__DECK_DOORS:
			return deckDoors != null;
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
