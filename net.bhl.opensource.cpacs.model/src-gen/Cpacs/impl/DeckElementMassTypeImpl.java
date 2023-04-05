/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckElementMassType;
import Cpacs.DoubleBaseType;
import Cpacs.MassInertiaType;
import Cpacs.PointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Element Mass Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckElementMassTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementMassTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementMassTypeImpl#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementMassTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckElementMassTypeImpl extends ComplexBaseTypeImpl implements DeckElementMassType {
	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType mass;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected PointType location;

	/**
	 * The cached value of the '{@link #getMassInertia() <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassInertia()
	 * @generated
	 * @ordered
	 */
	protected MassInertiaType massInertia;

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
	protected DeckElementMassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckElementMassType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(DoubleBaseType newMass, NotificationChain msgs) {
		DoubleBaseType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS, oldMass, newMass);
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
	public void setMass(DoubleBaseType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(PointType newLocation, NotificationChain msgs) {
		PointType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(PointType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION,
					newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassInertiaType getMassInertia() {
		return massInertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassInertia(MassInertiaType newMassInertia, NotificationChain msgs) {
		MassInertiaType oldMassInertia = massInertia;
		massInertia = newMassInertia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA, oldMassInertia, newMassInertia);
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
	public void setMassInertia(MassInertiaType newMassInertia) {
		if (newMassInertia != massInertia) {
			NotificationChain msgs = null;
			if (massInertia != null)
				msgs = ((InternalEObject) massInertia).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA, null, msgs);
			if (newMassInertia != null)
				msgs = ((InternalEObject) newMassInertia).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA, null, msgs);
			msgs = basicSetMassInertia(newMassInertia, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA,
					newMassInertia, newMassInertia));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENT_MASS_TYPE__UID, oldUID,
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
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION:
			return basicSetLocation(null, msgs);
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA:
			return basicSetMassInertia(null, msgs);
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
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS:
			return getMass();
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION:
			return getLocation();
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA:
			return getMassInertia();
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__UID:
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
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS:
			setMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION:
			setLocation((PointType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__UID:
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
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS:
			setMass((DoubleBaseType) null);
			return;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION:
			setLocation((PointType) null);
			return;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaType) null);
			return;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__UID:
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
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS:
			return mass != null;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__LOCATION:
			return location != null;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__MASS_INERTIA:
			return massInertia != null;
		case CpacsPackage.DECK_ELEMENT_MASS_TYPE__UID:
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

} //DeckElementMassTypeImpl
