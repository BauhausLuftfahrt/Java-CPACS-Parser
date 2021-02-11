/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MShellType;
import Cpacs.MShellsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MShells Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MShellsTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MShellsTypeImpl#getMUpperShell <em>MUpper Shell</em>}</li>
 *   <li>{@link Cpacs.impl.MShellsTypeImpl#getMLowerShell <em>MLower Shell</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MShellsTypeImpl extends ComplexBaseTypeImpl implements MShellsType {
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
	 * The cached value of the '{@link #getMUpperShell() <em>MUpper Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMUpperShell()
	 * @generated
	 * @ordered
	 */
	protected MShellType mUpperShell;

	/**
	 * The cached value of the '{@link #getMLowerShell() <em>MLower Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLowerShell()
	 * @generated
	 * @ordered
	 */
	protected MShellType mLowerShell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MShellsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMShellsType();
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
					CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MShellType getMUpperShell() {
		return mUpperShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMUpperShell(MShellType newMUpperShell, NotificationChain msgs) {
		MShellType oldMUpperShell = mUpperShell;
		mUpperShell = newMUpperShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL, oldMUpperShell, newMUpperShell);
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
	public void setMUpperShell(MShellType newMUpperShell) {
		if (newMUpperShell != mUpperShell) {
			NotificationChain msgs = null;
			if (mUpperShell != null)
				msgs = ((InternalEObject) mUpperShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL, null, msgs);
			if (newMUpperShell != null)
				msgs = ((InternalEObject) newMUpperShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL, null, msgs);
			msgs = basicSetMUpperShell(newMUpperShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL,
					newMUpperShell, newMUpperShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MShellType getMLowerShell() {
		return mLowerShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMLowerShell(MShellType newMLowerShell, NotificationChain msgs) {
		MShellType oldMLowerShell = mLowerShell;
		mLowerShell = newMLowerShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL, oldMLowerShell, newMLowerShell);
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
	public void setMLowerShell(MShellType newMLowerShell) {
		if (newMLowerShell != mLowerShell) {
			NotificationChain msgs = null;
			if (mLowerShell != null)
				msgs = ((InternalEObject) mLowerShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL, null, msgs);
			if (newMLowerShell != null)
				msgs = ((InternalEObject) newMLowerShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL, null, msgs);
			msgs = basicSetMLowerShell(newMLowerShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL,
					newMLowerShell, newMLowerShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL:
			return basicSetMUpperShell(null, msgs);
		case CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL:
			return basicSetMLowerShell(null, msgs);
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
		case CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL:
			return getMUpperShell();
		case CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL:
			return getMLowerShell();
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
		case CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL:
			setMUpperShell((MShellType) newValue);
			return;
		case CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL:
			setMLowerShell((MShellType) newValue);
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
		case CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL:
			setMUpperShell((MShellType) null);
			return;
		case CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL:
			setMLowerShell((MShellType) null);
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
		case CpacsPackage.MSHELLS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MSHELLS_TYPE__MUPPER_SHELL:
			return mUpperShell != null;
		case CpacsPackage.MSHELLS_TYPE__MLOWER_SHELL:
			return mLowerShell != null;
		}
		return super.eIsSet(featureID);
	}

} //MShellsTypeImpl
