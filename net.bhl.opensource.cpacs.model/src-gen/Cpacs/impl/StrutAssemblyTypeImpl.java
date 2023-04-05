/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.LandingGearStrutAttachmentType;
import Cpacs.PointAbsRelType;
import Cpacs.RelativeStrutPositionType;
import Cpacs.StringUIDBaseType;
import Cpacs.StrutAssemblyType;
import Cpacs.StrutPropertiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strut Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getStrutProperties <em>Strut Properties</em>}</li>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getMainStrutRelativePosition <em>Main Strut Relative Position</em>}</li>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getRelEndPoint <em>Rel End Point</em>}</li>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getRelStrutEndPoint <em>Rel Strut End Point</em>}</li>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.impl.StrutAssemblyTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrutAssemblyTypeImpl extends ComplexBaseTypeImpl implements StrutAssemblyType {
	/**
	 * The cached value of the '{@link #getStrutProperties() <em>Strut Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrutProperties()
	 * @generated
	 * @ordered
	 */
	protected StrutPropertiesType strutProperties;

	/**
	 * The default value of the '{@link #getMainStrutRelativePosition() <em>Main Strut Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainStrutRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected static final double MAIN_STRUT_RELATIVE_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMainStrutRelativePosition() <em>Main Strut Relative Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainStrutRelativePosition()
	 * @generated
	 * @ordered
	 */
	protected double mainStrutRelativePosition = MAIN_STRUT_RELATIVE_POSITION_EDEFAULT;

	/**
	 * This is true if the Main Strut Relative Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mainStrutRelativePositionESet;

	/**
	 * The cached value of the '{@link #getEndPoint() <em>End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPoint()
	 * @generated
	 * @ordered
	 */
	protected PointAbsRelType endPoint;

	/**
	 * The cached value of the '{@link #getRelEndPoint() <em>Rel End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelEndPoint()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType relEndPoint;

	/**
	 * The cached value of the '{@link #getRelStrutEndPoint() <em>Rel Strut End Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelStrutEndPoint()
	 * @generated
	 * @ordered
	 */
	protected RelativeStrutPositionType relStrutEndPoint;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected LandingGearStrutAttachmentType attachment;

	/**
	 * The cached value of the '{@link #getActuatorUID() <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType actuatorUID;

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
	protected StrutAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStrutAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutPropertiesType getStrutProperties() {
		return strutProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrutProperties(StrutPropertiesType newStrutProperties, NotificationChain msgs) {
		StrutPropertiesType oldStrutProperties = strutProperties;
		strutProperties = newStrutProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES, oldStrutProperties, newStrutProperties);
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
	public void setStrutProperties(StrutPropertiesType newStrutProperties) {
		if (newStrutProperties != strutProperties) {
			NotificationChain msgs = null;
			if (strutProperties != null)
				msgs = ((InternalEObject) strutProperties).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES, null, msgs);
			if (newStrutProperties != null)
				msgs = ((InternalEObject) newStrutProperties).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES, null, msgs);
			msgs = basicSetStrutProperties(newStrutProperties, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES,
					newStrutProperties, newStrutProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMainStrutRelativePosition() {
		return mainStrutRelativePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMainStrutRelativePosition(double newMainStrutRelativePosition) {
		double oldMainStrutRelativePosition = mainStrutRelativePosition;
		mainStrutRelativePosition = newMainStrutRelativePosition;
		boolean oldMainStrutRelativePositionESet = mainStrutRelativePositionESet;
		mainStrutRelativePositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__MAIN_STRUT_RELATIVE_POSITION, oldMainStrutRelativePosition,
					mainStrutRelativePosition, !oldMainStrutRelativePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMainStrutRelativePosition() {
		double oldMainStrutRelativePosition = mainStrutRelativePosition;
		boolean oldMainStrutRelativePositionESet = mainStrutRelativePositionESet;
		mainStrutRelativePosition = MAIN_STRUT_RELATIVE_POSITION_EDEFAULT;
		mainStrutRelativePositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__MAIN_STRUT_RELATIVE_POSITION, oldMainStrutRelativePosition,
					MAIN_STRUT_RELATIVE_POSITION_EDEFAULT, oldMainStrutRelativePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMainStrutRelativePosition() {
		return mainStrutRelativePositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointAbsRelType getEndPoint() {
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndPoint(PointAbsRelType newEndPoint, NotificationChain msgs) {
		PointAbsRelType oldEndPoint = endPoint;
		endPoint = newEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT, oldEndPoint, newEndPoint);
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
	public void setEndPoint(PointAbsRelType newEndPoint) {
		if (newEndPoint != endPoint) {
			NotificationChain msgs = null;
			if (endPoint != null)
				msgs = ((InternalEObject) endPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT, null, msgs);
			if (newEndPoint != null)
				msgs = ((InternalEObject) newEndPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT, null, msgs);
			msgs = basicSetEndPoint(newEndPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT,
					newEndPoint, newEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getRelEndPoint() {
		return relEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelEndPoint(EtaXsiRelHeightPointType newRelEndPoint, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldRelEndPoint = relEndPoint;
		relEndPoint = newRelEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT, oldRelEndPoint, newRelEndPoint);
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
	public void setRelEndPoint(EtaXsiRelHeightPointType newRelEndPoint) {
		if (newRelEndPoint != relEndPoint) {
			NotificationChain msgs = null;
			if (relEndPoint != null)
				msgs = ((InternalEObject) relEndPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT, null, msgs);
			if (newRelEndPoint != null)
				msgs = ((InternalEObject) newRelEndPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT, null, msgs);
			msgs = basicSetRelEndPoint(newRelEndPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT,
					newRelEndPoint, newRelEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeStrutPositionType getRelStrutEndPoint() {
		return relStrutEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelStrutEndPoint(RelativeStrutPositionType newRelStrutEndPoint,
			NotificationChain msgs) {
		RelativeStrutPositionType oldRelStrutEndPoint = relStrutEndPoint;
		relStrutEndPoint = newRelStrutEndPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT, oldRelStrutEndPoint, newRelStrutEndPoint);
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
	public void setRelStrutEndPoint(RelativeStrutPositionType newRelStrutEndPoint) {
		if (newRelStrutEndPoint != relStrutEndPoint) {
			NotificationChain msgs = null;
			if (relStrutEndPoint != null)
				msgs = ((InternalEObject) relStrutEndPoint).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT, null, msgs);
			if (newRelStrutEndPoint != null)
				msgs = ((InternalEObject) newRelStrutEndPoint).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT, null, msgs);
			msgs = basicSetRelStrutEndPoint(newRelStrutEndPoint, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT,
					newRelStrutEndPoint, newRelStrutEndPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearStrutAttachmentType getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachment(LandingGearStrutAttachmentType newAttachment, NotificationChain msgs) {
		LandingGearStrutAttachmentType oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT, oldAttachment, newAttachment);
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
	public void setAttachment(LandingGearStrutAttachmentType newAttachment) {
		if (newAttachment != attachment) {
			NotificationChain msgs = null;
			if (attachment != null)
				msgs = ((InternalEObject) attachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT, null, msgs);
			if (newAttachment != null)
				msgs = ((InternalEObject) newAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT, null, msgs);
			msgs = basicSetAttachment(newAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT,
					newAttachment, newAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getActuatorUID() {
		return actuatorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuatorUID(StringUIDBaseType newActuatorUID, NotificationChain msgs) {
		StringUIDBaseType oldActuatorUID = actuatorUID;
		actuatorUID = newActuatorUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID, oldActuatorUID, newActuatorUID);
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
	public void setActuatorUID(StringUIDBaseType newActuatorUID) {
		if (newActuatorUID != actuatorUID) {
			NotificationChain msgs = null;
			if (actuatorUID != null)
				msgs = ((InternalEObject) actuatorUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID, null, msgs);
			if (newActuatorUID != null)
				msgs = ((InternalEObject) newActuatorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID, null, msgs);
			msgs = basicSetActuatorUID(newActuatorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID,
					newActuatorUID, newActuatorUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STRUT_ASSEMBLY_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES:
			return basicSetStrutProperties(null, msgs);
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT:
			return basicSetEndPoint(null, msgs);
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT:
			return basicSetRelEndPoint(null, msgs);
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT:
			return basicSetRelStrutEndPoint(null, msgs);
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT:
			return basicSetAttachment(null, msgs);
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID:
			return basicSetActuatorUID(null, msgs);
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
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES:
			return getStrutProperties();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__MAIN_STRUT_RELATIVE_POSITION:
			return getMainStrutRelativePosition();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT:
			return getEndPoint();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT:
			return getRelEndPoint();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT:
			return getRelStrutEndPoint();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT:
			return getAttachment();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID:
			return getActuatorUID();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__UID:
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
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES:
			setStrutProperties((StrutPropertiesType) newValue);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__MAIN_STRUT_RELATIVE_POSITION:
			setMainStrutRelativePosition((Double) newValue);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT:
			setEndPoint((PointAbsRelType) newValue);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT:
			setRelEndPoint((EtaXsiRelHeightPointType) newValue);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT:
			setRelStrutEndPoint((RelativeStrutPositionType) newValue);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT:
			setAttachment((LandingGearStrutAttachmentType) newValue);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__UID:
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
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES:
			setStrutProperties((StrutPropertiesType) null);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__MAIN_STRUT_RELATIVE_POSITION:
			unsetMainStrutRelativePosition();
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT:
			setEndPoint((PointAbsRelType) null);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT:
			setRelEndPoint((EtaXsiRelHeightPointType) null);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT:
			setRelStrutEndPoint((RelativeStrutPositionType) null);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT:
			setAttachment((LandingGearStrutAttachmentType) null);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID:
			setActuatorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__UID:
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
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__STRUT_PROPERTIES:
			return strutProperties != null;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__MAIN_STRUT_RELATIVE_POSITION:
			return isSetMainStrutRelativePosition();
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__END_POINT:
			return endPoint != null;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_END_POINT:
			return relEndPoint != null;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__REL_STRUT_END_POINT:
			return relStrutEndPoint != null;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ATTACHMENT:
			return attachment != null;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__ACTUATOR_UID:
			return actuatorUID != null;
		case CpacsPackage.STRUT_ASSEMBLY_TYPE__UID:
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
		result.append(" (mainStrutRelativePosition: ");
		if (mainStrutRelativePositionESet)
			result.append(mainStrutRelativePosition);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //StrutAssemblyTypeImpl
