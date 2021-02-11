/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SpecificPerformanceMapType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Performance Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SpecificPerformanceMapTypeImpl#getPerformanceMapUID <em>Performance Map UID</em>}</li>
 *   <li>{@link Cpacs.impl.SpecificPerformanceMapTypeImpl#getSegmentUIDs <em>Segment UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.SpecificPerformanceMapTypeImpl#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.SpecificPerformanceMapTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificPerformanceMapTypeImpl extends ComplexBaseTypeImpl implements SpecificPerformanceMapType {
	/**
	 * The cached value of the '{@link #getPerformanceMapUID() <em>Performance Map UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMapUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType performanceMapUID;

	/**
	 * The cached value of the '{@link #getSegmentUIDs() <em>Segment UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUIDs()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType segmentUIDs;

	/**
	 * The cached value of the '{@link #getPointPerformanceUIDs() <em>Point Performance UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointPerformanceUIDs()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType pointPerformanceUIDs;

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
	protected SpecificPerformanceMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSpecificPerformanceMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPerformanceMapUID() {
		return performanceMapUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceMapUID(StringUIDBaseType newPerformanceMapUID, NotificationChain msgs) {
		StringUIDBaseType oldPerformanceMapUID = performanceMapUID;
		performanceMapUID = newPerformanceMapUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID, oldPerformanceMapUID,
					newPerformanceMapUID);
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
	public void setPerformanceMapUID(StringUIDBaseType newPerformanceMapUID) {
		if (newPerformanceMapUID != performanceMapUID) {
			NotificationChain msgs = null;
			if (performanceMapUID != null)
				msgs = ((InternalEObject) performanceMapUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID, null,
						msgs);
			if (newPerformanceMapUID != null)
				msgs = ((InternalEObject) newPerformanceMapUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID, null,
						msgs);
			msgs = basicSetPerformanceMapUID(newPerformanceMapUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID, newPerformanceMapUID,
					newPerformanceMapUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getSegmentUIDs() {
		return segmentUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUIDs(StringVectorBaseType newSegmentUIDs, NotificationChain msgs) {
		StringVectorBaseType oldSegmentUIDs = segmentUIDs;
		segmentUIDs = newSegmentUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS, oldSegmentUIDs, newSegmentUIDs);
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
	public void setSegmentUIDs(StringVectorBaseType newSegmentUIDs) {
		if (newSegmentUIDs != segmentUIDs) {
			NotificationChain msgs = null;
			if (segmentUIDs != null)
				msgs = ((InternalEObject) segmentUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS, null, msgs);
			if (newSegmentUIDs != null)
				msgs = ((InternalEObject) newSegmentUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS, null, msgs);
			msgs = basicSetSegmentUIDs(newSegmentUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS, newSegmentUIDs, newSegmentUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getPointPerformanceUIDs() {
		return pointPerformanceUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointPerformanceUIDs(StringVectorBaseType newPointPerformanceUIDs,
			NotificationChain msgs) {
		StringVectorBaseType oldPointPerformanceUIDs = pointPerformanceUIDs;
		pointPerformanceUIDs = newPointPerformanceUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS, oldPointPerformanceUIDs,
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
	public void setPointPerformanceUIDs(StringVectorBaseType newPointPerformanceUIDs) {
		if (newPointPerformanceUIDs != pointPerformanceUIDs) {
			NotificationChain msgs = null;
			if (pointPerformanceUIDs != null)
				msgs = ((InternalEObject) pointPerformanceUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS,
						null, msgs);
			if (newPointPerformanceUIDs != null)
				msgs = ((InternalEObject) newPointPerformanceUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS,
						null, msgs);
			msgs = basicSetPointPerformanceUIDs(newPointPerformanceUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS, newPointPerformanceUIDs,
					newPointPerformanceUIDs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID:
			return basicSetPerformanceMapUID(null, msgs);
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS:
			return basicSetSegmentUIDs(null, msgs);
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS:
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID:
			return getPerformanceMapUID();
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS:
			return getSegmentUIDs();
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS:
			return getPointPerformanceUIDs();
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__UID:
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID:
			setPerformanceMapUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS:
			setSegmentUIDs((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__UID:
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID:
			setPerformanceMapUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS:
			setSegmentUIDs((StringVectorBaseType) null);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((StringVectorBaseType) null);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__UID:
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__PERFORMANCE_MAP_UID:
			return performanceMapUID != null;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__SEGMENT_UI_DS:
			return segmentUIDs != null;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS:
			return pointPerformanceUIDs != null;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__UID:
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

} //SpecificPerformanceMapTypeImpl
