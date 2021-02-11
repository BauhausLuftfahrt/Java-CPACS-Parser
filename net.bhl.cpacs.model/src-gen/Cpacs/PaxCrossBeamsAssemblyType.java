/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pax Cross Beams Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PaxCrossBeamsAssemblyType#getPaxCrossBeam <em>Pax Cross Beam</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPaxCrossBeamsAssemblyType()
 * @model extendedMetaData="name='paxCrossBeamsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface PaxCrossBeamsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pax Cross Beam</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CrossBeamAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Cross Beam</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPaxCrossBeamsAssemblyType_PaxCrossBeam()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paxCrossBeam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CrossBeamAssemblyPositionType> getPaxCrossBeam();

} // PaxCrossBeamsAssemblyType
