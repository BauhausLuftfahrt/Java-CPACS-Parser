/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Pylons Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EnginePylonsType#getEnginePylon <em>Engine Pylon</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEnginePylonsType()
 * @model extendedMetaData="name='enginePylonsType' kind='elementOnly'"
 * @generated
 */
public interface EnginePylonsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Engine Pylon</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.EnginePylonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Pylon</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getEnginePylonsType_EnginePylon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='enginePylon' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnginePylonType> getEnginePylon();

} // EnginePylonsType
