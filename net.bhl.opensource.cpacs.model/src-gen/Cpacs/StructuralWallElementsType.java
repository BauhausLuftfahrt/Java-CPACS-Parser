/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Wall Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StructuralWallElementsType#getStructuralWallElement <em>Structural Wall Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStructuralWallElementsType()
 * @model extendedMetaData="name='structuralWallElementsType' kind='elementOnly'"
 * @generated
 */
public interface StructuralWallElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Wall Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StructuralWallElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural wall reinforcement definition specifying physical properties of a fuselage wall segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Wall Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getStructuralWallElementsType_StructuralWallElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralWallElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StructuralWallElementType> getStructuralWallElement();

} // StructuralWallElementsType
