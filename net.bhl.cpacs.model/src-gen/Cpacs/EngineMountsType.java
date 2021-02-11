/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Mounts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineMountsType#getEngineMount <em>Engine Mount</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineMountsType()
 * @model extendedMetaData="name='engineMountsType' kind='elementOnly'"
 * @generated
 */
public interface EngineMountsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Engine Mount</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.EngineMountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Mount</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getEngineMountsType_EngineMount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='engineMount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EngineMountType> getEngineMount();

} // EngineMountsType
