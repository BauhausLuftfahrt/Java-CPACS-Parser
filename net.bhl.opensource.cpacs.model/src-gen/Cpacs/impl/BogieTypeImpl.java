/**
 */
package Cpacs.impl;

import Cpacs.BogieAxlesType;
import Cpacs.BogieType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bogie Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BogieTypeImpl#getAxles <em>Axles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BogieTypeImpl extends StrutTypeImpl implements BogieType {
	/**
	 * The cached value of the '{@link #getAxles() <em>Axles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxles()
	 * @generated
	 * @ordered
	 */
	protected BogieAxlesType axles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BogieTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBogieType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BogieAxlesType getAxles() {
		return axles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxles(BogieAxlesType newAxles, NotificationChain msgs) {
		BogieAxlesType oldAxles = axles;
		axles = newAxles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BOGIE_TYPE__AXLES, oldAxles, newAxles);
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
	public void setAxles(BogieAxlesType newAxles) {
		if (newAxles != axles) {
			NotificationChain msgs = null;
			if (axles != null)
				msgs = ((InternalEObject) axles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__AXLES, null, msgs);
			if (newAxles != null)
				msgs = ((InternalEObject) newAxles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOGIE_TYPE__AXLES, null, msgs);
			msgs = basicSetAxles(newAxles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOGIE_TYPE__AXLES, newAxles, newAxles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BOGIE_TYPE__AXLES:
			return basicSetAxles(null, msgs);
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
		case CpacsPackage.BOGIE_TYPE__AXLES:
			return getAxles();
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
		case CpacsPackage.BOGIE_TYPE__AXLES:
			setAxles((BogieAxlesType) newValue);
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
		case CpacsPackage.BOGIE_TYPE__AXLES:
			setAxles((BogieAxlesType) null);
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
		case CpacsPackage.BOGIE_TYPE__AXLES:
			return axles != null;
		}
		return super.eIsSet(featureID);
	}

} //BogieTypeImpl
