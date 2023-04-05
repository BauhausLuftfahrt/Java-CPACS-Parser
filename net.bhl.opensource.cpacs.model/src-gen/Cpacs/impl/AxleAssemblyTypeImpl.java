/**
 */
package Cpacs.impl;

import Cpacs.AxleAssemblyType;
import Cpacs.AxleType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axle Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AxleAssemblyTypeImpl#getAxle <em>Axle</em>}</li>
 *   <li>{@link Cpacs.impl.AxleAssemblyTypeImpl#getPosOnBogie <em>Pos On Bogie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxleAssemblyTypeImpl extends ComplexBaseTypeImpl implements AxleAssemblyType {
	/**
	 * The cached value of the '{@link #getAxle() <em>Axle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxle()
	 * @generated
	 * @ordered
	 */
	protected AxleType axle;

	/**
	 * The default value of the '{@link #getPosOnBogie() <em>Pos On Bogie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosOnBogie()
	 * @generated
	 * @ordered
	 */
	protected static final double POS_ON_BOGIE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosOnBogie() <em>Pos On Bogie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosOnBogie()
	 * @generated
	 * @ordered
	 */
	protected double posOnBogie = POS_ON_BOGIE_EDEFAULT;

	/**
	 * This is true if the Pos On Bogie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean posOnBogieESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxleAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAxleAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AxleType getAxle() {
		return axle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxle(AxleType newAxle, NotificationChain msgs) {
		AxleType oldAxle = axle;
		axle = newAxle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE, oldAxle, newAxle);
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
	public void setAxle(AxleType newAxle) {
		if (newAxle != axle) {
			NotificationChain msgs = null;
			if (axle != null)
				msgs = ((InternalEObject) axle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE, null, msgs);
			if (newAxle != null)
				msgs = ((InternalEObject) newAxle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE, null, msgs);
			msgs = basicSetAxle(newAxle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE, newAxle,
					newAxle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPosOnBogie() {
		return posOnBogie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosOnBogie(double newPosOnBogie) {
		double oldPosOnBogie = posOnBogie;
		posOnBogie = newPosOnBogie;
		boolean oldPosOnBogieESet = posOnBogieESet;
		posOnBogieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AXLE_ASSEMBLY_TYPE__POS_ON_BOGIE,
					oldPosOnBogie, posOnBogie, !oldPosOnBogieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPosOnBogie() {
		double oldPosOnBogie = posOnBogie;
		boolean oldPosOnBogieESet = posOnBogieESet;
		posOnBogie = POS_ON_BOGIE_EDEFAULT;
		posOnBogieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.AXLE_ASSEMBLY_TYPE__POS_ON_BOGIE,
					oldPosOnBogie, POS_ON_BOGIE_EDEFAULT, oldPosOnBogieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPosOnBogie() {
		return posOnBogieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE:
			return basicSetAxle(null, msgs);
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
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE:
			return getAxle();
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__POS_ON_BOGIE:
			return getPosOnBogie();
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
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE:
			setAxle((AxleType) newValue);
			return;
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__POS_ON_BOGIE:
			setPosOnBogie((Double) newValue);
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
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE:
			setAxle((AxleType) null);
			return;
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__POS_ON_BOGIE:
			unsetPosOnBogie();
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
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__AXLE:
			return axle != null;
		case CpacsPackage.AXLE_ASSEMBLY_TYPE__POS_ON_BOGIE:
			return isSetPosOnBogie();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (posOnBogie: ");
		if (posOnBogieESet)
			result.append(posOnBogie);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AxleAssemblyTypeImpl
