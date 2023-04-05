/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PosIntVectorBaseType;
import Cpacs.SpecificConfigurationSegmentType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Configuration Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SpecificConfigurationSegmentTypeImpl#getUID <em>UID</em>}</li>
 *   <li>{@link Cpacs.impl.SpecificConfigurationSegmentTypeImpl#getIndexIDs <em>Index IDs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificConfigurationSegmentTypeImpl extends ComplexBaseTypeImpl
		implements SpecificConfigurationSegmentType {
	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType uID;

	/**
	 * The cached value of the '{@link #getIndexIDs() <em>Index IDs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexIDs()
	 * @generated
	 * @ordered
	 */
	protected PosIntVectorBaseType indexIDs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificConfigurationSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSpecificConfigurationSegmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUID(StringUIDBaseType newUID, NotificationChain msgs) {
		StringUIDBaseType oldUID = uID;
		uID = newUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID, oldUID, newUID);
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
	public void setUID(StringUIDBaseType newUID) {
		if (newUID != uID) {
			NotificationChain msgs = null;
			if (uID != null)
				msgs = ((InternalEObject) uID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID, null, msgs);
			if (newUID != null)
				msgs = ((InternalEObject) newUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID, null, msgs);
			msgs = basicSetUID(newUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID,
					newUID, newUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PosIntVectorBaseType getIndexIDs() {
		return indexIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexIDs(PosIntVectorBaseType newIndexIDs, NotificationChain msgs) {
		PosIntVectorBaseType oldIndexIDs = indexIDs;
		indexIDs = newIndexIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS, oldIndexIDs, newIndexIDs);
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
	public void setIndexIDs(PosIntVectorBaseType newIndexIDs) {
		if (newIndexIDs != indexIDs) {
			NotificationChain msgs = null;
			if (indexIDs != null)
				msgs = ((InternalEObject) indexIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS, null,
						msgs);
			if (newIndexIDs != null)
				msgs = ((InternalEObject) newIndexIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS, null,
						msgs);
			msgs = basicSetIndexIDs(newIndexIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS, newIndexIDs, newIndexIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID:
			return basicSetUID(null, msgs);
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS:
			return basicSetIndexIDs(null, msgs);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID:
			return getUID();
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS:
			return getIndexIDs();
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID:
			setUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS:
			setIndexIDs((PosIntVectorBaseType) newValue);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID:
			setUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS:
			setIndexIDs((PosIntVectorBaseType) null);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__UID:
			return uID != null;
		case CpacsPackage.SPECIFIC_CONFIGURATION_SEGMENT_TYPE__INDEX_IDS:
			return indexIDs != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificConfigurationSegmentTypeImpl
