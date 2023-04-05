/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MSparCellsType;
import Cpacs.MSparSkinsType;
import Cpacs.MSparType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSpar Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MSparTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MSparTypeImpl#getMSparSkins <em>MSpar Skins</em>}</li>
 *   <li>{@link Cpacs.impl.MSparTypeImpl#getMSparCells <em>MSpar Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSparTypeImpl extends ComplexBaseTypeImpl implements MSparType {
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
	 * The cached value of the '{@link #getMSparSkins() <em>MSpar Skins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSparSkins()
	 * @generated
	 * @ordered
	 */
	protected MSparSkinsType mSparSkins;

	/**
	 * The cached value of the '{@link #getMSparCells() <em>MSpar Cells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSparCells()
	 * @generated
	 * @ordered
	 */
	protected MSparCellsType mSparCells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSparTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMSparType();
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
					CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSparSkinsType getMSparSkins() {
		return mSparSkins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSparSkins(MSparSkinsType newMSparSkins, NotificationChain msgs) {
		MSparSkinsType oldMSparSkins = mSparSkins;
		mSparSkins = newMSparSkins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSPAR_TYPE__MSPAR_SKINS, oldMSparSkins, newMSparSkins);
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
	public void setMSparSkins(MSparSkinsType newMSparSkins) {
		if (newMSparSkins != mSparSkins) {
			NotificationChain msgs = null;
			if (mSparSkins != null)
				msgs = ((InternalEObject) mSparSkins).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_TYPE__MSPAR_SKINS, null, msgs);
			if (newMSparSkins != null)
				msgs = ((InternalEObject) newMSparSkins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_TYPE__MSPAR_SKINS, null, msgs);
			msgs = basicSetMSparSkins(newMSparSkins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSPAR_TYPE__MSPAR_SKINS, newMSparSkins,
					newMSparSkins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSparCellsType getMSparCells() {
		return mSparCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSparCells(MSparCellsType newMSparCells, NotificationChain msgs) {
		MSparCellsType oldMSparCells = mSparCells;
		mSparCells = newMSparCells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSPAR_TYPE__MSPAR_CELLS, oldMSparCells, newMSparCells);
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
	public void setMSparCells(MSparCellsType newMSparCells) {
		if (newMSparCells != mSparCells) {
			NotificationChain msgs = null;
			if (mSparCells != null)
				msgs = ((InternalEObject) mSparCells).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_TYPE__MSPAR_CELLS, null, msgs);
			if (newMSparCells != null)
				msgs = ((InternalEObject) newMSparCells).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSPAR_TYPE__MSPAR_CELLS, null, msgs);
			msgs = basicSetMSparCells(newMSparCells, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSPAR_TYPE__MSPAR_CELLS, newMSparCells,
					newMSparCells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MSPAR_TYPE__MSPAR_SKINS:
			return basicSetMSparSkins(null, msgs);
		case CpacsPackage.MSPAR_TYPE__MSPAR_CELLS:
			return basicSetMSparCells(null, msgs);
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
		case CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MSPAR_TYPE__MSPAR_SKINS:
			return getMSparSkins();
		case CpacsPackage.MSPAR_TYPE__MSPAR_CELLS:
			return getMSparCells();
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
		case CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MSPAR_TYPE__MSPAR_SKINS:
			setMSparSkins((MSparSkinsType) newValue);
			return;
		case CpacsPackage.MSPAR_TYPE__MSPAR_CELLS:
			setMSparCells((MSparCellsType) newValue);
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
		case CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MSPAR_TYPE__MSPAR_SKINS:
			setMSparSkins((MSparSkinsType) null);
			return;
		case CpacsPackage.MSPAR_TYPE__MSPAR_CELLS:
			setMSparCells((MSparCellsType) null);
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
		case CpacsPackage.MSPAR_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MSPAR_TYPE__MSPAR_SKINS:
			return mSparSkins != null;
		case CpacsPackage.MSPAR_TYPE__MSPAR_CELLS:
			return mSparCells != null;
		}
		return super.eIsSet(featureID);
	}

} //MSparTypeImpl
