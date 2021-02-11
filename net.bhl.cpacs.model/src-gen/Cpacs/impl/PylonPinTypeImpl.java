/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointXYZType;
import Cpacs.PointYZType;
import Cpacs.PylonPinType;
import Cpacs.StringUIDBaseType;
import Cpacs.StrutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Pin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonPinTypeImpl#getFirstAttachmentUID <em>First Attachment UID</em>}</li>
 *   <li>{@link Cpacs.impl.PylonPinTypeImpl#getSecondAttachmentUID <em>Second Attachment UID</em>}</li>
 *   <li>{@link Cpacs.impl.PylonPinTypeImpl#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link Cpacs.impl.PylonPinTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.impl.PylonPinTypeImpl#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.impl.PylonPinTypeImpl#getBolt <em>Bolt</em>}</li>
 *   <li>{@link Cpacs.impl.PylonPinTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonPinTypeImpl extends ComplexBaseTypeImpl implements PylonPinType {
	/**
	 * The cached value of the '{@link #getFirstAttachmentUID() <em>First Attachment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstAttachmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType firstAttachmentUID;

	/**
	 * The cached value of the '{@link #getSecondAttachmentUID() <em>Second Attachment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondAttachmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType secondAttachmentUID;

	/**
	 * The cached value of the '{@link #getRelPosition() <em>Rel Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelPosition()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType relPosition;

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
	protected PylonPinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonPinType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFirstAttachmentUID() {
		return firstAttachmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstAttachmentUID(StringUIDBaseType newFirstAttachmentUID,
			NotificationChain msgs) {
		StringUIDBaseType oldFirstAttachmentUID = firstAttachmentUID;
		firstAttachmentUID = newFirstAttachmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID, oldFirstAttachmentUID, newFirstAttachmentUID);
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
	public void setFirstAttachmentUID(StringUIDBaseType newFirstAttachmentUID) {
		if (newFirstAttachmentUID != firstAttachmentUID) {
			NotificationChain msgs = null;
			if (firstAttachmentUID != null)
				msgs = ((InternalEObject) firstAttachmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID, null, msgs);
			if (newFirstAttachmentUID != null)
				msgs = ((InternalEObject) newFirstAttachmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID, null, msgs);
			msgs = basicSetFirstAttachmentUID(newFirstAttachmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID,
					newFirstAttachmentUID, newFirstAttachmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSecondAttachmentUID() {
		return secondAttachmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondAttachmentUID(StringUIDBaseType newSecondAttachmentUID,
			NotificationChain msgs) {
		StringUIDBaseType oldSecondAttachmentUID = secondAttachmentUID;
		secondAttachmentUID = newSecondAttachmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID, oldSecondAttachmentUID, newSecondAttachmentUID);
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
	public void setSecondAttachmentUID(StringUIDBaseType newSecondAttachmentUID) {
		if (newSecondAttachmentUID != secondAttachmentUID) {
			NotificationChain msgs = null;
			if (secondAttachmentUID != null)
				msgs = ((InternalEObject) secondAttachmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID, null, msgs);
			if (newSecondAttachmentUID != null)
				msgs = ((InternalEObject) newSecondAttachmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID, null, msgs);
			msgs = basicSetSecondAttachmentUID(newSecondAttachmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID,
					newSecondAttachmentUID, newSecondAttachmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getRelPosition() {
		return relPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelPosition(PointXYZType newRelPosition, NotificationChain msgs) {
		PointXYZType oldRelPosition = relPosition;
		relPosition = newRelPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_PIN_TYPE__REL_POSITION, oldRelPosition, newRelPosition);
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
	public void setRelPosition(PointXYZType newRelPosition) {
		if (newRelPosition != relPosition) {
			NotificationChain msgs = null;
			if (relPosition != null)
				msgs = ((InternalEObject) relPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__REL_POSITION, null, msgs);
			if (newRelPosition != null)
				msgs = ((InternalEObject) newRelPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__REL_POSITION, null, msgs);
			msgs = basicSetRelPosition(newRelPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_PIN_TYPE__REL_POSITION,
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
					CpacsPackage.PYLON_PIN_TYPE__ORIENTATION, oldOrientation, newOrientation);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject) newOrientation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_PIN_TYPE__ORIENTATION,
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
					CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF, oldBlockedDOF, newBlockedDOF);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF, null, msgs);
			if (newBlockedDOF != null)
				msgs = ((InternalEObject) newBlockedDOF).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF, null, msgs);
			msgs = basicSetBlockedDOF(newBlockedDOF, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF,
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
					CpacsPackage.PYLON_PIN_TYPE__BOLT, oldBolt, newBolt);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__BOLT, null, msgs);
			if (newBolt != null)
				msgs = ((InternalEObject) newBolt).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_PIN_TYPE__BOLT, null, msgs);
			msgs = basicSetBolt(newBolt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_PIN_TYPE__BOLT, newBolt, newBolt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_PIN_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID:
			return basicSetFirstAttachmentUID(null, msgs);
		case CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID:
			return basicSetSecondAttachmentUID(null, msgs);
		case CpacsPackage.PYLON_PIN_TYPE__REL_POSITION:
			return basicSetRelPosition(null, msgs);
		case CpacsPackage.PYLON_PIN_TYPE__ORIENTATION:
			return basicSetOrientation(null, msgs);
		case CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF:
			return basicSetBlockedDOF(null, msgs);
		case CpacsPackage.PYLON_PIN_TYPE__BOLT:
			return basicSetBolt(null, msgs);
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
		case CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID:
			return getFirstAttachmentUID();
		case CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID:
			return getSecondAttachmentUID();
		case CpacsPackage.PYLON_PIN_TYPE__REL_POSITION:
			return getRelPosition();
		case CpacsPackage.PYLON_PIN_TYPE__ORIENTATION:
			return getOrientation();
		case CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF:
			return getBlockedDOF();
		case CpacsPackage.PYLON_PIN_TYPE__BOLT:
			return getBolt();
		case CpacsPackage.PYLON_PIN_TYPE__UID:
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
		case CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID:
			setFirstAttachmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID:
			setSecondAttachmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__REL_POSITION:
			setRelPosition((PointXYZType) newValue);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__ORIENTATION:
			setOrientation((PointYZType) newValue);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF:
			setBlockedDOF((PointXYZType) newValue);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__BOLT:
			setBolt((StrutType) newValue);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__UID:
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
		case CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID:
			setFirstAttachmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID:
			setSecondAttachmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__REL_POSITION:
			setRelPosition((PointXYZType) null);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__ORIENTATION:
			setOrientation((PointYZType) null);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF:
			setBlockedDOF((PointXYZType) null);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__BOLT:
			setBolt((StrutType) null);
			return;
		case CpacsPackage.PYLON_PIN_TYPE__UID:
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
		case CpacsPackage.PYLON_PIN_TYPE__FIRST_ATTACHMENT_UID:
			return firstAttachmentUID != null;
		case CpacsPackage.PYLON_PIN_TYPE__SECOND_ATTACHMENT_UID:
			return secondAttachmentUID != null;
		case CpacsPackage.PYLON_PIN_TYPE__REL_POSITION:
			return relPosition != null;
		case CpacsPackage.PYLON_PIN_TYPE__ORIENTATION:
			return orientation != null;
		case CpacsPackage.PYLON_PIN_TYPE__BLOCKED_DOF:
			return blockedDOF != null;
		case CpacsPackage.PYLON_PIN_TYPE__BOLT:
			return bolt != null;
		case CpacsPackage.PYLON_PIN_TYPE__UID:
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

} //PylonPinTypeImpl
