/**
 */
package Cpacs.impl;

import Cpacs.AxleAssembliesType;
import Cpacs.BogieType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StrutPropertiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bogie Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BogieTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link Cpacs.impl.BogieTypeImpl#getTiltAngle <em>Tilt Angle</em>}</li>
 *   <li>{@link Cpacs.impl.BogieTypeImpl#getStrutProperties <em>Strut Properties</em>}</li>
 *   <li>{@link Cpacs.impl.BogieTypeImpl#getAxleAssemblies <em>Axle Assemblies</em>}</li>
 *   <li>{@link Cpacs.impl.BogieTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BogieTypeImpl extends ComplexBaseTypeImpl implements BogieType {
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
	 * The cached value of the '{@link #getTiltAngle() <em>Tilt Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tiltAngle;

	/**
	 * The cached value of the '{@link #getStrutProperties() <em>Strut Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrutProperties()
	 * @generated
	 * @ordered
	 */
	protected StrutPropertiesType strutProperties;

	/**
	 * The cached value of the '{@link #getAxleAssemblies() <em>Axle Assemblies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxleAssemblies()
	 * @generated
	 * @ordered
	 */
	protected AxleAssembliesType axleAssemblies;

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
	protected BogieTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBogieType();
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
					CpacsPackage.BOGIE_TYPE__LENGTH, oldLength, newLength);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__LENGTH, null, msgs);
			if (newLength != null)
				msgs = ((InternalEObject) newLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__LENGTH, null, msgs);
			msgs = basicSetLength(newLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_TYPE__LENGTH, newLength,
					newLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTiltAngle() {
		return tiltAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiltAngle(DoubleBaseType newTiltAngle, NotificationChain msgs) {
		DoubleBaseType oldTiltAngle = tiltAngle;
		tiltAngle = newTiltAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BOGIE_TYPE__TILT_ANGLE, oldTiltAngle, newTiltAngle);
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
	public void setTiltAngle(DoubleBaseType newTiltAngle) {
		if (newTiltAngle != tiltAngle) {
			NotificationChain msgs = null;
			if (tiltAngle != null)
				msgs = ((InternalEObject) tiltAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__TILT_ANGLE, null, msgs);
			if (newTiltAngle != null)
				msgs = ((InternalEObject) newTiltAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__TILT_ANGLE, null, msgs);
			msgs = basicSetTiltAngle(newTiltAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_TYPE__TILT_ANGLE, newTiltAngle,
					newTiltAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutPropertiesType getStrutProperties() {
		return strutProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrutProperties(StrutPropertiesType newStrutProperties, NotificationChain msgs) {
		StrutPropertiesType oldStrutProperties = strutProperties;
		strutProperties = newStrutProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES, oldStrutProperties, newStrutProperties);
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
	public void setStrutProperties(StrutPropertiesType newStrutProperties) {
		if (newStrutProperties != strutProperties) {
			NotificationChain msgs = null;
			if (strutProperties != null)
				msgs = ((InternalEObject) strutProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES, null, msgs);
			if (newStrutProperties != null)
				msgs = ((InternalEObject) newStrutProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES, null, msgs);
			msgs = basicSetStrutProperties(newStrutProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES,
					newStrutProperties, newStrutProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxleAssembliesType getAxleAssemblies() {
		return axleAssemblies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxleAssemblies(AxleAssembliesType newAxleAssemblies, NotificationChain msgs) {
		AxleAssembliesType oldAxleAssemblies = axleAssemblies;
		axleAssemblies = newAxleAssemblies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES, oldAxleAssemblies, newAxleAssemblies);
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
	public void setAxleAssemblies(AxleAssembliesType newAxleAssemblies) {
		if (newAxleAssemblies != axleAssemblies) {
			NotificationChain msgs = null;
			if (axleAssemblies != null)
				msgs = ((InternalEObject) axleAssemblies).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES, null, msgs);
			if (newAxleAssemblies != null)
				msgs = ((InternalEObject) newAxleAssemblies).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES, null, msgs);
			msgs = basicSetAxleAssemblies(newAxleAssemblies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES,
					newAxleAssemblies, newAxleAssemblies));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BOGIE_TYPE__LENGTH:
			return basicSetLength(null, msgs);
		case CpacsPackage.BOGIE_TYPE__TILT_ANGLE:
			return basicSetTiltAngle(null, msgs);
		case CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES:
			return basicSetStrutProperties(null, msgs);
		case CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES:
			return basicSetAxleAssemblies(null, msgs);
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
		case CpacsPackage.BOGIE_TYPE__LENGTH:
			return getLength();
		case CpacsPackage.BOGIE_TYPE__TILT_ANGLE:
			return getTiltAngle();
		case CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES:
			return getStrutProperties();
		case CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES:
			return getAxleAssemblies();
		case CpacsPackage.BOGIE_TYPE__UID:
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
		case CpacsPackage.BOGIE_TYPE__LENGTH:
			setLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BOGIE_TYPE__TILT_ANGLE:
			setTiltAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES:
			setStrutProperties((StrutPropertiesType) newValue);
			return;
		case CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES:
			setAxleAssemblies((AxleAssembliesType) newValue);
			return;
		case CpacsPackage.BOGIE_TYPE__UID:
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
		case CpacsPackage.BOGIE_TYPE__LENGTH:
			setLength((DoubleBaseType) null);
			return;
		case CpacsPackage.BOGIE_TYPE__TILT_ANGLE:
			setTiltAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES:
			setStrutProperties((StrutPropertiesType) null);
			return;
		case CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES:
			setAxleAssemblies((AxleAssembliesType) null);
			return;
		case CpacsPackage.BOGIE_TYPE__UID:
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
		case CpacsPackage.BOGIE_TYPE__LENGTH:
			return length != null;
		case CpacsPackage.BOGIE_TYPE__TILT_ANGLE:
			return tiltAngle != null;
		case CpacsPackage.BOGIE_TYPE__STRUT_PROPERTIES:
			return strutProperties != null;
		case CpacsPackage.BOGIE_TYPE__AXLE_ASSEMBLIES:
			return axleAssemblies != null;
		case CpacsPackage.BOGIE_TYPE__UID:
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

} //BogieTypeImpl
