/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.PlasticityCurvePointsType;
import Cpacs.PlasticityCurveType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plasticity Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PlasticityCurveTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.PlasticityCurveTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.PlasticityCurveTypeImpl#getStrainRate <em>Strain Rate</em>}</li>
 *   <li>{@link Cpacs.impl.PlasticityCurveTypeImpl#getPlasticityCurvePoints <em>Plasticity Curve Points</em>}</li>
 *   <li>{@link Cpacs.impl.PlasticityCurveTypeImpl#getPlasticEliminationStrain <em>Plastic Elimination Strain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlasticityCurveTypeImpl extends ComplexBaseTypeImpl implements PlasticityCurveType {
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
	 * The cached value of the '{@link #getStrainRate() <em>Strain Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrainRate()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType strainRate;

	/**
	 * The cached value of the '{@link #getPlasticityCurvePoints() <em>Plasticity Curve Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticityCurvePoints()
	 * @generated
	 * @ordered
	 */
	protected PlasticityCurvePointsType plasticityCurvePoints;

	/**
	 * The cached value of the '{@link #getPlasticEliminationStrain() <em>Plastic Elimination Strain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticEliminationStrain()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType plasticEliminationStrain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlasticityCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPlasticityCurveType();
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
					CpacsPackage.PLASTICITY_CURVE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PLASTICITY_CURVE_TYPE__NAME, newName,
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
					CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStrainRate() {
		return strainRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrainRate(DoubleBaseType newStrainRate, NotificationChain msgs) {
		DoubleBaseType oldStrainRate = strainRate;
		strainRate = newStrainRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE, oldStrainRate, newStrainRate);
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
	public void setStrainRate(DoubleBaseType newStrainRate) {
		if (newStrainRate != strainRate) {
			NotificationChain msgs = null;
			if (strainRate != null)
				msgs = ((InternalEObject) strainRate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE, null, msgs);
			if (newStrainRate != null)
				msgs = ((InternalEObject) newStrainRate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE, null, msgs);
			msgs = basicSetStrainRate(newStrainRate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE,
					newStrainRate, newStrainRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlasticityCurvePointsType getPlasticityCurvePoints() {
		return plasticityCurvePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlasticityCurvePoints(PlasticityCurvePointsType newPlasticityCurvePoints,
			NotificationChain msgs) {
		PlasticityCurvePointsType oldPlasticityCurvePoints = plasticityCurvePoints;
		plasticityCurvePoints = newPlasticityCurvePoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS, oldPlasticityCurvePoints,
					newPlasticityCurvePoints);
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
	public void setPlasticityCurvePoints(PlasticityCurvePointsType newPlasticityCurvePoints) {
		if (newPlasticityCurvePoints != plasticityCurvePoints) {
			NotificationChain msgs = null;
			if (plasticityCurvePoints != null)
				msgs = ((InternalEObject) plasticityCurvePoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS, null,
						msgs);
			if (newPlasticityCurvePoints != null)
				msgs = ((InternalEObject) newPlasticityCurvePoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS, null,
						msgs);
			msgs = basicSetPlasticityCurvePoints(newPlasticityCurvePoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS, newPlasticityCurvePoints,
					newPlasticityCurvePoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPlasticEliminationStrain() {
		return plasticEliminationStrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlasticEliminationStrain(DoubleBaseType newPlasticEliminationStrain,
			NotificationChain msgs) {
		DoubleBaseType oldPlasticEliminationStrain = plasticEliminationStrain;
		plasticEliminationStrain = newPlasticEliminationStrain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN, oldPlasticEliminationStrain,
					newPlasticEliminationStrain);
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
	public void setPlasticEliminationStrain(DoubleBaseType newPlasticEliminationStrain) {
		if (newPlasticEliminationStrain != plasticEliminationStrain) {
			NotificationChain msgs = null;
			if (plasticEliminationStrain != null)
				msgs = ((InternalEObject) plasticEliminationStrain).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN, null,
						msgs);
			if (newPlasticEliminationStrain != null)
				msgs = ((InternalEObject) newPlasticEliminationStrain).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN, null,
						msgs);
			msgs = basicSetPlasticEliminationStrain(newPlasticEliminationStrain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN, newPlasticEliminationStrain,
					newPlasticEliminationStrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PLASTICITY_CURVE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE:
			return basicSetStrainRate(null, msgs);
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS:
			return basicSetPlasticityCurvePoints(null, msgs);
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN:
			return basicSetPlasticEliminationStrain(null, msgs);
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
		case CpacsPackage.PLASTICITY_CURVE_TYPE__NAME:
			return getName();
		case CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE:
			return getStrainRate();
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS:
			return getPlasticityCurvePoints();
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN:
			return getPlasticEliminationStrain();
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
		case CpacsPackage.PLASTICITY_CURVE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE:
			setStrainRate((DoubleBaseType) newValue);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS:
			setPlasticityCurvePoints((PlasticityCurvePointsType) newValue);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN:
			setPlasticEliminationStrain((DoubleBaseType) newValue);
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
		case CpacsPackage.PLASTICITY_CURVE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE:
			setStrainRate((DoubleBaseType) null);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS:
			setPlasticityCurvePoints((PlasticityCurvePointsType) null);
			return;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN:
			setPlasticEliminationStrain((DoubleBaseType) null);
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
		case CpacsPackage.PLASTICITY_CURVE_TYPE__NAME:
			return name != null;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__STRAIN_RATE:
			return strainRate != null;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTICITY_CURVE_POINTS:
			return plasticityCurvePoints != null;
		case CpacsPackage.PLASTICITY_CURVE_TYPE__PLASTIC_ELIMINATION_STRAIN:
			return plasticEliminationStrain != null;
		}
		return super.eIsSet(featureID);
	}

} //PlasticityCurveTypeImpl
