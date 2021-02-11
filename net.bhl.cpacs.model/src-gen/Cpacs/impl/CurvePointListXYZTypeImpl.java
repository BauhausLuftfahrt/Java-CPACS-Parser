/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurveParamPointMapType;
import Cpacs.CurvePointListXYZType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Point List XYZ Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CurvePointListXYZTypeImpl#getKinks <em>Kinks</em>}</li>
 *   <li>{@link Cpacs.impl.CurvePointListXYZTypeImpl#getParameterMap <em>Parameter Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurvePointListXYZTypeImpl extends PointListXYZVectorTypeImpl implements CurvePointListXYZType {
	/**
	 * The cached value of the '{@link #getKinks() <em>Kinks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinks()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType kinks;

	/**
	 * The cached value of the '{@link #getParameterMap() <em>Parameter Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterMap()
	 * @generated
	 * @ordered
	 */
	protected CurveParamPointMapType parameterMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurvePointListXYZTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCurvePointListXYZType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getKinks() {
		return kinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinks(StringVectorBaseType newKinks, NotificationChain msgs) {
		StringVectorBaseType oldKinks = kinks;
		kinks = newKinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS, oldKinks, newKinks);
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
	public void setKinks(StringVectorBaseType newKinks) {
		if (newKinks != kinks) {
			NotificationChain msgs = null;
			if (kinks != null)
				msgs = ((InternalEObject) kinks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS, null, msgs);
			if (newKinks != null)
				msgs = ((InternalEObject) newKinks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS, null, msgs);
			msgs = basicSetKinks(newKinks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS,
					newKinks, newKinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveParamPointMapType getParameterMap() {
		return parameterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterMap(CurveParamPointMapType newParameterMap, NotificationChain msgs) {
		CurveParamPointMapType oldParameterMap = parameterMap;
		parameterMap = newParameterMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP, oldParameterMap, newParameterMap);
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
	public void setParameterMap(CurveParamPointMapType newParameterMap) {
		if (newParameterMap != parameterMap) {
			NotificationChain msgs = null;
			if (parameterMap != null)
				msgs = ((InternalEObject) parameterMap).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP, null, msgs);
			if (newParameterMap != null)
				msgs = ((InternalEObject) newParameterMap).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP, null, msgs);
			msgs = basicSetParameterMap(newParameterMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP,
					newParameterMap, newParameterMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS:
			return basicSetKinks(null, msgs);
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP:
			return basicSetParameterMap(null, msgs);
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
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS:
			return getKinks();
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP:
			return getParameterMap();
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
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS:
			setKinks((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP:
			setParameterMap((CurveParamPointMapType) newValue);
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
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS:
			setKinks((StringVectorBaseType) null);
			return;
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP:
			setParameterMap((CurveParamPointMapType) null);
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
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__KINKS:
			return kinks != null;
		case CpacsPackage.CURVE_POINT_LIST_XYZ_TYPE__PARAMETER_MAP:
			return parameterMap != null;
		}
		return super.eIsSet(featureID);
	}

} //CurvePointListXYZTypeImpl
