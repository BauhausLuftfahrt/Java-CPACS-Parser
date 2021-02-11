/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightDynamicsTrimResultType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Trim Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getMach <em>Mach</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getVTAS <em>VTAS</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsTrimResultTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsTrimResultType {
	/**
	 * The cached value of the '{@link #getMach() <em>Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMach()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType mach;

	/**
	 * The cached value of the '{@link #getVTAS() <em>VTAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTAS()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vTAS;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType alpha;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType altitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsTrimResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsTrimResultType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMach() {
		return mach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMach(DoubleBaseType newMach, NotificationChain msgs) {
		DoubleBaseType oldMach = mach;
		mach = newMach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH, oldMach, newMach);
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
	public void setMach(DoubleBaseType newMach) {
		if (newMach != mach) {
			NotificationChain msgs = null;
			if (mach != null)
				msgs = ((InternalEObject) mach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH, null, msgs);
			if (newMach != null)
				msgs = ((InternalEObject) newMach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH, null, msgs);
			msgs = basicSetMach(newMach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH,
					newMach, newMach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVTAS() {
		return vTAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVTAS(DoubleBaseType newVTAS, NotificationChain msgs) {
		DoubleBaseType oldVTAS = vTAS;
		vTAS = newVTAS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS, oldVTAS, newVTAS);
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
	public void setVTAS(DoubleBaseType newVTAS) {
		if (newVTAS != vTAS) {
			NotificationChain msgs = null;
			if (vTAS != null)
				msgs = ((InternalEObject) vTAS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS, null, msgs);
			if (newVTAS != null)
				msgs = ((InternalEObject) newVTAS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS, null, msgs);
			msgs = basicSetVTAS(newVTAS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS,
					newVTAS, newVTAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlpha(DoubleBaseType newAlpha, NotificationChain msgs) {
		DoubleBaseType oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA, oldAlpha, newAlpha);
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
	public void setAlpha(DoubleBaseType newAlpha) {
		if (newAlpha != alpha) {
			NotificationChain msgs = null;
			if (alpha != null)
				msgs = ((InternalEObject) alpha).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA, null, msgs);
			if (newAlpha != null)
				msgs = ((InternalEObject) newAlpha).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA, null, msgs);
			msgs = basicSetAlpha(newAlpha, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA,
					newAlpha, newAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleBaseType newAltitude, NotificationChain msgs) {
		DoubleBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH:
			return basicSetMach(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS:
			return basicSetVTAS(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA:
			return basicSetAlpha(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH:
			return getMach();
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS:
			return getVTAS();
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA:
			return getAlpha();
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			return getAltitude();
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH:
			setMach((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS:
			setVTAS((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA:
			setAlpha((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH:
			setMach((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS:
			setVTAS((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA:
			setAlpha((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) null);
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH:
			return mach != null;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__VTAS:
			return vTAS != null;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALPHA:
			return alpha != null;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			return altitude != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightDynamicsTrimResultTypeImpl
