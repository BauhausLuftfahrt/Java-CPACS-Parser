/**
 */
package Cpacs.impl;

import Cpacs.CabinGeometryContoursType;
import Cpacs.CabinGeometryType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinGeometryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.CabinGeometryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.CabinGeometryTypeImpl#getContours <em>Contours</em>}</li>
 *   <li>{@link Cpacs.impl.CabinGeometryTypeImpl#getX <em>X</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinGeometryTypeImpl extends ComplexBaseTypeImpl implements CabinGeometryType {
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
	 * The cached value of the '{@link #getContours() <em>Contours</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContours()
	 * @generated
	 * @ordered
	 */
	protected CabinGeometryContoursType contours;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType x;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinGeometryType();
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
					CpacsPackage.CABIN_GEOMETRY_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_GEOMETRY_TYPE__NAME, newName,
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
					CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CabinGeometryContoursType getContours() {
		return contours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContours(CabinGeometryContoursType newContours, NotificationChain msgs) {
		CabinGeometryContoursType oldContours = contours;
		contours = newContours;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS, oldContours, newContours);
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
	public void setContours(CabinGeometryContoursType newContours) {
		if (newContours != contours) {
			NotificationChain msgs = null;
			if (contours != null)
				msgs = ((InternalEObject) contours).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS, null, msgs);
			if (newContours != null)
				msgs = ((InternalEObject) newContours).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS, null, msgs);
			msgs = basicSetContours(newContours, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS,
					newContours, newContours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetX(DoubleVectorBaseType newX, NotificationChain msgs) {
		DoubleVectorBaseType oldX = x;
		x = newX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CABIN_GEOMETRY_TYPE__X, oldX, newX);
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
	public void setX(DoubleVectorBaseType newX) {
		if (newX != x) {
			NotificationChain msgs = null;
			if (x != null)
				msgs = ((InternalEObject) x).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__X, null, msgs);
			if (newX != null)
				msgs = ((InternalEObject) newX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CABIN_GEOMETRY_TYPE__X, null, msgs);
			msgs = basicSetX(newX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CABIN_GEOMETRY_TYPE__X, newX, newX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CABIN_GEOMETRY_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS:
			return basicSetContours(null, msgs);
		case CpacsPackage.CABIN_GEOMETRY_TYPE__X:
			return basicSetX(null, msgs);
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
		case CpacsPackage.CABIN_GEOMETRY_TYPE__NAME:
			return getName();
		case CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS:
			return getContours();
		case CpacsPackage.CABIN_GEOMETRY_TYPE__X:
			return getX();
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
		case CpacsPackage.CABIN_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS:
			setContours((CabinGeometryContoursType) newValue);
			return;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__X:
			setX((DoubleVectorBaseType) newValue);
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
		case CpacsPackage.CABIN_GEOMETRY_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS:
			setContours((CabinGeometryContoursType) null);
			return;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__X:
			setX((DoubleVectorBaseType) null);
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
		case CpacsPackage.CABIN_GEOMETRY_TYPE__NAME:
			return name != null;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__CONTOURS:
			return contours != null;
		case CpacsPackage.CABIN_GEOMETRY_TYPE__X:
			return x != null;
		}
		return super.eIsSet(featureID);
	}

} //CabinGeometryTypeImpl
