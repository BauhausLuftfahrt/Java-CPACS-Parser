/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Contours Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceContoursType#getIntermediateAirfoil <em>Intermediate Airfoil</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceContoursType()
 * @model extendedMetaData="name='controlSurfaceContoursType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceContoursType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Intermediate Airfoil</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlSurfaceAirfoilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Airfoil</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlSurfaceContoursType_IntermediateAirfoil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='intermediateAirfoil' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSurfaceAirfoilType> getIntermediateAirfoil();

} // ControlSurfaceContoursType
