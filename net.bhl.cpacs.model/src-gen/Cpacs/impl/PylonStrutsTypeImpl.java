/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PylonStrutsType;
import Cpacs.StrutType;
import Cpacs.TangentLinksType;
import Cpacs.UpperLinksType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Struts Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonStrutsTypeImpl#getDragStrut <em>Drag Strut</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStrutsTypeImpl#getUpperLinks <em>Upper Links</em>}</li>
 *   <li>{@link Cpacs.impl.PylonStrutsTypeImpl#getTangentLinks <em>Tangent Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonStrutsTypeImpl extends ComplexBaseTypeImpl implements PylonStrutsType {
	/**
	 * The cached value of the '{@link #getDragStrut() <em>Drag Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDragStrut()
	 * @generated
	 * @ordered
	 */
	protected StrutType dragStrut;

	/**
	 * The cached value of the '{@link #getUpperLinks() <em>Upper Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperLinks()
	 * @generated
	 * @ordered
	 */
	protected UpperLinksType upperLinks;

	/**
	 * The cached value of the '{@link #getTangentLinks() <em>Tangent Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTangentLinks()
	 * @generated
	 * @ordered
	 */
	protected TangentLinksType tangentLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PylonStrutsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonStrutsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StrutType getDragStrut() {
		return dragStrut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDragStrut(StrutType newDragStrut, NotificationChain msgs) {
		StrutType oldDragStrut = dragStrut;
		dragStrut = newDragStrut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT, oldDragStrut, newDragStrut);
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
	public void setDragStrut(StrutType newDragStrut) {
		if (newDragStrut != dragStrut) {
			NotificationChain msgs = null;
			if (dragStrut != null)
				msgs = ((InternalEObject) dragStrut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT, null, msgs);
			if (newDragStrut != null)
				msgs = ((InternalEObject) newDragStrut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT, null, msgs);
			msgs = basicSetDragStrut(newDragStrut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT,
					newDragStrut, newDragStrut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpperLinksType getUpperLinks() {
		return upperLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperLinks(UpperLinksType newUpperLinks, NotificationChain msgs) {
		UpperLinksType oldUpperLinks = upperLinks;
		upperLinks = newUpperLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS, oldUpperLinks, newUpperLinks);
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
	public void setUpperLinks(UpperLinksType newUpperLinks) {
		if (newUpperLinks != upperLinks) {
			NotificationChain msgs = null;
			if (upperLinks != null)
				msgs = ((InternalEObject) upperLinks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS, null, msgs);
			if (newUpperLinks != null)
				msgs = ((InternalEObject) newUpperLinks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS, null, msgs);
			msgs = basicSetUpperLinks(newUpperLinks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS,
					newUpperLinks, newUpperLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TangentLinksType getTangentLinks() {
		return tangentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTangentLinks(TangentLinksType newTangentLinks, NotificationChain msgs) {
		TangentLinksType oldTangentLinks = tangentLinks;
		tangentLinks = newTangentLinks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS, oldTangentLinks, newTangentLinks);
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
	public void setTangentLinks(TangentLinksType newTangentLinks) {
		if (newTangentLinks != tangentLinks) {
			NotificationChain msgs = null;
			if (tangentLinks != null)
				msgs = ((InternalEObject) tangentLinks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS, null, msgs);
			if (newTangentLinks != null)
				msgs = ((InternalEObject) newTangentLinks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS, null, msgs);
			msgs = basicSetTangentLinks(newTangentLinks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS,
					newTangentLinks, newTangentLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT:
			return basicSetDragStrut(null, msgs);
		case CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS:
			return basicSetUpperLinks(null, msgs);
		case CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS:
			return basicSetTangentLinks(null, msgs);
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
		case CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT:
			return getDragStrut();
		case CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS:
			return getUpperLinks();
		case CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS:
			return getTangentLinks();
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
		case CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT:
			setDragStrut((StrutType) newValue);
			return;
		case CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS:
			setUpperLinks((UpperLinksType) newValue);
			return;
		case CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS:
			setTangentLinks((TangentLinksType) newValue);
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
		case CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT:
			setDragStrut((StrutType) null);
			return;
		case CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS:
			setUpperLinks((UpperLinksType) null);
			return;
		case CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS:
			setTangentLinks((TangentLinksType) null);
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
		case CpacsPackage.PYLON_STRUTS_TYPE__DRAG_STRUT:
			return dragStrut != null;
		case CpacsPackage.PYLON_STRUTS_TYPE__UPPER_LINKS:
			return upperLinks != null;
		case CpacsPackage.PYLON_STRUTS_TYPE__TANGENT_LINKS:
			return tangentLinks != null;
		}
		return super.eIsSet(featureID);
	}

} //PylonStrutsTypeImpl
