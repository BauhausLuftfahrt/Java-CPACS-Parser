/**
 */
package Cpacs.impl;

import Cpacs.CargoContainerElementsType;
import Cpacs.CeilingPanelElementsType;
import Cpacs.ClassDividerElementsType;
import Cpacs.CpacsPackage;
import Cpacs.DeckElementsType;
import Cpacs.GalleyElementsType;
import Cpacs.GenericFloorElementsType;
import Cpacs.LavatoryElementsType;
import Cpacs.LuggageCompartmentElementsType;
import Cpacs.SeatElementsType;
import Cpacs.SidewallPanelElementsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getCeilingPanelElements <em>Ceiling Panel Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getClassDividerElements <em>Class Divider Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getGalleyElements <em>Galley Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getGenericFloorElements <em>Generic Floor Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getLavatoryElements <em>Lavatory Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getLuggageCompartmentElements <em>Luggage Compartment Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getSeatElements <em>Seat Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getSidewallPanelElements <em>Sidewall Panel Elements</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementsTypeImpl#getCargoContainerElements <em>Cargo Container Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckElementsTypeImpl extends ComplexBaseTypeImpl implements DeckElementsType {
	/**
	 * The cached value of the '{@link #getCeilingPanelElements() <em>Ceiling Panel Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCeilingPanelElements()
	 * @generated
	 * @ordered
	 */
	protected CeilingPanelElementsType ceilingPanelElements;

	/**
	 * The cached value of the '{@link #getClassDividerElements() <em>Class Divider Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDividerElements()
	 * @generated
	 * @ordered
	 */
	protected ClassDividerElementsType classDividerElements;

	/**
	 * The cached value of the '{@link #getGalleyElements() <em>Galley Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalleyElements()
	 * @generated
	 * @ordered
	 */
	protected GalleyElementsType galleyElements;

	/**
	 * The cached value of the '{@link #getGenericFloorElements() <em>Generic Floor Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericFloorElements()
	 * @generated
	 * @ordered
	 */
	protected GenericFloorElementsType genericFloorElements;

	/**
	 * The cached value of the '{@link #getLavatoryElements() <em>Lavatory Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLavatoryElements()
	 * @generated
	 * @ordered
	 */
	protected LavatoryElementsType lavatoryElements;

	/**
	 * The cached value of the '{@link #getLuggageCompartmentElements() <em>Luggage Compartment Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageCompartmentElements()
	 * @generated
	 * @ordered
	 */
	protected LuggageCompartmentElementsType luggageCompartmentElements;

	/**
	 * The cached value of the '{@link #getSeatElements() <em>Seat Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeatElements()
	 * @generated
	 * @ordered
	 */
	protected SeatElementsType seatElements;

	/**
	 * The cached value of the '{@link #getSidewallPanelElements() <em>Sidewall Panel Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSidewallPanelElements()
	 * @generated
	 * @ordered
	 */
	protected SidewallPanelElementsType sidewallPanelElements;

	/**
	 * The cached value of the '{@link #getCargoContainerElements() <em>Cargo Container Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoContainerElements()
	 * @generated
	 * @ordered
	 */
	protected CargoContainerElementsType cargoContainerElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CeilingPanelElementsType getCeilingPanelElements() {
		return ceilingPanelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCeilingPanelElements(CeilingPanelElementsType newCeilingPanelElements,
			NotificationChain msgs) {
		CeilingPanelElementsType oldCeilingPanelElements = ceilingPanelElements;
		ceilingPanelElements = newCeilingPanelElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS, oldCeilingPanelElements,
					newCeilingPanelElements);
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
	public void setCeilingPanelElements(CeilingPanelElementsType newCeilingPanelElements) {
		if (newCeilingPanelElements != ceilingPanelElements) {
			NotificationChain msgs = null;
			if (ceilingPanelElements != null)
				msgs = ((InternalEObject) ceilingPanelElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS, null, msgs);
			if (newCeilingPanelElements != null)
				msgs = ((InternalEObject) newCeilingPanelElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS, null, msgs);
			msgs = basicSetCeilingPanelElements(newCeilingPanelElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS, newCeilingPanelElements,
					newCeilingPanelElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDividerElementsType getClassDividerElements() {
		return classDividerElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassDividerElements(ClassDividerElementsType newClassDividerElements,
			NotificationChain msgs) {
		ClassDividerElementsType oldClassDividerElements = classDividerElements;
		classDividerElements = newClassDividerElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS, oldClassDividerElements,
					newClassDividerElements);
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
	public void setClassDividerElements(ClassDividerElementsType newClassDividerElements) {
		if (newClassDividerElements != classDividerElements) {
			NotificationChain msgs = null;
			if (classDividerElements != null)
				msgs = ((InternalEObject) classDividerElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS, null, msgs);
			if (newClassDividerElements != null)
				msgs = ((InternalEObject) newClassDividerElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS, null, msgs);
			msgs = basicSetClassDividerElements(newClassDividerElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS, newClassDividerElements,
					newClassDividerElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GalleyElementsType getGalleyElements() {
		return galleyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGalleyElements(GalleyElementsType newGalleyElements, NotificationChain msgs) {
		GalleyElementsType oldGalleyElements = galleyElements;
		galleyElements = newGalleyElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS, oldGalleyElements, newGalleyElements);
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
	public void setGalleyElements(GalleyElementsType newGalleyElements) {
		if (newGalleyElements != galleyElements) {
			NotificationChain msgs = null;
			if (galleyElements != null)
				msgs = ((InternalEObject) galleyElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS, null, msgs);
			if (newGalleyElements != null)
				msgs = ((InternalEObject) newGalleyElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS, null, msgs);
			msgs = basicSetGalleyElements(newGalleyElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS,
					newGalleyElements, newGalleyElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericFloorElementsType getGenericFloorElements() {
		return genericFloorElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericFloorElements(GenericFloorElementsType newGenericFloorElements,
			NotificationChain msgs) {
		GenericFloorElementsType oldGenericFloorElements = genericFloorElements;
		genericFloorElements = newGenericFloorElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS, oldGenericFloorElements,
					newGenericFloorElements);
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
	public void setGenericFloorElements(GenericFloorElementsType newGenericFloorElements) {
		if (newGenericFloorElements != genericFloorElements) {
			NotificationChain msgs = null;
			if (genericFloorElements != null)
				msgs = ((InternalEObject) genericFloorElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS, null, msgs);
			if (newGenericFloorElements != null)
				msgs = ((InternalEObject) newGenericFloorElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS, null, msgs);
			msgs = basicSetGenericFloorElements(newGenericFloorElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS, newGenericFloorElements,
					newGenericFloorElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LavatoryElementsType getLavatoryElements() {
		return lavatoryElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLavatoryElements(LavatoryElementsType newLavatoryElements,
			NotificationChain msgs) {
		LavatoryElementsType oldLavatoryElements = lavatoryElements;
		lavatoryElements = newLavatoryElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS, oldLavatoryElements, newLavatoryElements);
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
	public void setLavatoryElements(LavatoryElementsType newLavatoryElements) {
		if (newLavatoryElements != lavatoryElements) {
			NotificationChain msgs = null;
			if (lavatoryElements != null)
				msgs = ((InternalEObject) lavatoryElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS, null, msgs);
			if (newLavatoryElements != null)
				msgs = ((InternalEObject) newLavatoryElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS, null, msgs);
			msgs = basicSetLavatoryElements(newLavatoryElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS,
					newLavatoryElements, newLavatoryElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LuggageCompartmentElementsType getLuggageCompartmentElements() {
		return luggageCompartmentElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLuggageCompartmentElements(
			LuggageCompartmentElementsType newLuggageCompartmentElements, NotificationChain msgs) {
		LuggageCompartmentElementsType oldLuggageCompartmentElements = luggageCompartmentElements;
		luggageCompartmentElements = newLuggageCompartmentElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS, oldLuggageCompartmentElements,
					newLuggageCompartmentElements);
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
	public void setLuggageCompartmentElements(LuggageCompartmentElementsType newLuggageCompartmentElements) {
		if (newLuggageCompartmentElements != luggageCompartmentElements) {
			NotificationChain msgs = null;
			if (luggageCompartmentElements != null)
				msgs = ((InternalEObject) luggageCompartmentElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS, null,
						msgs);
			if (newLuggageCompartmentElements != null)
				msgs = ((InternalEObject) newLuggageCompartmentElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS, null,
						msgs);
			msgs = basicSetLuggageCompartmentElements(newLuggageCompartmentElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS, newLuggageCompartmentElements,
					newLuggageCompartmentElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeatElementsType getSeatElements() {
		return seatElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeatElements(SeatElementsType newSeatElements, NotificationChain msgs) {
		SeatElementsType oldSeatElements = seatElements;
		seatElements = newSeatElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS, oldSeatElements, newSeatElements);
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
	public void setSeatElements(SeatElementsType newSeatElements) {
		if (newSeatElements != seatElements) {
			NotificationChain msgs = null;
			if (seatElements != null)
				msgs = ((InternalEObject) seatElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS, null, msgs);
			if (newSeatElements != null)
				msgs = ((InternalEObject) newSeatElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS, null, msgs);
			msgs = basicSetSeatElements(newSeatElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS,
					newSeatElements, newSeatElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SidewallPanelElementsType getSidewallPanelElements() {
		return sidewallPanelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSidewallPanelElements(SidewallPanelElementsType newSidewallPanelElements,
			NotificationChain msgs) {
		SidewallPanelElementsType oldSidewallPanelElements = sidewallPanelElements;
		sidewallPanelElements = newSidewallPanelElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS, oldSidewallPanelElements,
					newSidewallPanelElements);
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
	public void setSidewallPanelElements(SidewallPanelElementsType newSidewallPanelElements) {
		if (newSidewallPanelElements != sidewallPanelElements) {
			NotificationChain msgs = null;
			if (sidewallPanelElements != null)
				msgs = ((InternalEObject) sidewallPanelElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS, null, msgs);
			if (newSidewallPanelElements != null)
				msgs = ((InternalEObject) newSidewallPanelElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS, null, msgs);
			msgs = basicSetSidewallPanelElements(newSidewallPanelElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS, newSidewallPanelElements,
					newSidewallPanelElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargoContainerElementsType getCargoContainerElements() {
		return cargoContainerElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCargoContainerElements(CargoContainerElementsType newCargoContainerElements,
			NotificationChain msgs) {
		CargoContainerElementsType oldCargoContainerElements = cargoContainerElements;
		cargoContainerElements = newCargoContainerElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS, oldCargoContainerElements,
					newCargoContainerElements);
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
	public void setCargoContainerElements(CargoContainerElementsType newCargoContainerElements) {
		if (newCargoContainerElements != cargoContainerElements) {
			NotificationChain msgs = null;
			if (cargoContainerElements != null)
				msgs = ((InternalEObject) cargoContainerElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS, null, msgs);
			if (newCargoContainerElements != null)
				msgs = ((InternalEObject) newCargoContainerElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS, null, msgs);
			msgs = basicSetCargoContainerElements(newCargoContainerElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS, newCargoContainerElements,
					newCargoContainerElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS:
			return basicSetCeilingPanelElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS:
			return basicSetClassDividerElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS:
			return basicSetGalleyElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS:
			return basicSetGenericFloorElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS:
			return basicSetLavatoryElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS:
			return basicSetLuggageCompartmentElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS:
			return basicSetSeatElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS:
			return basicSetSidewallPanelElements(null, msgs);
		case CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS:
			return basicSetCargoContainerElements(null, msgs);
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
		case CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS:
			return getCeilingPanelElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS:
			return getClassDividerElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS:
			return getGalleyElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS:
			return getGenericFloorElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS:
			return getLavatoryElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS:
			return getLuggageCompartmentElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS:
			return getSeatElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS:
			return getSidewallPanelElements();
		case CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS:
			return getCargoContainerElements();
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
		case CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS:
			setCeilingPanelElements((CeilingPanelElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS:
			setClassDividerElements((ClassDividerElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS:
			setGalleyElements((GalleyElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS:
			setGenericFloorElements((GenericFloorElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS:
			setLavatoryElements((LavatoryElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS:
			setLuggageCompartmentElements((LuggageCompartmentElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS:
			setSeatElements((SeatElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS:
			setSidewallPanelElements((SidewallPanelElementsType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS:
			setCargoContainerElements((CargoContainerElementsType) newValue);
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
		case CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS:
			setCeilingPanelElements((CeilingPanelElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS:
			setClassDividerElements((ClassDividerElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS:
			setGalleyElements((GalleyElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS:
			setGenericFloorElements((GenericFloorElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS:
			setLavatoryElements((LavatoryElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS:
			setLuggageCompartmentElements((LuggageCompartmentElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS:
			setSeatElements((SeatElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS:
			setSidewallPanelElements((SidewallPanelElementsType) null);
			return;
		case CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS:
			setCargoContainerElements((CargoContainerElementsType) null);
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
		case CpacsPackage.DECK_ELEMENTS_TYPE__CEILING_PANEL_ELEMENTS:
			return ceilingPanelElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__CLASS_DIVIDER_ELEMENTS:
			return classDividerElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__GALLEY_ELEMENTS:
			return galleyElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENTS:
			return genericFloorElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__LAVATORY_ELEMENTS:
			return lavatoryElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__LUGGAGE_COMPARTMENT_ELEMENTS:
			return luggageCompartmentElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__SEAT_ELEMENTS:
			return seatElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__SIDEWALL_PANEL_ELEMENTS:
			return sidewallPanelElements != null;
		case CpacsPackage.DECK_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENTS:
			return cargoContainerElements != null;
		}
		return super.eIsSet(featureID);
	}

} //DeckElementsTypeImpl
