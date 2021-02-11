/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MassInertiaVectorType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Inertia Vector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MassInertiaVectorTypeImpl#getJxx <em>Jxx</em>}</li>
 *   <li>{@link Cpacs.impl.MassInertiaVectorTypeImpl#getJyy <em>Jyy</em>}</li>
 *   <li>{@link Cpacs.impl.MassInertiaVectorTypeImpl#getJzz <em>Jzz</em>}</li>
 *   <li>{@link Cpacs.impl.MassInertiaVectorTypeImpl#getJxy <em>Jxy</em>}</li>
 *   <li>{@link Cpacs.impl.MassInertiaVectorTypeImpl#getJxz <em>Jxz</em>}</li>
 *   <li>{@link Cpacs.impl.MassInertiaVectorTypeImpl#getJyz <em>Jyz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MassInertiaVectorTypeImpl extends ComplexBaseTypeImpl implements MassInertiaVectorType {
	/**
	 * The cached value of the '{@link #getJxx() <em>Jxx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJxx()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType jxx;

	/**
	 * The cached value of the '{@link #getJyy() <em>Jyy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJyy()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType jyy;

	/**
	 * The cached value of the '{@link #getJzz() <em>Jzz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJzz()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType jzz;

	/**
	 * The cached value of the '{@link #getJxy() <em>Jxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJxy()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType jxy;

	/**
	 * The cached value of the '{@link #getJxz() <em>Jxz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJxz()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType jxz;

	/**
	 * The cached value of the '{@link #getJyz() <em>Jyz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJyz()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType jyz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MassInertiaVectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMassInertiaVectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getJxx() {
		return jxx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJxx(StringVectorBaseType newJxx, NotificationChain msgs) {
		StringVectorBaseType oldJxx = jxx;
		jxx = newJxx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX, oldJxx, newJxx);
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
	public void setJxx(StringVectorBaseType newJxx) {
		if (newJxx != jxx) {
			NotificationChain msgs = null;
			if (jxx != null)
				msgs = ((InternalEObject) jxx).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX, null, msgs);
			if (newJxx != null)
				msgs = ((InternalEObject) newJxx).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX, null, msgs);
			msgs = basicSetJxx(newJxx, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX, newJxx,
					newJxx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getJyy() {
		return jyy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJyy(StringVectorBaseType newJyy, NotificationChain msgs) {
		StringVectorBaseType oldJyy = jyy;
		jyy = newJyy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY, oldJyy, newJyy);
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
	public void setJyy(StringVectorBaseType newJyy) {
		if (newJyy != jyy) {
			NotificationChain msgs = null;
			if (jyy != null)
				msgs = ((InternalEObject) jyy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY, null, msgs);
			if (newJyy != null)
				msgs = ((InternalEObject) newJyy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY, null, msgs);
			msgs = basicSetJyy(newJyy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY, newJyy,
					newJyy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getJzz() {
		return jzz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJzz(StringVectorBaseType newJzz, NotificationChain msgs) {
		StringVectorBaseType oldJzz = jzz;
		jzz = newJzz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ, oldJzz, newJzz);
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
	public void setJzz(StringVectorBaseType newJzz) {
		if (newJzz != jzz) {
			NotificationChain msgs = null;
			if (jzz != null)
				msgs = ((InternalEObject) jzz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ, null, msgs);
			if (newJzz != null)
				msgs = ((InternalEObject) newJzz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ, null, msgs);
			msgs = basicSetJzz(newJzz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ, newJzz,
					newJzz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getJxy() {
		return jxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJxy(StringVectorBaseType newJxy, NotificationChain msgs) {
		StringVectorBaseType oldJxy = jxy;
		jxy = newJxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY, oldJxy, newJxy);
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
	public void setJxy(StringVectorBaseType newJxy) {
		if (newJxy != jxy) {
			NotificationChain msgs = null;
			if (jxy != null)
				msgs = ((InternalEObject) jxy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY, null, msgs);
			if (newJxy != null)
				msgs = ((InternalEObject) newJxy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY, null, msgs);
			msgs = basicSetJxy(newJxy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY, newJxy,
					newJxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getJxz() {
		return jxz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJxz(StringVectorBaseType newJxz, NotificationChain msgs) {
		StringVectorBaseType oldJxz = jxz;
		jxz = newJxz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ, oldJxz, newJxz);
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
	public void setJxz(StringVectorBaseType newJxz) {
		if (newJxz != jxz) {
			NotificationChain msgs = null;
			if (jxz != null)
				msgs = ((InternalEObject) jxz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ, null, msgs);
			if (newJxz != null)
				msgs = ((InternalEObject) newJxz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ, null, msgs);
			msgs = basicSetJxz(newJxz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ, newJxz,
					newJxz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getJyz() {
		return jyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJyz(StringVectorBaseType newJyz, NotificationChain msgs) {
		StringVectorBaseType oldJyz = jyz;
		jyz = newJyz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ, oldJyz, newJyz);
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
	public void setJyz(StringVectorBaseType newJyz) {
		if (newJyz != jyz) {
			NotificationChain msgs = null;
			if (jyz != null)
				msgs = ((InternalEObject) jyz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ, null, msgs);
			if (newJyz != null)
				msgs = ((InternalEObject) newJyz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ, null, msgs);
			msgs = basicSetJyz(newJyz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ, newJyz,
					newJyz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX:
			return basicSetJxx(null, msgs);
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY:
			return basicSetJyy(null, msgs);
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ:
			return basicSetJzz(null, msgs);
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY:
			return basicSetJxy(null, msgs);
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ:
			return basicSetJxz(null, msgs);
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ:
			return basicSetJyz(null, msgs);
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
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX:
			return getJxx();
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY:
			return getJyy();
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ:
			return getJzz();
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY:
			return getJxy();
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ:
			return getJxz();
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ:
			return getJyz();
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
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX:
			setJxx((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY:
			setJyy((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ:
			setJzz((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY:
			setJxy((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ:
			setJxz((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ:
			setJyz((StringVectorBaseType) newValue);
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
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX:
			setJxx((StringVectorBaseType) null);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY:
			setJyy((StringVectorBaseType) null);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ:
			setJzz((StringVectorBaseType) null);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY:
			setJxy((StringVectorBaseType) null);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ:
			setJxz((StringVectorBaseType) null);
			return;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ:
			setJyz((StringVectorBaseType) null);
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
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXX:
			return jxx != null;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYY:
			return jyy != null;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JZZ:
			return jzz != null;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXY:
			return jxy != null;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JXZ:
			return jxz != null;
		case CpacsPackage.MASS_INERTIA_VECTOR_TYPE__JYZ:
			return jyz != null;
		}
		return super.eIsSet(featureID);
	}

} //MassInertiaVectorTypeImpl
