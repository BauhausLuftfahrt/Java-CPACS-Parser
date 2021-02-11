/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RibRotationType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rib Rotation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RibRotationTypeImpl#getRibRotationReference <em>Rib Rotation Reference</em>}</li>
 *   <li>{@link Cpacs.impl.RibRotationTypeImpl#getZ <em>Z</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RibRotationTypeImpl extends ComplexBaseTypeImpl implements RibRotationType {
	/**
	 * The cached value of the '{@link #getRibRotationReference() <em>Rib Rotation Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibRotationReference()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType ribRotationReference;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType z;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RibRotationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRibRotationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getRibRotationReference() {
		return ribRotationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibRotationReference(StringBaseType newRibRotationReference,
			NotificationChain msgs) {
		StringBaseType oldRibRotationReference = ribRotationReference;
		ribRotationReference = newRibRotationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE, oldRibRotationReference,
					newRibRotationReference);
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
	public void setRibRotationReference(StringBaseType newRibRotationReference) {
		if (newRibRotationReference != ribRotationReference) {
			NotificationChain msgs = null;
			if (ribRotationReference != null)
				msgs = ((InternalEObject) ribRotationReference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE, null, msgs);
			if (newRibRotationReference != null)
				msgs = ((InternalEObject) newRibRotationReference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE, null, msgs);
			msgs = basicSetRibRotationReference(newRibRotationReference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE, newRibRotationReference,
					newRibRotationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZ(DoubleBaseType newZ, NotificationChain msgs) {
		DoubleBaseType oldZ = z;
		z = newZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.RIB_ROTATION_TYPE__Z, oldZ, newZ);
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
	public void setZ(DoubleBaseType newZ) {
		if (newZ != z) {
			NotificationChain msgs = null;
			if (z != null)
				msgs = ((InternalEObject) z).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIB_ROTATION_TYPE__Z, null, msgs);
			if (newZ != null)
				msgs = ((InternalEObject) newZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.RIB_ROTATION_TYPE__Z, null, msgs);
			msgs = basicSetZ(newZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.RIB_ROTATION_TYPE__Z, newZ, newZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE:
			return basicSetRibRotationReference(null, msgs);
		case CpacsPackage.RIB_ROTATION_TYPE__Z:
			return basicSetZ(null, msgs);
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
		case CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE:
			return getRibRotationReference();
		case CpacsPackage.RIB_ROTATION_TYPE__Z:
			return getZ();
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
		case CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE:
			setRibRotationReference((StringBaseType) newValue);
			return;
		case CpacsPackage.RIB_ROTATION_TYPE__Z:
			setZ((DoubleBaseType) newValue);
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
		case CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE:
			setRibRotationReference((StringBaseType) null);
			return;
		case CpacsPackage.RIB_ROTATION_TYPE__Z:
			setZ((DoubleBaseType) null);
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
		case CpacsPackage.RIB_ROTATION_TYPE__RIB_ROTATION_REFERENCE:
			return ribRotationReference != null;
		case CpacsPackage.RIB_ROTATION_TYPE__Z:
			return z != null;
		}
		return super.eIsSet(featureID);
	}

} //RibRotationTypeImpl
