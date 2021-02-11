/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Components Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericComponentsCoefficientsType#getGenericComponent <em>Generic Component</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericComponentsCoefficientsType()
 * @model extendedMetaData="name='genericComponentsCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface GenericComponentsCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Generic Component</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericComponentCoefficientsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Component</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGenericComponentsCoefficientsType_GenericComponent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='genericComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericComponentCoefficientsType> getGenericComponent();

} // GenericComponentsCoefficientsType
