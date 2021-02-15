/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MainGearSupportBeamPositionType;
import Cpacs.MainGearSupportBeamType;
import Cpacs.SparCrossSectionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Gear Support Beam Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MainGearSupportBeamTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link Cpacs.impl.MainGearSupportBeamTypeImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainGearSupportBeamTypeImpl extends ComplexBaseTypeImpl implements MainGearSupportBeamType {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected MainGearSupportBeamPositionType position;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected SparCrossSectionType structure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainGearSupportBeamTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMainGearSupportBeamType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainGearSupportBeamPositionType getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(MainGearSupportBeamPositionType newPosition, NotificationChain msgs) {
		MainGearSupportBeamPositionType oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION, oldPosition, newPosition);
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
	public void setPosition(MainGearSupportBeamPositionType newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION,
					newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SparCrossSectionType getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(SparCrossSectionType newStructure, NotificationChain msgs) {
		SparCrossSectionType oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE, oldStructure, newStructure);
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
	public void setStructure(SparCrossSectionType newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject) structure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject) newStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE,
					newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION:
			return basicSetPosition(null, msgs);
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE:
			return basicSetStructure(null, msgs);
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
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION:
			return getPosition();
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE:
			return getStructure();
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
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION:
			setPosition((MainGearSupportBeamPositionType) newValue);
			return;
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE:
			setStructure((SparCrossSectionType) newValue);
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
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION:
			setPosition((MainGearSupportBeamPositionType) null);
			return;
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE:
			setStructure((SparCrossSectionType) null);
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
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__POSITION:
			return position != null;
		case CpacsPackage.MAIN_GEAR_SUPPORT_BEAM_TYPE__STRUCTURE:
			return structure != null;
		}
		return super.eIsSet(featureID);
	}

} //MainGearSupportBeamTypeImpl
