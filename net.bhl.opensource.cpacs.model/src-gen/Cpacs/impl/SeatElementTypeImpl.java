/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckElementGeometryType;
import Cpacs.DeckElementMassType;
import Cpacs.PosExcl0IntBaseType;
import Cpacs.SeatElementType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SeatElementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.SeatElementTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link Cpacs.impl.SeatElementTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.SeatElementTypeImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link Cpacs.impl.SeatElementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatElementTypeImpl extends ComplexBaseTypeImpl implements SeatElementType {
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
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected DeckElementGeometryType geometry;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected DeckElementMassType mass;

	/**
	 * The cached value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected PosExcl0IntBaseType numberOfSeats;

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
	protected SeatElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSeatElementType();
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
					CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckElementGeometryType getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(DeckElementGeometryType newGeometry, NotificationChain msgs) {
		DeckElementGeometryType oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(DeckElementGeometryType newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject) geometry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject) newGeometry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY, newGeometry,
					newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckElementMassType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(DeckElementMassType newMass, NotificationChain msgs) {
		DeckElementMassType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SEAT_ELEMENT_TYPE__MASS, oldMass, newMass);
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
	public void setMass(DeckElementMassType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_ELEMENT_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosExcl0IntBaseType getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSeats(PosExcl0IntBaseType newNumberOfSeats, NotificationChain msgs) {
		PosExcl0IntBaseType oldNumberOfSeats = numberOfSeats;
		numberOfSeats = newNumberOfSeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS, oldNumberOfSeats, newNumberOfSeats);
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
	public void setNumberOfSeats(PosExcl0IntBaseType newNumberOfSeats) {
		if (newNumberOfSeats != numberOfSeats) {
			NotificationChain msgs = null;
			if (numberOfSeats != null)
				msgs = ((InternalEObject) numberOfSeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS, null, msgs);
			if (newNumberOfSeats != null)
				msgs = ((InternalEObject) newNumberOfSeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS, null, msgs);
			msgs = basicSetNumberOfSeats(newNumberOfSeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS,
					newNumberOfSeats, newNumberOfSeats));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_ELEMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY:
			return basicSetGeometry(null, msgs);
		case CpacsPackage.SEAT_ELEMENT_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS:
			return basicSetNumberOfSeats(null, msgs);
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
		case CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY:
			return getGeometry();
		case CpacsPackage.SEAT_ELEMENT_TYPE__MASS:
			return getMass();
		case CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS:
			return getNumberOfSeats();
		case CpacsPackage.SEAT_ELEMENT_TYPE__UID:
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
		case CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY:
			setGeometry((DeckElementGeometryType) newValue);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__MASS:
			setMass((DeckElementMassType) newValue);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS:
			setNumberOfSeats((PosExcl0IntBaseType) newValue);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__UID:
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
		case CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY:
			setGeometry((DeckElementGeometryType) null);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__MASS:
			setMass((DeckElementMassType) null);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS:
			setNumberOfSeats((PosExcl0IntBaseType) null);
			return;
		case CpacsPackage.SEAT_ELEMENT_TYPE__UID:
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
		case CpacsPackage.SEAT_ELEMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.SEAT_ELEMENT_TYPE__GEOMETRY:
			return geometry != null;
		case CpacsPackage.SEAT_ELEMENT_TYPE__MASS:
			return mass != null;
		case CpacsPackage.SEAT_ELEMENT_TYPE__NUMBER_OF_SEATS:
			return numberOfSeats != null;
		case CpacsPackage.SEAT_ELEMENT_TYPE__UID:
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

} //SeatElementTypeImpl
