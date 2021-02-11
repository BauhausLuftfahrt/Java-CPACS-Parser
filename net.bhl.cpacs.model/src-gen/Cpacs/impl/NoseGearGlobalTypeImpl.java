/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.NoseGearGlobalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nose Gear Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NoseGearGlobalTypeImpl#getTotalLength <em>Total Length</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearGlobalTypeImpl#getRetractAngle <em>Retract Angle</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearGlobalTypeImpl#getExtAngle <em>Ext Angle</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearGlobalTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearGlobalTypeImpl#getExtractedAngle <em>Extracted Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoseGearGlobalTypeImpl extends ComplexBaseTypeImpl implements NoseGearGlobalType {
	/**
	 * The cached value of the '{@link #getTotalLength() <em>Total Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType totalLength;

	/**
	 * The cached value of the '{@link #getRetractAngle() <em>Retract Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetractAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType retractAngle;

	/**
	 * The cached value of the '{@link #getExtAngle() <em>Ext Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType extAngle;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType offset;

	/**
	 * The cached value of the '{@link #getExtractedAngle() <em>Extracted Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractedAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType extractedAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoseGearGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNoseGearGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTotalLength() {
		return totalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalLength(DoubleBaseType newTotalLength, NotificationChain msgs) {
		DoubleBaseType oldTotalLength = totalLength;
		totalLength = newTotalLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, oldTotalLength, newTotalLength);
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
	public void setTotalLength(DoubleBaseType newTotalLength) {
		if (newTotalLength != totalLength) {
			NotificationChain msgs = null;
			if (totalLength != null)
				msgs = ((InternalEObject) totalLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, null, msgs);
			if (newTotalLength != null)
				msgs = ((InternalEObject) newTotalLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, null, msgs);
			msgs = basicSetTotalLength(newTotalLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH,
					newTotalLength, newTotalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getRetractAngle() {
		return retractAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetractAngle(DoubleBaseType newRetractAngle, NotificationChain msgs) {
		DoubleBaseType oldRetractAngle = retractAngle;
		retractAngle = newRetractAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE, oldRetractAngle, newRetractAngle);
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
	public void setRetractAngle(DoubleBaseType newRetractAngle) {
		if (newRetractAngle != retractAngle) {
			NotificationChain msgs = null;
			if (retractAngle != null)
				msgs = ((InternalEObject) retractAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE, null, msgs);
			if (newRetractAngle != null)
				msgs = ((InternalEObject) newRetractAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE, null, msgs);
			msgs = basicSetRetractAngle(newRetractAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE,
					newRetractAngle, newRetractAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getExtAngle() {
		return extAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtAngle(DoubleBaseType newExtAngle, NotificationChain msgs) {
		DoubleBaseType oldExtAngle = extAngle;
		extAngle = newExtAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE, oldExtAngle, newExtAngle);
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
	public void setExtAngle(DoubleBaseType newExtAngle) {
		if (newExtAngle != extAngle) {
			NotificationChain msgs = null;
			if (extAngle != null)
				msgs = ((InternalEObject) extAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE, null, msgs);
			if (newExtAngle != null)
				msgs = ((InternalEObject) newExtAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE, null, msgs);
			msgs = basicSetExtAngle(newExtAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE,
					newExtAngle, newExtAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(DoubleBaseType newOffset, NotificationChain msgs) {
		DoubleBaseType oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET, oldOffset, newOffset);
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
	public void setOffset(DoubleBaseType newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject) offset).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject) newOffset).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET, newOffset,
					newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getExtractedAngle() {
		return extractedAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractedAngle(DoubleBaseType newExtractedAngle, NotificationChain msgs) {
		DoubleBaseType oldExtractedAngle = extractedAngle;
		extractedAngle = newExtractedAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE, oldExtractedAngle, newExtractedAngle);
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
	public void setExtractedAngle(DoubleBaseType newExtractedAngle) {
		if (newExtractedAngle != extractedAngle) {
			NotificationChain msgs = null;
			if (extractedAngle != null)
				msgs = ((InternalEObject) extractedAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE, null, msgs);
			if (newExtractedAngle != null)
				msgs = ((InternalEObject) newExtractedAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE, null, msgs);
			msgs = basicSetExtractedAngle(newExtractedAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE,
					newExtractedAngle, newExtractedAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return basicSetTotalLength(null, msgs);
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			return basicSetRetractAngle(null, msgs);
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE:
			return basicSetExtAngle(null, msgs);
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET:
			return basicSetOffset(null, msgs);
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE:
			return basicSetExtractedAngle(null, msgs);
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
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return getTotalLength();
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			return getRetractAngle();
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE:
			return getExtAngle();
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET:
			return getOffset();
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE:
			return getExtractedAngle();
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
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			setRetractAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE:
			setExtAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET:
			setOffset((DoubleBaseType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE:
			setExtractedAngle((DoubleBaseType) newValue);
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
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) null);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			setRetractAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE:
			setExtAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET:
			setOffset((DoubleBaseType) null);
			return;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE:
			setExtractedAngle((DoubleBaseType) null);
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
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return totalLength != null;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__RETRACT_ANGLE:
			return retractAngle != null;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXT_ANGLE:
			return extAngle != null;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__OFFSET:
			return offset != null;
		case CpacsPackage.NOSE_GEAR_GLOBAL_TYPE__EXTRACTED_ANGLE:
			return extractedAngle != null;
		}
		return super.eIsSet(featureID);
	}

} //NoseGearGlobalTypeImpl
