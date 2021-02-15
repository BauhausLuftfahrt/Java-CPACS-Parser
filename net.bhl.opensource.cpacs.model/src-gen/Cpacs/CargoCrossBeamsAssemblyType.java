/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargo Cross Beams Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CargoCrossBeamsAssemblyType#getCargoCrossBeam <em>Cargo Cross Beam</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCargoCrossBeamsAssemblyType()
 * @model extendedMetaData="name='cargoCrossBeamsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface CargoCrossBeamsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cargo Cross Beam</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CrossBeamAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Cross Beam</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCargoCrossBeamsAssemblyType_CargoCrossBeam()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cargoCrossBeam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CrossBeamAssemblyPositionType> getCargoCrossBeam();

} // CargoCrossBeamsAssemblyType
