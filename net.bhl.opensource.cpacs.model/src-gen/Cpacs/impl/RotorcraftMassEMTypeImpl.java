/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.RotorcraftMassEMType;
import Cpacs.RotorcraftMassGroupLevel1Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotorcraft Mass EM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorcraftMassEMTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftMassEMTypeImpl#getMStructure <em>MStructure</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftMassEMTypeImpl#getMPropulsion <em>MPropulsion</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftMassEMTypeImpl#getMSystemsAndEquipment <em>MSystems And Equipment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorcraftMassEMTypeImpl extends ComplexBaseTypeImpl implements RotorcraftMassEMType {
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
	 * The cached value of the '{@link #getMStructure() <em>MStructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMStructure()
	 * @generated
	 * @ordered
	 */
	protected RotorcraftMassGroupLevel1Type mStructure;

	/**
	 * The cached value of the '{@link #getMPropulsion() <em>MPropulsion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPropulsion()
	 * @generated
	 * @ordered
	 */
	protected RotorcraftMassGroupLevel1Type mPropulsion;

	/**
	 * The cached value of the '{@link #getMSystemsAndEquipment() <em>MSystems And Equipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSystemsAndEquipment()
	 * @generated
	 * @ordered
	 */
	protected RotorcraftMassGroupLevel1Type mSystemsAndEquipment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorcraftMassEMTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorcraftMassEMType();
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
					CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION, newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassGroupLevel1Type getMStructure() {
		return mStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMStructure(RotorcraftMassGroupLevel1Type newMStructure, NotificationChain msgs) {
		RotorcraftMassGroupLevel1Type oldMStructure = mStructure;
		mStructure = newMStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE, oldMStructure, newMStructure);
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
	public void setMStructure(RotorcraftMassGroupLevel1Type newMStructure) {
		if (newMStructure != mStructure) {
			NotificationChain msgs = null;
			if (mStructure != null)
				msgs = ((InternalEObject) mStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE, null, msgs);
			if (newMStructure != null)
				msgs = ((InternalEObject) newMStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE, null, msgs);
			msgs = basicSetMStructure(newMStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE,
					newMStructure, newMStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassGroupLevel1Type getMPropulsion() {
		return mPropulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPropulsion(RotorcraftMassGroupLevel1Type newMPropulsion, NotificationChain msgs) {
		RotorcraftMassGroupLevel1Type oldMPropulsion = mPropulsion;
		mPropulsion = newMPropulsion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION, oldMPropulsion, newMPropulsion);
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
	public void setMPropulsion(RotorcraftMassGroupLevel1Type newMPropulsion) {
		if (newMPropulsion != mPropulsion) {
			NotificationChain msgs = null;
			if (mPropulsion != null)
				msgs = ((InternalEObject) mPropulsion).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION, null, msgs);
			if (newMPropulsion != null)
				msgs = ((InternalEObject) newMPropulsion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION, null, msgs);
			msgs = basicSetMPropulsion(newMPropulsion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION,
					newMPropulsion, newMPropulsion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorcraftMassGroupLevel1Type getMSystemsAndEquipment() {
		return mSystemsAndEquipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSystemsAndEquipment(RotorcraftMassGroupLevel1Type newMSystemsAndEquipment,
			NotificationChain msgs) {
		RotorcraftMassGroupLevel1Type oldMSystemsAndEquipment = mSystemsAndEquipment;
		mSystemsAndEquipment = newMSystemsAndEquipment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT, oldMSystemsAndEquipment,
					newMSystemsAndEquipment);
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
	public void setMSystemsAndEquipment(RotorcraftMassGroupLevel1Type newMSystemsAndEquipment) {
		if (newMSystemsAndEquipment != mSystemsAndEquipment) {
			NotificationChain msgs = null;
			if (mSystemsAndEquipment != null)
				msgs = ((InternalEObject) mSystemsAndEquipment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT, null,
						msgs);
			if (newMSystemsAndEquipment != null)
				msgs = ((InternalEObject) newMSystemsAndEquipment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT, null,
						msgs);
			msgs = basicSetMSystemsAndEquipment(newMSystemsAndEquipment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT, newMSystemsAndEquipment,
					newMSystemsAndEquipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE:
			return basicSetMStructure(null, msgs);
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION:
			return basicSetMPropulsion(null, msgs);
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT:
			return basicSetMSystemsAndEquipment(null, msgs);
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
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE:
			return getMStructure();
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION:
			return getMPropulsion();
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT:
			return getMSystemsAndEquipment();
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
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE:
			setMStructure((RotorcraftMassGroupLevel1Type) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION:
			setMPropulsion((RotorcraftMassGroupLevel1Type) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT:
			setMSystemsAndEquipment((RotorcraftMassGroupLevel1Type) newValue);
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
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE:
			setMStructure((RotorcraftMassGroupLevel1Type) null);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION:
			setMPropulsion((RotorcraftMassGroupLevel1Type) null);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT:
			setMSystemsAndEquipment((RotorcraftMassGroupLevel1Type) null);
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
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSTRUCTURE:
			return mStructure != null;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MPROPULSION:
			return mPropulsion != null;
		case CpacsPackage.ROTORCRAFT_MASS_EM_TYPE__MSYSTEMS_AND_EQUIPMENT:
			return mSystemsAndEquipment != null;
		}
		return super.eIsSet(featureID);
	}

} //RotorcraftMassEMTypeImpl
