/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Deflections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceDeflectionsType#getControlSurface <em>Control Surface</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionsType()
 * @model extendedMetaData="name='controlSurfaceDeflectionsType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceDeflectionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Surface</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlSurfaceDeflectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surface</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionsType_ControlSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSurfaceDeflectionType> getControlSurface();

} // ControlSurfaceDeflectionsType
