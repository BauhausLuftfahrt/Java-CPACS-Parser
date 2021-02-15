/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Performance Maps Old Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfacePerformanceMapsOldType#getControlSurface <em>Control Surface</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfacePerformanceMapsOldType()
 * @model extendedMetaData="name='controlSurfacePerformanceMapsOldType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfacePerformanceMapsOldType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Surface</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlSurfacePerformanceMapOldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surface</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlSurfacePerformanceMapsOldType_ControlSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSurfacePerformanceMapOldType> getControlSurface();

} // ControlSurfacePerformanceMapsOldType
