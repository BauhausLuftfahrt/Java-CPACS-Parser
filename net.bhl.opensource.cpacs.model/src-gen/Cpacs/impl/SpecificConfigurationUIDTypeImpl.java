/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SpecificConfigurationSegmentsType;
import Cpacs.SpecificConfigurationUIDType;
import Cpacs.StringUIDBaseType;
import Cpacs.UIDSequenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Configuration UID Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SpecificConfigurationUIDTypeImpl#getConfigurationUID <em>Configuration UID</em>}</li>
 *   <li>{@link Cpacs.impl.SpecificConfigurationUIDTypeImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.impl.SpecificConfigurationUIDTypeImpl#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificConfigurationUIDTypeImpl extends ComplexBaseTypeImpl implements SpecificConfigurationUIDType {
	/**
	 * The cached value of the '{@link #getConfigurationUID() <em>Configuration UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType configurationUID;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected SpecificConfigurationSegmentsType segments;

	/**
	 * The cached value of the '{@link #getPointPerformanceUIDs() <em>Point Performance UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointPerformanceUIDs()
	 * @generated
	 * @ordered
	 */
	protected UIDSequenceType pointPerformanceUIDs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificConfigurationUIDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSpecificConfigurationUIDType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getConfigurationUID() {
		return configurationUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationUID(StringUIDBaseType newConfigurationUID, NotificationChain msgs) {
		StringUIDBaseType oldConfigurationUID = configurationUID;
		configurationUID = newConfigurationUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID, oldConfigurationUID,
					newConfigurationUID);
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
	public void setConfigurationUID(StringUIDBaseType newConfigurationUID) {
		if (newConfigurationUID != configurationUID) {
			NotificationChain msgs = null;
			if (configurationUID != null)
				msgs = ((InternalEObject) configurationUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID, null,
						msgs);
			if (newConfigurationUID != null)
				msgs = ((InternalEObject) newConfigurationUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID, null,
						msgs);
			msgs = basicSetConfigurationUID(newConfigurationUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID, newConfigurationUID,
					newConfigurationUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificConfigurationSegmentsType getSegments() {
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegments(SpecificConfigurationSegmentsType newSegments, NotificationChain msgs) {
		SpecificConfigurationSegmentsType oldSegments = segments;
		segments = newSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS, oldSegments, newSegments);
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
	public void setSegments(SpecificConfigurationSegmentsType newSegments) {
		if (newSegments != segments) {
			NotificationChain msgs = null;
			if (segments != null)
				msgs = ((InternalEObject) segments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS, null, msgs);
			if (newSegments != null)
				msgs = ((InternalEObject) newSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS, null, msgs);
			msgs = basicSetSegments(newSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS, newSegments, newSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDSequenceType getPointPerformanceUIDs() {
		return pointPerformanceUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointPerformanceUIDs(UIDSequenceType newPointPerformanceUIDs,
			NotificationChain msgs) {
		UIDSequenceType oldPointPerformanceUIDs = pointPerformanceUIDs;
		pointPerformanceUIDs = newPointPerformanceUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS, oldPointPerformanceUIDs,
					newPointPerformanceUIDs);
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
	public void setPointPerformanceUIDs(UIDSequenceType newPointPerformanceUIDs) {
		if (newPointPerformanceUIDs != pointPerformanceUIDs) {
			NotificationChain msgs = null;
			if (pointPerformanceUIDs != null)
				msgs = ((InternalEObject) pointPerformanceUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS,
						null, msgs);
			if (newPointPerformanceUIDs != null)
				msgs = ((InternalEObject) newPointPerformanceUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS,
						null, msgs);
			msgs = basicSetPointPerformanceUIDs(newPointPerformanceUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS, newPointPerformanceUIDs,
					newPointPerformanceUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID:
			return basicSetConfigurationUID(null, msgs);
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS:
			return basicSetSegments(null, msgs);
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS:
			return basicSetPointPerformanceUIDs(null, msgs);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID:
			return getConfigurationUID();
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS:
			return getSegments();
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS:
			return getPointPerformanceUIDs();
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID:
			setConfigurationUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS:
			setSegments((SpecificConfigurationSegmentsType) newValue);
			return;
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((UIDSequenceType) newValue);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID:
			setConfigurationUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS:
			setSegments((SpecificConfigurationSegmentsType) null);
			return;
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((UIDSequenceType) null);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__CONFIGURATION_UID:
			return configurationUID != null;
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__SEGMENTS:
			return segments != null;
		case CpacsPackage.SPECIFIC_CONFIGURATION_UID_TYPE__POINT_PERFORMANCE_UI_DS:
			return pointPerformanceUIDs != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificConfigurationUIDTypeImpl
