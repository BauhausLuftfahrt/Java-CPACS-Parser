/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SkinSegmentsType;
import Cpacs.SkinType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SkinTypeImpl#getStandardSheetElementUID <em>Standard Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.SkinTypeImpl#getSkinSegments <em>Skin Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkinTypeImpl extends ComplexBaseTypeImpl implements SkinType {
	/**
	 * The cached value of the '{@link #getStandardSheetElementUID() <em>Standard Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardSheetElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType standardSheetElementUID;

	/**
	 * The cached value of the '{@link #getSkinSegments() <em>Skin Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkinSegments()
	 * @generated
	 * @ordered
	 */
	protected SkinSegmentsType skinSegments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSkinType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStandardSheetElementUID() {
		return standardSheetElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardSheetElementUID(StringUIDBaseType newStandardSheetElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStandardSheetElementUID = standardSheetElementUID;
		standardSheetElementUID = newStandardSheetElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID, oldStandardSheetElementUID,
					newStandardSheetElementUID);
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
	public void setStandardSheetElementUID(StringUIDBaseType newStandardSheetElementUID) {
		if (newStandardSheetElementUID != standardSheetElementUID) {
			NotificationChain msgs = null;
			if (standardSheetElementUID != null)
				msgs = ((InternalEObject) standardSheetElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID, null, msgs);
			if (newStandardSheetElementUID != null)
				msgs = ((InternalEObject) newStandardSheetElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID, null, msgs);
			msgs = basicSetStandardSheetElementUID(newStandardSheetElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID,
					newStandardSheetElementUID, newStandardSheetElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkinSegmentsType getSkinSegments() {
		return skinSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkinSegments(SkinSegmentsType newSkinSegments, NotificationChain msgs) {
		SkinSegmentsType oldSkinSegments = skinSegments;
		skinSegments = newSkinSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS, oldSkinSegments, newSkinSegments);
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
	public void setSkinSegments(SkinSegmentsType newSkinSegments) {
		if (newSkinSegments != skinSegments) {
			NotificationChain msgs = null;
			if (skinSegments != null)
				msgs = ((InternalEObject) skinSegments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS, null, msgs);
			if (newSkinSegments != null)
				msgs = ((InternalEObject) newSkinSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS, null, msgs);
			msgs = basicSetSkinSegments(newSkinSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS,
					newSkinSegments, newSkinSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID:
			return basicSetStandardSheetElementUID(null, msgs);
		case CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS:
			return basicSetSkinSegments(null, msgs);
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
		case CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID:
			return getStandardSheetElementUID();
		case CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS:
			return getSkinSegments();
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
		case CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID:
			setStandardSheetElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS:
			setSkinSegments((SkinSegmentsType) newValue);
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
		case CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID:
			setStandardSheetElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS:
			setSkinSegments((SkinSegmentsType) null);
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
		case CpacsPackage.SKIN_TYPE__STANDARD_SHEET_ELEMENT_UID:
			return standardSheetElementUID != null;
		case CpacsPackage.SKIN_TYPE__SKIN_SEGMENTS:
			return skinSegments != null;
		}
		return super.eIsSet(featureID);
	}

} //SkinTypeImpl
