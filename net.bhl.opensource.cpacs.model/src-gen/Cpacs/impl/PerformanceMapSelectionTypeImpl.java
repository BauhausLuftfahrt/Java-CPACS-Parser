/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MissionPerformanceMapDefinitionType;
import Cpacs.PerformanceMapSelectionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Map Selection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PerformanceMapSelectionTypeImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceMapSelectionTypeImpl#getAerodynamic <em>Aerodynamic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceMapSelectionTypeImpl extends ComplexBaseTypeImpl implements PerformanceMapSelectionType {
	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected MissionPerformanceMapDefinitionType engine;

	/**
	 * The cached value of the '{@link #getAerodynamic() <em>Aerodynamic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAerodynamic()
	 * @generated
	 * @ordered
	 */
	protected MissionPerformanceMapDefinitionType aerodynamic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceMapSelectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPerformanceMapSelectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionPerformanceMapDefinitionType getEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngine(MissionPerformanceMapDefinitionType newEngine, NotificationChain msgs) {
		MissionPerformanceMapDefinitionType oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE, oldEngine, newEngine);
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
	public void setEngine(MissionPerformanceMapDefinitionType newEngine) {
		if (newEngine != engine) {
			NotificationChain msgs = null;
			if (engine != null)
				msgs = ((InternalEObject) engine).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE, null, msgs);
			if (newEngine != null)
				msgs = ((InternalEObject) newEngine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE, null, msgs);
			msgs = basicSetEngine(newEngine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE,
					newEngine, newEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionPerformanceMapDefinitionType getAerodynamic() {
		return aerodynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAerodynamic(MissionPerformanceMapDefinitionType newAerodynamic,
			NotificationChain msgs) {
		MissionPerformanceMapDefinitionType oldAerodynamic = aerodynamic;
		aerodynamic = newAerodynamic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC, oldAerodynamic, newAerodynamic);
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
	public void setAerodynamic(MissionPerformanceMapDefinitionType newAerodynamic) {
		if (newAerodynamic != aerodynamic) {
			NotificationChain msgs = null;
			if (aerodynamic != null)
				msgs = ((InternalEObject) aerodynamic).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC, null, msgs);
			if (newAerodynamic != null)
				msgs = ((InternalEObject) newAerodynamic).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC, null, msgs);
			msgs = basicSetAerodynamic(newAerodynamic, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC, newAerodynamic, newAerodynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE:
			return basicSetEngine(null, msgs);
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC:
			return basicSetAerodynamic(null, msgs);
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
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE:
			return getEngine();
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC:
			return getAerodynamic();
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
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE:
			setEngine((MissionPerformanceMapDefinitionType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC:
			setAerodynamic((MissionPerformanceMapDefinitionType) newValue);
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
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE:
			setEngine((MissionPerformanceMapDefinitionType) null);
			return;
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC:
			setAerodynamic((MissionPerformanceMapDefinitionType) null);
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
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__ENGINE:
			return engine != null;
		case CpacsPackage.PERFORMANCE_MAP_SELECTION_TYPE__AERODYNAMIC:
			return aerodynamic != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformanceMapSelectionTypeImpl
