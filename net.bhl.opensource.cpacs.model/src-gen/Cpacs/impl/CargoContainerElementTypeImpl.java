/**
 */
package Cpacs.impl;

import Cpacs.CargoContainerElementType;
import Cpacs.ContourType;
import Cpacs.CpacsPackage;
import Cpacs.DeckElementMassType;
import Cpacs.DoubleBaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cargo Container Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getContour <em>Contour</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getDeltaX <em>Delta X</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getDeltaY <em>Delta Y</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getDeltaYBase <em>Delta YBase</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getDeltaZ <em>Delta Z</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getDeltaZKink <em>Delta ZKink</em>}</li>
 *   <li>{@link Cpacs.impl.CargoContainerElementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargoContainerElementTypeImpl extends ComplexBaseTypeImpl implements CargoContainerElementType {
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
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected DeckElementMassType mass;

	/**
	 * The cached value of the '{@link #getContour() <em>Contour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContour()
	 * @generated
	 * @ordered
	 */
	protected ContourType contour;

	/**
	 * The cached value of the '{@link #getDeltaX() <em>Delta X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaX()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaX;

	/**
	 * The cached value of the '{@link #getDeltaY() <em>Delta Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaY()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaY;

	/**
	 * The cached value of the '{@link #getDeltaYBase() <em>Delta YBase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaYBase()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaYBase;

	/**
	 * The cached value of the '{@link #getDeltaZ() <em>Delta Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaZ;

	/**
	 * The cached value of the '{@link #getDeltaZKink() <em>Delta ZKink</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaZKink()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaZKink;

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
	protected CargoContainerElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCargoContainerElementType();
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
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckElementMassType getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(DeckElementMassType newMass, NotificationChain msgs) {
		DeckElementMassType oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS, oldMass, newMass);
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
	public void setMass(DeckElementMassType newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject) mass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject) newMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS,
					newMass, newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContourType getContour() {
		return contour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContour(ContourType newContour, NotificationChain msgs) {
		ContourType oldContour = contour;
		contour = newContour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR, oldContour, newContour);
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
	public void setContour(ContourType newContour) {
		if (newContour != contour) {
			NotificationChain msgs = null;
			if (contour != null)
				msgs = ((InternalEObject) contour).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR, null, msgs);
			if (newContour != null)
				msgs = ((InternalEObject) newContour).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR, null, msgs);
			msgs = basicSetContour(newContour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR,
					newContour, newContour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaX() {
		return deltaX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaX(DoubleBaseType newDeltaX, NotificationChain msgs) {
		DoubleBaseType oldDeltaX = deltaX;
		deltaX = newDeltaX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X, oldDeltaX, newDeltaX);
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
	public void setDeltaX(DoubleBaseType newDeltaX) {
		if (newDeltaX != deltaX) {
			NotificationChain msgs = null;
			if (deltaX != null)
				msgs = ((InternalEObject) deltaX).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X, null, msgs);
			if (newDeltaX != null)
				msgs = ((InternalEObject) newDeltaX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X, null, msgs);
			msgs = basicSetDeltaX(newDeltaX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X,
					newDeltaX, newDeltaX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaY() {
		return deltaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaY(DoubleBaseType newDeltaY, NotificationChain msgs) {
		DoubleBaseType oldDeltaY = deltaY;
		deltaY = newDeltaY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y, oldDeltaY, newDeltaY);
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
	public void setDeltaY(DoubleBaseType newDeltaY) {
		if (newDeltaY != deltaY) {
			NotificationChain msgs = null;
			if (deltaY != null)
				msgs = ((InternalEObject) deltaY).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y, null, msgs);
			if (newDeltaY != null)
				msgs = ((InternalEObject) newDeltaY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y, null, msgs);
			msgs = basicSetDeltaY(newDeltaY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y,
					newDeltaY, newDeltaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaYBase() {
		return deltaYBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaYBase(DoubleBaseType newDeltaYBase, NotificationChain msgs) {
		DoubleBaseType oldDeltaYBase = deltaYBase;
		deltaYBase = newDeltaYBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE, oldDeltaYBase, newDeltaYBase);
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
	public void setDeltaYBase(DoubleBaseType newDeltaYBase) {
		if (newDeltaYBase != deltaYBase) {
			NotificationChain msgs = null;
			if (deltaYBase != null)
				msgs = ((InternalEObject) deltaYBase).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE, null, msgs);
			if (newDeltaYBase != null)
				msgs = ((InternalEObject) newDeltaYBase).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE, null, msgs);
			msgs = basicSetDeltaYBase(newDeltaYBase, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE, newDeltaYBase, newDeltaYBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaZ() {
		return deltaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaZ(DoubleBaseType newDeltaZ, NotificationChain msgs) {
		DoubleBaseType oldDeltaZ = deltaZ;
		deltaZ = newDeltaZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z, oldDeltaZ, newDeltaZ);
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
	public void setDeltaZ(DoubleBaseType newDeltaZ) {
		if (newDeltaZ != deltaZ) {
			NotificationChain msgs = null;
			if (deltaZ != null)
				msgs = ((InternalEObject) deltaZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z, null, msgs);
			if (newDeltaZ != null)
				msgs = ((InternalEObject) newDeltaZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z, null, msgs);
			msgs = basicSetDeltaZ(newDeltaZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z,
					newDeltaZ, newDeltaZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaZKink() {
		return deltaZKink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaZKink(DoubleBaseType newDeltaZKink, NotificationChain msgs) {
		DoubleBaseType oldDeltaZKink = deltaZKink;
		deltaZKink = newDeltaZKink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK, oldDeltaZKink, newDeltaZKink);
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
	public void setDeltaZKink(DoubleBaseType newDeltaZKink) {
		if (newDeltaZKink != deltaZKink) {
			NotificationChain msgs = null;
			if (deltaZKink != null)
				msgs = ((InternalEObject) deltaZKink).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK, null, msgs);
			if (newDeltaZKink != null)
				msgs = ((InternalEObject) newDeltaZKink).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK, null, msgs);
			msgs = basicSetDeltaZKink(newDeltaZKink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK, newDeltaZKink, newDeltaZKink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS:
			return basicSetMass(null, msgs);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR:
			return basicSetContour(null, msgs);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X:
			return basicSetDeltaX(null, msgs);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y:
			return basicSetDeltaY(null, msgs);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE:
			return basicSetDeltaYBase(null, msgs);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z:
			return basicSetDeltaZ(null, msgs);
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK:
			return basicSetDeltaZKink(null, msgs);
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS:
			return getMass();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR:
			return getContour();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X:
			return getDeltaX();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y:
			return getDeltaY();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE:
			return getDeltaYBase();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z:
			return getDeltaZ();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK:
			return getDeltaZKink();
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS:
			setMass((DeckElementMassType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR:
			setContour((ContourType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X:
			setDeltaX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y:
			setDeltaY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE:
			setDeltaYBase((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z:
			setDeltaZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK:
			setDeltaZKink((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS:
			setMass((DeckElementMassType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR:
			setContour((ContourType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X:
			setDeltaX((DoubleBaseType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y:
			setDeltaY((DoubleBaseType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE:
			setDeltaYBase((DoubleBaseType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z:
			setDeltaZ((DoubleBaseType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK:
			setDeltaZKink((DoubleBaseType) null);
			return;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__UID:
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__MASS:
			return mass != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__CONTOUR:
			return contour != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_X:
			return deltaX != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Y:
			return deltaY != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_YBASE:
			return deltaYBase != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_Z:
			return deltaZ != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__DELTA_ZKINK:
			return deltaZKink != null;
		case CpacsPackage.CARGO_CONTAINER_ELEMENT_TYPE__UID:
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

} //CargoContainerElementTypeImpl
