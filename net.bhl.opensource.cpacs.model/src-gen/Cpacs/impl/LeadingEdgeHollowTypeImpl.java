/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LeadingEdgeHollowType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leading Edge Hollow Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LeadingEdgeHollowTypeImpl#getRelHeightTE <em>Rel Height TE</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeHollowTypeImpl#getXsiTE <em>Xsi TE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeadingEdgeHollowTypeImpl extends ComplexBaseTypeImpl implements LeadingEdgeHollowType {
	/**
	 * The cached value of the '{@link #getRelHeightTE() <em>Rel Height TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHeightTE()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType relHeightTE;

	/**
	 * The cached value of the '{@link #getXsiTE() <em>Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiTE()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsiTE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeadingEdgeHollowTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLeadingEdgeHollowType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRelHeightTE() {
		return relHeightTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelHeightTE(DoubleBaseType newRelHeightTE, NotificationChain msgs) {
		DoubleBaseType oldRelHeightTE = relHeightTE;
		relHeightTE = newRelHeightTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE, oldRelHeightTE, newRelHeightTE);
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
	public void setRelHeightTE(DoubleBaseType newRelHeightTE) {
		if (newRelHeightTE != relHeightTE) {
			NotificationChain msgs = null;
			if (relHeightTE != null)
				msgs = ((InternalEObject) relHeightTE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE, null, msgs);
			if (newRelHeightTE != null)
				msgs = ((InternalEObject) newRelHeightTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE, null, msgs);
			msgs = basicSetRelHeightTE(newRelHeightTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE,
					newRelHeightTE, newRelHeightTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsiTE() {
		return xsiTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiTE(DoubleBaseType newXsiTE, NotificationChain msgs) {
		DoubleBaseType oldXsiTE = xsiTE;
		xsiTE = newXsiTE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE, oldXsiTE, newXsiTE);
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
	public void setXsiTE(DoubleBaseType newXsiTE) {
		if (newXsiTE != xsiTE) {
			NotificationChain msgs = null;
			if (xsiTE != null)
				msgs = ((InternalEObject) xsiTE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE, null, msgs);
			if (newXsiTE != null)
				msgs = ((InternalEObject) newXsiTE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE, null, msgs);
			msgs = basicSetXsiTE(newXsiTE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE,
					newXsiTE, newXsiTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE:
			return basicSetRelHeightTE(null, msgs);
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE:
			return basicSetXsiTE(null, msgs);
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
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE:
			return getRelHeightTE();
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE:
			return getXsiTE();
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
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE:
			setRelHeightTE((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE:
			setXsiTE((DoubleBaseType) newValue);
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
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE:
			setRelHeightTE((DoubleBaseType) null);
			return;
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE:
			setXsiTE((DoubleBaseType) null);
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
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__REL_HEIGHT_TE:
			return relHeightTE != null;
		case CpacsPackage.LEADING_EDGE_HOLLOW_TYPE__XSI_TE:
			return xsiTE != null;
		}
		return super.eIsSet(featureID);
	}

} //LeadingEdgeHollowTypeImpl
