/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.RotorcraftMassGroupLevel1Type;
import Cpacs.RotorcraftMassGroupLevel2Type;

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
 * An implementation of the model object '<em><b>Rotorcraft Mass Group Level1 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorcraftMassGroupLevel1TypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.RotorcraftMassGroupLevel1TypeImpl#getMGroup <em>MGroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorcraftMassGroupLevel1TypeImpl extends ComplexBaseTypeImpl implements RotorcraftMassGroupLevel1Type {
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
	 * The cached value of the '{@link #getMGroup() <em>MGroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<RotorcraftMassGroupLevel2Type> mGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorcraftMassGroupLevel1TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorcraftMassGroupLevel1Type();
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
					CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION, oldMassDescription,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION, null,
						msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION, null,
						msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION, newMassDescription,
					newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RotorcraftMassGroupLevel2Type> getMGroup() {
		if (mGroup == null) {
			mGroup = new EObjectContainmentEList<RotorcraftMassGroupLevel2Type>(RotorcraftMassGroupLevel2Type.class,
					this, CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MGROUP);
		}
		return mGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MGROUP:
			return ((InternalEList<?>) getMGroup()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MGROUP:
			return getMGroup();
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
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MGROUP:
			getMGroup().clear();
			getMGroup().addAll((Collection<? extends RotorcraftMassGroupLevel2Type>) newValue);
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
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MGROUP:
			getMGroup().clear();
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
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.ROTORCRAFT_MASS_GROUP_LEVEL1_TYPE__MGROUP:
			return mGroup != null && !mGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RotorcraftMassGroupLevel1TypeImpl
