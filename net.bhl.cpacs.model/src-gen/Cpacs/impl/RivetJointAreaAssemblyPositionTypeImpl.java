/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RivetJointAreaAssemblyPositionType;
import Cpacs.StringUIDBaseType;

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
 * An implementation of the model object '<em><b>Rivet Joint Area Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RivetJointAreaAssemblyPositionTypeImpl#getRivetJointAreaUID <em>Rivet Joint Area UID</em>}</li>
 *   <li>{@link Cpacs.impl.RivetJointAreaAssemblyPositionTypeImpl#getStructuralMemberUID <em>Structural Member UID</em>}</li>
 *   <li>{@link Cpacs.impl.RivetJointAreaAssemblyPositionTypeImpl#getMaxRivetLength <em>Max Rivet Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RivetJointAreaAssemblyPositionTypeImpl extends ComplexBaseTypeImpl
		implements RivetJointAreaAssemblyPositionType {
	/**
	 * The cached value of the '{@link #getRivetJointAreaUID() <em>Rivet Joint Area UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRivetJointAreaUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType rivetJointAreaUID;

	/**
	 * The cached value of the '{@link #getStructuralMemberUID() <em>Structural Member UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMemberUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> structuralMemberUID;

	/**
	 * The cached value of the '{@link #getMaxRivetLength() <em>Max Rivet Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRivetLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType maxRivetLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RivetJointAreaAssemblyPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRivetJointAreaAssemblyPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRivetJointAreaUID() {
		return rivetJointAreaUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRivetJointAreaUID(StringUIDBaseType newRivetJointAreaUID, NotificationChain msgs) {
		StringUIDBaseType oldRivetJointAreaUID = rivetJointAreaUID;
		rivetJointAreaUID = newRivetJointAreaUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID, oldRivetJointAreaUID,
					newRivetJointAreaUID);
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
	public void setRivetJointAreaUID(StringUIDBaseType newRivetJointAreaUID) {
		if (newRivetJointAreaUID != rivetJointAreaUID) {
			NotificationChain msgs = null;
			if (rivetJointAreaUID != null)
				msgs = ((InternalEObject) rivetJointAreaUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID,
						null, msgs);
			if (newRivetJointAreaUID != null)
				msgs = ((InternalEObject) newRivetJointAreaUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID,
						null, msgs);
			msgs = basicSetRivetJointAreaUID(newRivetJointAreaUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID, newRivetJointAreaUID,
					newRivetJointAreaUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getStructuralMemberUID() {
		if (structuralMemberUID == null) {
			structuralMemberUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__STRUCTURAL_MEMBER_UID);
		}
		return structuralMemberUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMaxRivetLength() {
		return maxRivetLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxRivetLength(DoubleBaseType newMaxRivetLength, NotificationChain msgs) {
		DoubleBaseType oldMaxRivetLength = maxRivetLength;
		maxRivetLength = newMaxRivetLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH, oldMaxRivetLength,
					newMaxRivetLength);
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
	public void setMaxRivetLength(DoubleBaseType newMaxRivetLength) {
		if (newMaxRivetLength != maxRivetLength) {
			NotificationChain msgs = null;
			if (maxRivetLength != null)
				msgs = ((InternalEObject) maxRivetLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH,
						null, msgs);
			if (newMaxRivetLength != null)
				msgs = ((InternalEObject) newMaxRivetLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH,
						null, msgs);
			msgs = basicSetMaxRivetLength(newMaxRivetLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH, newMaxRivetLength,
					newMaxRivetLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID:
			return basicSetRivetJointAreaUID(null, msgs);
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__STRUCTURAL_MEMBER_UID:
			return ((InternalEList<?>) getStructuralMemberUID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH:
			return basicSetMaxRivetLength(null, msgs);
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
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID:
			return getRivetJointAreaUID();
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__STRUCTURAL_MEMBER_UID:
			return getStructuralMemberUID();
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH:
			return getMaxRivetLength();
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
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID:
			setRivetJointAreaUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__STRUCTURAL_MEMBER_UID:
			getStructuralMemberUID().clear();
			getStructuralMemberUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH:
			setMaxRivetLength((DoubleBaseType) newValue);
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
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID:
			setRivetJointAreaUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__STRUCTURAL_MEMBER_UID:
			getStructuralMemberUID().clear();
			return;
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH:
			setMaxRivetLength((DoubleBaseType) null);
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
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__RIVET_JOINT_AREA_UID:
			return rivetJointAreaUID != null;
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__STRUCTURAL_MEMBER_UID:
			return structuralMemberUID != null && !structuralMemberUID.isEmpty();
		case CpacsPackage.RIVET_JOINT_AREA_ASSEMBLY_POSITION_TYPE__MAX_RIVET_LENGTH:
			return maxRivetLength != null;
		}
		return super.eIsSet(featureID);
	}

} //RivetJointAreaAssemblyPositionTypeImpl
