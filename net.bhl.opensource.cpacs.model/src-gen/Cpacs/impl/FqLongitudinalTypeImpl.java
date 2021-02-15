/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FqLongitudinalType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Longitudinal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqLongitudinalTypeImpl#getNumQFes <em>Num QFes</em>}</li>
 *   <li>{@link Cpacs.impl.FqLongitudinalTypeImpl#getNumThe <em>Num The</em>}</li>
 *   <li>{@link Cpacs.impl.FqLongitudinalTypeImpl#getNumTheFes <em>Num The Fes</em>}</li>
 *   <li>{@link Cpacs.impl.FqLongitudinalTypeImpl#getNumAlFes <em>Num Al Fes</em>}</li>
 *   <li>{@link Cpacs.impl.FqLongitudinalTypeImpl#getNumNzFes <em>Num Nz Fes</em>}</li>
 *   <li>{@link Cpacs.impl.FqLongitudinalTypeImpl#getDenLon <em>Den Lon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqLongitudinalTypeImpl extends ComplexBaseTypeImpl implements FqLongitudinalType {
	/**
	 * The cached value of the '{@link #getNumQFes() <em>Num QFes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumQFes()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numQFes;

	/**
	 * The cached value of the '{@link #getNumThe() <em>Num The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumThe()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numThe;

	/**
	 * The cached value of the '{@link #getNumTheFes() <em>Num The Fes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTheFes()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numTheFes;

	/**
	 * The cached value of the '{@link #getNumAlFes() <em>Num Al Fes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumAlFes()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numAlFes;

	/**
	 * The cached value of the '{@link #getNumNzFes() <em>Num Nz Fes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumNzFes()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType numNzFes;

	/**
	 * The cached value of the '{@link #getDenLon() <em>Den Lon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenLon()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType denLon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqLongitudinalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqLongitudinalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumQFes() {
		return numQFes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumQFes(StringVectorBaseType newNumQFes, NotificationChain msgs) {
		StringVectorBaseType oldNumQFes = numQFes;
		numQFes = newNumQFes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES, oldNumQFes, newNumQFes);
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
	public void setNumQFes(StringVectorBaseType newNumQFes) {
		if (newNumQFes != numQFes) {
			NotificationChain msgs = null;
			if (numQFes != null)
				msgs = ((InternalEObject) numQFes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES, null, msgs);
			if (newNumQFes != null)
				msgs = ((InternalEObject) newNumQFes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES, null, msgs);
			msgs = basicSetNumQFes(newNumQFes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES,
					newNumQFes, newNumQFes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumThe() {
		return numThe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumThe(StringVectorBaseType newNumThe, NotificationChain msgs) {
		StringVectorBaseType oldNumThe = numThe;
		numThe = newNumThe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE, oldNumThe, newNumThe);
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
	public void setNumThe(StringVectorBaseType newNumThe) {
		if (newNumThe != numThe) {
			NotificationChain msgs = null;
			if (numThe != null)
				msgs = ((InternalEObject) numThe).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE, null, msgs);
			if (newNumThe != null)
				msgs = ((InternalEObject) newNumThe).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE, null, msgs);
			msgs = basicSetNumThe(newNumThe, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE, newNumThe,
					newNumThe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumTheFes() {
		return numTheFes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumTheFes(StringVectorBaseType newNumTheFes, NotificationChain msgs) {
		StringVectorBaseType oldNumTheFes = numTheFes;
		numTheFes = newNumTheFes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES, oldNumTheFes, newNumTheFes);
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
	public void setNumTheFes(StringVectorBaseType newNumTheFes) {
		if (newNumTheFes != numTheFes) {
			NotificationChain msgs = null;
			if (numTheFes != null)
				msgs = ((InternalEObject) numTheFes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES, null, msgs);
			if (newNumTheFes != null)
				msgs = ((InternalEObject) newNumTheFes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES, null, msgs);
			msgs = basicSetNumTheFes(newNumTheFes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES,
					newNumTheFes, newNumTheFes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumAlFes() {
		return numAlFes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumAlFes(StringVectorBaseType newNumAlFes, NotificationChain msgs) {
		StringVectorBaseType oldNumAlFes = numAlFes;
		numAlFes = newNumAlFes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES, oldNumAlFes, newNumAlFes);
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
	public void setNumAlFes(StringVectorBaseType newNumAlFes) {
		if (newNumAlFes != numAlFes) {
			NotificationChain msgs = null;
			if (numAlFes != null)
				msgs = ((InternalEObject) numAlFes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES, null, msgs);
			if (newNumAlFes != null)
				msgs = ((InternalEObject) newNumAlFes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES, null, msgs);
			msgs = basicSetNumAlFes(newNumAlFes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES,
					newNumAlFes, newNumAlFes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getNumNzFes() {
		return numNzFes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumNzFes(StringVectorBaseType newNumNzFes, NotificationChain msgs) {
		StringVectorBaseType oldNumNzFes = numNzFes;
		numNzFes = newNumNzFes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES, oldNumNzFes, newNumNzFes);
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
	public void setNumNzFes(StringVectorBaseType newNumNzFes) {
		if (newNumNzFes != numNzFes) {
			NotificationChain msgs = null;
			if (numNzFes != null)
				msgs = ((InternalEObject) numNzFes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES, null, msgs);
			if (newNumNzFes != null)
				msgs = ((InternalEObject) newNumNzFes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES, null, msgs);
			msgs = basicSetNumNzFes(newNumNzFes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES,
					newNumNzFes, newNumNzFes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDenLon() {
		return denLon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenLon(StringVectorBaseType newDenLon, NotificationChain msgs) {
		StringVectorBaseType oldDenLon = denLon;
		denLon = newDenLon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON, oldDenLon, newDenLon);
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
	public void setDenLon(StringVectorBaseType newDenLon) {
		if (newDenLon != denLon) {
			NotificationChain msgs = null;
			if (denLon != null)
				msgs = ((InternalEObject) denLon).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON, null, msgs);
			if (newDenLon != null)
				msgs = ((InternalEObject) newDenLon).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON, null, msgs);
			msgs = basicSetDenLon(newDenLon, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON, newDenLon,
					newDenLon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES:
			return basicSetNumQFes(null, msgs);
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE:
			return basicSetNumThe(null, msgs);
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES:
			return basicSetNumTheFes(null, msgs);
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES:
			return basicSetNumAlFes(null, msgs);
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES:
			return basicSetNumNzFes(null, msgs);
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON:
			return basicSetDenLon(null, msgs);
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
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES:
			return getNumQFes();
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE:
			return getNumThe();
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES:
			return getNumTheFes();
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES:
			return getNumAlFes();
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES:
			return getNumNzFes();
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON:
			return getDenLon();
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
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES:
			setNumQFes((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE:
			setNumThe((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES:
			setNumTheFes((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES:
			setNumAlFes((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES:
			setNumNzFes((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON:
			setDenLon((StringVectorBaseType) newValue);
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
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES:
			setNumQFes((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE:
			setNumThe((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES:
			setNumTheFes((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES:
			setNumAlFes((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES:
			setNumNzFes((StringVectorBaseType) null);
			return;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON:
			setDenLon((StringVectorBaseType) null);
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
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_QFES:
			return numQFes != null;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE:
			return numThe != null;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_THE_FES:
			return numTheFes != null;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_AL_FES:
			return numAlFes != null;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__NUM_NZ_FES:
			return numNzFes != null;
		case CpacsPackage.FQ_LONGITUDINAL_TYPE__DEN_LON:
			return denLon != null;
		}
		return super.eIsSet(featureID);
	}

} //FqLongitudinalTypeImpl
