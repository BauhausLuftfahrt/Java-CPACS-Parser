/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.TakeoffPerformanceParametersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Takeoff Performance Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getTodVLiftoff <em>Tod VLiftoff</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getTodV2 <em>Tod V2</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getVElevOptimal <em>VElev Optimal</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getVRotationOptimal <em>VRotation Optimal</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getVLiftoff <em>VLiftoff</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getVMCG <em>VMCG</em>}</li>
 *   <li>{@link Cpacs.impl.TakeoffPerformanceParametersTypeImpl#getGammaCheck <em>Gamma Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TakeoffPerformanceParametersTypeImpl extends ComplexBaseTypeImpl
		implements TakeoffPerformanceParametersType {
	/**
	 * The cached value of the '{@link #getTodVLiftoff() <em>Tod VLiftoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodVLiftoff()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType todVLiftoff;

	/**
	 * The cached value of the '{@link #getTodV2() <em>Tod V2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTodV2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType todV2;

	/**
	 * The cached value of the '{@link #getVElevOptimal() <em>VElev Optimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVElevOptimal()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vElevOptimal;

	/**
	 * The cached value of the '{@link #getVRotationOptimal() <em>VRotation Optimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRotationOptimal()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vRotationOptimal;

	/**
	 * The cached value of the '{@link #getVLiftoff() <em>VLiftoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLiftoff()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vLiftoff;

	/**
	 * The cached value of the '{@link #getV2() <em>V2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType v2;

	/**
	 * The cached value of the '{@link #getV1() <em>V1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType v1;

	/**
	 * The cached value of the '{@link #getVMCG() <em>VMCG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVMCG()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType vMCG;

	/**
	 * The cached value of the '{@link #getGammaCheck() <em>Gamma Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGammaCheck()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gammaCheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TakeoffPerformanceParametersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTakeoffPerformanceParametersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTodVLiftoff() {
		return todVLiftoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTodVLiftoff(DoubleBaseType newTodVLiftoff, NotificationChain msgs) {
		DoubleBaseType oldTodVLiftoff = todVLiftoff;
		todVLiftoff = newTodVLiftoff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF, oldTodVLiftoff, newTodVLiftoff);
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
	public void setTodVLiftoff(DoubleBaseType newTodVLiftoff) {
		if (newTodVLiftoff != todVLiftoff) {
			NotificationChain msgs = null;
			if (todVLiftoff != null)
				msgs = ((InternalEObject) todVLiftoff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF, null,
						msgs);
			if (newTodVLiftoff != null)
				msgs = ((InternalEObject) newTodVLiftoff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF, null,
						msgs);
			msgs = basicSetTodVLiftoff(newTodVLiftoff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF, newTodVLiftoff, newTodVLiftoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTodV2() {
		return todV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTodV2(DoubleBaseType newTodV2, NotificationChain msgs) {
		DoubleBaseType oldTodV2 = todV2;
		todV2 = newTodV2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2, oldTodV2, newTodV2);
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
	public void setTodV2(DoubleBaseType newTodV2) {
		if (newTodV2 != todV2) {
			NotificationChain msgs = null;
			if (todV2 != null)
				msgs = ((InternalEObject) todV2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2, null, msgs);
			if (newTodV2 != null)
				msgs = ((InternalEObject) newTodV2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2, null, msgs);
			msgs = basicSetTodV2(newTodV2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2, newTodV2, newTodV2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVElevOptimal() {
		return vElevOptimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVElevOptimal(DoubleBaseType newVElevOptimal, NotificationChain msgs) {
		DoubleBaseType oldVElevOptimal = vElevOptimal;
		vElevOptimal = newVElevOptimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL, oldVElevOptimal, newVElevOptimal);
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
	public void setVElevOptimal(DoubleBaseType newVElevOptimal) {
		if (newVElevOptimal != vElevOptimal) {
			NotificationChain msgs = null;
			if (vElevOptimal != null)
				msgs = ((InternalEObject) vElevOptimal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL, null,
						msgs);
			if (newVElevOptimal != null)
				msgs = ((InternalEObject) newVElevOptimal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL, null,
						msgs);
			msgs = basicSetVElevOptimal(newVElevOptimal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL, newVElevOptimal, newVElevOptimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVRotationOptimal() {
		return vRotationOptimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVRotationOptimal(DoubleBaseType newVRotationOptimal, NotificationChain msgs) {
		DoubleBaseType oldVRotationOptimal = vRotationOptimal;
		vRotationOptimal = newVRotationOptimal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL, oldVRotationOptimal,
					newVRotationOptimal);
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
	public void setVRotationOptimal(DoubleBaseType newVRotationOptimal) {
		if (newVRotationOptimal != vRotationOptimal) {
			NotificationChain msgs = null;
			if (vRotationOptimal != null)
				msgs = ((InternalEObject) vRotationOptimal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL,
						null, msgs);
			if (newVRotationOptimal != null)
				msgs = ((InternalEObject) newVRotationOptimal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL,
						null, msgs);
			msgs = basicSetVRotationOptimal(newVRotationOptimal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL, newVRotationOptimal,
					newVRotationOptimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVLiftoff() {
		return vLiftoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVLiftoff(DoubleBaseType newVLiftoff, NotificationChain msgs) {
		DoubleBaseType oldVLiftoff = vLiftoff;
		vLiftoff = newVLiftoff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF, oldVLiftoff, newVLiftoff);
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
	public void setVLiftoff(DoubleBaseType newVLiftoff) {
		if (newVLiftoff != vLiftoff) {
			NotificationChain msgs = null;
			if (vLiftoff != null)
				msgs = ((InternalEObject) vLiftoff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF, null,
						msgs);
			if (newVLiftoff != null)
				msgs = ((InternalEObject) newVLiftoff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF, null,
						msgs);
			msgs = basicSetVLiftoff(newVLiftoff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF, newVLiftoff, newVLiftoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getV2() {
		return v2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV2(DoubleBaseType newV2, NotificationChain msgs) {
		DoubleBaseType oldV2 = v2;
		v2 = newV2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2, oldV2, newV2);
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
	public void setV2(DoubleBaseType newV2) {
		if (newV2 != v2) {
			NotificationChain msgs = null;
			if (v2 != null)
				msgs = ((InternalEObject) v2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2, null, msgs);
			if (newV2 != null)
				msgs = ((InternalEObject) newV2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2, null, msgs);
			msgs = basicSetV2(newV2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2,
					newV2, newV2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getV1() {
		return v1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV1(DoubleBaseType newV1, NotificationChain msgs) {
		DoubleBaseType oldV1 = v1;
		v1 = newV1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1, oldV1, newV1);
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
	public void setV1(DoubleBaseType newV1) {
		if (newV1 != v1) {
			NotificationChain msgs = null;
			if (v1 != null)
				msgs = ((InternalEObject) v1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1, null, msgs);
			if (newV1 != null)
				msgs = ((InternalEObject) newV1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1, null, msgs);
			msgs = basicSetV1(newV1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1,
					newV1, newV1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getVMCG() {
		return vMCG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVMCG(DoubleBaseType newVMCG, NotificationChain msgs) {
		DoubleBaseType oldVMCG = vMCG;
		vMCG = newVMCG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG, oldVMCG, newVMCG);
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
	public void setVMCG(DoubleBaseType newVMCG) {
		if (newVMCG != vMCG) {
			NotificationChain msgs = null;
			if (vMCG != null)
				msgs = ((InternalEObject) vMCG).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG, null, msgs);
			if (newVMCG != null)
				msgs = ((InternalEObject) newVMCG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG, null, msgs);
			msgs = basicSetVMCG(newVMCG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG, newVMCG, newVMCG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGammaCheck() {
		return gammaCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGammaCheck(DoubleBaseType newGammaCheck, NotificationChain msgs) {
		DoubleBaseType oldGammaCheck = gammaCheck;
		gammaCheck = newGammaCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK, oldGammaCheck, newGammaCheck);
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
	public void setGammaCheck(DoubleBaseType newGammaCheck) {
		if (newGammaCheck != gammaCheck) {
			NotificationChain msgs = null;
			if (gammaCheck != null)
				msgs = ((InternalEObject) gammaCheck).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK, null,
						msgs);
			if (newGammaCheck != null)
				msgs = ((InternalEObject) newGammaCheck).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK, null,
						msgs);
			msgs = basicSetGammaCheck(newGammaCheck, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK, newGammaCheck, newGammaCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF:
			return basicSetTodVLiftoff(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2:
			return basicSetTodV2(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL:
			return basicSetVElevOptimal(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL:
			return basicSetVRotationOptimal(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF:
			return basicSetVLiftoff(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2:
			return basicSetV2(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1:
			return basicSetV1(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG:
			return basicSetVMCG(null, msgs);
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK:
			return basicSetGammaCheck(null, msgs);
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
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF:
			return getTodVLiftoff();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2:
			return getTodV2();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL:
			return getVElevOptimal();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL:
			return getVRotationOptimal();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF:
			return getVLiftoff();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2:
			return getV2();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1:
			return getV1();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG:
			return getVMCG();
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK:
			return getGammaCheck();
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
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF:
			setTodVLiftoff((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2:
			setTodV2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL:
			setVElevOptimal((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL:
			setVRotationOptimal((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF:
			setVLiftoff((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2:
			setV2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1:
			setV1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG:
			setVMCG((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK:
			setGammaCheck((DoubleBaseType) newValue);
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
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF:
			setTodVLiftoff((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2:
			setTodV2((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL:
			setVElevOptimal((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL:
			setVRotationOptimal((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF:
			setVLiftoff((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2:
			setV2((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1:
			setV1((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG:
			setVMCG((DoubleBaseType) null);
			return;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK:
			setGammaCheck((DoubleBaseType) null);
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
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_VLIFTOFF:
			return todVLiftoff != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__TOD_V2:
			return todV2 != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VELEV_OPTIMAL:
			return vElevOptimal != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VROTATION_OPTIMAL:
			return vRotationOptimal != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VLIFTOFF:
			return vLiftoff != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V2:
			return v2 != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__V1:
			return v1 != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__VMCG:
			return vMCG != null;
		case CpacsPackage.TAKEOFF_PERFORMANCE_PARAMETERS_TYPE__GAMMA_CHECK:
			return gammaCheck != null;
		}
		return super.eIsSet(featureID);
	}

} //TakeoffPerformanceParametersTypeImpl
