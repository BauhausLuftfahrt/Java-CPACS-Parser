/**
 */
package Cpacs.impl;

import Cpacs.AttachmentPinType;
import Cpacs.CpacsPackage;
import Cpacs.EtaXsiRelHeightPointType;
import Cpacs.MaterialDefinitionType;
import Cpacs.PointXYZType;
import Cpacs.PointYZType;
import Cpacs.StrutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Pin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AttachmentPinTypeImpl#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link Cpacs.impl.AttachmentPinTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.impl.AttachmentPinTypeImpl#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.impl.AttachmentPinTypeImpl#getBolt <em>Bolt</em>}</li>
 *   <li>{@link Cpacs.impl.AttachmentPinTypeImpl#getAttachmentStructure <em>Attachment Structure</em>}</li>
 *   <li>{@link Cpacs.impl.AttachmentPinTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentPinTypeImpl extends ComplexBaseTypeImpl implements AttachmentPinType {
	/**
	 * The cached value of the '{@link #getRelPosition() <em>Rel Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelPosition()
	 * @generated
	 * @ordered
	 */
	protected EtaXsiRelHeightPointType relPosition;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected PointYZType orientation;

	/**
	 * The cached value of the '{@link #getBlockedDOF() <em>Blocked DOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockedDOF()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType blockedDOF;

	/**
	 * The cached value of the '{@link #getBolt() <em>Bolt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBolt()
	 * @generated
	 * @ordered
	 */
	protected StrutType bolt;

	/**
	 * The cached value of the '{@link #getAttachmentStructure() <em>Attachment Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentStructure()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType attachmentStructure;

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
	protected AttachmentPinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAttachmentPinType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EtaXsiRelHeightPointType getRelPosition() {
		return relPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelPosition(EtaXsiRelHeightPointType newRelPosition, NotificationChain msgs) {
		EtaXsiRelHeightPointType oldRelPosition = relPosition;
		relPosition = newRelPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION, oldRelPosition, newRelPosition);
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
	public void setRelPosition(EtaXsiRelHeightPointType newRelPosition) {
		if (newRelPosition != relPosition) {
			NotificationChain msgs = null;
			if (relPosition != null)
				msgs = ((InternalEObject) relPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION, null, msgs);
			if (newRelPosition != null)
				msgs = ((InternalEObject) newRelPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION, null, msgs);
			msgs = basicSetRelPosition(newRelPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION,
					newRelPosition, newRelPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointYZType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(PointYZType newOrientation, NotificationChain msgs) {
		PointYZType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION, oldOrientation, newOrientation);
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
	public void setOrientation(PointYZType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject) orientation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject) newOrientation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION,
					newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getBlockedDOF() {
		return blockedDOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockedDOF(PointXYZType newBlockedDOF, NotificationChain msgs) {
		PointXYZType oldBlockedDOF = blockedDOF;
		blockedDOF = newBlockedDOF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF, oldBlockedDOF, newBlockedDOF);
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
	public void setBlockedDOF(PointXYZType newBlockedDOF) {
		if (newBlockedDOF != blockedDOF) {
			NotificationChain msgs = null;
			if (blockedDOF != null)
				msgs = ((InternalEObject) blockedDOF).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF, null, msgs);
			if (newBlockedDOF != null)
				msgs = ((InternalEObject) newBlockedDOF).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF, null, msgs);
			msgs = basicSetBlockedDOF(newBlockedDOF, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF,
					newBlockedDOF, newBlockedDOF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutType getBolt() {
		return bolt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBolt(StrutType newBolt, NotificationChain msgs) {
		StrutType oldBolt = bolt;
		bolt = newBolt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT, oldBolt, newBolt);
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
	public void setBolt(StrutType newBolt) {
		if (newBolt != bolt) {
			NotificationChain msgs = null;
			if (bolt != null)
				msgs = ((InternalEObject) bolt).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT, null, msgs);
			if (newBolt != null)
				msgs = ((InternalEObject) newBolt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT, null, msgs);
			msgs = basicSetBolt(newBolt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT, newBolt,
					newBolt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getAttachmentStructure() {
		return attachmentStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachmentStructure(MaterialDefinitionType newAttachmentStructure,
			NotificationChain msgs) {
		MaterialDefinitionType oldAttachmentStructure = attachmentStructure;
		attachmentStructure = newAttachmentStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE, oldAttachmentStructure,
					newAttachmentStructure);
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
	public void setAttachmentStructure(MaterialDefinitionType newAttachmentStructure) {
		if (newAttachmentStructure != attachmentStructure) {
			NotificationChain msgs = null;
			if (attachmentStructure != null)
				msgs = ((InternalEObject) attachmentStructure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE, null, msgs);
			if (newAttachmentStructure != null)
				msgs = ((InternalEObject) newAttachmentStructure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE, null, msgs);
			msgs = basicSetAttachmentStructure(newAttachmentStructure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE, newAttachmentStructure,
					newAttachmentStructure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ATTACHMENT_PIN_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION:
			return basicSetRelPosition(null, msgs);
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION:
			return basicSetOrientation(null, msgs);
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF:
			return basicSetBlockedDOF(null, msgs);
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT:
			return basicSetBolt(null, msgs);
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE:
			return basicSetAttachmentStructure(null, msgs);
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
		case CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION:
			return getRelPosition();
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION:
			return getOrientation();
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF:
			return getBlockedDOF();
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT:
			return getBolt();
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE:
			return getAttachmentStructure();
		case CpacsPackage.ATTACHMENT_PIN_TYPE__UID:
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
		case CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION:
			setRelPosition((EtaXsiRelHeightPointType) newValue);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION:
			setOrientation((PointYZType) newValue);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF:
			setBlockedDOF((PointXYZType) newValue);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT:
			setBolt((StrutType) newValue);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE:
			setAttachmentStructure((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__UID:
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
		case CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION:
			setRelPosition((EtaXsiRelHeightPointType) null);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION:
			setOrientation((PointYZType) null);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF:
			setBlockedDOF((PointXYZType) null);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT:
			setBolt((StrutType) null);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE:
			setAttachmentStructure((MaterialDefinitionType) null);
			return;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__UID:
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
		case CpacsPackage.ATTACHMENT_PIN_TYPE__REL_POSITION:
			return relPosition != null;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ORIENTATION:
			return orientation != null;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BLOCKED_DOF:
			return blockedDOF != null;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__BOLT:
			return bolt != null;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__ATTACHMENT_STRUCTURE:
			return attachmentStructure != null;
		case CpacsPackage.ATTACHMENT_PIN_TYPE__UID:
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

} //AttachmentPinTypeImpl
