/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonBoxType;
import Cpacs.PylonRibsDefinitionsType;
import Cpacs.PylonShellType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonBoxTypeImpl#getInnerSideShell <em>Inner Side Shell</em>}</li>
 *   <li>{@link Cpacs.impl.PylonBoxTypeImpl#getOuterSideShell <em>Outer Side Shell</em>}</li>
 *   <li>{@link Cpacs.impl.PylonBoxTypeImpl#getLowerShell <em>Lower Shell</em>}</li>
 *   <li>{@link Cpacs.impl.PylonBoxTypeImpl#getUpperShell <em>Upper Shell</em>}</li>
 *   <li>{@link Cpacs.impl.PylonBoxTypeImpl#getRibsDefinitions <em>Ribs Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.PylonBoxTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonBoxTypeImpl extends ComplexBaseTypeImpl implements PylonBoxType {
	/**
	 * The cached value of the '{@link #getInnerSideShell() <em>Inner Side Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerSideShell()
	 * @generated
	 * @ordered
	 */
	protected PylonShellType innerSideShell;

	/**
	 * The cached value of the '{@link #getOuterSideShell() <em>Outer Side Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterSideShell()
	 * @generated
	 * @ordered
	 */
	protected PylonShellType outerSideShell;

	/**
	 * The cached value of the '{@link #getLowerShell() <em>Lower Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerShell()
	 * @generated
	 * @ordered
	 */
	protected PylonShellType lowerShell;

	/**
	 * The cached value of the '{@link #getUpperShell() <em>Upper Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperShell()
	 * @generated
	 * @ordered
	 */
	protected PylonShellType upperShell;

	/**
	 * The cached value of the '{@link #getRibsDefinitions() <em>Ribs Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibsDefinitions()
	 * @generated
	 * @ordered
	 */
	protected PylonRibsDefinitionsType ribsDefinitions;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonBoxType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShellType getInnerSideShell() {
		return innerSideShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerSideShell(PylonShellType newInnerSideShell, NotificationChain msgs) {
		PylonShellType oldInnerSideShell = innerSideShell;
		innerSideShell = newInnerSideShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL, oldInnerSideShell, newInnerSideShell);
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
	public void setInnerSideShell(PylonShellType newInnerSideShell) {
		if (newInnerSideShell != innerSideShell) {
			NotificationChain msgs = null;
			if (innerSideShell != null)
				msgs = ((InternalEObject) innerSideShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL, null, msgs);
			if (newInnerSideShell != null)
				msgs = ((InternalEObject) newInnerSideShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL, null, msgs);
			msgs = basicSetInnerSideShell(newInnerSideShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL,
					newInnerSideShell, newInnerSideShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShellType getOuterSideShell() {
		return outerSideShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterSideShell(PylonShellType newOuterSideShell, NotificationChain msgs) {
		PylonShellType oldOuterSideShell = outerSideShell;
		outerSideShell = newOuterSideShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL, oldOuterSideShell, newOuterSideShell);
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
	public void setOuterSideShell(PylonShellType newOuterSideShell) {
		if (newOuterSideShell != outerSideShell) {
			NotificationChain msgs = null;
			if (outerSideShell != null)
				msgs = ((InternalEObject) outerSideShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL, null, msgs);
			if (newOuterSideShell != null)
				msgs = ((InternalEObject) newOuterSideShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL, null, msgs);
			msgs = basicSetOuterSideShell(newOuterSideShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL,
					newOuterSideShell, newOuterSideShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShellType getLowerShell() {
		return lowerShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerShell(PylonShellType newLowerShell, NotificationChain msgs) {
		PylonShellType oldLowerShell = lowerShell;
		lowerShell = newLowerShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL, oldLowerShell, newLowerShell);
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
	public void setLowerShell(PylonShellType newLowerShell) {
		if (newLowerShell != lowerShell) {
			NotificationChain msgs = null;
			if (lowerShell != null)
				msgs = ((InternalEObject) lowerShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL, null, msgs);
			if (newLowerShell != null)
				msgs = ((InternalEObject) newLowerShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL, null, msgs);
			msgs = basicSetLowerShell(newLowerShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL,
					newLowerShell, newLowerShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShellType getUpperShell() {
		return upperShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperShell(PylonShellType newUpperShell, NotificationChain msgs) {
		PylonShellType oldUpperShell = upperShell;
		upperShell = newUpperShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL, oldUpperShell, newUpperShell);
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
	public void setUpperShell(PylonShellType newUpperShell) {
		if (newUpperShell != upperShell) {
			NotificationChain msgs = null;
			if (upperShell != null)
				msgs = ((InternalEObject) upperShell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL, null, msgs);
			if (newUpperShell != null)
				msgs = ((InternalEObject) newUpperShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL, null, msgs);
			msgs = basicSetUpperShell(newUpperShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL,
					newUpperShell, newUpperShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonRibsDefinitionsType getRibsDefinitions() {
		return ribsDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibsDefinitions(PylonRibsDefinitionsType newRibsDefinitions,
			NotificationChain msgs) {
		PylonRibsDefinitionsType oldRibsDefinitions = ribsDefinitions;
		ribsDefinitions = newRibsDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS, oldRibsDefinitions, newRibsDefinitions);
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
	public void setRibsDefinitions(PylonRibsDefinitionsType newRibsDefinitions) {
		if (newRibsDefinitions != ribsDefinitions) {
			NotificationChain msgs = null;
			if (ribsDefinitions != null)
				msgs = ((InternalEObject) ribsDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS, null, msgs);
			if (newRibsDefinitions != null)
				msgs = ((InternalEObject) newRibsDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS, null, msgs);
			msgs = basicSetRibsDefinitions(newRibsDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS,
					newRibsDefinitions, newRibsDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_BOX_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL:
			return basicSetInnerSideShell(null, msgs);
		case CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL:
			return basicSetOuterSideShell(null, msgs);
		case CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL:
			return basicSetLowerShell(null, msgs);
		case CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL:
			return basicSetUpperShell(null, msgs);
		case CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS:
			return basicSetRibsDefinitions(null, msgs);
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
		case CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL:
			return getInnerSideShell();
		case CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL:
			return getOuterSideShell();
		case CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL:
			return getLowerShell();
		case CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL:
			return getUpperShell();
		case CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS:
			return getRibsDefinitions();
		case CpacsPackage.PYLON_BOX_TYPE__UID:
			return getUID();
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
		case CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL:
			setInnerSideShell((PylonShellType) newValue);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL:
			setOuterSideShell((PylonShellType) newValue);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL:
			setLowerShell((PylonShellType) newValue);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL:
			setUpperShell((PylonShellType) newValue);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS:
			setRibsDefinitions((PylonRibsDefinitionsType) newValue);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL:
			setInnerSideShell((PylonShellType) null);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL:
			setOuterSideShell((PylonShellType) null);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL:
			setLowerShell((PylonShellType) null);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL:
			setUpperShell((PylonShellType) null);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS:
			setRibsDefinitions((PylonRibsDefinitionsType) null);
			return;
		case CpacsPackage.PYLON_BOX_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.PYLON_BOX_TYPE__INNER_SIDE_SHELL:
			return innerSideShell != null;
		case CpacsPackage.PYLON_BOX_TYPE__OUTER_SIDE_SHELL:
			return outerSideShell != null;
		case CpacsPackage.PYLON_BOX_TYPE__LOWER_SHELL:
			return lowerShell != null;
		case CpacsPackage.PYLON_BOX_TYPE__UPPER_SHELL:
			return upperShell != null;
		case CpacsPackage.PYLON_BOX_TYPE__RIBS_DEFINITIONS:
			return ribsDefinitions != null;
		case CpacsPackage.PYLON_BOX_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //PylonBoxTypeImpl
