/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.HtpStructElemDefType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Htp Struct Elem Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.HtpStructElemDefTypeImpl#getHtpCrossbeamsFrontStructElemUID <em>Htp Crossbeams Front Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpStructElemDefTypeImpl#getHtpCrossbeamsRearStructElemUID <em>Htp Crossbeams Rear Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpStructElemDefTypeImpl#getHtpDiagonalBeamsStructElemUID <em>Htp Diagonal Beams Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpStructElemDefTypeImpl#getHtpSideBeamsStructElemUID <em>Htp Side Beams Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpStructElemDefTypeImpl#getHtpCutoutReinfUpperStructElemUID <em>Htp Cutout Reinf Upper Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpStructElemDefTypeImpl#getHtpCutoutReinfLowerStructElemUID <em>Htp Cutout Reinf Lower Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.impl.HtpStructElemDefTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HtpStructElemDefTypeImpl extends ComplexBaseTypeImpl implements HtpStructElemDefType {
	/**
	 * The cached value of the '{@link #getHtpCrossbeamsFrontStructElemUID() <em>Htp Crossbeams Front Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpCrossbeamsFrontStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpCrossbeamsFrontStructElemUID;

	/**
	 * The cached value of the '{@link #getHtpCrossbeamsRearStructElemUID() <em>Htp Crossbeams Rear Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpCrossbeamsRearStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpCrossbeamsRearStructElemUID;

	/**
	 * The cached value of the '{@link #getHtpDiagonalBeamsStructElemUID() <em>Htp Diagonal Beams Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpDiagonalBeamsStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpDiagonalBeamsStructElemUID;

	/**
	 * The cached value of the '{@link #getHtpSideBeamsStructElemUID() <em>Htp Side Beams Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpSideBeamsStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpSideBeamsStructElemUID;

	/**
	 * The cached value of the '{@link #getHtpCutoutReinfUpperStructElemUID() <em>Htp Cutout Reinf Upper Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpCutoutReinfUpperStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpCutoutReinfUpperStructElemUID;

	/**
	 * The cached value of the '{@link #getHtpCutoutReinfLowerStructElemUID() <em>Htp Cutout Reinf Lower Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtpCutoutReinfLowerStructElemUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType htpCutoutReinfLowerStructElemUID;

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
	protected HtpStructElemDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getHtpStructElemDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpCrossbeamsFrontStructElemUID() {
		return htpCrossbeamsFrontStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpCrossbeamsFrontStructElemUID(
			StringUIDBaseType newHtpCrossbeamsFrontStructElemUID, NotificationChain msgs) {
		StringUIDBaseType oldHtpCrossbeamsFrontStructElemUID = htpCrossbeamsFrontStructElemUID;
		htpCrossbeamsFrontStructElemUID = newHtpCrossbeamsFrontStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID,
					oldHtpCrossbeamsFrontStructElemUID, newHtpCrossbeamsFrontStructElemUID);
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
	public void setHtpCrossbeamsFrontStructElemUID(StringUIDBaseType newHtpCrossbeamsFrontStructElemUID) {
		if (newHtpCrossbeamsFrontStructElemUID != htpCrossbeamsFrontStructElemUID) {
			NotificationChain msgs = null;
			if (htpCrossbeamsFrontStructElemUID != null)
				msgs = ((InternalEObject) htpCrossbeamsFrontStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpCrossbeamsFrontStructElemUID != null)
				msgs = ((InternalEObject) newHtpCrossbeamsFrontStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpCrossbeamsFrontStructElemUID(newHtpCrossbeamsFrontStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID,
					newHtpCrossbeamsFrontStructElemUID, newHtpCrossbeamsFrontStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpCrossbeamsRearStructElemUID() {
		return htpCrossbeamsRearStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpCrossbeamsRearStructElemUID(StringUIDBaseType newHtpCrossbeamsRearStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHtpCrossbeamsRearStructElemUID = htpCrossbeamsRearStructElemUID;
		htpCrossbeamsRearStructElemUID = newHtpCrossbeamsRearStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID,
					oldHtpCrossbeamsRearStructElemUID, newHtpCrossbeamsRearStructElemUID);
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
	public void setHtpCrossbeamsRearStructElemUID(StringUIDBaseType newHtpCrossbeamsRearStructElemUID) {
		if (newHtpCrossbeamsRearStructElemUID != htpCrossbeamsRearStructElemUID) {
			NotificationChain msgs = null;
			if (htpCrossbeamsRearStructElemUID != null)
				msgs = ((InternalEObject) htpCrossbeamsRearStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpCrossbeamsRearStructElemUID != null)
				msgs = ((InternalEObject) newHtpCrossbeamsRearStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpCrossbeamsRearStructElemUID(newHtpCrossbeamsRearStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID,
					newHtpCrossbeamsRearStructElemUID, newHtpCrossbeamsRearStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpDiagonalBeamsStructElemUID() {
		return htpDiagonalBeamsStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpDiagonalBeamsStructElemUID(StringUIDBaseType newHtpDiagonalBeamsStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHtpDiagonalBeamsStructElemUID = htpDiagonalBeamsStructElemUID;
		htpDiagonalBeamsStructElemUID = newHtpDiagonalBeamsStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID,
					oldHtpDiagonalBeamsStructElemUID, newHtpDiagonalBeamsStructElemUID);
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
	public void setHtpDiagonalBeamsStructElemUID(StringUIDBaseType newHtpDiagonalBeamsStructElemUID) {
		if (newHtpDiagonalBeamsStructElemUID != htpDiagonalBeamsStructElemUID) {
			NotificationChain msgs = null;
			if (htpDiagonalBeamsStructElemUID != null)
				msgs = ((InternalEObject) htpDiagonalBeamsStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpDiagonalBeamsStructElemUID != null)
				msgs = ((InternalEObject) newHtpDiagonalBeamsStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpDiagonalBeamsStructElemUID(newHtpDiagonalBeamsStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID,
					newHtpDiagonalBeamsStructElemUID, newHtpDiagonalBeamsStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpSideBeamsStructElemUID() {
		return htpSideBeamsStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpSideBeamsStructElemUID(StringUIDBaseType newHtpSideBeamsStructElemUID,
			NotificationChain msgs) {
		StringUIDBaseType oldHtpSideBeamsStructElemUID = htpSideBeamsStructElemUID;
		htpSideBeamsStructElemUID = newHtpSideBeamsStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID, oldHtpSideBeamsStructElemUID,
					newHtpSideBeamsStructElemUID);
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
	public void setHtpSideBeamsStructElemUID(StringUIDBaseType newHtpSideBeamsStructElemUID) {
		if (newHtpSideBeamsStructElemUID != htpSideBeamsStructElemUID) {
			NotificationChain msgs = null;
			if (htpSideBeamsStructElemUID != null)
				msgs = ((InternalEObject) htpSideBeamsStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpSideBeamsStructElemUID != null)
				msgs = ((InternalEObject) newHtpSideBeamsStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpSideBeamsStructElemUID(newHtpSideBeamsStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID, newHtpSideBeamsStructElemUID,
					newHtpSideBeamsStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpCutoutReinfUpperStructElemUID() {
		return htpCutoutReinfUpperStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpCutoutReinfUpperStructElemUID(
			StringUIDBaseType newHtpCutoutReinfUpperStructElemUID, NotificationChain msgs) {
		StringUIDBaseType oldHtpCutoutReinfUpperStructElemUID = htpCutoutReinfUpperStructElemUID;
		htpCutoutReinfUpperStructElemUID = newHtpCutoutReinfUpperStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID,
					oldHtpCutoutReinfUpperStructElemUID, newHtpCutoutReinfUpperStructElemUID);
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
	public void setHtpCutoutReinfUpperStructElemUID(StringUIDBaseType newHtpCutoutReinfUpperStructElemUID) {
		if (newHtpCutoutReinfUpperStructElemUID != htpCutoutReinfUpperStructElemUID) {
			NotificationChain msgs = null;
			if (htpCutoutReinfUpperStructElemUID != null)
				msgs = ((InternalEObject) htpCutoutReinfUpperStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpCutoutReinfUpperStructElemUID != null)
				msgs = ((InternalEObject) newHtpCutoutReinfUpperStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpCutoutReinfUpperStructElemUID(newHtpCutoutReinfUpperStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID,
					newHtpCutoutReinfUpperStructElemUID, newHtpCutoutReinfUpperStructElemUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getHtpCutoutReinfLowerStructElemUID() {
		return htpCutoutReinfLowerStructElemUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHtpCutoutReinfLowerStructElemUID(
			StringUIDBaseType newHtpCutoutReinfLowerStructElemUID, NotificationChain msgs) {
		StringUIDBaseType oldHtpCutoutReinfLowerStructElemUID = htpCutoutReinfLowerStructElemUID;
		htpCutoutReinfLowerStructElemUID = newHtpCutoutReinfLowerStructElemUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID,
					oldHtpCutoutReinfLowerStructElemUID, newHtpCutoutReinfLowerStructElemUID);
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
	public void setHtpCutoutReinfLowerStructElemUID(StringUIDBaseType newHtpCutoutReinfLowerStructElemUID) {
		if (newHtpCutoutReinfLowerStructElemUID != htpCutoutReinfLowerStructElemUID) {
			NotificationChain msgs = null;
			if (htpCutoutReinfLowerStructElemUID != null)
				msgs = ((InternalEObject) htpCutoutReinfLowerStructElemUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID,
						null, msgs);
			if (newHtpCutoutReinfLowerStructElemUID != null)
				msgs = ((InternalEObject) newHtpCutoutReinfLowerStructElemUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID,
						null, msgs);
			msgs = basicSetHtpCutoutReinfLowerStructElemUID(newHtpCutoutReinfLowerStructElemUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID,
					newHtpCutoutReinfLowerStructElemUID, newHtpCutoutReinfLowerStructElemUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__UID, oldUID,
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
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID:
			return basicSetHtpCrossbeamsFrontStructElemUID(null, msgs);
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID:
			return basicSetHtpCrossbeamsRearStructElemUID(null, msgs);
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID:
			return basicSetHtpDiagonalBeamsStructElemUID(null, msgs);
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID:
			return basicSetHtpSideBeamsStructElemUID(null, msgs);
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID:
			return basicSetHtpCutoutReinfUpperStructElemUID(null, msgs);
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID:
			return basicSetHtpCutoutReinfLowerStructElemUID(null, msgs);
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
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID:
			return getHtpCrossbeamsFrontStructElemUID();
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID:
			return getHtpCrossbeamsRearStructElemUID();
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID:
			return getHtpDiagonalBeamsStructElemUID();
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID:
			return getHtpSideBeamsStructElemUID();
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID:
			return getHtpCutoutReinfUpperStructElemUID();
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID:
			return getHtpCutoutReinfLowerStructElemUID();
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID:
			setHtpCrossbeamsFrontStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID:
			setHtpCrossbeamsRearStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID:
			setHtpDiagonalBeamsStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID:
			setHtpSideBeamsStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID:
			setHtpCutoutReinfUpperStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID:
			setHtpCutoutReinfLowerStructElemUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID:
			setHtpCrossbeamsFrontStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID:
			setHtpCrossbeamsRearStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID:
			setHtpDiagonalBeamsStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID:
			setHtpSideBeamsStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID:
			setHtpCutoutReinfUpperStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID:
			setHtpCutoutReinfLowerStructElemUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__UID:
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
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_FRONT_STRUCT_ELEM_UID:
			return htpCrossbeamsFrontStructElemUID != null;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CROSSBEAMS_REAR_STRUCT_ELEM_UID:
			return htpCrossbeamsRearStructElemUID != null;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_DIAGONAL_BEAMS_STRUCT_ELEM_UID:
			return htpDiagonalBeamsStructElemUID != null;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_SIDE_BEAMS_STRUCT_ELEM_UID:
			return htpSideBeamsStructElemUID != null;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_UPPER_STRUCT_ELEM_UID:
			return htpCutoutReinfUpperStructElemUID != null;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__HTP_CUTOUT_REINF_LOWER_STRUCT_ELEM_UID:
			return htpCutoutReinfLowerStructElemUID != null;
		case CpacsPackage.HTP_STRUCT_ELEM_DEF_TYPE__UID:
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

} //HtpStructElemDefTypeImpl
