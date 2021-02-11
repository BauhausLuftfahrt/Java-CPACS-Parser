/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stringers Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StringersAssemblyType#getStringer <em>Stringer</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStringersAssemblyType()
 * @model extendedMetaData="name='stringersAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface StringersAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Stringer</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringer</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getStringersAssemblyType_Stringer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stringer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringerType> getStringer();

} // StringersAssemblyType
