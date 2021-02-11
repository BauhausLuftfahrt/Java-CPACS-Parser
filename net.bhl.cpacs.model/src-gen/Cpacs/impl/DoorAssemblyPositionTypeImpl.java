/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorAssemblyPositionType;
import Cpacs.DoorTypeType;
import Cpacs.DoubleBaseType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getDoorElementUID <em>Door Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getStartFrameUID <em>Start Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getEndFrameUID <em>End Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getZBase <em>ZBase</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getYSign <em>YSign</em>}</li>
 *   <li>{@link Cpacs.impl.DoorAssemblyPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorAssemblyPositionTypeImpl extends ComplexBaseTypeImpl implements DoorAssemblyPositionType {
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
	 * The cached value of the '{@link #getDoorType() <em>Door Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorType()
	 * @generated
	 * @ordered
	 */
	protected DoorTypeType doorType;

	/**
	 * The cached value of the '{@link #getDoorElementUID() <em>Door Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType doorElementUID;

	/**
	 * The cached value of the '{@link #getStartFrameUID() <em>Start Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startFrameUID;

	/**
	 * The cached value of the '{@link #getEndFrameUID() <em>End Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endFrameUID;

	/**
	 * The cached value of the '{@link #getStartStringerUID() <em>Start Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType startStringerUID;

	/**
	 * The cached value of the '{@link #getEndStringerUID() <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType endStringerUID;

	/**
	 * The cached value of the '{@link #getZBase() <em>ZBase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBase()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType zBase;

	/**
	 * The cached value of the '{@link #getMinWidth() <em>Min Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType minWidth;

	/**
	 * The cached value of the '{@link #getMinHeight() <em>Min Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType minHeight;

	/**
	 * The cached value of the '{@link #getYSign() <em>YSign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSign()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType ySign;

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
	protected DoorAssemblyPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDoorAssemblyPositionType();
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
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME,
					newName, newName));
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
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorTypeType getDoorType() {
		return doorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoorType(DoorTypeType newDoorType, NotificationChain msgs) {
		DoorTypeType oldDoorType = doorType;
		doorType = newDoorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE, oldDoorType, newDoorType);
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
	public void setDoorType(DoorTypeType newDoorType) {
		if (newDoorType != doorType) {
			NotificationChain msgs = null;
			if (doorType != null)
				msgs = ((InternalEObject) doorType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE, null, msgs);
			if (newDoorType != null)
				msgs = ((InternalEObject) newDoorType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE, null, msgs);
			msgs = basicSetDoorType(newDoorType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE,
					newDoorType, newDoorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDoorElementUID() {
		return doorElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoorElementUID(StringUIDBaseType newDoorElementUID, NotificationChain msgs) {
		StringUIDBaseType oldDoorElementUID = doorElementUID;
		doorElementUID = newDoorElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID, oldDoorElementUID, newDoorElementUID);
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
	public void setDoorElementUID(StringUIDBaseType newDoorElementUID) {
		if (newDoorElementUID != doorElementUID) {
			NotificationChain msgs = null;
			if (doorElementUID != null)
				msgs = ((InternalEObject) doorElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID, null,
						msgs);
			if (newDoorElementUID != null)
				msgs = ((InternalEObject) newDoorElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID, null,
						msgs);
			msgs = basicSetDoorElementUID(newDoorElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID, newDoorElementUID, newDoorElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartFrameUID() {
		return startFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartFrameUID(StringUIDBaseType newStartFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldStartFrameUID = startFrameUID;
		startFrameUID = newStartFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID, oldStartFrameUID, newStartFrameUID);
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
	public void setStartFrameUID(StringUIDBaseType newStartFrameUID) {
		if (newStartFrameUID != startFrameUID) {
			NotificationChain msgs = null;
			if (startFrameUID != null)
				msgs = ((InternalEObject) startFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID, null, msgs);
			if (newStartFrameUID != null)
				msgs = ((InternalEObject) newStartFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID, null, msgs);
			msgs = basicSetStartFrameUID(newStartFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID, newStartFrameUID, newStartFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndFrameUID() {
		return endFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndFrameUID(StringUIDBaseType newEndFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldEndFrameUID = endFrameUID;
		endFrameUID = newEndFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID, oldEndFrameUID, newEndFrameUID);
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
	public void setEndFrameUID(StringUIDBaseType newEndFrameUID) {
		if (newEndFrameUID != endFrameUID) {
			NotificationChain msgs = null;
			if (endFrameUID != null)
				msgs = ((InternalEObject) endFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID, null, msgs);
			if (newEndFrameUID != null)
				msgs = ((InternalEObject) newEndFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID, null, msgs);
			msgs = basicSetEndFrameUID(newEndFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID, newEndFrameUID, newEndFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStartStringerUID() {
		return startStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartStringerUID(StringUIDBaseType newStartStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldStartStringerUID = startStringerUID;
		startStringerUID = newStartStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID, oldStartStringerUID,
					newStartStringerUID);
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
	public void setStartStringerUID(StringUIDBaseType newStartStringerUID) {
		if (newStartStringerUID != startStringerUID) {
			NotificationChain msgs = null;
			if (startStringerUID != null)
				msgs = ((InternalEObject) startStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID, null,
						msgs);
			if (newStartStringerUID != null)
				msgs = ((InternalEObject) newStartStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID, null,
						msgs);
			msgs = basicSetStartStringerUID(newStartStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID, newStartStringerUID,
					newStartStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getEndStringerUID() {
		return endStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndStringerUID(StringUIDBaseType newEndStringerUID, NotificationChain msgs) {
		StringUIDBaseType oldEndStringerUID = endStringerUID;
		endStringerUID = newEndStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID, oldEndStringerUID, newEndStringerUID);
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
	public void setEndStringerUID(StringUIDBaseType newEndStringerUID) {
		if (newEndStringerUID != endStringerUID) {
			NotificationChain msgs = null;
			if (endStringerUID != null)
				msgs = ((InternalEObject) endStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID, null,
						msgs);
			if (newEndStringerUID != null)
				msgs = ((InternalEObject) newEndStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID, null,
						msgs);
			msgs = basicSetEndStringerUID(newEndStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID, newEndStringerUID, newEndStringerUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getZBase() {
		return zBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBase(DoubleBaseType newZBase, NotificationChain msgs) {
		DoubleBaseType oldZBase = zBase;
		zBase = newZBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE, oldZBase, newZBase);
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
	public void setZBase(DoubleBaseType newZBase) {
		if (newZBase != zBase) {
			NotificationChain msgs = null;
			if (zBase != null)
				msgs = ((InternalEObject) zBase).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE, null, msgs);
			if (newZBase != null)
				msgs = ((InternalEObject) newZBase).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE, null, msgs);
			msgs = basicSetZBase(newZBase, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE,
					newZBase, newZBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMinWidth() {
		return minWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinWidth(DoubleBaseType newMinWidth, NotificationChain msgs) {
		DoubleBaseType oldMinWidth = minWidth;
		minWidth = newMinWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH, oldMinWidth, newMinWidth);
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
	public void setMinWidth(DoubleBaseType newMinWidth) {
		if (newMinWidth != minWidth) {
			NotificationChain msgs = null;
			if (minWidth != null)
				msgs = ((InternalEObject) minWidth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH, null, msgs);
			if (newMinWidth != null)
				msgs = ((InternalEObject) newMinWidth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH, null, msgs);
			msgs = basicSetMinWidth(newMinWidth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH,
					newMinWidth, newMinWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMinHeight() {
		return minHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinHeight(DoubleBaseType newMinHeight, NotificationChain msgs) {
		DoubleBaseType oldMinHeight = minHeight;
		minHeight = newMinHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT, oldMinHeight, newMinHeight);
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
	public void setMinHeight(DoubleBaseType newMinHeight) {
		if (newMinHeight != minHeight) {
			NotificationChain msgs = null;
			if (minHeight != null)
				msgs = ((InternalEObject) minHeight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT, null, msgs);
			if (newMinHeight != null)
				msgs = ((InternalEObject) newMinHeight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT, null, msgs);
			msgs = basicSetMinHeight(newMinHeight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT,
					newMinHeight, newMinHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getYSign() {
		return ySign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYSign(IntegerBaseType newYSign, NotificationChain msgs) {
		IntegerBaseType oldYSign = ySign;
		ySign = newYSign;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN, oldYSign, newYSign);
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
	public void setYSign(IntegerBaseType newYSign) {
		if (newYSign != ySign) {
			NotificationChain msgs = null;
			if (ySign != null)
				msgs = ((InternalEObject) ySign).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN, null, msgs);
			if (newYSign != null)
				msgs = ((InternalEObject) newYSign).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN, null, msgs);
			msgs = basicSetYSign(newYSign, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN,
					newYSign, newYSign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__UID, oldUID,
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
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE:
			return basicSetDoorType(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID:
			return basicSetDoorElementUID(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID:
			return basicSetStartFrameUID(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID:
			return basicSetEndFrameUID(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID:
			return basicSetStartStringerUID(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID:
			return basicSetEndStringerUID(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE:
			return basicSetZBase(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH:
			return basicSetMinWidth(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT:
			return basicSetMinHeight(null, msgs);
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN:
			return basicSetYSign(null, msgs);
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
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME:
			return getName();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE:
			return getDoorType();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID:
			return getDoorElementUID();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID:
			return getStartFrameUID();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID:
			return getEndFrameUID();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID:
			return getStartStringerUID();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID:
			return getEndStringerUID();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE:
			return getZBase();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH:
			return getMinWidth();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT:
			return getMinHeight();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN:
			return getYSign();
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE:
			setDoorType((DoorTypeType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID:
			setDoorElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID:
			setStartFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID:
			setEndFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE:
			setZBase((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH:
			setMinWidth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT:
			setMinHeight((DoubleBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN:
			setYSign((IntegerBaseType) newValue);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE:
			setDoorType((DoorTypeType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID:
			setDoorElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID:
			setStartFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID:
			setEndFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID:
			setStartStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID:
			setEndStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE:
			setZBase((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH:
			setMinWidth((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT:
			setMinHeight((DoubleBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN:
			setYSign((IntegerBaseType) null);
			return;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__UID:
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
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__NAME:
			return name != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_TYPE:
			return doorType != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__DOOR_ELEMENT_UID:
			return doorElementUID != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_FRAME_UID:
			return startFrameUID != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_FRAME_UID:
			return endFrameUID != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__START_STRINGER_UID:
			return startStringerUID != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__END_STRINGER_UID:
			return endStringerUID != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__ZBASE:
			return zBase != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_WIDTH:
			return minWidth != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__MIN_HEIGHT:
			return minHeight != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__YSIGN:
			return ySign != null;
		case CpacsPackage.DOOR_ASSEMBLY_POSITION_TYPE__UID:
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

} //DoorAssemblyPositionTypeImpl
