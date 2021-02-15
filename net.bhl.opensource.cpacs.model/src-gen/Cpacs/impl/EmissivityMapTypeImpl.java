/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EmissivityMapType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emissivity Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EmissivityMapTypeImpl#getWaveLength <em>Wave Length</em>}</li>
 *   <li>{@link Cpacs.impl.EmissivityMapTypeImpl#getDiffuseEmissivity <em>Diffuse Emissivity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmissivityMapTypeImpl extends ComplexBaseTypeImpl implements EmissivityMapType {
	/**
	 * The cached value of the '{@link #getWaveLength() <em>Wave Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaveLength()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType waveLength;

	/**
	 * The cached value of the '{@link #getDiffuseEmissivity() <em>Diffuse Emissivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseEmissivity()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType diffuseEmissivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmissivityMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEmissivityMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getWaveLength() {
		return waveLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaveLength(StringVectorBaseType newWaveLength, NotificationChain msgs) {
		StringVectorBaseType oldWaveLength = waveLength;
		waveLength = newWaveLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH, oldWaveLength, newWaveLength);
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
	public void setWaveLength(StringVectorBaseType newWaveLength) {
		if (newWaveLength != waveLength) {
			NotificationChain msgs = null;
			if (waveLength != null)
				msgs = ((InternalEObject) waveLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH, null, msgs);
			if (newWaveLength != null)
				msgs = ((InternalEObject) newWaveLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH, null, msgs);
			msgs = basicSetWaveLength(newWaveLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH,
					newWaveLength, newWaveLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getDiffuseEmissivity() {
		return diffuseEmissivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiffuseEmissivity(StringVectorBaseType newDiffuseEmissivity,
			NotificationChain msgs) {
		StringVectorBaseType oldDiffuseEmissivity = diffuseEmissivity;
		diffuseEmissivity = newDiffuseEmissivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY, oldDiffuseEmissivity, newDiffuseEmissivity);
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
	public void setDiffuseEmissivity(StringVectorBaseType newDiffuseEmissivity) {
		if (newDiffuseEmissivity != diffuseEmissivity) {
			NotificationChain msgs = null;
			if (diffuseEmissivity != null)
				msgs = ((InternalEObject) diffuseEmissivity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY, null, msgs);
			if (newDiffuseEmissivity != null)
				msgs = ((InternalEObject) newDiffuseEmissivity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY, null, msgs);
			msgs = basicSetDiffuseEmissivity(newDiffuseEmissivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY,
					newDiffuseEmissivity, newDiffuseEmissivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH:
			return basicSetWaveLength(null, msgs);
		case CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY:
			return basicSetDiffuseEmissivity(null, msgs);
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
		case CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH:
			return getWaveLength();
		case CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY:
			return getDiffuseEmissivity();
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
		case CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH:
			setWaveLength((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY:
			setDiffuseEmissivity((StringVectorBaseType) newValue);
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
		case CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH:
			setWaveLength((StringVectorBaseType) null);
			return;
		case CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY:
			setDiffuseEmissivity((StringVectorBaseType) null);
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
		case CpacsPackage.EMISSIVITY_MAP_TYPE__WAVE_LENGTH:
			return waveLength != null;
		case CpacsPackage.EMISSIVITY_MAP_TYPE__DIFFUSE_EMISSIVITY:
			return diffuseEmissivity != null;
		}
		return super.eIsSet(featureID);
	}

} //EmissivityMapTypeImpl
