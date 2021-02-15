/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorSurroundStructuresAssemblyType;
import Cpacs.DoorsType;
import Cpacs.PressureBulkheadsType;
import Cpacs.ProfileBasedStructuralElementsType;
import Cpacs.RivetsType;
import Cpacs.SeatModulesType;
import Cpacs.SheetBasedStructuralElementsType;
import Cpacs.StructuralElementsType;
import Cpacs.StructuralWallElementsType;
import Cpacs.WindowsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getSheetBasedStructuralElements <em>Sheet Based Structural Elements</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getProfileBasedStructuralElements <em>Profile Based Structural Elements</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getStructuralWallElements <em>Structural Wall Elements</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getPressureBulkheads <em>Pressure Bulkheads</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getDoorSurroundStructures <em>Door Surround Structures</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getSeatModules <em>Seat Modules</em>}</li>
 *   <li>{@link Cpacs.impl.StructuralElementsTypeImpl#getRivets <em>Rivets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuralElementsTypeImpl extends ComplexBaseTypeImpl implements StructuralElementsType {
	/**
	 * The cached value of the '{@link #getSheetBasedStructuralElements() <em>Sheet Based Structural Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetBasedStructuralElements()
	 * @generated
	 * @ordered
	 */
	protected SheetBasedStructuralElementsType sheetBasedStructuralElements;

	/**
	 * The cached value of the '{@link #getProfileBasedStructuralElements() <em>Profile Based Structural Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileBasedStructuralElements()
	 * @generated
	 * @ordered
	 */
	protected ProfileBasedStructuralElementsType profileBasedStructuralElements;

	/**
	 * The cached value of the '{@link #getStructuralWallElements() <em>Structural Wall Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralWallElements()
	 * @generated
	 * @ordered
	 */
	protected StructuralWallElementsType structuralWallElements;

	/**
	 * The cached value of the '{@link #getPressureBulkheads() <em>Pressure Bulkheads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureBulkheads()
	 * @generated
	 * @ordered
	 */
	protected PressureBulkheadsType pressureBulkheads;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected WindowsType windows;

	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected DoorsType doors;

	/**
	 * The cached value of the '{@link #getDoorSurroundStructures() <em>Door Surround Structures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorSurroundStructures()
	 * @generated
	 * @ordered
	 */
	protected DoorSurroundStructuresAssemblyType doorSurroundStructures;

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
	 * The cached value of the '{@link #getRivets() <em>Rivets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRivets()
	 * @generated
	 * @ordered
	 */
	protected RivetsType rivets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStructuralElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SheetBasedStructuralElementsType getSheetBasedStructuralElements() {
		return sheetBasedStructuralElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSheetBasedStructuralElements(
			SheetBasedStructuralElementsType newSheetBasedStructuralElements, NotificationChain msgs) {
		SheetBasedStructuralElementsType oldSheetBasedStructuralElements = sheetBasedStructuralElements;
		sheetBasedStructuralElements = newSheetBasedStructuralElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS,
					oldSheetBasedStructuralElements, newSheetBasedStructuralElements);
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
	public void setSheetBasedStructuralElements(SheetBasedStructuralElementsType newSheetBasedStructuralElements) {
		if (newSheetBasedStructuralElements != sheetBasedStructuralElements) {
			NotificationChain msgs = null;
			if (sheetBasedStructuralElements != null)
				msgs = ((InternalEObject) sheetBasedStructuralElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS,
						null, msgs);
			if (newSheetBasedStructuralElements != null)
				msgs = ((InternalEObject) newSheetBasedStructuralElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS,
						null, msgs);
			msgs = basicSetSheetBasedStructuralElements(newSheetBasedStructuralElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS,
					newSheetBasedStructuralElements, newSheetBasedStructuralElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfileBasedStructuralElementsType getProfileBasedStructuralElements() {
		return profileBasedStructuralElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfileBasedStructuralElements(
			ProfileBasedStructuralElementsType newProfileBasedStructuralElements, NotificationChain msgs) {
		ProfileBasedStructuralElementsType oldProfileBasedStructuralElements = profileBasedStructuralElements;
		profileBasedStructuralElements = newProfileBasedStructuralElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS,
					oldProfileBasedStructuralElements, newProfileBasedStructuralElements);
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
	public void setProfileBasedStructuralElements(
			ProfileBasedStructuralElementsType newProfileBasedStructuralElements) {
		if (newProfileBasedStructuralElements != profileBasedStructuralElements) {
			NotificationChain msgs = null;
			if (profileBasedStructuralElements != null)
				msgs = ((InternalEObject) profileBasedStructuralElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS, null, msgs);
			if (newProfileBasedStructuralElements != null)
				msgs = ((InternalEObject) newProfileBasedStructuralElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS, null, msgs);
			msgs = basicSetProfileBasedStructuralElements(newProfileBasedStructuralElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS,
					newProfileBasedStructuralElements, newProfileBasedStructuralElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuralWallElementsType getStructuralWallElements() {
		return structuralWallElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralWallElements(StructuralWallElementsType newStructuralWallElements,
			NotificationChain msgs) {
		StructuralWallElementsType oldStructuralWallElements = structuralWallElements;
		structuralWallElements = newStructuralWallElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS, oldStructuralWallElements,
					newStructuralWallElements);
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
	public void setStructuralWallElements(StructuralWallElementsType newStructuralWallElements) {
		if (newStructuralWallElements != structuralWallElements) {
			NotificationChain msgs = null;
			if (structuralWallElements != null)
				msgs = ((InternalEObject) structuralWallElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS, null,
						msgs);
			if (newStructuralWallElements != null)
				msgs = ((InternalEObject) newStructuralWallElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS, null,
						msgs);
			msgs = basicSetStructuralWallElements(newStructuralWallElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS, newStructuralWallElements,
					newStructuralWallElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PressureBulkheadsType getPressureBulkheads() {
		return pressureBulkheads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressureBulkheads(PressureBulkheadsType newPressureBulkheads,
			NotificationChain msgs) {
		PressureBulkheadsType oldPressureBulkheads = pressureBulkheads;
		pressureBulkheads = newPressureBulkheads;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS, oldPressureBulkheads,
					newPressureBulkheads);
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
	public void setPressureBulkheads(PressureBulkheadsType newPressureBulkheads) {
		if (newPressureBulkheads != pressureBulkheads) {
			NotificationChain msgs = null;
			if (pressureBulkheads != null)
				msgs = ((InternalEObject) pressureBulkheads).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS, null, msgs);
			if (newPressureBulkheads != null)
				msgs = ((InternalEObject) newPressureBulkheads).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS, null, msgs);
			msgs = basicSetPressureBulkheads(newPressureBulkheads, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS, newPressureBulkheads,
					newPressureBulkheads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowsType getWindows() {
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindows(WindowsType newWindows, NotificationChain msgs) {
		WindowsType oldWindows = windows;
		windows = newWindows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS, oldWindows, newWindows);
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
	public void setWindows(WindowsType newWindows) {
		if (newWindows != windows) {
			NotificationChain msgs = null;
			if (windows != null)
				msgs = ((InternalEObject) windows).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS, null, msgs);
			if (newWindows != null)
				msgs = ((InternalEObject) newWindows).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS, null, msgs);
			msgs = basicSetWindows(newWindows, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS,
					newWindows, newWindows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorsType getDoors() {
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoors(DoorsType newDoors, NotificationChain msgs) {
		DoorsType oldDoors = doors;
		doors = newDoors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS, oldDoors, newDoors);
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
	public void setDoors(DoorsType newDoors) {
		if (newDoors != doors) {
			NotificationChain msgs = null;
			if (doors != null)
				msgs = ((InternalEObject) doors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS, null, msgs);
			if (newDoors != null)
				msgs = ((InternalEObject) newDoors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS, null, msgs);
			msgs = basicSetDoors(newDoors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS,
					newDoors, newDoors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorSurroundStructuresAssemblyType getDoorSurroundStructures() {
		return doorSurroundStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoorSurroundStructures(
			DoorSurroundStructuresAssemblyType newDoorSurroundStructures, NotificationChain msgs) {
		DoorSurroundStructuresAssemblyType oldDoorSurroundStructures = doorSurroundStructures;
		doorSurroundStructures = newDoorSurroundStructures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES, oldDoorSurroundStructures,
					newDoorSurroundStructures);
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
	public void setDoorSurroundStructures(DoorSurroundStructuresAssemblyType newDoorSurroundStructures) {
		if (newDoorSurroundStructures != doorSurroundStructures) {
			NotificationChain msgs = null;
			if (doorSurroundStructures != null)
				msgs = ((InternalEObject) doorSurroundStructures).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES, null,
						msgs);
			if (newDoorSurroundStructures != null)
				msgs = ((InternalEObject) newDoorSurroundStructures).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES, null,
						msgs);
			msgs = basicSetDoorSurroundStructures(newDoorSurroundStructures, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES, newDoorSurroundStructures,
					newDoorSurroundStructures));
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
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES, oldSeatModules, newSeatModules);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES, null, msgs);
			if (newSeatModules != null)
				msgs = ((InternalEObject) newSeatModules).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES, null, msgs);
			msgs = basicSetSeatModules(newSeatModules, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES,
					newSeatModules, newSeatModules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RivetsType getRivets() {
		return rivets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRivets(RivetsType newRivets, NotificationChain msgs) {
		RivetsType oldRivets = rivets;
		rivets = newRivets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS, oldRivets, newRivets);
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
	public void setRivets(RivetsType newRivets) {
		if (newRivets != rivets) {
			NotificationChain msgs = null;
			if (rivets != null)
				msgs = ((InternalEObject) rivets).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS, null, msgs);
			if (newRivets != null)
				msgs = ((InternalEObject) newRivets).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS, null, msgs);
			msgs = basicSetRivets(newRivets, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS,
					newRivets, newRivets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS:
			return basicSetSheetBasedStructuralElements(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS:
			return basicSetProfileBasedStructuralElements(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS:
			return basicSetStructuralWallElements(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS:
			return basicSetPressureBulkheads(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS:
			return basicSetWindows(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS:
			return basicSetDoors(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES:
			return basicSetDoorSurroundStructures(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES:
			return basicSetSeatModules(null, msgs);
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS:
			return basicSetRivets(null, msgs);
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
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS:
			return getSheetBasedStructuralElements();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS:
			return getProfileBasedStructuralElements();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS:
			return getStructuralWallElements();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS:
			return getPressureBulkheads();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS:
			return getWindows();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS:
			return getDoors();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES:
			return getDoorSurroundStructures();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES:
			return getSeatModules();
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS:
			return getRivets();
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
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS:
			setSheetBasedStructuralElements((SheetBasedStructuralElementsType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS:
			setProfileBasedStructuralElements((ProfileBasedStructuralElementsType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS:
			setStructuralWallElements((StructuralWallElementsType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS:
			setPressureBulkheads((PressureBulkheadsType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS:
			setWindows((WindowsType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS:
			setDoors((DoorsType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES:
			setDoorSurroundStructures((DoorSurroundStructuresAssemblyType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES:
			setSeatModules((SeatModulesType) newValue);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS:
			setRivets((RivetsType) newValue);
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
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS:
			setSheetBasedStructuralElements((SheetBasedStructuralElementsType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS:
			setProfileBasedStructuralElements((ProfileBasedStructuralElementsType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS:
			setStructuralWallElements((StructuralWallElementsType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS:
			setPressureBulkheads((PressureBulkheadsType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS:
			setWindows((WindowsType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS:
			setDoors((DoorsType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES:
			setDoorSurroundStructures((DoorSurroundStructuresAssemblyType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES:
			setSeatModules((SeatModulesType) null);
			return;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS:
			setRivets((RivetsType) null);
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
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SHEET_BASED_STRUCTURAL_ELEMENTS:
			return sheetBasedStructuralElements != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENTS:
			return profileBasedStructuralElements != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__STRUCTURAL_WALL_ELEMENTS:
			return structuralWallElements != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__PRESSURE_BULKHEADS:
			return pressureBulkheads != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__WINDOWS:
			return windows != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOORS:
			return doors != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__DOOR_SURROUND_STRUCTURES:
			return doorSurroundStructures != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__SEAT_MODULES:
			return seatModules != null;
		case CpacsPackage.STRUCTURAL_ELEMENTS_TYPE__RIVETS:
			return rivets != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuralElementsTypeImpl
