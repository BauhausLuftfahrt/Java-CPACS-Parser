/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MComponentSegmentsType;
import Cpacs.MWingStructureType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MWing Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MWingStructureTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MWingStructureTypeImpl#getMComponentSegments <em>MComponent Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MWingStructureTypeImpl extends ComplexBaseTypeImpl implements MWingStructureType {
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
	 * The cached value of the '{@link #getMComponentSegments() <em>MComponent Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMComponentSegments()
	 * @generated
	 * @ordered
	 */
	protected MComponentSegmentsType mComponentSegments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MWingStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMWingStructureType();
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
					CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MComponentSegmentsType getMComponentSegments() {
		return mComponentSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMComponentSegments(MComponentSegmentsType newMComponentSegments,
			NotificationChain msgs) {
		MComponentSegmentsType oldMComponentSegments = mComponentSegments;
		mComponentSegments = newMComponentSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS, oldMComponentSegments,
					newMComponentSegments);
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
	public void setMComponentSegments(MComponentSegmentsType newMComponentSegments) {
		if (newMComponentSegments != mComponentSegments) {
			NotificationChain msgs = null;
			if (mComponentSegments != null)
				msgs = ((InternalEObject) mComponentSegments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS, null, msgs);
			if (newMComponentSegments != null)
				msgs = ((InternalEObject) newMComponentSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS, null, msgs);
			msgs = basicSetMComponentSegments(newMComponentSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS, newMComponentSegments,
					newMComponentSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS:
			return basicSetMComponentSegments(null, msgs);
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
		case CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS:
			return getMComponentSegments();
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
		case CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS:
			setMComponentSegments((MComponentSegmentsType) newValue);
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
		case CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS:
			setMComponentSegments((MComponentSegmentsType) null);
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
		case CpacsPackage.MWING_STRUCTURE_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MWING_STRUCTURE_TYPE__MCOMPONENT_SEGMENTS:
			return mComponentSegments != null;
		}
		return super.eIsSet(featureID);
	}

} //MWingStructureTypeImpl
