/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FqPhugoidType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fq Phugoid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FqPhugoidTypeImpl#getPhDamping <em>Ph Damping</em>}</li>
 *   <li>{@link Cpacs.impl.FqPhugoidTypeImpl#getPhDoublingTime <em>Ph Doubling Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FqPhugoidTypeImpl extends ComplexBaseTypeImpl implements FqPhugoidType {
	/**
	 * The cached value of the '{@link #getPhDamping() <em>Ph Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhDamping()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phDamping;

	/**
	 * The cached value of the '{@link #getPhDoublingTime() <em>Ph Doubling Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhDoublingTime()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType phDoublingTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FqPhugoidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFqPhugoidType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhDamping() {
		return phDamping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhDamping(DoubleBaseType newPhDamping, NotificationChain msgs) {
		DoubleBaseType oldPhDamping = phDamping;
		phDamping = newPhDamping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING, oldPhDamping, newPhDamping);
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
	public void setPhDamping(DoubleBaseType newPhDamping) {
		if (newPhDamping != phDamping) {
			NotificationChain msgs = null;
			if (phDamping != null)
				msgs = ((InternalEObject) phDamping).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING, null, msgs);
			if (newPhDamping != null)
				msgs = ((InternalEObject) newPhDamping).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING, null, msgs);
			msgs = basicSetPhDamping(newPhDamping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING,
					newPhDamping, newPhDamping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPhDoublingTime() {
		return phDoublingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhDoublingTime(DoubleBaseType newPhDoublingTime, NotificationChain msgs) {
		DoubleBaseType oldPhDoublingTime = phDoublingTime;
		phDoublingTime = newPhDoublingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME, oldPhDoublingTime, newPhDoublingTime);
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
	public void setPhDoublingTime(DoubleBaseType newPhDoublingTime) {
		if (newPhDoublingTime != phDoublingTime) {
			NotificationChain msgs = null;
			if (phDoublingTime != null)
				msgs = ((InternalEObject) phDoublingTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME, null, msgs);
			if (newPhDoublingTime != null)
				msgs = ((InternalEObject) newPhDoublingTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME, null, msgs);
			msgs = basicSetPhDoublingTime(newPhDoublingTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME,
					newPhDoublingTime, newPhDoublingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING:
			return basicSetPhDamping(null, msgs);
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME:
			return basicSetPhDoublingTime(null, msgs);
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
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING:
			return getPhDamping();
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME:
			return getPhDoublingTime();
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
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING:
			setPhDamping((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME:
			setPhDoublingTime((DoubleBaseType) newValue);
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
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING:
			setPhDamping((DoubleBaseType) null);
			return;
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME:
			setPhDoublingTime((DoubleBaseType) null);
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
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DAMPING:
			return phDamping != null;
		case CpacsPackage.FQ_PHUGOID_TYPE__PH_DOUBLING_TIME:
			return phDoublingTime != null;
		}
		return super.eIsSet(featureID);
	}

} //FqPhugoidTypeImpl
