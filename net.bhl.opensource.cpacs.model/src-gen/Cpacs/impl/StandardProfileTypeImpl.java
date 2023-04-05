/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RectangleProfileType;
import Cpacs.StandardProfileType;
import Cpacs.SuperEllipseProfileType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Profile Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.StandardProfileTypeImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link Cpacs.impl.StandardProfileTypeImpl#getSuperEllipse <em>Super Ellipse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardProfileTypeImpl extends ComplexBaseTypeImpl implements StandardProfileType {
	/**
	 * The cached value of the '{@link #getRectangle() <em>Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangle()
	 * @generated
	 * @ordered
	 */
	protected RectangleProfileType rectangle;

	/**
	 * The cached value of the '{@link #getSuperEllipse() <em>Super Ellipse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEllipse()
	 * @generated
	 * @ordered
	 */
	protected SuperEllipseProfileType superEllipse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardProfileTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getStandardProfileType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleProfileType getRectangle() {
		return rectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectangle(RectangleProfileType newRectangle, NotificationChain msgs) {
		RectangleProfileType oldRectangle = rectangle;
		rectangle = newRectangle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE, oldRectangle, newRectangle);
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
	public void setRectangle(RectangleProfileType newRectangle) {
		if (newRectangle != rectangle) {
			NotificationChain msgs = null;
			if (rectangle != null)
				msgs = ((InternalEObject) rectangle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE, null, msgs);
			if (newRectangle != null)
				msgs = ((InternalEObject) newRectangle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE, null, msgs);
			msgs = basicSetRectangle(newRectangle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE,
					newRectangle, newRectangle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperEllipseProfileType getSuperEllipse() {
		return superEllipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperEllipse(SuperEllipseProfileType newSuperEllipse, NotificationChain msgs) {
		SuperEllipseProfileType oldSuperEllipse = superEllipse;
		superEllipse = newSuperEllipse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE, oldSuperEllipse, newSuperEllipse);
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
	public void setSuperEllipse(SuperEllipseProfileType newSuperEllipse) {
		if (newSuperEllipse != superEllipse) {
			NotificationChain msgs = null;
			if (superEllipse != null)
				msgs = ((InternalEObject) superEllipse).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE, null, msgs);
			if (newSuperEllipse != null)
				msgs = ((InternalEObject) newSuperEllipse).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE, null, msgs);
			msgs = basicSetSuperEllipse(newSuperEllipse, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE,
					newSuperEllipse, newSuperEllipse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE:
			return basicSetRectangle(null, msgs);
		case CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE:
			return basicSetSuperEllipse(null, msgs);
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
		case CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE:
			return getRectangle();
		case CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE:
			return getSuperEllipse();
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
		case CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE:
			setRectangle((RectangleProfileType) newValue);
			return;
		case CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE:
			setSuperEllipse((SuperEllipseProfileType) newValue);
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
		case CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE:
			setRectangle((RectangleProfileType) null);
			return;
		case CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE:
			setSuperEllipse((SuperEllipseProfileType) null);
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
		case CpacsPackage.STANDARD_PROFILE_TYPE__RECTANGLE:
			return rectangle != null;
		case CpacsPackage.STANDARD_PROFILE_TYPE__SUPER_ELLIPSE:
			return superEllipse != null;
		}
		return super.eIsSet(featureID);
	}

} //StandardProfileTypeImpl
