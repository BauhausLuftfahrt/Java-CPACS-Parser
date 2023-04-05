/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Side Struts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Side strut(s) (Assumption: one end of the strut will connect to the main strut and the other end will be given as endPoint)
 * <!-- end-model-doc -->
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
public interface SideStrutsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Side Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StrutAssemblyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSideStrutsType_SideStrut()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='sideStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StrutAssemblyType> getSideStrut();

} // SideStrutsType
