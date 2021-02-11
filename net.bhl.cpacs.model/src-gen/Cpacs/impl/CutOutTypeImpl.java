/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CutOutType;
import Cpacs.DoubleBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CutOutTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutTypeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutTypeImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutTypeImpl#getReinforcementElementUID <em>Reinforcement Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.CutOutTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CutOutTypeImpl extends ComplexBaseTypeImpl implements CutOutType {
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
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType width;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType height;

	/**
	 * The cached value of the '{@link #getFilletRadius() <em>Fillet Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType filletRadius;

	/**
	 * The cached value of the '{@link #getReinforcementElementUID() <em>Reinforcement Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType reinforcementElementUID;

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
	protected CutOutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCutOutType();
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
					CpacsPackage.CUT_OUT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_OUT_TYPE__NAME, newName, newName));
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
					CpacsPackage.CUT_OUT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_OUT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWidth(DoubleBaseType newWidth, NotificationChain msgs) {
		DoubleBaseType oldWidth = width;
		width = newWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_TYPE__WIDTH, oldWidth, newWidth);
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
	public void setWidth(DoubleBaseType newWidth) {
		if (newWidth != width) {
			NotificationChain msgs = null;
			if (width != null)
				msgs = ((InternalEObject) width).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__WIDTH, null, msgs);
			if (newWidth != null)
				msgs = ((InternalEObject) newWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__WIDTH, null, msgs);
			msgs = basicSetWidth(newWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_OUT_TYPE__WIDTH, newWidth,
					newWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeight(DoubleBaseType newHeight, NotificationChain msgs) {
		DoubleBaseType oldHeight = height;
		height = newHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_TYPE__HEIGHT, oldHeight, newHeight);
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
	public void setHeight(DoubleBaseType newHeight) {
		if (newHeight != height) {
			NotificationChain msgs = null;
			if (height != null)
				msgs = ((InternalEObject) height).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__HEIGHT, null, msgs);
			if (newHeight != null)
				msgs = ((InternalEObject) newHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__HEIGHT, null, msgs);
			msgs = basicSetHeight(newHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_OUT_TYPE__HEIGHT, newHeight,
					newHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFilletRadius() {
		return filletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilletRadius(DoubleBaseType newFilletRadius, NotificationChain msgs) {
		DoubleBaseType oldFilletRadius = filletRadius;
		filletRadius = newFilletRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS, oldFilletRadius, newFilletRadius);
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
	public void setFilletRadius(DoubleBaseType newFilletRadius) {
		if (newFilletRadius != filletRadius) {
			NotificationChain msgs = null;
			if (filletRadius != null)
				msgs = ((InternalEObject) filletRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS, null, msgs);
			if (newFilletRadius != null)
				msgs = ((InternalEObject) newFilletRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS, null, msgs);
			msgs = basicSetFilletRadius(newFilletRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS,
					newFilletRadius, newFilletRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReinforcementElementUID() {
		return reinforcementElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReinforcementElementUID(StringUIDBaseType newReinforcementElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldReinforcementElementUID = reinforcementElementUID;
		reinforcementElementUID = newReinforcementElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID, oldReinforcementElementUID,
					newReinforcementElementUID);
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
	public void setReinforcementElementUID(StringUIDBaseType newReinforcementElementUID) {
		if (newReinforcementElementUID != reinforcementElementUID) {
			NotificationChain msgs = null;
			if (reinforcementElementUID != null)
				msgs = ((InternalEObject) reinforcementElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID, null, msgs);
			if (newReinforcementElementUID != null)
				msgs = ((InternalEObject) newReinforcementElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID, null, msgs);
			msgs = basicSetReinforcementElementUID(newReinforcementElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID,
					newReinforcementElementUID, newReinforcementElementUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CUT_OUT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CUT_OUT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CUT_OUT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CUT_OUT_TYPE__WIDTH:
			return basicSetWidth(null, msgs);
		case CpacsPackage.CUT_OUT_TYPE__HEIGHT:
			return basicSetHeight(null, msgs);
		case CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS:
			return basicSetFilletRadius(null, msgs);
		case CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID:
			return basicSetReinforcementElementUID(null, msgs);
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
		case CpacsPackage.CUT_OUT_TYPE__NAME:
			return getName();
		case CpacsPackage.CUT_OUT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CUT_OUT_TYPE__WIDTH:
			return getWidth();
		case CpacsPackage.CUT_OUT_TYPE__HEIGHT:
			return getHeight();
		case CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS:
			return getFilletRadius();
		case CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID:
			return getReinforcementElementUID();
		case CpacsPackage.CUT_OUT_TYPE__UID:
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
		case CpacsPackage.CUT_OUT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CUT_OUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CUT_OUT_TYPE__WIDTH:
			setWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CUT_OUT_TYPE__HEIGHT:
			setHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS:
			setFilletRadius((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID:
			setReinforcementElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CUT_OUT_TYPE__UID:
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
		case CpacsPackage.CUT_OUT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CUT_OUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CUT_OUT_TYPE__WIDTH:
			setWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.CUT_OUT_TYPE__HEIGHT:
			setHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS:
			setFilletRadius((DoubleBaseType) null);
			return;
		case CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID:
			setReinforcementElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CUT_OUT_TYPE__UID:
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
		case CpacsPackage.CUT_OUT_TYPE__NAME:
			return name != null;
		case CpacsPackage.CUT_OUT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CUT_OUT_TYPE__WIDTH:
			return width != null;
		case CpacsPackage.CUT_OUT_TYPE__HEIGHT:
			return height != null;
		case CpacsPackage.CUT_OUT_TYPE__FILLET_RADIUS:
			return filletRadius != null;
		case CpacsPackage.CUT_OUT_TYPE__REINFORCEMENT_ELEMENT_UID:
			return reinforcementElementUID != null;
		case CpacsPackage.CUT_OUT_TYPE__UID:
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

} //CutOutTypeImpl
