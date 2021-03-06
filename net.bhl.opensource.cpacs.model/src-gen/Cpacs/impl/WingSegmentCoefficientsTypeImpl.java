/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.WingSegmentCoefficientsType;
import Cpacs.WingSegmentStripCoefficientsType;

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
 * An implementation of the model object '<em><b>Wing Segment Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingSegmentCoefficientsTypeImpl#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingSegmentCoefficientsTypeImpl#getStrip <em>Strip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingSegmentCoefficientsTypeImpl extends ComplexBaseTypeImpl implements WingSegmentCoefficientsType {
	/**
	 * The cached value of the '{@link #getSegmentUID() <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType segmentUID;

	/**
	 * The cached value of the '{@link #getStrip() <em>Strip</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrip()
	 * @generated
	 * @ordered
	 */
	protected EList<WingSegmentStripCoefficientsType> strip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingSegmentCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingSegmentCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSegmentUID() {
		return segmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUID(StringUIDBaseType newSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldSegmentUID = segmentUID;
		segmentUID = newSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID, oldSegmentUID, newSegmentUID);
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
	public void setSegmentUID(StringUIDBaseType newSegmentUID) {
		if (newSegmentUID != segmentUID) {
			NotificationChain msgs = null;
			if (segmentUID != null)
				msgs = ((InternalEObject) segmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID, null, msgs);
			if (newSegmentUID != null)
				msgs = ((InternalEObject) newSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID, null, msgs);
			msgs = basicSetSegmentUID(newSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID, newSegmentUID, newSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingSegmentStripCoefficientsType> getStrip() {
		if (strip == null) {
			strip = new EObjectContainmentEList<WingSegmentStripCoefficientsType>(
					WingSegmentStripCoefficientsType.class, this, CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__STRIP);
		}
		return strip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID:
			return basicSetSegmentUID(null, msgs);
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__STRIP:
			return ((InternalEList<?>) getStrip()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID:
			return getSegmentUID();
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__STRIP:
			return getStrip();
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
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__STRIP:
			getStrip().clear();
			getStrip().addAll((Collection<? extends WingSegmentStripCoefficientsType>) newValue);
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
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__STRIP:
			getStrip().clear();
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
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__SEGMENT_UID:
			return segmentUID != null;
		case CpacsPackage.WING_SEGMENT_COEFFICIENTS_TYPE__STRIP:
			return strip != null && !strip.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingSegmentCoefficientsTypeImpl
