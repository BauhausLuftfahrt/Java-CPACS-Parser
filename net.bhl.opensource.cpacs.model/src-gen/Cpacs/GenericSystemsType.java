/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericSystemsType#getGenericSystem <em>Generic System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericSystemsType()
 * @model extendedMetaData="name='genericSystemsType' kind='elementOnly'"
 * @generated
 */
public interface GenericSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Generic System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGenericSystemsType_GenericSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='genericSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericSystemType> getGenericSystem();

} // GenericSystemsType
