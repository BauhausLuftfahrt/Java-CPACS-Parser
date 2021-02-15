/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MControlSurfaceSupportType;
import Cpacs.MControlSurfaceSupportsType;

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
 * An implementation of the model object '<em><b>MControl Surface Supports Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MControlSurfaceSupportsTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MControlSurfaceSupportsTypeImpl#getMControlSurfaceSupport <em>MControl Surface Support</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MControlSurfaceSupportsTypeImpl extends ComplexBaseTypeImpl implements MControlSurfaceSupportsType {
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
	 * The cached value of the '{@link #getMControlSurfaceSupport() <em>MControl Surface Support</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMControlSurfaceSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<MControlSurfaceSupportType> mControlSurfaceSupport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MControlSurfaceSupportsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMControlSurfaceSupportsType();
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
					CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION, oldMassDescription,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION, null,
						msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION, null,
						msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION, newMassDescription,
					newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MControlSurfaceSupportType> getMControlSurfaceSupport() {
		if (mControlSurfaceSupport == null) {
			mControlSurfaceSupport = new EObjectContainmentEList<MControlSurfaceSupportType>(
					MControlSurfaceSupportType.class, this,
					CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MCONTROL_SURFACE_SUPPORT);
		}
		return mControlSurfaceSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MCONTROL_SURFACE_SUPPORT:
			return ((InternalEList<?>) getMControlSurfaceSupport()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MCONTROL_SURFACE_SUPPORT:
			return getMControlSurfaceSupport();
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MCONTROL_SURFACE_SUPPORT:
			getMControlSurfaceSupport().clear();
			getMControlSurfaceSupport().addAll((Collection<? extends MControlSurfaceSupportType>) newValue);
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MCONTROL_SURFACE_SUPPORT:
			getMControlSurfaceSupport().clear();
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
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MCONTROL_SURFACE_SUPPORTS_TYPE__MCONTROL_SURFACE_SUPPORT:
			return mControlSurfaceSupport != null && !mControlSurfaceSupport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MControlSurfaceSupportsTypeImpl
