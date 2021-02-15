/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceHingeMomentMapsType;
import Cpacs.CpacsPackage;
import Cpacs.HingeMomentsMapType;
import Cpacs.StringBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hinge Moments Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.HingeMomentsMapTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.HingeMomentsMapTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.HingeMomentsMapTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.HingeMomentsMapTypeImpl#getReynoldsNumber <em>Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.impl.HingeMomentsMapTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.HingeMomentsMapTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.HingeMomentsMapTypeImpl#getControlSurfaces <em>Control Surfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HingeMomentsMapTypeImpl extends ComplexBaseTypeImpl implements HingeMomentsMapType {
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
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType machNumber;

	/**
	 * The cached value of the '{@link #getReynoldsNumber() <em>Reynolds Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReynoldsNumber()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType reynoldsNumber;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType angleOfSideslip;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getControlSurfaces() <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaces()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceHingeMomentMapsType controlSurfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HingeMomentsMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getHingeMomentsMapType();
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
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME, newName,
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
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(StringVectorBaseType newMachNumber, NotificationChain msgs) {
		StringVectorBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(StringVectorBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER,
					newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getReynoldsNumber() {
		return reynoldsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReynoldsNumber(StringVectorBaseType newReynoldsNumber, NotificationChain msgs) {
		StringVectorBaseType oldReynoldsNumber = reynoldsNumber;
		reynoldsNumber = newReynoldsNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER, oldReynoldsNumber, newReynoldsNumber);
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
	public void setReynoldsNumber(StringVectorBaseType newReynoldsNumber) {
		if (newReynoldsNumber != reynoldsNumber) {
			NotificationChain msgs = null;
			if (reynoldsNumber != null)
				msgs = ((InternalEObject) reynoldsNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER, null, msgs);
			if (newReynoldsNumber != null)
				msgs = ((InternalEObject) newReynoldsNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER, null, msgs);
			msgs = basicSetReynoldsNumber(newReynoldsNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER,
					newReynoldsNumber, newReynoldsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(StringVectorBaseType newAngleOfSideslip, NotificationChain msgs) {
		StringVectorBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip, newAngleOfSideslip);
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
	public void setAngleOfSideslip(StringVectorBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP, newAngleOfSideslip, newAngleOfSideslip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(StringVectorBaseType newAngleOfAttack, NotificationChain msgs) {
		StringVectorBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(StringVectorBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK,
					newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceHingeMomentMapsType getControlSurfaces() {
		return controlSurfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaces(ControlSurfaceHingeMomentMapsType newControlSurfaces,
			NotificationChain msgs) {
		ControlSurfaceHingeMomentMapsType oldControlSurfaces = controlSurfaces;
		controlSurfaces = newControlSurfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES, oldControlSurfaces, newControlSurfaces);
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
	public void setControlSurfaces(ControlSurfaceHingeMomentMapsType newControlSurfaces) {
		if (newControlSurfaces != controlSurfaces) {
			NotificationChain msgs = null;
			if (controlSurfaces != null)
				msgs = ((InternalEObject) controlSurfaces).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES, null, msgs);
			if (newControlSurfaces != null)
				msgs = ((InternalEObject) newControlSurfaces).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES, null, msgs);
			msgs = basicSetControlSurfaces(newControlSurfaces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES,
					newControlSurfaces, newControlSurfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER:
			return basicSetReynoldsNumber(null, msgs);
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES:
			return basicSetControlSurfaces(null, msgs);
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
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME:
			return getName();
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER:
			return getReynoldsNumber();
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES:
			return getControlSurfaces();
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
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER:
			setMachNumber((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER:
			setReynoldsNumber((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfaceHingeMomentMapsType) newValue);
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
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER:
			setMachNumber((StringVectorBaseType) null);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER:
			setReynoldsNumber((StringVectorBaseType) null);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((StringVectorBaseType) null);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((StringVectorBaseType) null);
			return;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfaceHingeMomentMapsType) null);
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
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__NAME:
			return name != null;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__REYNOLDS_NUMBER:
			return reynoldsNumber != null;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.HINGE_MOMENTS_MAP_TYPE__CONTROL_SURFACES:
			return controlSurfaces != null;
		}
		return super.eIsSet(featureID);
	}

} //HingeMomentsMapTypeImpl
