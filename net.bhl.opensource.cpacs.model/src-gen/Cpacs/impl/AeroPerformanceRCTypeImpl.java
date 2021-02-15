/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceRCType;
import Cpacs.AirfoilsAeroPerformanceType;
import Cpacs.ControlSurfacePerformanceMapsOldType;
import Cpacs.CpacsPackage;
import Cpacs.FuselagesAeroPerformanceType;
import Cpacs.GlobalAeroPerformanceType;
import Cpacs.WingsAeroPerformanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Performance RC Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceRCTypeImpl#getGlobalAeroPerformance <em>Global Aero Performance</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceRCTypeImpl#getFuselagesAeroPerformance <em>Fuselages Aero Performance</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceRCTypeImpl#getWingsAeroPerformance <em>Wings Aero Performance</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceRCTypeImpl#getControlSurfacesAeroPerformance <em>Control Surfaces Aero Performance</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceRCTypeImpl#getAirfoilsAeroPerformance <em>Airfoils Aero Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceRCTypeImpl extends ComplexBaseTypeImpl implements AeroPerformanceRCType {
	/**
	 * The cached value of the '{@link #getGlobalAeroPerformance() <em>Global Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected GlobalAeroPerformanceType globalAeroPerformance;

	/**
	 * The cached value of the '{@link #getFuselagesAeroPerformance() <em>Fuselages Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselagesAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected FuselagesAeroPerformanceType fuselagesAeroPerformance;

	/**
	 * The cached value of the '{@link #getWingsAeroPerformance() <em>Wings Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingsAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected WingsAeroPerformanceType wingsAeroPerformance;

	/**
	 * The cached value of the '{@link #getControlSurfacesAeroPerformance() <em>Control Surfaces Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfacesAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfacePerformanceMapsOldType controlSurfacesAeroPerformance;

	/**
	 * The cached value of the '{@link #getAirfoilsAeroPerformance() <em>Airfoils Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirfoilsAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected AirfoilsAeroPerformanceType airfoilsAeroPerformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroPerformanceRCTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceRCType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalAeroPerformanceType getGlobalAeroPerformance() {
		return globalAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalAeroPerformance(GlobalAeroPerformanceType newGlobalAeroPerformance,
			NotificationChain msgs) {
		GlobalAeroPerformanceType oldGlobalAeroPerformance = globalAeroPerformance;
		globalAeroPerformance = newGlobalAeroPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE, oldGlobalAeroPerformance,
					newGlobalAeroPerformance);
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
	public void setGlobalAeroPerformance(GlobalAeroPerformanceType newGlobalAeroPerformance) {
		if (newGlobalAeroPerformance != globalAeroPerformance) {
			NotificationChain msgs = null;
			if (globalAeroPerformance != null)
				msgs = ((InternalEObject) globalAeroPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE, null,
						msgs);
			if (newGlobalAeroPerformance != null)
				msgs = ((InternalEObject) newGlobalAeroPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE, null,
						msgs);
			msgs = basicSetGlobalAeroPerformance(newGlobalAeroPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE, newGlobalAeroPerformance,
					newGlobalAeroPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuselagesAeroPerformanceType getFuselagesAeroPerformance() {
		return fuselagesAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselagesAeroPerformance(FuselagesAeroPerformanceType newFuselagesAeroPerformance,
			NotificationChain msgs) {
		FuselagesAeroPerformanceType oldFuselagesAeroPerformance = fuselagesAeroPerformance;
		fuselagesAeroPerformance = newFuselagesAeroPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE, oldFuselagesAeroPerformance,
					newFuselagesAeroPerformance);
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
	public void setFuselagesAeroPerformance(FuselagesAeroPerformanceType newFuselagesAeroPerformance) {
		if (newFuselagesAeroPerformance != fuselagesAeroPerformance) {
			NotificationChain msgs = null;
			if (fuselagesAeroPerformance != null)
				msgs = ((InternalEObject) fuselagesAeroPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE,
						null, msgs);
			if (newFuselagesAeroPerformance != null)
				msgs = ((InternalEObject) newFuselagesAeroPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE,
						null, msgs);
			msgs = basicSetFuselagesAeroPerformance(newFuselagesAeroPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE, newFuselagesAeroPerformance,
					newFuselagesAeroPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingsAeroPerformanceType getWingsAeroPerformance() {
		return wingsAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingsAeroPerformance(WingsAeroPerformanceType newWingsAeroPerformance,
			NotificationChain msgs) {
		WingsAeroPerformanceType oldWingsAeroPerformance = wingsAeroPerformance;
		wingsAeroPerformance = newWingsAeroPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE, oldWingsAeroPerformance,
					newWingsAeroPerformance);
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
	public void setWingsAeroPerformance(WingsAeroPerformanceType newWingsAeroPerformance) {
		if (newWingsAeroPerformance != wingsAeroPerformance) {
			NotificationChain msgs = null;
			if (wingsAeroPerformance != null)
				msgs = ((InternalEObject) wingsAeroPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE, null,
						msgs);
			if (newWingsAeroPerformance != null)
				msgs = ((InternalEObject) newWingsAeroPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE, null,
						msgs);
			msgs = basicSetWingsAeroPerformance(newWingsAeroPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE, newWingsAeroPerformance,
					newWingsAeroPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfacePerformanceMapsOldType getControlSurfacesAeroPerformance() {
		return controlSurfacesAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfacesAeroPerformance(
			ControlSurfacePerformanceMapsOldType newControlSurfacesAeroPerformance, NotificationChain msgs) {
		ControlSurfacePerformanceMapsOldType oldControlSurfacesAeroPerformance = controlSurfacesAeroPerformance;
		controlSurfacesAeroPerformance = newControlSurfacesAeroPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE,
					oldControlSurfacesAeroPerformance, newControlSurfacesAeroPerformance);
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
	public void setControlSurfacesAeroPerformance(
			ControlSurfacePerformanceMapsOldType newControlSurfacesAeroPerformance) {
		if (newControlSurfacesAeroPerformance != controlSurfacesAeroPerformance) {
			NotificationChain msgs = null;
			if (controlSurfacesAeroPerformance != null)
				msgs = ((InternalEObject) controlSurfacesAeroPerformance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE, null, msgs);
			if (newControlSurfacesAeroPerformance != null)
				msgs = ((InternalEObject) newControlSurfacesAeroPerformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE, null, msgs);
			msgs = basicSetControlSurfacesAeroPerformance(newControlSurfacesAeroPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE,
					newControlSurfacesAeroPerformance, newControlSurfacesAeroPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirfoilsAeroPerformanceType getAirfoilsAeroPerformance() {
		return airfoilsAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirfoilsAeroPerformance(AirfoilsAeroPerformanceType newAirfoilsAeroPerformance,
			NotificationChain msgs) {
		AirfoilsAeroPerformanceType oldAirfoilsAeroPerformance = airfoilsAeroPerformance;
		airfoilsAeroPerformance = newAirfoilsAeroPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE, oldAirfoilsAeroPerformance,
					newAirfoilsAeroPerformance);
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
	public void setAirfoilsAeroPerformance(AirfoilsAeroPerformanceType newAirfoilsAeroPerformance) {
		if (newAirfoilsAeroPerformance != airfoilsAeroPerformance) {
			NotificationChain msgs = null;
			if (airfoilsAeroPerformance != null)
				msgs = ((InternalEObject) airfoilsAeroPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE, null,
						msgs);
			if (newAirfoilsAeroPerformance != null)
				msgs = ((InternalEObject) newAirfoilsAeroPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE, null,
						msgs);
			msgs = basicSetAirfoilsAeroPerformance(newAirfoilsAeroPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE, newAirfoilsAeroPerformance,
					newAirfoilsAeroPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE:
			return basicSetGlobalAeroPerformance(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE:
			return basicSetFuselagesAeroPerformance(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE:
			return basicSetWingsAeroPerformance(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE:
			return basicSetControlSurfacesAeroPerformance(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE:
			return basicSetAirfoilsAeroPerformance(null, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE:
			return getGlobalAeroPerformance();
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE:
			return getFuselagesAeroPerformance();
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE:
			return getWingsAeroPerformance();
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE:
			return getControlSurfacesAeroPerformance();
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE:
			return getAirfoilsAeroPerformance();
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
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE:
			setGlobalAeroPerformance((GlobalAeroPerformanceType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE:
			setFuselagesAeroPerformance((FuselagesAeroPerformanceType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE:
			setWingsAeroPerformance((WingsAeroPerformanceType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE:
			setControlSurfacesAeroPerformance((ControlSurfacePerformanceMapsOldType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE:
			setAirfoilsAeroPerformance((AirfoilsAeroPerformanceType) newValue);
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
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE:
			setGlobalAeroPerformance((GlobalAeroPerformanceType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE:
			setFuselagesAeroPerformance((FuselagesAeroPerformanceType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE:
			setWingsAeroPerformance((WingsAeroPerformanceType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE:
			setControlSurfacesAeroPerformance((ControlSurfacePerformanceMapsOldType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE:
			setAirfoilsAeroPerformance((AirfoilsAeroPerformanceType) null);
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
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__GLOBAL_AERO_PERFORMANCE:
			return globalAeroPerformance != null;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__FUSELAGES_AERO_PERFORMANCE:
			return fuselagesAeroPerformance != null;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__WINGS_AERO_PERFORMANCE:
			return wingsAeroPerformance != null;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__CONTROL_SURFACES_AERO_PERFORMANCE:
			return controlSurfacesAeroPerformance != null;
		case CpacsPackage.AERO_PERFORMANCE_RC_TYPE__AIRFOILS_AERO_PERFORMANCE:
			return airfoilsAeroPerformance != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroPerformanceRCTypeImpl
