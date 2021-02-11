/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.NoiseAnalysisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noise Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NoiseAnalysisTypeImpl#getNoiseLevelApproach <em>Noise Level Approach</em>}</li>
 *   <li>{@link Cpacs.impl.NoiseAnalysisTypeImpl#getNoiseLevelSideline <em>Noise Level Sideline</em>}</li>
 *   <li>{@link Cpacs.impl.NoiseAnalysisTypeImpl#getNoiseLevelTakeOff <em>Noise Level Take Off</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoiseAnalysisTypeImpl extends ComplexBaseTypeImpl implements NoiseAnalysisType {
	/**
	 * The cached value of the '{@link #getNoiseLevelApproach() <em>Noise Level Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseLevelApproach()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType noiseLevelApproach;

	/**
	 * The cached value of the '{@link #getNoiseLevelSideline() <em>Noise Level Sideline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseLevelSideline()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType noiseLevelSideline;

	/**
	 * The cached value of the '{@link #getNoiseLevelTakeOff() <em>Noise Level Take Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseLevelTakeOff()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType noiseLevelTakeOff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoiseAnalysisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNoiseAnalysisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNoiseLevelApproach() {
		return noiseLevelApproach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoiseLevelApproach(DoubleBaseType newNoiseLevelApproach, NotificationChain msgs) {
		DoubleBaseType oldNoiseLevelApproach = noiseLevelApproach;
		noiseLevelApproach = newNoiseLevelApproach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH, oldNoiseLevelApproach,
					newNoiseLevelApproach);
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
	public void setNoiseLevelApproach(DoubleBaseType newNoiseLevelApproach) {
		if (newNoiseLevelApproach != noiseLevelApproach) {
			NotificationChain msgs = null;
			if (noiseLevelApproach != null)
				msgs = ((InternalEObject) noiseLevelApproach).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH, null, msgs);
			if (newNoiseLevelApproach != null)
				msgs = ((InternalEObject) newNoiseLevelApproach).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH, null, msgs);
			msgs = basicSetNoiseLevelApproach(newNoiseLevelApproach, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH, newNoiseLevelApproach,
					newNoiseLevelApproach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNoiseLevelSideline() {
		return noiseLevelSideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoiseLevelSideline(DoubleBaseType newNoiseLevelSideline, NotificationChain msgs) {
		DoubleBaseType oldNoiseLevelSideline = noiseLevelSideline;
		noiseLevelSideline = newNoiseLevelSideline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE, oldNoiseLevelSideline,
					newNoiseLevelSideline);
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
	public void setNoiseLevelSideline(DoubleBaseType newNoiseLevelSideline) {
		if (newNoiseLevelSideline != noiseLevelSideline) {
			NotificationChain msgs = null;
			if (noiseLevelSideline != null)
				msgs = ((InternalEObject) noiseLevelSideline).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE, null, msgs);
			if (newNoiseLevelSideline != null)
				msgs = ((InternalEObject) newNoiseLevelSideline).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE, null, msgs);
			msgs = basicSetNoiseLevelSideline(newNoiseLevelSideline, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE, newNoiseLevelSideline,
					newNoiseLevelSideline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNoiseLevelTakeOff() {
		return noiseLevelTakeOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoiseLevelTakeOff(DoubleBaseType newNoiseLevelTakeOff, NotificationChain msgs) {
		DoubleBaseType oldNoiseLevelTakeOff = noiseLevelTakeOff;
		noiseLevelTakeOff = newNoiseLevelTakeOff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF, oldNoiseLevelTakeOff, newNoiseLevelTakeOff);
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
	public void setNoiseLevelTakeOff(DoubleBaseType newNoiseLevelTakeOff) {
		if (newNoiseLevelTakeOff != noiseLevelTakeOff) {
			NotificationChain msgs = null;
			if (noiseLevelTakeOff != null)
				msgs = ((InternalEObject) noiseLevelTakeOff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF, null, msgs);
			if (newNoiseLevelTakeOff != null)
				msgs = ((InternalEObject) newNoiseLevelTakeOff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF, null, msgs);
			msgs = basicSetNoiseLevelTakeOff(newNoiseLevelTakeOff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF, newNoiseLevelTakeOff,
					newNoiseLevelTakeOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH:
			return basicSetNoiseLevelApproach(null, msgs);
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE:
			return basicSetNoiseLevelSideline(null, msgs);
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF:
			return basicSetNoiseLevelTakeOff(null, msgs);
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
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH:
			return getNoiseLevelApproach();
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE:
			return getNoiseLevelSideline();
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF:
			return getNoiseLevelTakeOff();
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
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH:
			setNoiseLevelApproach((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE:
			setNoiseLevelSideline((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF:
			setNoiseLevelTakeOff((DoubleBaseType) newValue);
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
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH:
			setNoiseLevelApproach((DoubleBaseType) null);
			return;
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE:
			setNoiseLevelSideline((DoubleBaseType) null);
			return;
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF:
			setNoiseLevelTakeOff((DoubleBaseType) null);
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
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_APPROACH:
			return noiseLevelApproach != null;
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_SIDELINE:
			return noiseLevelSideline != null;
		case CpacsPackage.NOISE_ANALYSIS_TYPE__NOISE_LEVEL_TAKE_OFF:
			return noiseLevelTakeOff != null;
		}
		return super.eIsSet(featureID);
	}

} //NoiseAnalysisTypeImpl
