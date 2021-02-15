/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadCaseTranslationAccelerationType;
import Cpacs.LoadCaseTranslationType;
import Cpacs.LoadCaseTranslationVelocityType;
import Cpacs.PointXYZType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Translation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationTypeImpl#getDisplacement <em>Displacement</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationTypeImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseTranslationTypeImpl#getAcceleration <em>Acceleration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseTranslationTypeImpl extends ComplexBaseTypeImpl implements LoadCaseTranslationType {
	/**
	 * The cached value of the '{@link #getDisplacement() <em>Displacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacement()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType displacement;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseTranslationVelocityType velocity;

	/**
	 * The cached value of the '{@link #getAcceleration() <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleration()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseTranslationAccelerationType acceleration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseTranslationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseTranslationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getDisplacement() {
		return displacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplacement(PointXYZType newDisplacement, NotificationChain msgs) {
		PointXYZType oldDisplacement = displacement;
		displacement = newDisplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT, oldDisplacement, newDisplacement);
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
	public void setDisplacement(PointXYZType newDisplacement) {
		if (newDisplacement != displacement) {
			NotificationChain msgs = null;
			if (displacement != null)
				msgs = ((InternalEObject) displacement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT, null, msgs);
			if (newDisplacement != null)
				msgs = ((InternalEObject) newDisplacement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT, null, msgs);
			msgs = basicSetDisplacement(newDisplacement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT,
					newDisplacement, newDisplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseTranslationVelocityType getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVelocity(LoadCaseTranslationVelocityType newVelocity, NotificationChain msgs) {
		LoadCaseTranslationVelocityType oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY, oldVelocity, newVelocity);
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
	public void setVelocity(LoadCaseTranslationVelocityType newVelocity) {
		if (newVelocity != velocity) {
			NotificationChain msgs = null;
			if (velocity != null)
				msgs = ((InternalEObject) velocity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY, null, msgs);
			if (newVelocity != null)
				msgs = ((InternalEObject) newVelocity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY, null, msgs);
			msgs = basicSetVelocity(newVelocity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY,
					newVelocity, newVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseTranslationAccelerationType getAcceleration() {
		return acceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceleration(LoadCaseTranslationAccelerationType newAcceleration,
			NotificationChain msgs) {
		LoadCaseTranslationAccelerationType oldAcceleration = acceleration;
		acceleration = newAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION, oldAcceleration, newAcceleration);
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
	public void setAcceleration(LoadCaseTranslationAccelerationType newAcceleration) {
		if (newAcceleration != acceleration) {
			NotificationChain msgs = null;
			if (acceleration != null)
				msgs = ((InternalEObject) acceleration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION, null, msgs);
			if (newAcceleration != null)
				msgs = ((InternalEObject) newAcceleration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION, null, msgs);
			msgs = basicSetAcceleration(newAcceleration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION,
					newAcceleration, newAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT:
			return basicSetDisplacement(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY:
			return basicSetVelocity(null, msgs);
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION:
			return basicSetAcceleration(null, msgs);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT:
			return getDisplacement();
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY:
			return getVelocity();
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION:
			return getAcceleration();
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT:
			setDisplacement((PointXYZType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY:
			setVelocity((LoadCaseTranslationVelocityType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION:
			setAcceleration((LoadCaseTranslationAccelerationType) newValue);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT:
			setDisplacement((PointXYZType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY:
			setVelocity((LoadCaseTranslationVelocityType) null);
			return;
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION:
			setAcceleration((LoadCaseTranslationAccelerationType) null);
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
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__DISPLACEMENT:
			return displacement != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__VELOCITY:
			return velocity != null;
		case CpacsPackage.LOAD_CASE_TRANSLATION_TYPE__ACCELERATION:
			return acceleration != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseTranslationTypeImpl
