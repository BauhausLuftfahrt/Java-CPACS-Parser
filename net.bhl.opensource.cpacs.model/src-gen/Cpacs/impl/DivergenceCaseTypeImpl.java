/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DivergenceCaseType;
import Cpacs.DoubleBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Divergence Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DivergenceCaseTypeImpl#getMa <em>Ma</em>}</li>
 *   <li>{@link Cpacs.impl.DivergenceCaseTypeImpl#getQDiv <em>QDiv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivergenceCaseTypeImpl extends ComplexBaseTypeImpl implements DivergenceCaseType {
	/**
	 * The cached value of the '{@link #getMa() <em>Ma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMa()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType ma;

	/**
	 * The cached value of the '{@link #getQDiv() <em>QDiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDiv()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType qDiv;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivergenceCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDivergenceCaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMa() {
		return ma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMa(DoubleBaseType newMa, NotificationChain msgs) {
		DoubleBaseType oldMa = ma;
		ma = newMa;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIVERGENCE_CASE_TYPE__MA, oldMa, newMa);
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
	public void setMa(DoubleBaseType newMa) {
		if (newMa != ma) {
			NotificationChain msgs = null;
			if (ma != null)
				msgs = ((InternalEObject) ma).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIVERGENCE_CASE_TYPE__MA, null, msgs);
			if (newMa != null)
				msgs = ((InternalEObject) newMa).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIVERGENCE_CASE_TYPE__MA, null, msgs);
			msgs = basicSetMa(newMa, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIVERGENCE_CASE_TYPE__MA, newMa, newMa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getQDiv() {
		return qDiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQDiv(DoubleBaseType newQDiv, NotificationChain msgs) {
		DoubleBaseType oldQDiv = qDiv;
		qDiv = newQDiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV, oldQDiv, newQDiv);
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
	public void setQDiv(DoubleBaseType newQDiv) {
		if (newQDiv != qDiv) {
			NotificationChain msgs = null;
			if (qDiv != null)
				msgs = ((InternalEObject) qDiv).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV, null, msgs);
			if (newQDiv != null)
				msgs = ((InternalEObject) newQDiv).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV, null, msgs);
			msgs = basicSetQDiv(newQDiv, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV, newQDiv,
					newQDiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DIVERGENCE_CASE_TYPE__MA:
			return basicSetMa(null, msgs);
		case CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV:
			return basicSetQDiv(null, msgs);
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
		case CpacsPackage.DIVERGENCE_CASE_TYPE__MA:
			return getMa();
		case CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV:
			return getQDiv();
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
		case CpacsPackage.DIVERGENCE_CASE_TYPE__MA:
			setMa((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV:
			setQDiv((DoubleBaseType) newValue);
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
		case CpacsPackage.DIVERGENCE_CASE_TYPE__MA:
			setMa((DoubleBaseType) null);
			return;
		case CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV:
			setQDiv((DoubleBaseType) null);
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
		case CpacsPackage.DIVERGENCE_CASE_TYPE__MA:
			return ma != null;
		case CpacsPackage.DIVERGENCE_CASE_TYPE__QDIV:
			return qDiv != null;
		}
		return super.eIsSet(featureID);
	}

} //DivergenceCaseTypeImpl
