/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MMoveableLeadingEdgesType;
import Cpacs.MMoveableTrailingEdgeType;
import Cpacs.MMoveablesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMoveables Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MMoveablesTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MMoveablesTypeImpl#getMMoveableLeadingEdges <em>MMoveable Leading Edges</em>}</li>
 *   <li>{@link Cpacs.impl.MMoveablesTypeImpl#getMMoveableTrailingEdge <em>MMoveable Trailing Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMoveablesTypeImpl extends ComplexBaseTypeImpl implements MMoveablesType {
	/**
	 * The cached value of the '{@link #getMassDescription() <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType massDescription;

	/**
	 * The cached value of the '{@link #getMMoveableLeadingEdges() <em>MMoveable Leading Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMoveableLeadingEdges()
	 * @generated
	 * @ordered
	 */
	protected MMoveableLeadingEdgesType mMoveableLeadingEdges;

	/**
	 * The cached value of the '{@link #getMMoveableTrailingEdge() <em>MMoveable Trailing Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMoveableTrailingEdge()
	 * @generated
	 * @ordered
	 */
	protected MMoveableTrailingEdgeType mMoveableTrailingEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMoveablesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMMoveablesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMassDescription() {
		return massDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassDescription(GenericMassType newMassDescription, NotificationChain msgs) {
		GenericMassType oldMassDescription = massDescription;
		massDescription = newMassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
	public void setMassDescription(GenericMassType newMassDescription) {
		if (newMassDescription != massDescription) {
			NotificationChain msgs = null;
			if (massDescription != null)
				msgs = ((InternalEObject) massDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION, null, msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION, null, msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION,
					newMassDescription, newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMoveableLeadingEdgesType getMMoveableLeadingEdges() {
		return mMoveableLeadingEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMoveableLeadingEdges(MMoveableLeadingEdgesType newMMoveableLeadingEdges,
			NotificationChain msgs) {
		MMoveableLeadingEdgesType oldMMoveableLeadingEdges = mMoveableLeadingEdges;
		mMoveableLeadingEdges = newMMoveableLeadingEdges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES, oldMMoveableLeadingEdges,
					newMMoveableLeadingEdges);
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
	public void setMMoveableLeadingEdges(MMoveableLeadingEdgesType newMMoveableLeadingEdges) {
		if (newMMoveableLeadingEdges != mMoveableLeadingEdges) {
			NotificationChain msgs = null;
			if (mMoveableLeadingEdges != null)
				msgs = ((InternalEObject) mMoveableLeadingEdges).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES, null, msgs);
			if (newMMoveableLeadingEdges != null)
				msgs = ((InternalEObject) newMMoveableLeadingEdges).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES, null, msgs);
			msgs = basicSetMMoveableLeadingEdges(newMMoveableLeadingEdges, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES,
					newMMoveableLeadingEdges, newMMoveableLeadingEdges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MMoveableTrailingEdgeType getMMoveableTrailingEdge() {
		return mMoveableTrailingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMMoveableTrailingEdge(MMoveableTrailingEdgeType newMMoveableTrailingEdge,
			NotificationChain msgs) {
		MMoveableTrailingEdgeType oldMMoveableTrailingEdge = mMoveableTrailingEdge;
		mMoveableTrailingEdge = newMMoveableTrailingEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE, oldMMoveableTrailingEdge,
					newMMoveableTrailingEdge);
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
	public void setMMoveableTrailingEdge(MMoveableTrailingEdgeType newMMoveableTrailingEdge) {
		if (newMMoveableTrailingEdge != mMoveableTrailingEdge) {
			NotificationChain msgs = null;
			if (mMoveableTrailingEdge != null)
				msgs = ((InternalEObject) mMoveableTrailingEdge).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE, null, msgs);
			if (newMMoveableTrailingEdge != null)
				msgs = ((InternalEObject) newMMoveableTrailingEdge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE, null, msgs);
			msgs = basicSetMMoveableTrailingEdge(newMMoveableTrailingEdge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE,
					newMMoveableTrailingEdge, newMMoveableTrailingEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES:
			return basicSetMMoveableLeadingEdges(null, msgs);
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE:
			return basicSetMMoveableTrailingEdge(null, msgs);
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
		case CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES:
			return getMMoveableLeadingEdges();
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE:
			return getMMoveableTrailingEdge();
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
		case CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES:
			setMMoveableLeadingEdges((MMoveableLeadingEdgesType) newValue);
			return;
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE:
			setMMoveableTrailingEdge((MMoveableTrailingEdgeType) newValue);
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
		case CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES:
			setMMoveableLeadingEdges((MMoveableLeadingEdgesType) null);
			return;
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE:
			setMMoveableTrailingEdge((MMoveableTrailingEdgeType) null);
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
		case CpacsPackage.MMOVEABLES_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_LEADING_EDGES:
			return mMoveableLeadingEdges != null;
		case CpacsPackage.MMOVEABLES_TYPE__MMOVEABLE_TRAILING_EDGE:
			return mMoveableTrailingEdge != null;
		}
		return super.eIsSet(featureID);
	}

} //MMoveablesTypeImpl
