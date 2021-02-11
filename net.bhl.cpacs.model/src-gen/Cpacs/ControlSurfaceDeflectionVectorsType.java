/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Deflection Vectors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceDeflectionVectorsType#getControlSurface <em>Control Surface</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionVectorsType()
 * @model extendedMetaData="name='controlSurfaceDeflectionVectorsType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceDeflectionVectorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Surface</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlSurfaceDeflectionVectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surface</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionVectorsType_ControlSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSurfaceDeflectionVectorType> getControlSurface();

} // ControlSurfaceDeflectionVectorsType
