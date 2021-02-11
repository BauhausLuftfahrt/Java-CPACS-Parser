/**
 */
package Cpacs.impl;

import Cpacs.ControlLawModesType;
import Cpacs.ControlLawsType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Laws Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlLawsTypeImpl#getManualModes <em>Manual Modes</em>}</li>
 *   <li>{@link Cpacs.impl.ControlLawsTypeImpl#getAutomaticModes <em>Automatic Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlLawsTypeImpl extends ComplexBaseTypeImpl implements ControlLawsType {
	/**
	 * The cached value of the '{@link #getManualModes() <em>Manual Modes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualModes()
	 * @generated
	 * @ordered
	 */
	protected ControlLawModesType manualModes;

	/**
	 * The cached value of the '{@link #getAutomaticModes() <em>Automatic Modes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticModes()
	 * @generated
	 * @ordered
	 */
	protected ControlLawModesType automaticModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlLawsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlLawsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlLawModesType getManualModes() {
		return manualModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManualModes(ControlLawModesType newManualModes, NotificationChain msgs) {
		ControlLawModesType oldManualModes = manualModes;
		manualModes = newManualModes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES, oldManualModes, newManualModes);
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
	public void setManualModes(ControlLawModesType newManualModes) {
		if (newManualModes != manualModes) {
			NotificationChain msgs = null;
			if (manualModes != null)
				msgs = ((InternalEObject) manualModes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES, null, msgs);
			if (newManualModes != null)
				msgs = ((InternalEObject) newManualModes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES, null, msgs);
			msgs = basicSetManualModes(newManualModes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES,
					newManualModes, newManualModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlLawModesType getAutomaticModes() {
		return automaticModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomaticModes(ControlLawModesType newAutomaticModes, NotificationChain msgs) {
		ControlLawModesType oldAutomaticModes = automaticModes;
		automaticModes = newAutomaticModes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES, oldAutomaticModes, newAutomaticModes);
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
	public void setAutomaticModes(ControlLawModesType newAutomaticModes) {
		if (newAutomaticModes != automaticModes) {
			NotificationChain msgs = null;
			if (automaticModes != null)
				msgs = ((InternalEObject) automaticModes).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES, null, msgs);
			if (newAutomaticModes != null)
				msgs = ((InternalEObject) newAutomaticModes).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES, null, msgs);
			msgs = basicSetAutomaticModes(newAutomaticModes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES,
					newAutomaticModes, newAutomaticModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES:
			return basicSetManualModes(null, msgs);
		case CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES:
			return basicSetAutomaticModes(null, msgs);
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
		case CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES:
			return getManualModes();
		case CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES:
			return getAutomaticModes();
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
		case CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES:
			setManualModes((ControlLawModesType) newValue);
			return;
		case CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES:
			setAutomaticModes((ControlLawModesType) newValue);
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
		case CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES:
			setManualModes((ControlLawModesType) null);
			return;
		case CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES:
			setAutomaticModes((ControlLawModesType) null);
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
		case CpacsPackage.CONTROL_LAWS_TYPE__MANUAL_MODES:
			return manualModes != null;
		case CpacsPackage.CONTROL_LAWS_TYPE__AUTOMATIC_MODES:
			return automaticModes != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlLawsTypeImpl
