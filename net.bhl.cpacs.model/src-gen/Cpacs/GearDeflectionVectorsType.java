/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gear Deflection Vectors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GearDeflectionVectorsType#getGear <em>Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGearDeflectionVectorsType()
 * @model extendedMetaData="name='gearDeflectionVectorsType' kind='elementOnly'"
 * @generated
 */
public interface GearDeflectionVectorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GearDeflectionVectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGearDeflectionVectorsType_Gear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GearDeflectionVectorType> getGear();

} // GearDeflectionVectorsType
