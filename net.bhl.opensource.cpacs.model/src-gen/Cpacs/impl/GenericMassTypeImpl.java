/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.GenericMassType;
import Cpacs.MassInertiaType;
import Cpacs.PointAbsRelType;
import Cpacs.PointType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Mass Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.impl.GenericMassTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericMassTypeImpl extends ComplexBaseTypeImpl implements GenericMassType {
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
	 * The cached value of the '{@link #getComponentUID() <em>Component UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType componentUID;

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
	protected PointAbsRelType location;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected PointType orientation;

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
	protected GenericMassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericMassType();
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
					CpacsPackage.GENERIC_MASS_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__NAME, newName,
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
					CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION,
					newDescription, newDescription));
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
					CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID,
					newParentUID, newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getComponentUID() {
		return componentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentUID(StringUIDBaseType newComponentUID, NotificationChain msgs) {
		StringUIDBaseType oldComponentUID = componentUID;
		componentUID = newComponentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID, oldComponentUID, newComponentUID);
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
	public void setComponentUID(StringUIDBaseType newComponentUID) {
		if (newComponentUID != componentUID) {
			NotificationChain msgs = null;
			if (componentUID != null)
				msgs = ((InternalEObject) componentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID, null, msgs);
			if (newComponentUID != null)
				msgs = ((InternalEObject) newComponentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID, null, msgs);
			msgs = basicSetComponentUID(newComponentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID,
					newComponentUID, newComponentUID));
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
					CpacsPackage.GENERIC_MASS_TYPE__MASS, oldMass, newMass);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointAbsRelType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(PointAbsRelType newLocation, NotificationChain msgs) {
		PointAbsRelType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_MASS_TYPE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(PointAbsRelType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(PointType newOrientation, NotificationChain msgs) {
		PointType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION, oldOrientation, newOrientation);
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
	public void setOrientation(PointType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject) orientation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject) newOrientation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION,
					newOrientation, newOrientation));
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
					CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA, oldMassInertia, newMassInertia);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA, null, msgs);
			if (newMassInertia != null)
				msgs = ((InternalEObject) newMassInertia).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA, null, msgs);
			msgs = basicSetMassInertia(newMassInertia, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_MASS_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_MASS_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID:
			return basicSetComponentUID(null, msgs);
		case CpacsPackage.GENERIC_MASS_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.GENERIC_MASS_TYPE__LOCATION:
			return basicSetLocation(null, msgs);
		case CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION:
			return basicSetOrientation(null, msgs);
		case CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA:
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
		case CpacsPackage.GENERIC_MASS_TYPE__NAME:
			return getName();
		case CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID:
			return getComponentUID();
		case CpacsPackage.GENERIC_MASS_TYPE__MASS:
			return getMass();
		case CpacsPackage.GENERIC_MASS_TYPE__LOCATION:
			return getLocation();
		case CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION:
			return getOrientation();
		case CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA:
			return getMassInertia();
		case CpacsPackage.GENERIC_MASS_TYPE__UID:
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
		case CpacsPackage.GENERIC_MASS_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__MASS:
			setMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__LOCATION:
			setLocation((PointAbsRelType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION:
			setOrientation((PointType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaType) newValue);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__UID:
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
		case CpacsPackage.GENERIC_MASS_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__MASS:
			setMass((DoubleBaseType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__LOCATION:
			setLocation((PointAbsRelType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION:
			setOrientation((PointType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaType) null);
			return;
		case CpacsPackage.GENERIC_MASS_TYPE__UID:
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
		case CpacsPackage.GENERIC_MASS_TYPE__NAME:
			return name != null;
		case CpacsPackage.GENERIC_MASS_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.GENERIC_MASS_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.GENERIC_MASS_TYPE__COMPONENT_UID:
			return componentUID != null;
		case CpacsPackage.GENERIC_MASS_TYPE__MASS:
			return mass != null;
		case CpacsPackage.GENERIC_MASS_TYPE__LOCATION:
			return location != null;
		case CpacsPackage.GENERIC_MASS_TYPE__ORIENTATION:
			return orientation != null;
		case CpacsPackage.GENERIC_MASS_TYPE__MASS_INERTIA:
			return massInertia != null;
		case CpacsPackage.GENERIC_MASS_TYPE__UID:
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

} //GenericMassTypeImpl
