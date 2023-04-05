/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MSparCellsType;
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
 * An implementation of the model object '<em><b>MSpar Cells Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MSparCellsTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MSparCellsTypeImpl#getMSparCell <em>MSpar Cell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSparCellsTypeImpl extends ComplexBaseTypeImpl implements MSparCellsType {
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
	 * The cached value of the '{@link #getMSparCell() <em>MSpar Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSparCell()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleGenericMassType> mSparCell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSparCellsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMSparCellsType();
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
					CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SingleGenericMassType> getMSparCell() {
		if (mSparCell == null) {
			mSparCell = new EObjectContainmentEList<SingleGenericMassType>(SingleGenericMassType.class, this,
					CpacsPackage.MSPAR_CELLS_TYPE__MSPAR_CELL);
		}
		return mSparCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MSPAR_CELLS_TYPE__MSPAR_CELL:
			return ((InternalEList<?>) getMSparCell()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MSPAR_CELLS_TYPE__MSPAR_CELL:
			return getMSparCell();
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
		case CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MSPAR_CELLS_TYPE__MSPAR_CELL:
			getMSparCell().clear();
			getMSparCell().addAll((Collection<? extends SingleGenericMassType>) newValue);
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
		case CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MSPAR_CELLS_TYPE__MSPAR_CELL:
			getMSparCell().clear();
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
		case CpacsPackage.MSPAR_CELLS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MSPAR_CELLS_TYPE__MSPAR_CELL:
			return mSparCell != null && !mSparCell.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MSparCellsTypeImpl
