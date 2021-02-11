/**
 */
package Cpacs.impl;

import Cpacs.ConstraintSettingsPointPerformanceType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PointPerformanceType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TypeOfPointPerformanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Performance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PointPerformanceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceTypeImpl#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceTypeImpl#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceTypeImpl#getTypeOfPointPerformance <em>Type Of Point Performance</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceTypeImpl#getConstraintSettings <em>Constraint Settings</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointPerformanceTypeImpl extends ComplexBaseTypeImpl implements PointPerformanceType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getSegmentUID() <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType segmentUID;

	/**
	 * The cached value of the '{@link #getMassFraction() <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassFraction()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType massFraction;

	/**
	 * The cached value of the '{@link #getTypeOfPointPerformance() <em>Type Of Point Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfPointPerformance()
	 * @generated
	 * @ordered
	 */
	protected TypeOfPointPerformanceType typeOfPointPerformance;

	/**
	 * The cached value of the '{@link #getConstraintSettings() <em>Constraint Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSettings()
	 * @generated
	 * @ordered
	 */
	protected ConstraintSettingsPointPerformanceType constraintSettings;

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
	protected PointPerformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPointPerformanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_PERFORMANCE_TYPE__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSegmentUID() {
		return segmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUID(StringUIDBaseType newSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldSegmentUID = segmentUID;
		segmentUID = newSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID, oldSegmentUID, newSegmentUID);
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
	public void setSegmentUID(StringUIDBaseType newSegmentUID) {
		if (newSegmentUID != segmentUID) {
			NotificationChain msgs = null;
			if (segmentUID != null)
				msgs = ((InternalEObject) segmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID, null, msgs);
			if (newSegmentUID != null)
				msgs = ((InternalEObject) newSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID, null, msgs);
			msgs = basicSetSegmentUID(newSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID,
					newSegmentUID, newSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMassFraction() {
		return massFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassFraction(DoubleBaseType newMassFraction, NotificationChain msgs) {
		DoubleBaseType oldMassFraction = massFraction;
		massFraction = newMassFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION, oldMassFraction, newMassFraction);
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
	public void setMassFraction(DoubleBaseType newMassFraction) {
		if (newMassFraction != massFraction) {
			NotificationChain msgs = null;
			if (massFraction != null)
				msgs = ((InternalEObject) massFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION, null, msgs);
			if (newMassFraction != null)
				msgs = ((InternalEObject) newMassFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION, null, msgs);
			msgs = basicSetMassFraction(newMassFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION,
					newMassFraction, newMassFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOfPointPerformanceType getTypeOfPointPerformance() {
		return typeOfPointPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOfPointPerformance(TypeOfPointPerformanceType newTypeOfPointPerformance,
			NotificationChain msgs) {
		TypeOfPointPerformanceType oldTypeOfPointPerformance = typeOfPointPerformance;
		typeOfPointPerformance = newTypeOfPointPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE, oldTypeOfPointPerformance,
					newTypeOfPointPerformance);
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
	public void setTypeOfPointPerformance(TypeOfPointPerformanceType newTypeOfPointPerformance) {
		if (newTypeOfPointPerformance != typeOfPointPerformance) {
			NotificationChain msgs = null;
			if (typeOfPointPerformance != null)
				msgs = ((InternalEObject) typeOfPointPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE, null,
						msgs);
			if (newTypeOfPointPerformance != null)
				msgs = ((InternalEObject) newTypeOfPointPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE, null,
						msgs);
			msgs = basicSetTypeOfPointPerformance(newTypeOfPointPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE, newTypeOfPointPerformance,
					newTypeOfPointPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintSettingsPointPerformanceType getConstraintSettings() {
		return constraintSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintSettings(ConstraintSettingsPointPerformanceType newConstraintSettings,
			NotificationChain msgs) {
		ConstraintSettingsPointPerformanceType oldConstraintSettings = constraintSettings;
		constraintSettings = newConstraintSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS, oldConstraintSettings,
					newConstraintSettings);
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
	public void setConstraintSettings(ConstraintSettingsPointPerformanceType newConstraintSettings) {
		if (newConstraintSettings != constraintSettings) {
			NotificationChain msgs = null;
			if (constraintSettings != null)
				msgs = ((InternalEObject) constraintSettings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS, null, msgs);
			if (newConstraintSettings != null)
				msgs = ((InternalEObject) newConstraintSettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS, null, msgs);
			msgs = basicSetConstraintSettings(newConstraintSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS, newConstraintSettings,
					newConstraintSettings));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_PERFORMANCE_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POINT_PERFORMANCE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID:
			return basicSetSegmentUID(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION:
			return basicSetMassFraction(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE:
			return basicSetTypeOfPointPerformance(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS:
			return basicSetConstraintSettings(null, msgs);
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
		case CpacsPackage.POINT_PERFORMANCE_TYPE__NAME:
			return getName();
		case CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID:
			return getSegmentUID();
		case CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION:
			return getMassFraction();
		case CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE:
			return getTypeOfPointPerformance();
		case CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS:
			return getConstraintSettings();
		case CpacsPackage.POINT_PERFORMANCE_TYPE__UID:
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
		case CpacsPackage.POINT_PERFORMANCE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION:
			setMassFraction((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE:
			setTypeOfPointPerformance((TypeOfPointPerformanceType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS:
			setConstraintSettings((ConstraintSettingsPointPerformanceType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__UID:
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
		case CpacsPackage.POINT_PERFORMANCE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION:
			setMassFraction((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE:
			setTypeOfPointPerformance((TypeOfPointPerformanceType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS:
			setConstraintSettings((ConstraintSettingsPointPerformanceType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__UID:
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
		case CpacsPackage.POINT_PERFORMANCE_TYPE__NAME:
			return name != null;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__SEGMENT_UID:
			return segmentUID != null;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__MASS_FRACTION:
			return massFraction != null;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__TYPE_OF_POINT_PERFORMANCE:
			return typeOfPointPerformance != null;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__CONSTRAINT_SETTINGS:
			return constraintSettings != null;
		case CpacsPackage.POINT_PERFORMANCE_TYPE__UID:
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

} //PointPerformanceTypeImpl
