/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MassFractionType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Fraction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MassFractionTypeImpl#getFromSegmentUID <em>From Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.MassFractionTypeImpl#getToSegmentUID <em>To Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.MassFractionTypeImpl#getFraction <em>Fraction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MassFractionTypeImpl extends ComplexBaseTypeImpl implements MassFractionType {
	/**
	 * The cached value of the '{@link #getFromSegmentUID() <em>From Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fromSegmentUID;

	/**
	 * The cached value of the '{@link #getToSegmentUID() <em>To Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType toSegmentUID;

	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fraction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MassFractionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMassFractionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFromSegmentUID() {
		return fromSegmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromSegmentUID(StringUIDBaseType newFromSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldFromSegmentUID = fromSegmentUID;
		fromSegmentUID = newFromSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID, oldFromSegmentUID, newFromSegmentUID);
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
	public void setFromSegmentUID(StringUIDBaseType newFromSegmentUID) {
		if (newFromSegmentUID != fromSegmentUID) {
			NotificationChain msgs = null;
			if (fromSegmentUID != null)
				msgs = ((InternalEObject) fromSegmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID, null, msgs);
			if (newFromSegmentUID != null)
				msgs = ((InternalEObject) newFromSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID, null, msgs);
			msgs = basicSetFromSegmentUID(newFromSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID,
					newFromSegmentUID, newFromSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getToSegmentUID() {
		return toSegmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToSegmentUID(StringUIDBaseType newToSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldToSegmentUID = toSegmentUID;
		toSegmentUID = newToSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID, oldToSegmentUID, newToSegmentUID);
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
	public void setToSegmentUID(StringUIDBaseType newToSegmentUID) {
		if (newToSegmentUID != toSegmentUID) {
			NotificationChain msgs = null;
			if (toSegmentUID != null)
				msgs = ((InternalEObject) toSegmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID, null, msgs);
			if (newToSegmentUID != null)
				msgs = ((InternalEObject) newToSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID, null, msgs);
			msgs = basicSetToSegmentUID(newToSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID,
					newToSegmentUID, newToSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFraction(DoubleBaseType newFraction, NotificationChain msgs) {
		DoubleBaseType oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MASS_FRACTION_TYPE__FRACTION, oldFraction, newFraction);
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
	public void setFraction(DoubleBaseType newFraction) {
		if (newFraction != fraction) {
			NotificationChain msgs = null;
			if (fraction != null)
				msgs = ((InternalEObject) fraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_FRACTION_TYPE__FRACTION, null, msgs);
			if (newFraction != null)
				msgs = ((InternalEObject) newFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MASS_FRACTION_TYPE__FRACTION, null, msgs);
			msgs = basicSetFraction(newFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MASS_FRACTION_TYPE__FRACTION,
					newFraction, newFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID:
			return basicSetFromSegmentUID(null, msgs);
		case CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID:
			return basicSetToSegmentUID(null, msgs);
		case CpacsPackage.MASS_FRACTION_TYPE__FRACTION:
			return basicSetFraction(null, msgs);
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
		case CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID:
			return getFromSegmentUID();
		case CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID:
			return getToSegmentUID();
		case CpacsPackage.MASS_FRACTION_TYPE__FRACTION:
			return getFraction();
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
		case CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID:
			setFromSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID:
			setToSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MASS_FRACTION_TYPE__FRACTION:
			setFraction((DoubleBaseType) newValue);
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
		case CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID:
			setFromSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID:
			setToSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MASS_FRACTION_TYPE__FRACTION:
			setFraction((DoubleBaseType) null);
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
		case CpacsPackage.MASS_FRACTION_TYPE__FROM_SEGMENT_UID:
			return fromSegmentUID != null;
		case CpacsPackage.MASS_FRACTION_TYPE__TO_SEGMENT_UID:
			return toSegmentUID != null;
		case CpacsPackage.MASS_FRACTION_TYPE__FRACTION:
			return fraction != null;
		}
		return super.eIsSet(featureID);
	}

} //MassFractionTypeImpl
