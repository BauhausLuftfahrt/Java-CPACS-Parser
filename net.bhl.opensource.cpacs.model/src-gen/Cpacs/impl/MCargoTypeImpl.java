/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MBulkCargosType;
import Cpacs.MCargoType;
import Cpacs.MEmptyULDsType;
import Cpacs.MULDContentsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCargo Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MCargoTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MCargoTypeImpl#getMEmptyULDs <em>MEmpty UL Ds</em>}</li>
 *   <li>{@link Cpacs.impl.MCargoTypeImpl#getMULDContents <em>MULD Contents</em>}</li>
 *   <li>{@link Cpacs.impl.MCargoTypeImpl#getMBulkCargos <em>MBulk Cargos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCargoTypeImpl extends ComplexBaseTypeImpl implements MCargoType {
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
	 * The cached value of the '{@link #getMEmptyULDs() <em>MEmpty UL Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMEmptyULDs()
	 * @generated
	 * @ordered
	 */
	protected MEmptyULDsType mEmptyULDs;

	/**
	 * The cached value of the '{@link #getMULDContents() <em>MULD Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMULDContents()
	 * @generated
	 * @ordered
	 */
	protected MULDContentsType mULDContents;

	/**
	 * The cached value of the '{@link #getMBulkCargos() <em>MBulk Cargos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMBulkCargos()
	 * @generated
	 * @ordered
	 */
	protected MBulkCargosType mBulkCargos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCargoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMCargoType();
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
					CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MEmptyULDsType getMEmptyULDs() {
		return mEmptyULDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMEmptyULDs(MEmptyULDsType newMEmptyULDs, NotificationChain msgs) {
		MEmptyULDsType oldMEmptyULDs = mEmptyULDs;
		mEmptyULDs = newMEmptyULDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS, oldMEmptyULDs, newMEmptyULDs);
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
	public void setMEmptyULDs(MEmptyULDsType newMEmptyULDs) {
		if (newMEmptyULDs != mEmptyULDs) {
			NotificationChain msgs = null;
			if (mEmptyULDs != null)
				msgs = ((InternalEObject) mEmptyULDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS, null, msgs);
			if (newMEmptyULDs != null)
				msgs = ((InternalEObject) newMEmptyULDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS, null, msgs);
			msgs = basicSetMEmptyULDs(newMEmptyULDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS, newMEmptyULDs,
					newMEmptyULDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MULDContentsType getMULDContents() {
		return mULDContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMULDContents(MULDContentsType newMULDContents, NotificationChain msgs) {
		MULDContentsType oldMULDContents = mULDContents;
		mULDContents = newMULDContents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCARGO_TYPE__MULD_CONTENTS, oldMULDContents, newMULDContents);
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
	public void setMULDContents(MULDContentsType newMULDContents) {
		if (newMULDContents != mULDContents) {
			NotificationChain msgs = null;
			if (mULDContents != null)
				msgs = ((InternalEObject) mULDContents).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MULD_CONTENTS, null, msgs);
			if (newMULDContents != null)
				msgs = ((InternalEObject) newMULDContents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MULD_CONTENTS, null, msgs);
			msgs = basicSetMULDContents(newMULDContents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCARGO_TYPE__MULD_CONTENTS,
					newMULDContents, newMULDContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MBulkCargosType getMBulkCargos() {
		return mBulkCargos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMBulkCargos(MBulkCargosType newMBulkCargos, NotificationChain msgs) {
		MBulkCargosType oldMBulkCargos = mBulkCargos;
		mBulkCargos = newMBulkCargos;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCARGO_TYPE__MBULK_CARGOS, oldMBulkCargos, newMBulkCargos);
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
	public void setMBulkCargos(MBulkCargosType newMBulkCargos) {
		if (newMBulkCargos != mBulkCargos) {
			NotificationChain msgs = null;
			if (mBulkCargos != null)
				msgs = ((InternalEObject) mBulkCargos).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MBULK_CARGOS, null, msgs);
			if (newMBulkCargos != null)
				msgs = ((InternalEObject) newMBulkCargos).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCARGO_TYPE__MBULK_CARGOS, null, msgs);
			msgs = basicSetMBulkCargos(newMBulkCargos, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MCARGO_TYPE__MBULK_CARGOS,
					newMBulkCargos, newMBulkCargos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS:
			return basicSetMEmptyULDs(null, msgs);
		case CpacsPackage.MCARGO_TYPE__MULD_CONTENTS:
			return basicSetMULDContents(null, msgs);
		case CpacsPackage.MCARGO_TYPE__MBULK_CARGOS:
			return basicSetMBulkCargos(null, msgs);
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
		case CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS:
			return getMEmptyULDs();
		case CpacsPackage.MCARGO_TYPE__MULD_CONTENTS:
			return getMULDContents();
		case CpacsPackage.MCARGO_TYPE__MBULK_CARGOS:
			return getMBulkCargos();
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
		case CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS:
			setMEmptyULDs((MEmptyULDsType) newValue);
			return;
		case CpacsPackage.MCARGO_TYPE__MULD_CONTENTS:
			setMULDContents((MULDContentsType) newValue);
			return;
		case CpacsPackage.MCARGO_TYPE__MBULK_CARGOS:
			setMBulkCargos((MBulkCargosType) newValue);
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
		case CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS:
			setMEmptyULDs((MEmptyULDsType) null);
			return;
		case CpacsPackage.MCARGO_TYPE__MULD_CONTENTS:
			setMULDContents((MULDContentsType) null);
			return;
		case CpacsPackage.MCARGO_TYPE__MBULK_CARGOS:
			setMBulkCargos((MBulkCargosType) null);
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
		case CpacsPackage.MCARGO_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MCARGO_TYPE__MEMPTY_UL_DS:
			return mEmptyULDs != null;
		case CpacsPackage.MCARGO_TYPE__MULD_CONTENTS:
			return mULDContents != null;
		case CpacsPackage.MCARGO_TYPE__MBULK_CARGOS:
			return mBulkCargos != null;
		}
		return super.eIsSet(featureID);
	}

} //MCargoTypeImpl
