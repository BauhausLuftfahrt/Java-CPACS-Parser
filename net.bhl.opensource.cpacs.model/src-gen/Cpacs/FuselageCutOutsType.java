/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Cut Outs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageCutOutsType#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageCutOutsType()
 * @model extendedMetaData="name='fuselageCutOutsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageCutOutsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuselageCutOutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageCutOutsType_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuselageCutOutType> getElement();

} // FuselageCutOutsType
