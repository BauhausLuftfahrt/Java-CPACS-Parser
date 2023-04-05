/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightPerformanceTurnType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Turn Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceTurnTypeImpl#getSustainableLoadFactor <em>Sustainable Load Factor</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceTurnTypeImpl#getInstantaneousLoadFactor <em>Instantaneous Load Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceTurnTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceTurnType {
	/**
	 * The cached value of the '{@link #getSustainableLoadFactor() <em>Sustainable Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSustainableLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType sustainableLoadFactor;

	/**
	 * The cached value of the '{@link #getInstantaneousLoadFactor() <em>Instantaneous Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantaneousLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType instantaneousLoadFactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceTurnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceTurnType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSustainableLoadFactor() {
		return sustainableLoadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSustainableLoadFactor(DoubleBaseType newSustainableLoadFactor,
			NotificationChain msgs) {
		DoubleBaseType oldSustainableLoadFactor = sustainableLoadFactor;
		sustainableLoadFactor = newSustainableLoadFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR, oldSustainableLoadFactor,
					newSustainableLoadFactor);
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
	public void setSustainableLoadFactor(DoubleBaseType newSustainableLoadFactor) {
		if (newSustainableLoadFactor != sustainableLoadFactor) {
			NotificationChain msgs = null;
			if (sustainableLoadFactor != null)
				msgs = ((InternalEObject) sustainableLoadFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR,
						null, msgs);
			if (newSustainableLoadFactor != null)
				msgs = ((InternalEObject) newSustainableLoadFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR,
						null, msgs);
			msgs = basicSetSustainableLoadFactor(newSustainableLoadFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR, newSustainableLoadFactor,
					newSustainableLoadFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getInstantaneousLoadFactor() {
		return instantaneousLoadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstantaneousLoadFactor(DoubleBaseType newInstantaneousLoadFactor,
			NotificationChain msgs) {
		DoubleBaseType oldInstantaneousLoadFactor = instantaneousLoadFactor;
		instantaneousLoadFactor = newInstantaneousLoadFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR, oldInstantaneousLoadFactor,
					newInstantaneousLoadFactor);
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
	public void setInstantaneousLoadFactor(DoubleBaseType newInstantaneousLoadFactor) {
		if (newInstantaneousLoadFactor != instantaneousLoadFactor) {
			NotificationChain msgs = null;
			if (instantaneousLoadFactor != null)
				msgs = ((InternalEObject) instantaneousLoadFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR,
						null, msgs);
			if (newInstantaneousLoadFactor != null)
				msgs = ((InternalEObject) newInstantaneousLoadFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR,
						null, msgs);
			msgs = basicSetInstantaneousLoadFactor(newInstantaneousLoadFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR, newInstantaneousLoadFactor,
					newInstantaneousLoadFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR:
			return basicSetSustainableLoadFactor(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			return basicSetInstantaneousLoadFactor(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR:
			return getSustainableLoadFactor();
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			return getInstantaneousLoadFactor();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR:
			setSustainableLoadFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			setInstantaneousLoadFactor((DoubleBaseType) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR:
			setSustainableLoadFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			setInstantaneousLoadFactor((DoubleBaseType) null);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__SUSTAINABLE_LOAD_FACTOR:
			return sustainableLoadFactor != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_TURN_TYPE__INSTANTANEOUS_LOAD_FACTOR:
			return instantaneousLoadFactor != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightPerformanceTurnTypeImpl
