/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SpecificPerformanceMapType;
import Cpacs.StringUIDBaseType;
import Cpacs.UIDSequenceType;

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
 *   <li>{@link Cpacs.impl.SpecificPerformanceMapTypeImpl#getPointPerformanceUIDs1 <em>Point Performance UI Ds1</em>}</li>
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
	protected UIDSequenceType segmentUIDs;

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
	 * The cached value of the '{@link #getPointPerformanceUIDs1() <em>Point Performance UI Ds1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointPerformanceUIDs1()
	 * @generated
	 * @ordered
	 */
	protected UIDSequenceType pointPerformanceUIDs1;

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
	public UIDSequenceType getSegmentUIDs() {
		return segmentUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUIDs(UIDSequenceType newSegmentUIDs, NotificationChain msgs) {
		UIDSequenceType oldSegmentUIDs = segmentUIDs;
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
	public void setSegmentUIDs(UIDSequenceType newSegmentUIDs) {
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
	public void setPointPerformanceUIDs(UIDSequenceType newPointPerformanceUIDs) {
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
	public UIDSequenceType getPointPerformanceUIDs1() {
		return pointPerformanceUIDs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointPerformanceUIDs1(UIDSequenceType newPointPerformanceUIDs1,
			NotificationChain msgs) {
		UIDSequenceType oldPointPerformanceUIDs1 = pointPerformanceUIDs1;
		pointPerformanceUIDs1 = newPointPerformanceUIDs1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1, oldPointPerformanceUIDs1,
					newPointPerformanceUIDs1);
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
	public void setPointPerformanceUIDs1(UIDSequenceType newPointPerformanceUIDs1) {
		if (newPointPerformanceUIDs1 != pointPerformanceUIDs1) {
			NotificationChain msgs = null;
			if (pointPerformanceUIDs1 != null)
				msgs = ((InternalEObject) pointPerformanceUIDs1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1,
						null, msgs);
			if (newPointPerformanceUIDs1 != null)
				msgs = ((InternalEObject) newPointPerformanceUIDs1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1,
						null, msgs);
			msgs = basicSetPointPerformanceUIDs1(newPointPerformanceUIDs1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1, newPointPerformanceUIDs1,
					newPointPerformanceUIDs1));
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1:
			return basicSetPointPerformanceUIDs1(null, msgs);
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1:
			return getPointPerformanceUIDs1();
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
			setSegmentUIDs((UIDSequenceType) newValue);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((UIDSequenceType) newValue);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1:
			setPointPerformanceUIDs1((UIDSequenceType) newValue);
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
			setSegmentUIDs((UIDSequenceType) null);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS:
			setPointPerformanceUIDs((UIDSequenceType) null);
			return;
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1:
			setPointPerformanceUIDs1((UIDSequenceType) null);
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAP_TYPE__POINT_PERFORMANCE_UI_DS1:
			return pointPerformanceUIDs1 != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificPerformanceMapTypeImpl
