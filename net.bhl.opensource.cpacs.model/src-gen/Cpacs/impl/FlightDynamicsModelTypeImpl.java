/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightDynamicsModelType;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getXLonNames <em>XLon Names</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getYLonNames <em>YLon Names</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getULonNames <em>ULon Names</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getXLatNames <em>XLat Names</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getYLatNames <em>YLat Names</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsModelTypeImpl#getULatNames <em>ULat Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsModelTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsModelType {
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
	 * The cached value of the '{@link #getXLonNames() <em>XLon Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLonNames()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType xLonNames;

	/**
	 * The cached value of the '{@link #getYLonNames() <em>YLon Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLonNames()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType yLonNames;

	/**
	 * The cached value of the '{@link #getULonNames() <em>ULon Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getULonNames()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType uLonNames;

	/**
	 * The cached value of the '{@link #getXLatNames() <em>XLat Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLatNames()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType xLatNames;

	/**
	 * The cached value of the '{@link #getYLatNames() <em>YLat Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLatNames()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType yLatNames;

	/**
	 * The cached value of the '{@link #getULatNames() <em>ULat Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getULatNames()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType uLatNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsModelType();
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
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME,
					newName, newName));
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
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getXLonNames() {
		return xLonNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXLonNames(StringVectorBaseType newXLonNames, NotificationChain msgs) {
		StringVectorBaseType oldXLonNames = xLonNames;
		xLonNames = newXLonNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES, oldXLonNames, newXLonNames);
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
	public void setXLonNames(StringVectorBaseType newXLonNames) {
		if (newXLonNames != xLonNames) {
			NotificationChain msgs = null;
			if (xLonNames != null)
				msgs = ((InternalEObject) xLonNames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES, null, msgs);
			if (newXLonNames != null)
				msgs = ((InternalEObject) newXLonNames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES, null, msgs);
			msgs = basicSetXLonNames(newXLonNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES,
					newXLonNames, newXLonNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getYLonNames() {
		return yLonNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYLonNames(StringVectorBaseType newYLonNames, NotificationChain msgs) {
		StringVectorBaseType oldYLonNames = yLonNames;
		yLonNames = newYLonNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES, oldYLonNames, newYLonNames);
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
	public void setYLonNames(StringVectorBaseType newYLonNames) {
		if (newYLonNames != yLonNames) {
			NotificationChain msgs = null;
			if (yLonNames != null)
				msgs = ((InternalEObject) yLonNames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES, null, msgs);
			if (newYLonNames != null)
				msgs = ((InternalEObject) newYLonNames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES, null, msgs);
			msgs = basicSetYLonNames(newYLonNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES,
					newYLonNames, newYLonNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getULonNames() {
		return uLonNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetULonNames(StringVectorBaseType newULonNames, NotificationChain msgs) {
		StringVectorBaseType oldULonNames = uLonNames;
		uLonNames = newULonNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES, oldULonNames, newULonNames);
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
	public void setULonNames(StringVectorBaseType newULonNames) {
		if (newULonNames != uLonNames) {
			NotificationChain msgs = null;
			if (uLonNames != null)
				msgs = ((InternalEObject) uLonNames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES, null, msgs);
			if (newULonNames != null)
				msgs = ((InternalEObject) newULonNames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES, null, msgs);
			msgs = basicSetULonNames(newULonNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES,
					newULonNames, newULonNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getXLatNames() {
		return xLatNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXLatNames(StringVectorBaseType newXLatNames, NotificationChain msgs) {
		StringVectorBaseType oldXLatNames = xLatNames;
		xLatNames = newXLatNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES, oldXLatNames, newXLatNames);
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
	public void setXLatNames(StringVectorBaseType newXLatNames) {
		if (newXLatNames != xLatNames) {
			NotificationChain msgs = null;
			if (xLatNames != null)
				msgs = ((InternalEObject) xLatNames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES, null, msgs);
			if (newXLatNames != null)
				msgs = ((InternalEObject) newXLatNames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES, null, msgs);
			msgs = basicSetXLatNames(newXLatNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES,
					newXLatNames, newXLatNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getYLatNames() {
		return yLatNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYLatNames(StringVectorBaseType newYLatNames, NotificationChain msgs) {
		StringVectorBaseType oldYLatNames = yLatNames;
		yLatNames = newYLatNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES, oldYLatNames, newYLatNames);
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
	public void setYLatNames(StringVectorBaseType newYLatNames) {
		if (newYLatNames != yLatNames) {
			NotificationChain msgs = null;
			if (yLatNames != null)
				msgs = ((InternalEObject) yLatNames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES, null, msgs);
			if (newYLatNames != null)
				msgs = ((InternalEObject) newYLatNames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES, null, msgs);
			msgs = basicSetYLatNames(newYLatNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES,
					newYLatNames, newYLatNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getULatNames() {
		return uLatNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetULatNames(StringVectorBaseType newULatNames, NotificationChain msgs) {
		StringVectorBaseType oldULatNames = uLatNames;
		uLatNames = newULatNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES, oldULatNames, newULatNames);
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
	public void setULatNames(StringVectorBaseType newULatNames) {
		if (newULatNames != uLatNames) {
			NotificationChain msgs = null;
			if (uLatNames != null)
				msgs = ((InternalEObject) uLatNames).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES, null, msgs);
			if (newULatNames != null)
				msgs = ((InternalEObject) newULatNames).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES, null, msgs);
			msgs = basicSetULatNames(newULatNames, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES,
					newULatNames, newULatNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES:
			return basicSetXLonNames(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES:
			return basicSetYLonNames(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES:
			return basicSetULonNames(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES:
			return basicSetXLatNames(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES:
			return basicSetYLatNames(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES:
			return basicSetULatNames(null, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME:
			return getName();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES:
			return getXLonNames();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES:
			return getYLonNames();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES:
			return getULonNames();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES:
			return getXLatNames();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES:
			return getYLatNames();
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES:
			return getULatNames();
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
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES:
			setXLonNames((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES:
			setYLonNames((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES:
			setULonNames((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES:
			setXLatNames((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES:
			setYLatNames((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES:
			setULatNames((StringVectorBaseType) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES:
			setXLonNames((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES:
			setYLonNames((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES:
			setULonNames((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES:
			setXLatNames((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES:
			setYLatNames((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES:
			setULatNames((StringVectorBaseType) null);
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
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__NAME:
			return name != null;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLON_NAMES:
			return xLonNames != null;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLON_NAMES:
			return yLonNames != null;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULON_NAMES:
			return uLonNames != null;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__XLAT_NAMES:
			return xLatNames != null;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__YLAT_NAMES:
			return yLatNames != null;
		case CpacsPackage.FLIGHT_DYNAMICS_MODEL_TYPE__ULAT_NAMES:
			return uLatNames != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightDynamicsModelTypeImpl
