/**
 */
package Cpacs.impl;

import Cpacs.AngleAccelerationType;
import Cpacs.AngleDisplacementType;
import Cpacs.CpacsPackage;
import Cpacs.LoadCaseRotationType;
import Cpacs.LoadCaseRotationVelocityType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Rotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseRotationTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseRotationTypeImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link Cpacs.impl.LoadCaseRotationTypeImpl#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseRotationTypeImpl extends ComplexBaseTypeImpl implements LoadCaseRotationType {
	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected AngleDisplacementType orientation;

	/**
	 * The cached value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected LoadCaseRotationVelocityType angularVelocity;

	/**
	 * The cached value of the '{@link #getAngularAcceleration() <em>Angular Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularAcceleration()
	 * @generated
	 * @ordered
	 */
	protected AngleAccelerationType angularAcceleration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseRotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseRotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleDisplacementType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(AngleDisplacementType newOrientation, NotificationChain msgs) {
		AngleDisplacementType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION, oldOrientation, newOrientation);
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
	public void setOrientation(AngleDisplacementType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject) orientation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject) newOrientation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION,
					newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadCaseRotationVelocityType getAngularVelocity() {
		return angularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngularVelocity(LoadCaseRotationVelocityType newAngularVelocity,
			NotificationChain msgs) {
		LoadCaseRotationVelocityType oldAngularVelocity = angularVelocity;
		angularVelocity = newAngularVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY, oldAngularVelocity, newAngularVelocity);
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
	public void setAngularVelocity(LoadCaseRotationVelocityType newAngularVelocity) {
		if (newAngularVelocity != angularVelocity) {
			NotificationChain msgs = null;
			if (angularVelocity != null)
				msgs = ((InternalEObject) angularVelocity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY, null, msgs);
			if (newAngularVelocity != null)
				msgs = ((InternalEObject) newAngularVelocity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY, null, msgs);
			msgs = basicSetAngularVelocity(newAngularVelocity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY, newAngularVelocity, newAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleAccelerationType getAngularAcceleration() {
		return angularAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngularAcceleration(AngleAccelerationType newAngularAcceleration,
			NotificationChain msgs) {
		AngleAccelerationType oldAngularAcceleration = angularAcceleration;
		angularAcceleration = newAngularAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION, oldAngularAcceleration,
					newAngularAcceleration);
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
	public void setAngularAcceleration(AngleAccelerationType newAngularAcceleration) {
		if (newAngularAcceleration != angularAcceleration) {
			NotificationChain msgs = null;
			if (angularAcceleration != null)
				msgs = ((InternalEObject) angularAcceleration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION, null,
						msgs);
			if (newAngularAcceleration != null)
				msgs = ((InternalEObject) newAngularAcceleration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION, null,
						msgs);
			msgs = basicSetAngularAcceleration(newAngularAcceleration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION, newAngularAcceleration,
					newAngularAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION:
			return basicSetOrientation(null, msgs);
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY:
			return basicSetAngularVelocity(null, msgs);
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION:
			return basicSetAngularAcceleration(null, msgs);
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
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION:
			return getOrientation();
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY:
			return getAngularVelocity();
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION:
			return getAngularAcceleration();
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
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION:
			setOrientation((AngleDisplacementType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY:
			setAngularVelocity((LoadCaseRotationVelocityType) newValue);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION:
			setAngularAcceleration((AngleAccelerationType) newValue);
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
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION:
			setOrientation((AngleDisplacementType) null);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY:
			setAngularVelocity((LoadCaseRotationVelocityType) null);
			return;
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION:
			setAngularAcceleration((AngleAccelerationType) null);
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
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ORIENTATION:
			return orientation != null;
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_VELOCITY:
			return angularVelocity != null;
		case CpacsPackage.LOAD_CASE_ROTATION_TYPE__ANGULAR_ACCELERATION:
			return angularAcceleration != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseRotationTypeImpl
