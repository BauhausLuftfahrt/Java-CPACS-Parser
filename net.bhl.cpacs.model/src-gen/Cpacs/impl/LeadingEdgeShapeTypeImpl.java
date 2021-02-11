/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LeadingEdgeShapeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leading Edge Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LeadingEdgeShapeTypeImpl#getRelHeightLE <em>Rel Height LE</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeShapeTypeImpl#getXsiUpperSkin <em>Xsi Upper Skin</em>}</li>
 *   <li>{@link Cpacs.impl.LeadingEdgeShapeTypeImpl#getXsiLowerSkin <em>Xsi Lower Skin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeadingEdgeShapeTypeImpl extends ComplexBaseTypeImpl implements LeadingEdgeShapeType {
	/**
	 * The cached value of the '{@link #getRelHeightLE() <em>Rel Height LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelHeightLE()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType relHeightLE;

	/**
	 * The cached value of the '{@link #getXsiUpperSkin() <em>Xsi Upper Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiUpperSkin()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsiUpperSkin;

	/**
	 * The cached value of the '{@link #getXsiLowerSkin() <em>Xsi Lower Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXsiLowerSkin()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType xsiLowerSkin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeadingEdgeShapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLeadingEdgeShapeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRelHeightLE() {
		return relHeightLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelHeightLE(DoubleBaseType newRelHeightLE, NotificationChain msgs) {
		DoubleBaseType oldRelHeightLE = relHeightLE;
		relHeightLE = newRelHeightLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE, oldRelHeightLE, newRelHeightLE);
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
	public void setRelHeightLE(DoubleBaseType newRelHeightLE) {
		if (newRelHeightLE != relHeightLE) {
			NotificationChain msgs = null;
			if (relHeightLE != null)
				msgs = ((InternalEObject) relHeightLE).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE, null, msgs);
			if (newRelHeightLE != null)
				msgs = ((InternalEObject) newRelHeightLE).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE, null, msgs);
			msgs = basicSetRelHeightLE(newRelHeightLE, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE,
					newRelHeightLE, newRelHeightLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsiUpperSkin() {
		return xsiUpperSkin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiUpperSkin(DoubleBaseType newXsiUpperSkin, NotificationChain msgs) {
		DoubleBaseType oldXsiUpperSkin = xsiUpperSkin;
		xsiUpperSkin = newXsiUpperSkin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN, oldXsiUpperSkin, newXsiUpperSkin);
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
	public void setXsiUpperSkin(DoubleBaseType newXsiUpperSkin) {
		if (newXsiUpperSkin != xsiUpperSkin) {
			NotificationChain msgs = null;
			if (xsiUpperSkin != null)
				msgs = ((InternalEObject) xsiUpperSkin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN, null, msgs);
			if (newXsiUpperSkin != null)
				msgs = ((InternalEObject) newXsiUpperSkin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN, null, msgs);
			msgs = basicSetXsiUpperSkin(newXsiUpperSkin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN,
					newXsiUpperSkin, newXsiUpperSkin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getXsiLowerSkin() {
		return xsiLowerSkin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXsiLowerSkin(DoubleBaseType newXsiLowerSkin, NotificationChain msgs) {
		DoubleBaseType oldXsiLowerSkin = xsiLowerSkin;
		xsiLowerSkin = newXsiLowerSkin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN, oldXsiLowerSkin, newXsiLowerSkin);
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
	public void setXsiLowerSkin(DoubleBaseType newXsiLowerSkin) {
		if (newXsiLowerSkin != xsiLowerSkin) {
			NotificationChain msgs = null;
			if (xsiLowerSkin != null)
				msgs = ((InternalEObject) xsiLowerSkin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN, null, msgs);
			if (newXsiLowerSkin != null)
				msgs = ((InternalEObject) newXsiLowerSkin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN, null, msgs);
			msgs = basicSetXsiLowerSkin(newXsiLowerSkin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN,
					newXsiLowerSkin, newXsiLowerSkin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE:
			return basicSetRelHeightLE(null, msgs);
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN:
			return basicSetXsiUpperSkin(null, msgs);
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN:
			return basicSetXsiLowerSkin(null, msgs);
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
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE:
			return getRelHeightLE();
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN:
			return getXsiUpperSkin();
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN:
			return getXsiLowerSkin();
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
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE:
			setRelHeightLE((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN:
			setXsiUpperSkin((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN:
			setXsiLowerSkin((DoubleBaseType) newValue);
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
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE:
			setRelHeightLE((DoubleBaseType) null);
			return;
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN:
			setXsiUpperSkin((DoubleBaseType) null);
			return;
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN:
			setXsiLowerSkin((DoubleBaseType) null);
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
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__REL_HEIGHT_LE:
			return relHeightLE != null;
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_UPPER_SKIN:
			return xsiUpperSkin != null;
		case CpacsPackage.LEADING_EDGE_SHAPE_TYPE__XSI_LOWER_SKIN:
			return xsiLowerSkin != null;
		}
		return super.eIsSet(featureID);
	}

} //LeadingEdgeShapeTypeImpl
