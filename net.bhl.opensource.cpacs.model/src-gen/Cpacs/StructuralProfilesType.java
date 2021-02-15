/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StructuralProfilesType#getStructuralProfile2D <em>Structural Profile2 D</em>}</li>
 *   <li>{@link Cpacs.StructuralProfilesType#getStructuralProfile3D <em>Structural Profile3 D</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStructuralProfilesType()
 * @model extendedMetaData="name='structuralProfilesType' kind='elementOnly'"
 * @generated
 */
public interface StructuralProfilesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Profile2 D</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StructuralProfileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Profile2 D</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getStructuralProfilesType_StructuralProfile2D()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralProfile2D' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructuralProfileType> getStructuralProfile2D();

	/**
	 * Returns the value of the '<em><b>Structural Profile3 D</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StructuralProfile3DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Profile3 D</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getStructuralProfilesType_StructuralProfile3D()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralProfile3D' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructuralProfile3DType> getStructuralProfile3D();

} // StructuralProfilesType
