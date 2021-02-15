/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tied Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TiedInterfacesType#getTiedInterface <em>Tied Interface</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTiedInterfacesType()
 * @model extendedMetaData="name='tiedInterfacesType' kind='elementOnly'"
 * @generated
 */
public interface TiedInterfacesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Tied Interface</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TiedInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tied Interface</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTiedInterfacesType_TiedInterface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TiedInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TiedInterfaceType> getTiedInterface();

} // TiedInterfacesType
