/**
 */
package Cpacs.impl;

import Cpacs.AxleType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.SideOfFirstWheelType;
import Cpacs.StrutPropertiesType;
import Cpacs.WheelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getShaftProperties <em>Shaft Properties</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getNumberOfWheels <em>Number Of Wheels</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getSideOfFirstWheel <em>Side Of First Wheel</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getWheel <em>Wheel</em>}</li>
 *   <li>{@link Cpacs.impl.AxleTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxleTypeImpl extends ComplexBaseTypeImpl implements AxleType {
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
	 * The cached value of the '{@link #getShaftProperties() <em>Shaft Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaftProperties()
	 * @generated
	 * @ordered
	 */
	protected StrutPropertiesType shaftProperties;

	/**
	 * The cached value of the '{@link #getNumberOfWheels() <em>Number Of Wheels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfWheels()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfWheels;

	/**
	 * The default value of the '{@link #getSideOfFirstWheel() <em>Side Of First Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideOfFirstWheel()
	 * @generated
	 * @ordered
	 */
	protected static final SideOfFirstWheelType SIDE_OF_FIRST_WHEEL_EDEFAULT = SideOfFirstWheelType.INBOARD;

	/**
	 * The cached value of the '{@link #getSideOfFirstWheel() <em>Side Of First Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSideOfFirstWheel()
	 * @generated
	 * @ordered
	 */
	protected SideOfFirstWheelType sideOfFirstWheel = SIDE_OF_FIRST_WHEEL_EDEFAULT;

	/**
	 * This is true if the Side Of First Wheel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sideOfFirstWheelESet;

	/**
	 * The cached value of the '{@link #getWheel() <em>Wheel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheel()
	 * @generated
	 * @ordered
	 */
	protected WheelType wheel;

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
	protected AxleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAxleType();
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
					CpacsPackage.AXLE_TYPE__LENGTH, oldLength, newLength);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__LENGTH, newLength,
					newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutPropertiesType getShaftProperties() {
		return shaftProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShaftProperties(StrutPropertiesType newShaftProperties, NotificationChain msgs) {
		StrutPropertiesType oldShaftProperties = shaftProperties;
		shaftProperties = newShaftProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES, oldShaftProperties, newShaftProperties);
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
	public void setShaftProperties(StrutPropertiesType newShaftProperties) {
		if (newShaftProperties != shaftProperties) {
			NotificationChain msgs = null;
			if (shaftProperties != null)
				msgs = ((InternalEObject) shaftProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES, null, msgs);
			if (newShaftProperties != null)
				msgs = ((InternalEObject) newShaftProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES, null, msgs);
			msgs = basicSetShaftProperties(newShaftProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES,
					newShaftProperties, newShaftProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfWheels(IntegerBaseType newNumberOfWheels, NotificationChain msgs) {
		IntegerBaseType oldNumberOfWheels = numberOfWheels;
		numberOfWheels = newNumberOfWheels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS, oldNumberOfWheels, newNumberOfWheels);
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
	public void setNumberOfWheels(IntegerBaseType newNumberOfWheels) {
		if (newNumberOfWheels != numberOfWheels) {
			NotificationChain msgs = null;
			if (numberOfWheels != null)
				msgs = ((InternalEObject) numberOfWheels).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS, null, msgs);
			if (newNumberOfWheels != null)
				msgs = ((InternalEObject) newNumberOfWheels).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS, null, msgs);
			msgs = basicSetNumberOfWheels(newNumberOfWheels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS,
					newNumberOfWheels, newNumberOfWheels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SideOfFirstWheelType getSideOfFirstWheel() {
		return sideOfFirstWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSideOfFirstWheel(SideOfFirstWheelType newSideOfFirstWheel) {
		SideOfFirstWheelType oldSideOfFirstWheel = sideOfFirstWheel;
		sideOfFirstWheel = newSideOfFirstWheel == null ? SIDE_OF_FIRST_WHEEL_EDEFAULT : newSideOfFirstWheel;
		boolean oldSideOfFirstWheelESet = sideOfFirstWheelESet;
		sideOfFirstWheelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__SIDE_OF_FIRST_WHEEL,
					oldSideOfFirstWheel, sideOfFirstWheel, !oldSideOfFirstWheelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSideOfFirstWheel() {
		SideOfFirstWheelType oldSideOfFirstWheel = sideOfFirstWheel;
		boolean oldSideOfFirstWheelESet = sideOfFirstWheelESet;
		sideOfFirstWheel = SIDE_OF_FIRST_WHEEL_EDEFAULT;
		sideOfFirstWheelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.AXLE_TYPE__SIDE_OF_FIRST_WHEEL,
					oldSideOfFirstWheel, SIDE_OF_FIRST_WHEEL_EDEFAULT, oldSideOfFirstWheelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSideOfFirstWheel() {
		return sideOfFirstWheelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WheelType getWheel() {
		return wheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWheel(WheelType newWheel, NotificationChain msgs) {
		WheelType oldWheel = wheel;
		wheel = newWheel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AXLE_TYPE__WHEEL, oldWheel, newWheel);
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
	public void setWheel(WheelType newWheel) {
		if (newWheel != wheel) {
			NotificationChain msgs = null;
			if (wheel != null)
				msgs = ((InternalEObject) wheel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__WHEEL, null, msgs);
			if (newWheel != null)
				msgs = ((InternalEObject) newWheel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_TYPE__WHEEL, null, msgs);
			msgs = basicSetWheel(newWheel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__WHEEL, newWheel, newWheel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AXLE_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES:
			return basicSetShaftProperties(null, msgs);
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			return basicSetNumberOfWheels(null, msgs);
		case CpacsPackage.AXLE_TYPE__WHEEL:
			return basicSetWheel(null, msgs);
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
		case CpacsPackage.AXLE_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES:
			return getShaftProperties();
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			return getNumberOfWheels();
		case CpacsPackage.AXLE_TYPE__SIDE_OF_FIRST_WHEEL:
			return getSideOfFirstWheel();
		case CpacsPackage.AXLE_TYPE__WHEEL:
			return getWheel();
		case CpacsPackage.AXLE_TYPE__UID:
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
		case CpacsPackage.AXLE_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES:
			setShaftProperties((StrutPropertiesType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			setNumberOfWheels((IntegerBaseType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__SIDE_OF_FIRST_WHEEL:
			setSideOfFirstWheel((SideOfFirstWheelType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__WHEEL:
			setWheel((WheelType) newValue);
			return;
		case CpacsPackage.AXLE_TYPE__UID:
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
		case CpacsPackage.AXLE_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES:
			setShaftProperties((StrutPropertiesType) null);
			return;
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			setNumberOfWheels((IntegerBaseType) null);
			return;
		case CpacsPackage.AXLE_TYPE__SIDE_OF_FIRST_WHEEL:
			unsetSideOfFirstWheel();
			return;
		case CpacsPackage.AXLE_TYPE__WHEEL:
			setWheel((WheelType) null);
			return;
		case CpacsPackage.AXLE_TYPE__UID:
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
		case CpacsPackage.AXLE_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.AXLE_TYPE__SHAFT_PROPERTIES:
			return shaftProperties != null;
		case CpacsPackage.AXLE_TYPE__NUMBER_OF_WHEELS:
			return numberOfWheels != null;
		case CpacsPackage.AXLE_TYPE__SIDE_OF_FIRST_WHEEL:
			return isSetSideOfFirstWheel();
		case CpacsPackage.AXLE_TYPE__WHEEL:
			return wheel != null;
		case CpacsPackage.AXLE_TYPE__UID:
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
		result.append(" (sideOfFirstWheel: ");
		if (sideOfFirstWheelESet)
			result.append(sideOfFirstWheel);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //AxleTypeImpl
