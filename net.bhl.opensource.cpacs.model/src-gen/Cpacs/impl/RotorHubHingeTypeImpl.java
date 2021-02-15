/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RotorHubHingeType;
import Cpacs.StringBaseType;
import Cpacs.TransformationType;
import Cpacs.TypeType4;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotor Hub Hinge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getNeutralPosition <em>Neutral Position</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getStaticStiffness <em>Static Stiffness</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getDynamicStiffness <em>Dynamic Stiffness</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getDamping <em>Damping</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubHingeTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorHubHingeTypeImpl extends ComplexBaseTypeImpl implements RotorHubHingeType {
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
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected TransformationType transformation;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType4 TYPE_EDEFAULT = TypeType4.FLAP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType4 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getNeutralPosition() <em>Neutral Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeutralPosition()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType neutralPosition;

	/**
	 * The cached value of the '{@link #getStaticStiffness() <em>Static Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticStiffness()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType staticStiffness;

	/**
	 * The cached value of the '{@link #getDynamicStiffness() <em>Dynamic Stiffness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicStiffness()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType dynamicStiffness;

	/**
	 * The cached value of the '{@link #getDamping() <em>Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType damping;

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
	protected RotorHubHingeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorHubHingeType();
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
					CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME, newName,
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
					CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		TransformationType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
	public void setTransformation(TransformationType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType4 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType4 newType) {
		TypeType4 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__TYPE, oldType,
					type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType4 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__TYPE, oldType,
					TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getNeutralPosition() {
		return neutralPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeutralPosition(DoubleBaseType newNeutralPosition, NotificationChain msgs) {
		DoubleBaseType oldNeutralPosition = neutralPosition;
		neutralPosition = newNeutralPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION, oldNeutralPosition, newNeutralPosition);
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
	public void setNeutralPosition(DoubleBaseType newNeutralPosition) {
		if (newNeutralPosition != neutralPosition) {
			NotificationChain msgs = null;
			if (neutralPosition != null)
				msgs = ((InternalEObject) neutralPosition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION, null, msgs);
			if (newNeutralPosition != null)
				msgs = ((InternalEObject) newNeutralPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION, null, msgs);
			msgs = basicSetNeutralPosition(newNeutralPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION,
					newNeutralPosition, newNeutralPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStaticStiffness() {
		return staticStiffness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticStiffness(DoubleBaseType newStaticStiffness, NotificationChain msgs) {
		DoubleBaseType oldStaticStiffness = staticStiffness;
		staticStiffness = newStaticStiffness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS, oldStaticStiffness, newStaticStiffness);
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
	public void setStaticStiffness(DoubleBaseType newStaticStiffness) {
		if (newStaticStiffness != staticStiffness) {
			NotificationChain msgs = null;
			if (staticStiffness != null)
				msgs = ((InternalEObject) staticStiffness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS, null, msgs);
			if (newStaticStiffness != null)
				msgs = ((InternalEObject) newStaticStiffness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS, null, msgs);
			msgs = basicSetStaticStiffness(newStaticStiffness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS,
					newStaticStiffness, newStaticStiffness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDynamicStiffness() {
		return dynamicStiffness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicStiffness(DoubleBaseType newDynamicStiffness, NotificationChain msgs) {
		DoubleBaseType oldDynamicStiffness = dynamicStiffness;
		dynamicStiffness = newDynamicStiffness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS, oldDynamicStiffness, newDynamicStiffness);
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
	public void setDynamicStiffness(DoubleBaseType newDynamicStiffness) {
		if (newDynamicStiffness != dynamicStiffness) {
			NotificationChain msgs = null;
			if (dynamicStiffness != null)
				msgs = ((InternalEObject) dynamicStiffness).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS, null, msgs);
			if (newDynamicStiffness != null)
				msgs = ((InternalEObject) newDynamicStiffness).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS, null, msgs);
			msgs = basicSetDynamicStiffness(newDynamicStiffness, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS,
					newDynamicStiffness, newDynamicStiffness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDamping() {
		return damping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDamping(DoubleBaseType newDamping, NotificationChain msgs) {
		DoubleBaseType oldDamping = damping;
		damping = newDamping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING, oldDamping, newDamping);
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
	public void setDamping(DoubleBaseType newDamping) {
		if (newDamping != damping) {
			NotificationChain msgs = null;
			if (damping != null)
				msgs = ((InternalEObject) damping).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING, null, msgs);
			if (newDamping != null)
				msgs = ((InternalEObject) newDamping).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING, null, msgs);
			msgs = basicSetDamping(newDamping, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING,
					newDamping, newDamping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_HINGE_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION:
			return basicSetNeutralPosition(null, msgs);
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS:
			return basicSetStaticStiffness(null, msgs);
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS:
			return basicSetDynamicStiffness(null, msgs);
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING:
			return basicSetDamping(null, msgs);
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
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME:
			return getName();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TYPE:
			return getType();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION:
			return getNeutralPosition();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS:
			return getStaticStiffness();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS:
			return getDynamicStiffness();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING:
			return getDamping();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__UID:
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
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TYPE:
			setType((TypeType4) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION:
			setNeutralPosition((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS:
			setStaticStiffness((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS:
			setDynamicStiffness((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING:
			setDamping((DoubleBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__UID:
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
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TYPE:
			unsetType();
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION:
			setNeutralPosition((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS:
			setStaticStiffness((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS:
			setDynamicStiffness((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING:
			setDamping((DoubleBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__UID:
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
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NAME:
			return name != null;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__TYPE:
			return isSetType();
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__NEUTRAL_POSITION:
			return neutralPosition != null;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__STATIC_STIFFNESS:
			return staticStiffness != null;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DYNAMIC_STIFFNESS:
			return dynamicStiffness != null;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__DAMPING:
			return damping != null;
		case CpacsPackage.ROTOR_HUB_HINGE_TYPE__UID:
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
		result.append(" (type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //RotorHubHingeTypeImpl
