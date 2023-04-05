/**
 */
package Cpacs.impl;

import Cpacs.BoundingBoxType;
import Cpacs.CpacsPackage;
import Cpacs.DeckElementGeometryType;
import Cpacs.GenericGeometryComponentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Element Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckElementGeometryTypeImpl#getGenericGeometryComponent <em>Generic Geometry Component</em>}</li>
 *   <li>{@link Cpacs.impl.DeckElementGeometryTypeImpl#getBoundingBox <em>Bounding Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckElementGeometryTypeImpl extends ComplexBaseTypeImpl implements DeckElementGeometryType {
	/**
	 * The cached value of the '{@link #getGenericGeometryComponent() <em>Generic Geometry Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericGeometryComponent()
	 * @generated
	 * @ordered
	 */
	protected GenericGeometryComponentType genericGeometryComponent;

	/**
	 * The cached value of the '{@link #getBoundingBox() <em>Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingBox()
	 * @generated
	 * @ordered
	 */
	protected BoundingBoxType boundingBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckElementGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckElementGeometryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericGeometryComponentType getGenericGeometryComponent() {
		return genericGeometryComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericGeometryComponent(GenericGeometryComponentType newGenericGeometryComponent,
			NotificationChain msgs) {
		GenericGeometryComponentType oldGenericGeometryComponent = genericGeometryComponent;
		genericGeometryComponent = newGenericGeometryComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT, oldGenericGeometryComponent,
					newGenericGeometryComponent);
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
	public void setGenericGeometryComponent(GenericGeometryComponentType newGenericGeometryComponent) {
		if (newGenericGeometryComponent != genericGeometryComponent) {
			NotificationChain msgs = null;
			if (genericGeometryComponent != null)
				msgs = ((InternalEObject) genericGeometryComponent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT,
						null, msgs);
			if (newGenericGeometryComponent != null)
				msgs = ((InternalEObject) newGenericGeometryComponent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT,
						null, msgs);
			msgs = basicSetGenericGeometryComponent(newGenericGeometryComponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT, newGenericGeometryComponent,
					newGenericGeometryComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBoxType getBoundingBox() {
		return boundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingBox(BoundingBoxType newBoundingBox, NotificationChain msgs) {
		BoundingBoxType oldBoundingBox = boundingBox;
		boundingBox = newBoundingBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX, oldBoundingBox, newBoundingBox);
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
	public void setBoundingBox(BoundingBoxType newBoundingBox) {
		if (newBoundingBox != boundingBox) {
			NotificationChain msgs = null;
			if (boundingBox != null)
				msgs = ((InternalEObject) boundingBox).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX, null, msgs);
			if (newBoundingBox != null)
				msgs = ((InternalEObject) newBoundingBox).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX, null, msgs);
			msgs = basicSetBoundingBox(newBoundingBox, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX,
					newBoundingBox, newBoundingBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT:
			return basicSetGenericGeometryComponent(null, msgs);
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX:
			return basicSetBoundingBox(null, msgs);
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
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT:
			return getGenericGeometryComponent();
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX:
			return getBoundingBox();
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
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT:
			setGenericGeometryComponent((GenericGeometryComponentType) newValue);
			return;
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX:
			setBoundingBox((BoundingBoxType) newValue);
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
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT:
			setGenericGeometryComponent((GenericGeometryComponentType) null);
			return;
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX:
			setBoundingBox((BoundingBoxType) null);
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
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__GENERIC_GEOMETRY_COMPONENT:
			return genericGeometryComponent != null;
		case CpacsPackage.DECK_ELEMENT_GEOMETRY_TYPE__BOUNDING_BOX:
			return boundingBox != null;
		}
		return super.eIsSet(featureID);
	}

} //DeckElementGeometryTypeImpl
