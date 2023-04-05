/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringVectorBaseType;
import Cpacs.TrackJointCoordinatesType;
import Cpacs.TrackJointPositionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Joint Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrackJointPositionTypeImpl#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.TrackJointPositionTypeImpl#getJointCoordinates <em>Joint Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackJointPositionTypeImpl extends ComplexBaseTypeImpl implements TrackJointPositionType {
	/**
	 * The cached value of the '{@link #getControlParameters() <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameters()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType controlParameters;

	/**
	 * The cached value of the '{@link #getJointCoordinates() <em>Joint Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJointCoordinates()
	 * @generated
	 * @ordered
	 */
	protected TrackJointCoordinatesType jointCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackJointPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrackJointPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getControlParameters() {
		return controlParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameters(StringVectorBaseType newControlParameters,
			NotificationChain msgs) {
		StringVectorBaseType oldControlParameters = controlParameters;
		controlParameters = newControlParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS, oldControlParameters,
					newControlParameters);
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
	public void setControlParameters(StringVectorBaseType newControlParameters) {
		if (newControlParameters != controlParameters) {
			NotificationChain msgs = null;
			if (controlParameters != null)
				msgs = ((InternalEObject) controlParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS, null,
						msgs);
			if (newControlParameters != null)
				msgs = ((InternalEObject) newControlParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS, null,
						msgs);
			msgs = basicSetControlParameters(newControlParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS, newControlParameters,
					newControlParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackJointCoordinatesType getJointCoordinates() {
		return jointCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJointCoordinates(TrackJointCoordinatesType newJointCoordinates,
			NotificationChain msgs) {
		TrackJointCoordinatesType oldJointCoordinates = jointCoordinates;
		jointCoordinates = newJointCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES, oldJointCoordinates,
					newJointCoordinates);
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
	public void setJointCoordinates(TrackJointCoordinatesType newJointCoordinates) {
		if (newJointCoordinates != jointCoordinates) {
			NotificationChain msgs = null;
			if (jointCoordinates != null)
				msgs = ((InternalEObject) jointCoordinates).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES, null, msgs);
			if (newJointCoordinates != null)
				msgs = ((InternalEObject) newJointCoordinates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES, null, msgs);
			msgs = basicSetJointCoordinates(newJointCoordinates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES, newJointCoordinates,
					newJointCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS:
			return basicSetControlParameters(null, msgs);
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES:
			return basicSetJointCoordinates(null, msgs);
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
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS:
			return getControlParameters();
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES:
			return getJointCoordinates();
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
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS:
			setControlParameters((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES:
			setJointCoordinates((TrackJointCoordinatesType) newValue);
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
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS:
			setControlParameters((StringVectorBaseType) null);
			return;
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES:
			setJointCoordinates((TrackJointCoordinatesType) null);
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
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__CONTROL_PARAMETERS:
			return controlParameters != null;
		case CpacsPackage.TRACK_JOINT_POSITION_TYPE__JOINT_COORDINATES:
			return jointCoordinates != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackJointPositionTypeImpl
