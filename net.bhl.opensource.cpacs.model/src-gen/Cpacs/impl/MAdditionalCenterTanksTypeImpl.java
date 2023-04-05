/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MAdditionalCenterTanksType;
import Cpacs.SingleGenericMassType;

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
 * An implementation of the model object '<em><b>MAdditional Center Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MAdditionalCenterTanksTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MAdditionalCenterTanksTypeImpl#getMAdditionalCenterTank <em>MAdditional Center Tank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAdditionalCenterTanksTypeImpl extends ComplexBaseTypeImpl implements MAdditionalCenterTanksType {
	/**
	 * The cached value of the '{@link #getMassDescription() <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType massDescription;

	/**
	 * The cached value of the '{@link #getMAdditionalCenterTank() <em>MAdditional Center Tank</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAdditionalCenterTank()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleGenericMassType> mAdditionalCenterTank;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAdditionalCenterTanksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMAdditionalCenterTanksType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMassDescription() {
		return massDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassDescription(GenericMassType newMassDescription, NotificationChain msgs) {
		GenericMassType oldMassDescription = massDescription;
		massDescription = newMassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION, oldMassDescription,
					newMassDescription);
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
	public void setMassDescription(GenericMassType newMassDescription) {
		if (newMassDescription != massDescription) {
			NotificationChain msgs = null;
			if (massDescription != null)
				msgs = ((InternalEObject) massDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION, null,
						msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION, null,
						msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION, newMassDescription,
					newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleGenericMassType> getMAdditionalCenterTank() {
		if (mAdditionalCenterTank == null) {
			mAdditionalCenterTank = new EObjectContainmentEList<SingleGenericMassType>(SingleGenericMassType.class,
					this, CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MADDITIONAL_CENTER_TANK);
		}
		return mAdditionalCenterTank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MADDITIONAL_CENTER_TANK:
			return ((InternalEList<?>) getMAdditionalCenterTank()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MADDITIONAL_CENTER_TANK:
			return getMAdditionalCenterTank();
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
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MADDITIONAL_CENTER_TANK:
			getMAdditionalCenterTank().clear();
			getMAdditionalCenterTank().addAll((Collection<? extends SingleGenericMassType>) newValue);
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
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MADDITIONAL_CENTER_TANK:
			getMAdditionalCenterTank().clear();
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
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MADDITIONAL_CENTER_TANKS_TYPE__MADDITIONAL_CENTER_TANK:
			return mAdditionalCenterTank != null && !mAdditionalCenterTank.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MAdditionalCenterTanksTypeImpl
