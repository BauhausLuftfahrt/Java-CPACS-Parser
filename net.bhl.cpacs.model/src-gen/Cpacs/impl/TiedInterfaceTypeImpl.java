/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TiedInterfaceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tied Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TiedInterfaceTypeImpl#getStructuralMember1UID <em>Structural Member1 UID</em>}</li>
 *   <li>{@link Cpacs.impl.TiedInterfaceTypeImpl#getStructuralMember2UID <em>Structural Member2 UID</em>}</li>
 *   <li>{@link Cpacs.impl.TiedInterfaceTypeImpl#getConnectionSearchRadius <em>Connection Search Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TiedInterfaceTypeImpl extends ComplexBaseTypeImpl implements TiedInterfaceType {
	/**
	 * The cached value of the '{@link #getStructuralMember1UID() <em>Structural Member1 UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMember1UID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> structuralMember1UID;

	/**
	 * The cached value of the '{@link #getStructuralMember2UID() <em>Structural Member2 UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMember2UID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> structuralMember2UID;

	/**
	 * The cached value of the '{@link #getConnectionSearchRadius() <em>Connection Search Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionSearchRadius()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType connectionSearchRadius;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TiedInterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTiedInterfaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getStructuralMember1UID() {
		if (structuralMember1UID == null) {
			structuralMember1UID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER1_UID);
		}
		return structuralMember1UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getStructuralMember2UID() {
		if (structuralMember2UID == null) {
			structuralMember2UID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER2_UID);
		}
		return structuralMember2UID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getConnectionSearchRadius() {
		return connectionSearchRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionSearchRadius(DoubleBaseType newConnectionSearchRadius,
			NotificationChain msgs) {
		DoubleBaseType oldConnectionSearchRadius = connectionSearchRadius;
		connectionSearchRadius = newConnectionSearchRadius;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS, oldConnectionSearchRadius,
					newConnectionSearchRadius);
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
	public void setConnectionSearchRadius(DoubleBaseType newConnectionSearchRadius) {
		if (newConnectionSearchRadius != connectionSearchRadius) {
			NotificationChain msgs = null;
			if (connectionSearchRadius != null)
				msgs = ((InternalEObject) connectionSearchRadius).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS, null,
						msgs);
			if (newConnectionSearchRadius != null)
				msgs = ((InternalEObject) newConnectionSearchRadius).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS, null,
						msgs);
			msgs = basicSetConnectionSearchRadius(newConnectionSearchRadius, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS, newConnectionSearchRadius,
					newConnectionSearchRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER1_UID:
			return ((InternalEList<?>) getStructuralMember1UID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER2_UID:
			return ((InternalEList<?>) getStructuralMember2UID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS:
			return basicSetConnectionSearchRadius(null, msgs);
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
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER1_UID:
			return getStructuralMember1UID();
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER2_UID:
			return getStructuralMember2UID();
		case CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS:
			return getConnectionSearchRadius();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER1_UID:
			getStructuralMember1UID().clear();
			getStructuralMember1UID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER2_UID:
			getStructuralMember2UID().clear();
			getStructuralMember2UID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS:
			setConnectionSearchRadius((DoubleBaseType) newValue);
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
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER1_UID:
			getStructuralMember1UID().clear();
			return;
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER2_UID:
			getStructuralMember2UID().clear();
			return;
		case CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS:
			setConnectionSearchRadius((DoubleBaseType) null);
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
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER1_UID:
			return structuralMember1UID != null && !structuralMember1UID.isEmpty();
		case CpacsPackage.TIED_INTERFACE_TYPE__STRUCTURAL_MEMBER2_UID:
			return structuralMember2UID != null && !structuralMember2UID.isEmpty();
		case CpacsPackage.TIED_INTERFACE_TYPE__CONNECTION_SEARCH_RADIUS:
			return connectionSearchRadius != null;
		}
		return super.eIsSet(featureID);
	}

} //TiedInterfaceTypeImpl
