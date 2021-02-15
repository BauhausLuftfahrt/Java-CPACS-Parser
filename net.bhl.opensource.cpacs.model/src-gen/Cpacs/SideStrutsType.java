/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Side Struts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SideStrutsType#getSideStrut <em>Side Strut</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSideStrutsType()
 * @model extendedMetaData="name='sideStrutsType' kind='elementOnly'"
 * @generated
 */
public interface SideStrutsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Side Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StrutWithActuatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSideStrutsType_SideStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sideStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StrutWithActuatorType> getSideStrut();

} // SideStrutsType
