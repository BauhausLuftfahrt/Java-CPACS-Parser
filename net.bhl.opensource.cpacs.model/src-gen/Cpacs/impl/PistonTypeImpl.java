/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PistonType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piston Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PistonTypeImpl#getMaxSpringDeflection <em>Max Spring Deflection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PistonTypeImpl extends StrutTypeImpl implements PistonType {
	/**
	 * The cached value of the '{@link #getMaxSpringDeflection() <em>Max Spring Deflection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpringDeflection()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType maxSpringDeflection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PistonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPistonType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMaxSpringDeflection() {
		return maxSpringDeflection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSpringDeflection(DoubleBaseType newMaxSpringDeflection,
			NotificationChain msgs) {
		DoubleBaseType oldMaxSpringDeflection = maxSpringDeflection;
		maxSpringDeflection = newMaxSpringDeflection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION, oldMaxSpringDeflection, newMaxSpringDeflection);
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
	public void setMaxSpringDeflection(DoubleBaseType newMaxSpringDeflection) {
		if (newMaxSpringDeflection != maxSpringDeflection) {
			NotificationChain msgs = null;
			if (maxSpringDeflection != null)
				msgs = ((InternalEObject) maxSpringDeflection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION, null, msgs);
			if (newMaxSpringDeflection != null)
				msgs = ((InternalEObject) newMaxSpringDeflection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION, null, msgs);
			msgs = basicSetMaxSpringDeflection(newMaxSpringDeflection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION,
					newMaxSpringDeflection, newMaxSpringDeflection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			return basicSetMaxSpringDeflection(null, msgs);
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
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			return getMaxSpringDeflection();
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
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			setMaxSpringDeflection((DoubleBaseType) newValue);
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
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			setMaxSpringDeflection((DoubleBaseType) null);
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
		case CpacsPackage.PISTON_TYPE__MAX_SPRING_DEFLECTION:
			return maxSpringDeflection != null;
		}
		return super.eIsSet(featureID);
	}

} //PistonTypeImpl
