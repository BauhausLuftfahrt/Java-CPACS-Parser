/**
 */
package Cpacs.impl;

import Cpacs.AngleDisplacementType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angle Displacement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AngleDisplacementTypeImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link Cpacs.impl.AngleDisplacementTypeImpl#getTheta <em>Theta</em>}</li>
 *   <li>{@link Cpacs.impl.AngleDisplacementTypeImpl#getPsi <em>Psi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngleDisplacementTypeImpl extends ComplexBaseTypeImpl implements AngleDisplacementType {
	/**
	 * The cached value of the '{@link #getPhi() <em>Phi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phi;

	/**
	 * The cached value of the '{@link #getTheta() <em>Theta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType theta;

	/**
	 * The cached value of the '{@link #getPsi() <em>Psi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsi()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType psi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleDisplacementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAngleDisplacementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhi() {
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhi(DoubleBaseType newPhi, NotificationChain msgs) {
		DoubleBaseType oldPhi = phi;
		phi = newPhi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI, oldPhi, newPhi);
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
	public void setPhi(DoubleBaseType newPhi) {
		if (newPhi != phi) {
			NotificationChain msgs = null;
			if (phi != null)
				msgs = ((InternalEObject) phi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI, null, msgs);
			if (newPhi != null)
				msgs = ((InternalEObject) newPhi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI, null, msgs);
			msgs = basicSetPhi(newPhi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI, newPhi,
					newPhi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTheta() {
		return theta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheta(DoubleBaseType newTheta, NotificationChain msgs) {
		DoubleBaseType oldTheta = theta;
		theta = newTheta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA, oldTheta, newTheta);
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
	public void setTheta(DoubleBaseType newTheta) {
		if (newTheta != theta) {
			NotificationChain msgs = null;
			if (theta != null)
				msgs = ((InternalEObject) theta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA, null, msgs);
			if (newTheta != null)
				msgs = ((InternalEObject) newTheta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA, null, msgs);
			msgs = basicSetTheta(newTheta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA, newTheta,
					newTheta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPsi() {
		return psi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPsi(DoubleBaseType newPsi, NotificationChain msgs) {
		DoubleBaseType oldPsi = psi;
		psi = newPsi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI, oldPsi, newPsi);
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
	public void setPsi(DoubleBaseType newPsi) {
		if (newPsi != psi) {
			NotificationChain msgs = null;
			if (psi != null)
				msgs = ((InternalEObject) psi).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI, null, msgs);
			if (newPsi != null)
				msgs = ((InternalEObject) newPsi).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI, null, msgs);
			msgs = basicSetPsi(newPsi, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI, newPsi,
					newPsi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI:
			return basicSetPhi(null, msgs);
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA:
			return basicSetTheta(null, msgs);
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI:
			return basicSetPsi(null, msgs);
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
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI:
			return getPhi();
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA:
			return getTheta();
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI:
			return getPsi();
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
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI:
			setPhi((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA:
			setTheta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI:
			setPsi((DoubleBaseType) newValue);
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
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI:
			setPhi((DoubleBaseType) null);
			return;
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA:
			setTheta((DoubleBaseType) null);
			return;
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI:
			setPsi((DoubleBaseType) null);
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
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PHI:
			return phi != null;
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__THETA:
			return theta != null;
		case CpacsPackage.ANGLE_DISPLACEMENT_TYPE__PSI:
			return psi != null;
		}
		return super.eIsSet(featureID);
	}

} //AngleDisplacementTypeImpl
