/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageElementsType#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageElementsType()
 * @model extendedMetaData="name='fuselageElementsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageElementsType_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageElementType> getElement();

} // FuselageElementsType
