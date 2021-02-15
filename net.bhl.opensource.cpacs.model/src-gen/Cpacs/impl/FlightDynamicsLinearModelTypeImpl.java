/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightDynamicsLinearModelType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Linear Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getALon <em>ALon</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getBLon <em>BLon</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getCLon <em>CLon</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getDLon <em>DLon</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getALat <em>ALat</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getBLat <em>BLat</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getCLat <em>CLat</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsLinearModelTypeImpl#getDLat <em>DLat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsLinearModelTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsLinearModelType {
	/**
	 * The cached value of the '{@link #getALon() <em>ALon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALon()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType aLon;

	/**
	 * The cached value of the '{@link #getBLon() <em>BLon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLon()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType bLon;

	/**
	 * The cached value of the '{@link #getCLon() <em>CLon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLon()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType cLon;

	/**
	 * The cached value of the '{@link #getDLon() <em>DLon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLon()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dLon;

	/**
	 * The cached value of the '{@link #getALat() <em>ALat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALat()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType aLat;

	/**
	 * The cached value of the '{@link #getBLat() <em>BLat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLat()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType bLat;

	/**
	 * The cached value of the '{@link #getCLat() <em>CLat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCLat()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType cLat;

	/**
	 * The cached value of the '{@link #getDLat() <em>DLat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLat()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType dLat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsLinearModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsLinearModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getALon() {
		return aLon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetALon(StringVectorBaseType newALon, NotificationChain msgs) {
		StringVectorBaseType oldALon = aLon;
		aLon = newALon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON, oldALon, newALon);
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
	public void setALon(StringVectorBaseType newALon) {
		if (newALon != aLon) {
			NotificationChain msgs = null;
			if (aLon != null)
				msgs = ((InternalEObject) aLon).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON, null, msgs);
			if (newALon != null)
				msgs = ((InternalEObject) newALon).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON, null, msgs);
			msgs = basicSetALon(newALon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON,
					newALon, newALon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getBLon() {
		return bLon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLon(StringVectorBaseType newBLon, NotificationChain msgs) {
		StringVectorBaseType oldBLon = bLon;
		bLon = newBLon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON, oldBLon, newBLon);
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
	public void setBLon(StringVectorBaseType newBLon) {
		if (newBLon != bLon) {
			NotificationChain msgs = null;
			if (bLon != null)
				msgs = ((InternalEObject) bLon).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON, null, msgs);
			if (newBLon != null)
				msgs = ((InternalEObject) newBLon).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON, null, msgs);
			msgs = basicSetBLon(newBLon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON,
					newBLon, newBLon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCLon() {
		return cLon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCLon(StringVectorBaseType newCLon, NotificationChain msgs) {
		StringVectorBaseType oldCLon = cLon;
		cLon = newCLon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON, oldCLon, newCLon);
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
	public void setCLon(StringVectorBaseType newCLon) {
		if (newCLon != cLon) {
			NotificationChain msgs = null;
			if (cLon != null)
				msgs = ((InternalEObject) cLon).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON, null, msgs);
			if (newCLon != null)
				msgs = ((InternalEObject) newCLon).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON, null, msgs);
			msgs = basicSetCLon(newCLon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON,
					newCLon, newCLon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDLon() {
		return dLon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLon(StringVectorBaseType newDLon, NotificationChain msgs) {
		StringVectorBaseType oldDLon = dLon;
		dLon = newDLon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON, oldDLon, newDLon);
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
	public void setDLon(StringVectorBaseType newDLon) {
		if (newDLon != dLon) {
			NotificationChain msgs = null;
			if (dLon != null)
				msgs = ((InternalEObject) dLon).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON, null, msgs);
			if (newDLon != null)
				msgs = ((InternalEObject) newDLon).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON, null, msgs);
			msgs = basicSetDLon(newDLon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON,
					newDLon, newDLon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getALat() {
		return aLat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetALat(StringVectorBaseType newALat, NotificationChain msgs) {
		StringVectorBaseType oldALat = aLat;
		aLat = newALat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT, oldALat, newALat);
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
	public void setALat(StringVectorBaseType newALat) {
		if (newALat != aLat) {
			NotificationChain msgs = null;
			if (aLat != null)
				msgs = ((InternalEObject) aLat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT, null, msgs);
			if (newALat != null)
				msgs = ((InternalEObject) newALat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT, null, msgs);
			msgs = basicSetALat(newALat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT,
					newALat, newALat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getBLat() {
		return bLat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLat(StringVectorBaseType newBLat, NotificationChain msgs) {
		StringVectorBaseType oldBLat = bLat;
		bLat = newBLat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT, oldBLat, newBLat);
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
	public void setBLat(StringVectorBaseType newBLat) {
		if (newBLat != bLat) {
			NotificationChain msgs = null;
			if (bLat != null)
				msgs = ((InternalEObject) bLat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT, null, msgs);
			if (newBLat != null)
				msgs = ((InternalEObject) newBLat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT, null, msgs);
			msgs = basicSetBLat(newBLat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT,
					newBLat, newBLat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getCLat() {
		return cLat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCLat(StringVectorBaseType newCLat, NotificationChain msgs) {
		StringVectorBaseType oldCLat = cLat;
		cLat = newCLat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT, oldCLat, newCLat);
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
	public void setCLat(StringVectorBaseType newCLat) {
		if (newCLat != cLat) {
			NotificationChain msgs = null;
			if (cLat != null)
				msgs = ((InternalEObject) cLat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT, null, msgs);
			if (newCLat != null)
				msgs = ((InternalEObject) newCLat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT, null, msgs);
			msgs = basicSetCLat(newCLat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT,
					newCLat, newCLat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDLat() {
		return dLat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLat(StringVectorBaseType newDLat, NotificationChain msgs) {
		StringVectorBaseType oldDLat = dLat;
		dLat = newDLat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT, oldDLat, newDLat);
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
	public void setDLat(StringVectorBaseType newDLat) {
		if (newDLat != dLat) {
			NotificationChain msgs = null;
			if (dLat != null)
				msgs = ((InternalEObject) dLat).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT, null, msgs);
			if (newDLat != null)
				msgs = ((InternalEObject) newDLat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT, null, msgs);
			msgs = basicSetDLat(newDLat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT,
					newDLat, newDLat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON:
			return basicSetALon(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON:
			return basicSetBLon(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON:
			return basicSetCLon(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON:
			return basicSetDLon(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT:
			return basicSetALat(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT:
			return basicSetBLat(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT:
			return basicSetCLat(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT:
			return basicSetDLat(null, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON:
			return getALon();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON:
			return getBLon();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON:
			return getCLon();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON:
			return getDLon();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT:
			return getALat();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT:
			return getBLat();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT:
			return getCLat();
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT:
			return getDLat();
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
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON:
			setALon((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON:
			setBLon((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON:
			setCLon((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON:
			setDLon((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT:
			setALat((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT:
			setBLat((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT:
			setCLat((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT:
			setDLat((StringVectorBaseType) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON:
			setALon((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON:
			setBLon((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON:
			setCLon((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON:
			setDLon((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT:
			setALat((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT:
			setBLat((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT:
			setCLat((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT:
			setDLat((StringVectorBaseType) null);
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
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALON:
			return aLon != null;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLON:
			return bLon != null;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLON:
			return cLon != null;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLON:
			return dLon != null;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__ALAT:
			return aLat != null;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__BLAT:
			return bLat != null;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__CLAT:
			return cLat != null;
		case CpacsPackage.FLIGHT_DYNAMICS_LINEAR_MODEL_TYPE__DLAT:
			return dLat != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightDynamicsLinearModelTypeImpl
