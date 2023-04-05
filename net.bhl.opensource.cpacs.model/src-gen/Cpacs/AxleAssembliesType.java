/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axle Assemblies Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AxleAssembliesType#getAxleAssembly <em>Axle Assembly</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAxleAssembliesType()
 * @model extendedMetaData="name='axleAssembliesType' kind='elementOnly'"
 * @generated
 */
public interface AxleAssembliesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Axle Assembly</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AxleAssemblyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axle Assembly</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAxleAssembliesType_AxleAssembly()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='axleAssembly' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AxleAssemblyType> getAxleAssembly();

} // AxleAssembliesType
