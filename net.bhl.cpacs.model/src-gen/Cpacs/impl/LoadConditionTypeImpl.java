/**
 */
package Cpacs.impl;

import Cpacs.AdditionalParametersType;
import Cpacs.CpacsPackage;
import Cpacs.DesignSpeedType;
import Cpacs.DoubleBaseType;
import Cpacs.IdentifierType;
import Cpacs.LoadConditionType;
import Cpacs.SizingTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadConditionTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link Cpacs.impl.LoadConditionTypeImpl#getSizingType <em>Sizing Type</em>}</li>
 *   <li>{@link Cpacs.impl.LoadConditionTypeImpl#getSafetyFactor <em>Safety Factor</em>}</li>
 *   <li>{@link Cpacs.impl.LoadConditionTypeImpl#getDesignSpeed <em>Design Speed</em>}</li>
 *   <li>{@link Cpacs.impl.LoadConditionTypeImpl#getAdditionalParameters <em>Additional Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadConditionTypeImpl extends ComplexBaseTypeImpl implements LoadConditionType {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected IdentifierType identifier;

	/**
	 * The cached value of the '{@link #getSizingType() <em>Sizing Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizingType()
	 * @generated
	 * @ordered
	 */
	protected SizingTypeType sizingType;

	/**
	 * The cached value of the '{@link #getSafetyFactor() <em>Safety Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType safetyFactor;

	/**
	 * The cached value of the '{@link #getDesignSpeed() <em>Design Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignSpeed()
	 * @generated
	 * @ordered
	 */
	protected DesignSpeedType designSpeed;

	/**
	 * The cached value of the '{@link #getAdditionalParameters() <em>Additional Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalParameters()
	 * @generated
	 * @ordered
	 */
	protected AdditionalParametersType additionalParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadConditionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierType getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(IdentifierType newIdentifier, NotificationChain msgs) {
		IdentifierType oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(IdentifierType newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject) identifier).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject) newIdentifier).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER,
					newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizingTypeType getSizingType() {
		return sizingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSizingType(SizingTypeType newSizingType, NotificationChain msgs) {
		SizingTypeType oldSizingType = sizingType;
		sizingType = newSizingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE, oldSizingType, newSizingType);
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
	public void setSizingType(SizingTypeType newSizingType) {
		if (newSizingType != sizingType) {
			NotificationChain msgs = null;
			if (sizingType != null)
				msgs = ((InternalEObject) sizingType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE, null, msgs);
			if (newSizingType != null)
				msgs = ((InternalEObject) newSizingType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE, null, msgs);
			msgs = basicSetSizingType(newSizingType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE,
					newSizingType, newSizingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSafetyFactor() {
		return safetyFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSafetyFactor(DoubleBaseType newSafetyFactor, NotificationChain msgs) {
		DoubleBaseType oldSafetyFactor = safetyFactor;
		safetyFactor = newSafetyFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR, oldSafetyFactor, newSafetyFactor);
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
	public void setSafetyFactor(DoubleBaseType newSafetyFactor) {
		if (newSafetyFactor != safetyFactor) {
			NotificationChain msgs = null;
			if (safetyFactor != null)
				msgs = ((InternalEObject) safetyFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR, null, msgs);
			if (newSafetyFactor != null)
				msgs = ((InternalEObject) newSafetyFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR, null, msgs);
			msgs = basicSetSafetyFactor(newSafetyFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR,
					newSafetyFactor, newSafetyFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignSpeedType getDesignSpeed() {
		return designSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignSpeed(DesignSpeedType newDesignSpeed, NotificationChain msgs) {
		DesignSpeedType oldDesignSpeed = designSpeed;
		designSpeed = newDesignSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED, oldDesignSpeed, newDesignSpeed);
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
	public void setDesignSpeed(DesignSpeedType newDesignSpeed) {
		if (newDesignSpeed != designSpeed) {
			NotificationChain msgs = null;
			if (designSpeed != null)
				msgs = ((InternalEObject) designSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED, null, msgs);
			if (newDesignSpeed != null)
				msgs = ((InternalEObject) newDesignSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED, null, msgs);
			msgs = basicSetDesignSpeed(newDesignSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED,
					newDesignSpeed, newDesignSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdditionalParametersType getAdditionalParameters() {
		return additionalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalParameters(AdditionalParametersType newAdditionalParameters,
			NotificationChain msgs) {
		AdditionalParametersType oldAdditionalParameters = additionalParameters;
		additionalParameters = newAdditionalParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS, oldAdditionalParameters,
					newAdditionalParameters);
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
	public void setAdditionalParameters(AdditionalParametersType newAdditionalParameters) {
		if (newAdditionalParameters != additionalParameters) {
			NotificationChain msgs = null;
			if (additionalParameters != null)
				msgs = ((InternalEObject) additionalParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS, null, msgs);
			if (newAdditionalParameters != null)
				msgs = ((InternalEObject) newAdditionalParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS, null, msgs);
			msgs = basicSetAdditionalParameters(newAdditionalParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS, newAdditionalParameters,
					newAdditionalParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER:
			return basicSetIdentifier(null, msgs);
		case CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE:
			return basicSetSizingType(null, msgs);
		case CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR:
			return basicSetSafetyFactor(null, msgs);
		case CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED:
			return basicSetDesignSpeed(null, msgs);
		case CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS:
			return basicSetAdditionalParameters(null, msgs);
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
		case CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER:
			return getIdentifier();
		case CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE:
			return getSizingType();
		case CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR:
			return getSafetyFactor();
		case CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED:
			return getDesignSpeed();
		case CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS:
			return getAdditionalParameters();
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
		case CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER:
			setIdentifier((IdentifierType) newValue);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE:
			setSizingType((SizingTypeType) newValue);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR:
			setSafetyFactor((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED:
			setDesignSpeed((DesignSpeedType) newValue);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS:
			setAdditionalParameters((AdditionalParametersType) newValue);
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
		case CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER:
			setIdentifier((IdentifierType) null);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE:
			setSizingType((SizingTypeType) null);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR:
			setSafetyFactor((DoubleBaseType) null);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED:
			setDesignSpeed((DesignSpeedType) null);
			return;
		case CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS:
			setAdditionalParameters((AdditionalParametersType) null);
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
		case CpacsPackage.LOAD_CONDITION_TYPE__IDENTIFIER:
			return identifier != null;
		case CpacsPackage.LOAD_CONDITION_TYPE__SIZING_TYPE:
			return sizingType != null;
		case CpacsPackage.LOAD_CONDITION_TYPE__SAFETY_FACTOR:
			return safetyFactor != null;
		case CpacsPackage.LOAD_CONDITION_TYPE__DESIGN_SPEED:
			return designSpeed != null;
		case CpacsPackage.LOAD_CONDITION_TYPE__ADDITIONAL_PARAMETERS:
			return additionalParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadConditionTypeImpl
