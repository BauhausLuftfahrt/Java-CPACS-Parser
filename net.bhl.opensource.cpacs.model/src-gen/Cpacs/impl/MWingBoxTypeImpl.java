/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MRibsType;
import Cpacs.MShellsType;
import Cpacs.MSparsType;
import Cpacs.MWingBoxType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MWing Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MWingBoxTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MWingBoxTypeImpl#getMShells <em>MShells</em>}</li>
 *   <li>{@link Cpacs.impl.MWingBoxTypeImpl#getMSpars <em>MSpars</em>}</li>
 *   <li>{@link Cpacs.impl.MWingBoxTypeImpl#getMRibs <em>MRibs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MWingBoxTypeImpl extends ComplexBaseTypeImpl implements MWingBoxType {
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
	 * The cached value of the '{@link #getMShells() <em>MShells</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMShells()
	 * @generated
	 * @ordered
	 */
	protected MShellsType mShells;

	/**
	 * The cached value of the '{@link #getMSpars() <em>MSpars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSpars()
	 * @generated
	 * @ordered
	 */
	protected MSparsType mSpars;

	/**
	 * The cached value of the '{@link #getMRibs() <em>MRibs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRibs()
	 * @generated
	 * @ordered
	 */
	protected MRibsType mRibs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MWingBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMWingBoxType();
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
					CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MShellsType getMShells() {
		return mShells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMShells(MShellsType newMShells, NotificationChain msgs) {
		MShellsType oldMShells = mShells;
		mShells = newMShells;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MWING_BOX_TYPE__MSHELLS, oldMShells, newMShells);
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
	public void setMShells(MShellsType newMShells) {
		if (newMShells != mShells) {
			NotificationChain msgs = null;
			if (mShells != null)
				msgs = ((InternalEObject) mShells).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MSHELLS, null, msgs);
			if (newMShells != null)
				msgs = ((InternalEObject) newMShells).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MSHELLS, null, msgs);
			msgs = basicSetMShells(newMShells, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MWING_BOX_TYPE__MSHELLS, newMShells,
					newMShells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSparsType getMSpars() {
		return mSpars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSpars(MSparsType newMSpars, NotificationChain msgs) {
		MSparsType oldMSpars = mSpars;
		mSpars = newMSpars;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MWING_BOX_TYPE__MSPARS, oldMSpars, newMSpars);
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
	public void setMSpars(MSparsType newMSpars) {
		if (newMSpars != mSpars) {
			NotificationChain msgs = null;
			if (mSpars != null)
				msgs = ((InternalEObject) mSpars).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MSPARS, null, msgs);
			if (newMSpars != null)
				msgs = ((InternalEObject) newMSpars).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MSPARS, null, msgs);
			msgs = basicSetMSpars(newMSpars, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MWING_BOX_TYPE__MSPARS, newMSpars,
					newMSpars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MRibsType getMRibs() {
		return mRibs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRibs(MRibsType newMRibs, NotificationChain msgs) {
		MRibsType oldMRibs = mRibs;
		mRibs = newMRibs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MWING_BOX_TYPE__MRIBS, oldMRibs, newMRibs);
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
	public void setMRibs(MRibsType newMRibs) {
		if (newMRibs != mRibs) {
			NotificationChain msgs = null;
			if (mRibs != null)
				msgs = ((InternalEObject) mRibs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MRIBS, null, msgs);
			if (newMRibs != null)
				msgs = ((InternalEObject) newMRibs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_BOX_TYPE__MRIBS, null, msgs);
			msgs = basicSetMRibs(newMRibs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MWING_BOX_TYPE__MRIBS, newMRibs,
					newMRibs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MWING_BOX_TYPE__MSHELLS:
			return basicSetMShells(null, msgs);
		case CpacsPackage.MWING_BOX_TYPE__MSPARS:
			return basicSetMSpars(null, msgs);
		case CpacsPackage.MWING_BOX_TYPE__MRIBS:
			return basicSetMRibs(null, msgs);
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
		case CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MWING_BOX_TYPE__MSHELLS:
			return getMShells();
		case CpacsPackage.MWING_BOX_TYPE__MSPARS:
			return getMSpars();
		case CpacsPackage.MWING_BOX_TYPE__MRIBS:
			return getMRibs();
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
		case CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MWING_BOX_TYPE__MSHELLS:
			setMShells((MShellsType) newValue);
			return;
		case CpacsPackage.MWING_BOX_TYPE__MSPARS:
			setMSpars((MSparsType) newValue);
			return;
		case CpacsPackage.MWING_BOX_TYPE__MRIBS:
			setMRibs((MRibsType) newValue);
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
		case CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MWING_BOX_TYPE__MSHELLS:
			setMShells((MShellsType) null);
			return;
		case CpacsPackage.MWING_BOX_TYPE__MSPARS:
			setMSpars((MSparsType) null);
			return;
		case CpacsPackage.MWING_BOX_TYPE__MRIBS:
			setMRibs((MRibsType) null);
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
		case CpacsPackage.MWING_BOX_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MWING_BOX_TYPE__MSHELLS:
			return mShells != null;
		case CpacsPackage.MWING_BOX_TYPE__MSPARS:
			return mSpars != null;
		case CpacsPackage.MWING_BOX_TYPE__MRIBS:
			return mRibs != null;
		}
		return super.eIsSet(featureID);
	}

} //MWingBoxTypeImpl
