/**
 */
package Cpacs.impl;

import Cpacs.AeroelasticDivergenceType;
import Cpacs.AeroelasticStaticMaxDisplacementType;
import Cpacs.AeroelasticsType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aeroelastics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroelasticsTypeImpl#getDivergence <em>Divergence</em>}</li>
 *   <li>{@link Cpacs.impl.AeroelasticsTypeImpl#getStaticMaxDisplacement <em>Static Max Displacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroelasticsTypeImpl extends ComplexBaseTypeImpl implements AeroelasticsType {
	/**
	 * The cached value of the '{@link #getDivergence() <em>Divergence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivergence()
	 * @generated
	 * @ordered
	 */
	protected AeroelasticDivergenceType divergence;

	/**
	 * The cached value of the '{@link #getStaticMaxDisplacement() <em>Static Max Displacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticMaxDisplacement()
	 * @generated
	 * @ordered
	 */
	protected AeroelasticStaticMaxDisplacementType staticMaxDisplacement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroelasticsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroelasticsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroelasticDivergenceType getDivergence() {
		return divergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDivergence(AeroelasticDivergenceType newDivergence, NotificationChain msgs) {
		AeroelasticDivergenceType oldDivergence = divergence;
		divergence = newDivergence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE, oldDivergence, newDivergence);
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
	public void setDivergence(AeroelasticDivergenceType newDivergence) {
		if (newDivergence != divergence) {
			NotificationChain msgs = null;
			if (divergence != null)
				msgs = ((InternalEObject) divergence).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE, null, msgs);
			if (newDivergence != null)
				msgs = ((InternalEObject) newDivergence).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE, null, msgs);
			msgs = basicSetDivergence(newDivergence, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE,
					newDivergence, newDivergence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AeroelasticStaticMaxDisplacementType getStaticMaxDisplacement() {
		return staticMaxDisplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticMaxDisplacement(
			AeroelasticStaticMaxDisplacementType newStaticMaxDisplacement, NotificationChain msgs) {
		AeroelasticStaticMaxDisplacementType oldStaticMaxDisplacement = staticMaxDisplacement;
		staticMaxDisplacement = newStaticMaxDisplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT, oldStaticMaxDisplacement,
					newStaticMaxDisplacement);
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
	public void setStaticMaxDisplacement(AeroelasticStaticMaxDisplacementType newStaticMaxDisplacement) {
		if (newStaticMaxDisplacement != staticMaxDisplacement) {
			NotificationChain msgs = null;
			if (staticMaxDisplacement != null)
				msgs = ((InternalEObject) staticMaxDisplacement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT, null, msgs);
			if (newStaticMaxDisplacement != null)
				msgs = ((InternalEObject) newStaticMaxDisplacement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT, null, msgs);
			msgs = basicSetStaticMaxDisplacement(newStaticMaxDisplacement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT, newStaticMaxDisplacement,
					newStaticMaxDisplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE:
			return basicSetDivergence(null, msgs);
		case CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT:
			return basicSetStaticMaxDisplacement(null, msgs);
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
		case CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE:
			return getDivergence();
		case CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT:
			return getStaticMaxDisplacement();
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
		case CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE:
			setDivergence((AeroelasticDivergenceType) newValue);
			return;
		case CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT:
			setStaticMaxDisplacement((AeroelasticStaticMaxDisplacementType) newValue);
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
		case CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE:
			setDivergence((AeroelasticDivergenceType) null);
			return;
		case CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT:
			setStaticMaxDisplacement((AeroelasticStaticMaxDisplacementType) null);
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
		case CpacsPackage.AEROELASTICS_TYPE__DIVERGENCE:
			return divergence != null;
		case CpacsPackage.AEROELASTICS_TYPE__STATIC_MAX_DISPLACEMENT:
			return staticMaxDisplacement != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroelasticsTypeImpl
