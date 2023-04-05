/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadCaseAccelerationsType;
import Cpacs.LoadCaseLoadFactorsType;
import Cpacs.PointXYZType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Accelerations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseAccelerationsTypeImpl#getLoadFactors <em>Load Factors</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseAccelerationsTypeImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseAccelerationsTypeImpl extends ComplexBaseTypeImpl implements LoadCaseAccelerationsType {
	/**
	 * The cached value of the '{@link #getLoadFactors() <em>Load Factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactors()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseLoadFactorsType loadFactors;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType rotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseAccelerationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseAccelerationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseLoadFactorsType getLoadFactors() {
		return loadFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadFactors(LoadCaseLoadFactorsType newLoadFactors, NotificationChain msgs) {
		LoadCaseLoadFactorsType oldLoadFactors = loadFactors;
		loadFactors = newLoadFactors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS, oldLoadFactors, newLoadFactors);
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
	public void setLoadFactors(LoadCaseLoadFactorsType newLoadFactors) {
		if (newLoadFactors != loadFactors) {
			NotificationChain msgs = null;
			if (loadFactors != null)
				msgs = ((InternalEObject) loadFactors).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS, null, msgs);
			if (newLoadFactors != null)
				msgs = ((InternalEObject) newLoadFactors).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS, null, msgs);
			msgs = basicSetLoadFactors(newLoadFactors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS, newLoadFactors, newLoadFactors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(PointXYZType newRotation, NotificationChain msgs) {
		PointXYZType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION, oldRotation, newRotation);
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
	public void setRotation(PointXYZType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION,
					newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS:
			return basicSetLoadFactors(null, msgs);
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION:
			return basicSetRotation(null, msgs);
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
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS:
			return getLoadFactors();
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION:
			return getRotation();
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
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS:
			setLoadFactors((LoadCaseLoadFactorsType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION:
			setRotation((PointXYZType) newValue);
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
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS:
			setLoadFactors((LoadCaseLoadFactorsType) null);
			return;
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION:
			setRotation((PointXYZType) null);
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
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__LOAD_FACTORS:
			return loadFactors != null;
		case CpacsPackage.LOAD_CASE_ACCELERATIONS_TYPE__ROTATION:
			return rotation != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseAccelerationsTypeImpl
