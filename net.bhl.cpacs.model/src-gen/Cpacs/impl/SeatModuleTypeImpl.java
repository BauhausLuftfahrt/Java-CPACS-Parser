/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.PointType;
import Cpacs.SeatModuleType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat Module Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SeatModuleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.SeatModuleTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.SeatModuleTypeImpl#getNumberOfSeats <em>Number Of Seats</em>}</li>
 *   <li>{@link Cpacs.impl.SeatModuleTypeImpl#getWidthOfSeatModule <em>Width Of Seat Module</em>}</li>
 *   <li>{@link Cpacs.impl.SeatModuleTypeImpl#getModuleMass <em>Module Mass</em>}</li>
 *   <li>{@link Cpacs.impl.SeatModuleTypeImpl#getModuleCoG <em>Module Co G</em>}</li>
 *   <li>{@link Cpacs.impl.SeatModuleTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeatModuleTypeImpl extends ComplexBaseTypeImpl implements SeatModuleType {
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
	 * The cached value of the '{@link #getNumberOfSeats() <em>Number Of Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSeats()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfSeats;

	/**
	 * The cached value of the '{@link #getWidthOfSeatModule() <em>Width Of Seat Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthOfSeatModule()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType widthOfSeatModule;

	/**
	 * The cached value of the '{@link #getModuleMass() <em>Module Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType moduleMass;

	/**
	 * The cached value of the '{@link #getModuleCoG() <em>Module Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleCoG()
	 * @generated
	 * @ordered
	 */
	protected PointType moduleCoG;

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
	protected SeatModuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSeatModuleType();
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
					CpacsPackage.SEAT_MODULE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_MODULE_TYPE__NAME, newName,
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
					CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSeats(IntegerBaseType newNumberOfSeats, NotificationChain msgs) {
		IntegerBaseType oldNumberOfSeats = numberOfSeats;
		numberOfSeats = newNumberOfSeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS, oldNumberOfSeats, newNumberOfSeats);
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
	public void setNumberOfSeats(IntegerBaseType newNumberOfSeats) {
		if (newNumberOfSeats != numberOfSeats) {
			NotificationChain msgs = null;
			if (numberOfSeats != null)
				msgs = ((InternalEObject) numberOfSeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS, null, msgs);
			if (newNumberOfSeats != null)
				msgs = ((InternalEObject) newNumberOfSeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS, null, msgs);
			msgs = basicSetNumberOfSeats(newNumberOfSeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS,
					newNumberOfSeats, newNumberOfSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getWidthOfSeatModule() {
		return widthOfSeatModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidthOfSeatModule(DoubleBaseType newWidthOfSeatModule, NotificationChain msgs) {
		DoubleBaseType oldWidthOfSeatModule = widthOfSeatModule;
		widthOfSeatModule = newWidthOfSeatModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE, oldWidthOfSeatModule, newWidthOfSeatModule);
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
	public void setWidthOfSeatModule(DoubleBaseType newWidthOfSeatModule) {
		if (newWidthOfSeatModule != widthOfSeatModule) {
			NotificationChain msgs = null;
			if (widthOfSeatModule != null)
				msgs = ((InternalEObject) widthOfSeatModule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE, null, msgs);
			if (newWidthOfSeatModule != null)
				msgs = ((InternalEObject) newWidthOfSeatModule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE, null, msgs);
			msgs = basicSetWidthOfSeatModule(newWidthOfSeatModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE,
					newWidthOfSeatModule, newWidthOfSeatModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getModuleMass() {
		return moduleMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleMass(DoubleBaseType newModuleMass, NotificationChain msgs) {
		DoubleBaseType oldModuleMass = moduleMass;
		moduleMass = newModuleMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS, oldModuleMass, newModuleMass);
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
	public void setModuleMass(DoubleBaseType newModuleMass) {
		if (newModuleMass != moduleMass) {
			NotificationChain msgs = null;
			if (moduleMass != null)
				msgs = ((InternalEObject) moduleMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS, null, msgs);
			if (newModuleMass != null)
				msgs = ((InternalEObject) newModuleMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS, null, msgs);
			msgs = basicSetModuleMass(newModuleMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS,
					newModuleMass, newModuleMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getModuleCoG() {
		return moduleCoG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleCoG(PointType newModuleCoG, NotificationChain msgs) {
		PointType oldModuleCoG = moduleCoG;
		moduleCoG = newModuleCoG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G, oldModuleCoG, newModuleCoG);
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
	public void setModuleCoG(PointType newModuleCoG) {
		if (newModuleCoG != moduleCoG) {
			NotificationChain msgs = null;
			if (moduleCoG != null)
				msgs = ((InternalEObject) moduleCoG).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G, null, msgs);
			if (newModuleCoG != null)
				msgs = ((InternalEObject) newModuleCoG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G, null, msgs);
			msgs = basicSetModuleCoG(newModuleCoG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G,
					newModuleCoG, newModuleCoG));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SEAT_MODULE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SEAT_MODULE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS:
			return basicSetNumberOfSeats(null, msgs);
		case CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE:
			return basicSetWidthOfSeatModule(null, msgs);
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS:
			return basicSetModuleMass(null, msgs);
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G:
			return basicSetModuleCoG(null, msgs);
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
		case CpacsPackage.SEAT_MODULE_TYPE__NAME:
			return getName();
		case CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS:
			return getNumberOfSeats();
		case CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE:
			return getWidthOfSeatModule();
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS:
			return getModuleMass();
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G:
			return getModuleCoG();
		case CpacsPackage.SEAT_MODULE_TYPE__UID:
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
		case CpacsPackage.SEAT_MODULE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS:
			setNumberOfSeats((IntegerBaseType) newValue);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE:
			setWidthOfSeatModule((DoubleBaseType) newValue);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS:
			setModuleMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G:
			setModuleCoG((PointType) newValue);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__UID:
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
		case CpacsPackage.SEAT_MODULE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS:
			setNumberOfSeats((IntegerBaseType) null);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE:
			setWidthOfSeatModule((DoubleBaseType) null);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS:
			setModuleMass((DoubleBaseType) null);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G:
			setModuleCoG((PointType) null);
			return;
		case CpacsPackage.SEAT_MODULE_TYPE__UID:
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
		case CpacsPackage.SEAT_MODULE_TYPE__NAME:
			return name != null;
		case CpacsPackage.SEAT_MODULE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.SEAT_MODULE_TYPE__NUMBER_OF_SEATS:
			return numberOfSeats != null;
		case CpacsPackage.SEAT_MODULE_TYPE__WIDTH_OF_SEAT_MODULE:
			return widthOfSeatModule != null;
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_MASS:
			return moduleMass != null;
		case CpacsPackage.SEAT_MODULE_TYPE__MODULE_CO_G:
			return moduleCoG != null;
		case CpacsPackage.SEAT_MODULE_TYPE__UID:
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

} //SeatModuleTypeImpl
