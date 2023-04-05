/**
 */
package Cpacs.impl;

import Cpacs.BoundingBoxType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PointType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BoundingBoxTypeImpl#getDeltaX <em>Delta X</em>}</li>
 *   <li>{@link Cpacs.impl.BoundingBoxTypeImpl#getDeltaY <em>Delta Y</em>}</li>
 *   <li>{@link Cpacs.impl.BoundingBoxTypeImpl#getDeltaZ <em>Delta Z</em>}</li>
 *   <li>{@link Cpacs.impl.BoundingBoxTypeImpl#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundingBoxTypeImpl extends ComplexBaseTypeImpl implements BoundingBoxType {
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
	 * The cached value of the '{@link #getDeltaZ() <em>Delta Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaZ;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected PointType origin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundingBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBoundingBoxType();
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
					CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X, oldDeltaX, newDeltaX);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X, null, msgs);
			if (newDeltaX != null)
				msgs = ((InternalEObject) newDeltaX).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X, null, msgs);
			msgs = basicSetDeltaX(newDeltaX, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X, newDeltaX,
					newDeltaX));
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
					CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y, oldDeltaY, newDeltaY);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y, null, msgs);
			if (newDeltaY != null)
				msgs = ((InternalEObject) newDeltaY).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y, null, msgs);
			msgs = basicSetDeltaY(newDeltaY, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y, newDeltaY,
					newDeltaY));
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
					CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z, oldDeltaZ, newDeltaZ);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z, null, msgs);
			if (newDeltaZ != null)
				msgs = ((InternalEObject) newDeltaZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z, null, msgs);
			msgs = basicSetDeltaZ(newDeltaZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z, newDeltaZ,
					newDeltaZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(PointType newOrigin, NotificationChain msgs) {
		PointType oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN, oldOrigin, newOrigin);
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
	public void setOrigin(PointType newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject) origin).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject) newOrigin).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN, newOrigin,
					newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X:
			return basicSetDeltaX(null, msgs);
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y:
			return basicSetDeltaY(null, msgs);
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z:
			return basicSetDeltaZ(null, msgs);
		case CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN:
			return basicSetOrigin(null, msgs);
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
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X:
			return getDeltaX();
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y:
			return getDeltaY();
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z:
			return getDeltaZ();
		case CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN:
			return getOrigin();
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
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X:
			setDeltaX((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y:
			setDeltaY((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z:
			setDeltaZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN:
			setOrigin((PointType) newValue);
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
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X:
			setDeltaX((DoubleBaseType) null);
			return;
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y:
			setDeltaY((DoubleBaseType) null);
			return;
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z:
			setDeltaZ((DoubleBaseType) null);
			return;
		case CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN:
			setOrigin((PointType) null);
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
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_X:
			return deltaX != null;
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Y:
			return deltaY != null;
		case CpacsPackage.BOUNDING_BOX_TYPE__DELTA_Z:
			return deltaZ != null;
		case CpacsPackage.BOUNDING_BOX_TYPE__ORIGIN:
			return origin != null;
		}
		return super.eIsSet(featureID);
	}

} //BoundingBoxTypeImpl
