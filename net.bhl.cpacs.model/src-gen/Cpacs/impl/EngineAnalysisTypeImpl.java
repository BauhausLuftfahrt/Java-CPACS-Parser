/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EngineAnalysisType;
import Cpacs.EnginePerformanceMapsType;
import Cpacs.GenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getThrust00 <em>Thrust00</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getFpr00 <em>Fpr00</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getBpr00 <em>Bpr00</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getOpr00 <em>Opr00</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getN1Max <em>N1 Max</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getN2Max <em>N2 Max</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getMTrD <em>MTr D</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.EngineAnalysisTypeImpl#getPerformanceMaps <em>Performance Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EngineAnalysisTypeImpl extends ComplexBaseTypeImpl implements EngineAnalysisType {
	/**
	 * The cached value of the '{@link #getThrust00() <em>Thrust00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrust00()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType thrust00;

	/**
	 * The cached value of the '{@link #getFpr00() <em>Fpr00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpr00()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fpr00;

	/**
	 * The cached value of the '{@link #getBpr00() <em>Bpr00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpr00()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType bpr00;

	/**
	 * The cached value of the '{@link #getOpr00() <em>Opr00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpr00()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType opr00;

	/**
	 * The cached value of the '{@link #getN1Max() <em>N1 Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN1Max()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType n1Max;

	/**
	 * The cached value of the '{@link #getN2Max() <em>N2 Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN2Max()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType n2Max;

	/**
	 * The cached value of the '{@link #getMTrD() <em>MTr D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTrD()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType mTrD;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType mass;

	/**
	 * The cached value of the '{@link #getPerformanceMaps() <em>Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMaps()
	 * @generated
	 * @ordered
	 */
	protected EnginePerformanceMapsType performanceMaps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEngineAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getThrust00() {
		return thrust00;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrust00(DoubleBaseType newThrust00, NotificationChain msgs) {
		DoubleBaseType oldThrust00 = thrust00;
		thrust00 = newThrust00;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00, oldThrust00, newThrust00);
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
	public void setThrust00(DoubleBaseType newThrust00) {
		if (newThrust00 != thrust00) {
			NotificationChain msgs = null;
			if (thrust00 != null)
				msgs = ((InternalEObject) thrust00).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00, null, msgs);
			if (newThrust00 != null)
				msgs = ((InternalEObject) newThrust00).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00, null, msgs);
			msgs = basicSetThrust00(newThrust00, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00,
					newThrust00, newThrust00));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFpr00() {
		return fpr00;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFpr00(DoubleBaseType newFpr00, NotificationChain msgs) {
		DoubleBaseType oldFpr00 = fpr00;
		fpr00 = newFpr00;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00, oldFpr00, newFpr00);
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
	public void setFpr00(DoubleBaseType newFpr00) {
		if (newFpr00 != fpr00) {
			NotificationChain msgs = null;
			if (fpr00 != null)
				msgs = ((InternalEObject) fpr00).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00, null, msgs);
			if (newFpr00 != null)
				msgs = ((InternalEObject) newFpr00).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00, null, msgs);
			msgs = basicSetFpr00(newFpr00, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00, newFpr00,
					newFpr00));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getBpr00() {
		return bpr00;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBpr00(DoubleBaseType newBpr00, NotificationChain msgs) {
		DoubleBaseType oldBpr00 = bpr00;
		bpr00 = newBpr00;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00, oldBpr00, newBpr00);
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
	public void setBpr00(DoubleBaseType newBpr00) {
		if (newBpr00 != bpr00) {
			NotificationChain msgs = null;
			if (bpr00 != null)
				msgs = ((InternalEObject) bpr00).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00, null, msgs);
			if (newBpr00 != null)
				msgs = ((InternalEObject) newBpr00).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00, null, msgs);
			msgs = basicSetBpr00(newBpr00, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00, newBpr00,
					newBpr00));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOpr00() {
		return opr00;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpr00(DoubleBaseType newOpr00, NotificationChain msgs) {
		DoubleBaseType oldOpr00 = opr00;
		opr00 = newOpr00;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00, oldOpr00, newOpr00);
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
	public void setOpr00(DoubleBaseType newOpr00) {
		if (newOpr00 != opr00) {
			NotificationChain msgs = null;
			if (opr00 != null)
				msgs = ((InternalEObject) opr00).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00, null, msgs);
			if (newOpr00 != null)
				msgs = ((InternalEObject) newOpr00).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00, null, msgs);
			msgs = basicSetOpr00(newOpr00, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00, newOpr00,
					newOpr00));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getN1Max() {
		return n1Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetN1Max(DoubleBaseType newN1Max, NotificationChain msgs) {
		DoubleBaseType oldN1Max = n1Max;
		n1Max = newN1Max;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX, oldN1Max, newN1Max);
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
	public void setN1Max(DoubleBaseType newN1Max) {
		if (newN1Max != n1Max) {
			NotificationChain msgs = null;
			if (n1Max != null)
				msgs = ((InternalEObject) n1Max).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX, null, msgs);
			if (newN1Max != null)
				msgs = ((InternalEObject) newN1Max).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX, null, msgs);
			msgs = basicSetN1Max(newN1Max, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX, newN1Max,
					newN1Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getN2Max() {
		return n2Max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetN2Max(DoubleBaseType newN2Max, NotificationChain msgs) {
		DoubleBaseType oldN2Max = n2Max;
		n2Max = newN2Max;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX, oldN2Max, newN2Max);
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
	public void setN2Max(DoubleBaseType newN2Max) {
		if (newN2Max != n2Max) {
			NotificationChain msgs = null;
			if (n2Max != null)
				msgs = ((InternalEObject) n2Max).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX, null, msgs);
			if (newN2Max != null)
				msgs = ((InternalEObject) newN2Max).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX, null, msgs);
			msgs = basicSetN2Max(newN2Max, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX, newN2Max,
					newN2Max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMTrD() {
		return mTrD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTrD(DoubleBaseType newMTrD, NotificationChain msgs) {
		DoubleBaseType oldMTrD = mTrD;
		mTrD = newMTrD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D, oldMTrD, newMTrD);
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
	public void setMTrD(DoubleBaseType newMTrD) {
		if (newMTrD != mTrD) {
			NotificationChain msgs = null;
			if (mTrD != null)
				msgs = ((InternalEObject) mTrD).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D, null, msgs);
			if (newMTrD != null)
				msgs = ((InternalEObject) newMTrD).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D, null, msgs);
			msgs = basicSetMTrD(newMTrD, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D, newMTrD,
					newMTrD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(GenericMassType newMass, NotificationChain msgs) {
		GenericMassType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS, oldMass, newMass);
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
	public void setMass(GenericMassType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS, newMass,
					newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnginePerformanceMapsType getPerformanceMaps() {
		return performanceMaps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceMaps(EnginePerformanceMapsType newPerformanceMaps,
			NotificationChain msgs) {
		EnginePerformanceMapsType oldPerformanceMaps = performanceMaps;
		performanceMaps = newPerformanceMaps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS, oldPerformanceMaps, newPerformanceMaps);
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
	public void setPerformanceMaps(EnginePerformanceMapsType newPerformanceMaps) {
		if (newPerformanceMaps != performanceMaps) {
			NotificationChain msgs = null;
			if (performanceMaps != null)
				msgs = ((InternalEObject) performanceMaps).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS, null, msgs);
			if (newPerformanceMaps != null)
				msgs = ((InternalEObject) newPerformanceMaps).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS, null, msgs);
			msgs = basicSetPerformanceMaps(newPerformanceMaps, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS,
					newPerformanceMaps, newPerformanceMaps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00:
			return basicSetThrust00(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00:
			return basicSetFpr00(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00:
			return basicSetBpr00(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00:
			return basicSetOpr00(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX:
			return basicSetN1Max(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX:
			return basicSetN2Max(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D:
			return basicSetMTrD(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS:
			return basicSetPerformanceMaps(null, msgs);
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
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00:
			return getThrust00();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00:
			return getFpr00();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00:
			return getBpr00();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00:
			return getOpr00();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX:
			return getN1Max();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX:
			return getN2Max();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D:
			return getMTrD();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS:
			return getMass();
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS:
			return getPerformanceMaps();
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
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00:
			setThrust00((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00:
			setFpr00((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00:
			setBpr00((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00:
			setOpr00((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX:
			setN1Max((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX:
			setN2Max((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D:
			setMTrD((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS:
			setMass((GenericMassType) newValue);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS:
			setPerformanceMaps((EnginePerformanceMapsType) newValue);
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
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00:
			setThrust00((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00:
			setFpr00((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00:
			setBpr00((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00:
			setOpr00((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX:
			setN1Max((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX:
			setN2Max((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D:
			setMTrD((DoubleBaseType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS:
			setMass((GenericMassType) null);
			return;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS:
			setPerformanceMaps((EnginePerformanceMapsType) null);
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
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__THRUST00:
			return thrust00 != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__FPR00:
			return fpr00 != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__BPR00:
			return bpr00 != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__OPR00:
			return opr00 != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N1_MAX:
			return n1Max != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__N2_MAX:
			return n2Max != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MTR_D:
			return mTrD != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__MASS:
			return mass != null;
		case CpacsPackage.ENGINE_ANALYSIS_TYPE__PERFORMANCE_MAPS:
			return performanceMaps != null;
		}
		return super.eIsSet(featureID);
	}

} //EngineAnalysisTypeImpl
