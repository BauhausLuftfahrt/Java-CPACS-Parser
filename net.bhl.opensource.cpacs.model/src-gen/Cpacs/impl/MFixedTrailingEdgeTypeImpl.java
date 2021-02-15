/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MControlSurfaceSupportsType;
import Cpacs.MFixedTrailingEdgeType;
import Cpacs.SingleGenericMassType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFixed Trailing Edge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MFixedTrailingEdgeTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MFixedTrailingEdgeTypeImpl#getMPanelsAndFalsework <em>MPanels And Falsework</em>}</li>
 *   <li>{@link Cpacs.impl.MFixedTrailingEdgeTypeImpl#getMControlSurfaceSupports <em>MControl Surface Supports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFixedTrailingEdgeTypeImpl extends ComplexBaseTypeImpl implements MFixedTrailingEdgeType {
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
	 * The cached value of the '{@link #getMPanelsAndFalsework() <em>MPanels And Falsework</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPanelsAndFalsework()
	 * @generated
	 * @ordered
	 */
	protected SingleGenericMassType mPanelsAndFalsework;

	/**
	 * The cached value of the '{@link #getMControlSurfaceSupports() <em>MControl Surface Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMControlSurfaceSupports()
	 * @generated
	 * @ordered
	 */
	protected MControlSurfaceSupportsType mControlSurfaceSupports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFixedTrailingEdgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMFixedTrailingEdgeType();
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
					CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleGenericMassType getMPanelsAndFalsework() {
		return mPanelsAndFalsework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPanelsAndFalsework(SingleGenericMassType newMPanelsAndFalsework,
			NotificationChain msgs) {
		SingleGenericMassType oldMPanelsAndFalsework = mPanelsAndFalsework;
		mPanelsAndFalsework = newMPanelsAndFalsework;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK, oldMPanelsAndFalsework,
					newMPanelsAndFalsework);
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
	public void setMPanelsAndFalsework(SingleGenericMassType newMPanelsAndFalsework) {
		if (newMPanelsAndFalsework != mPanelsAndFalsework) {
			NotificationChain msgs = null;
			if (mPanelsAndFalsework != null)
				msgs = ((InternalEObject) mPanelsAndFalsework).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK, null,
						msgs);
			if (newMPanelsAndFalsework != null)
				msgs = ((InternalEObject) newMPanelsAndFalsework).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK, null,
						msgs);
			msgs = basicSetMPanelsAndFalsework(newMPanelsAndFalsework, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK, newMPanelsAndFalsework,
					newMPanelsAndFalsework));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MControlSurfaceSupportsType getMControlSurfaceSupports() {
		return mControlSurfaceSupports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMControlSurfaceSupports(MControlSurfaceSupportsType newMControlSurfaceSupports,
			NotificationChain msgs) {
		MControlSurfaceSupportsType oldMControlSurfaceSupports = mControlSurfaceSupports;
		mControlSurfaceSupports = newMControlSurfaceSupports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS, oldMControlSurfaceSupports,
					newMControlSurfaceSupports);
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
	public void setMControlSurfaceSupports(MControlSurfaceSupportsType newMControlSurfaceSupports) {
		if (newMControlSurfaceSupports != mControlSurfaceSupports) {
			NotificationChain msgs = null;
			if (mControlSurfaceSupports != null)
				msgs = ((InternalEObject) mControlSurfaceSupports).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS,
						null, msgs);
			if (newMControlSurfaceSupports != null)
				msgs = ((InternalEObject) newMControlSurfaceSupports).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS,
						null, msgs);
			msgs = basicSetMControlSurfaceSupports(newMControlSurfaceSupports, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS, newMControlSurfaceSupports,
					newMControlSurfaceSupports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK:
			return basicSetMPanelsAndFalsework(null, msgs);
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS:
			return basicSetMControlSurfaceSupports(null, msgs);
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
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK:
			return getMPanelsAndFalsework();
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS:
			return getMControlSurfaceSupports();
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
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK:
			setMPanelsAndFalsework((SingleGenericMassType) newValue);
			return;
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS:
			setMControlSurfaceSupports((MControlSurfaceSupportsType) newValue);
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
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK:
			setMPanelsAndFalsework((SingleGenericMassType) null);
			return;
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS:
			setMControlSurfaceSupports((MControlSurfaceSupportsType) null);
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
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MPANELS_AND_FALSEWORK:
			return mPanelsAndFalsework != null;
		case CpacsPackage.MFIXED_TRAILING_EDGE_TYPE__MCONTROL_SURFACE_SUPPORTS:
			return mControlSurfaceSupports != null;
		}
		return super.eIsSet(featureID);
	}

} //MFixedTrailingEdgeTypeImpl
