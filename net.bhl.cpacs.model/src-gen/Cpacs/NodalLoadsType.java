/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodal Loads Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NodalLoadsType#getFuselageNodalLoad <em>Fuselage Nodal Load</em>}</li>
 *   <li>{@link Cpacs.NodalLoadsType#getWingNodalLoad <em>Wing Nodal Load</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNodalLoadsType()
 * @model extendedMetaData="name='nodalLoadsType' kind='elementOnly'"
 * @generated
 */
public interface NodalLoadsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage Nodal Load</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.NodalLoadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Nodal Load</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getNodalLoadsType_FuselageNodalLoad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageNodalLoad' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodalLoadType> getFuselageNodalLoad();

	/**
	 * Returns the value of the '<em><b>Wing Nodal Load</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.NodalLoadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Nodal Load</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getNodalLoadsType_WingNodalLoad()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingNodalLoad' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NodalLoadType> getWingNodalLoad();

} // NodalLoadsType
