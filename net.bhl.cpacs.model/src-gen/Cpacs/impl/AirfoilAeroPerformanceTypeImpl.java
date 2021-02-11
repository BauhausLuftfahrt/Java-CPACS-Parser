/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceMapsRCType;
import Cpacs.AirfoilAeroPerformanceType;
import Cpacs.CpacsPackage;
import Cpacs.ReferenceType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airfoil Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AirfoilAeroPerformanceTypeImpl#getAirfoilUID <em>Airfoil UID</em>}</li>
 *   <li>{@link Cpacs.impl.AirfoilAeroPerformanceTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.impl.AirfoilAeroPerformanceTypeImpl#getAeroPerformanceMaps <em>Aero Performance Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirfoilAeroPerformanceTypeImpl extends ComplexBaseTypeImpl implements AirfoilAeroPerformanceType {
	/**
	 * The cached value of the '{@link #getAirfoilUID() <em>Airfoil UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirfoilUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType airfoilUID;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType reference;

	/**
	 * The cached value of the '{@link #getAeroPerformanceMaps() <em>Aero Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroPerformanceMaps()
	 * @generated
	 * @ordered
	 */
	protected AeroPerformanceMapsRCType aeroPerformanceMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirfoilAeroPerformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAirfoilAeroPerformanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getAirfoilUID() {
		return airfoilUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirfoilUID(StringUIDBaseType newAirfoilUID, NotificationChain msgs) {
		StringUIDBaseType oldAirfoilUID = airfoilUID;
		airfoilUID = newAirfoilUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID, oldAirfoilUID, newAirfoilUID);
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
	public void setAirfoilUID(StringUIDBaseType newAirfoilUID) {
		if (newAirfoilUID != airfoilUID) {
			NotificationChain msgs = null;
			if (airfoilUID != null)
				msgs = ((InternalEObject) airfoilUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID, null, msgs);
			if (newAirfoilUID != null)
				msgs = ((InternalEObject) newAirfoilUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID, null, msgs);
			msgs = basicSetAirfoilUID(newAirfoilUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID, newAirfoilUID, newAirfoilUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(ReferenceType newReference, NotificationChain msgs) {
		ReferenceType oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE, oldReference, newReference);
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
	public void setReference(ReferenceType newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject) reference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject) newReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE,
					newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroPerformanceMapsRCType getAeroPerformanceMaps() {
		return aeroPerformanceMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroPerformanceMaps(AeroPerformanceMapsRCType newAeroPerformanceMaps,
			NotificationChain msgs) {
		AeroPerformanceMapsRCType oldAeroPerformanceMaps = aeroPerformanceMaps;
		aeroPerformanceMaps = newAeroPerformanceMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS, oldAeroPerformanceMaps,
					newAeroPerformanceMaps);
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
	public void setAeroPerformanceMaps(AeroPerformanceMapsRCType newAeroPerformanceMaps) {
		if (newAeroPerformanceMaps != aeroPerformanceMaps) {
			NotificationChain msgs = null;
			if (aeroPerformanceMaps != null)
				msgs = ((InternalEObject) aeroPerformanceMaps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS,
						null, msgs);
			if (newAeroPerformanceMaps != null)
				msgs = ((InternalEObject) newAeroPerformanceMaps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS,
						null, msgs);
			msgs = basicSetAeroPerformanceMaps(newAeroPerformanceMaps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS, newAeroPerformanceMaps,
					newAeroPerformanceMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID:
			return basicSetAirfoilUID(null, msgs);
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE:
			return basicSetReference(null, msgs);
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS:
			return basicSetAeroPerformanceMaps(null, msgs);
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
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID:
			return getAirfoilUID();
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE:
			return getReference();
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS:
			return getAeroPerformanceMaps();
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
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID:
			setAirfoilUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE:
			setReference((ReferenceType) newValue);
			return;
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS:
			setAeroPerformanceMaps((AeroPerformanceMapsRCType) newValue);
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
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID:
			setAirfoilUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE:
			setReference((ReferenceType) null);
			return;
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS:
			setAeroPerformanceMaps((AeroPerformanceMapsRCType) null);
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
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AIRFOIL_UID:
			return airfoilUID != null;
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__REFERENCE:
			return reference != null;
		case CpacsPackage.AIRFOIL_AERO_PERFORMANCE_TYPE__AERO_PERFORMANCE_MAPS:
			return aeroPerformanceMaps != null;
		}
		return super.eIsSet(featureID);
	}

} //AirfoilAeroPerformanceTypeImpl
