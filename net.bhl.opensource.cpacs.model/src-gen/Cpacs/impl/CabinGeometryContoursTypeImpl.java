/**
 */
package Cpacs.impl;

import Cpacs.CabinGeometryContourType;
import Cpacs.CabinGeometryContoursType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Geometry Contours Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinGeometryContoursTypeImpl#getContour <em>Contour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinGeometryContoursTypeImpl extends ComplexBaseTypeImpl implements CabinGeometryContoursType {
	/**
	 * The cached value of the '{@link #getContour() <em>Contour</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContour()
	 * @generated
	 * @ordered
	 */
	protected EList<CabinGeometryContourType> contour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinGeometryContoursTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinGeometryContoursType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CabinGeometryContourType> getContour() {
		if (contour == null) {
			contour = new EObjectContainmentEList<CabinGeometryContourType>(CabinGeometryContourType.class, this,
					CpacsPackage.CABIN_GEOMETRY_CONTOURS_TYPE__CONTOUR);
		}
		return contour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CABIN_GEOMETRY_CONTOURS_TYPE__CONTOUR:
			return ((InternalEList<?>) getContour()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CABIN_GEOMETRY_CONTOURS_TYPE__CONTOUR:
			return getContour();
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
		case CpacsPackage.CABIN_GEOMETRY_CONTOURS_TYPE__CONTOUR:
			getContour().clear();
			getContour().addAll((Collection<? extends CabinGeometryContourType>) newValue);
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
		case CpacsPackage.CABIN_GEOMETRY_CONTOURS_TYPE__CONTOUR:
			getContour().clear();
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
		case CpacsPackage.CABIN_GEOMETRY_CONTOURS_TYPE__CONTOUR:
			return contour != null && !contour.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CabinGeometryContoursTypeImpl
