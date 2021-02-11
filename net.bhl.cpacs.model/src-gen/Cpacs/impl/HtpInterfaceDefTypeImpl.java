/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.HtpFwdInterfaceDefType;
import Cpacs.HtpInterfaceDefType;
import Cpacs.HtpStructElemDefType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Htp Interface Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpFrame1UID <em>Htp Frame1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpFrame2UID <em>Htp Frame2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpAlphaUp <em>Htp Alpha Up</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpAlphaDown <em>Htp Alpha Down</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpReinfAngle <em>Htp Reinf Angle</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpAreaToleranceX <em>Htp Area Tolerance X</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpAreaToleranceY <em>Htp Area Tolerance Y</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpAreaToleranceZ <em>Htp Area Tolerance Z</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpStructuralElementDefinitions <em>Htp Structural Element Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getHtpForwardInterfaceDefinitions <em>Htp Forward Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.HtpInterfaceDefTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HtpInterfaceDefTypeImpl extends ComplexBaseTypeImpl implements HtpInterfaceDefType {
	/**
	 * The cached value of the '{@link #getHtpFrame1UID() <em>Htp Frame1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFrame1UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpFrame1UID;

	/**
	 * The cached value of the '{@link #getHtpFrame2UID() <em>Htp Frame2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpFrame2UID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpFrame2UID;

	/**
	 * The cached value of the '{@link #getHtpAlphaUp() <em>Htp Alpha Up</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpAlphaUp()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpAlphaUp;

	/**
	 * The cached value of the '{@link #getHtpAlphaDown() <em>Htp Alpha Down</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpAlphaDown()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpAlphaDown;

	/**
	 * The cached value of the '{@link #getHtpReinfAngle() <em>Htp Reinf Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpReinfAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpReinfAngle;

	/**
	 * The cached value of the '{@link #getHtpAreaToleranceX() <em>Htp Area Tolerance X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpAreaToleranceX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpAreaToleranceX;

	/**
	 * The cached value of the '{@link #getHtpAreaToleranceY() <em>Htp Area Tolerance Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpAreaToleranceY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpAreaToleranceY;

	/**
	 * The cached value of the '{@link #getHtpAreaToleranceZ() <em>Htp Area Tolerance Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpAreaToleranceZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType htpAreaToleranceZ;

	/**
	 * The cached value of the '{@link #getHtpStructuralElementDefinitions() <em>Htp Structural Element Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpStructuralElementDefinitions()
	 * @generated
	 * @ordered
	 */
	protected HtpStructElemDefType htpStructuralElementDefinitions;

	/**
	 * The cached value of the '{@link #getHtpForwardInterfaceDefinitions() <em>Htp Forward Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpForwardInterfaceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected HtpFwdInterfaceDefType htpForwardInterfaceDefinitions;

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
	protected HtpInterfaceDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getHtpInterfaceDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpFrame1UID() {
		return htpFrame1UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFrame1UID(StringUIDBaseType newHtpFrame1UID, NotificationChain msgs) {
		StringUIDBaseType oldHtpFrame1UID = htpFrame1UID;
		htpFrame1UID = newHtpFrame1UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID, oldHtpFrame1UID, newHtpFrame1UID);
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
	public void setHtpFrame1UID(StringUIDBaseType newHtpFrame1UID) {
		if (newHtpFrame1UID != htpFrame1UID) {
			NotificationChain msgs = null;
			if (htpFrame1UID != null)
				msgs = ((InternalEObject) htpFrame1UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID, null, msgs);
			if (newHtpFrame1UID != null)
				msgs = ((InternalEObject) newHtpFrame1UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID, null, msgs);
			msgs = basicSetHtpFrame1UID(newHtpFrame1UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID,
					newHtpFrame1UID, newHtpFrame1UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpFrame2UID() {
		return htpFrame2UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpFrame2UID(StringUIDBaseType newHtpFrame2UID, NotificationChain msgs) {
		StringUIDBaseType oldHtpFrame2UID = htpFrame2UID;
		htpFrame2UID = newHtpFrame2UID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID, oldHtpFrame2UID, newHtpFrame2UID);
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
	public void setHtpFrame2UID(StringUIDBaseType newHtpFrame2UID) {
		if (newHtpFrame2UID != htpFrame2UID) {
			NotificationChain msgs = null;
			if (htpFrame2UID != null)
				msgs = ((InternalEObject) htpFrame2UID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID, null, msgs);
			if (newHtpFrame2UID != null)
				msgs = ((InternalEObject) newHtpFrame2UID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID, null, msgs);
			msgs = basicSetHtpFrame2UID(newHtpFrame2UID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID,
					newHtpFrame2UID, newHtpFrame2UID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpAlphaUp() {
		return htpAlphaUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpAlphaUp(DoubleBaseType newHtpAlphaUp, NotificationChain msgs) {
		DoubleBaseType oldHtpAlphaUp = htpAlphaUp;
		htpAlphaUp = newHtpAlphaUp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP, oldHtpAlphaUp, newHtpAlphaUp);
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
	public void setHtpAlphaUp(DoubleBaseType newHtpAlphaUp) {
		if (newHtpAlphaUp != htpAlphaUp) {
			NotificationChain msgs = null;
			if (htpAlphaUp != null)
				msgs = ((InternalEObject) htpAlphaUp).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP, null, msgs);
			if (newHtpAlphaUp != null)
				msgs = ((InternalEObject) newHtpAlphaUp).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP, null, msgs);
			msgs = basicSetHtpAlphaUp(newHtpAlphaUp, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP,
					newHtpAlphaUp, newHtpAlphaUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpAlphaDown() {
		return htpAlphaDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpAlphaDown(DoubleBaseType newHtpAlphaDown, NotificationChain msgs) {
		DoubleBaseType oldHtpAlphaDown = htpAlphaDown;
		htpAlphaDown = newHtpAlphaDown;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN, oldHtpAlphaDown, newHtpAlphaDown);
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
	public void setHtpAlphaDown(DoubleBaseType newHtpAlphaDown) {
		if (newHtpAlphaDown != htpAlphaDown) {
			NotificationChain msgs = null;
			if (htpAlphaDown != null)
				msgs = ((InternalEObject) htpAlphaDown).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN, null, msgs);
			if (newHtpAlphaDown != null)
				msgs = ((InternalEObject) newHtpAlphaDown).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN, null, msgs);
			msgs = basicSetHtpAlphaDown(newHtpAlphaDown, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN,
					newHtpAlphaDown, newHtpAlphaDown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpReinfAngle() {
		return htpReinfAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpReinfAngle(DoubleBaseType newHtpReinfAngle, NotificationChain msgs) {
		DoubleBaseType oldHtpReinfAngle = htpReinfAngle;
		htpReinfAngle = newHtpReinfAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE, oldHtpReinfAngle, newHtpReinfAngle);
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
	public void setHtpReinfAngle(DoubleBaseType newHtpReinfAngle) {
		if (newHtpReinfAngle != htpReinfAngle) {
			NotificationChain msgs = null;
			if (htpReinfAngle != null)
				msgs = ((InternalEObject) htpReinfAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE, null, msgs);
			if (newHtpReinfAngle != null)
				msgs = ((InternalEObject) newHtpReinfAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE, null, msgs);
			msgs = basicSetHtpReinfAngle(newHtpReinfAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE,
					newHtpReinfAngle, newHtpReinfAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpAreaToleranceX() {
		return htpAreaToleranceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpAreaToleranceX(DoubleBaseType newHtpAreaToleranceX, NotificationChain msgs) {
		DoubleBaseType oldHtpAreaToleranceX = htpAreaToleranceX;
		htpAreaToleranceX = newHtpAreaToleranceX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X, oldHtpAreaToleranceX,
					newHtpAreaToleranceX);
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
	public void setHtpAreaToleranceX(DoubleBaseType newHtpAreaToleranceX) {
		if (newHtpAreaToleranceX != htpAreaToleranceX) {
			NotificationChain msgs = null;
			if (htpAreaToleranceX != null)
				msgs = ((InternalEObject) htpAreaToleranceX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X, null, msgs);
			if (newHtpAreaToleranceX != null)
				msgs = ((InternalEObject) newHtpAreaToleranceX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X, null, msgs);
			msgs = basicSetHtpAreaToleranceX(newHtpAreaToleranceX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X, newHtpAreaToleranceX,
					newHtpAreaToleranceX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpAreaToleranceY() {
		return htpAreaToleranceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpAreaToleranceY(DoubleBaseType newHtpAreaToleranceY, NotificationChain msgs) {
		DoubleBaseType oldHtpAreaToleranceY = htpAreaToleranceY;
		htpAreaToleranceY = newHtpAreaToleranceY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y, oldHtpAreaToleranceY,
					newHtpAreaToleranceY);
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
	public void setHtpAreaToleranceY(DoubleBaseType newHtpAreaToleranceY) {
		if (newHtpAreaToleranceY != htpAreaToleranceY) {
			NotificationChain msgs = null;
			if (htpAreaToleranceY != null)
				msgs = ((InternalEObject) htpAreaToleranceY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y, null, msgs);
			if (newHtpAreaToleranceY != null)
				msgs = ((InternalEObject) newHtpAreaToleranceY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y, null, msgs);
			msgs = basicSetHtpAreaToleranceY(newHtpAreaToleranceY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y, newHtpAreaToleranceY,
					newHtpAreaToleranceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHtpAreaToleranceZ() {
		return htpAreaToleranceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpAreaToleranceZ(DoubleBaseType newHtpAreaToleranceZ, NotificationChain msgs) {
		DoubleBaseType oldHtpAreaToleranceZ = htpAreaToleranceZ;
		htpAreaToleranceZ = newHtpAreaToleranceZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z, oldHtpAreaToleranceZ,
					newHtpAreaToleranceZ);
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
	public void setHtpAreaToleranceZ(DoubleBaseType newHtpAreaToleranceZ) {
		if (newHtpAreaToleranceZ != htpAreaToleranceZ) {
			NotificationChain msgs = null;
			if (htpAreaToleranceZ != null)
				msgs = ((InternalEObject) htpAreaToleranceZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z, null, msgs);
			if (newHtpAreaToleranceZ != null)
				msgs = ((InternalEObject) newHtpAreaToleranceZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z, null, msgs);
			msgs = basicSetHtpAreaToleranceZ(newHtpAreaToleranceZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z, newHtpAreaToleranceZ,
					newHtpAreaToleranceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtpStructElemDefType getHtpStructuralElementDefinitions() {
		return htpStructuralElementDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpStructuralElementDefinitions(
			HtpStructElemDefType newHtpStructuralElementDefinitions, NotificationChain msgs) {
		HtpStructElemDefType oldHtpStructuralElementDefinitions = htpStructuralElementDefinitions;
		htpStructuralElementDefinitions = newHtpStructuralElementDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS,
					oldHtpStructuralElementDefinitions, newHtpStructuralElementDefinitions);
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
	public void setHtpStructuralElementDefinitions(HtpStructElemDefType newHtpStructuralElementDefinitions) {
		if (newHtpStructuralElementDefinitions != htpStructuralElementDefinitions) {
			NotificationChain msgs = null;
			if (htpStructuralElementDefinitions != null)
				msgs = ((InternalEObject) htpStructuralElementDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS, null, msgs);
			if (newHtpStructuralElementDefinitions != null)
				msgs = ((InternalEObject) newHtpStructuralElementDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS, null, msgs);
			msgs = basicSetHtpStructuralElementDefinitions(newHtpStructuralElementDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS,
					newHtpStructuralElementDefinitions, newHtpStructuralElementDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtpFwdInterfaceDefType getHtpForwardInterfaceDefinitions() {
		return htpForwardInterfaceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpForwardInterfaceDefinitions(
			HtpFwdInterfaceDefType newHtpForwardInterfaceDefinitions, NotificationChain msgs) {
		HtpFwdInterfaceDefType oldHtpForwardInterfaceDefinitions = htpForwardInterfaceDefinitions;
		htpForwardInterfaceDefinitions = newHtpForwardInterfaceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS,
					oldHtpForwardInterfaceDefinitions, newHtpForwardInterfaceDefinitions);
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
	public void setHtpForwardInterfaceDefinitions(HtpFwdInterfaceDefType newHtpForwardInterfaceDefinitions) {
		if (newHtpForwardInterfaceDefinitions != htpForwardInterfaceDefinitions) {
			NotificationChain msgs = null;
			if (htpForwardInterfaceDefinitions != null)
				msgs = ((InternalEObject) htpForwardInterfaceDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS,
						null, msgs);
			if (newHtpForwardInterfaceDefinitions != null)
				msgs = ((InternalEObject) newHtpForwardInterfaceDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS,
						null, msgs);
			msgs = basicSetHtpForwardInterfaceDefinitions(newHtpForwardInterfaceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS,
					newHtpForwardInterfaceDefinitions, newHtpForwardInterfaceDefinitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_INTERFACE_DEF_TYPE__UID, oldUID,
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
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID:
			return basicSetHtpFrame1UID(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID:
			return basicSetHtpFrame2UID(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP:
			return basicSetHtpAlphaUp(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN:
			return basicSetHtpAlphaDown(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE:
			return basicSetHtpReinfAngle(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X:
			return basicSetHtpAreaToleranceX(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y:
			return basicSetHtpAreaToleranceY(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z:
			return basicSetHtpAreaToleranceZ(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS:
			return basicSetHtpStructuralElementDefinitions(null, msgs);
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS:
			return basicSetHtpForwardInterfaceDefinitions(null, msgs);
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
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID:
			return getHtpFrame1UID();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID:
			return getHtpFrame2UID();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP:
			return getHtpAlphaUp();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN:
			return getHtpAlphaDown();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE:
			return getHtpReinfAngle();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X:
			return getHtpAreaToleranceX();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y:
			return getHtpAreaToleranceY();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z:
			return getHtpAreaToleranceZ();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS:
			return getHtpStructuralElementDefinitions();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS:
			return getHtpForwardInterfaceDefinitions();
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID:
			setHtpFrame1UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID:
			setHtpFrame2UID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP:
			setHtpAlphaUp((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN:
			setHtpAlphaDown((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE:
			setHtpReinfAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X:
			setHtpAreaToleranceX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y:
			setHtpAreaToleranceY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z:
			setHtpAreaToleranceZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS:
			setHtpStructuralElementDefinitions((HtpStructElemDefType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS:
			setHtpForwardInterfaceDefinitions((HtpFwdInterfaceDefType) newValue);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID:
			setHtpFrame1UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID:
			setHtpFrame2UID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP:
			setHtpAlphaUp((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN:
			setHtpAlphaDown((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE:
			setHtpReinfAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X:
			setHtpAreaToleranceX((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y:
			setHtpAreaToleranceY((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z:
			setHtpAreaToleranceZ((DoubleBaseType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS:
			setHtpStructuralElementDefinitions((HtpStructElemDefType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS:
			setHtpForwardInterfaceDefinitions((HtpFwdInterfaceDefType) null);
			return;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME1_UID:
			return htpFrame1UID != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FRAME2_UID:
			return htpFrame2UID != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_UP:
			return htpAlphaUp != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_ALPHA_DOWN:
			return htpAlphaDown != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_REINF_ANGLE:
			return htpReinfAngle != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_X:
			return htpAreaToleranceX != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Y:
			return htpAreaToleranceY != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_AREA_TOLERANCE_Z:
			return htpAreaToleranceZ != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_STRUCTURAL_ELEMENT_DEFINITIONS:
			return htpStructuralElementDefinitions != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__HTP_FORWARD_INTERFACE_DEFINITIONS:
			return htpForwardInterfaceDefinitions != null;
		case CpacsPackage.HTP_INTERFACE_DEF_TYPE__UID:
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

} //HtpInterfaceDefTypeImpl
