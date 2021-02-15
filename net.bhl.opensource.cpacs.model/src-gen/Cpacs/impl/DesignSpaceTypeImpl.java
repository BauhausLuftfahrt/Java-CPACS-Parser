/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DesignParametersType;
import Cpacs.DesignSpaceType;
import Cpacs.StateParametersType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Space Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DesignSpaceTypeImpl#getDesignParameters <em>Design Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.DesignSpaceTypeImpl#getStateParameters <em>State Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.DesignSpaceTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link Cpacs.impl.DesignSpaceTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesignSpaceTypeImpl extends ComplexBaseTypeImpl implements DesignSpaceType {
	/**
	 * The cached value of the '{@link #getDesignParameters() <em>Design Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignParameters()
	 * @generated
	 * @ordered
	 */
	protected DesignParametersType designParameters;

	/**
	 * The cached value of the '{@link #getStateParameters() <em>State Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateParameters()
	 * @generated
	 * @ordered
	 */
	protected StateParametersType stateParameters;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType status;

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
	protected DesignSpaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDesignSpaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DesignParametersType getDesignParameters() {
		return designParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDesignParameters(DesignParametersType newDesignParameters,
			NotificationChain msgs) {
		DesignParametersType oldDesignParameters = designParameters;
		designParameters = newDesignParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS, oldDesignParameters, newDesignParameters);
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
	public void setDesignParameters(DesignParametersType newDesignParameters) {
		if (newDesignParameters != designParameters) {
			NotificationChain msgs = null;
			if (designParameters != null)
				msgs = ((InternalEObject) designParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS, null, msgs);
			if (newDesignParameters != null)
				msgs = ((InternalEObject) newDesignParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS, null, msgs);
			msgs = basicSetDesignParameters(newDesignParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS,
					newDesignParameters, newDesignParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateParametersType getStateParameters() {
		return stateParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateParameters(StateParametersType newStateParameters, NotificationChain msgs) {
		StateParametersType oldStateParameters = stateParameters;
		stateParameters = newStateParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS, oldStateParameters, newStateParameters);
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
	public void setStateParameters(StateParametersType newStateParameters) {
		if (newStateParameters != stateParameters) {
			NotificationChain msgs = null;
			if (stateParameters != null)
				msgs = ((InternalEObject) stateParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS, null, msgs);
			if (newStateParameters != null)
				msgs = ((InternalEObject) newStateParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS, null, msgs);
			msgs = basicSetStateParameters(newStateParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS,
					newStateParameters, newStateParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(StringVectorBaseType newStatus, NotificationChain msgs) {
		StringVectorBaseType oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DESIGN_SPACE_TYPE__STATUS, oldStatus, newStatus);
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
	public void setStatus(StringVectorBaseType newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject) status).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_SPACE_TYPE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject) newStatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DESIGN_SPACE_TYPE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_SPACE_TYPE__STATUS, newStatus,
					newStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DESIGN_SPACE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS:
			return basicSetDesignParameters(null, msgs);
		case CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS:
			return basicSetStateParameters(null, msgs);
		case CpacsPackage.DESIGN_SPACE_TYPE__STATUS:
			return basicSetStatus(null, msgs);
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
		case CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS:
			return getDesignParameters();
		case CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS:
			return getStateParameters();
		case CpacsPackage.DESIGN_SPACE_TYPE__STATUS:
			return getStatus();
		case CpacsPackage.DESIGN_SPACE_TYPE__UID:
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
		case CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS:
			setDesignParameters((DesignParametersType) newValue);
			return;
		case CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS:
			setStateParameters((StateParametersType) newValue);
			return;
		case CpacsPackage.DESIGN_SPACE_TYPE__STATUS:
			setStatus((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.DESIGN_SPACE_TYPE__UID:
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
		case CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS:
			setDesignParameters((DesignParametersType) null);
			return;
		case CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS:
			setStateParameters((StateParametersType) null);
			return;
		case CpacsPackage.DESIGN_SPACE_TYPE__STATUS:
			setStatus((StringVectorBaseType) null);
			return;
		case CpacsPackage.DESIGN_SPACE_TYPE__UID:
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
		case CpacsPackage.DESIGN_SPACE_TYPE__DESIGN_PARAMETERS:
			return designParameters != null;
		case CpacsPackage.DESIGN_SPACE_TYPE__STATE_PARAMETERS:
			return stateParameters != null;
		case CpacsPackage.DESIGN_SPACE_TYPE__STATUS:
			return status != null;
		case CpacsPackage.DESIGN_SPACE_TYPE__UID:
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

} //DesignSpaceTypeImpl
