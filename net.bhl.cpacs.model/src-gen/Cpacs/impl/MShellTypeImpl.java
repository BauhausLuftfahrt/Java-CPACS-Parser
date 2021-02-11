/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MCellsType;
import Cpacs.MShellType;
import Cpacs.MSkinsType;
import Cpacs.MStringersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MShell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MShellTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MShellTypeImpl#getMSkins <em>MSkins</em>}</li>
 *   <li>{@link Cpacs.impl.MShellTypeImpl#getMCells <em>MCells</em>}</li>
 *   <li>{@link Cpacs.impl.MShellTypeImpl#getMStringers <em>MStringers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MShellTypeImpl extends ComplexBaseTypeImpl implements MShellType {
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
	 * The cached value of the '{@link #getMSkins() <em>MSkins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSkins()
	 * @generated
	 * @ordered
	 */
	protected MSkinsType mSkins;

	/**
	 * The cached value of the '{@link #getMCells() <em>MCells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCells()
	 * @generated
	 * @ordered
	 */
	protected MCellsType mCells;

	/**
	 * The cached value of the '{@link #getMStringers() <em>MStringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStringers()
	 * @generated
	 * @ordered
	 */
	protected MStringersType mStringers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MShellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMShellType();
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
					CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSkinsType getMSkins() {
		return mSkins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSkins(MSkinsType newMSkins, NotificationChain msgs) {
		MSkinsType oldMSkins = mSkins;
		mSkins = newMSkins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSHELL_TYPE__MSKINS, oldMSkins, newMSkins);
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
	public void setMSkins(MSkinsType newMSkins) {
		if (newMSkins != mSkins) {
			NotificationChain msgs = null;
			if (mSkins != null)
				msgs = ((InternalEObject) mSkins).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MSKINS, null, msgs);
			if (newMSkins != null)
				msgs = ((InternalEObject) newMSkins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MSKINS, null, msgs);
			msgs = basicSetMSkins(newMSkins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSHELL_TYPE__MSKINS, newMSkins,
					newMSkins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MCellsType getMCells() {
		return mCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMCells(MCellsType newMCells, NotificationChain msgs) {
		MCellsType oldMCells = mCells;
		mCells = newMCells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSHELL_TYPE__MCELLS, oldMCells, newMCells);
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
	public void setMCells(MCellsType newMCells) {
		if (newMCells != mCells) {
			NotificationChain msgs = null;
			if (mCells != null)
				msgs = ((InternalEObject) mCells).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MCELLS, null, msgs);
			if (newMCells != null)
				msgs = ((InternalEObject) newMCells).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MCELLS, null, msgs);
			msgs = basicSetMCells(newMCells, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSHELL_TYPE__MCELLS, newMCells,
					newMCells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MStringersType getMStringers() {
		return mStringers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStringers(MStringersType newMStringers, NotificationChain msgs) {
		MStringersType oldMStringers = mStringers;
		mStringers = newMStringers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSHELL_TYPE__MSTRINGERS, oldMStringers, newMStringers);
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
	public void setMStringers(MStringersType newMStringers) {
		if (newMStringers != mStringers) {
			NotificationChain msgs = null;
			if (mStringers != null)
				msgs = ((InternalEObject) mStringers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MSTRINGERS, null, msgs);
			if (newMStringers != null)
				msgs = ((InternalEObject) newMStringers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELL_TYPE__MSTRINGERS, null, msgs);
			msgs = basicSetMStringers(newMStringers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSHELL_TYPE__MSTRINGERS, newMStringers,
					newMStringers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MSHELL_TYPE__MSKINS:
			return basicSetMSkins(null, msgs);
		case CpacsPackage.MSHELL_TYPE__MCELLS:
			return basicSetMCells(null, msgs);
		case CpacsPackage.MSHELL_TYPE__MSTRINGERS:
			return basicSetMStringers(null, msgs);
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
		case CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MSHELL_TYPE__MSKINS:
			return getMSkins();
		case CpacsPackage.MSHELL_TYPE__MCELLS:
			return getMCells();
		case CpacsPackage.MSHELL_TYPE__MSTRINGERS:
			return getMStringers();
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
		case CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MSHELL_TYPE__MSKINS:
			setMSkins((MSkinsType) newValue);
			return;
		case CpacsPackage.MSHELL_TYPE__MCELLS:
			setMCells((MCellsType) newValue);
			return;
		case CpacsPackage.MSHELL_TYPE__MSTRINGERS:
			setMStringers((MStringersType) newValue);
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
		case CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MSHELL_TYPE__MSKINS:
			setMSkins((MSkinsType) null);
			return;
		case CpacsPackage.MSHELL_TYPE__MCELLS:
			setMCells((MCellsType) null);
			return;
		case CpacsPackage.MSHELL_TYPE__MSTRINGERS:
			setMStringers((MStringersType) null);
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
		case CpacsPackage.MSHELL_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MSHELL_TYPE__MSKINS:
			return mSkins != null;
		case CpacsPackage.MSHELL_TYPE__MCELLS:
			return mCells != null;
		case CpacsPackage.MSHELL_TYPE__MSTRINGERS:
			return mStringers != null;
		}
		return super.eIsSet(featureID);
	}

} //MShellTypeImpl
