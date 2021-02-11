/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MManufacturerEmptyType;
import Cpacs.MOperatorItemsType;
import Cpacs.OEMType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OEM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.OEMTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.OEMTypeImpl#getMEM <em>MEM</em>}</li>
 *   <li>{@link Cpacs.impl.OEMTypeImpl#getMOperatorItems <em>MOperator Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OEMTypeImpl extends ComplexBaseTypeImpl implements OEMType {
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
	 * The cached value of the '{@link #getMEM() <em>MEM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEM()
	 * @generated
	 * @ordered
	 */
	protected MManufacturerEmptyType mEM;

	/**
	 * The cached value of the '{@link #getMOperatorItems() <em>MOperator Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOperatorItems()
	 * @generated
	 * @ordered
	 */
	protected MOperatorItemsType mOperatorItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OEMTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getOEMType();
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
					CpacsPackage.OEM_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OEM_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OEM_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OEM_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MManufacturerEmptyType getMEM() {
		return mEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEM(MManufacturerEmptyType newMEM, NotificationChain msgs) {
		MManufacturerEmptyType oldMEM = mEM;
		mEM = newMEM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CpacsPackage.OEM_TYPE__MEM,
					oldMEM, newMEM);
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
	public void setMEM(MManufacturerEmptyType newMEM) {
		if (newMEM != mEM) {
			NotificationChain msgs = null;
			if (mEM != null)
				msgs = ((InternalEObject) mEM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CpacsPackage.OEM_TYPE__MEM,
						null, msgs);
			if (newMEM != null)
				msgs = ((InternalEObject) newMEM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CpacsPackage.OEM_TYPE__MEM,
						null, msgs);
			msgs = basicSetMEM(newMEM, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OEM_TYPE__MEM, newMEM, newMEM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MOperatorItemsType getMOperatorItems() {
		return mOperatorItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOperatorItems(MOperatorItemsType newMOperatorItems, NotificationChain msgs) {
		MOperatorItemsType oldMOperatorItems = mOperatorItems;
		mOperatorItems = newMOperatorItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS, oldMOperatorItems, newMOperatorItems);
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
	public void setMOperatorItems(MOperatorItemsType newMOperatorItems) {
		if (newMOperatorItems != mOperatorItems) {
			NotificationChain msgs = null;
			if (mOperatorItems != null)
				msgs = ((InternalEObject) mOperatorItems).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS, null, msgs);
			if (newMOperatorItems != null)
				msgs = ((InternalEObject) newMOperatorItems).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS, null, msgs);
			msgs = basicSetMOperatorItems(newMOperatorItems, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS,
					newMOperatorItems, newMOperatorItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.OEM_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.OEM_TYPE__MEM:
			return basicSetMEM(null, msgs);
		case CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS:
			return basicSetMOperatorItems(null, msgs);
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
		case CpacsPackage.OEM_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.OEM_TYPE__MEM:
			return getMEM();
		case CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS:
			return getMOperatorItems();
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
		case CpacsPackage.OEM_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.OEM_TYPE__MEM:
			setMEM((MManufacturerEmptyType) newValue);
			return;
		case CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS:
			setMOperatorItems((MOperatorItemsType) newValue);
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
		case CpacsPackage.OEM_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.OEM_TYPE__MEM:
			setMEM((MManufacturerEmptyType) null);
			return;
		case CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS:
			setMOperatorItems((MOperatorItemsType) null);
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
		case CpacsPackage.OEM_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.OEM_TYPE__MEM:
			return mEM != null;
		case CpacsPackage.OEM_TYPE__MOPERATOR_ITEMS:
			return mOperatorItems != null;
		}
		return super.eIsSet(featureID);
	}

} //OEMTypeImpl
