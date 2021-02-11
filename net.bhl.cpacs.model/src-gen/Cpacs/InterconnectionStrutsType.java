/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interconnection Struts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.InterconnectionStrutsType#getInterconnectionStrut <em>Interconnection Strut</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getInterconnectionStrutsType()
 * @model extendedMetaData="name='interconnectionStrutsType' kind='elementOnly'"
 * @generated
 */
public interface InterconnectionStrutsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Interconnection Strut</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.InterconnectionStrutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of one interconnection strut.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnection Strut</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getInterconnectionStrutsType_InterconnectionStrut()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='interconnectionStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterconnectionStrutType> getInterconnectionStrut();

} // InterconnectionStrutsType
