/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.MaterialDefinitionForProfileBasedPointType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Definition For Profile Based Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedPointTypeImpl#getPointUID <em>Point UID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedPointTypeImpl#getMaterialUID <em>Material UID</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedPointTypeImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedPointTypeImpl#getOptionalAux1 <em>Optional Aux1</em>}</li>
 *   <li>{@link Cpacs.impl.MaterialDefinitionForProfileBasedPointTypeImpl#getOptionalAux2 <em>Optional Aux2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialDefinitionForProfileBasedPointTypeImpl extends ComplexBaseTypeImpl
		implements MaterialDefinitionForProfileBasedPointType {
	/**
	 * The cached value of the '{@link #getPointUID() <em>Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType pointUID;

	/**
	 * The cached value of the '{@link #getMaterialUID() <em>Material UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType materialUID;

	/**
	 * The cached value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType crossSectionArea;

	/**
	 * The cached value of the '{@link #getOptionalAux1() <em>Optional Aux1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAux1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType optionalAux1;

	/**
	 * The cached value of the '{@link #getOptionalAux2() <em>Optional Aux2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalAux2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType optionalAux2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialDefinitionForProfileBasedPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMaterialDefinitionForProfileBasedPointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getPointUID() {
		return pointUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointUID(StringUIDBaseType newPointUID, NotificationChain msgs) {
		StringUIDBaseType oldPointUID = pointUID;
		pointUID = newPointUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID, oldPointUID, newPointUID);
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
	public void setPointUID(StringUIDBaseType newPointUID) {
		if (newPointUID != pointUID) {
			NotificationChain msgs = null;
			if (pointUID != null)
				msgs = ((InternalEObject) pointUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID, null, msgs);
			if (newPointUID != null)
				msgs = ((InternalEObject) newPointUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID, null, msgs);
			msgs = basicSetPointUID(newPointUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID, newPointUID,
					newPointUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMaterialUID() {
		return materialUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialUID(StringUIDBaseType newMaterialUID, NotificationChain msgs) {
		StringUIDBaseType oldMaterialUID = materialUID;
		materialUID = newMaterialUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID, oldMaterialUID,
					newMaterialUID);
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
	public void setMaterialUID(StringUIDBaseType newMaterialUID) {
		if (newMaterialUID != materialUID) {
			NotificationChain msgs = null;
			if (materialUID != null)
				msgs = ((InternalEObject) materialUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID,
						null, msgs);
			if (newMaterialUID != null)
				msgs = ((InternalEObject) newMaterialUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID,
						null, msgs);
			msgs = basicSetMaterialUID(newMaterialUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID, newMaterialUID,
					newMaterialUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCrossSectionArea() {
		return crossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossSectionArea(DoubleBaseType newCrossSectionArea, NotificationChain msgs) {
		DoubleBaseType oldCrossSectionArea = crossSectionArea;
		crossSectionArea = newCrossSectionArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA,
					oldCrossSectionArea, newCrossSectionArea);
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
	public void setCrossSectionArea(DoubleBaseType newCrossSectionArea) {
		if (newCrossSectionArea != crossSectionArea) {
			NotificationChain msgs = null;
			if (crossSectionArea != null)
				msgs = ((InternalEObject) crossSectionArea).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA,
						null, msgs);
			if (newCrossSectionArea != null)
				msgs = ((InternalEObject) newCrossSectionArea).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA,
						null, msgs);
			msgs = basicSetCrossSectionArea(newCrossSectionArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA,
					newCrossSectionArea, newCrossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOptionalAux1() {
		return optionalAux1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalAux1(DoubleBaseType newOptionalAux1, NotificationChain msgs) {
		DoubleBaseType oldOptionalAux1 = optionalAux1;
		optionalAux1 = newOptionalAux1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1, oldOptionalAux1,
					newOptionalAux1);
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
	public void setOptionalAux1(DoubleBaseType newOptionalAux1) {
		if (newOptionalAux1 != optionalAux1) {
			NotificationChain msgs = null;
			if (optionalAux1 != null)
				msgs = ((InternalEObject) optionalAux1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1,
						null, msgs);
			if (newOptionalAux1 != null)
				msgs = ((InternalEObject) newOptionalAux1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1,
						null, msgs);
			msgs = basicSetOptionalAux1(newOptionalAux1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1, newOptionalAux1,
					newOptionalAux1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getOptionalAux2() {
		return optionalAux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalAux2(DoubleBaseType newOptionalAux2, NotificationChain msgs) {
		DoubleBaseType oldOptionalAux2 = optionalAux2;
		optionalAux2 = newOptionalAux2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2, oldOptionalAux2,
					newOptionalAux2);
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
	public void setOptionalAux2(DoubleBaseType newOptionalAux2) {
		if (newOptionalAux2 != optionalAux2) {
			NotificationChain msgs = null;
			if (optionalAux2 != null)
				msgs = ((InternalEObject) optionalAux2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2,
						null, msgs);
			if (newOptionalAux2 != null)
				msgs = ((InternalEObject) newOptionalAux2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2,
						null, msgs);
			msgs = basicSetOptionalAux2(newOptionalAux2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2, newOptionalAux2,
					newOptionalAux2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID:
			return basicSetPointUID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID:
			return basicSetMaterialUID(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA:
			return basicSetCrossSectionArea(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1:
			return basicSetOptionalAux1(null, msgs);
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2:
			return basicSetOptionalAux2(null, msgs);
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID:
			return getPointUID();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID:
			return getMaterialUID();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA:
			return getCrossSectionArea();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1:
			return getOptionalAux1();
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2:
			return getOptionalAux2();
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID:
			setPointUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA:
			setCrossSectionArea((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1:
			setOptionalAux1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2:
			setOptionalAux2((DoubleBaseType) newValue);
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID:
			setPointUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID:
			setMaterialUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA:
			setCrossSectionArea((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1:
			setOptionalAux1((DoubleBaseType) null);
			return;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2:
			setOptionalAux2((DoubleBaseType) null);
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
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__POINT_UID:
			return pointUID != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__MATERIAL_UID:
			return materialUID != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__CROSS_SECTION_AREA:
			return crossSectionArea != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX1:
			return optionalAux1 != null;
		case CpacsPackage.MATERIAL_DEFINITION_FOR_PROFILE_BASED_POINT_TYPE__OPTIONAL_AUX2:
			return optionalAux2 != null;
		}
		return super.eIsSet(featureID);
	}

} //MaterialDefinitionForProfileBasedPointTypeImpl
