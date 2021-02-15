/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GeneralStructuralMemberPositionType;
import Cpacs.GeneralStructuralMemberType;

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
 * An implementation of the model object '<em><b>General Structural Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberTypeImpl#getStandardMemberPosition <em>Standard Member Position</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberTypeImpl#getStructuralMemberPosition <em>Structural Member Position</em>}</li>
 *   <li>{@link Cpacs.impl.GeneralStructuralMemberTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralStructuralMemberTypeImpl extends ComplexBaseTypeImpl implements GeneralStructuralMemberType {
	/**
	 * The cached value of the '{@link #getStandardMemberPosition() <em>Standard Member Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardMemberPosition()
	 * @generated
	 * @ordered
	 */
	protected GeneralStructuralMemberPositionType standardMemberPosition;

	/**
	 * The cached value of the '{@link #getStructuralMemberPosition() <em>Structural Member Position</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMemberPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralStructuralMemberPositionType> structuralMemberPosition;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralStructuralMemberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGeneralStructuralMemberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralStructuralMemberPositionType getStandardMemberPosition() {
		return standardMemberPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardMemberPosition(
			GeneralStructuralMemberPositionType newStandardMemberPosition, NotificationChain msgs) {
		GeneralStructuralMemberPositionType oldStandardMemberPosition = standardMemberPosition;
		standardMemberPosition = newStandardMemberPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION, oldStandardMemberPosition,
					newStandardMemberPosition);
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
	public void setStandardMemberPosition(GeneralStructuralMemberPositionType newStandardMemberPosition) {
		if (newStandardMemberPosition != standardMemberPosition) {
			NotificationChain msgs = null;
			if (standardMemberPosition != null)
				msgs = ((InternalEObject) standardMemberPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION,
						null, msgs);
			if (newStandardMemberPosition != null)
				msgs = ((InternalEObject) newStandardMemberPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION,
						null, msgs);
			msgs = basicSetStandardMemberPosition(newStandardMemberPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION, newStandardMemberPosition,
					newStandardMemberPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeneralStructuralMemberPositionType> getStructuralMemberPosition() {
		if (structuralMemberPosition == null) {
			structuralMemberPosition = new EObjectContainmentEList<GeneralStructuralMemberPositionType>(
					GeneralStructuralMemberPositionType.class, this,
					CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STRUCTURAL_MEMBER_POSITION);
		}
		return structuralMemberPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION:
			return basicSetStandardMemberPosition(null, msgs);
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STRUCTURAL_MEMBER_POSITION:
			return ((InternalEList<?>) getStructuralMemberPosition()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION:
			return getStandardMemberPosition();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STRUCTURAL_MEMBER_POSITION:
			return getStructuralMemberPosition();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__UID:
			return getUID();
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION:
			setStandardMemberPosition((GeneralStructuralMemberPositionType) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STRUCTURAL_MEMBER_POSITION:
			getStructuralMemberPosition().clear();
			getStructuralMemberPosition().addAll((Collection<? extends GeneralStructuralMemberPositionType>) newValue);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION:
			setStandardMemberPosition((GeneralStructuralMemberPositionType) null);
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STRUCTURAL_MEMBER_POSITION:
			getStructuralMemberPosition().clear();
			return;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STANDARD_MEMBER_POSITION:
			return standardMemberPosition != null;
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__STRUCTURAL_MEMBER_POSITION:
			return structuralMemberPosition != null && !structuralMemberPosition.isEmpty();
		case CpacsPackage.GENERAL_STRUCTURAL_MEMBER_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //GeneralStructuralMemberTypeImpl
