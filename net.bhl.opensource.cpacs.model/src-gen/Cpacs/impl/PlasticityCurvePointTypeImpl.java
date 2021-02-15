/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PlasticityCurvePointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plasticity Curve Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PlasticityCurvePointTypeImpl#getTangentModulus <em>Tangent Modulus</em>}</li>
 *   <li>{@link Cpacs.impl.PlasticityCurvePointTypeImpl#getTrueStress <em>True Stress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlasticityCurvePointTypeImpl extends ComplexBaseTypeImpl implements PlasticityCurvePointType {
	/**
	 * The cached value of the '{@link #getTangentModulus() <em>Tangent Modulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTangentModulus()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType tangentModulus;

	/**
	 * The cached value of the '{@link #getTrueStress() <em>True Stress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueStress()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType trueStress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlasticityCurvePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPlasticityCurvePointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTangentModulus() {
		return tangentModulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTangentModulus(DoubleBaseType newTangentModulus, NotificationChain msgs) {
		DoubleBaseType oldTangentModulus = tangentModulus;
		tangentModulus = newTangentModulus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS, oldTangentModulus, newTangentModulus);
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
	public void setTangentModulus(DoubleBaseType newTangentModulus) {
		if (newTangentModulus != tangentModulus) {
			NotificationChain msgs = null;
			if (tangentModulus != null)
				msgs = ((InternalEObject) tangentModulus).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS, null, msgs);
			if (newTangentModulus != null)
				msgs = ((InternalEObject) newTangentModulus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS, null, msgs);
			msgs = basicSetTangentModulus(newTangentModulus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS, newTangentModulus, newTangentModulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTrueStress() {
		return trueStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueStress(DoubleBaseType newTrueStress, NotificationChain msgs) {
		DoubleBaseType oldTrueStress = trueStress;
		trueStress = newTrueStress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS, oldTrueStress, newTrueStress);
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
	public void setTrueStress(DoubleBaseType newTrueStress) {
		if (newTrueStress != trueStress) {
			NotificationChain msgs = null;
			if (trueStress != null)
				msgs = ((InternalEObject) trueStress).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS, null, msgs);
			if (newTrueStress != null)
				msgs = ((InternalEObject) newTrueStress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS, null, msgs);
			msgs = basicSetTrueStress(newTrueStress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS,
					newTrueStress, newTrueStress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS:
			return basicSetTangentModulus(null, msgs);
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS:
			return basicSetTrueStress(null, msgs);
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
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS:
			return getTangentModulus();
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS:
			return getTrueStress();
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
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS:
			setTangentModulus((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS:
			setTrueStress((DoubleBaseType) newValue);
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
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS:
			setTangentModulus((DoubleBaseType) null);
			return;
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS:
			setTrueStress((DoubleBaseType) null);
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
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TANGENT_MODULUS:
			return tangentModulus != null;
		case CpacsPackage.PLASTICITY_CURVE_POINT_TYPE__TRUE_STRESS:
			return trueStress != null;
		}
		return super.eIsSet(featureID);
	}

} //PlasticityCurvePointTypeImpl
