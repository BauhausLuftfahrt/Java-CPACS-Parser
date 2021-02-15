/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Floor Beams Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LongFloorBeamsAssemblyType#getLongFloorBeam <em>Long Floor Beam</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLongFloorBeamsAssemblyType()
 * @model extendedMetaData="name='longFloorBeamsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface LongFloorBeamsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Long Floor Beam</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LongFloorBeamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Floor Beam</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLongFloorBeamsAssemblyType_LongFloorBeam()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longFloorBeam' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LongFloorBeamType> getLongFloorBeam();

} // LongFloorBeamsAssemblyType
