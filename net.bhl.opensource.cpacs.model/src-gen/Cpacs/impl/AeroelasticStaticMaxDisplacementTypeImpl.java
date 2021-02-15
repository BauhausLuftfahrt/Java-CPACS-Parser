/**
 */
package Cpacs.impl;

import Cpacs.AeroelasticStaticMaxDisplacementType;
import Cpacs.CpacsPackage;
import Cpacs.PointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aeroelastic Static Max Displacement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroelasticStaticMaxDisplacementTypeImpl#getTranslation <em>Translation</em>}</li>
 *   <li>{@link Cpacs.impl.AeroelasticStaticMaxDisplacementTypeImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroelasticStaticMaxDisplacementTypeImpl extends ComplexBaseTypeImpl
		implements AeroelasticStaticMaxDisplacementType {
	/**
	 * The cached value of the '{@link #getTranslation() <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslation()
	 * @generated
	 * @ordered
	 */
	protected PointType translation;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected PointType rotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroelasticStaticMaxDisplacementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroelasticStaticMaxDisplacementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getTranslation() {
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslation(PointType newTranslation, NotificationChain msgs) {
		PointType oldTranslation = translation;
		translation = newTranslation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION, oldTranslation, newTranslation);
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
	public void setTranslation(PointType newTranslation) {
		if (newTranslation != translation) {
			NotificationChain msgs = null;
			if (translation != null)
				msgs = ((InternalEObject) translation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION,
						null, msgs);
			if (newTranslation != null)
				msgs = ((InternalEObject) newTranslation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION,
						null, msgs);
			msgs = basicSetTranslation(newTranslation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION, newTranslation,
					newTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(PointType newRotation, NotificationChain msgs) {
		PointType oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION, oldRotation, newRotation);
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
	public void setRotation(PointType newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject) rotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION, null,
						msgs);
			if (newRotation != null)
				msgs = ((InternalEObject) newRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION, null,
						msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION, newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION:
			return basicSetTranslation(null, msgs);
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION:
			return basicSetRotation(null, msgs);
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
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION:
			return getTranslation();
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION:
			return getRotation();
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
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION:
			setTranslation((PointType) newValue);
			return;
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION:
			setRotation((PointType) newValue);
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
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION:
			setTranslation((PointType) null);
			return;
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION:
			setRotation((PointType) null);
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
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__TRANSLATION:
			return translation != null;
		case CpacsPackage.AEROELASTIC_STATIC_MAX_DISPLACEMENT_TYPE__ROTATION:
			return rotation != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroelasticStaticMaxDisplacementTypeImpl
