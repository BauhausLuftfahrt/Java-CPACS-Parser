/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intercostals Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.IntercostalsAssemblyType#getIntercostal <em>Intercostal</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getIntercostalsAssemblyType()
 * @model extendedMetaData="name='intercostalsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface IntercostalsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Intercostal</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.IntercostalPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercostal</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getIntercostalsAssemblyType_Intercostal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intercostal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IntercostalPositionType> getIntercostal();

} // IntercostalsAssemblyType
