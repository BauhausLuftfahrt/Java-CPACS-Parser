/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StiffnessType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stiffness Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StiffnessTypeImpl#getEA <em>EA</em>}</li>
 *   <li>{@link Cpacs.impl.StiffnessTypeImpl#getEIyy <em>EIyy</em>}</li>
 *   <li>{@link Cpacs.impl.StiffnessTypeImpl#getEIzz <em>EIzz</em>}</li>
 *   <li>{@link Cpacs.impl.StiffnessTypeImpl#getGIt <em>GIt</em>}</li>
 *   <li>{@link Cpacs.impl.StiffnessTypeImpl#getG <em>G</em>}</li>
 *   <li>{@link Cpacs.impl.StiffnessTypeImpl#getIt <em>It</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StiffnessTypeImpl extends ComplexBaseTypeImpl implements StiffnessType {
	/**
	 * The cached value of the '{@link #getEA() <em>EA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEA()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eA;

	/**
	 * The cached value of the '{@link #getEIyy() <em>EIyy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIyy()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eIyy;

	/**
	 * The cached value of the '{@link #getEIzz() <em>EIzz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIzz()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eIzz;

	/**
	 * The cached value of the '{@link #getGIt() <em>GIt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGIt()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gIt;

	/**
	 * The cached value of the '{@link #getG() <em>G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getG()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType g;

	/**
	 * The cached value of the '{@link #getIt() <em>It</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIt()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType it;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StiffnessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStiffnessType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEA() {
		return eA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEA(DoubleBaseType newEA, NotificationChain msgs) {
		DoubleBaseType oldEA = eA;
		eA = newEA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STIFFNESS_TYPE__EA, oldEA, newEA);
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
	public void setEA(DoubleBaseType newEA) {
		if (newEA != eA) {
			NotificationChain msgs = null;
			if (eA != null)
				msgs = ((InternalEObject) eA).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__EA, null, msgs);
			if (newEA != null)
				msgs = ((InternalEObject) newEA).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__EA, null, msgs);
			msgs = basicSetEA(newEA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STIFFNESS_TYPE__EA, newEA, newEA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEIyy() {
		return eIyy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIyy(DoubleBaseType newEIyy, NotificationChain msgs) {
		DoubleBaseType oldEIyy = eIyy;
		eIyy = newEIyy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STIFFNESS_TYPE__EIYY, oldEIyy, newEIyy);
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
	public void setEIyy(DoubleBaseType newEIyy) {
		if (newEIyy != eIyy) {
			NotificationChain msgs = null;
			if (eIyy != null)
				msgs = ((InternalEObject) eIyy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__EIYY, null, msgs);
			if (newEIyy != null)
				msgs = ((InternalEObject) newEIyy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__EIYY, null, msgs);
			msgs = basicSetEIyy(newEIyy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STIFFNESS_TYPE__EIYY, newEIyy, newEIyy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEIzz() {
		return eIzz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIzz(DoubleBaseType newEIzz, NotificationChain msgs) {
		DoubleBaseType oldEIzz = eIzz;
		eIzz = newEIzz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STIFFNESS_TYPE__EIZZ, oldEIzz, newEIzz);
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
	public void setEIzz(DoubleBaseType newEIzz) {
		if (newEIzz != eIzz) {
			NotificationChain msgs = null;
			if (eIzz != null)
				msgs = ((InternalEObject) eIzz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__EIZZ, null, msgs);
			if (newEIzz != null)
				msgs = ((InternalEObject) newEIzz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__EIZZ, null, msgs);
			msgs = basicSetEIzz(newEIzz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STIFFNESS_TYPE__EIZZ, newEIzz, newEIzz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGIt() {
		return gIt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGIt(DoubleBaseType newGIt, NotificationChain msgs) {
		DoubleBaseType oldGIt = gIt;
		gIt = newGIt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STIFFNESS_TYPE__GIT, oldGIt, newGIt);
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
	public void setGIt(DoubleBaseType newGIt) {
		if (newGIt != gIt) {
			NotificationChain msgs = null;
			if (gIt != null)
				msgs = ((InternalEObject) gIt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__GIT, null, msgs);
			if (newGIt != null)
				msgs = ((InternalEObject) newGIt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__GIT, null, msgs);
			msgs = basicSetGIt(newGIt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STIFFNESS_TYPE__GIT, newGIt, newGIt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getG() {
		return g;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetG(DoubleBaseType newG, NotificationChain msgs) {
		DoubleBaseType oldG = g;
		g = newG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STIFFNESS_TYPE__G, oldG, newG);
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
	public void setG(DoubleBaseType newG) {
		if (newG != g) {
			NotificationChain msgs = null;
			if (g != null)
				msgs = ((InternalEObject) g).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__G, null, msgs);
			if (newG != null)
				msgs = ((InternalEObject) newG).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__G, null, msgs);
			msgs = basicSetG(newG, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STIFFNESS_TYPE__G, newG, newG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getIt() {
		return it;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIt(DoubleBaseType newIt, NotificationChain msgs) {
		DoubleBaseType oldIt = it;
		it = newIt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STIFFNESS_TYPE__IT, oldIt, newIt);
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
	public void setIt(DoubleBaseType newIt) {
		if (newIt != it) {
			NotificationChain msgs = null;
			if (it != null)
				msgs = ((InternalEObject) it).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__IT, null, msgs);
			if (newIt != null)
				msgs = ((InternalEObject) newIt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STIFFNESS_TYPE__IT, null, msgs);
			msgs = basicSetIt(newIt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STIFFNESS_TYPE__IT, newIt, newIt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STIFFNESS_TYPE__EA:
			return basicSetEA(null, msgs);
		case CpacsPackage.STIFFNESS_TYPE__EIYY:
			return basicSetEIyy(null, msgs);
		case CpacsPackage.STIFFNESS_TYPE__EIZZ:
			return basicSetEIzz(null, msgs);
		case CpacsPackage.STIFFNESS_TYPE__GIT:
			return basicSetGIt(null, msgs);
		case CpacsPackage.STIFFNESS_TYPE__G:
			return basicSetG(null, msgs);
		case CpacsPackage.STIFFNESS_TYPE__IT:
			return basicSetIt(null, msgs);
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
		case CpacsPackage.STIFFNESS_TYPE__EA:
			return getEA();
		case CpacsPackage.STIFFNESS_TYPE__EIYY:
			return getEIyy();
		case CpacsPackage.STIFFNESS_TYPE__EIZZ:
			return getEIzz();
		case CpacsPackage.STIFFNESS_TYPE__GIT:
			return getGIt();
		case CpacsPackage.STIFFNESS_TYPE__G:
			return getG();
		case CpacsPackage.STIFFNESS_TYPE__IT:
			return getIt();
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
		case CpacsPackage.STIFFNESS_TYPE__EA:
			setEA((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STIFFNESS_TYPE__EIYY:
			setEIyy((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STIFFNESS_TYPE__EIZZ:
			setEIzz((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STIFFNESS_TYPE__GIT:
			setGIt((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STIFFNESS_TYPE__G:
			setG((DoubleBaseType) newValue);
			return;
		case CpacsPackage.STIFFNESS_TYPE__IT:
			setIt((DoubleBaseType) newValue);
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
		case CpacsPackage.STIFFNESS_TYPE__EA:
			setEA((DoubleBaseType) null);
			return;
		case CpacsPackage.STIFFNESS_TYPE__EIYY:
			setEIyy((DoubleBaseType) null);
			return;
		case CpacsPackage.STIFFNESS_TYPE__EIZZ:
			setEIzz((DoubleBaseType) null);
			return;
		case CpacsPackage.STIFFNESS_TYPE__GIT:
			setGIt((DoubleBaseType) null);
			return;
		case CpacsPackage.STIFFNESS_TYPE__G:
			setG((DoubleBaseType) null);
			return;
		case CpacsPackage.STIFFNESS_TYPE__IT:
			setIt((DoubleBaseType) null);
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
		case CpacsPackage.STIFFNESS_TYPE__EA:
			return eA != null;
		case CpacsPackage.STIFFNESS_TYPE__EIYY:
			return eIyy != null;
		case CpacsPackage.STIFFNESS_TYPE__EIZZ:
			return eIzz != null;
		case CpacsPackage.STIFFNESS_TYPE__GIT:
			return gIt != null;
		case CpacsPackage.STIFFNESS_TYPE__G:
			return g != null;
		case CpacsPackage.STIFFNESS_TYPE__IT:
			return it != null;
		}
		return super.eIsSet(featureID);
	}

} //StiffnessTypeImpl
