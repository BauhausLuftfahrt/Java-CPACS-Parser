/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MassInertiaVectorType;
import Cpacs.PointListXYZVectorType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;
import Cpacs.WeightAndBalancemPaxxType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weight And Balancem Paxx Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WeightAndBalancemPaxxTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalancemPaxxTypeImpl#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalancemPaxxTypeImpl#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.impl.WeightAndBalancemPaxxTypeImpl#getMPax <em>MPax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightAndBalancemPaxxTypeImpl extends ComplexBaseTypeImpl implements WeightAndBalancemPaxxType {
	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType mass;

	/**
	 * The cached value of the '{@link #getCoG() <em>Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoG()
	 * @generated
	 * @ordered
	 */
	protected PointListXYZVectorType coG;

	/**
	 * The cached value of the '{@link #getMassInertia() <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassInertia()
	 * @generated
	 * @ordered
	 */
	protected MassInertiaVectorType massInertia;

	/**
	 * The cached value of the '{@link #getMPax() <em>MPax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPax()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> mPax;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightAndBalancemPaxxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWeightAndBalancemPaxxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(StringVectorBaseType newMass, NotificationChain msgs) {
		StringVectorBaseType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS, oldMass, newMass);
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
	public void setMass(StringVectorBaseType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS,
					newMass, newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointListXYZVectorType getCoG() {
		return coG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoG(PointListXYZVectorType newCoG, NotificationChain msgs) {
		PointListXYZVectorType oldCoG = coG;
		coG = newCoG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G, oldCoG, newCoG);
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
	public void setCoG(PointListXYZVectorType newCoG) {
		if (newCoG != coG) {
			NotificationChain msgs = null;
			if (coG != null)
				msgs = ((InternalEObject) coG).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G, null, msgs);
			if (newCoG != null)
				msgs = ((InternalEObject) newCoG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G, null, msgs);
			msgs = basicSetCoG(newCoG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G,
					newCoG, newCoG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassInertiaVectorType getMassInertia() {
		return massInertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassInertia(MassInertiaVectorType newMassInertia, NotificationChain msgs) {
		MassInertiaVectorType oldMassInertia = massInertia;
		massInertia = newMassInertia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA, oldMassInertia, newMassInertia);
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
	public void setMassInertia(MassInertiaVectorType newMassInertia) {
		if (newMassInertia != massInertia) {
			NotificationChain msgs = null;
			if (massInertia != null)
				msgs = ((InternalEObject) massInertia).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA, null, msgs);
			if (newMassInertia != null)
				msgs = ((InternalEObject) newMassInertia).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA, null, msgs);
			msgs = basicSetMassInertia(newMassInertia, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA, newMassInertia, newMassInertia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getMPax() {
		if (mPax == null) {
			mPax = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MPAX);
		}
		return mPax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G:
			return basicSetCoG(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA:
			return basicSetMassInertia(null, msgs);
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MPAX:
			return ((InternalEList<?>) getMPax()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS:
			return getMass();
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G:
			return getCoG();
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA:
			return getMassInertia();
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MPAX:
			return getMPax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS:
			setMass((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G:
			setCoG((PointListXYZVectorType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaVectorType) newValue);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MPAX:
			getMPax().clear();
			getMPax().addAll((Collection<? extends StringUIDBaseType>) newValue);
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
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS:
			setMass((StringVectorBaseType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G:
			setCoG((PointListXYZVectorType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA:
			setMassInertia((MassInertiaVectorType) null);
			return;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MPAX:
			getMPax().clear();
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
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS:
			return mass != null;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__CO_G:
			return coG != null;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MASS_INERTIA:
			return massInertia != null;
		case CpacsPackage.WEIGHT_AND_BALANCEM_PAXX_TYPE__MPAX:
			return mPax != null && !mPax.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WeightAndBalancemPaxxTypeImpl
