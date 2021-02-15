/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonAttachmentsType;
import Cpacs.PylonBoxType;
import Cpacs.PylonPinsType;
import Cpacs.PylonShacklesType;
import Cpacs.PylonShellType;
import Cpacs.PylonStructureType;
import Cpacs.PylonStrutsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonStructureTypeImpl#getPylonBox <em>Pylon Box</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStructureTypeImpl#getFrontPyramid <em>Front Pyramid</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStructureTypeImpl#getStruts <em>Struts</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStructureTypeImpl#getPins <em>Pins</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStructureTypeImpl#getShackles <em>Shackles</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStructureTypeImpl#getWingAttachments <em>Wing Attachments</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStructureTypeImpl#getFuselageAttachments <em>Fuselage Attachments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonStructureTypeImpl extends ComplexBaseTypeImpl implements PylonStructureType {
	/**
	 * The cached value of the '{@link #getPylonBox() <em>Pylon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPylonBox()
	 * @generated
	 * @ordered
	 */
	protected PylonBoxType pylonBox;

	/**
	 * The cached value of the '{@link #getFrontPyramid() <em>Front Pyramid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontPyramid()
	 * @generated
	 * @ordered
	 */
	protected PylonShellType frontPyramid;

	/**
	 * The cached value of the '{@link #getStruts() <em>Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruts()
	 * @generated
	 * @ordered
	 */
	protected PylonStrutsType struts;

	/**
	 * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPins()
	 * @generated
	 * @ordered
	 */
	protected PylonPinsType pins;

	/**
	 * The cached value of the '{@link #getShackles() <em>Shackles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShackles()
	 * @generated
	 * @ordered
	 */
	protected PylonShacklesType shackles;

	/**
	 * The cached value of the '{@link #getWingAttachments() <em>Wing Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingAttachments()
	 * @generated
	 * @ordered
	 */
	protected PylonAttachmentsType wingAttachments;

	/**
	 * The cached value of the '{@link #getFuselageAttachments() <em>Fuselage Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageAttachments()
	 * @generated
	 * @ordered
	 */
	protected PylonAttachmentsType fuselageAttachments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonStructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonStructureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonBoxType getPylonBox() {
		return pylonBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPylonBox(PylonBoxType newPylonBox, NotificationChain msgs) {
		PylonBoxType oldPylonBox = pylonBox;
		pylonBox = newPylonBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX, oldPylonBox, newPylonBox);
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
	public void setPylonBox(PylonBoxType newPylonBox) {
		if (newPylonBox != pylonBox) {
			NotificationChain msgs = null;
			if (pylonBox != null)
				msgs = ((InternalEObject) pylonBox).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX, null, msgs);
			if (newPylonBox != null)
				msgs = ((InternalEObject) newPylonBox).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX, null, msgs);
			msgs = basicSetPylonBox(newPylonBox, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX,
					newPylonBox, newPylonBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShellType getFrontPyramid() {
		return frontPyramid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrontPyramid(PylonShellType newFrontPyramid, NotificationChain msgs) {
		PylonShellType oldFrontPyramid = frontPyramid;
		frontPyramid = newFrontPyramid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID, oldFrontPyramid, newFrontPyramid);
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
	public void setFrontPyramid(PylonShellType newFrontPyramid) {
		if (newFrontPyramid != frontPyramid) {
			NotificationChain msgs = null;
			if (frontPyramid != null)
				msgs = ((InternalEObject) frontPyramid).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID, null, msgs);
			if (newFrontPyramid != null)
				msgs = ((InternalEObject) newFrontPyramid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID, null, msgs);
			msgs = basicSetFrontPyramid(newFrontPyramid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID,
					newFrontPyramid, newFrontPyramid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonStrutsType getStruts() {
		return struts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruts(PylonStrutsType newStruts, NotificationChain msgs) {
		PylonStrutsType oldStruts = struts;
		struts = newStruts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS, oldStruts, newStruts);
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
	public void setStruts(PylonStrutsType newStruts) {
		if (newStruts != struts) {
			NotificationChain msgs = null;
			if (struts != null)
				msgs = ((InternalEObject) struts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS, null, msgs);
			if (newStruts != null)
				msgs = ((InternalEObject) newStruts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS, null, msgs);
			msgs = basicSetStruts(newStruts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS, newStruts,
					newStruts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonPinsType getPins() {
		return pins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPins(PylonPinsType newPins, NotificationChain msgs) {
		PylonPinsType oldPins = pins;
		pins = newPins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__PINS, oldPins, newPins);
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
	public void setPins(PylonPinsType newPins) {
		if (newPins != pins) {
			NotificationChain msgs = null;
			if (pins != null)
				msgs = ((InternalEObject) pins).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__PINS, null, msgs);
			if (newPins != null)
				msgs = ((InternalEObject) newPins).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__PINS, null, msgs);
			msgs = basicSetPins(newPins, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUCTURE_TYPE__PINS, newPins,
					newPins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonShacklesType getShackles() {
		return shackles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShackles(PylonShacklesType newShackles, NotificationChain msgs) {
		PylonShacklesType oldShackles = shackles;
		shackles = newShackles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES, oldShackles, newShackles);
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
	public void setShackles(PylonShacklesType newShackles) {
		if (newShackles != shackles) {
			NotificationChain msgs = null;
			if (shackles != null)
				msgs = ((InternalEObject) shackles).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES, null, msgs);
			if (newShackles != null)
				msgs = ((InternalEObject) newShackles).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES, null, msgs);
			msgs = basicSetShackles(newShackles, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES,
					newShackles, newShackles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonAttachmentsType getWingAttachments() {
		return wingAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingAttachments(PylonAttachmentsType newWingAttachments, NotificationChain msgs) {
		PylonAttachmentsType oldWingAttachments = wingAttachments;
		wingAttachments = newWingAttachments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS, oldWingAttachments, newWingAttachments);
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
	public void setWingAttachments(PylonAttachmentsType newWingAttachments) {
		if (newWingAttachments != wingAttachments) {
			NotificationChain msgs = null;
			if (wingAttachments != null)
				msgs = ((InternalEObject) wingAttachments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS, null, msgs);
			if (newWingAttachments != null)
				msgs = ((InternalEObject) newWingAttachments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS, null, msgs);
			msgs = basicSetWingAttachments(newWingAttachments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS,
					newWingAttachments, newWingAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PylonAttachmentsType getFuselageAttachments() {
		return fuselageAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageAttachments(PylonAttachmentsType newFuselageAttachments,
			NotificationChain msgs) {
		PylonAttachmentsType oldFuselageAttachments = fuselageAttachments;
		fuselageAttachments = newFuselageAttachments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS, oldFuselageAttachments,
					newFuselageAttachments);
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
	public void setFuselageAttachments(PylonAttachmentsType newFuselageAttachments) {
		if (newFuselageAttachments != fuselageAttachments) {
			NotificationChain msgs = null;
			if (fuselageAttachments != null)
				msgs = ((InternalEObject) fuselageAttachments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS, null, msgs);
			if (newFuselageAttachments != null)
				msgs = ((InternalEObject) newFuselageAttachments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS, null, msgs);
			msgs = basicSetFuselageAttachments(newFuselageAttachments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS, newFuselageAttachments,
					newFuselageAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX:
			return basicSetPylonBox(null, msgs);
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID:
			return basicSetFrontPyramid(null, msgs);
		case CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS:
			return basicSetStruts(null, msgs);
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PINS:
			return basicSetPins(null, msgs);
		case CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES:
			return basicSetShackles(null, msgs);
		case CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS:
			return basicSetWingAttachments(null, msgs);
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS:
			return basicSetFuselageAttachments(null, msgs);
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
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX:
			return getPylonBox();
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID:
			return getFrontPyramid();
		case CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS:
			return getStruts();
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PINS:
			return getPins();
		case CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES:
			return getShackles();
		case CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS:
			return getWingAttachments();
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS:
			return getFuselageAttachments();
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
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX:
			setPylonBox((PylonBoxType) newValue);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID:
			setFrontPyramid((PylonShellType) newValue);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS:
			setStruts((PylonStrutsType) newValue);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PINS:
			setPins((PylonPinsType) newValue);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES:
			setShackles((PylonShacklesType) newValue);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS:
			setWingAttachments((PylonAttachmentsType) newValue);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS:
			setFuselageAttachments((PylonAttachmentsType) newValue);
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
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX:
			setPylonBox((PylonBoxType) null);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID:
			setFrontPyramid((PylonShellType) null);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS:
			setStruts((PylonStrutsType) null);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PINS:
			setPins((PylonPinsType) null);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES:
			setShackles((PylonShacklesType) null);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS:
			setWingAttachments((PylonAttachmentsType) null);
			return;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS:
			setFuselageAttachments((PylonAttachmentsType) null);
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
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PYLON_BOX:
			return pylonBox != null;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FRONT_PYRAMID:
			return frontPyramid != null;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__STRUTS:
			return struts != null;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__PINS:
			return pins != null;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__SHACKLES:
			return shackles != null;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__WING_ATTACHMENTS:
			return wingAttachments != null;
		case CpacsPackage.PYLON_STRUCTURE_TYPE__FUSELAGE_ATTACHMENTS:
			return fuselageAttachments != null;
		}
		return super.eIsSet(featureID);
	}

} //PylonStructureTypeImpl
